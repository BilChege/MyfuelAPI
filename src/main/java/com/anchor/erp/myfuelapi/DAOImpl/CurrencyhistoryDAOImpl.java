// authored by Chege
package com.anchor.erp.myfuelapi.DAOImpl;

import com.anchor.erp.myfuelapi.DAO.AbstractDAO;
import com.anchor.erp.myfuelapi.DAOHelper.CurrencyhistoryDAO;
import com.anchor.erp.myfuelapi.Domain.Currencyhistory;
import java.lang.Integer;
import org.springframework.stereotype.Repository;

@Repository
public class CurrencyhistoryDAOImpl extends AbstractDAO<Currencyhistory, Integer> implements CurrencyhistoryDAO {
  public CurrencyhistoryDAOImpl() {
    super(Currencyhistory.class);
  }
}
