// authored by Chege
package com.anchor.erp.myfuelapi.DAOImpl;

import com.anchor.erp.myfuelapi.DAO.AbstractDAO;
import com.anchor.erp.myfuelapi.DAOHelper.EmailnotificationDAO;
import com.anchor.erp.myfuelapi.Domain.Emailnotification;
import java.lang.Integer;
import org.springframework.stereotype.Repository;

@Repository
public class EmailnotificationDAOImpl extends AbstractDAO<Emailnotification, Integer> implements EmailnotificationDAO {
  public EmailnotificationDAOImpl() {
    super(Emailnotification.class);
  }
}
