// authored by Chege
package com.anchor.erp.myfuelapi.DAOImpl;

import com.anchor.erp.myfuelapi.DAO.AbstractDAO;
import com.anchor.erp.myfuelapi.DAOHelper.WfStateactivityDAO;
import com.anchor.erp.myfuelapi.Domain.WfStateactivity;
import java.lang.Integer;
import org.springframework.stereotype.Repository;

@Repository
public class WfStateactivityDAOImpl extends AbstractDAO<WfStateactivity, Integer> implements WfStateactivityDAO {
  public WfStateactivityDAOImpl() {
    super(WfStateactivity.class);
  }
}
