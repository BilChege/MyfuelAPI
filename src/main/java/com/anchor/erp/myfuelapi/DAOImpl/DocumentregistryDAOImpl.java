// authored by Chege
package com.anchor.erp.myfuelapi.DAOImpl;

import com.anchor.erp.myfuelapi.DAO.AbstractDAO;
import com.anchor.erp.myfuelapi.DAOHelper.DocumentregistryDAO;
import com.anchor.erp.myfuelapi.Domain.Documentregistry;
import java.lang.Integer;
import org.springframework.stereotype.Repository;

@Repository
public class DocumentregistryDAOImpl extends AbstractDAO<Documentregistry, Integer> implements DocumentregistryDAO {
  public DocumentregistryDAOImpl() {
    super(Documentregistry.class);
  }
}
