/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;
import clases.Ingrediente;
import clases.MarioPizzelini;
import javax.swing.JOptionPane;

public class EliminarIngredientes extends javax.swing.JFrame {
    private MarioPizzelini empresa;
    private String rutEmpresa;
    
    //Constructor
    public EliminarIngredientes(String rutEmpresa, MarioPizzelini empresa) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.empresa = empresa;
        this.rutEmpresa = rutEmpresa;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jLabelTexto1 = new javax.swing.JLabel();
        jLabelTexto2 = new javax.swing.JLabel();
        jLabelD = new javax.swing.JLabel();
        jLabelPrecio = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jTextID = new javax.swing.JTextField();
        jTextPrecio = new javax.swing.JTextField();
        jTextNombre = new javax.swing.JTextField();
        jbSalir = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jbAceptar = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

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

        jLabelPrecio.setBackground(new java.awt.Color(51, 51, 51));
        jLabelPrecio.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelPrecio.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPrecio.setText("PRECIO:");
        getContentPane().add(jLabelPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabelNombre.setBackground(new java.awt.Color(51, 51, 51));
        jLabelNombre.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombre.setText("NOMBRE:");
        getContentPane().add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jTextID.setBackground(new java.awt.Color(51, 51, 51));
        jTextID.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTextID, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 110, -1));

        jTextPrecio.setBackground(new java.awt.Color(51, 51, 51));
        jTextPrecio.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTextPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 140, -1));

        jTextNombre.setBackground(new java.awt.Color(51, 51, 51));
        jTextNombre.setForeground(new java.awt.Color(255, 255, 255));
        jTextNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNombreActionPerformed(evt);
            }
        });
        getContentPane().add(jTextNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 130, -1));

        jbSalir.setBackground(new java.awt.Color(101, 48, 0));
        jbSalir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbSalir.setForeground(new java.awt.Color(255, 255, 255));
        jbSalir.setText("Salir");
        jbSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 70, 30));

        jbCancelar.setBackground(new java.awt.Color(101, 48, 0));
        jbCancelar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jbCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jbCancelar.setText("Cancelar");
        jbCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jbCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        jbAceptar.setBackground(new java.awt.Color(101, 48, 0));
        jbAceptar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jbAceptar.setForeground(new java.awt.Color(255, 255, 255));
        jbAceptar.setText("Eliminar");
        jbAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(jbAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, -1, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/imagenes/fondoop_opt.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jTextNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNombreActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        MenuIngredientes frame = new MenuIngredientes(rutEmpresa,empresa);
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAceptarActionPerformed
        String id = jTextID.getText();
        String precio = jTextPrecio.getText();
        String nombre = jTextNombre.getText();
        
        if(!(id.equals(""))){
            if(empresa.eliminarIngrediente(rutEmpresa, id)){
                JOptionPane.showMessageDialog(null,"¡El ingrediente fue eliminado con exito!");
                MenuIngredientes frame = new MenuIngredientes(rutEmpresa, empresa);
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
    }//GEN-LAST:event_jbAceptarActionPerformed

    public boolean validarNumero(String cadena){
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException excepcion) {
            return false;
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelD;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelPrecio;
    private javax.swing.JLabel jLabelTexto1;
    private javax.swing.JLabel jLabelTexto2;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JTextField jTextID;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextPrecio;
    private javax.swing.JButton jbAceptar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbSalir;
    // End of variables declaration//GEN-END:variables
}
