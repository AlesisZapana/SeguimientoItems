/*
 * GPL.
 */
package Modelo;

import java.util.List;
import javax.swing.DefaultListModel;

/**
 *
 * @author ale
 */
public class MiembroListModel extends DefaultListModel{
    
    private List<Miembro> listaMiembros;
    
    
    public void agregarMiembro(Miembro m) {
        listaMiembros.add(m);
        this.fireIntervalAdded(this, getSize(), getSize()+1);
    }
    
    public Miembro getMiembro(int index){
        return listaMiembros.get(index);
    }

}
