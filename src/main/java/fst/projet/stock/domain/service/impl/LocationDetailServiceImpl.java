/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fst.projet.stock.domain.service.impl;

import fst.projet.stock.bean.Location;
import fst.projet.stock.bean.LocationDetail;
import fst.projet.stock.bean.Voiture;
import fst.projet.stock.domain.dao.LocationDetailDao;
import fst.projet.stock.domain.service.LocationDetailService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author amal
 */
@Service
public class LocationDetailServiceImpl implements LocationDetailService {

    @Autowired
    private LocationDetailDao locationDetailDao;

    @Override
    public LocationDetail findByVoiture(Voiture voiture) {
        return locationDetailDao.findByVoiture(voiture);
    }
    
    
    @Override
    public int save(LocationDetail locationDetail) {
        if (findByVoiture(locationDetail.getVoiture()) != null) {
            return -1;

        } else {
            locationDetailDao.save(locationDetail);
            return 1;
        }
    }
   
    @Override
    public double calcultotal(List<LocationDetail> locationdetail) {

        double sum = 0;
        if (locationdetail == null || locationdetail.isEmpty()) {
            return 0;
        }
        for (LocationDetail l : locationdetail) {
            sum = sum + (l.getPrix() * l.getDuree());
        }

        return sum;
    }

    @Override
    public List<LocationDetail> findAll() {
        return locationDetailDao.findAll();
    }

}
