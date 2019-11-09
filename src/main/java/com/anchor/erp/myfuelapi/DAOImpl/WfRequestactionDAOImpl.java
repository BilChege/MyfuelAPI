// authored by Chege
package com.anchor.erp.myfuelapi.DAOImpl;

import com.anchor.erp.myfuelapi.DAO.AbstractDAO;
import com.anchor.erp.myfuelapi.DAOHelper.WfRequestactionDAO;
import com.anchor.erp.myfuelapi.Domain.WfRequestaction;
import java.lang.Integer;
import org.springframework.stereotype.Repository;

@Repository
public class WfRequestactionDAOImpl extends AbstractDAO<WfRequestaction, Integer> implements WfRequestactionDAO {
  public WfRequestactionDAOImpl() {
    super(WfRequestaction.class);
  }
}
