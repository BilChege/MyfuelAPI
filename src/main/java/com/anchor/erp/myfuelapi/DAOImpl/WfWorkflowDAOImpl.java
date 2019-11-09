// authored by Chege
package com.anchor.erp.myfuelapi.DAOImpl;

import com.anchor.erp.myfuelapi.DAO.AbstractDAO;
import com.anchor.erp.myfuelapi.DAOHelper.WfWorkflowDAO;
import com.anchor.erp.myfuelapi.Domain.WfWorkflow;
import java.lang.Integer;
import org.springframework.stereotype.Repository;

@Repository
public class WfWorkflowDAOImpl extends AbstractDAO<WfWorkflow, Integer> implements WfWorkflowDAO {
  public WfWorkflowDAOImpl() {
    super(WfWorkflow.class);
  }
}
