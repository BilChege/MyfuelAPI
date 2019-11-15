package com.anchor.erp.myfuelapi.ServicesImpl;

import com.anchor.erp.myfuelapi.DAOHelper.WfRequestdataDAO;
import com.anchor.erp.myfuelapi.Domain.WfRequestdata;
import com.anchor.erp.myfuelapi.Services.GenericService;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.hibernate.criterion.Criterion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class WfRequestdataService implements GenericService<WfRequestdata> {
  @Autowired
  private WfRequestdataDAO entityDAO;

  @Override
  @Transactional
  public WfRequestdata save(WfRequestdata entity) {
    return entityDAO.save(entity);
  }

  @Transactional
  @Override
  public void persist(WfRequestdata entity) {
    entityDAO.persist(entity);
  }

  @Transactional
  @Override
  public WfRequestdata findbyId(int id) {
    return entityDAO.findById(id);
  }

  @Transactional
  @Override
  public Collection<WfRequestdata> findAll() {
     return entityDAO.findAll();
  }

  @Transactional
  @Override
  public Collection<WfRequestdata> findByQuery(String query) {
    return entityDAO.findByQuery(query);
  }

  @Transactional
  @Override
  public WfRequestdata merge(WfRequestdata entity) {
    return entityDAO.merge(entity);
  }

    @Override
    public List<WfRequestdata> findbySqlQuery(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<WfRequestdata> findBySqlQueryWithParams(String q, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<WfRequestdata> findBySqlQueryWithNamedParams(String q, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<WfRequestdata> findByNamedQuery(String name, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<WfRequestdata> findByNamedQueryAndNamedParams(String name, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<WfRequestdata> findByCriterion(Criterion... criterion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
