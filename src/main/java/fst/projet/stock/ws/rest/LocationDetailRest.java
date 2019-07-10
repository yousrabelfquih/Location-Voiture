/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fst.projet.stock.ws.rest;

import fst.projet.stock.bean.LocationDetail;
import fst.projet.stock.bean.Voiture;
import fst.projet.stock.domain.service.LocationDetailService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author yousr
 */
@RestController
@RequestMapping("/stock/Locationdetail")
public class LocationDetailRest {
    @Autowired
    private LocationDetailService locationDetailService;

    @GetMapping("/voiture/{Voiture}")
    public LocationDetail findByVoiture(Voiture voiture) {
        return locationDetailService.findByVoiture(voiture);
    }
    @GetMapping("/")
    public List<LocationDetail> findAll() {
        return locationDetailService.findAll();
    }
    @GetMapping("/prix/{Prix}")
    public double calcultotal(List<LocationDetail> locationdetail) {
        return locationDetailService.calcultotal(locationdetail);
    }
    

    @PostMapping("/")
    public int save(@RequestBody LocationDetail locationDetail) {
        return locationDetailService.save(locationDetail);
    }

    public LocationDetailService getLocationDetailService() {
        return locationDetailService;
    }

    public void setLocationDetailService(LocationDetailService locationDetailService) {
        this.locationDetailService = locationDetailService;
    }
    
}
