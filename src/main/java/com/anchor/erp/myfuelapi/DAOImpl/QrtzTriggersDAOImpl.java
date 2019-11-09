// authored by Chege
package com.anchor.erp.myfuelapi.DAOImpl;

import com.anchor.erp.myfuelapi.DAO.AbstractDAO;
import com.anchor.erp.myfuelapi.DAOHelper.QrtzTriggersDAO;
import com.anchor.erp.myfuelapi.Domain.QrtzTriggers;
import java.lang.Integer;
import org.springframework.stereotype.Repository;

@Repository
public class QrtzTriggersDAOImpl extends AbstractDAO<QrtzTriggers, Integer> implements QrtzTriggersDAO {
  public QrtzTriggersDAOImpl() {
    super(QrtzTriggers.class);
  }
}
