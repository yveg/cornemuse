/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import streaming.entity.Serie;

/**
 *
 * @author admin
 */
public class SerieDAO {

    public List<Serie> listerSerie() {
        EntityManager em = Persistence.createEntityManagerFactory("CornemusePU").createEntityManager();
        //ORDER BY
        return em.createQuery("SELECT s FROM Serie s ORDER BY s.id DESC").getResultList();
    }
    
    public void ajouters(Serie s) {
        EntityManager em = Persistence.createEntityManagerFactory("CornemusePU").createEntityManager();
        em.getTransaction().begin();
        em.persist(s);
        em.getTransaction().commit();
    }

    public void supps(long id) {
        EntityManager em = Persistence.createEntityManagerFactory("CornemusePU").createEntityManager();
        em.getTransaction().begin();
        em.createQuery("DELETE FROM Serie s WHERE s.id=" + id).executeUpdate();
        em.getTransaction().commit();
    }
    
    public void modifs(Serie s) {
        EntityManager em = Persistence.createEntityManagerFactory("CornemusePU").createEntityManager();
        em.getTransaction().begin();
        em.merge(s);
        em.getTransaction().commit();
    }

    public Serie searchbyids(long id) {
        EntityManager em = Persistence.createEntityManagerFactory("CornemusePU").createEntityManager();
        return em.find(Serie.class, id);
    }
}
