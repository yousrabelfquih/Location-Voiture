/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fst.projet.stock.domain.dao;

import fst.projet.stock.bean.Couleur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author amal
 */
@Repository
public interface CouleurDao extends JpaRepository<Couleur, Long>{
    public CouleurDao findByLibelle(String Libelle);
    
                    
    
}
