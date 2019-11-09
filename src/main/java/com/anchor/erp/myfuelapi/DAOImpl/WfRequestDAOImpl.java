// authored by Chege
package com.anchor.erp.myfuelapi.DAOImpl;

import com.anchor.erp.myfuelapi.DAO.AbstractDAO;
import com.anchor.erp.myfuelapi.DAOHelper.WfRequestDAO;
import com.anchor.erp.myfuelapi.Domain.WfRequest;
import java.lang.Integer;
import org.springframework.stereotype.Repository;

@Repository
public class WfRequestDAOImpl extends AbstractDAO<WfRequest, Integer> implements WfRequestDAO {
  public WfRequestDAOImpl() {
    super(WfRequest.class);
  }
}
