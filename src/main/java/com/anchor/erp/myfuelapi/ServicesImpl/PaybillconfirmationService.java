package com.anchor.erp.myfuelapi.ServicesImpl;

import com.anchor.erp.myfuelapi.DAOHelper.PaybillconfirmationDAO;
import com.anchor.erp.myfuelapi.Domain.Paybillconfirmation;
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
public class PaybillconfirmationService implements GenericService<Paybillconfirmation> {
  @Autowired
  private PaybillconfirmationDAO entityDAO;

  @Override
  @Transactional
  public Paybillconfirmation save(Paybillconfirmation entity) {
    return entityDAO.save(entity);
  }

  @Transactional
  @Override
  public void persist(Paybillconfirmation entity) {
    entityDAO.persist(entity);
  }

  @Transactional
  @Override
  public Paybillconfirmation findbyId(int id) {
    return entityDAO.findById(id);
  }

  @Transactional
  @Override
  public Collection<Paybillconfirmation> findAll() {
     return entityDAO.findAll();
  }

  @Transactional
  @Override
  public Collection<Paybillconfirmation> findByQuery(String query) {
    return entityDAO.findByQuery(query);
  }

  @Transactional
  @Override
  public Paybillconfirmation merge(Paybillconfirmation entity) {
    return entityDAO.merge(entity);
  }

    @Override
    public List<Paybillconfirmation> findbySqlQuery(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Paybillconfirmation> findBySqlQueryWithParams(String q, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Paybillconfirmation> findBySqlQueryWithNamedParams(String q, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Paybillconfirmation> findByNamedQuery(String name, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Paybillconfirmation> findByNamedQueryAndNamedParams(String name, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
