/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import streaming.dao.SerieDAO;
import streaming.entity.Serie;

/**
 *
 * @author admin
 */
public class AjouterSerieService {

    public void ajouters(Serie s) {
        new SerieDAO().ajouters(s);
    }

    public Serie searchbyids(long id) {
        return new SerieDAO().searchbyids(id);
    }

    public void supps(long id) {
        new SerieDAO().supps(id);
    }

    public void modifs(Serie s) {
        new SerieDAO().modifs(s);
    }

}
