/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fst.projet.stock.ws.rest;

import fst.projet.stock.bean.Model;
import fst.projet.stock.domain.service.ModelService;
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
@RequestMapping("/stock/model")
public class ModelRest {
    @Autowired
    private ModelService modelService;

    @GetMapping("/libelle/{libelle}")
    public Model findByLibelle(@PathVariable String libelle) {
        return modelService.findByLibelle(libelle);
    }
    @GetMapping("/")
    public List<Model> findAll() {
        return modelService.findAll();
    }

    @PostMapping("/")
    public int save(@RequestBody Model model) {
        return modelService.save(model);
    }

    public ModelService getModelService() {
        return modelService;
    }

    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }
    
    
}
