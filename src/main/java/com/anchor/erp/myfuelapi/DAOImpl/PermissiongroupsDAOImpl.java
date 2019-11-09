// authored by Chege
package com.anchor.erp.myfuelapi.DAOImpl;

import com.anchor.erp.myfuelapi.DAO.AbstractDAO;
import com.anchor.erp.myfuelapi.DAOHelper.PermissiongroupsDAO;
import com.anchor.erp.myfuelapi.Domain.Permissiongroups;
import java.lang.Integer;
import org.springframework.stereotype.Repository;

@Repository
public class PermissiongroupsDAOImpl extends AbstractDAO<Permissiongroups, Integer> implements PermissiongroupsDAO {
  public PermissiongroupsDAOImpl() {
    super(Permissiongroups.class);
  }
}
