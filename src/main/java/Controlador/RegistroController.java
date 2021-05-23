/*
 * GPL.
 */
package Controlador;

import Modelo.Equipo;
import Modelo.Estado;
import Modelo.Historial;
import Modelo.Item;
import Modelo.Miembro;
import Modelo.Prioridad;
import Modelo.Registro;
import Modelo.Tipo;
import Vista.Inicio;
import java.time.LocalDateTime;

/**
 *
 * @author ale
 */
public class RegistroController {
    
    private static RegistroController controller;
    
    private RegistroController() {
    }
    
    public static RegistroController getInstance() {
        if (controller==null) {
            controller = new RegistroController();
        }        
        return controller;
    }
    
    public Registro nuevoRegistro(Item item){
        LocalDateTime fechahora=LocalDateTime.now();
        Registro r=new Registro(item,fechahora);
        return r;
    }
    
    public void agregarRegistro(Registro nuevoRegistro,Prioridad prioridad, Tipo tipoSeleccionado,Estado estadoActual, Equipo equipo, Miembro responsable){
        Historial.addRegistro(nuevoRegistro);        
        Inicio.htm.addRow(new Object[]{nuevoRegistro.getRegistro(),prioridad,tipoSeleccionado,estadoActual,equipo,responsable,nuevoRegistro.getFecha()});

    }
}
