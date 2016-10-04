/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import streaming.entity.Genre;

/**
 *
 * @author admin
 */
public class GenreDAO {
        public List<Genre> listerGenre() {
        EntityManager em = Persistence.createEntityManagerFactory("CornemusePU").createEntityManager();
        //ORDER BY
        return em.createQuery("SELECT g FROM Genre g ORDER BY g.id DESC").getResultList();

    }

    public void ajouterg(Genre g) {
        EntityManager em = Persistence.createEntityManagerFactory("CornemusePU").createEntityManager();
        em.getTransaction().begin();
        em.persist(g);
        em.getTransaction().commit();
    }

    public void suppg(long id) {
        EntityManager em = Persistence.createEntityManagerFactory("CornemusePU").createEntityManager();
        em.getTransaction().begin();
        em.createQuery("DELETE FROM Genre g WHERE g.id=" + id).executeUpdate();
        em.getTransaction().commit();
    }
    
    public void modifg(Genre g) {
        EntityManager em = Persistence.createEntityManagerFactory("CornemusePU").createEntityManager();
        em.getTransaction().begin();
        em.merge(g);
        em.getTransaction().commit();
    }

    public Genre searchbyidg(long id) {
        EntityManager em = Persistence.createEntityManagerFactory("CornemusePU").createEntityManager();
        return em.find(Genre.class, id);
    }
    
}
