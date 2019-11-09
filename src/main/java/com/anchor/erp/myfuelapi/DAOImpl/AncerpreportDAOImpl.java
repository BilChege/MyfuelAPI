// authored by Chege
package com.anchor.erp.myfuelapi.DAOImpl;

import com.anchor.erp.myfuelapi.DAO.AbstractDAO;
import com.anchor.erp.myfuelapi.DAOHelper.AncerpreportDAO;
import com.anchor.erp.myfuelapi.Domain.Ancerpreport;
import java.lang.Integer;
import org.springframework.stereotype.Repository;

@Repository
public class AncerpreportDAOImpl extends AbstractDAO<Ancerpreport, Integer> implements AncerpreportDAO {
  public AncerpreportDAOImpl() {
    super(Ancerpreport.class);
  }
}
