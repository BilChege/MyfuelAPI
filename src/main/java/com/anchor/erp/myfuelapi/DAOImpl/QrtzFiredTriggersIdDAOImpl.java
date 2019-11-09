// authored by Chege
package com.anchor.erp.myfuelapi.DAOImpl;

import com.anchor.erp.myfuelapi.DAO.AbstractDAO;
import com.anchor.erp.myfuelapi.DAOHelper.QrtzFiredTriggersIdDAO;
import com.anchor.erp.myfuelapi.Domain.QrtzFiredTriggersId;
import java.lang.Integer;
import org.springframework.stereotype.Repository;

@Repository
public class QrtzFiredTriggersIdDAOImpl extends AbstractDAO<QrtzFiredTriggersId, Integer> implements QrtzFiredTriggersIdDAO {
  public QrtzFiredTriggersIdDAOImpl() {
    super(QrtzFiredTriggersId.class);
  }
}
