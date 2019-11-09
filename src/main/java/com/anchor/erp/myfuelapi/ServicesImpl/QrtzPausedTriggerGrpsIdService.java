package com.anchor.erp.myfuelapi.ServicesImpl;

import com.anchor.erp.myfuelapi.DAOHelper.QrtzPausedTriggerGrpsIdDAO;
import com.anchor.erp.myfuelapi.Domain.QrtzPausedTriggerGrpsId;
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
public class QrtzPausedTriggerGrpsIdService implements GenericService<QrtzPausedTriggerGrpsId> {
  @Autowired
  private QrtzPausedTriggerGrpsIdDAO entityDAO;

  @Override
  @Transactional
  public QrtzPausedTriggerGrpsId save(QrtzPausedTriggerGrpsId entity) {
    return entityDAO.save(entity);
  }

  @Transactional
  @Override
  public void persist(QrtzPausedTriggerGrpsId entity) {
    entityDAO.persist(entity);
  }

  @Transactional
  @Override
  public QrtzPausedTriggerGrpsId findbyId(int id) {
    return entityDAO.findById(id);
  }

  @Transactional
  @Override
  public Collection<QrtzPausedTriggerGrpsId> findAll() {
     return entityDAO.findAll();
  }

  @Transactional
  @Override
  public Collection<QrtzPausedTriggerGrpsId> findByQuery(String query) {
    return entityDAO.findByQuery(query);
  }

  @Transactional
  @Override
  public QrtzPausedTriggerGrpsId merge(QrtzPausedTriggerGrpsId entity) {
    return entityDAO.merge(entity);
  }

    @Override
    public List<QrtzPausedTriggerGrpsId> findbySqlQuery(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<QrtzPausedTriggerGrpsId> findBySqlQueryWithParams(String q, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<QrtzPausedTriggerGrpsId> findBySqlQueryWithNamedParams(String q, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<QrtzPausedTriggerGrpsId> findByNamedQuery(String name, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<QrtzPausedTriggerGrpsId> findByNamedQueryAndNamedParams(String name, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
