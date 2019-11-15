package com.anchor.erp.myfuelapi.ServicesImpl;

import com.anchor.erp.myfuelapi.DAOHelper.WfActivitytargetDAO;
import com.anchor.erp.myfuelapi.Domain.WfActivitytarget;
import com.anchor.erp.myfuelapi.Services.GenericService;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.hibernate.criterion.Criterion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class WfActivitytargetService implements GenericService<WfActivitytarget> {
  @Autowired
  private WfActivitytargetDAO entityDAO;

  @Override
  @Transactional
  public WfActivitytarget save(WfActivitytarget entity) {
    return entityDAO.save(entity);
  }

  @Transactional
  @Override
  public void persist(WfActivitytarget entity) {
    entityDAO.persist(entity);
  }

  @Transactional
  @Override
  public WfActivitytarget findbyId(int id) {
    return entityDAO.findById(id);
  }

  @Transactional
  @Override
  public Collection<WfActivitytarget> findAll() {
     return entityDAO.findAll();
  }

  @Transactional
  @Override
  public Collection<WfActivitytarget> findByQuery(String query) {
    return entityDAO.findByQuery(query);
  }

  @Transactional
  @Override
  public WfActivitytarget merge(WfActivitytarget entity) {
    return entityDAO.merge(entity);
  }

    @Override
    public List<WfActivitytarget> findbySqlQuery(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<WfActivitytarget> findBySqlQueryWithParams(String q, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<WfActivitytarget> findBySqlQueryWithNamedParams(String q, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<WfActivitytarget> findByNamedQuery(String name, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<WfActivitytarget> findByNamedQueryAndNamedParams(String name, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<WfActivitytarget> findByCriterion(Criterion... criterion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
