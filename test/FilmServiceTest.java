/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import streaming.dao.FilmDAO;
import streaming.dao.seriedao2;
import streaming.entity.Film;
import streaming.entity.Genre;
import streaming.service.filmservice2;
import streaming.service.genreservicec2;
import streaming.service.paysservice2;

/**
 *
 * @author admin
 */
public class FilmServiceTest {

    @Before
    public void setup() {
        //vide toutes les tables

        //remplir les pays
    }

    @Test
    public void ajouterOk() {
        Film f = new Film();
        f.setTitre("bidon");
        new filmservice2().ajouterfilmservice2(f);

    }

    @Test(expected = Exception.class)
    public void ajouterKO() {
        Film f = new Film();
        f.setId(3L);
        new filmservice2().ajouterfilmservice2(f);

    }

    @Test
    public void listerOk() {
        Film f = new Film();
        f.getActeurs();
        f.getId();
        f.getTitre();
    }

    @Test
    public void modifierOk() {
        Film f = new Film();
        f.setId(1L);
        f.setAnnee(2010);
        f.setSynopsis("c'lhisoire d'un chat qui...");
        new filmservice2().modifierfilmservice2(f);
        /*equivaut a
                 Film f = new filmservice2().searchbyidfilmservice2(1L);
                 f.setAnnee(2010);
                 new filmservice2().modifierfilmservice2(f);
         */
    }

    @Test
    public void supprimerOk() {
        Film f = new Film();
        f.getTitre().contentEquals("julien");
        //Assert.assertEquals("Fargo", f.getTitre());

    }

    //@Test
    public void searchbyidOK() {
        /* equivalent
        Film f= new filmservice2().searchbyidfilmservice2(2L);
        Assert.assertEquals("France",f.getTitre());
         */
        Film f = new Film();
        f.getId().compareTo(5L);
    }

}
