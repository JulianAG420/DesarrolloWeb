/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Tienda.Service;

import com.Tienda.Entity.Pais;
import com.Tienda.Repository.PaisRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author yulien
 */

@Service
public class PaisService implements IPaisService {
    
    @Autowired
    private PaisRepository paisRepository;
    
    @Override
    public List<Pais> listCountry() {
        return (List<Pais>)paisRepository.findAll();
    }
   
}
