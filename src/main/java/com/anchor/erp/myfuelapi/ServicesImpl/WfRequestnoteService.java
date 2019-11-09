package com.anchor.erp.myfuelapi.ServicesImpl;

import com.anchor.erp.myfuelapi.DAOHelper.WfRequestnoteDAO;
import com.anchor.erp.myfuelapi.Domain.WfRequestnote;
import com.anchor.erp.myfuelapi.Services.GenericService;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class WfRequestnoteService implements GenericService<WfRequestnote> {
  @Autowired
  private WfRequestnoteDAO entityDAO;

  @Override
  @Transactional
  public WfRequestnote save(WfRequestnote entity) {
    return entityDAO.save(entity);
  }

  @Transactional
  @Override
  public void persist(WfRequestnote entity) {
    entityDAO.persist(entity);
  }

  @Transactional
  @Override
  public WfRequestnote findbyId(int id) {
    return entityDAO.findById(id);
  }

  @Transactional
  @Override
  public Collection<WfRequestnote> findAll() {
     return entityDAO.findAll();
  }

  @Transactional
  @Override
  public Collection<WfRequestnote> findByQuery(String query) {
    return entityDAO.findByQuery(query);
  }

  @Transactional
  @Override
  public WfRequestnote merge(WfRequestnote entity) {
    return entityDAO.merge(entity);
  }

    @Override
    public List<WfRequestnote> findbySqlQuery(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<WfRequestnote> findBySqlQueryWithParams(String q, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<WfRequestnote> findBySqlQueryWithNamedParams(String q, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<WfRequestnote> findByNamedQuery(String name, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<WfRequestnote> findByNamedQueryAndNamedParams(String name, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
