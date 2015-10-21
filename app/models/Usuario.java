package models;

import java.util.Date;
import javax.persistence.Entity;
import play.data.validation.Email;
import play.data.validation.MaxSize;
import play.data.validation.Password;
import play.data.validation.Required;
import play.db.jpa.Model;

/**
 *
 * @author rodrigo
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
