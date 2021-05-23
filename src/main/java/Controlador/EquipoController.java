/*
 * GPL.
 */
package Controlador;

import Modelo.Equipo;
import Modelo.Miembro;
import Vista.Inicio;
import java.util.ArrayList;

/**
 *
 * @author ale
 */
public class EquipoController {
    
    private static EquipoController controller;
    
    private EquipoController() {
    }
    
    public static EquipoController getInstance() {
        if (controller==null) {
            controller = new EquipoController();
        }        
        return controller;
    }
    
    public Equipo nuevoEquipo(String nombreEquipo,String especialidad,String descripcion,ArrayList<Miembro> miembros){
        Equipo equipo=new Equipo(nombreEquipo,especialidad);
        equipo.setDescripcion(descripcion);
        equipo.setMiembros(miembros);
        return equipo;
    }
    
    public void agregarEquipo(Equipo equipo,String nombreMiembros){
        Inicio.eqtm.addRow(new Object[]{equipo,equipo.getEspecialidad(),nombreMiembros,equipo.getDescripcion()});
    }
}
