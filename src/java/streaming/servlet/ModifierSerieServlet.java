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
@WebServlet(name = "ModifierSerieServlet", urlPatterns = {"/modifier_serie"})
public class ModifierSerieServlet extends HttpServlet {

 @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       //recupere le film en fonction de l'id 
       Serie serie =  new Serieservice().rechercheparids(Long.valueOf(req.getParameter("monId")));
       //on parametre arrtibut monfilm vers jsp
       req.setAttribute("maserie", serie);
       //forward vers jsp
       req.getRequestDispatcher("Modifier_serie.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Serie s = new Serie();
        s.setId(Long.valueOf(req.getParameter("id")));
        s.setTitre(req.getParameter("titre"));
        s.setSynopsis(req.getParameter("synopsis"));
         new Serieservice().modifiers(s);
        resp.sendRedirect("lister_serie");
    }

}
