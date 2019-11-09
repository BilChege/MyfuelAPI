// authored by Chege
package com.anchor.erp.myfuelapi.DAOImpl;

import com.anchor.erp.myfuelapi.DAO.AbstractDAO;
import com.anchor.erp.myfuelapi.DAOHelper.UserRedemptionsDAO;
import com.anchor.erp.myfuelapi.Domain.UserRedemptions;
import java.lang.Integer;
import org.springframework.stereotype.Repository;

@Repository
public class UserRedemptionsDAOImpl extends AbstractDAO<UserRedemptions, Integer> implements UserRedemptionsDAO {
  public UserRedemptionsDAOImpl() {
    super(UserRedemptions.class);
  }
}
