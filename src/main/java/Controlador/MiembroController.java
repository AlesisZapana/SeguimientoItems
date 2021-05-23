/*
 * GPL.
 */
package Controlador;

import Modelo.Miembro;

/**
 *
 * @author ale
 */
public class MiembroController {
    
    private static MiembroController controller;
    
    private MiembroController() {
    }
    
    public static MiembroController getInstance() {
        if (controller==null) {
            controller = new MiembroController();
        }        
        return controller;
    }
    
    public Miembro nuevoMiembro(String nombre,String rol){
        Miembro m=new Miembro(nombre,rol);
        return m;
    }
}
