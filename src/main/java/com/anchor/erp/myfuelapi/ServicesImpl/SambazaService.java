/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anchor.erp.myfuelapi.ServicesImpl;

import com.anchor.erp.myfuelapi.DAOHelper.SambazaDAO;
import com.anchor.erp.myfuelapi.Domain.Sambaza;
import com.anchor.erp.myfuelapi.Services.GenericService;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author nbs
 */

@Service("sambazaService")
public class SambazaService implements GenericService<Sambaza>{
    
    @Autowired
    private SambazaDAO sambazaDAO;

    @Override
    public Sambaza save(Sambaza t) {
        return sambazaDAO.save(t);
    }

    @Override
    public void persist(Sambaza t) {
        sambazaDAO.persist(t);
    }

    @Override
    public Sambaza findbyId(int id) {
        return sambazaDAO.findById(id);
    }

    @Override
    public Collection<Sambaza> findAll() {
        return sambazaDAO.findAll();
    }

    @Override
    public Collection<Sambaza> findByQuery(String q) {
        return sambazaDAO.findByQuery(q);
    }

    @Override
    public Sambaza merge(Sambaza t) {
        return sambazaDAO.merge(t);
    }

    @Override
    public List<Sambaza> findbySqlQuery(String s) {
        return sambazaDAO.findbySqlQuery(s);
    }

    @Override
    public List<Sambaza> findBySqlQueryWithParams(String q, Object... params) {
        return sambazaDAO.findBySqlQueryWithParams(q, params);
    }

    @Override
    public List<Sambaza> findBySqlQueryWithNamedParams(String q, Map<String, ? extends Object> params) {
        return sambazaDAO.findBySqlQueryWithNamedParams(q, params);
    }

    @Override
    public List<Sambaza> findByNamedQuery(String name, Object... params) {
        return sambazaDAO.findByNamedQuery(name, params);
    }

    @Override
    public List<Sambaza> findByNamedQueryAndNamedParams(String name, Map<String, ? extends Object> params) {
        return sambazaDAO.findByNamedQueryAndNamedParams(name, params);
    }
    
}
