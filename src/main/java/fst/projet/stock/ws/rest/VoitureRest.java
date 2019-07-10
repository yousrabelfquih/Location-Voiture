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

    @GetMapping("/matricule/{matricule}")
    public Voiture findByMatricule(@PathVariable String matricule) {
        return voitureService.findByMatricule(matricule);
    }
    @GetMapping("/")
    public List<Voiture> findAll() {
       return voitureService.findAll();
    }
    @PostMapping("/")
    public int save(@RequestBody Voiture voiture) {
        return voitureService.save(voiture);
    }
    

    public VoitureService getVoitureService() {
        return voitureService;
    }

    public void setVoitureService(VoitureService voitureService) {
        this.voitureService = voitureService;
    }
    
}
