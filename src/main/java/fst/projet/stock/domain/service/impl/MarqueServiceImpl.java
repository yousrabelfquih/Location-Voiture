/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fst.projet.stock.domain.service.impl;

import fst.projet.stock.bean.Marque;
import fst.projet.stock.domain.dao.MarqueDao;
import fst.projet.stock.domain.service.MarqueService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author amal
 */
@Service
public class MarqueServiceImpl implements MarqueService {

    @Autowired
    private MarqueDao marqueDao;

    @Override
    public Marque findByLibelle(String libelle) {
        return marqueDao.findByLibelle(libelle);
    }

    @Override
    public int save(Marque marque) {
        if (findByLibelle(marque.getLibelle()) != null) {
            return -1;
        } else {
            marqueDao.save(marque);
            return 1;
        }
    }

    @Override
    public List<Marque> findAll() {
        return marqueDao.findAll();
    }

    public MarqueDao getMarqueDao() {
        return marqueDao;
    }

    public void setMarqueDao(MarqueDao marqueDao) {
        this.marqueDao = marqueDao;
    }

}
