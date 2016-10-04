/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import streaming.entity.Film;

/**
 *
 * @author admin
 */
public class FilmDAO {

    public List<Film> listerFilms() {
        EntityManager em = Persistence.createEntityManagerFactory("CornemusePU").createEntityManager();
        //ORDER BY
        return em.createQuery("SELECT f FROM Film f ORDER BY f.id DESC").getResultList();

    }

    public void ajouterf(Film f) {
        EntityManager em = Persistence.createEntityManagerFactory("CornemusePU").createEntityManager();
        em.getTransaction().begin();
        em.persist(f);
        em.getTransaction().commit();
    }

    public void suppf(long id) {
        EntityManager em = Persistence.createEntityManagerFactory("CornemusePU").createEntityManager();
        em.getTransaction().begin();
        // em.createQuery("DELETE FROM Film f WHERE f.id=" +id).executeupdate();
        em.createQuery("DELETE FROM Film f WHERE f.id=" + id).executeUpdate();
        em.getTransaction().commit();
    }
    
    public void modiff(Film f) {
        EntityManager em = Persistence.createEntityManagerFactory("CornemusePU").createEntityManager();
        em.getTransaction().begin();
        em.merge(f);
        em.getTransaction().commit();
    }

    public Film searchbyid(long id) {
        EntityManager em = Persistence.createEntityManagerFactory("CornemusePU").createEntityManager();
        return em.find(Film.class, id);
    }
}
