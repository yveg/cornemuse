/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import streaming.dao.filmdao2;
import streaming.entity.Film;

/**
 *
 * @author admin
 */
public class filmservice2 {
    public List<Film> listerfilmservice2() {
        filmdao2 dao = new filmdao2();
        return dao.listerfilm2();
        
    }
    public void ajouterfilmservice2(Film f) {
        filmdao2 dao = new filmdao2();
        dao.ajouterfilm2(f);
        
    }
    
     public void supprimerfilmservice2(long id) {
        filmdao2 dao = new filmdao2();
        dao.supprimerfilm2(id);
        
    }
    
      public void modifierfilmservice2(Film f) {
        filmdao2 dao = new filmdao2();
        dao.modifierfilm2(f);
        
    }
       public void searchbyidfilmservice2(long id) {
        filmdao2 dao = new filmdao2();
        dao.searchbyidfilm2(id);
        
    }
       public void ajoutertrilogie(List<Film> f) {
           filmdao2 dao = new filmdao2();
           for (Film ff:f) {
              if( ff.getTitre().length()>0) { dao.ajouterfilm2(ff); }
           }
           
       }
}
