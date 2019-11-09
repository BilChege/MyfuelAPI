// authored by Chege
package com.anchor.erp.myfuelapi.DAOImpl;

import com.anchor.erp.myfuelapi.DAO.AbstractDAO;
import com.anchor.erp.myfuelapi.DAOHelper.QrtzSimpropTriggersIdDAO;
import com.anchor.erp.myfuelapi.Domain.QrtzSimpropTriggersId;
import java.lang.Integer;
import org.springframework.stereotype.Repository;

@Repository
public class QrtzSimpropTriggersIdDAOImpl extends AbstractDAO<QrtzSimpropTriggersId, Integer> implements QrtzSimpropTriggersIdDAO {
  public QrtzSimpropTriggersIdDAOImpl() {
    super(QrtzSimpropTriggersId.class);
  }
}
