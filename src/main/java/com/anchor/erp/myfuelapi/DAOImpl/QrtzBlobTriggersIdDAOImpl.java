// authored by Chege
package com.anchor.erp.myfuelapi.DAOImpl;

import com.anchor.erp.myfuelapi.DAO.AbstractDAO;
import com.anchor.erp.myfuelapi.DAOHelper.QrtzBlobTriggersIdDAO;
import com.anchor.erp.myfuelapi.Domain.QrtzBlobTriggersId;
import java.lang.Integer;
import org.springframework.stereotype.Repository;

@Repository
public class QrtzBlobTriggersIdDAOImpl extends AbstractDAO<QrtzBlobTriggersId, Integer> implements QrtzBlobTriggersIdDAO {
  public QrtzBlobTriggersIdDAOImpl() {
    super(QrtzBlobTriggersId.class);
  }
}
