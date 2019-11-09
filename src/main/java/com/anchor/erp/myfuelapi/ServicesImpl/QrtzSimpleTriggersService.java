package com.anchor.erp.myfuelapi.ServicesImpl;

import com.anchor.erp.myfuelapi.DAOHelper.QrtzSimpleTriggersDAO;
import com.anchor.erp.myfuelapi.Domain.QrtzSimpleTriggers;
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
public class QrtzSimpleTriggersService implements GenericService<QrtzSimpleTriggers> {
  @Autowired
  private QrtzSimpleTriggersDAO entityDAO;

  @Override
  @Transactional
  public QrtzSimpleTriggers save(QrtzSimpleTriggers entity) {
    return entityDAO.save(entity);
  }

  @Transactional
  @Override
  public void persist(QrtzSimpleTriggers entity) {
    entityDAO.persist(entity);
  }

  @Transactional
  @Override
  public QrtzSimpleTriggers findbyId(int id) {
    return entityDAO.findById(id);
  }

  @Transactional
  @Override
  public Collection<QrtzSimpleTriggers> findAll() {
     return entityDAO.findAll();
  }

  @Transactional
  @Override
  public Collection<QrtzSimpleTriggers> findByQuery(String query) {
    return entityDAO.findByQuery(query);
  }

  @Transactional
  @Override
  public QrtzSimpleTriggers merge(QrtzSimpleTriggers entity) {
    return entityDAO.merge(entity);
  }

    @Override
    public List<QrtzSimpleTriggers> findbySqlQuery(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<QrtzSimpleTriggers> findBySqlQueryWithParams(String q, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<QrtzSimpleTriggers> findBySqlQueryWithNamedParams(String q, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<QrtzSimpleTriggers> findByNamedQuery(String name, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<QrtzSimpleTriggers> findByNamedQueryAndNamedParams(String name, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
