// authored by Chege
package com.anchor.erp.myfuelapi.DAOImpl;

import com.anchor.erp.myfuelapi.DAO.AbstractDAO;
import com.anchor.erp.myfuelapi.DAOHelper.DivisionDAO;
import com.anchor.erp.myfuelapi.Domain.Division;
import java.lang.Integer;
import org.springframework.stereotype.Repository;

@Repository
public class DivisionDAOImpl extends AbstractDAO<Division, Integer> implements DivisionDAO {
  public DivisionDAOImpl() {
    super(Division.class);
  }
}
