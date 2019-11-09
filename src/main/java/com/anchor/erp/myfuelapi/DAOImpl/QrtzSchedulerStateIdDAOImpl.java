// authored by Chege
package com.anchor.erp.myfuelapi.DAOImpl;

import com.anchor.erp.myfuelapi.DAO.AbstractDAO;
import com.anchor.erp.myfuelapi.DAOHelper.QrtzSchedulerStateIdDAO;
import com.anchor.erp.myfuelapi.Domain.QrtzSchedulerStateId;
import java.lang.Integer;
import org.springframework.stereotype.Repository;

@Repository
public class QrtzSchedulerStateIdDAOImpl extends AbstractDAO<QrtzSchedulerStateId, Integer> implements QrtzSchedulerStateIdDAO {
  public QrtzSchedulerStateIdDAOImpl() {
    super(QrtzSchedulerStateId.class);
  }
}
