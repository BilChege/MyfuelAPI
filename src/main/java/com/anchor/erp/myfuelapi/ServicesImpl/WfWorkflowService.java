package com.anchor.erp.myfuelapi.ServicesImpl;

import com.anchor.erp.myfuelapi.DAOHelper.WfWorkflowDAO;
import com.anchor.erp.myfuelapi.Domain.WfWorkflow;
import com.anchor.erp.myfuelapi.Services.GenericService;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class WfWorkflowService implements GenericService<WfWorkflow> {
  @Autowired
  private WfWorkflowDAO entityDAO;

  @Override
  @Transactional
  public WfWorkflow save(WfWorkflow entity) {
    return entityDAO.save(entity);
  }

  @Transactional
  @Override
  public void persist(WfWorkflow entity) {
    entityDAO.persist(entity);
  }

  @Transactional
  @Override
  public WfWorkflow findbyId(int id) {
    return entityDAO.findById(id);
  }

  @Transactional
  @Override
  public Collection<WfWorkflow> findAll() {
     return entityDAO.findAll();
  }

  @Transactional
  @Override
  public Collection<WfWorkflow> findByQuery(String query) {
    return entityDAO.findByQuery(query);
  }

  @Transactional
  @Override
  public WfWorkflow merge(WfWorkflow entity) {
    return entityDAO.merge(entity);
  }

    @Override
    public List<WfWorkflow> findbySqlQuery(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<WfWorkflow> findBySqlQueryWithParams(String q, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<WfWorkflow> findBySqlQueryWithNamedParams(String q, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<WfWorkflow> findByNamedQuery(String name, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<WfWorkflow> findByNamedQueryAndNamedParams(String name, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
