package com.anchor.erp.myfuelapi.ServicesImpl;

import com.anchor.erp.myfuelapi.DAOHelper.PermissiongroupsDAO;
import com.anchor.erp.myfuelapi.Domain.Permissiongroups;
import com.anchor.erp.myfuelapi.Services.GenericService;
import java.lang.Override;
import java.lang.String;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.hibernate.criterion.Criterion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PermissiongroupsService implements GenericService<Permissiongroups> {
  @Autowired
  private PermissiongroupsDAO entityDAO;

  @Override
  @Transactional
  public Permissiongroups save(Permissiongroups entity) {
    return entityDAO.save(entity);
  }

  @Transactional
  @Override
  public void persist(Permissiongroups entity) {
    entityDAO.persist(entity);
  }

  @Transactional
  @Override
  public Permissiongroups findbyId(int id) {
    return entityDAO.findById(id);
  }

  @Transactional
  @Override
  public Collection<Permissiongroups> findAll() {
     return entityDAO.findAll();
  }

  @Transactional
  @Override
  public Collection<Permissiongroups> findByQuery(String query) {
    return entityDAO.findByQuery(query);
  }

  @Transactional
  @Override
  public Permissiongroups merge(Permissiongroups entity) {
    return entityDAO.merge(entity);
  }

    @Override
    public List<Permissiongroups> findbySqlQuery(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Permissiongroups> findBySqlQueryWithParams(String q, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Permissiongroups> findBySqlQueryWithNamedParams(String q, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Permissiongroups> findByNamedQuery(String name, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Permissiongroups> findByNamedQueryAndNamedParams(String name, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Permissiongroups> findByCriterion(Criterion... criterion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
