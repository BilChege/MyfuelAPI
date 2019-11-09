// authored by Chege
package com.anchor.erp.myfuelapi.DAOImpl;

import com.anchor.erp.myfuelapi.DAO.AbstractDAO;
import com.anchor.erp.myfuelapi.DAOHelper.TablemodelDAO;
import com.anchor.erp.myfuelapi.Domain.Tablemodel;
import java.lang.Integer;
import org.springframework.stereotype.Repository;

@Repository
public class TablemodelDAOImpl extends AbstractDAO<Tablemodel, Integer> implements TablemodelDAO {
  public TablemodelDAOImpl() {
    super(Tablemodel.class);
  }
}
