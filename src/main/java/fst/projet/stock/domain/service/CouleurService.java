/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fst.projet.stock.domain.service;

import fst.projet.stock.bean.Couleur;
import fst.projet.stock.domain.dao.CouleurDao;
import java.util.List;

/**
 *
 * @author amal
 */
public interface CouleurService {
        public CouleurDao findByLibelle(String Libelle);
        public int save(Couleur couleur);
        public List<Couleur> findAll();
}
