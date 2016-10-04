/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import streaming.dao.FilmDAO;
import streaming.entity.Film;

/**
 *
 * @author admin
 */
public class AjouterfilmService {
    public void ajouterf(Film f) {
         new FilmDAO().ajouterf(f);
       /* FilmDAO dao = new FilmDAO();
        return dao.ajouterf();*/
    }
    public Film searchbyid(long id) {
        return new FilmDAO().searchbyid(id);
    }
    
     public void suppf(long id) {
         new FilmDAO().suppf(id);
     }
      public void modiff(Film f) {
          new FilmDAO().modiff(f);
      }
     
}

