package com.anchor.erp.myfuelapi.ServicesImpl;

import com.anchor.erp.myfuelapi.DAOHelper.AncerpreportDAO;
import com.anchor.erp.myfuelapi.Domain.Ancerpreport;
import com.anchor.erp.myfuelapi.Services.GenericService;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AncerpreportService implements GenericService<Ancerpreport> {
  @Autowired
  private AncerpreportDAO entityDAO;

  @Override
  @Transactional
  public Ancerpreport save(Ancerpreport entity) {
    return entityDAO.save(entity);
  }

  @Transactional
  @Override
  public void persist(Ancerpreport entity) {
    entityDAO.persist(entity);
  }

  @Transactional
  @Override
  public Ancerpreport findbyId(int id) {
    return entityDAO.findById(id);
  }

  @Transactional
  @Override
  public Collection<Ancerpreport> findAll() {
     return entityDAO.findAll();
  }

  @Transactional
  @Override
  public Collection<Ancerpreport> findByQuery(String query) {
    return entityDAO.findByQuery(query);
  }

  @Transactional
  @Override
  public Ancerpreport merge(Ancerpreport entity) {
    return entityDAO.merge(entity);
  }

    @Override
    public List<Ancerpreport> findbySqlQuery(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Ancerpreport> findBySqlQueryWithParams(String q, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Ancerpreport> findBySqlQueryWithNamedParams(String q, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Ancerpreport> findByNamedQuery(String name, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Ancerpreport> findByNamedQueryAndNamedParams(String name, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
