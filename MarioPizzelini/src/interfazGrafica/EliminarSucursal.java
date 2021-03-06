/*
 * Interfaz gráfica para eliminar una sucursal.
 */
package interfazGrafica;
import clases.MarioPizzelini;
import javax.swing.JOptionPane;

public class EliminarSucursal extends javax.swing.JFrame {

    private MarioPizzelini empresa;
    
    /**
     * Constructor de EliminarSucursal.
     * @param empresa 
     */
    public EliminarSucursal(MarioPizzelini empresa) {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.empresa = empresa;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jLabelTexto1 = new javax.swing.JLabel();
        jLabelTexto2 = new javax.swing.JLabel();
        jLabelRut = new javax.swing.JLabel();
        jTextRut = new javax.swing.JTextField();
        jLabelDireccion = new javax.swing.JLabel();
        jTextDireccion = new javax.swing.JTextField();
        BtnCancelar = new javax.swing.JButton();
        BtnAceptar = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("ELIMINAR SUCURSAL");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabelTexto1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelTexto1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTexto1.setText("Ingrese correctamente los datos");
        getContentPane().add(jLabelTexto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabelTexto2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelTexto2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTexto2.setText("que se pedirán a continuación:");
        getContentPane().add(jLabelTexto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabelRut.setBackground(new java.awt.Color(51, 51, 51));
        jLabelRut.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelRut.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRut.setText("RUT:");
        getContentPane().add(jLabelRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jTextRut.setBackground(new java.awt.Color(51, 51, 51));
        jTextRut.setForeground(new java.awt.Color(255, 255, 255));
        jTextRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextRutActionPerformed(evt);
            }
        });
        getContentPane().add(jTextRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 240, -1));

        jLabelDireccion.setBackground(new java.awt.Color(51, 51, 51));
        jLabelDireccion.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelDireccion.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDireccion.setText("DIRECCIÓN:");
        getContentPane().add(jLabelDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jTextDireccion.setBackground(new java.awt.Color(51, 51, 51));
        jTextDireccion.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTextDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 180, -1));

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

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/imagenes/FondoRojo_opt.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextRutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextRutActionPerformed
    
    /**
     * Acción para cancelar la operación
     * @param evt 
     */
    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        SeleccionSucursal frame = new SeleccionSucursal(empresa);
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnCancelarActionPerformed
    
    /**
     * Acción para eliminar la sucursal
     * @param evt 
     */
    private void BtnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAceptarActionPerformed
        String rutEmpresa = jTextRut.getText();
        String direccion = jTextDireccion.getText();

        if(!(rutEmpresa.equals("") || direccion.equals(""))){
            if(empresa.eliminarSucursal(rutEmpresa)){
                JOptionPane.showMessageDialog(null,"¡La sucursal fue eliminada con exito!");
                SeleccionSucursal frame = new SeleccionSucursal(empresa);
                frame.setVisible(true);
                this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(null,"¡La sucursal no fue eliminada!");
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"¡No existe la sucursal!");
        }
    }//GEN-LAST:event_BtnAceptarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAceptar;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelRut;
    private javax.swing.JLabel jLabelTexto1;
    private javax.swing.JLabel jLabelTexto2;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JTextField jTextDireccion;
    private javax.swing.JTextField jTextRut;
    // End of variables declaration//GEN-END:variables
}
