
package controllers;

import models.Usuario;

/**
 *
 * @author Rodrigo Arturo Ramos Najera
 */
public class Security extends Secure.Security{
    
    static boolean authenticate(String usuario, String password) {
        Usuario user = Usuario.find("byEmail", usuario).first();
        return user != null && user.password.equals(password);
    }
    
}
