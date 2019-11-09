// authored by Chege
package com.anchor.erp.myfuelapi.DAOImpl;

import com.anchor.erp.myfuelapi.DAO.AbstractDAO;
import com.anchor.erp.myfuelapi.DAOHelper.QrtzPausedTriggerGrpsDAO;
import com.anchor.erp.myfuelapi.Domain.QrtzPausedTriggerGrps;
import java.lang.Integer;
import org.springframework.stereotype.Repository;

@Repository
public class QrtzPausedTriggerGrpsDAOImpl extends AbstractDAO<QrtzPausedTriggerGrps, Integer> implements QrtzPausedTriggerGrpsDAO {
  public QrtzPausedTriggerGrpsDAOImpl() {
    super(QrtzPausedTriggerGrps.class);
  }
}
