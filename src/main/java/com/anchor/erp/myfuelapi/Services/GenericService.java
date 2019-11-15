/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anchor.erp.myfuelapi.Services;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.hibernate.criterion.Criterion;

/**
 *
 * @author Bilchege
 */
public interface GenericService <T>{
    
    T save(T t);
    
    void persist(T t);
    
    T findbyId(int id);
    
    Collection<T> findAll ();
    
    Collection<T> findByQuery(String q);
    
    T merge(T t);
    
    List<T> findbySqlQuery(String s);
    
    List<T> findBySqlQueryWithParams(String q, Object... params);
    
    List<T> findBySqlQueryWithNamedParams(String q,Map<String,? extends Object> params);
    
    List<T> findByNamedQuery(String name, Object... params);
    
    List<T> findByNamedQueryAndNamedParams(String name,Map<String,? extends Object> params);
    
    List<T> findByCriterion(Criterion... criterion);

}
