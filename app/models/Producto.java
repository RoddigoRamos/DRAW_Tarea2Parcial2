/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Date;
import javax.persistence.Entity;
import play.data.validation.Required;
import play.db.jpa.Model;

/**
 *
 * @author rodrigo
 */

@Entity
public class Producto extends Model{
    
    @Required
    public Integer clave;
    public String nombre;
    public String descripcion;
    public Double precio;
    public Integer cantidad;
    public Date fechaCaducidad;

    public Producto(Integer clave, String nombre, String descripcion, Double precio, Integer cantidad, Date fechaCaducidad) {
        this.clave = clave;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
        this.fechaCaducidad = fechaCaducidad;
    }

    public Producto() {
    
    }
        
    @Override
    public String toString() {
        return String.format("%s %s %s %d", this.clave, this.nombre, 
                this.descripcion, this.precio);
    }
    
    
    
}
