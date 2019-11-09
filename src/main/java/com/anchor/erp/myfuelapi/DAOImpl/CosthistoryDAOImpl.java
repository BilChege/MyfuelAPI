// authored by Chege
package com.anchor.erp.myfuelapi.DAOImpl;

import com.anchor.erp.myfuelapi.DAO.AbstractDAO;
import com.anchor.erp.myfuelapi.DAOHelper.CosthistoryDAO;
import com.anchor.erp.myfuelapi.Domain.Costhistory;
import java.lang.Integer;
import org.springframework.stereotype.Repository;

@Repository
public class CosthistoryDAOImpl extends AbstractDAO<Costhistory, Integer> implements CosthistoryDAO {
  public CosthistoryDAOImpl() {
    super(Costhistory.class);
  }
}
