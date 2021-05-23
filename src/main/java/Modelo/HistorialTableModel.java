/*
 * GPL.
 */
package Modelo;

import javax.swing.table.DefaultTableModel;
import java.time.LocalDateTime;
import java.util.List;
/**
 *
 * @author ale
 */
public class HistorialTableModel extends DefaultTableModel{
    private String[] columnNames = {"Item","Prioridad","Tipo","Estado Actual","Equipo","Responsable","Fecha y Hora"};
    private Class[] columnTypes={Item.class,Prioridad.class,Tipo.class,Estado.class,Equipo.class,Miembro.class,LocalDateTime.class};
    private Object[][] data= {
        //{new Estado("Creado")}
    };
    
    private List<Registro> listaRegistros;
    
    public HistorialTableModel(){
        this.setColumnIdentifiers(columnNames);
    }
    
    @Override
    public boolean isCellEditable(int row,int column){
        return false;
    }    
    
}
