// authored by Chege
package com.anchor.erp.myfuelapi.DAOImpl;

import com.anchor.erp.myfuelapi.DAO.AbstractDAO;
import com.anchor.erp.myfuelapi.DAOHelper.VehiclemakeDAO;
import com.anchor.erp.myfuelapi.Domain.Vehiclemake;
import java.lang.Integer;
import org.springframework.stereotype.Repository;

@Repository
public class VehiclemakeDAOImpl extends AbstractDAO<Vehiclemake, Integer> implements VehiclemakeDAO {
  public VehiclemakeDAOImpl() {
    super(Vehiclemake.class);
  }
}
