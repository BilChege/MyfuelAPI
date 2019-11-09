// authored by Chege
package com.anchor.erp.myfuelapi.DAOImpl;

import com.anchor.erp.myfuelapi.DAO.AbstractDAO;
import com.anchor.erp.myfuelapi.DAOHelper.WfTransitionactivityDAO;
import com.anchor.erp.myfuelapi.Domain.WfTransitionactivity;
import java.lang.Integer;
import org.springframework.stereotype.Repository;

@Repository
public class WfTransitionactivityDAOImpl extends AbstractDAO<WfTransitionactivity, Integer> implements WfTransitionactivityDAO {
  public WfTransitionactivityDAOImpl() {
    super(WfTransitionactivity.class);
  }
}
