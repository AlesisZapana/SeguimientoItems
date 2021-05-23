/*
 * GPL.
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;

/**
 *
 * @author ale
 */
public class EstadoListModel extends DefaultListModel{

    private List<Estado> listaEstado;
    /*private static EstadoListModel estadoListModel;
    
    private EstadoListModel(){
        
    }
    
    public static EstadoListModel getInstance(){
       if (estadoListModel==null) {
            estadoListModel = new EstadoListModel();
        }        
        return estadoListModel;
    }*/
    
    //puede llenarse con la base de datos
    //private ArrayList listaEstado=new ArrayList<>();
    
    /*@Override
    public int getSize() {
        return listaEstado.size();
    }*/

    /*@Override
    public Object getElementAt(int index) {
        Estado e = listaEstado.get(index);
        return e.getNombre();
    }*/
    
    public void agregarEstado(Estado e) {
        listaEstado.add(e);
        this.fireIntervalAdded(this, getSize(), getSize()+1);
    }
    
    public Estado getEstado(int index){
        return listaEstado.get(index);
    }

}