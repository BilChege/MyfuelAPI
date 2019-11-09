// authored by Chege
package com.anchor.erp.myfuelapi.DAOImpl;

import com.anchor.erp.myfuelapi.DAO.AbstractDAO;
import com.anchor.erp.myfuelapi.DAOHelper.QrtzLocksDAO;
import com.anchor.erp.myfuelapi.Domain.QrtzLocks;
import java.lang.Integer;
import org.springframework.stereotype.Repository;

@Repository
public class QrtzLocksDAOImpl extends AbstractDAO<QrtzLocks, Integer> implements QrtzLocksDAO {
  public QrtzLocksDAOImpl() {
    super(QrtzLocks.class);
  }
}
