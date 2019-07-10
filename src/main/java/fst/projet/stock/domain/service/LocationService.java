/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fst.projet.stock.domain.service;

import fst.projet.stock.bean.Location;
import fst.projet.stock.bean.LocationDetail;
import java.util.Date;
import java.util.List;

/**
 *
 * @author amal
 */
public interface LocationService {
    
    public Location findByDateLocation(Date dateLocation);
    public List<Location> findAll();
    public int save(Location location);
   // public boolean save(Location location, List<LocationDetail> locationdetail);

    
}
