/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.model.dao;

import br.edu.utfpr.model.entity.Cidade;
import java.util.List;

/**
 *
 * @author root
 */
public class CidadeDAO extends AbstractDAO<Cidade> {
    
    /**
     * Filtro de busca especifico para a tabela cidade 
     * @param busca valor do termo de busca para o nome de uma cidade
     * @return uma lista de cidades que contem relacionamento ao termo de busca
     */
    public List<Cidade> getByFiltro(String busca) {
        return em.createQuery("select c from Cidade c where c.cidade like '%" + busca + "%'").getResultList();
    }
    
}
