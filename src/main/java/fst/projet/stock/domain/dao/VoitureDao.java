/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fst.projet.stock.domain.dao;

import fst.projet.stock.bean.Voiture;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author yousra
 */
@Repository
public interface VoitureDao  extends JpaRepository<Voiture, Long>{
    public Voiture findById(long id);
    
}
