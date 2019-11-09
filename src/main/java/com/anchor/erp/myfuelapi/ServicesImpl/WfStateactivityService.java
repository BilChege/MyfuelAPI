package com.anchor.erp.myfuelapi.ServicesImpl;

import com.anchor.erp.myfuelapi.DAOHelper.WfStateactivityDAO;
import com.anchor.erp.myfuelapi.Domain.WfStateactivity;
import com.anchor.erp.myfuelapi.Services.GenericService;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class WfStateactivityService implements GenericService<WfStateactivity> {
  @Autowired
  private WfStateactivityDAO entityDAO;

  @Override
  @Transactional
  public WfStateactivity save(WfStateactivity entity) {
    return entityDAO.save(entity);
  }

  @Transactional
  @Override
  public void persist(WfStateactivity entity) {
    entityDAO.persist(entity);
  }

  @Transactional
  @Override
  public WfStateactivity findbyId(int id) {
    return entityDAO.findById(id);
  }

  @Transactional
  @Override
  public Collection<WfStateactivity> findAll() {
     return entityDAO.findAll();
  }

  @Transactional
  @Override
  public Collection<WfStateactivity> findByQuery(String query) {
    return entityDAO.findByQuery(query);
  }

  @Transactional
  @Override
  public WfStateactivity merge(WfStateactivity entity) {
    return entityDAO.merge(entity);
  }

    @Override
    public List<WfStateactivity> findbySqlQuery(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<WfStateactivity> findBySqlQueryWithParams(String q, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<WfStateactivity> findBySqlQueryWithNamedParams(String q, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<WfStateactivity> findByNamedQuery(String name, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<WfStateactivity> findByNamedQueryAndNamedParams(String name, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
