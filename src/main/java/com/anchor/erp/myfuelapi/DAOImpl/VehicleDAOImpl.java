// authored by Chege
package com.anchor.erp.myfuelapi.DAOImpl;

import com.anchor.erp.myfuelapi.DAO.AbstractDAO;
import com.anchor.erp.myfuelapi.DAOHelper.VehicleDAO;
import com.anchor.erp.myfuelapi.Domain.Vehicle;
import java.lang.Integer;
import org.springframework.stereotype.Repository;

@Repository
public class VehicleDAOImpl extends AbstractDAO<Vehicle, Integer> implements VehicleDAO {
  public VehicleDAOImpl() {
    super(Vehicle.class);
  }
}
