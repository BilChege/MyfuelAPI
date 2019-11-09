package com.anchor.erp.myfuelapi.ServicesImpl;

import com.anchor.erp.myfuelapi.DAOHelper.WfActivityDAO;
import com.anchor.erp.myfuelapi.Domain.WfActivity;
import com.anchor.erp.myfuelapi.Services.GenericService;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class WfActivityService implements GenericService<WfActivity> {
  @Autowired
  private WfActivityDAO entityDAO;

  @Override
  @Transactional
  public WfActivity save(WfActivity entity) {
    return entityDAO.save(entity);
  }

  @Transactional
  @Override
  public void persist(WfActivity entity) {
    entityDAO.persist(entity);
  }

  @Transactional
  @Override
  public WfActivity findbyId(int id) {
    return entityDAO.findById(id);
  }

  @Transactional
  @Override
  public Collection<WfActivity> findAll() {
     return entityDAO.findAll();
  }

  @Transactional
  @Override
  public Collection<WfActivity> findByQuery(String query) {
    return entityDAO.findByQuery(query);
  }

  @Transactional
  @Override
  public WfActivity merge(WfActivity entity) {
    return entityDAO.merge(entity);
  }

    @Override
    public List<WfActivity> findbySqlQuery(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<WfActivity> findBySqlQueryWithParams(String q, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<WfActivity> findBySqlQueryWithNamedParams(String q, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<WfActivity> findByNamedQuery(String name, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<WfActivity> findByNamedQueryAndNamedParams(String name, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
