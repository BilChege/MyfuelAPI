package com.anchor.erp.myfuelapi.ServicesImpl;

import com.anchor.erp.myfuelapi.DAOHelper.PackagePurchaseDAO;
import com.anchor.erp.myfuelapi.Domain.PackagePurchase;
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
public class PackagePurchaseService implements GenericService<PackagePurchase> {
  @Autowired
  private PackagePurchaseDAO entityDAO;

  @Override
  @Transactional
  public PackagePurchase save(PackagePurchase entity) {
    return entityDAO.save(entity);
  }

  @Transactional
  @Override
  public void persist(PackagePurchase entity) {
    entityDAO.persist(entity);
  }

  @Transactional
  @Override
  public PackagePurchase findbyId(int id) {
    return entityDAO.findById(id);
  }

  @Transactional
  @Override
  public Collection<PackagePurchase> findAll() {
     return entityDAO.findAll();
  }

  @Transactional
  @Override
  public Collection<PackagePurchase> findByQuery(String query) {
    return entityDAO.findByQuery(query);
  }

  @Transactional
  @Override
  public PackagePurchase merge(PackagePurchase entity) {
    return entityDAO.merge(entity);
  }

    @Override
    public List<PackagePurchase> findbySqlQuery(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PackagePurchase> findBySqlQueryWithParams(String q, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PackagePurchase> findBySqlQueryWithNamedParams(String q, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PackagePurchase> findByNamedQuery(String name, Object... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PackagePurchase> findByNamedQueryAndNamedParams(String name, Map<String, ? extends Object> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
