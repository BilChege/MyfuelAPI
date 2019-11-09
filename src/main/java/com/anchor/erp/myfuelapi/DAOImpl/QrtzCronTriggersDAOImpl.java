// authored by Chege
package com.anchor.erp.myfuelapi.DAOImpl;

import com.anchor.erp.myfuelapi.DAO.AbstractDAO;
import com.anchor.erp.myfuelapi.DAOHelper.QrtzCronTriggersDAO;
import com.anchor.erp.myfuelapi.Domain.QrtzCronTriggers;
import java.lang.Integer;
import org.springframework.stereotype.Repository;

@Repository
public class QrtzCronTriggersDAOImpl extends AbstractDAO<QrtzCronTriggers, Integer> implements QrtzCronTriggersDAO {
  public QrtzCronTriggersDAOImpl() {
    super(QrtzCronTriggers.class);
  }
}
