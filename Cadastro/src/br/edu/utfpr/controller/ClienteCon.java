/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.controller;

import br.edu.utfpr.model.entity.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author root
 */
public class ClienteCon {
    
    public List<Cliente> getAll() {
        List<Cliente> toReturn = new ArrayList<Cliente>();
        
        for (int i = 0; i <= 10; i++) {
            toReturn.add(getCliente(i));
        }
        
        return toReturn;
    }
    
    private Cliente getCliente(int valor) {
        Cliente toReturn = new Cliente();
        
        toReturn.setNome("Cliente - " + valor);
        
        return toReturn;
    }
    
}
