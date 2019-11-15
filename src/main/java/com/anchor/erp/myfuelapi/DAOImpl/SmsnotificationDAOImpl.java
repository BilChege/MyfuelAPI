/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anchor.erp.myfuelapi.DAOImpl;

import com.anchor.erp.myfuelapi.DAO.AbstractDAO;
import com.anchor.erp.myfuelapi.DAOHelper.SmsnotificationDAO;
import com.anchor.erp.myfuelapi.Domain.Smsnotification;
import org.springframework.stereotype.Repository;

/**
 *
 * @author nbs
 */

@Repository
public class SmsnotificationDAOImpl extends AbstractDAO<Smsnotification, Integer> implements SmsnotificationDAO{

    public SmsnotificationDAOImpl() {
        super(Smsnotification.class);
    } 
    
}
