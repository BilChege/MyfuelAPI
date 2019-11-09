// authored by Chege
package com.anchor.erp.myfuelapi.DAOImpl;

import com.anchor.erp.myfuelapi.DAO.AbstractDAO;
import com.anchor.erp.myfuelapi.DAOHelper.FuelUsageDAO;
import com.anchor.erp.myfuelapi.Domain.FuelUsage;
import java.lang.Integer;
import org.springframework.stereotype.Repository;

@Repository
public class FuelUsageDAOImpl extends AbstractDAO<FuelUsage, Integer> implements FuelUsageDAO {
  public FuelUsageDAOImpl() {
    super(FuelUsage.class);
  }
}
