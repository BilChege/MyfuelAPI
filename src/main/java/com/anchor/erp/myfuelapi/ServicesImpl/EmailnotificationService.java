package com.anchor.erp.myfuelapi.ServicesImpl;

import com.anchor.erp.myfuelapi.DAOHelper.EmailnotificationDAO;
import com.anchor.erp.myfuelapi.Domain.Emailnotification;
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
public class EmailnotificationService implements GenericService<Emailnotification> {
  @Autowired
  private EmailnotificationDAO entityDAO;

  @Override
  @Transactional
  public Emailnotification save(Emailnotification entity) {
    return entityDAO.save(entity);
  }

  @Transactional
  @Override
  public void persist(Emailnotification entity) {
    entityDAO.persist(entity);
  }

  @Transactional
  @Override
  public Emailnotification findbyId(int id) {
    return entityDAO.findById(id);
  }

  @Transactional
  @Override
  public Collection<Emailnotification> findAll() {
     return entityDAO.findAll();
  }

  @Transactional
  @Override
  public Collection<Emailnotification> findByQuery(String query) {
    return entityDAO.findByQuery(query);
  }

  @Transactional
  @Override
  public Emailnotification merge(Emailnotification entity) {
    return entityDAO.merge(entity);
  }

    @Override
    public List<Emailnotification> findbySqlQuery(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Emailnotification> findBySqlQueryWithParams(String q, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Emailnotification> findBySqlQueryWithNamedParams(String q, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Emailnotification> findByNamedQuery(String name, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Emailnotification> findByNamedQueryAndNamedParams(String name, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
