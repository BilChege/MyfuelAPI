// authored by Chege
package com.anchor.erp.myfuelapi.DAOImpl;

import com.anchor.erp.myfuelapi.DAO.AbstractDAO;
import com.anchor.erp.myfuelapi.DAOHelper.CountryDAO;
import com.anchor.erp.myfuelapi.Domain.Country;
import java.lang.Integer;
import org.springframework.stereotype.Repository;

@Repository
public class CountryDAOImpl extends AbstractDAO<Country, Integer> implements CountryDAO {
  public CountryDAOImpl() {
    super(Country.class);
  }
}
