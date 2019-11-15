package com.anchor.erp.myfuelapi.ServicesImpl;

import com.anchor.erp.myfuelapi.DAOHelper.QrtzFiredTriggersIdDAO;
import com.anchor.erp.myfuelapi.Domain.QrtzFiredTriggersId;
import com.anchor.erp.myfuelapi.Services.GenericService;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.hibernate.criterion.Criterion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class QrtzFiredTriggersIdService implements GenericService<QrtzFiredTriggersId> {
  @Autowired
  private QrtzFiredTriggersIdDAO entityDAO;

  @Override
  @Transactional
  public QrtzFiredTriggersId save(QrtzFiredTriggersId entity) {
    return entityDAO.save(entity);
  }

  @Transactional
  @Override
  public void persist(QrtzFiredTriggersId entity) {
    entityDAO.persist(entity);
  }

  @Transactional
  @Override
  public QrtzFiredTriggersId findbyId(int id) {
    return entityDAO.findById(id);
  }

  @Transactional
  @Override
  public Collection<QrtzFiredTriggersId> findAll() {
     return entityDAO.findAll();
  }

  @Transactional
  @Override
  public Collection<QrtzFiredTriggersId> findByQuery(String query) {
    return entityDAO.findByQuery(query);
  }

  @Transactional
  @Override
  public QrtzFiredTriggersId merge(QrtzFiredTriggersId entity) {
    return entityDAO.merge(entity);
  }

    @Override
    public List<QrtzFiredTriggersId> findbySqlQuery(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<QrtzFiredTriggersId> findBySqlQueryWithParams(String q, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<QrtzFiredTriggersId> findBySqlQueryWithNamedParams(String q, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<QrtzFiredTriggersId> findByNamedQuery(String name, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<QrtzFiredTriggersId> findByNamedQueryAndNamedParams(String name, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<QrtzFiredTriggersId> findByCriterion(Criterion... criterion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
