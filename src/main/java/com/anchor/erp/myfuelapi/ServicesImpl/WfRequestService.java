package com.anchor.erp.myfuelapi.ServicesImpl;

import com.anchor.erp.myfuelapi.DAOHelper.WfRequestDAO;
import com.anchor.erp.myfuelapi.Domain.WfRequest;
import com.anchor.erp.myfuelapi.Services.GenericService;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class WfRequestService implements GenericService<WfRequest> {
  @Autowired
  private WfRequestDAO entityDAO;

  @Override
  @Transactional
  public WfRequest save(WfRequest entity) {
    return entityDAO.save(entity);
  }

  @Transactional
  @Override
  public void persist(WfRequest entity) {
    entityDAO.persist(entity);
  }

  @Transactional
  @Override
  public WfRequest findbyId(int id) {
    return entityDAO.findById(id);
  }

  @Transactional
  @Override
  public Collection<WfRequest> findAll() {
     return entityDAO.findAll();
  }

  @Transactional
  @Override
  public Collection<WfRequest> findByQuery(String query) {
    return entityDAO.findByQuery(query);
  }

  @Transactional
  @Override
  public WfRequest merge(WfRequest entity) {
    return entityDAO.merge(entity);
  }

    @Override
    public List<WfRequest> findbySqlQuery(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<WfRequest> findBySqlQueryWithParams(String q, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<WfRequest> findBySqlQueryWithNamedParams(String q, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<WfRequest> findByNamedQuery(String name, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<WfRequest> findByNamedQueryAndNamedParams(String name, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}