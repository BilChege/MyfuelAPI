// authored by Chege
package com.anchor.erp.myfuelapi.DAOImpl;

import com.anchor.erp.myfuelapi.DAO.AbstractDAO;
import com.anchor.erp.myfuelapi.DAOHelper.AudittrailDAO;
import com.anchor.erp.myfuelapi.Domain.Audittrail;
import java.lang.Integer;
import org.springframework.stereotype.Repository;

@Repository
public class AudittrailDAOImpl extends AbstractDAO<Audittrail, Integer> implements AudittrailDAO {
  public AudittrailDAOImpl() {
    super(Audittrail.class);
  }
}
