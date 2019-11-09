package com.anchor.erp.myfuelapi.ServicesImpl;

import com.anchor.erp.myfuelapi.DAOHelper.EmailconfigDAO;
import com.anchor.erp.myfuelapi.Domain.Emailconfig;
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
public class EmailconfigService implements GenericService<Emailconfig> {
  @Autowired
  private EmailconfigDAO entityDAO;

  @Override
  @Transactional
  public Emailconfig save(Emailconfig entity) {
    return entityDAO.save(entity);
  }

  @Transactional
  @Override
  public void persist(Emailconfig entity) {
    entityDAO.persist(entity);
  }

  @Transactional
  @Override
  public Emailconfig findbyId(int id) {
    return entityDAO.findById(id);
  }

  @Transactional
  @Override
  public Collection<Emailconfig> findAll() {
     return entityDAO.findAll();
  }

  @Transactional
  @Override
  public Collection<Emailconfig> findByQuery(String query) {
    return entityDAO.findByQuery(query);
  }

  @Transactional
  @Override
  public Emailconfig merge(Emailconfig entity) {
    return entityDAO.merge(entity);
  }

    @Override
    public List<Emailconfig> findbySqlQuery(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Emailconfig> findBySqlQueryWithParams(String q, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Emailconfig> findBySqlQueryWithNamedParams(String q, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Emailconfig> findByNamedQuery(String name, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Emailconfig> findByNamedQueryAndNamedParams(String name, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
