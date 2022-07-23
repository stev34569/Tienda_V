package Tienda_V.controller;

import Tienda_V.Service.ArticuloService;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@Slf4j
public class IndexController {
    
    @Autowired
    private ArticuloService articuloService;
    
    @GetMapping("/")
    
    public String inicio(Model model){
         log.info("Ahora se usa arquitectura MVC");

        var articulos = articuloService.getArticulos(true);
        
        model.addAttribute("articulos", articulos);
        
        return "index";
    }
    

}
