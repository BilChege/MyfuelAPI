// authored by Chege
package com.anchor.erp.myfuelapi.DAOImpl;

import com.anchor.erp.myfuelapi.DAO.AbstractDAO;
import com.anchor.erp.myfuelapi.DAOHelper.WfRequestnoteDAO;
import com.anchor.erp.myfuelapi.Domain.WfRequestnote;
import java.lang.Integer;
import org.springframework.stereotype.Repository;

@Repository
public class WfRequestnoteDAOImpl extends AbstractDAO<WfRequestnote, Integer> implements WfRequestnoteDAO {
  public WfRequestnoteDAOImpl() {
    super(WfRequestnote.class);
  }
}
