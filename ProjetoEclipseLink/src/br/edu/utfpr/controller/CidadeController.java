/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.controller;

import br.edu.utfpr.model.dao.AbstractDAO;
import br.edu.utfpr.model.dao.CidadeDAO;
import br.edu.utfpr.model.entity.Cidade;
import java.util.List;

/**
 *
 * @author root
 */
public class CidadeController extends AbstractController<Cidade> {

    private CidadeDAO dao;

    public CidadeController() {
        this.dao = new CidadeDAO();
    }

    @Override
    public AbstractDAO getDAO() {
        return this.dao;
    }

    public List<Cidade> getByFiltro(String busca) {
        return this.dao.getByFiltro(busca);
    }
    
}
