package com.anchor.erp.myfuelapi.ServicesImpl;

import com.anchor.erp.myfuelapi.DAOHelper.WfRequestactionDAO;
import com.anchor.erp.myfuelapi.Domain.WfRequestaction;
import com.anchor.erp.myfuelapi.Services.GenericService;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.hibernate.criterion.Criterion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class WfRequestactionService implements GenericService<WfRequestaction> {
  @Autowired
  private WfRequestactionDAO entityDAO;

  @Override
  @Transactional
  public WfRequestaction save(WfRequestaction entity) {
    return entityDAO.save(entity);
  }

  @Transactional
  @Override
  public void persist(WfRequestaction entity) {
    entityDAO.persist(entity);
  }

  @Transactional
  @Override
  public WfRequestaction findbyId(int id) {
    return entityDAO.findById(id);
  }

  @Transactional
  @Override
  public Collection<WfRequestaction> findAll() {
     return entityDAO.findAll();
  }

  @Transactional
  @Override
  public Collection<WfRequestaction> findByQuery(String query) {
    return entityDAO.findByQuery(query);
  }

  @Transactional
  @Override
  public WfRequestaction merge(WfRequestaction entity) {
    return entityDAO.merge(entity);
  }

    @Override
    public List<WfRequestaction> findbySqlQuery(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<WfRequestaction> findBySqlQueryWithParams(String q, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<WfRequestaction> findBySqlQueryWithNamedParams(String q, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<WfRequestaction> findByNamedQuery(String name, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<WfRequestaction> findByNamedQueryAndNamedParams(String name, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<WfRequestaction> findByCriterion(Criterion... criterion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
