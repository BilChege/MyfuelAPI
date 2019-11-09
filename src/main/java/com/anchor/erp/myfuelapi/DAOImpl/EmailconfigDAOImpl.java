// authored by Chege
package com.anchor.erp.myfuelapi.DAOImpl;

import com.anchor.erp.myfuelapi.DAO.AbstractDAO;
import com.anchor.erp.myfuelapi.DAOHelper.EmailconfigDAO;
import com.anchor.erp.myfuelapi.Domain.Emailconfig;
import java.lang.Integer;
import org.springframework.stereotype.Repository;

@Repository
public class EmailconfigDAOImpl extends AbstractDAO<Emailconfig, Integer> implements EmailconfigDAO {
  public EmailconfigDAOImpl() {
    super(Emailconfig.class);
  }
}
