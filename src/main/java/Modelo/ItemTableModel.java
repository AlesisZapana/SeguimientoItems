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
public class ItemTableModel extends DefaultTableModel{
    private String[] columnNames = {"Item","Prioridad","Tipo","Estado Actual","Equipo","Responsable"};
    private Class[] columnTypes={Item.class,Prioridad.class,Tipo.class,Estado.class,Equipo.class,Miembro.class};
    private Object[][] data= {
        //{new Estado("Creado")}
    };
    private List<Tipo> listaItems;
    
    public ItemTableModel(){
        this.setColumnIdentifiers(columnNames);
    }
    
    @Override
    public boolean isCellEditable(int row,int column){
        return false;
    }

}
