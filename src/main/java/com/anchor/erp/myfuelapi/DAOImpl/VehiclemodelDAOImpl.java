// authored by Chege
package com.anchor.erp.myfuelapi.DAOImpl;

import com.anchor.erp.myfuelapi.DAO.AbstractDAO;
import com.anchor.erp.myfuelapi.DAOHelper.VehiclemodelDAO;
import com.anchor.erp.myfuelapi.Domain.Vehiclemodel;
import java.lang.Integer;
import org.springframework.stereotype.Repository;

@Repository
public class VehiclemodelDAOImpl extends AbstractDAO<Vehiclemodel, Integer> implements VehiclemodelDAO {
  public VehiclemodelDAOImpl() {
    super(Vehiclemodel.class);
  }
}
