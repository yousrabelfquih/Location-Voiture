/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fst.projet.stock.ws.rest;

import fst.projet.stock.bean.Carburant;
import fst.projet.stock.domain.service.CarburantService;
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
@RequestMapping("stock/carburant")
public class CarburantRest {
    @Autowired
    private CarburantService carburantService;

    @PostMapping("/")
    public int save(@RequestBody Carburant carburant) {
        return carburantService.save(carburant);
       
    }
    @GetMapping("/")
    public List<Carburant> findAll() {
        return carburantService.findAll();
    }
    @GetMapping("/libelle/{Libelle}")
    public Carburant findByLibelle(@PathVariable String Libelle) {
        return carburantService.findByLibelle(Libelle);
    }

    public CarburantService getCarburantService() {
        return carburantService;
    }

    public void setCarburantService(CarburantService carburantService) {
        this.carburantService = carburantService;
    }
    
}
