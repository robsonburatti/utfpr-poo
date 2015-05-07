/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.controller;

import br.edu.utfpr.model.entity.Cidade;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author root
 */
public class CidadeCon {
    
    public List<Cidade> getAll() {
        List<Cidade> toReturn = new ArrayList<Cidade>();
        
        for (int i = 1; i <= 10; i++) {
            toReturn.add(getCidade(i));
        }
        
        return toReturn;
    }
    
    private Cidade getCidade(int valor) {
        Cidade toReturn = new Cidade();
        
        toReturn.setNome("Cidade - " + valor);
        
        return toReturn;
    }
    
}
