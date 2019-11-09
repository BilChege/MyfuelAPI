// authored by Chege
package com.anchor.erp.myfuelapi.DAOImpl;

import com.anchor.erp.myfuelapi.DAO.AbstractDAO;
import com.anchor.erp.myfuelapi.DAOHelper.CountyDAO;
import com.anchor.erp.myfuelapi.Domain.County;
import java.lang.Integer;
import org.springframework.stereotype.Repository;

@Repository
public class CountyDAOImpl extends AbstractDAO<County, Integer> implements CountyDAO {
  public CountyDAOImpl() {
    super(County.class);
  }
}
