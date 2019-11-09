// authored by Chege
package com.anchor.erp.myfuelapi.DAOImpl;

import com.anchor.erp.myfuelapi.DAO.AbstractDAO;
import com.anchor.erp.myfuelapi.DAOHelper.QrtzTriggersIdDAO;
import com.anchor.erp.myfuelapi.Domain.QrtzTriggersId;
import java.lang.Integer;
import org.springframework.stereotype.Repository;

@Repository
public class QrtzTriggersIdDAOImpl extends AbstractDAO<QrtzTriggersId, Integer> implements QrtzTriggersIdDAO {
  public QrtzTriggersIdDAOImpl() {
    super(QrtzTriggersId.class);
  }
}
