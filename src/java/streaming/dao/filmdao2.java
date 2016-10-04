/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import streaming.entity.Film;

/**
 *
 * @author admin
 */
public class filmdao2 {

    public List<Film> listerfilm2() {
        EntityManager em = Persistence.createEntityManagerFactory("CornemusePU").createEntityManager();
        return em.createQuery("SELECT f FROM Film f ORDER BY f.id DESC").getResultList();
    }

    public void ajouterfilm2(Film f) {
        EntityManager em = Persistence.createEntityManagerFactory("CornemusePU").createEntityManager();
        em.getTransaction().begin();
        em.persist(f);
        em.getTransaction().commit();
    }

    public void modifierfilm2(Film f) {
        EntityManager em = Persistence.createEntityManagerFactory("CornemusePU").createEntityManager();
        em.getTransaction().begin();
        em.merge(f);
        em.getTransaction().commit();
    }

    public void supprimerfilm2(long id) {
        EntityManager em = Persistence.createEntityManagerFactory("CornemusePU").createEntityManager();
        em.getTransaction().begin();
        em.createQuery("DELETE FROM Film g WHERE f.id=" + id).executeUpdate();
        em.getTransaction().commit();
    }

    public Film searchbyidfilm2(long id) {
        EntityManager em = Persistence.createEntityManagerFactory("CornemusePU").createEntityManager();
        return em.find(Film.class, id);
    }
}
