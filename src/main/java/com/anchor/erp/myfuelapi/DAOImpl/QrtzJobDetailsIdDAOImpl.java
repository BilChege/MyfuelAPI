// authored by Chege
package com.anchor.erp.myfuelapi.DAOImpl;

import com.anchor.erp.myfuelapi.DAO.AbstractDAO;
import com.anchor.erp.myfuelapi.DAOHelper.QrtzJobDetailsIdDAO;
import com.anchor.erp.myfuelapi.Domain.QrtzJobDetailsId;
import java.lang.Integer;
import org.springframework.stereotype.Repository;

@Repository
public class QrtzJobDetailsIdDAOImpl extends AbstractDAO<QrtzJobDetailsId, Integer> implements QrtzJobDetailsIdDAO {
  public QrtzJobDetailsIdDAOImpl() {
    super(QrtzJobDetailsId.class);
  }
}
