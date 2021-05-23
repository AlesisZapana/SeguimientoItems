/*
 * GPL.
 */
package Controlador;

import Modelo.Estado;
import Modelo.EstadoTableModel;
import Vista.Inicio;

/**
 *
 * @author ale
 */
public class EstadoController {

    private static EstadoController controller;
    
    private EstadoController(){}
    
    public static EstadoController getInstance(){
        if (controller==null) {
            controller = new EstadoController();
        }        
        return controller;
    }
    
    public Estado nuevoEstado(String nombreEstado){        
        Estado estado=new Estado(nombreEstado);
        EstadoTableModel etm =new EstadoTableModel();
        return estado;
    }
    
    public void agregarEstado(Estado estadoNuevo){
        Inicio.etm.addRow(new Estado[]{estadoNuevo});
    }
}
