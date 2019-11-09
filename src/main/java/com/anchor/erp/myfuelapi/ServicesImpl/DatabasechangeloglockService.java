package com.anchor.erp.myfuelapi.ServicesImpl;

import com.anchor.erp.myfuelapi.DAOHelper.DatabasechangeloglockDAO;
import com.anchor.erp.myfuelapi.Domain.Databasechangeloglock;
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
public class DatabasechangeloglockService implements GenericService<Databasechangeloglock> {
  @Autowired
  private DatabasechangeloglockDAO entityDAO;

  @Override
  @Transactional
  public Databasechangeloglock save(Databasechangeloglock entity) {
    return entityDAO.save(entity);
  }

  @Transactional
  @Override
  public void persist(Databasechangeloglock entity) {
    entityDAO.persist(entity);
  }

  @Transactional
  @Override
  public Databasechangeloglock findbyId(int id) {
    return entityDAO.findById(id);
  }

  @Transactional
  @Override
  public Collection<Databasechangeloglock> findAll() {
     return entityDAO.findAll();
  }

  @Transactional
  @Override
  public Collection<Databasechangeloglock> findByQuery(String query) {
    return entityDAO.findByQuery(query);
  }

  @Transactional
  @Override
  public Databasechangeloglock merge(Databasechangeloglock entity) {
    return entityDAO.merge(entity);
  }

    @Override
    public List<Databasechangeloglock> findbySqlQuery(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Databasechangeloglock> findBySqlQueryWithParams(String q, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Databasechangeloglock> findBySqlQueryWithNamedParams(String q, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Databasechangeloglock> findByNamedQuery(String name, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Databasechangeloglock> findByNamedQueryAndNamedParams(String name, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
