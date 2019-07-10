/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fst.projet.stock.domain.service;

import fst.projet.stock.bean.Model;
import java.util.List;

/**
 *
 * @author amal
 */
public interface ModelService {
        public Model findByLibelle(String Libelle);
                public int save(Model model);

    public List<Model> findAll();

    
}
