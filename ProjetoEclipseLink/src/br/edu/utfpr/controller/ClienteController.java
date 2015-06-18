/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.controller;

import br.edu.utfpr.model.dao.AbstractDAO;
import br.edu.utfpr.model.dao.ClienteDAO;
import br.edu.utfpr.model.entity.Cliente;

/**
 *
 * @author root
 */
public class ClienteController extends AbstractController<Cliente> {

    private ClienteDAO dao;

    public ClienteController() {
        this.dao = new ClienteDAO();
    }
    
    @Override
    public AbstractDAO getDAO() {
        return this.dao;
    }
    
}
