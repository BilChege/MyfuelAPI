package com.anchor.erp.myfuelapi.ServicesImpl;

import com.anchor.erp.myfuelapi.DAOHelper.VehicletypeDAO;
import com.anchor.erp.myfuelapi.Domain.Vehicletype;
import com.anchor.erp.myfuelapi.Services.GenericService;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class VehicletypeService implements GenericService<Vehicletype> {
  @Autowired
  private VehicletypeDAO entityDAO;

  @Override
  @Transactional
  public Vehicletype save(Vehicletype entity) {
    return entityDAO.save(entity);
  }

  @Transactional
  @Override
  public void persist(Vehicletype entity) {
    entityDAO.persist(entity);
  }

  @Transactional
  @Override
  public Vehicletype findbyId(int id) {
    return entityDAO.findById(id);
  }

  @Transactional
  @Override
  public Collection<Vehicletype> findAll() {
     return entityDAO.findAll();
  }

  @Transactional
  @Override
  public Collection<Vehicletype> findByQuery(String query) {
    return entityDAO.findByQuery(query);
  }

  @Transactional
  @Override
  public Vehicletype merge(Vehicletype entity) {
    return entityDAO.merge(entity);
  }

    @Override
    public List<Vehicletype> findbySqlQuery(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Vehicletype> findBySqlQueryWithParams(String q, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Vehicletype> findBySqlQueryWithNamedParams(String q, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Vehicletype> findByNamedQuery(String name, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Vehicletype> findByNamedQueryAndNamedParams(String name, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
