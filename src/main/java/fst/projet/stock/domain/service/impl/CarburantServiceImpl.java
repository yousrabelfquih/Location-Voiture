/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fst.projet.stock.domain.service.impl;

import fst.projet.stock.bean.Carburant;
import fst.projet.stock.domain.dao.CarburantDao;
import fst.projet.stock.domain.service.CarburantService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author yousr
 */
@Service
public class CarburantServiceImpl implements CarburantService{
    @Autowired
    private CarburantDao carburantDao ;

    public CarburantDao getCarburantDao() {
        return carburantDao;
    }

    public void setCarburantDao(CarburantDao carburantDao) {
        this.carburantDao = carburantDao;
    }
    @Override
    public Carburant findByLibelle(String Libelle) {
        return carburantDao.findByLibelle(Libelle);
    }

    @Override
    public int save(Carburant carburant) {
        if (findByLibelle(carburant.getLibelle()) != null){
            return -1;
         
        }else {
            carburantDao.save(carburant);
            return 1;
        }
    }

    @Override
    public List<Carburant> findAll() {
        return carburantDao.findAll();
    }
    
    
    
}
