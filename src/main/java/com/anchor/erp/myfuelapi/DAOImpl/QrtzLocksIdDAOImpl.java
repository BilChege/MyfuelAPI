// authored by Chege
package com.anchor.erp.myfuelapi.DAOImpl;

import com.anchor.erp.myfuelapi.DAO.AbstractDAO;
import com.anchor.erp.myfuelapi.DAOHelper.QrtzLocksIdDAO;
import com.anchor.erp.myfuelapi.Domain.QrtzLocksId;
import java.lang.Integer;
import org.springframework.stereotype.Repository;

@Repository
public class QrtzLocksIdDAOImpl extends AbstractDAO<QrtzLocksId, Integer> implements QrtzLocksIdDAO {
  public QrtzLocksIdDAOImpl() {
    super(QrtzLocksId.class);
  }
}
