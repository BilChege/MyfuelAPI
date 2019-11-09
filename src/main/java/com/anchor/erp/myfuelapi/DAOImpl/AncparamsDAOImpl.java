// authored by Chege
package com.anchor.erp.myfuelapi.DAOImpl;

import com.anchor.erp.myfuelapi.DAO.AbstractDAO;
import com.anchor.erp.myfuelapi.DAOHelper.AncparamsDAO;
import com.anchor.erp.myfuelapi.Domain.Ancparams;
import java.lang.Integer;
import org.springframework.stereotype.Repository;

@Repository
public class AncparamsDAOImpl extends AbstractDAO<Ancparams, Integer> implements AncparamsDAO {
  public AncparamsDAOImpl() {
    super(Ancparams.class);
  }
}
