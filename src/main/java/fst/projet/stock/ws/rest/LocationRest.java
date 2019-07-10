/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fst.projet.stock.ws.rest;

import fst.projet.stock.bean.Location;
import fst.projet.stock.bean.LocationDetail;
import fst.projet.stock.domain.service.LocationService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author yousr
 */
@RestController
@RequestMapping("/stock/location")
public class LocationRest {

    @Autowired
    private LocationService locationService;

    @GetMapping("/dateLocation/{dateLocation}")
    public Location findByDateLocation(@PathVariable Date dateLocation) {
        return locationService.findByDateLocation(dateLocation);
    }
    @GetMapping("/")
    public List<Location> findAll() {
        return locationService.findAll();
    }

  @PostMapping("/")
  public int save(@RequestBody Location location)  { 
          return locationService.save(location);
}

    /*@PostMapping("/")
    public int save(@RequestBody Location location) {
        return locationService.save(location, location.getLocationDetails());
//         return 1;
    }*/

    public LocationService getLocationService() {
        return locationService;
    }

    public void setLocationService(LocationService locationService) {
        this.locationService = locationService;
    }

}
