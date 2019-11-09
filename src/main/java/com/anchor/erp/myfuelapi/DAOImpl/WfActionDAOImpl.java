// authored by Chege
package com.anchor.erp.myfuelapi.DAOImpl;

import com.anchor.erp.myfuelapi.DAO.AbstractDAO;
import com.anchor.erp.myfuelapi.DAOHelper.WfActionDAO;
import com.anchor.erp.myfuelapi.Domain.WfAction;
import java.lang.Integer;
import org.springframework.stereotype.Repository;

@Repository
public class WfActionDAOImpl extends AbstractDAO<WfAction, Integer> implements WfActionDAO {
  public WfActionDAOImpl() {
    super(WfAction.class);
  }
}
