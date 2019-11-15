package com.anchor.erp.myfuelapi.ServicesImpl;

import com.anchor.erp.myfuelapi.DAOHelper.UsersDAO;
import com.anchor.erp.myfuelapi.Domain.Users;
import com.anchor.erp.myfuelapi.Services.GenericService;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.hibernate.criterion.Criterion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UsersService implements GenericService<Users> {
  @Autowired
  private UsersDAO entityDAO;

  @Override
  @Transactional
  public Users save(Users entity) {
    return entityDAO.save(entity);
  }

  @Transactional
  @Override
  public void persist(Users entity) {
    entityDAO.persist(entity);
  }

  @Transactional
  @Override
  public Users findbyId(int id) {
    return entityDAO.findById(id);
  }

  @Transactional
  @Override
  public Collection<Users> findAll() {
     return entityDAO.findAll();
  }

  @Transactional
  @Override
  public Collection<Users> findByQuery(String query) {
    return entityDAO.findByQuery(query);
  }

  @Transactional
  @Override
  public Users merge(Users entity) {
    return entityDAO.merge(entity);
  }

    @Override
    public List<Users> findbySqlQuery(String s) {
        return entityDAO.findbySqlQuery(s);
    }

    @Override
    public List<Users> findBySqlQueryWithParams(String q, Object... params) {
        return entityDAO.findBySqlQueryWithParams(q, params);
    }

    @Override
    public List<Users> findBySqlQueryWithNamedParams(String q, Map<String, ? extends Object> params) {
        return entityDAO.findBySqlQueryWithParams(q, params);
    }

    @Override
    public List<Users> findByNamedQuery(String name, Object... params) {
        return entityDAO.findByNamedQuery(name, params);
    }

    @Override
    public List<Users> findByNamedQueryAndNamedParams(String name, Map<String, ? extends Object> params) {
        return entityDAO.findByNamedQueryAndNamedParams(name, params);
    }

    @Override
    public List<Users> findByCriterion(Criterion... criterion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
