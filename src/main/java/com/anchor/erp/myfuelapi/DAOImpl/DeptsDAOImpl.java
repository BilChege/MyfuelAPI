// authored by Chege
package com.anchor.erp.myfuelapi.DAOImpl;

import com.anchor.erp.myfuelapi.DAO.AbstractDAO;
import com.anchor.erp.myfuelapi.DAOHelper.DeptsDAO;
import com.anchor.erp.myfuelapi.Domain.Depts;
import java.lang.Integer;
import org.springframework.stereotype.Repository;

@Repository
public class DeptsDAOImpl extends AbstractDAO<Depts, Integer> implements DeptsDAO {
  public DeptsDAOImpl() {
    super(Depts.class);
  }
}
