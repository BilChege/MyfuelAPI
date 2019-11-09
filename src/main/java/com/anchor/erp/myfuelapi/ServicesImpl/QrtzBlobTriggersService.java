package com.anchor.erp.myfuelapi.ServicesImpl;

import com.anchor.erp.myfuelapi.DAOHelper.QrtzBlobTriggersDAO;
import com.anchor.erp.myfuelapi.Domain.QrtzBlobTriggers;
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
public class QrtzBlobTriggersService implements GenericService<QrtzBlobTriggers> {
  @Autowired
  private QrtzBlobTriggersDAO entityDAO;

  @Override
  @Transactional
  public QrtzBlobTriggers save(QrtzBlobTriggers entity) {
    return entityDAO.save(entity);
  }

  @Transactional
  @Override
  public void persist(QrtzBlobTriggers entity) {
    entityDAO.persist(entity);
  }

  @Transactional
  @Override
  public QrtzBlobTriggers findbyId(int id) {
    return entityDAO.findById(id);
  }

  @Transactional
  @Override
  public Collection<QrtzBlobTriggers> findAll() {
     return entityDAO.findAll();
  }

  @Transactional
  @Override
  public Collection<QrtzBlobTriggers> findByQuery(String query) {
    return entityDAO.findByQuery(query);
  }

  @Transactional
  @Override
  public QrtzBlobTriggers merge(QrtzBlobTriggers entity) {
    return entityDAO.merge(entity);
  }

    @Override
    public List<QrtzBlobTriggers> findbySqlQuery(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<QrtzBlobTriggers> findBySqlQueryWithParams(String q, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<QrtzBlobTriggers> findBySqlQueryWithNamedParams(String q, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<QrtzBlobTriggers> findByNamedQuery(String name, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<QrtzBlobTriggers> findByNamedQueryAndNamedParams(String name, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
