// authored by Chege
package com.anchor.erp.myfuelapi.DAOImpl;

import com.anchor.erp.myfuelapi.DAO.AbstractDAO;
import com.anchor.erp.myfuelapi.DAOHelper.QrtzBlobTriggersDAO;
import com.anchor.erp.myfuelapi.Domain.QrtzBlobTriggers;
import java.lang.Integer;
import org.springframework.stereotype.Repository;

@Repository
public class QrtzBlobTriggersDAOImpl extends AbstractDAO<QrtzBlobTriggers, Integer> implements QrtzBlobTriggersDAO {
  public QrtzBlobTriggersDAOImpl() {
    super(QrtzBlobTriggers.class);
  }
}
