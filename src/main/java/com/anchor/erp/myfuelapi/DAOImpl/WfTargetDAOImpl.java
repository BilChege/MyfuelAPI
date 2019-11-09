// authored by Chege
package com.anchor.erp.myfuelapi.DAOImpl;

import com.anchor.erp.myfuelapi.DAO.AbstractDAO;
import com.anchor.erp.myfuelapi.DAOHelper.WfTargetDAO;
import com.anchor.erp.myfuelapi.Domain.WfTarget;
import java.lang.Integer;
import org.springframework.stereotype.Repository;

@Repository
public class WfTargetDAOImpl extends AbstractDAO<WfTarget, Integer> implements WfTargetDAO {
  public WfTargetDAOImpl() {
    super(WfTarget.class);
  }
}
