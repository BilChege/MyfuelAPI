package com.anchor.erp.myfuelapi.ServicesImpl;

import com.anchor.erp.myfuelapi.DAOHelper.TablemodelDAO;
import com.anchor.erp.myfuelapi.Domain.Tablemodel;
import com.anchor.erp.myfuelapi.Services.GenericService;
import java.lang.Override;
import java.lang.String;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TablemodelService implements GenericService<Tablemodel> {
  @Autowired
  private TablemodelDAO entityDAO;

  @Override
  @Transactional
  public Tablemodel save(Tablemodel entity) {
    return entityDAO.save(entity);
  }

  @Transactional
  @Override
  public void persist(Tablemodel entity) {
    entityDAO.persist(entity);
  }

  @Transactional
  @Override
  public Tablemodel findbyId(int id) {
    return entityDAO.findById(id);
  }

  @Transactional
  @Override
  public Collection<Tablemodel> findAll() {
     return entityDAO.findAll();
  }

  @Transactional
  @Override
  public Collection<Tablemodel> findByQuery(String query) {
    return entityDAO.findByQuery(query);
  }

  @Transactional
  @Override
  public Tablemodel merge(Tablemodel entity) {
    return entityDAO.merge(entity);
  }

    @Override
    public List<Tablemodel> findbySqlQuery(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Tablemodel> findBySqlQueryWithParams(String q, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Tablemodel> findBySqlQueryWithNamedParams(String q, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Tablemodel> findByNamedQuery(String name, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Tablemodel> findByNamedQueryAndNamedParams(String name, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
