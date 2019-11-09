// authored by Chege
package com.anchor.erp.myfuelapi.DAOImpl;

import com.anchor.erp.myfuelapi.DAO.AbstractDAO;
import com.anchor.erp.myfuelapi.DAOHelper.PaybillconfirmationDAO;
import com.anchor.erp.myfuelapi.Domain.Paybillconfirmation;
import java.lang.Integer;
import org.springframework.stereotype.Repository;

@Repository
public class PaybillconfirmationDAOImpl extends AbstractDAO<Paybillconfirmation, Integer> implements PaybillconfirmationDAO {
  public PaybillconfirmationDAOImpl() {
    super(Paybillconfirmation.class);
  }
}
