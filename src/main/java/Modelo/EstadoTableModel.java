/*
 * GPL.
 */
package Modelo;

import java.util.List;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ale
 */
public class EstadoTableModel extends DefaultTableModel{
    private String[] columnNames = {"Estado"};
    private Class[] columnTypes={Estado.class};
    private Object[][] data= {
        {new Estado("Creado")}
    };
    private List<Estado> listaEstado;
    
    public EstadoTableModel() {
        this.setColumnIdentifiers(columnNames);
        //this.setDataVector(data, columnNames);
        
        //m_macDataVector=macDataVector;
    }

}
