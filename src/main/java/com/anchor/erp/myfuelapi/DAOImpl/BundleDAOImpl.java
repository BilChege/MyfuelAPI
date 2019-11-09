// authored by Chege
package com.anchor.erp.myfuelapi.DAOImpl;

import com.anchor.erp.myfuelapi.DAO.AbstractDAO;
import com.anchor.erp.myfuelapi.DAOHelper.BundleDAO;
import com.anchor.erp.myfuelapi.Domain.Bundle;
import java.lang.Integer;
import org.springframework.stereotype.Repository;

@Repository
public class BundleDAOImpl extends AbstractDAO<Bundle, Integer> implements BundleDAO {
  public BundleDAOImpl() {
    super(Bundle.class);
  }
}
