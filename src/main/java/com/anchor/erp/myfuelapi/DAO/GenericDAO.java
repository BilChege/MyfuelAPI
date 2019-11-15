/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anchor.erp.myfuelapi.DAO;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.hibernate.criterion.Criterion;

/**
 *
 * @author Bilchege
 * @param <T>
 * @param <I>
 */
public interface GenericDAO<T,I extends Serializable> {
    
    T save(T t);
    
    void persist(T t);
    
    T merge(T t);
    
    T findById(I i);
    
    Collection<T> findAll();
    
    Collection<T> findByQuery(String s);
    
    List<T> findbySqlQuery(String s);
    
    List<T> findBySqlQueryWithParams(String q, Object... params);
    
    List<T> findBySqlQueryWithNamedParams(String q,Map<String,? extends Object> params);
    
    List<T> findByNamedQuery(String name, Object... params);
    
    List<T> findByNamedQueryAndNamedParams(String name,Map<String,? extends Object> params);
    
    List<T> findByCriterion(Criterion... criterion);
    
}
