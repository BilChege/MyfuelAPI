/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anchor.erp.myfuelapi.Utils;

import com.anchor.erp.myfuelapi.Domain.Ancparams;
import com.anchor.erp.myfuelapi.Domain.Emailnotification;
import com.anchor.erp.myfuelapi.Services.GenericService;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.event.TransportEvent;
import javax.mail.event.TransportListener;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.binding.message.MessageBuilder;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.webflow.execution.RequestContext;
import org.springframework.webflow.execution.RequestContextHolder;

/**
 *
 * @author Netrix3
 */
@Component("sendEmailProtocal")
public class SendEmailProtocal {

    Logger log = LoggerFactory.getLogger(SendEmailProtocal.this.getClass());
    @Resource(name = "emailnotificationService")
    private GenericService emailnotificationService;
    @Resource(name = "parametersService")
    private GenericService parametersService;
    private Ancparams params = null;
    private String audittrailDoc = "", status = "";
    private List<String> docList = new ArrayList();

    @Async
    public boolean sendMail() {
        try {
            List<Ancparams> list = new ArrayList(parametersService.findAll());
            // Select mail properties
            if (list.size() > 0) {
                params = (Ancparams) list.get(0);
            }
            Properties props = System.getProperties();
            props.put("mail.transport.protocol", params.getProtocol());
            props.put("mail.smtp.host", params.getHost());
            props.put("mail.smtp.user", params.getAddress());
            props.put("mail.smtp.password", params.getPassword());
            props.put("mail.smtp.port", params.getPort());
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", params.getAuth());

            //Authenticate
            Authenticator auth = new Authenticator() {
                @Override
                public PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(params.getAddress(), params.getPassword());
                }
            };
            //Set session and message
            Session session = Session.getInstance(props, auth);
            //  Connect
            Transport transport = session.getTransport(params.getProtocol()); 
            transport.connect(params.getHost(), params.getAddress(), params.getPassword());

            List<Emailnotification> pendingEmail = emailnotificationService.findByCriterion(Restrictions.eq("pending", Boolean.TRUE),
                    Restrictions.eq("sent", Boolean.FALSE),
                    Restrictions.eq("error", Boolean.FALSE));

            for (Emailnotification email : pendingEmail) {
                try {
                    String toAddr = email.getToaddress();
                    String ccAddr = email.getCcaddress();
                    String subject = email.getSubject();
                    String msgBody = email.getBody();

                    if (params == null) {
                        log.error("Error Sending email, Please provide the required email details in settings");
                        email.setError(true);
                        email.setErrormsg("Error Sending email, Please provide the required email details in settings");
                        emailnotificationService.merge(email);
                        break;
                    }

                    Message message = new MimeMessage(session);
//        Sender Address
                    InternetAddress from = new InternetAddress(params.getCopyaddress());
                    message.setFrom(from);

//        Recipients
                    if (toAddr == null) {
                        email.setError(true);
                        email.setSent(false);
                        email.setPending(true);
                        email.setErrormsg("Messesage not delivered due to missing email address.");
                        emailnotificationService.merge(email);
                        continue;
                    } else {
                        message.addRecipients(Message.RecipientType.TO, InternetAddress.parse(toAddr));
                    }
                    if (ccAddr != null && !ccAddr.isEmpty()) {
//                        ccAddr = ccAddr + "," + params.getCopyAddress();
                        message.addRecipients(Message.RecipientType.CC, InternetAddress.parse(ccAddr));
                    } else {
//                        message.addRecipients(Message.RecipientType.CC, InternetAddress.parse(params.getCopyAddress()));
                    }

                    message.setSubject(subject);
                    message.setContent(msgBody, "text/html; charset=utf-8");

//            Send message
                    transport.sendMessage(message, message.getAllRecipients());
//            boolean delivered = false;
                    transport.addTransportListener(new TransportListener() {
                        @Override
                        public void messageDelivered(TransportEvent te) {
                            log.info("email delivered");
                        }

                        @Override
                        public void messageNotDelivered(TransportEvent te) {
                            log.info("email not delivered ");
                        }

                        @Override
                        public void messagePartiallyDelivered(TransportEvent te) {
                            log.error("email partially delivered ");
                        }
                    });
                    email.setSent(true);
                    email.setPending(false);
                    emailnotificationService.merge(email);
                } catch (MessagingException ex) {
                    if (email.getErrorcount() >= 3) {
                        email.setError(true);
                        email.setPending(false);
                    } else {
                        email.setError(false);
                        email.setPending(true);
                    }
                    email.setErrorcount(email.getErrorcount() + 1);
                    email.setSent(false);
                    email.setErrormsg("Error sending email \n" + ex.getMessage());
                    emailnotificationService.merge(email);
                } catch (Exception ex) {
                    if (email.getErrorcount() >= 3) {
                        email.setError(true);
                        email.setPending(false);
                    } else {
                        email.setError(false);
                        email.setPending(true);
                    }
                    email.setErrorcount(email.getErrorcount() + 1);
                    email.setSent(false);
                    email.setErrormsg("Error sending email \n" + ex.getMessage());
                    emailnotificationService.merge(email);
                    log.error("Error sending email ", ex);
                }
            }

            transport.close();
        } catch (MessagingException ex) {
            java.util.logging.Logger.getLogger(SendEmailProtocal.class.getName()).log(Level.SEVERE, null, ex);
            
            return false;
        }
        return false;
    }

    public void resetListParams() {
        RequestContext context = RequestContextHolder.getRequestContext();
        context.getConversationScope().asMap().put("searchParam", "");
        context.getConversationScope().asMap().put("listFromDate", null);
        context.getConversationScope().asMap().put("listUptoDate", null);
        audittrailDoc = "";
        status = "All";
        context.getConversationScope().asMap().put("emailLogs", new ArrayList<>());
        context.getConversationScope().asMap().put("selectedEmail", null);

    }

    public void findSentEmailList() {
        RequestContext context = RequestContextHolder.getRequestContext();
        String searchParam = (String) context.getConversationScope().asMap().get("searchParam");
        Date listFromDate = (Date) context.getConversationScope().asMap().get("listFromDate");
        Date listUptoDate = (Date) context.getConversationScope().asMap().get("listUptoDate");
        String status = getStatus();
        String audittrailDoc = getAudittrailDoc();

        List<Emailnotification> list = new ArrayList<>();
//        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

        if (searchParam != null && !searchParam.isEmpty()) {
            if (listFromDate != null && listUptoDate != null) {
                if (status != null && status.equalsIgnoreCase("pending")) {
                    list.addAll(emailnotificationService.findByCriterion(Restrictions.or(Restrictions.ilike("toAddress", searchParam, MatchMode.ANYWHERE),
                            Restrictions.ilike("subject", searchParam, MatchMode.ANYWHERE),
                            Restrictions.ilike("action", searchParam, MatchMode.ANYWHERE),
                            Restrictions.ilike("doctype", searchParam, MatchMode.ANYWHERE),
                            Restrictions.and(Restrictions.ge("createDate", listFromDate),
                                    Restrictions.le("createDate", listUptoDate),
                                    Restrictions.eq("pending", Boolean.TRUE)))
                    ));
                } else if (status != null && status.equalsIgnoreCase("sent")) {
                    list.addAll(emailnotificationService.findByCriterion(Restrictions.or(Restrictions.ilike("toAddress", searchParam, MatchMode.ANYWHERE),
                            Restrictions.ilike("subject", searchParam, MatchMode.ANYWHERE),
                            Restrictions.ilike("action", searchParam, MatchMode.ANYWHERE),
                            Restrictions.ilike("doctype", searchParam, MatchMode.ANYWHERE),
                            Restrictions.and(Restrictions.ge("createDate", listFromDate),
                                    Restrictions.le("createDate", listUptoDate),
                                    Restrictions.eq("sent", Boolean.TRUE)))
                    ));
                } else if (status != null && status.equalsIgnoreCase("error")) {
                    list.addAll(emailnotificationService.findByCriterion(Restrictions.or(Restrictions.ilike("toAddress", searchParam, MatchMode.ANYWHERE),
                            Restrictions.ilike("subject", searchParam, MatchMode.ANYWHERE),
                            Restrictions.ilike("action", searchParam, MatchMode.ANYWHERE),
                            Restrictions.ilike("doctype", searchParam, MatchMode.ANYWHERE),
                            Restrictions.and(Restrictions.ge("createDate", listFromDate),
                                    Restrictions.le("createDate", listUptoDate),
                                    Restrictions.eq("error", Boolean.TRUE)))
                    ));
                } else {
                    list.addAll(emailnotificationService.findByCriterion(Restrictions.or(Restrictions.ilike("toAddress", searchParam, MatchMode.ANYWHERE),
                            Restrictions.ilike("subject", searchParam, MatchMode.ANYWHERE),
                            Restrictions.ilike("action", searchParam, MatchMode.ANYWHERE),
                            Restrictions.ilike("doctype", searchParam, MatchMode.ANYWHERE),
                            Restrictions.and(Restrictions.ge("createDate", listFromDate),
                                    Restrictions.le("createDate", listUptoDate)))
                    ));
                }
            } else {
                if (status != null && status.equalsIgnoreCase("error")) {
                    list.addAll(emailnotificationService.findByCriterion(Restrictions.or(Restrictions.ilike("toAddress", searchParam, MatchMode.ANYWHERE),
                            Restrictions.ilike("subject", searchParam, MatchMode.ANYWHERE),
                            Restrictions.ilike("action", searchParam, MatchMode.ANYWHERE),
                            Restrictions.ilike("doctype", searchParam, MatchMode.ANYWHERE)),
                            Restrictions.eq("error", Boolean.TRUE)
                    ));
                } else if (status != null && status.equalsIgnoreCase("pending")) {
                    list.addAll(emailnotificationService.findByCriterion(Restrictions.or(Restrictions.ilike("toAddress", searchParam, MatchMode.ANYWHERE),
                            Restrictions.ilike("subject", searchParam, MatchMode.ANYWHERE),
                            Restrictions.ilike("action", searchParam, MatchMode.ANYWHERE),
                            Restrictions.ilike("doctype", searchParam, MatchMode.ANYWHERE)),
                            Restrictions.eq("pending", Boolean.TRUE)
                    ));
                } else if (status != null && status.equalsIgnoreCase("sent")) {
                    list.addAll(emailnotificationService.findByCriterion(Restrictions.or(Restrictions.ilike("toAddress", searchParam, MatchMode.ANYWHERE),
                            Restrictions.ilike("subject", searchParam, MatchMode.ANYWHERE),
                            Restrictions.ilike("action", searchParam, MatchMode.ANYWHERE),
                            Restrictions.ilike("doctype", searchParam, MatchMode.ANYWHERE)),
                            Restrictions.eq("sent", Boolean.TRUE)
                    ));
                } else {
                    list.addAll(emailnotificationService.findByCriterion(Restrictions.or(Restrictions.ilike("toAddress", searchParam, MatchMode.ANYWHERE),
                            Restrictions.ilike("subject", searchParam, MatchMode.ANYWHERE),
                            Restrictions.ilike("action", searchParam, MatchMode.ANYWHERE),
                            Restrictions.ilike("doctype", searchParam, MatchMode.ANYWHERE))
                    ));
                }
            }
        } else if (audittrailDoc != null && !audittrailDoc.isEmpty()) {
            if (listFromDate != null && listUptoDate != null) {
                if (status != null && status.equalsIgnoreCase("pending")) {
                    list.addAll(emailnotificationService.findByCriterion(Restrictions.and(Restrictions.eq("doctype", audittrailDoc))
                            .add(Restrictions.or(Restrictions.ilike("toAddress", searchParam, MatchMode.ANYWHERE),
                                    Restrictions.ilike("subject", searchParam, MatchMode.ANYWHERE),
                                    Restrictions.ilike("action", searchParam, MatchMode.ANYWHERE),
                                    Restrictions.and(Restrictions.ge("createDate", listFromDate),
                                            Restrictions.le("createDate", listUptoDate),
                                            Restrictions.eq("pending", Boolean.TRUE))))
                    ));
                } else if (status != null && status.equalsIgnoreCase("sent")) {
                    list.addAll(emailnotificationService.findByCriterion(Restrictions.and(Restrictions.eq("doctype", audittrailDoc))
                            .add(Restrictions.or(Restrictions.ilike("toAddress", searchParam, MatchMode.ANYWHERE),
                                    Restrictions.ilike("subject", searchParam, MatchMode.ANYWHERE),
                                    Restrictions.ilike("action", searchParam, MatchMode.ANYWHERE),
                                    Restrictions.and(Restrictions.ge("createDate", listFromDate),
                                            Restrictions.le("createDate", listUptoDate),
                                            Restrictions.eq("sent", Boolean.TRUE))))
                    ));
                } else if (status != null && status.equalsIgnoreCase("error")) {
                    list.addAll(emailnotificationService.findByCriterion(Restrictions.and(Restrictions.eq("doctype", audittrailDoc))
                            .add(Restrictions.or(Restrictions.ilike("toAddress", searchParam, MatchMode.ANYWHERE),
                                    Restrictions.ilike("subject", searchParam, MatchMode.ANYWHERE),
                                    Restrictions.ilike("action", searchParam, MatchMode.ANYWHERE),
                                    Restrictions.and(Restrictions.ge("createDate", listFromDate),
                                            Restrictions.le("createDate", listUptoDate),
                                            Restrictions.eq("error", Boolean.TRUE))))
                    ));
                } else {
                    list.addAll(emailnotificationService.findByCriterion(Restrictions.and(Restrictions.eq("doctype", audittrailDoc))
                            .add(Restrictions.or(Restrictions.ilike("toAddress", searchParam, MatchMode.ANYWHERE),
                                    Restrictions.ilike("subject", searchParam, MatchMode.ANYWHERE),
                                    Restrictions.ilike("action", searchParam, MatchMode.ANYWHERE),
                                    Restrictions.and(Restrictions.ge("createDate", listFromDate),
                                            Restrictions.le("createDate", listUptoDate))))
                    ));
                }
            } else {
                if (status != null && status.equalsIgnoreCase("error")) {
                    list.addAll(emailnotificationService.findByCriterion(Restrictions.or(Restrictions.ilike("toAddress", searchParam, MatchMode.ANYWHERE),
                            Restrictions.ilike("subject", searchParam, MatchMode.ANYWHERE),
                            Restrictions.ilike("action", searchParam, MatchMode.ANYWHERE)),
                            Restrictions.eq("doctype", audittrailDoc),
                            Restrictions.eq("error", Boolean.TRUE)
                    ));
                } else if (status != null && status.equalsIgnoreCase("pending")) {
                    list.addAll(emailnotificationService.findByCriterion(Restrictions.or(Restrictions.ilike("toAddress", searchParam, MatchMode.ANYWHERE),
                            Restrictions.ilike("subject", searchParam, MatchMode.ANYWHERE),
                            Restrictions.ilike("action", searchParam, MatchMode.ANYWHERE)),
                            Restrictions.eq("doctype", audittrailDoc),
                            Restrictions.eq("pending", Boolean.TRUE)
                    ));
                } else if (status != null && status.equalsIgnoreCase("sent")) {
                    list.addAll(emailnotificationService.findByCriterion(Restrictions.and(Restrictions.eq("doctype", audittrailDoc))
                            .add(Restrictions.or(Restrictions.ilike("toAddress", searchParam, MatchMode.ANYWHERE),
                                    Restrictions.ilike("subject", searchParam, MatchMode.ANYWHERE),
                                    Restrictions.ilike("action", searchParam, MatchMode.ANYWHERE))
                                    .add(Restrictions.eq("sent", Boolean.TRUE)))
                    ));
                } else {
                    list.addAll(emailnotificationService.findByCriterion(Restrictions.and(Restrictions.eq("doctype", audittrailDoc))
                            .add(Restrictions.or(Restrictions.ilike("toAddress", searchParam, MatchMode.ANYWHERE),
                                    Restrictions.ilike("subject", searchParam, MatchMode.ANYWHERE),
                                    Restrictions.ilike("action", searchParam, MatchMode.ANYWHERE)))
                    ));
                }
            }
        } else {
            if (listFromDate != null && listUptoDate != null) {
                if (status != null && status.equalsIgnoreCase("sent")) {
                    list.addAll(emailnotificationService.findByCriterion(Restrictions.and(Restrictions.ge("createDate", listFromDate),
                            Restrictions.le("createDate", listUptoDate)),
                            Restrictions.eq("sent", Boolean.TRUE)));
                } else if (status != null && status.equalsIgnoreCase("error")) {
                    list.addAll(emailnotificationService.findByCriterion(Restrictions.and(Restrictions.ge("createDate", listFromDate),
                            Restrictions.le("createDate", listUptoDate)),
                            Restrictions.eq("error", Boolean.TRUE)));
                } else if (status != null && status.equalsIgnoreCase("pending")) {
                    list.addAll(emailnotificationService.findByCriterion(Restrictions.and(Restrictions.ge("createDate", listFromDate),
                            Restrictions.le("createDate", listUptoDate)),
                            Restrictions.eq("pending", Boolean.TRUE)));
                } else {
                    list.addAll(emailnotificationService.findByCriterion(Restrictions.and(Restrictions.ge("createDate", listFromDate),
                            Restrictions.le("createDate", listUptoDate))));
                }
            } else {
                if (status != null && status.equalsIgnoreCase("sent")) {
                    list.addAll(emailnotificationService.findByCriterion(Restrictions.eq("sent", Boolean.TRUE)));
                } else if (status != null && status.equalsIgnoreCase("error")) {
                    list.addAll(emailnotificationService.findByCriterion(Restrictions.eq("error", Boolean.TRUE)));
                } else if (status != null && status.equalsIgnoreCase("pending")) {
                    list.addAll(emailnotificationService.findByCriterion(Restrictions.eq("pending", Boolean.TRUE)));
                }
            }
        }

        context.getConversationScope().asMap().put("emailLogs", list);
    }

    public int findPendingEmailList() {
        return emailnotificationService.findByCriterion(Restrictions.eq("pending", Boolean.TRUE), Restrictions.eq("error", Boolean.FALSE)).size();
    }

    public int findErrorEmailList() {
        return emailnotificationService.findByCriterion(Restrictions.eq("error", Boolean.TRUE)).size();
    }

    public List<String> statusFilter() {
        List<String> statusList = new ArrayList<>();
        statusList.add("All");
        statusList.add("Pending");
        statusList.add("Sent");
        statusList.add("Error");
        return statusList;
    }

    public List<String> getDocList() {
        docList.clear();
        ProjectionList projList = Projections.projectionList().add(Projections.distinct(Projections.property("doctype")));
//        docList.addAll(emailnotificationService.findByCriterion(projList, Restrictions.isNotNull("doctype")));
        return docList;
    }

    public String getAudittrailDoc() {
        return audittrailDoc;
    }

    public void setAudittrailDoc(String audittrailDoc) {
        this.audittrailDoc = audittrailDoc;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void rescheduleEmail(Emailnotification email) {
        RequestContext context = RequestContextHolder.getRequestContext();
        email.setError(false);
        email.setSent(false);
        email.setPending(true);
        email.setErrormsg("Email rescheduled");
        emailnotificationService.merge(email);
        context.getMessageContext().addMessage(new MessageBuilder().info().
                defaultText("Email " + email.getSubject() + " to " + email.getToaddress() + " rescheduled successfuly.").build());
    }

    @PostConstruct
    public void init() {
        log.info("Send email protocal scaned by spring");
    }
}
