package models;

import java.util.Date;
import javax.persistence.Entity;
import play.data.validation.*;
import play.db.jpa.Model;
import play.mvc.With;

/**
 * Modelo del usuario
 * 
 * @author Rodrigo Arturo Ramos Najera
 *  * 
 */
@Entity
public class Usuario extends Model{
    
    @Required
    @MaxSize(value=20)
    public String usuario;
    @Password
    public String password;
    public String primerApellido;
    public String segundoApellido;
    public String nombre;
    public Date fechaNacimiento;
    @Email
    @Required
    public String email;
    public Boolean esAdmin;

    public Usuario(String usuario, String password, String primerApellido, String segundoApellido, String nombre, Date fechaNacimiento, String email) {
        this.usuario = usuario;
        this.password = password;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.email = email;
    }

    public Usuario() {
    
    }
 
    @Override
    public String toString() {
        return String.format("%s %s", this.nombre, this.primerApellido);
    }    
       
}
