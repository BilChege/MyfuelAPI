// authored by Chege
package com.anchor.erp.myfuelapi.DAOImpl;

import com.anchor.erp.myfuelapi.DAO.AbstractDAO;
import com.anchor.erp.myfuelapi.DAOHelper.VehicletypeDAO;
import com.anchor.erp.myfuelapi.Domain.Vehicletype;
import java.lang.Integer;
import org.springframework.stereotype.Repository;

@Repository
public class VehicletypeDAOImpl extends AbstractDAO<Vehicletype, Integer> implements VehicletypeDAO {
  public VehicletypeDAOImpl() {
    super(Vehicletype.class);
  }
}
