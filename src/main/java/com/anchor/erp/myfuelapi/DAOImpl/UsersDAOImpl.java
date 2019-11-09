// authored by Chege
package com.anchor.erp.myfuelapi.DAOImpl;

import com.anchor.erp.myfuelapi.DAO.AbstractDAO;
import com.anchor.erp.myfuelapi.DAOHelper.UsersDAO;
import com.anchor.erp.myfuelapi.Domain.Users;
import java.lang.Integer;
import org.springframework.stereotype.Repository;

@Repository
public class UsersDAOImpl extends AbstractDAO<Users, Integer> implements UsersDAO {
  public UsersDAOImpl() {
    super(Users.class);
  }
}
