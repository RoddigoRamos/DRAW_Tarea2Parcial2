
package controllers;

import models.Usuario;

/**
 *
 * @author Rodrigo Arturo Ramos Najera
 */
public class Security extends Secure.Security{
    
    static boolean authenticate(String usuario, String password) {
        Usuario user = Usuario.find("byUsuario", usuario).first();
        return user != null && user.password.equals(password);
    }
    
    static boolean check(String profile) {
        Usuario user = Usuario.find("byUsuario", connected()).first();
        if ("administrador".equals(profile)) {
            return user.esAdmin;
        }
        else {
            return false;
        }
    }   
    
}
