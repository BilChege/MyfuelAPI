// authored by Chege
package com.anchor.erp.myfuelapi.DAOImpl;

import com.anchor.erp.myfuelapi.DAO.AbstractDAO;
import com.anchor.erp.myfuelapi.DAOHelper.WfActivityDAO;
import com.anchor.erp.myfuelapi.Domain.WfActivity;
import java.lang.Integer;
import org.springframework.stereotype.Repository;

@Repository
public class WfActivityDAOImpl extends AbstractDAO<WfActivity, Integer> implements WfActivityDAO {
  public WfActivityDAOImpl() {
    super(WfActivity.class);
  }
}
