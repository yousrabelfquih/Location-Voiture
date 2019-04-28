/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fst.projet.stock.ws.rest;

import fst.projet.stock.bean.Marque;
import fst.projet.stock.domain.service.MarqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author yousr
 */
@RestController
@RequestMapping("/stock/marque")
public class MarqueRest {
    @Autowired
    private MarqueService marqueService;

    @GetMapping("")
    public Marque findByLibelle(String libelle) {
        return marqueService.findByLibelle(libelle);
    }

    public int save(Marque marque) {
        return marqueService.save(marque);
    }

    public MarqueService getMarqueService() {
        return marqueService;
    }

    public void setMarqueService(MarqueService marqueService) {
        this.marqueService = marqueService;
    }
    
}
