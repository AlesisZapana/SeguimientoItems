/*
 * GPL.
 */
package Vista;

import Controlador.ItemController;
import Controlador.RegistroController;
import Modelo.Equipo;
import Modelo.Estado;
import Modelo.Historial;
import Modelo.Item;
import Modelo.Miembro;
import Modelo.Prioridad;
import Modelo.Registro;
import Modelo.Tipo;
import Modelo.TipoListCellRenderer;
import java.awt.event.ItemEvent;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author ale
 */
public class NuevoItem extends javax.swing.JDialog {

    final DefaultComboBoxModel model = new DefaultComboBoxModel();
    private ItemController itemController=ItemController.getInstance();
    private RegistroController registroController=RegistroController.getInstance();
    
    public NuevoItem(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        comboTipos.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboResponsables = new javax.swing.JComboBox<>();
        BotonCrearItem = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        comboEquipos = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textoNombreItem = new javax.swing.JTextField();
        comboTipos = new javax.swing.JComboBox<>();
        comboPrioridades = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nuevo item");

        BotonCrearItem.setText("Crear Item");
        BotonCrearItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCrearItemActionPerformed(evt);
            }
        });

        jLabel6.setText("Equipo:");

        comboEquipos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboEquiposItemStateChanged(evt);
            }
        });
        comboEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEquiposActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre:");

        jLabel2.setText("Prioridad:");

        jLabel4.setText("Tipo:");

        jLabel5.setText("Responsable:");

        textoNombreItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoNombreItemActionPerformed(evt);
            }
        });

        comboTipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTiposActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboTipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoNombreItem, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboPrioridades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 45, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonCrearItem)
                .addGap(124, 124, 124))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(36, 36, 36)
                .addComponent(comboResponsables, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(textoNombreItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboTipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboPrioridades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboResponsables, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(BotonCrearItem)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setComboResponsables(Equipo equipoSeleccionado){

        Miembro integrantes[]=new Miembro[equipoSeleccionado.getMiembros().size()];
        List<Miembro> miembros=equipoSeleccionado.getMiembros();

        for (int i = 0; i < miembros.size(); i++) {
            integrantes[i]=miembros.get(i);
        }
            
        comboResponsables.setModel(new DefaultComboBoxModel(integrantes));
    }
    private void textoNombreItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoNombreItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoNombreItemActionPerformed

    private void comboTiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTiposActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboTiposActionPerformed

    private void comboEquiposItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboEquiposItemStateChanged
        //si el equipo es seleccionado se cargan los miembros que pertenecen al equipo
        if(evt.getStateChange()==ItemEvent.SELECTED){
            Equipo equipoSeleccionado=(Equipo) comboEquipos.getSelectedItem();
            Miembro integrantes[]=new Miembro[equipoSeleccionado.getMiembros().size()];
            List<Miembro> miembros=equipoSeleccionado.getMiembros();
            
            for (int i = 0; i < miembros.size(); i++) {
                integrantes[i]=miembros.get(i);
            }
            
            comboResponsables.setModel(new DefaultComboBoxModel(integrantes));
        }
    }//GEN-LAST:event_comboEquiposItemStateChanged

    private void BotonCrearItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCrearItemActionPerformed
        if(textoNombreItem.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Completa el nombre del Item","Aviso",JOptionPane.INFORMATION_MESSAGE);            
        }else{

        //obtiene los datos elegidos de los elementos
        Prioridad prioridad=(Prioridad) comboPrioridades.getSelectedItem();
        Tipo tipoSeleccionado=(Tipo) comboTipos.getSelectedItem();
        
        //el estado actual es el primero en la secuencia
        Estado estadoActual=tipoSeleccionado.getEstados().get(0);
        
        Equipo equipo=(Equipo)comboEquipos.getSelectedItem();
        Miembro responsable=(Miembro)comboResponsables.getSelectedItem();
        
        //crear el item
        Item nuevoItem=itemController.nuevoItem(textoNombreItem.getText(),prioridad,estadoActual,tipoSeleccionado,equipo,responsable);
        
        //inserta el item en la lista
        itemController.agregarItem(nuevoItem, prioridad, tipoSeleccionado, estadoActual, equipo, responsable);
        System.out.println("Se ha creado el item con el nombre "+nuevoItem.getNombre()+" con el estado "+nuevoItem.getEstadoActual().getNombre()+" al responsable "+nuevoItem.getResponsable().getNombre());

        //agrega el registro en el historial
        Registro nuevoRegistro=registroController.nuevoRegistro(nuevoItem);        
        registroController.agregarRegistro(nuevoRegistro, prioridad, tipoSeleccionado, estadoActual, equipo, responsable);
        
        this.setVisible(false);}
    }//GEN-LAST:event_BotonCrearItemActionPerformed

    private void comboEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEquiposActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboEquiposActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NuevoItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevoItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevoItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevoItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NuevoItem dialog = new NuevoItem(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCrearItem;
    public javax.swing.JComboBox<String> comboEquipos;
    public javax.swing.JComboBox<String> comboPrioridades;
    private javax.swing.JComboBox<String> comboResponsables;
    public javax.swing.JComboBox<String> comboTipos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField textoNombreItem;
    // End of variables declaration//GEN-END:variables
}