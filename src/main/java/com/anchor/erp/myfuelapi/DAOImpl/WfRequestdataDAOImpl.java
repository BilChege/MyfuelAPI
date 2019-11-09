// authored by Chege
package com.anchor.erp.myfuelapi.DAOImpl;

import com.anchor.erp.myfuelapi.DAO.AbstractDAO;
import com.anchor.erp.myfuelapi.DAOHelper.WfRequestdataDAO;
import com.anchor.erp.myfuelapi.Domain.WfRequestdata;
import java.lang.Integer;
import org.springframework.stereotype.Repository;

@Repository
public class WfRequestdataDAOImpl extends AbstractDAO<WfRequestdata, Integer> implements WfRequestdataDAO {
  public WfRequestdataDAOImpl() {
    super(WfRequestdata.class);
  }
}
