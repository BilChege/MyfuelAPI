// authored by Chege
package com.anchor.erp.myfuelapi.DAOImpl;

import com.anchor.erp.myfuelapi.DAO.AbstractDAO;
import com.anchor.erp.myfuelapi.DAOHelper.PackagePurchaseDAO;
import com.anchor.erp.myfuelapi.Domain.PackagePurchase;
import java.lang.Integer;
import org.springframework.stereotype.Repository;

@Repository
public class PackagePurchaseDAOImpl extends AbstractDAO<PackagePurchase, Integer> implements PackagePurchaseDAO {
  public PackagePurchaseDAOImpl() {
    super(PackagePurchase.class);
  }
}
