/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tienda_V.Dao;

import Tienda_V.domian.Cliente;
import org.springframework.data.repository.CrudRepository;


public interface ClienteDao extends  CrudRepository<Cliente, Long>{
    
}
