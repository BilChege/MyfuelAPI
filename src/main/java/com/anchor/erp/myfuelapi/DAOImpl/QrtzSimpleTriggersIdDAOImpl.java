// authored by Chege
package com.anchor.erp.myfuelapi.DAOImpl;

import com.anchor.erp.myfuelapi.DAO.AbstractDAO;
import com.anchor.erp.myfuelapi.DAOHelper.QrtzSimpleTriggersIdDAO;
import com.anchor.erp.myfuelapi.Domain.QrtzSimpleTriggersId;
import java.lang.Integer;
import org.springframework.stereotype.Repository;

@Repository
public class QrtzSimpleTriggersIdDAOImpl extends AbstractDAO<QrtzSimpleTriggersId, Integer> implements QrtzSimpleTriggersIdDAO {
  public QrtzSimpleTriggersIdDAOImpl() {
    super(QrtzSimpleTriggersId.class);
  }
}
