/*
 * GPL.
 */
package Controlador;

import Modelo.Estado;
import Modelo.EstadoListModel;
import Modelo.Tipo;
import Vista.DeterminarSecuenciaEstados;
import Vista.Inicio;
import java.util.List;

/**
 *
 * @author ale
 */
public class TipoController {
    
    private static TipoController controller;
    
    private TipoController() {
    }
    
    public static TipoController getInstance() {
        if (controller==null) {
            controller = new TipoController();
        }        
        return controller;
    }
    
    public Tipo nuevoTipo(String nombreTipo,List<Estado> estados){
        Tipo nuevoTipo= new Tipo(nombreTipo,estados);
        return nuevoTipo;
    }
    
    public void agregarTipo(Tipo nuevoTipo,String textoEstados){
        Inicio.ttm.addRow(new Object[]{nuevoTipo,textoEstados});
    }
}
