package com.anchor.erp.myfuelapi.ServicesImpl;

import com.anchor.erp.myfuelapi.DAOHelper.VehiclemakeDAO;
import com.anchor.erp.myfuelapi.Domain.Vehiclemake;
import com.anchor.erp.myfuelapi.Services.GenericService;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.hibernate.criterion.Criterion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("vehiclemakeService")
public class VehiclemakeService implements GenericService<Vehiclemake> {
  @Autowired
  private VehiclemakeDAO entityDAO;

  @Override
  @Transactional
  public Vehiclemake save(Vehiclemake entity) {
    return entityDAO.save(entity);
  }

  @Transactional
  @Override
  public void persist(Vehiclemake entity) {
    entityDAO.persist(entity);
  }

  @Transactional
  @Override
  public Vehiclemake findbyId(int id) {
    return entityDAO.findById(id);
  }

  @Transactional
  @Override
  public Collection<Vehiclemake> findAll() {
     return entityDAO.findAll();
  }

  @Transactional
  @Override
  public Collection<Vehiclemake> findByQuery(String query) {
    return entityDAO.findByQuery(query);
  }

  @Transactional
  @Override
  public Vehiclemake merge(Vehiclemake entity) {
    return entityDAO.merge(entity);
  }

    @Override
    public List<Vehiclemake> findbySqlQuery(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Vehiclemake> findBySqlQueryWithParams(String q, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Vehiclemake> findBySqlQueryWithNamedParams(String q, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Vehiclemake> findByNamedQuery(String name, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Vehiclemake> findByNamedQueryAndNamedParams(String name, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Vehiclemake> findByCriterion(Criterion... criterion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
