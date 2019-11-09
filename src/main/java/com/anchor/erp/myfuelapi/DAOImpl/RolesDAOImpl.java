// authored by Chege
package com.anchor.erp.myfuelapi.DAOImpl;

import com.anchor.erp.myfuelapi.DAO.AbstractDAO;
import com.anchor.erp.myfuelapi.DAOHelper.RolesDAO;
import com.anchor.erp.myfuelapi.Domain.Roles;
import org.springframework.stereotype.Repository;

@Repository
public class RolesDAOImpl extends AbstractDAO<Roles, Integer> implements RolesDAO {
  public RolesDAOImpl() {
    super(Roles.class);
  }
}
