package com.anchor.erp.myfuelapi.ServicesImpl;

import com.anchor.erp.myfuelapi.DAOHelper.CompanydetailsDAO;
import com.anchor.erp.myfuelapi.Domain.Companydetails;
import com.anchor.erp.myfuelapi.Services.GenericService;
import java.lang.Override;
import java.lang.String;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.hibernate.criterion.Criterion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CompanydetailsService implements GenericService<Companydetails> {
  @Autowired
  private CompanydetailsDAO entityDAO;

  @Override
  @Transactional
  public Companydetails save(Companydetails entity) {
    return entityDAO.save(entity);
  }

  @Transactional
  @Override
  public void persist(Companydetails entity) {
    entityDAO.persist(entity);
  }

  @Transactional
  @Override
  public Companydetails findbyId(int id) {
    return entityDAO.findById(id);
  }

  @Transactional
  @Override
  public Collection<Companydetails> findAll() {
     return entityDAO.findAll();
  }

  @Transactional
  @Override
  public Collection<Companydetails> findByQuery(String query) {
    return entityDAO.findByQuery(query);
  }

  @Transactional
  @Override
  public Companydetails merge(Companydetails entity) {
    return entityDAO.merge(entity);
  }

    @Override
    public List<Companydetails> findbySqlQuery(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Companydetails> findBySqlQueryWithParams(String q, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Companydetails> findBySqlQueryWithNamedParams(String q, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Companydetails> findByNamedQuery(String name, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Companydetails> findByNamedQueryAndNamedParams(String name, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Companydetails> findByCriterion(Criterion... criterion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
