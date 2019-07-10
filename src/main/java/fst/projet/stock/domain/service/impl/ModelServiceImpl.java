/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fst.projet.stock.domain.service.impl;

import fst.projet.stock.bean.Model;
import fst.projet.stock.domain.dao.ModelDao;
import fst.projet.stock.domain.service.ModelService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author amal
 */
@Service
public class ModelServiceImpl implements ModelService{

    @Autowired
    private ModelDao modelDao;

    public ModelDao getModelDao() {
        return modelDao;
    }

    public void setModelDao(ModelDao modelDao) {
        this.modelDao = modelDao;
    }
     @Override
    public List<Model> findAll() {
        return modelDao.findAll();
    }
    @Override
    public Model findByLibelle(String Libelle) {
        return modelDao.findByLibelle(Libelle);
    }

    @Override
    public int save(Model model) {
    if (findByLibelle(model.getLibelle()) != null){
                   return -1;
 
         }  else {
            modelDao.save(model);
            return 1;
        }    }

    
}
