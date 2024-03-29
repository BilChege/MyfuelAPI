package com.anchor.erp.myfuelapi.ServicesImpl;

import com.anchor.erp.myfuelapi.DAOHelper.DynamicmenuDAO;
import com.anchor.erp.myfuelapi.Domain.Dynamicmenu;
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
public class DynamicmenuService implements GenericService<Dynamicmenu> {
  @Autowired
  private DynamicmenuDAO entityDAO;

  @Override
  @Transactional
  public Dynamicmenu save(Dynamicmenu entity) {
    return entityDAO.save(entity);
  }

  @Transactional
  @Override
  public void persist(Dynamicmenu entity) {
    entityDAO.persist(entity);
  }

  @Transactional
  @Override
  public Dynamicmenu findbyId(int id) {
    return entityDAO.findById(id);
  }

  @Transactional
  @Override
  public Collection<Dynamicmenu> findAll() {
     return entityDAO.findAll();
  }

  @Transactional
  @Override
  public Collection<Dynamicmenu> findByQuery(String query) {
    return entityDAO.findByQuery(query);
  }

  @Transactional
  @Override
  public Dynamicmenu merge(Dynamicmenu entity) {
    return entityDAO.merge(entity);
  }

    @Override
    public List<Dynamicmenu> findbySqlQuery(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Dynamicmenu> findBySqlQueryWithParams(String q, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Dynamicmenu> findBySqlQueryWithNamedParams(String q, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Dynamicmenu> findByNamedQuery(String name, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Dynamicmenu> findByNamedQueryAndNamedParams(String name, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Dynamicmenu> findByCriterion(Criterion... criterion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
