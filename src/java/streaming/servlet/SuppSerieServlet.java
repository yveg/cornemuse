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
import streaming.service.Serieservice;

/**
 *
 * @author admin
 */
@WebServlet(name = "SuppSerieServlet", urlPatterns = {"/supp_serie"})
public class SuppSerieServlet extends HttpServlet {
 @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        long id = Long.valueOf(req.getParameter("monId")); //recupere  id de la serie en deifnissant la variable monid pour l utilier en url
        new Serieservice().supprimers(id);
        resp.sendRedirect("lister_serie");
    }
    
}
