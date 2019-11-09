// authored by Chege
package com.anchor.erp.myfuelapi.DAOImpl;

import com.anchor.erp.myfuelapi.DAO.AbstractDAO;
import com.anchor.erp.myfuelapi.DAOHelper.QrtzSimpropTriggersDAO;
import com.anchor.erp.myfuelapi.Domain.QrtzSimpropTriggers;
import java.lang.Integer;
import org.springframework.stereotype.Repository;

@Repository
public class QrtzSimpropTriggersDAOImpl extends AbstractDAO<QrtzSimpropTriggers, Integer> implements QrtzSimpropTriggersDAO {
  public QrtzSimpropTriggersDAOImpl() {
    super(QrtzSimpropTriggers.class);
  }
}
