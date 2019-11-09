package com.anchor.erp.myfuelapi.ServicesImpl;

import com.anchor.erp.myfuelapi.DAOHelper.QrtzCronTriggersDAO;
import com.anchor.erp.myfuelapi.Domain.QrtzCronTriggers;
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
public class QrtzCronTriggersService implements GenericService<QrtzCronTriggers> {
  @Autowired
  private QrtzCronTriggersDAO entityDAO;

  @Override
  @Transactional
  public QrtzCronTriggers save(QrtzCronTriggers entity) {
    return entityDAO.save(entity);
  }

  @Transactional
  @Override
  public void persist(QrtzCronTriggers entity) {
    entityDAO.persist(entity);
  }

  @Transactional
  @Override
  public QrtzCronTriggers findbyId(int id) {
    return entityDAO.findById(id);
  }

  @Transactional
  @Override
  public Collection<QrtzCronTriggers> findAll() {
     return entityDAO.findAll();
  }

  @Transactional
  @Override
  public Collection<QrtzCronTriggers> findByQuery(String query) {
    return entityDAO.findByQuery(query);
  }

  @Transactional
  @Override
  public QrtzCronTriggers merge(QrtzCronTriggers entity) {
    return entityDAO.merge(entity);
  }

    @Override
    public List<QrtzCronTriggers> findbySqlQuery(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<QrtzCronTriggers> findBySqlQueryWithParams(String q, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<QrtzCronTriggers> findBySqlQueryWithNamedParams(String q, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<QrtzCronTriggers> findByNamedQuery(String name, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<QrtzCronTriggers> findByNamedQueryAndNamedParams(String name, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
