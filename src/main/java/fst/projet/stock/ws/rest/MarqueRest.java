/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fst.projet.stock.ws.rest;

import fst.projet.stock.bean.Marque;
import fst.projet.stock.domain.service.MarqueService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@RequestMapping("/stock/marque")
@CrossOrigin("http://localhost:4200")
public class MarqueRest {

    @Autowired
    private MarqueService marqueService ;

    @GetMapping("/libelle/{libelle}")
    public Marque findByLibelle(@PathVariable String libelle) {
        return marqueService.findByLibelle(libelle);
    }

    @GetMapping("/")
    public List<Marque> findAll() {
        return marqueService.findAll();
    }

    @PostMapping("/")
    public int save(@RequestBody Marque marque) {
        return marqueService.save(marque);
    }

    public MarqueService getMarqueService() {
        return marqueService;
    }

    public void setMarqueService(MarqueService marqueService) {
        this.marqueService = marqueService;
    }

}
