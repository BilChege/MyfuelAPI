// authored by Chege
package com.anchor.erp.myfuelapi.DAOImpl;

import com.anchor.erp.myfuelapi.DAO.AbstractDAO;
import com.anchor.erp.myfuelapi.DAOHelper.QrtzFiredTriggersDAO;
import com.anchor.erp.myfuelapi.Domain.QrtzFiredTriggers;
import java.lang.Integer;
import org.springframework.stereotype.Repository;

@Repository
public class QrtzFiredTriggersDAOImpl extends AbstractDAO<QrtzFiredTriggers, Integer> implements QrtzFiredTriggersDAO {
  public QrtzFiredTriggersDAOImpl() {
    super(QrtzFiredTriggers.class);
  }
}
