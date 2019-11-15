package com.anchor.erp.myfuelapi.ServicesImpl;

import com.anchor.erp.myfuelapi.DAOHelper.QrtzCronTriggersIdDAO;
import com.anchor.erp.myfuelapi.Domain.QrtzCronTriggersId;
import com.anchor.erp.myfuelapi.Services.GenericService;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.hibernate.criterion.Criterion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class QrtzCronTriggersIdService implements GenericService<QrtzCronTriggersId> {
  @Autowired
  private QrtzCronTriggersIdDAO entityDAO;

  @Override
  @Transactional
  public QrtzCronTriggersId save(QrtzCronTriggersId entity) {
    return entityDAO.save(entity);
  }

  @Transactional
  @Override
  public void persist(QrtzCronTriggersId entity) {
    entityDAO.persist(entity);
  }

  @Transactional
  @Override
  public QrtzCronTriggersId findbyId(int id) {
    return entityDAO.findById(id);
  }

  @Transactional
  @Override
  public Collection<QrtzCronTriggersId> findAll() {
     return entityDAO.findAll();
  }

  @Transactional
  @Override
  public Collection<QrtzCronTriggersId> findByQuery(String query) {
    return entityDAO.findByQuery(query);
  }

  @Transactional
  @Override
  public QrtzCronTriggersId merge(QrtzCronTriggersId entity) {
    return entityDAO.merge(entity);
  }

    @Override
    public List<QrtzCronTriggersId> findbySqlQuery(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<QrtzCronTriggersId> findBySqlQueryWithParams(String q, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<QrtzCronTriggersId> findBySqlQueryWithNamedParams(String q, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<QrtzCronTriggersId> findByNamedQuery(String name, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<QrtzCronTriggersId> findByNamedQueryAndNamedParams(String name, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<QrtzCronTriggersId> findByCriterion(Criterion... criterion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
