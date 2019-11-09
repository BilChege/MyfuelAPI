// authored by Chege
package com.anchor.erp.myfuelapi.DAOImpl;

import com.anchor.erp.myfuelapi.DAO.AbstractDAO;
import com.anchor.erp.myfuelapi.DAOHelper.DatabasechangeloglockDAO;
import com.anchor.erp.myfuelapi.Domain.Databasechangeloglock;
import java.lang.Integer;
import org.springframework.stereotype.Repository;

@Repository
public class DatabasechangeloglockDAOImpl extends AbstractDAO<Databasechangeloglock, Integer> implements DatabasechangeloglockDAO {
  public DatabasechangeloglockDAOImpl() {
    super(Databasechangeloglock.class);
  }
}
