// authored by Chege
package com.anchor.erp.myfuelapi.DAOImpl;

import com.anchor.erp.myfuelapi.DAO.AbstractDAO;
import com.anchor.erp.myfuelapi.DAOHelper.QrtzCronTriggersIdDAO;
import com.anchor.erp.myfuelapi.Domain.QrtzCronTriggersId;
import java.lang.Integer;
import org.springframework.stereotype.Repository;

@Repository
public class QrtzCronTriggersIdDAOImpl extends AbstractDAO<QrtzCronTriggersId, Integer> implements QrtzCronTriggersIdDAO {
  public QrtzCronTriggersIdDAOImpl() {
    super(QrtzCronTriggersId.class);
  }
}
