// authored by Chege
package com.anchor.erp.myfuelapi.DAOImpl;

import com.anchor.erp.myfuelapi.DAO.AbstractDAO;
import com.anchor.erp.myfuelapi.DAOHelper.QrtzJobDetailsDAO;
import com.anchor.erp.myfuelapi.Domain.QrtzJobDetails;
import java.lang.Integer;
import org.springframework.stereotype.Repository;

@Repository
public class QrtzJobDetailsDAOImpl extends AbstractDAO<QrtzJobDetails, Integer> implements QrtzJobDetailsDAO {
  public QrtzJobDetailsDAOImpl() {
    super(QrtzJobDetails.class);
  }
}
