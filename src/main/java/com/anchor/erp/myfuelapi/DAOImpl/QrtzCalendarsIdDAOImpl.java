// authored by Chege
package com.anchor.erp.myfuelapi.DAOImpl;

import com.anchor.erp.myfuelapi.DAO.AbstractDAO;
import com.anchor.erp.myfuelapi.DAOHelper.QrtzCalendarsIdDAO;
import com.anchor.erp.myfuelapi.Domain.QrtzCalendarsId;
import java.lang.Integer;
import org.springframework.stereotype.Repository;

@Repository
public class QrtzCalendarsIdDAOImpl extends AbstractDAO<QrtzCalendarsId, Integer> implements QrtzCalendarsIdDAO {
  public QrtzCalendarsIdDAOImpl() {
    super(QrtzCalendarsId.class);
  }
}
