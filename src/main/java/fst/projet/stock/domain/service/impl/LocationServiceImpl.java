/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fst.projet.stock.domain.service.impl;

import fst.projet.stock.bean.Location;
import fst.projet.stock.bean.LocationDetail;
import fst.projet.stock.domain.dao.LocationDao;
import fst.projet.stock.domain.service.LocationDetailService;
import fst.projet.stock.domain.service.LocationService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author amal
 */
@Service
public class LocationServiceImpl implements LocationService {

    @Autowired
    private LocationDao locationDao;
    @Autowired
    private LocationDetailService locationDetailService;

    public LocationDao getLocationDao() {
        return locationDao;
    }

    public void setLocationDao(LocationDao locationDao) {
        this.locationDao = locationDao;
    }

    @Override
    public Location findByDateLocation(Date dateLocation) {
        return locationDao.findByDateLocation(dateLocation);
    }

    /* public boolean save(Location location, List<LocationDetail> locationdetail) {
        double total = locationDetailService.calcultotal(locationdetail);
        location.setPrixTotal(total);
        save(location);
        for (int i = 0; i < locationdetail.size(); i++) {
            LocationDetail locationDetail = locationdetail.get(i);
            locationDetail.setLocation(location);
            locationDetailService.save(locationDetail);
        }
        
        return true;
    }*/

    @Override
    public int save(Location location) {
        if (findByDateLocation(location.getDateLocation()) != null) {
            return -1;

        } else {
            locationDao.save(location);
            return 1;
        }
    }

    @Override
    public List<Location> findAll() {
        return locationDao.findAll();
    }

}
