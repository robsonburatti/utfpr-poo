/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.model.dao;

import br.edu.utfpr.model.dao.exceptions.NonexistentEntityException;
import br.edu.utfpr.model.entity.OutraEntidade;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author root
 */
public class OutraEntidadeJpaController implements Serializable {

    public OutraEntidadeJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(OutraEntidade outraEntidade) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(outraEntidade);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(OutraEntidade outraEntidade) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            outraEntidade = em.merge(outraEntidade);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = outraEntidade.getId();
                if (findOutraEntidade(id) == null) {
                    throw new NonexistentEntityException("The outraEntidade with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Long id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            OutraEntidade outraEntidade;
            try {
                outraEntidade = em.getReference(OutraEntidade.class, id);
                outraEntidade.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The outraEntidade with id " + id + " no longer exists.", enfe);
            }
            em.remove(outraEntidade);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<OutraEntidade> findOutraEntidadeEntities() {
        return findOutraEntidadeEntities(true, -1, -1);
    }

    public List<OutraEntidade> findOutraEntidadeEntities(int maxResults, int firstResult) {
        return findOutraEntidadeEntities(false, maxResults, firstResult);
    }

    private List<OutraEntidade> findOutraEntidadeEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(OutraEntidade.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public OutraEntidade findOutraEntidade(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(OutraEntidade.class, id);
        } finally {
            em.close();
        }
    }

    public int getOutraEntidadeCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<OutraEntidade> rt = cq.from(OutraEntidade.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
