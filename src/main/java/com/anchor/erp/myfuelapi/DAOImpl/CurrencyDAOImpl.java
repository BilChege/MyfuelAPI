// authored by Chege
package com.anchor.erp.myfuelapi.DAOImpl;

import com.anchor.erp.myfuelapi.DAO.AbstractDAO;
import com.anchor.erp.myfuelapi.DAOHelper.CurrencyDAO;
import com.anchor.erp.myfuelapi.Domain.Currency;
import java.lang.Integer;
import org.springframework.stereotype.Repository;

@Repository
public class CurrencyDAOImpl extends AbstractDAO<Currency, Integer> implements CurrencyDAO {
  public CurrencyDAOImpl() {
    super(Currency.class);
  }
}
