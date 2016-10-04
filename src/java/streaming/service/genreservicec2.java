/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import streaming.dao.genredao2;
import streaming.entity.Genre;

/**
 *
 * @author admin
 */
public class genreservicec2 {
    public List<Genre> listergenreservice2() {
        genredao2 dao = new genredao2();
        return dao.listergenre2();
    }
    
    public void ajoutergenreservice2(Genre g) {
        genredao2 dao = new genredao2();
        dao.ajoutergenre2(g);
    }
    
     public void modifierergenreservice2(Genre g) {
        genredao2 dao = new genredao2();
        dao.modifiergenre2(g);
    }
      public void supprimergenreservice2(long id) {
        genredao2 dao = new genredao2();
        dao.supprimergenre2(id);
    }
       public Genre searchbyidgenreservice2(long id) {
        genredao2 dao = new genredao2();
        return dao.findbyidgenre2(id);
    }
}
