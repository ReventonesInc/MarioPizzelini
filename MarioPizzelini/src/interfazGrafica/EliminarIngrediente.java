/*
 * Interfaz gráfica para eliminar un ingrediente registrado en
 * el inventario de sucursal.
 */
package interfazGrafica;

import clases.MarioPizzelini;
import javax.swing.JOptionPane;

public class EliminarIngrediente extends javax.swing.JFrame {
    
    private MarioPizzelini empresa;
    private String rut;
    
    /**
     * Constructor de EliminarIngrediente
     */
    public EliminarIngrediente(MarioPizzelini empresa, String rut) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.empresa = empresa;
        this.rut = rut;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jLabelTexto1 = new javax.swing.JLabel();
        jLabelTexto2 = new javax.swing.JLabel();
        jLabelD = new javax.swing.JLabel();
        jTextID = new javax.swing.JTextField();
        BtnAceptar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("ELIMINAR INGREDIENTES");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabelTexto1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelTexto1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTexto1.setText("Ingrese correctamente los datos");
        getContentPane().add(jLabelTexto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabelTexto2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelTexto2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTexto2.setText("que se pedirán a continuación:");
        getContentPane().add(jLabelTexto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabelD.setBackground(new java.awt.Color(51, 51, 51));
        jLabelD.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelD.setForeground(new java.awt.Color(255, 255, 255));
        jLabelD.setText("ID:");
        getContentPane().add(jLabelD, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jTextID.setBackground(new java.awt.Color(51, 51, 51));
        jTextID.setForeground(new java.awt.Color(255, 255, 255));
        jTextID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIDActionPerformed(evt);
            }
        });
        getContentPane().add(jTextID, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 110, -1));

        BtnAceptar.setBackground(new java.awt.Color(153, 0, 0));
        BtnAceptar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BtnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        BtnAceptar.setText("Eliminar");
        BtnAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, -1, -1));

        BtnCancelar.setBackground(new java.awt.Color(153, 0, 0));
        BtnCancelar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BtnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        BtnCancelar.setText("Cancelar");
        BtnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/imagenes/FondoRojo_opt.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextIDActionPerformed
    
    /**
     * Acción para eliminar un ingrediente del inventario
     * @param evt 
     */
    private void BtnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAceptarActionPerformed
        String id = jTextID.getText();
        
        if(!(id.equals(""))){
            if(empresa.eliminarIngrediente(rut, id)){
                JOptionPane.showMessageDialog(null,"¡El ingrediente fue eliminado con exito!");
                MenuIngrediente frame = new MenuIngrediente(empresa, rut);
                frame.setVisible(true);
                this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(null,"¡El ingrediente no fue eliminado!");
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"¡Datos no validos!");
        }
    }//GEN-LAST:event_BtnAceptarActionPerformed
    
    /**
     * Acción para cancelar la operación
     * @param evt 
     */
    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        MenuIngrediente frame = new MenuIngrediente(empresa,rut);
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAceptar;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel jLabelD;
    private javax.swing.JLabel jLabelTexto1;
    private javax.swing.JLabel jLabelTexto2;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JTextField jTextID;
    // End of variables declaration//GEN-END:variables
}
