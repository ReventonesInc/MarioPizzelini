/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazGrafica;
import clases.MarioPizzelini;
import clases.Sucursal;
import javax.swing.JOptionPane;

/**
 *
 * @author XavierKrostya
 */
public class SeleccionAgregarSucursal extends javax.swing.JFrame {
    
    private MarioPizzelini empresa;
    /**
     * Constructor de SeleccionAgregarSucursal
     */
    public SeleccionAgregarSucursal(MarioPizzelini empresa) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.empresa = empresa;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jLabelTexto1 = new javax.swing.JLabel();
        jLabelTexto3 = new javax.swing.JLabel();
        jLabelTexto2 = new javax.swing.JLabel();
        jLabelRut = new javax.swing.JLabel();
        jTextRut = new javax.swing.JTextField();
        jLabelDireccion = new javax.swing.JLabel();
        jTextDireccion = new javax.swing.JTextField();
        BtnCancelar = new javax.swing.JButton();
        BtnAgregar = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("AGREGAR SUCURSAL");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabelTexto1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelTexto1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTexto1.setText("Para iniciar el programa debe registrar una");
        getContentPane().add(jLabelTexto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabelTexto3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelTexto3.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTexto3.setText("sucursal. Porfavor, ingresar correctamente");
        getContentPane().add(jLabelTexto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabelTexto2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelTexto2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTexto2.setText("los datos que se pedirán a continuación:");
        getContentPane().add(jLabelTexto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

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
        getContentPane().add(BtnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 130, -1));

        BtnAgregar.setBackground(new java.awt.Color(153, 0, 0));
        BtnAgregar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BtnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        BtnAgregar.setText("Agregar");
        BtnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 130, -1));

        BtnSalir.setBackground(new java.awt.Color(153, 0, 0));
        BtnSalir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BtnSalir.setForeground(new java.awt.Color(255, 255, 255));
        BtnSalir.setText("Salir");
        BtnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(BtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 70, 30));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/imagenes/FondoRojo_opt.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextRutActionPerformed

    }//GEN-LAST:event_jTextRutActionPerformed
    
    /**
     * Acción para volver al inicio del programa.
     * @param evt 
     */
    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        Inicio frame = new Inicio(empresa);
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnCancelarActionPerformed
    
    /**
     * Acción para agregar una sucursal inicial en caso de no
     * existir una.
     * @param evt 
     */
    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed
        String rutEmpresa = jTextRut.getText();
        String direccion = jTextDireccion.getText();
        
        if(!(rutEmpresa.equals("") || direccion.equals(""))){
            if(empresa.agregarSucursal(new Sucursal(rutEmpresa,direccion))){
                JOptionPane.showMessageDialog(null,"¡La sucursal fue registrada con exito!");
                /*
                MenuPrincipal frame = new MenuPrincipal(rutEmpresa, empresa);
                frame.setVisible(true);
                this.dispose();
                */
            }
            else{
                JOptionPane.showMessageDialog(null,"¡La sucursal no fue registrada!");
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"¡Datos no validos!");
        }
    }//GEN-LAST:event_BtnAgregarActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnSalirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelRut;
    private javax.swing.JLabel jLabelTexto1;
    private javax.swing.JLabel jLabelTexto2;
    private javax.swing.JLabel jLabelTexto3;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JTextField jTextDireccion;
    private javax.swing.JTextField jTextRut;
    // End of variables declaration//GEN-END:variables
}
