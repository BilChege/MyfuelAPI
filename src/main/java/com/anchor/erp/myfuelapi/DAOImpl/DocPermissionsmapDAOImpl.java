// authored by Chege
package com.anchor.erp.myfuelapi.DAOImpl;

import com.anchor.erp.myfuelapi.DAO.AbstractDAO;
import com.anchor.erp.myfuelapi.DAOHelper.DocPermissionsmapDAO;
import com.anchor.erp.myfuelapi.Domain.DocPermissionsmap;
import java.lang.Integer;
import org.springframework.stereotype.Repository;

@Repository
public class DocPermissionsmapDAOImpl extends AbstractDAO<DocPermissionsmap, Integer> implements DocPermissionsmapDAO {
  public DocPermissionsmapDAOImpl() {
    super(DocPermissionsmap.class);
  }
}
