package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

/***
 * 
 * @author Rodrigo Arturo Ramos Najera
 * @version 1.0
 */

@With(Secure.class)
public class Application extends Controller {

    /*public static void index() {
        render();
    }*/
    
    public static void index() {
        String user = Security.connected();
        render(user);
    }
    
    public static void login() {
        render();
    }
    
    public static void autenticar(String usuario, String password){
        session.put("usuario", usuario);
        index();
    }

}