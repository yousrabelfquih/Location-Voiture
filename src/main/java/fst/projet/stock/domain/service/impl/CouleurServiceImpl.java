/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fst.projet.stock.domain.service.impl;

import fst.projet.stock.bean.Carburant;
import fst.projet.stock.bean.Couleur;
import fst.projet.stock.domain.dao.CouleurDao;
import fst.projet.stock.domain.service.CouleurService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author amal
 */
@Service
public class CouleurServiceImpl implements CouleurService{
    @Autowired
    private CouleurDao couleurDao;

    public CouleurDao getCouleurDao() {
        return couleurDao;
    }
    @Override
    public List<Couleur> findAll() {
        return couleurDao.findAll();
    }

    public void setCouleurDao(CouleurDao couleurDao) {
        this.couleurDao = couleurDao;
    }
    @Override
    public CouleurDao findByLibelle(String Libelle) {
        return couleurDao.findByLibelle(Libelle);
         
    }
    
    @Override
     public int save(Couleur couleur) {
         //findByLibelle(couleur.getLibelle()) != null
        if (false){
            return -1;
         
        }else {
            couleurDao.save(couleur);
            return 1;
        }
    
     }
}
