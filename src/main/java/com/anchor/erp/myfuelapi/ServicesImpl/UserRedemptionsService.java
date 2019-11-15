package com.anchor.erp.myfuelapi.ServicesImpl;

import com.anchor.erp.myfuelapi.DAOHelper.UserRedemptionsDAO;
import com.anchor.erp.myfuelapi.Domain.UserRedemptions;
import com.anchor.erp.myfuelapi.Services.GenericService;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.hibernate.criterion.Criterion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userRedemptionsService")
public class UserRedemptionsService implements GenericService<UserRedemptions> {
  @Autowired
  private UserRedemptionsDAO entityDAO;

  @Override
  @Transactional
  public UserRedemptions save(UserRedemptions entity) {
    return entityDAO.save(entity);
  }

  @Transactional
  @Override
  public void persist(UserRedemptions entity) {
    entityDAO.persist(entity);
  }

  @Transactional
  @Override
  public UserRedemptions findbyId(int id) {
    return entityDAO.findById(id);
  }

  @Transactional
  @Override
  public Collection<UserRedemptions> findAll() {
     return entityDAO.findAll();
  }

  @Transactional
  @Override
  public Collection<UserRedemptions> findByQuery(String query) {
    return entityDAO.findByQuery(query);
  }

  @Transactional
  @Override
  public UserRedemptions merge(UserRedemptions entity) {
    return entityDAO.merge(entity);
  }

    @Override
    public List<UserRedemptions> findbySqlQuery(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<UserRedemptions> findBySqlQueryWithParams(String q, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<UserRedemptions> findBySqlQueryWithNamedParams(String q, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<UserRedemptions> findByNamedQuery(String name, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<UserRedemptions> findByNamedQueryAndNamedParams(String name, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<UserRedemptions> findByCriterion(Criterion... criterion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
