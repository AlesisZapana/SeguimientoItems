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
public class TipoTableModel extends DefaultTableModel{
    private String[] columnNames = {"Tipo","Estados"};
    private Class[] columnTypes={Tipo.class,String.class};
    private Object[][] data= {
        //{new Estado("Creado")}
    };
    private List<Tipo> listaTipo;
    
    
    public TipoTableModel(){
        this.setColumnIdentifiers(columnNames);
    }
}
