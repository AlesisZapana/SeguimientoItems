/*
 * GPL.
 */
package Modelo;

import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ale
 */
public class EquipoTableModel extends DefaultTableModel{
    private String[] columnNames={"Equipos","Especialidad","Miembros","Descripcion"};
    private Class[] columnTypes={Equipo.class,String.class,String.class,String.class};
    private Object[][] data= {
    };
    private List<Equipo> listaEquipo;
    
    public EquipoTableModel(){
        this.setColumnIdentifiers(columnNames);
    }
    
    @Override
    public boolean isCellEditable(int row,int column){
        return false;
    }
}
