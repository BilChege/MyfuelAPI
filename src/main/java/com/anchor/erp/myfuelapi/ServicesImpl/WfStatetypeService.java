package com.anchor.erp.myfuelapi.ServicesImpl;

import com.anchor.erp.myfuelapi.DAOHelper.WfStatetypeDAO;
import com.anchor.erp.myfuelapi.Domain.WfStatetype;
import com.anchor.erp.myfuelapi.Services.GenericService;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.hibernate.criterion.Criterion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class WfStatetypeService implements GenericService<WfStatetype> {
  @Autowired
  private WfStatetypeDAO entityDAO;

  @Override
  @Transactional
  public WfStatetype save(WfStatetype entity) {
    return entityDAO.save(entity);
  }

  @Transactional
  @Override
  public void persist(WfStatetype entity) {
    entityDAO.persist(entity);
  }

  @Transactional
  @Override
  public WfStatetype findbyId(int id) {
    return entityDAO.findById(id);
  }

  @Transactional
  @Override
  public Collection<WfStatetype> findAll() {
     return entityDAO.findAll();
  }

  @Transactional
  @Override
  public Collection<WfStatetype> findByQuery(String query) {
    return entityDAO.findByQuery(query);
  }

  @Transactional
  @Override
  public WfStatetype merge(WfStatetype entity) {
    return entityDAO.merge(entity);
  }

    @Override
    public List<WfStatetype> findbySqlQuery(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<WfStatetype> findBySqlQueryWithParams(String q, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<WfStatetype> findBySqlQueryWithNamedParams(String q, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<WfStatetype> findByNamedQuery(String name, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<WfStatetype> findByNamedQueryAndNamedParams(String name, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<WfStatetype> findByCriterion(Criterion... criterion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
