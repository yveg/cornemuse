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
public class genredao2 {

    public List<Genre> listergenre2() {
        EntityManager em = Persistence.createEntityManagerFactory("CornemusePU").createEntityManager();
        return em.createQuery("SELECT g FROM Genre g ORDER BY g.id DESC").getResultList();

    }

    public void ajoutergenre2(Genre g) {
        EntityManager em = Persistence.createEntityManagerFactory("CornemusePU").createEntityManager();
        em.getTransaction().begin();
        em.persist(g);
        em.getTransaction().commit();
    }

    public void supprimergenre2(long id) {
        EntityManager em = Persistence.createEntityManagerFactory("CornemusePU").createEntityManager();
        em.getTransaction().begin();
        em.createQuery("DELETE FROM Genre g WHERE g.id=" + id).executeUpdate();
        em.getTransaction().commit();
    }

    public void modifiergenre2(Genre g) {
        EntityManager em = Persistence.createEntityManagerFactory("CornemusePU").createEntityManager();
        em.getTransaction().begin();
        em.merge(g);
        em.getTransaction().commit();

    }

    public Genre findbyidgenre2(long id) {
        EntityManager em = Persistence.createEntityManagerFactory("CornemusePU").createEntityManager();
        return em.find(Genre.class, id);
    }
}
