/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 *
 * @author ETY
 */
@Entity
public class Pays implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String nom;
    
    @ManyToMany(mappedBy = "pays")
    private List<Film> filmsProduits = new ArrayList<>();
    @ManyToMany(mappedBy = "pays")
    private List<Serie> seriesProduits = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Film> getFilmsProduits() {
        return filmsProduits;
    }

    public void setFilmsProduits(List<Film> filmsProduits) {
        this.filmsProduits = filmsProduits;
    }

    public List<Serie> getSeriesProduits() {
        return seriesProduits;
    }

    public void setSeriesProduits(List<Serie> seriesProduits) {
        this.seriesProduits = seriesProduits;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pays)) {
            return false;
        }
        Pays other = (Pays) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpql.entity.Pays[ id=" + id + " ]";
    }
    
}
