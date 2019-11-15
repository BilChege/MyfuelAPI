package com.anchor.erp.myfuelapi.ServicesImpl;

import com.anchor.erp.myfuelapi.DAOHelper.WfWorkflowadminDAO;
import com.anchor.erp.myfuelapi.Domain.WfWorkflowadmin;
import com.anchor.erp.myfuelapi.Services.GenericService;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.hibernate.criterion.Criterion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class WfWorkflowadminService implements GenericService<WfWorkflowadmin> {
  @Autowired
  private WfWorkflowadminDAO entityDAO;

  @Override
  @Transactional
  public WfWorkflowadmin save(WfWorkflowadmin entity) {
    return entityDAO.save(entity);
  }

  @Transactional
  @Override
  public void persist(WfWorkflowadmin entity) {
    entityDAO.persist(entity);
  }

  @Transactional
  @Override
  public WfWorkflowadmin findbyId(int id) {
    return entityDAO.findById(id);
  }

  @Transactional
  @Override
  public Collection<WfWorkflowadmin> findAll() {
     return entityDAO.findAll();
  }

  @Transactional
  @Override
  public Collection<WfWorkflowadmin> findByQuery(String query) {
    return entityDAO.findByQuery(query);
  }

  @Transactional
  @Override
  public WfWorkflowadmin merge(WfWorkflowadmin entity) {
    return entityDAO.merge(entity);
  }

    @Override
    public List<WfWorkflowadmin> findbySqlQuery(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<WfWorkflowadmin> findBySqlQueryWithParams(String q, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<WfWorkflowadmin> findBySqlQueryWithNamedParams(String q, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<WfWorkflowadmin> findByNamedQuery(String name, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<WfWorkflowadmin> findByNamedQueryAndNamedParams(String name, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<WfWorkflowadmin> findByCriterion(Criterion... criterion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
