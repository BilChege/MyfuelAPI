// authored by Chege
package com.anchor.erp.myfuelapi.DAOImpl;

import com.anchor.erp.myfuelapi.DAO.AbstractDAO;
import com.anchor.erp.myfuelapi.DAOHelper.WfRequestfileDAO;
import com.anchor.erp.myfuelapi.Domain.WfRequestfile;
import java.lang.Integer;
import org.springframework.stereotype.Repository;

@Repository
public class WfRequestfileDAOImpl extends AbstractDAO<WfRequestfile, Integer> implements WfRequestfileDAO {
  public WfRequestfileDAOImpl() {
    super(WfRequestfile.class);
  }
}
