// authored by Chege
package com.anchor.erp.myfuelapi.DAOImpl;

import com.anchor.erp.myfuelapi.DAO.AbstractDAO;
import com.anchor.erp.myfuelapi.DAOHelper.WfWorkflowadminDAO;
import com.anchor.erp.myfuelapi.Domain.WfWorkflowadmin;
import java.lang.Integer;
import org.springframework.stereotype.Repository;

@Repository
public class WfWorkflowadminDAOImpl extends AbstractDAO<WfWorkflowadmin, Integer> implements WfWorkflowadminDAO {
  public WfWorkflowadminDAOImpl() {
    super(WfWorkflowadmin.class);
  }
}
