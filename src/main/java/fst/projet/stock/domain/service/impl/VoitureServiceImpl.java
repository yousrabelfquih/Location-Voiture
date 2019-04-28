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
import org.springframework.stereotype.Service;

/**
 *
 * @author amal
 */
@Service
public class VoitureServiceImpl implements VoitureService{
    
    private VoitureDao voitureDao;
    
    @Override
    public Voiture findById(long id) {
        return voitureDao.findById(id);
    }

    @Override
    public Voiture save(Voiture voiture) {
        return voitureDao.save(voiture);
    }

    @Override
    public Voiture ajout(Long id, String matricule, Couleur couleur, String model, Carburant carburant, Double puissance, Double coutParJour) {
        Voiture voiture= findById(id);
        return voiture;
        
    }

    public VoitureDao getVoitureDao() {
        return voitureDao;
    }

    public void setVoitureDao(VoitureDao voitureDao) {
        this.voitureDao = voitureDao;
    }

    @Override
    public List<Voiture> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
