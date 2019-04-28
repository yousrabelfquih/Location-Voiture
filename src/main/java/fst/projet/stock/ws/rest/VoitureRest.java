/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fst.projet.stock.ws.rest;

import fst.projet.stock.bean.Carburant;
import fst.projet.stock.bean.Couleur;
import fst.projet.stock.bean.Voiture;
import fst.projet.stock.domain.service.VoitureService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author yousr
 */
@RestController
@RequestMapping("/stock/voiture")
public class VoitureRest {
    @Autowired
    private VoitureService voitureService;

    @GetMapping("/id/{id}")
    public Voiture findById(@PathVariable long id) {
        return voitureService.findById(id);
    }
    @GetMapping("/voitures")
    public List<Voiture> findAll() {
       return voitureService.findAll();
    }
    @PostMapping("/")
    public Voiture save(@RequestBody Voiture voiture) {
        return voitureService.save(voiture);
    }
    
    @PutMapping("/id/{id}/coutParJour/{coutParJour}")
    public Voiture ajout(@PathVariable Long id,@PathVariable String matricule,@PathVariable Couleur couleur,@PathVariable String model,@PathVariable Carburant carburant,@PathVariable Double puissance,@PathVariable Double coutParJour) {
        return voitureService.ajout(id, matricule, couleur, model, carburant, puissance, coutParJour);
    }

    public VoitureService getVoitureService() {
        return voitureService;
    }

    public void setVoitureService(VoitureService voitureService) {
        this.voitureService = voitureService;
    }
    
}
