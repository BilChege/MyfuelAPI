// authored by Chege
package com.anchor.erp.myfuelapi.DAOImpl;

import com.anchor.erp.myfuelapi.DAO.AbstractDAO;
import com.anchor.erp.myfuelapi.DAOHelper.QrtzCalendarsDAO;
import com.anchor.erp.myfuelapi.Domain.QrtzCalendars;
import java.lang.Integer;
import org.springframework.stereotype.Repository;

@Repository
public class QrtzCalendarsDAOImpl extends AbstractDAO<QrtzCalendars, Integer> implements QrtzCalendarsDAO {
  public QrtzCalendarsDAOImpl() {
    super(QrtzCalendars.class);
  }
}
