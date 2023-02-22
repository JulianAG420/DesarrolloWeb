/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Tienda.Controller;


import com.Tienda.Entity.Pais;
import com.Tienda.Entity.Persona;
import com.Tienda.Service.IPaisService;
import com.Tienda.Service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author yulien
 */

@Controller
public class PersonaController {
    
    @Autowired
    private IPersonaService personaService;
    
    @Autowired
    private IPaisService paisService;
    
    @GetMapping("/persona")
    public String index(Model model){
        List<Persona> listaPersona = personaService.getAllPersona();
        model.addAttribute("titulo", "Tabla Personas");
        model.addAttribute("personas", listaPersona);
        return "personas";
        
        
    }
    @GetMapping("/personaN")
    public String crearPersona(Model model){
         List<Pais> listaPaises = paisService.listCountry();
         model.addAttribute("persona", new Persona());
         model.addAttribute("paises", listaPaises);
         return "crear";
    }
    
}