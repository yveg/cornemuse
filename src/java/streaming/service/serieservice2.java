/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import streaming.dao.seriedao2;
import streaming.entity.Serie;

/**
 *
 * @author admin
 */
public class serieservice2 {

    public List<Serie> listerserieservice2() {
        seriedao2 dao = new seriedao2();
       return dao.listerserie2();
    }

    public void ajouterserieservice2(Serie s) {
        seriedao2 dao = new seriedao2();
        dao.ajouterserie2(s);
    }

    public void supprimerserieservice2(long id) {
        seriedao2 dao = new seriedao2();
        dao.supprimerserie2(id);
    }

    public void modifierserieservice2(Serie s) {
        seriedao2 dao = new seriedao2();
        dao.modifierserie2(s);
    }

    public Serie searchbyidserieservice2(long id) {
        seriedao2 dao = new seriedao2();
        return dao.searchbyidserie2(id);
    }
}
