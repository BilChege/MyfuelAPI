// authored by Chege
package com.anchor.erp.myfuelapi.DAOImpl;

import com.anchor.erp.myfuelapi.DAO.AbstractDAO;
import com.anchor.erp.myfuelapi.DAOHelper.WfTransitionDAO;
import com.anchor.erp.myfuelapi.Domain.WfTransition;
import java.lang.Integer;
import org.springframework.stereotype.Repository;

@Repository
public class WfTransitionDAOImpl extends AbstractDAO<WfTransition, Integer> implements WfTransitionDAO {
  public WfTransitionDAOImpl() {
    super(WfTransition.class);
  }
}
