// authored by Chege
package com.anchor.erp.myfuelapi.DAOImpl;

import com.anchor.erp.myfuelapi.DAO.AbstractDAO;
import com.anchor.erp.myfuelapi.DAOHelper.CompanydetailsDAO;
import com.anchor.erp.myfuelapi.Domain.Companydetails;
import java.lang.Integer;
import org.springframework.stereotype.Repository;

@Repository
public class CompanydetailsDAOImpl extends AbstractDAO<Companydetails, Integer> implements CompanydetailsDAO {
  public CompanydetailsDAOImpl() {
    super(Companydetails.class);
  }
}
