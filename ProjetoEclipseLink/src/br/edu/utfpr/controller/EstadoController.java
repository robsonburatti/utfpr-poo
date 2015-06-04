/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.controller;

import br.edu.utfpr.model.dao.AbstractDAO;
import br.edu.utfpr.model.dao.EstadoDAO;
import br.edu.utfpr.model.entity.Estado;
import java.util.List;

/**
 *
 * @author root
 */
public class EstadoController extends AbstractController<Estado> {

    private EstadoDAO dao;

    public EstadoController() {
        this.dao = new EstadoDAO();
    }

    @Override
    public AbstractDAO getDAO() {
        return this.dao;
    }

    public List<Estado> getByFiltro(String busca) {
        return this.dao.getByFiltro(busca);
    }
}
