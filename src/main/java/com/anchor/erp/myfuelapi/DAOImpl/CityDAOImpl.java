// authored by Chege
package com.anchor.erp.myfuelapi.DAOImpl;

import com.anchor.erp.myfuelapi.DAO.AbstractDAO;
import com.anchor.erp.myfuelapi.DAOHelper.CityDAO;
import com.anchor.erp.myfuelapi.Domain.City;
import java.lang.Integer;
import org.springframework.stereotype.Repository;

@Repository
public class CityDAOImpl extends AbstractDAO<City, Integer> implements CityDAO {
  public CityDAOImpl() {
    super(City.class);
  }
}
