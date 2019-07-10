/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fst.projet.stock.domain.service;

import fst.projet.stock.bean.Carburant;
import fst.projet.stock.bean.Couleur;
import fst.projet.stock.bean.Voiture;
import java.util.List;

/**
 *
 * @author amal
 */
public interface VoitureService {
    public Voiture findByMatricule(String matricule);
    public List<Voiture> findAll();
    public int save(Voiture voiture);
    
    
    
    
}
