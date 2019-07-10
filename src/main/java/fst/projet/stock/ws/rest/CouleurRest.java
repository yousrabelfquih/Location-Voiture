/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fst.projet.stock.ws.rest;

import fst.projet.stock.bean.Couleur;
import fst.projet.stock.domain.dao.CouleurDao;
import fst.projet.stock.domain.service.CouleurService;
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
@RequestMapping("/stock/couleur")

public class CouleurRest {
    @Autowired
    private CouleurService couleurService;

    @GetMapping("/libelle/{libelle}")
    public CouleurDao findByLibelle(@PathVariable String libelle) {
        return couleurService.findByLibelle(libelle);
    }
    @GetMapping("/")
    public List<Couleur> findAll() {
        return couleurService.findAll();
    }

    @PostMapping("/")
    public int save(@RequestBody Couleur couleur) {
        return couleurService.save(couleur);
    }

    public CouleurService getCouleurService() {
        return couleurService;
    }

    public void setCouleurService(CouleurService couleurService) {
        this.couleurService = couleurService;
    }
    
    
}
