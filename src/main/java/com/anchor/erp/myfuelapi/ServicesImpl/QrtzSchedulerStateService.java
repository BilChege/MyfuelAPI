package com.anchor.erp.myfuelapi.ServicesImpl;

import com.anchor.erp.myfuelapi.DAOHelper.QrtzSchedulerStateDAO;
import com.anchor.erp.myfuelapi.Domain.QrtzSchedulerState;
import com.anchor.erp.myfuelapi.Services.GenericService;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.hibernate.criterion.Criterion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class QrtzSchedulerStateService implements GenericService<QrtzSchedulerState> {
  @Autowired
  private QrtzSchedulerStateDAO entityDAO;

  @Override
  @Transactional
  public QrtzSchedulerState save(QrtzSchedulerState entity) {
    return entityDAO.save(entity);
  }

  @Transactional
  @Override
  public void persist(QrtzSchedulerState entity) {
    entityDAO.persist(entity);
  }

  @Transactional
  @Override
  public QrtzSchedulerState findbyId(int id) {
    return entityDAO.findById(id);
  }

  @Transactional
  @Override
  public Collection<QrtzSchedulerState> findAll() {
     return entityDAO.findAll();
  }

  @Transactional
  @Override
  public Collection<QrtzSchedulerState> findByQuery(String query) {
    return entityDAO.findByQuery(query);
  }

  @Transactional
  @Override
  public QrtzSchedulerState merge(QrtzSchedulerState entity) {
    return entityDAO.merge(entity);
  }

    @Override
    public List<QrtzSchedulerState> findbySqlQuery(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<QrtzSchedulerState> findBySqlQueryWithParams(String q, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<QrtzSchedulerState> findBySqlQueryWithNamedParams(String q, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<QrtzSchedulerState> findByNamedQuery(String name, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<QrtzSchedulerState> findByNamedQueryAndNamedParams(String name, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<QrtzSchedulerState> findByCriterion(Criterion... criterion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
