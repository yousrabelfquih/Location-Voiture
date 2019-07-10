/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fst.projet.stock.domain.service;

import fst.projet.stock.bean.Couleur;
import fst.projet.stock.bean.LocationDetail;
import fst.projet.stock.bean.Voiture;
import java.util.List;

/**
 *
 * @author amal
 */
public interface LocationDetailService {
    
        public LocationDetail findByVoiture(Voiture voiture);
        public List<LocationDetail> findAll();
        public int save(LocationDetail locationDetail);
        public double calcultotal(List<LocationDetail> locationdetail);


}
