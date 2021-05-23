/*
 * GPL.
 */
package Controlador;

import Modelo.Equipo;
import Modelo.Estado;
import Modelo.Item;
import Modelo.Miembro;
import Modelo.Prioridad;
import Modelo.Tipo;
import Vista.Inicio;

/**
 *
 * @author ale
 */
public class ItemController {
    
    private static ItemController controller;
    
    private ItemController() {
    }
    
    public static ItemController getInstance() {
        if (controller==null) {
            controller = new ItemController();
        }        
        return controller;
    }
    
    public Item nuevoItem(String nombre,Prioridad prioridad, Estado estadoActual, Tipo tipo,Equipo equipo, Miembro responsable){
        Item i=new Item(nombre,prioridad,estadoActual,tipo,equipo,responsable);
        return i;
    }
    
    //siguiente estado por elección
    public void siguienteEstado(Item item,Integer numEstadoActual,Estado estadoActual,Miembro responable){
        item.setNumEstadoActual(numEstadoActual);
        item.setEstadoActual(estadoActual);
        item.setResponsable(responable);
        
    }
    
    //siguiente estado en la secuencia
    public void siguienteEstado(Item item){
        item.setNumEstadoActual(item.getNumEstadoActual()+1);
        item.setEstadoActual(item.getTipo().getEstados().get(item.getNumEstadoActual()));
    }
    
    public boolean compruebaSecuencia(Item item){
        boolean comprueba=true;
        if(item.getNumEstadoActual()==item.getTipo().getEstados().size()-1){
            comprueba=false;
        }
        return comprueba;
    }
    
    public void agregarItem(Item nuevoItem,Prioridad prioridad, Tipo tipoSeleccionado,Estado estadoActual,Equipo equipo, Miembro responsable){
        Inicio.itm.addRow(new Object[]{nuevoItem,prioridad,tipoSeleccionado,estadoActual,equipo,responsable});
    }
    
    public void modificarItem(int fila,Item item){
        Inicio.itm.removeRow(fila);
        Inicio.itm.insertRow(fila,new Object[]{item,item.getPrioridad(),item.getTipo(),item.getEstadoActual(),item.getEquipo(),item.getResponsable()});
    }
}
