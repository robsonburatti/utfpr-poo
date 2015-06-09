/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.controller;

import br.edu.utfpr.model.entity.Estado;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author root
 */
public class EstadoCon {
    
    public List<Estado> getAll() {
        List<Estado> toReturn = new ArrayList<Estado>();
        
        for (int i = 1; i <= 10; i++) {
            toReturn.add(getEstado(i));
        }
        
        return toReturn;
    }
    
    private Estado getEstado(int valor) {
        Estado toReturn = new Estado();
        
        toReturn.setNome("Estado - " + valor);
        
        return toReturn;
    }
    
}
