/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import streaming.dao.SerieDAO;
import streaming.entity.Serie;

/**
 *
 * @author admin
 */
public class Serieservice {
        public List<Serie> lister(){
        SerieDAO dao = new SerieDAO();
        return dao.listerSerie();
    }
public void ajouterserie(Serie s) {
        SerieDAO dao = new SerieDAO();
        dao.ajouters(s);
    }

    public void supprimers(long id) {
        SerieDAO dao = new SerieDAO();
        dao.supps(id);
    }

    public void modifiers(Serie s) {
        SerieDAO dao = new SerieDAO();
        dao.modifs(s);
    }

    public Serie  rechercheparids(long id) {
        SerieDAO dao = new SerieDAO();
        return dao.searchbyids(id);
    }
    
    }
    

