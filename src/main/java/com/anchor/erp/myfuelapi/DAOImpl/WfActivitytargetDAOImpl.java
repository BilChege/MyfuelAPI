// authored by Chege
package com.anchor.erp.myfuelapi.DAOImpl;

import com.anchor.erp.myfuelapi.DAO.AbstractDAO;
import com.anchor.erp.myfuelapi.DAOHelper.WfActivitytargetDAO;
import com.anchor.erp.myfuelapi.Domain.WfActivitytarget;
import java.lang.Integer;
import org.springframework.stereotype.Repository;

@Repository
public class WfActivitytargetDAOImpl extends AbstractDAO<WfActivitytarget, Integer> implements WfActivitytargetDAO {
  public WfActivitytargetDAOImpl() {
    super(WfActivitytarget.class);
  }
}
