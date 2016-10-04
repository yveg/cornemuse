/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import streaming.dao.GenreDAO;
import streaming.entity.Genre;

/**
 *
 * @author admin
 */
public class GenreService {

    public List<Genre> listerg() {
        GenreDAO dao = new GenreDAO();
        return dao.listerGenre();
    }

    public void ajoutergenre(Genre g) {
        GenreDAO dao = new GenreDAO();
        dao.ajouterg(g);
    }

    public void supprimerg(long id) {
        GenreDAO dao = new GenreDAO();
        dao.suppg(id);
    }

    public void modifierg(Genre g) {
        GenreDAO dao = new GenreDAO();
        dao.modifg(g);
    }

    public Genre  rechercheparidg(long id) {
        GenreDAO dao = new GenreDAO();
        return dao.searchbyidg(id);
        //ou bien return new GenreDAO().searchbyidg(id);
    }

    public List<Genre> ajoutergenre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
