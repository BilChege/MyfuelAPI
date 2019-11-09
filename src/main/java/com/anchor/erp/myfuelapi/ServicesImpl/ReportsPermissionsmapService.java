package com.anchor.erp.myfuelapi.ServicesImpl;

import com.anchor.erp.myfuelapi.DAOHelper.ReportsPermissionsmapDAO;
import com.anchor.erp.myfuelapi.Domain.ReportsPermissionsmap;
import com.anchor.erp.myfuelapi.Services.GenericService;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ReportsPermissionsmapService implements GenericService<ReportsPermissionsmap> {
  @Autowired
  private ReportsPermissionsmapDAO entityDAO;

  @Override
  @Transactional
  public ReportsPermissionsmap save(ReportsPermissionsmap entity) {
    return entityDAO.save(entity);
  }

  @Transactional
  @Override
  public void persist(ReportsPermissionsmap entity) {
    entityDAO.persist(entity);
  }

  @Transactional
  @Override
  public ReportsPermissionsmap findbyId(int id) {
    return entityDAO.findById(id);
  }

  @Transactional
  @Override
  public Collection<ReportsPermissionsmap> findAll() {
     return entityDAO.findAll();
  }

  @Transactional
  @Override
  public Collection<ReportsPermissionsmap> findByQuery(String query) {
    return entityDAO.findByQuery(query);
  }

  @Transactional
  @Override
  public ReportsPermissionsmap merge(ReportsPermissionsmap entity) {
    return entityDAO.merge(entity);
  }

    @Override
    public List<ReportsPermissionsmap> findbySqlQuery(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ReportsPermissionsmap> findBySqlQueryWithParams(String q, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ReportsPermissionsmap> findBySqlQueryWithNamedParams(String q, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ReportsPermissionsmap> findByNamedQuery(String name, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ReportsPermissionsmap> findByNamedQueryAndNamedParams(String name, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
