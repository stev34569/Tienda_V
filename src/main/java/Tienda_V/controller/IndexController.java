/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tienda_V.controller;

import Tienda_V.Dao.ClienteDao;
import Tienda_V.domian.Cliente;
import java.util.Arrays;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Data
@Controller
@Slf4j
public class IndexController {
    
    
    @Autowired
    private ClienteDao clienteDao;
    
    @GetMapping("/")
    public String inicio(Model model){
       
      log.info("Ahora se usa arquitectura MVC");
      
      //String mensaje = "Estamos en semna cuantro";
      
     // model.addAttribute("texto",mensaje);
      
      //Cliente cliente = new Cliente("Alonso","kris","jajd@jakhfk","8589595");
      //model.addAttribute("cliente",cliente);
      
      
     // Cliente cliente2 = new Cliente("Alonso","juan","jajd@jakhfk","8589595");
     // var clientes =Arrays.asList("Clientes",cliente2,"cliente3");
     
       var clientes = clienteDao.findAll();
       model.addAttribute("clientes", clientes);
      return "index";
    }
    
    
    
}
