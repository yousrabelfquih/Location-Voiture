/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fst.projet.stock.domain.service;

import fst.projet.stock.bean.Marque;

/**
 *
 * @author amal
 */
public interface MarqueService {
    
        public Marque findByLibelle(String libelle);
        public int save(Marque marque);

    
}
