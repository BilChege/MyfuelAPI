package com.anchor.erp.myfuelapi.ServicesImpl;

import com.anchor.erp.myfuelapi.DAOHelper.QrtzFiredTriggersDAO;
import com.anchor.erp.myfuelapi.Domain.QrtzFiredTriggers;
import com.anchor.erp.myfuelapi.Services.GenericService;
import java.lang.Override;
import java.lang.String;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class QrtzFiredTriggersService implements GenericService<QrtzFiredTriggers> {
  @Autowired
  private QrtzFiredTriggersDAO entityDAO;

  @Override
  @Transactional
  public QrtzFiredTriggers save(QrtzFiredTriggers entity) {
    return entityDAO.save(entity);
  }

  @Transactional
  @Override
  public void persist(QrtzFiredTriggers entity) {
    entityDAO.persist(entity);
  }

  @Transactional
  @Override
  public QrtzFiredTriggers findbyId(int id) {
    return entityDAO.findById(id);
  }

  @Transactional
  @Override
  public Collection<QrtzFiredTriggers> findAll() {
     return entityDAO.findAll();
  }

  @Transactional
  @Override
  public Collection<QrtzFiredTriggers> findByQuery(String query) {
    return entityDAO.findByQuery(query);
  }

  @Transactional
  @Override
  public QrtzFiredTriggers merge(QrtzFiredTriggers entity) {
    return entityDAO.merge(entity);
  }

    @Override
    public List<QrtzFiredTriggers> findbySqlQuery(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<QrtzFiredTriggers> findBySqlQueryWithParams(String q, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<QrtzFiredTriggers> findBySqlQueryWithNamedParams(String q, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<QrtzFiredTriggers> findByNamedQuery(String name, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<QrtzFiredTriggers> findByNamedQueryAndNamedParams(String name, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
