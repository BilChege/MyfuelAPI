// authored by Chege
package com.anchor.erp.myfuelapi.DAOImpl;

import com.anchor.erp.myfuelapi.DAO.AbstractDAO;
import com.anchor.erp.myfuelapi.DAOHelper.ReportsPermissionsmapDAO;
import com.anchor.erp.myfuelapi.Domain.ReportsPermissionsmap;
import java.lang.Integer;
import org.springframework.stereotype.Repository;

@Repository
public class ReportsPermissionsmapDAOImpl extends AbstractDAO<ReportsPermissionsmap, Integer> implements ReportsPermissionsmapDAO {
  public ReportsPermissionsmapDAOImpl() {
    super(ReportsPermissionsmap.class);
  }
}
