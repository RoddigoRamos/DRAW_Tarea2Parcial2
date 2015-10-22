package controllers;

import play.mvc.With;

/**
 *
 * @author Rodrigo Arturo Ramos Najera
 * @version 1.0
 */
@With(Secure.class)
@Check("administrador")
public class Usuarios extends CRUD{
    
    
    
}
