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
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Bilchege
 */
public abstract class AbstractDAO<T,I extends Serializable> implements GenericDAO<T, I>{
    
    @Autowired
    private SessionFactory sessionFactory;
    private Class<T> persistentClass;

    public AbstractDAO(Class<T> persistentClass) {
        this.persistentClass = persistentClass;
    }

    @Override
    public T save(T t) {
        I i = (I) this.sessionFactory.getCurrentSession().save(t);
        return findById(i);        
    }

    @Override
    public void persist(T t) {
        this.sessionFactory.getCurrentSession().persist(t);
    }

    @Override
    public T merge(T t) {
        Session session =  this.sessionFactory.getCurrentSession();
        session.update(t);
        return t;
    }

    @Override
    public T findById(I i) {
        return this.sessionFactory.getCurrentSession().load(persistentClass, i);
    }

    @Override
    public Collection<T> findAll() {
        return this.sessionFactory.getCurrentSession().createQuery("From "+persistentClass.getSimpleName()).list();
    }

    @Override
    public Collection<T> findByQuery(String s) {
        return this.sessionFactory.getCurrentSession().createQuery(s).list();
    }

    @Override
    public List<T> findbySqlQuery(String s) {
        SQLQuery query = sessionFactory.getCurrentSession().createSQLQuery(s).addEntity(persistentClass);
        return query.list();
    }

    @Override
    public List<T> findByNamedQuery(String name, Object... params) {
        SQLQuery query = sessionFactory.getCurrentSession().createSQLQuery(name).addEntity(persistentClass);
        for (int i = 0; i < params.length; i++) {
            Object param = params[i];
            query.setParameter(i, param);
        }
        return query.list();
    }

    @Override
    public List<T> findByNamedQueryAndNamedParams(String name, Map<String, ? extends Object> params) {
        SQLQuery query = sessionFactory.getCurrentSession().createSQLQuery(name).addEntity(persistentClass);
        for (Map.Entry<String, ? extends Object> entry : params.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            query.setParameter(key, value);
        }
        return query.list();
    }

    @Override
    public List<T> findBySqlQueryWithParams(String q, Object... params) {
        SQLQuery query = sessionFactory.getCurrentSession().createSQLQuery(q);
        for (int i = 0; i < params.length; i++) {
            Object param = params[i];
            query.setParameter(i, param);
        }
        return query.list();
    }

    @Override
    public List<T> findBySqlQueryWithNamedParams(String q, Map<String, ? extends Object> params) {
        SQLQuery query = sessionFactory.getCurrentSession().createSQLQuery(q).addEntity(persistentClass);
        for (Map.Entry<String, ? extends Object> entry : params.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            query.setParameter(key, value);
        }
        return query.list();
    }        
}

