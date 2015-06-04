/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.model.dao;

import br.edu.utfpr.model.entity.Estado;
import java.util.List;

/**
 *
 * @author root
 */
public class EstadoDAO extends AbstractDAO<Estado> {
    
    /**
     * Filtro de busca especifico para a tabela estado 
     * @param busca valor do termo de busca para o nome de uma estado
     * @return uma lista de estados que contem relacionamento ao termo de busca
     */
    public List<Estado> getByFiltro(String busca) {
        return em.createQuery("select e from Estado e where e.estado like '%" + busca + "%'").getResultList();
    }
    
}
