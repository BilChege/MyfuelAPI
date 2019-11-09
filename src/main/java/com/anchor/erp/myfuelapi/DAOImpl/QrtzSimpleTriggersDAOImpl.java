// authored by Chege
package com.anchor.erp.myfuelapi.DAOImpl;

import com.anchor.erp.myfuelapi.DAO.AbstractDAO;
import com.anchor.erp.myfuelapi.DAOHelper.QrtzSimpleTriggersDAO;
import com.anchor.erp.myfuelapi.Domain.QrtzSimpleTriggers;
import java.lang.Integer;
import org.springframework.stereotype.Repository;

@Repository
public class QrtzSimpleTriggersDAOImpl extends AbstractDAO<QrtzSimpleTriggers, Integer> implements QrtzSimpleTriggersDAO {
  public QrtzSimpleTriggersDAOImpl() {
    super(QrtzSimpleTriggers.class);
  }
}
