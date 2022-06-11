/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tienda_V.domian;


import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name="cliente")
public class Cliente  implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;
    String nombre;
    String apellidos;
    String telefono;
    String correo;

    public Cliente() {
    }

    public Cliente(String nombre, String apellidos, String telefonos, String correo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefonos;
        this.correo = correo;
    }
    
    
}
