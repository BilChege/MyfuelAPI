// authored by Chege
package com.anchor.erp.myfuelapi.DAOImpl;

import com.anchor.erp.myfuelapi.DAO.AbstractDAO;
import com.anchor.erp.myfuelapi.DAOHelper.QrtzPausedTriggerGrpsIdDAO;
import com.anchor.erp.myfuelapi.Domain.QrtzPausedTriggerGrpsId;
import java.lang.Integer;
import org.springframework.stereotype.Repository;

@Repository
public class QrtzPausedTriggerGrpsIdDAOImpl extends AbstractDAO<QrtzPausedTriggerGrpsId, Integer> implements QrtzPausedTriggerGrpsIdDAO {
  public QrtzPausedTriggerGrpsIdDAOImpl() {
    super(QrtzPausedTriggerGrpsId.class);
  }
}
