// authored by Chege
package com.anchor.erp.myfuelapi.DAOImpl;

import com.anchor.erp.myfuelapi.DAO.AbstractDAO;
import com.anchor.erp.myfuelapi.DAOHelper.WfStatetypeDAO;
import com.anchor.erp.myfuelapi.Domain.WfStatetype;
import java.lang.Integer;
import org.springframework.stereotype.Repository;

@Repository
public class WfStatetypeDAOImpl extends AbstractDAO<WfStatetype, Integer> implements WfStatetypeDAO {
  public WfStatetypeDAOImpl() {
    super(WfStatetype.class);
  }
}
