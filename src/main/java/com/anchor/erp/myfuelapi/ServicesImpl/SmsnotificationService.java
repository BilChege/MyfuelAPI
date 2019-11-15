/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anchor.erp.myfuelapi.ServicesImpl;

import com.anchor.erp.myfuelapi.DAOHelper.SmsnotificationDAO;
import com.anchor.erp.myfuelapi.Domain.Smsnotification;
import com.anchor.erp.myfuelapi.Services.GenericService;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.hibernate.criterion.Criterion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author nbs
 */

@Service("smsnotificationService")
@Transactional
public class SmsnotificationService implements GenericService<Smsnotification>{
    
    @Autowired
    private SmsnotificationDAO smsnotificationDAO;

    @Override
    public Smsnotification save(Smsnotification t) {
        return smsnotificationDAO.save(t);
    }

    @Override
    public void persist(Smsnotification t) {
        smsnotificationDAO.persist(t);
    }

    @Override
    public Smsnotification findbyId(int id) {
        return smsnotificationDAO.findById(id);
    }

    @Override
    public Collection<Smsnotification> findAll() {
        return smsnotificationDAO.findAll();
    }

    @Override
    public Collection<Smsnotification> findByQuery(String q) {
        return smsnotificationDAO.findByQuery(q);
    }

    @Override
    public Smsnotification merge(Smsnotification t) {
        return smsnotificationDAO.merge(t);
    }

    @Override
    public List<Smsnotification> findbySqlQuery(String s) {
        return smsnotificationDAO.findbySqlQuery(s);
    }

    @Override
    public List<Smsnotification> findBySqlQueryWithParams(String q, Object... params) {
        return smsnotificationDAO.findBySqlQueryWithParams(q, params);
    }

    @Override
    public List<Smsnotification> findBySqlQueryWithNamedParams(String q, Map<String, ? extends Object> params) {
        return smsnotificationDAO.findBySqlQueryWithNamedParams(q, params);
    }

    @Override
    public List<Smsnotification> findByNamedQuery(String name, Object... params) {
        return smsnotificationDAO.findByNamedQuery(name, params);
    }

    @Override
    public List<Smsnotification> findByNamedQueryAndNamedParams(String name, Map<String, ? extends Object> params) {
        return smsnotificationDAO.findByNamedQueryAndNamedParams(name, params);
    }

    @Override
    public List<Smsnotification> findByCriterion(Criterion... criterion) {
        return smsnotificationDAO.findByCriterion(criterion);
    }
    
}
