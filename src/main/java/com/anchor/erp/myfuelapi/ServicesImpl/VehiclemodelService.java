package com.anchor.erp.myfuelapi.ServicesImpl;

import com.anchor.erp.myfuelapi.DAOHelper.VehiclemodelDAO;
import com.anchor.erp.myfuelapi.Domain.Vehiclemodel;
import com.anchor.erp.myfuelapi.Services.GenericService;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("vehiclemodelService")
public class VehiclemodelService implements GenericService<Vehiclemodel> {
  @Autowired
  private VehiclemodelDAO entityDAO;

  @Override
  @Transactional
  public Vehiclemodel save(Vehiclemodel entity) {
    return entityDAO.save(entity);
  }

  @Transactional
  @Override
  public void persist(Vehiclemodel entity) {
    entityDAO.persist(entity);
  }

  @Transactional
  @Override
  public Vehiclemodel findbyId(int id) {
    return entityDAO.findById(id);
  }

  @Transactional
  @Override
  public Collection<Vehiclemodel> findAll() {
     return entityDAO.findAll();
  }

  @Transactional
  @Override
  public Collection<Vehiclemodel> findByQuery(String query) {
    return entityDAO.findByQuery(query);
  }

  @Transactional
  @Override
  public Vehiclemodel merge(Vehiclemodel entity) {
    return entityDAO.merge(entity);
  }

    @Override
    public List<Vehiclemodel> findbySqlQuery(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Vehiclemodel> findBySqlQueryWithParams(String q, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Vehiclemodel> findBySqlQueryWithNamedParams(String q, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Vehiclemodel> findByNamedQuery(String name, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Vehiclemodel> findByNamedQueryAndNamedParams(String name, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
