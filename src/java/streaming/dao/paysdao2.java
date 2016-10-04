/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import streaming.entity.Pays;

/**
 *
 * @author admin
 */
public class paysdao2 {

    public List<Pays> listerpaydao2() {
        EntityManager em = Persistence.createEntityManagerFactory("CornemusePU").createEntityManager();
        return em.createQuery("SELECT p FROM Pays p ORDER BY p.nom DESC").getResultList();

    }

    public void ajouterpaysdao2(Pays p) {
        EntityManager em = Persistence.createEntityManagerFactory("CornemusePU").createEntityManager();
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
    }

    public void supprimerpaysdao2(long id) {
        EntityManager em = Persistence.createEntityManagerFactory("CornemusePU").createEntityManager();
        em.getTransaction().begin();
        em.createQuery("DELETE FROM Pays p WHERE p.id=" + id).executeUpdate(); // equivaut a em.remove(em.find(Pays.class, id));
        em.getTransaction().commit();
    }

    public void modifierpaysdao2(Pays p) {
        EntityManager em = Persistence.createEntityManagerFactory("CornemusePU").createEntityManager();
        em.getTransaction().begin();
        em.merge(p);
        em.getTransaction().commit();
    }

    public Pays searchbyidpaysdao2(Long id) {
        EntityManager em = Persistence.createEntityManagerFactory("CornemusePU").createEntityManager();
        return em.find(Pays.class, id);
    }
   /* public Pays searchbyidpaysdao2(String nom) {
        EntityManager em = Persistence.createEntityManagerFactory("CornemusePU").createEntityManager();
        return em.createQuery("SELECT p FROM Pays p WHERE p.nom" +nom).getSingleResult();
    }
*/
}
