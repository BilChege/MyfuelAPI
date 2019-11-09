// authored by Chege
package com.anchor.erp.myfuelapi.DAOImpl;

import com.anchor.erp.myfuelapi.DAO.AbstractDAO;
import com.anchor.erp.myfuelapi.DAOHelper.CostcenterDAO;
import com.anchor.erp.myfuelapi.Domain.Costcenter;
import java.lang.Integer;
import org.springframework.stereotype.Repository;

@Repository
public class CostcenterDAOImpl extends AbstractDAO<Costcenter, Integer> implements CostcenterDAO {
  public CostcenterDAOImpl() {
    super(Costcenter.class);
  }
}
