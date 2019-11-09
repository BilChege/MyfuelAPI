// authored by Chege
package com.anchor.erp.myfuelapi.DAOImpl;

import com.anchor.erp.myfuelapi.DAO.AbstractDAO;
import com.anchor.erp.myfuelapi.DAOHelper.QrtzSchedulerStateDAO;
import com.anchor.erp.myfuelapi.Domain.QrtzSchedulerState;
import java.lang.Integer;
import org.springframework.stereotype.Repository;

@Repository
public class QrtzSchedulerStateDAOImpl extends AbstractDAO<QrtzSchedulerState, Integer> implements QrtzSchedulerStateDAO {
  public QrtzSchedulerStateDAOImpl() {
    super(QrtzSchedulerState.class);
  }
}
