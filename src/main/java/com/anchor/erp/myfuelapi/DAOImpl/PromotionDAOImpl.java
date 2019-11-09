// authored by Chege
package com.anchor.erp.myfuelapi.DAOImpl;

import com.anchor.erp.myfuelapi.DAO.AbstractDAO;
import com.anchor.erp.myfuelapi.DAOHelper.PromotionDAO;
import com.anchor.erp.myfuelapi.Domain.Promotion;
import java.lang.Integer;
import org.springframework.stereotype.Repository;

@Repository
public class PromotionDAOImpl extends AbstractDAO<Promotion, Integer> implements PromotionDAO {
  public PromotionDAOImpl() {
    super(Promotion.class);
  }
}
