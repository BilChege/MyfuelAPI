package com.anchor.erp.myfuelapi.ServicesImpl;

import com.anchor.erp.myfuelapi.DAOHelper.WfRequestfileDAO;
import com.anchor.erp.myfuelapi.Domain.WfRequestfile;
import com.anchor.erp.myfuelapi.Services.GenericService;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class WfRequestfileService implements GenericService<WfRequestfile> {
  @Autowired
  private WfRequestfileDAO entityDAO;

  @Override
  @Transactional
  public WfRequestfile save(WfRequestfile entity) {
    return entityDAO.save(entity);
  }

  @Transactional
  @Override
  public void persist(WfRequestfile entity) {
    entityDAO.persist(entity);
  }

  @Transactional
  @Override
  public WfRequestfile findbyId(int id) {
    return entityDAO.findById(id);
  }

  @Transactional
  @Override
  public Collection<WfRequestfile> findAll() {
     return entityDAO.findAll();
  }

  @Transactional
  @Override
  public Collection<WfRequestfile> findByQuery(String query) {
    return entityDAO.findByQuery(query);
  }

  @Transactional
  @Override
  public WfRequestfile merge(WfRequestfile entity) {
    return entityDAO.merge(entity);
  }

    @Override
    public List<WfRequestfile> findbySqlQuery(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<WfRequestfile> findBySqlQueryWithParams(String q, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<WfRequestfile> findBySqlQueryWithNamedParams(String q, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<WfRequestfile> findByNamedQuery(String name, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<WfRequestfile> findByNamedQueryAndNamedParams(String name, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
