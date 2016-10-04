/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import streaming.dao.paysdao2;
import streaming.entity.Pays;

/**
 *
 * @author admin
 */
public class paysservice2 {
    
    public List<Pays> listerpayservice2(){
        paysdao2 dao = new paysdao2();
        return dao.listerpaydao2();
    }
    
    public void ajouterpaysservice2(Pays p){
        paysdao2 dao = new paysdao2();
        dao.ajouterpaysdao2(p);
    }
    public void supprimerpaysservice2(long id){
        paysdao2 dao = new paysdao2();
        dao.supprimerpaysdao2(id);
    }
    public void modifierpaysservice2(Pays p){
        paysdao2 dao = new paysdao2();
        dao.modifierpaysdao2(p);
    }
    public Pays searchbyidpaysservice2(long id){
        paysdao2 dao = new paysdao2();
       return dao.searchbyidpaysdao2(id);
    }
   
}
