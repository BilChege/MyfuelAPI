package com.anchor.erp.myfuelapi.ServicesImpl;

import com.anchor.erp.myfuelapi.DAOHelper.CostcenterDAO;
import com.anchor.erp.myfuelapi.Domain.Costcenter;
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
public class CostcenterService implements GenericService<Costcenter> {
  @Autowired
  private CostcenterDAO entityDAO;

  @Override
  @Transactional
  public Costcenter save(Costcenter entity) {
    return entityDAO.save(entity);
  }

  @Transactional
  @Override
  public void persist(Costcenter entity) {
    entityDAO.persist(entity);
  }

  @Transactional
  @Override
  public Costcenter findbyId(int id) {
    return entityDAO.findById(id);
  }

  @Transactional
  @Override
  public Collection<Costcenter> findAll() {
     return entityDAO.findAll();
  }

  @Transactional
  @Override
  public Collection<Costcenter> findByQuery(String query) {
    return entityDAO.findByQuery(query);
  }

  @Transactional
  @Override
  public Costcenter merge(Costcenter entity) {
    return entityDAO.merge(entity);
  }

    @Override
    public List<Costcenter> findbySqlQuery(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Costcenter> findBySqlQueryWithParams(String q, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Costcenter> findBySqlQueryWithNamedParams(String q, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Costcenter> findByNamedQuery(String name, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Costcenter> findByNamedQueryAndNamedParams(String name, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Costcenter> findByCriterion(Criterion... criterion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
