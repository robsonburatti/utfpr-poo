/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.model.dao;

import br.edu.utfpr.model.entity.AbstractEntity;
import br.edu.utfpr.model.entity.Cliente;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author root
 */
public abstract class AbstractDAO<T extends AbstractEntity> {
    
    protected EntityManager em;

    public AbstractDAO() {
        // O parâmetro string deve ser o nome que está no arquivo persistence.xml no atributo name
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjetoEclipseLinkPU");
        em = emf.createEntityManager();
    }
    
    /**
     * Pega o tipo que é a classe T
     * @return Retorna a classe que o T representa
     */
    private Class getClasseDominio() {
        return (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }
    
    /**
     * Conecta no banco de dados e grava um objeto do tipo T
     * @param objeto tipo do objeto que será  gravado no banco de dados
     */
    public void gravar(T objeto) {
        em.getTransaction().begin();

        if (objeto.isNew()) {
            // Adiciona no banco de dados um novo objeto do tipo T
            em.persist(objeto);
        } else {
            // Altera um objeto do tipo T que já existente no banco de dados 
            em.merge(objeto);
        }

        em.getTransaction().commit();
        em.close();
    }
    
    /** 
     * Exclui do banco de dados um objeto do tipo T
     * @param objeto tipo do objeto que será excluido do banco de dados
     */
    public void apagar(T objeto) {
        em.getTransaction().begin();

        em.remove(em.merge(objeto));

        em.getTransaction().commit();
        em.close();
    }
    
    /**
     * Efetua a busca no banco de dados, com o ID informado
     * @param id chave primária do registro a ser localizado
     * @return Retorna um objeto do tipo de T
     */
    public T getById(int id) {
        return (T) em.find(getClasseDominio(), id);
    }
    
    /**
     * Efetua uma busca no banco de dados em uma tabela especifica que é armazenada no objeto do tipo T
     * @return uma lista de objetos do tipo T
     */
    public List<T> getAll() {
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        // Poderia ser desta forma também
//        cq.select( cq.from( Cliente.class ) );
        cq.select(cq.from(getClasseDominio()));

        return em.createQuery(cq).getResultList();
    }
    
}
