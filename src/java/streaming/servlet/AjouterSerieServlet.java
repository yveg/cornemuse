/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import streaming.entity.Serie;
import streaming.service.Serieservice;

/**
 *
 * @author admin
 */
@WebServlet(name = "AjouterSerieServlet", urlPatterns = {"/ajouter_serie"})
public class AjouterSerieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
        req.getRequestDispatcher("AjouterSerie.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Serie s = new Serie();
        s.setTitre(req.getParameter("titre"));
        s.setSynopsis(req.getParameter("synopsis"));
        
        //ajout
        new Serieservice().ajouterserie(s);
        //req.getRequestDispatcher("/lister_films").forward(req, resp); incorrect, resp.sendRedirect
        resp.sendRedirect("lister_serie");

    
    }
}
