package com.anchor.erp.myfuelapi.ServicesImpl;

import com.anchor.erp.myfuelapi.DAOHelper.QrtzPausedTriggerGrpsDAO;
import com.anchor.erp.myfuelapi.Domain.QrtzPausedTriggerGrps;
import com.anchor.erp.myfuelapi.Services.GenericService;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.hibernate.criterion.Criterion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class QrtzPausedTriggerGrpsService implements GenericService<QrtzPausedTriggerGrps> {
  @Autowired
  private QrtzPausedTriggerGrpsDAO entityDAO;

  @Override
  @Transactional
  public QrtzPausedTriggerGrps save(QrtzPausedTriggerGrps entity) {
    return entityDAO.save(entity);
  }

  @Transactional
  @Override
  public void persist(QrtzPausedTriggerGrps entity) {
    entityDAO.persist(entity);
  }

  @Transactional
  @Override
  public QrtzPausedTriggerGrps findbyId(int id) {
    return entityDAO.findById(id);
  }

  @Transactional
  @Override
  public Collection<QrtzPausedTriggerGrps> findAll() {
     return entityDAO.findAll();
  }

  @Transactional
  @Override
  public Collection<QrtzPausedTriggerGrps> findByQuery(String query) {
    return entityDAO.findByQuery(query);
  }

  @Transactional
  @Override
  public QrtzPausedTriggerGrps merge(QrtzPausedTriggerGrps entity) {
    return entityDAO.merge(entity);
  }

    @Override
    public List<QrtzPausedTriggerGrps> findbySqlQuery(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<QrtzPausedTriggerGrps> findBySqlQueryWithParams(String q, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<QrtzPausedTriggerGrps> findBySqlQueryWithNamedParams(String q, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<QrtzPausedTriggerGrps> findByNamedQuery(String name, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<QrtzPausedTriggerGrps> findByNamedQueryAndNamedParams(String name, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<QrtzPausedTriggerGrps> findByCriterion(Criterion... criterion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
