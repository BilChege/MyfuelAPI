package com.anchor.erp.myfuelapi.ServicesImpl;

import com.anchor.erp.myfuelapi.DAOHelper.CurrencyhistoryDAO;
import com.anchor.erp.myfuelapi.Domain.Currencyhistory;
import com.anchor.erp.myfuelapi.Services.GenericService;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.hibernate.criterion.Criterion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CurrencyhistoryService implements GenericService<Currencyhistory> {
  @Autowired
  private CurrencyhistoryDAO entityDAO;

  @Override
  @Transactional
  public Currencyhistory save(Currencyhistory entity) {
    return entityDAO.save(entity);
  }

  @Transactional
  @Override
  public void persist(Currencyhistory entity) {
    entityDAO.persist(entity);
  }

  @Transactional
  @Override
  public Currencyhistory findbyId(int id) {
    return entityDAO.findById(id);
  }

  @Transactional
  @Override
  public Collection<Currencyhistory> findAll() {
     return entityDAO.findAll();
  }

  @Transactional
  @Override
  public Collection<Currencyhistory> findByQuery(String query) {
    return entityDAO.findByQuery(query);
  }

  @Transactional
  @Override
  public Currencyhistory merge(Currencyhistory entity) {
    return entityDAO.merge(entity);
  }

    @Override
    public List<Currencyhistory> findbySqlQuery(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Currencyhistory> findBySqlQueryWithParams(String q, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Currencyhistory> findBySqlQueryWithNamedParams(String q, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Currencyhistory> findByNamedQuery(String name, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Currencyhistory> findByNamedQueryAndNamedParams(String name, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Currencyhistory> findByCriterion(Criterion... criterion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
