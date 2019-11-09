// authored by Chege
package com.anchor.erp.myfuelapi.DAOImpl;

import com.anchor.erp.myfuelapi.DAO.AbstractDAO;
import com.anchor.erp.myfuelapi.DAOHelper.DealerDAO;
import com.anchor.erp.myfuelapi.Domain.Dealer;
import java.lang.Integer;
import org.springframework.stereotype.Repository;

@Repository
public class DealerDAOImpl extends AbstractDAO<Dealer, Integer> implements DealerDAO {
  public DealerDAOImpl() {
    super(Dealer.class);
  }
}
