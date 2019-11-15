package com.anchor.erp.myfuelapi.ServicesImpl;

import com.anchor.erp.myfuelapi.DAOHelper.DocPermissionsmapDAO;
import com.anchor.erp.myfuelapi.Domain.DocPermissionsmap;
import com.anchor.erp.myfuelapi.Services.GenericService;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.hibernate.criterion.Criterion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DocPermissionsmapService implements GenericService<DocPermissionsmap> {
  @Autowired
  private DocPermissionsmapDAO entityDAO;

  @Override
  @Transactional
  public DocPermissionsmap save(DocPermissionsmap entity) {
    return entityDAO.save(entity);
  }

  @Transactional
  @Override
  public void persist(DocPermissionsmap entity) {
    entityDAO.persist(entity);
  }

  @Transactional
  @Override
  public DocPermissionsmap findbyId(int id) {
    return entityDAO.findById(id);
  }

  @Transactional
  @Override
  public Collection<DocPermissionsmap> findAll() {
     return entityDAO.findAll();
  }

  @Transactional
  @Override
  public Collection<DocPermissionsmap> findByQuery(String query) {
    return entityDAO.findByQuery(query);
  }

  @Transactional
  @Override
  public DocPermissionsmap merge(DocPermissionsmap entity) {
    return entityDAO.merge(entity);
  }

    @Override
    public List<DocPermissionsmap> findbySqlQuery(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<DocPermissionsmap> findBySqlQueryWithParams(String q, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<DocPermissionsmap> findBySqlQueryWithNamedParams(String q, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<DocPermissionsmap> findByNamedQuery(String name, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<DocPermissionsmap> findByNamedQueryAndNamedParams(String name, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<DocPermissionsmap> findByCriterion(Criterion... criterion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
