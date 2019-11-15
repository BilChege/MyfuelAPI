package com.anchor.erp.myfuelapi.ServicesImpl;

import com.anchor.erp.myfuelapi.DAOHelper.WfTransitionactivityDAO;
import com.anchor.erp.myfuelapi.Domain.WfTransitionactivity;
import com.anchor.erp.myfuelapi.Services.GenericService;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.hibernate.criterion.Criterion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class WfTransitionactivityService implements GenericService<WfTransitionactivity> {
  @Autowired
  private WfTransitionactivityDAO entityDAO;

  @Override
  @Transactional
  public WfTransitionactivity save(WfTransitionactivity entity) {
    return entityDAO.save(entity);
  }

  @Transactional
  @Override
  public void persist(WfTransitionactivity entity) {
    entityDAO.persist(entity);
  }

  @Transactional
  @Override
  public WfTransitionactivity findbyId(int id) {
    return entityDAO.findById(id);
  }

  @Transactional
  @Override
  public Collection<WfTransitionactivity> findAll() {
     return entityDAO.findAll();
  }

  @Transactional
  @Override
  public Collection<WfTransitionactivity> findByQuery(String query) {
    return entityDAO.findByQuery(query);
  }

  @Transactional
  @Override
  public WfTransitionactivity merge(WfTransitionactivity entity) {
    return entityDAO.merge(entity);
  }

    @Override
    public List<WfTransitionactivity> findbySqlQuery(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<WfTransitionactivity> findBySqlQueryWithParams(String q, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<WfTransitionactivity> findBySqlQueryWithNamedParams(String q, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<WfTransitionactivity> findByNamedQuery(String name, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<WfTransitionactivity> findByNamedQueryAndNamedParams(String name, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<WfTransitionactivity> findByCriterion(Criterion... criterion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
