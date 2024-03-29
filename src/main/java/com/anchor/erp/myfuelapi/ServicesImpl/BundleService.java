package com.anchor.erp.myfuelapi.ServicesImpl;

import com.anchor.erp.myfuelapi.DAOHelper.BundleDAO;
import com.anchor.erp.myfuelapi.Domain.Bundle;
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
public class BundleService implements GenericService<Bundle> {
  @Autowired
  private BundleDAO entityDAO;

  @Override
  @Transactional
  public Bundle save(Bundle entity) {
    return entityDAO.save(entity);
  }

  @Transactional
  @Override
  public void persist(Bundle entity) {
    entityDAO.persist(entity);
  }

  @Transactional
  @Override
  public Bundle findbyId(int id) {
    return entityDAO.findById(id);
  }

  @Transactional
  @Override
  public Collection<Bundle> findAll() {
     return entityDAO.findAll();
  }

  @Transactional
  @Override
  public Collection<Bundle> findByQuery(String query) {
    return entityDAO.findByQuery(query);
  }

  @Transactional
  @Override
  public Bundle merge(Bundle entity) {
    return entityDAO.merge(entity);
  }

    @Override
    public List<Bundle> findbySqlQuery(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Bundle> findBySqlQueryWithParams(String q, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Bundle> findBySqlQueryWithNamedParams(String q, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Bundle> findByNamedQuery(String name, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Bundle> findByNamedQueryAndNamedParams(String name, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Bundle> findByCriterion(Criterion... criterion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
