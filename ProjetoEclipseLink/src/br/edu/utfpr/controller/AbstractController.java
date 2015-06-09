/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.controller;

import br.edu.utfpr.model.dao.AbstractDAO;
import br.edu.utfpr.model.entity.AbstractEntity;
import java.util.List;

/**
 *
 * @author root
 */
public abstract class AbstractController<T extends AbstractEntity> {
    
    public abstract AbstractDAO getDAO();

    public void gravar(T objeto) {
        getDAO().gravar(objeto);
    }

    public void apagar(T objeto) {
        getDAO().apagar(objeto);
    }

    public List<T> getAll() {
        return getDAO().getAll();
    }

    public void getById(int id) {
        getDAO().getById(id);
    }
    
}
