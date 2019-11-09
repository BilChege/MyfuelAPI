// authored by Chege
package com.anchor.erp.myfuelapi.DAOImpl;

import com.anchor.erp.myfuelapi.DAO.AbstractDAO;
import com.anchor.erp.myfuelapi.DAOHelper.DynamicmenuDAO;
import com.anchor.erp.myfuelapi.Domain.Dynamicmenu;
import java.lang.Integer;
import org.springframework.stereotype.Repository;

@Repository
public class DynamicmenuDAOImpl extends AbstractDAO<Dynamicmenu, Integer> implements DynamicmenuDAO {
  public DynamicmenuDAOImpl() {
    super(Dynamicmenu.class);
  }
}
