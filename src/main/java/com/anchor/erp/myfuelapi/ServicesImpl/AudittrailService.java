package com.anchor.erp.myfuelapi.ServicesImpl;

import com.anchor.erp.myfuelapi.DAOHelper.AudittrailDAO;
import com.anchor.erp.myfuelapi.Domain.Audittrail;
import com.anchor.erp.myfuelapi.Services.GenericService;
import java.lang.Override;
import java.lang.String;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.hibernate.criterion.Criterion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AudittrailService implements GenericService<Audittrail> {
  @Autowired
  private AudittrailDAO entityDAO;

  @Override
  @Transactional
  public Audittrail save(Audittrail entity) {
    return entityDAO.save(entity);
  }

  @Transactional
  @Override
  public void persist(Audittrail entity) {
    entityDAO.persist(entity);
  }

  @Transactional
  @Override
  public Audittrail findbyId(int id) {
    return entityDAO.findById(id);
  }

  @Transactional
  @Override
  public Collection<Audittrail> findAll() {
     return entityDAO.findAll();
  }

  @Transactional
  @Override
  public Collection<Audittrail> findByQuery(String query) {
    return entityDAO.findByQuery(query);
  }

  @Transactional
  @Override
  public Audittrail merge(Audittrail entity) {
    return entityDAO.merge(entity);
  }

    @Override
    public List<Audittrail> findbySqlQuery(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Audittrail> findBySqlQueryWithParams(String q, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Audittrail> findBySqlQueryWithNamedParams(String q, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Audittrail> findByNamedQuery(String name, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Audittrail> findByNamedQueryAndNamedParams(String name, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Audittrail> findByCriterion(Criterion... criterion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
