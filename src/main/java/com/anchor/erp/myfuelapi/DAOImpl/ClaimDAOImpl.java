// authored by Chege
package com.anchor.erp.myfuelapi.DAOImpl;

import com.anchor.erp.myfuelapi.DAO.AbstractDAO;
import com.anchor.erp.myfuelapi.DAOHelper.ClaimDAO;
import com.anchor.erp.myfuelapi.Domain.Claim;
import java.lang.Integer;
import org.springframework.stereotype.Repository;

@Repository
public class ClaimDAOImpl extends AbstractDAO<Claim, Integer> implements ClaimDAO {
  public ClaimDAOImpl() {
    super(Claim.class);
  }
}
