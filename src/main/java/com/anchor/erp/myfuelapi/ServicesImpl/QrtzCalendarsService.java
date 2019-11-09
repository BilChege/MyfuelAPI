package com.anchor.erp.myfuelapi.ServicesImpl;

import com.anchor.erp.myfuelapi.DAOHelper.QrtzCalendarsDAO;
import com.anchor.erp.myfuelapi.Domain.QrtzCalendars;
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
public class QrtzCalendarsService implements GenericService<QrtzCalendars> {
  @Autowired
  private QrtzCalendarsDAO entityDAO;

  @Override
  @Transactional
  public QrtzCalendars save(QrtzCalendars entity) {
    return entityDAO.save(entity);
  }

  @Transactional
  @Override
  public void persist(QrtzCalendars entity) {
    entityDAO.persist(entity);
  }

  @Transactional
  @Override
  public QrtzCalendars findbyId(int id) {
    return entityDAO.findById(id);
  }

  @Transactional
  @Override
  public Collection<QrtzCalendars> findAll() {
     return entityDAO.findAll();
  }

  @Transactional
  @Override
  public Collection<QrtzCalendars> findByQuery(String query) {
    return entityDAO.findByQuery(query);
  }

  @Transactional
  @Override
  public QrtzCalendars merge(QrtzCalendars entity) {
    return entityDAO.merge(entity);
  }

    @Override
    public List<QrtzCalendars> findbySqlQuery(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<QrtzCalendars> findBySqlQueryWithParams(String q, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<QrtzCalendars> findBySqlQueryWithNamedParams(String q, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<QrtzCalendars> findByNamedQuery(String name, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<QrtzCalendars> findByNamedQueryAndNamedParams(String name, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
