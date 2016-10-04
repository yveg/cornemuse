/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import streaming.entity.Film;
import streaming.entity.Genre;
import streaming.service.AjouterfilmService;
import streaming.service.FilmService;
import streaming.service.GenreService;

/**
 *
 * @author admin
 */
@WebServlet(name = "AjouterFilmServlet", urlPatterns = {"/ajouter_film"})
public class AjouterFilmServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*List<Film> afilms = new AjouterfilmService().ajouter();
        req.setAttribute("ajoutfilms", afilms); pas propre*/
        
       /* List<Genre> genree = new GenreService().listerg();
        req.setAttribute("lesgenres", genree);*/
        req.setAttribute("lesgenres", new GenreService().listerg());
        req.getRequestDispatcher("AjouterFilm.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       // Genre g = new Genre(); // ma methode pas clean meme si bonne.
        Film f = new Film();
        f.setTitre(req.getParameter("titre"));
        f.setSynopsis(req.getParameter("synopsis"));
        f.setAnnee(Integer.valueOf(req.getParameter("annee")));
        f.setDuree(Integer.valueOf(req.getParameter("duree")));
        
        //soluce clean
        long idgenre = Long.valueOf(req.getParameter("genreid"));
        Genre g = new GenreService().rechercheparidg(idgenre);
        f.setGenre(g);
        g.getFilms().add(f);
        
        //g.setId(Long.valueOf(req.getParameter("genreId"))); //pas bonne methdode , il manque l'etape service.
        //req.getRequestDispatcher("AjouterFilm.jsp").forward(req, resp); a suprimer si on fait un resp.sendRedirect

        //ajout
        new FilmService().ajouterfilm(f);
        //req.getRequestDispatcher("/lister_films").forward(req, resp); incorrect, resp.sendRedirect
        resp.sendRedirect("lister_film");

    }

}
