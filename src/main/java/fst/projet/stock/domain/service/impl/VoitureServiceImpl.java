/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fst.projet.stock.domain.service.impl;

import fst.projet.stock.bean.Carburant;
import fst.projet.stock.bean.Couleur;
import fst.projet.stock.bean.Voiture;
import fst.projet.stock.domain.dao.VoitureDao;
import fst.projet.stock.domain.service.VoitureService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author amal
 */
@Service
public class VoitureServiceImpl implements VoitureService{
    
    @Autowired
    private VoitureDao voitureDao;

    @Override
    public Voiture findByMatricule(String matricule) {
        return voitureDao.findByMatricule(matricule);
    }

    @Override
    public List<Voiture> findAll() {
        return voitureDao.findAll();
    }

    @Override
    public int save(Voiture voiture) {
        if (findByMatricule(voiture.getMatricule()) != null){
            return -1;
         
        }else {
            voitureDao.save(voiture);
            return 1;
        }
        
    }
    
}