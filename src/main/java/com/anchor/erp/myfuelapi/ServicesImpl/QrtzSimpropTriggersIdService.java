package com.anchor.erp.myfuelapi.ServicesImpl;

import com.anchor.erp.myfuelapi.DAOHelper.QrtzSimpropTriggersIdDAO;
import com.anchor.erp.myfuelapi.Domain.QrtzSimpropTriggersId;
import com.anchor.erp.myfuelapi.Services.GenericService;
import java.lang.Override;
import java.lang.String;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class QrtzSimpropTriggersIdService implements GenericService<QrtzSimpropTriggersId> {
  @Autowired
  private QrtzSimpropTriggersIdDAO entityDAO;

  @Override
  @Transactional
  public QrtzSimpropTriggersId save(QrtzSimpropTriggersId entity) {
    return entityDAO.save(entity);
  }

  @Transactional
  @Override
  public void persist(QrtzSimpropTriggersId entity) {
    entityDAO.persist(entity);
  }

  @Transactional
  @Override
  public QrtzSimpropTriggersId findbyId(int id) {
    return entityDAO.findById(id);
  }

  @Transactional
  @Override
  public Collection<QrtzSimpropTriggersId> findAll() {
     return entityDAO.findAll();
  }

  @Transactional
  @Override
  public Collection<QrtzSimpropTriggersId> findByQuery(String query) {
    return entityDAO.findByQuery(query);
  }

  @Transactional
  @Override
  public QrtzSimpropTriggersId merge(QrtzSimpropTriggersId entity) {
    return entityDAO.merge(entity);
  }

    @Override
    public List<QrtzSimpropTriggersId> findbySqlQuery(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<QrtzSimpropTriggersId> findBySqlQueryWithParams(String q, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<QrtzSimpropTriggersId> findBySqlQueryWithNamedParams(String q, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<QrtzSimpropTriggersId> findByNamedQuery(String name, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<QrtzSimpropTriggersId> findByNamedQueryAndNamedParams(String name, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
