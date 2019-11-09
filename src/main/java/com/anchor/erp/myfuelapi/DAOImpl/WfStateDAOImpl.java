// authored by Chege
package com.anchor.erp.myfuelapi.DAOImpl;

import com.anchor.erp.myfuelapi.DAO.AbstractDAO;
import com.anchor.erp.myfuelapi.DAOHelper.WfStateDAO;
import com.anchor.erp.myfuelapi.Domain.WfState;
import java.lang.Integer;
import org.springframework.stereotype.Repository;

@Repository
public class WfStateDAOImpl extends AbstractDAO<WfState, Integer> implements WfStateDAO {
  public WfStateDAOImpl() {
    super(WfState.class);
  }
}
