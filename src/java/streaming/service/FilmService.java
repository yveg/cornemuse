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
public class FilmService {

    public List<Film> lister() {
        //return new FilmDAO().listerFilms();
        FilmDAO dao = new FilmDAO();
        return dao.listerFilms();
    }

    public void ajouterfilm(Film f) {
        FilmDAO dao = new FilmDAO();
        dao.ajouterf(f);
    }

    public void supprimerf(long id) {
        FilmDAO dao = new FilmDAO();
        dao.suppf(id);
    }

    public void modifierf(Film f) {
        FilmDAO dao = new FilmDAO();
        dao.modiff(f);
    }

    public Film  rechercheparid(long id) {
        FilmDAO dao = new FilmDAO();
        return dao.searchbyid(id);
    }

}
