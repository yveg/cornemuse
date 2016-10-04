package streaming.servlet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import streaming.entity.Film;
import streaming.service.FilmService;

/**
 *
 * @author admin
 */
@WebServlet(name = "ListerFilmServlet", urlPatterns = {"/lister_film"})
public class ListerFilmServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //System.out.println("coucou");
        List<Film> films = new FilmService().lister(); 
        //defintion de variables ${nomdevariable,texte}
        req.setAttribute("titre", "test d'affichage titre");
        req.setAttribute("mesfilms", films);
        //exo  pied de page
        req.setAttribute("pied2page", "<p align=\"center\">made by yves sept 2016</p>"); //pas utiliser
        req.getRequestDispatcher("lister_film.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("coucou");
    }

}
