/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fst.projet.stock.domain.service;

import fst.projet.stock.bean.Carburant;
import java.util.List;

/**
 *
 * @author amal
 */
public interface CarburantService {
            public Carburant findByLibelle(String Libelle);
            public int save(Carburant carburant);
            public List<Carburant> findAll();

}
