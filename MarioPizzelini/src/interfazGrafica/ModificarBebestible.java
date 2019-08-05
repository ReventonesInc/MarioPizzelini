/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazGrafica;

import clases.Bebestible;
import clases.MarioPizzelini;
import javax.swing.JOptionPane;

/**
 *
 * @author XavierKrostya
 */
public class ModificarBebestible extends javax.swing.JFrame {
    
    private MarioPizzelini empresa;
    private String rut;
    /**
     * Creates new form ModificarBebestible
     */
    public ModificarBebestible(MarioPizzelini empresa, String rut) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.empresa = empresa;
        this.rut = rut;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTexto4 = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelTexto1 = new javax.swing.JLabel();
        jLabelTexto2 = new javax.swing.JLabel();
        jTextIDBuscar = new javax.swing.JTextField();
        jLabelD = new javax.swing.JLabel();
        jbBuscar = new javax.swing.JButton();
        jLabelTexto3 = new javax.swing.JLabel();
        jTextID = new javax.swing.JTextField();
        jLabelDMod = new javax.swing.JLabel();
        jLabelPrecio = new javax.swing.JLabel();
        jTextPrecio = new javax.swing.JTextField();
        jLabelNombre = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        jLabelDescripcion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea = new javax.swing.JTextArea();
        jbCancelar = new javax.swing.JButton();
        jbAceptar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabelDisponibilidad = new javax.swing.JLabel();
        jComboBoxDisponibilidad = new javax.swing.JComboBox<>();
        jTextCantidad = new javax.swing.JTextField();
        jLabelCantidad1 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTexto4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelTexto4.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTexto4.setText("correctamente:");
        getContentPane().add(jLabelTexto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabelTitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("MODIFICAR BEBESTIBLES");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabelTexto1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelTexto1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTexto1.setText("Para modificar un bebestible deberá");
        getContentPane().add(jLabelTexto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabelTexto2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelTexto2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTexto2.setText("ingresar la indentificación:");
        getContentPane().add(jLabelTexto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jTextIDBuscar.setBackground(new java.awt.Color(51, 51, 51));
        jTextIDBuscar.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTextIDBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 130, -1));

        jLabelD.setBackground(new java.awt.Color(51, 51, 51));
        jLabelD.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelD.setForeground(new java.awt.Color(255, 255, 255));
        jLabelD.setText("ID:");
        getContentPane().add(jLabelD, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jbBuscar.setBackground(new java.awt.Color(153, 0, 0));
        jbBuscar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jbBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jbBuscar.setText("Buscar");
        jbBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jbBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 80, 30));

        jLabelTexto3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelTexto3.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTexto3.setText("Ingresa los datos que desea modificar");
        getContentPane().add(jLabelTexto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jTextID.setBackground(new java.awt.Color(51, 51, 51));
        jTextID.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTextID, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 110, -1));

        jLabelDMod.setBackground(new java.awt.Color(51, 51, 51));
        jLabelDMod.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelDMod.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDMod.setText("ID:");
        getContentPane().add(jLabelDMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jLabelPrecio.setBackground(new java.awt.Color(51, 51, 51));
        jLabelPrecio.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelPrecio.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPrecio.setText("PRECIO:");
        getContentPane().add(jLabelPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jTextPrecio.setBackground(new java.awt.Color(51, 51, 51));
        jTextPrecio.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTextPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 140, -1));

        jLabelNombre.setBackground(new java.awt.Color(51, 51, 51));
        jLabelNombre.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombre.setText("NOMBRE:");
        getContentPane().add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        jTextNombre.setBackground(new java.awt.Color(51, 51, 51));
        jTextNombre.setForeground(new java.awt.Color(255, 255, 255));
        jTextNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNombreActionPerformed(evt);
            }
        });
        getContentPane().add(jTextNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 130, -1));

        jLabelDescripcion.setBackground(new java.awt.Color(51, 51, 51));
        jLabelDescripcion.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDescripcion.setText("DESCRIPCIÓN:");
        getContentPane().add(jLabelDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        jTextArea.setBackground(new java.awt.Color(51, 51, 51));
        jTextArea.setColumns(20);
        jTextArea.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea.setRows(5);
        jScrollPane1.setViewportView(jTextArea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, -1, 80));

        jbCancelar.setBackground(new java.awt.Color(153, 0, 0));
        jbCancelar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jbCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jbCancelar.setText("Cancelar");
        jbCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jbCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));

        jbAceptar.setBackground(new java.awt.Color(153, 0, 0));
        jbAceptar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jbAceptar.setForeground(new java.awt.Color(255, 255, 255));
        jbAceptar.setText("Modificar");
        jbAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(jbAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 450, -1, -1));

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 486, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 490, -1));

        jLabelDisponibilidad.setBackground(new java.awt.Color(51, 51, 51));
        jLabelDisponibilidad.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelDisponibilidad.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDisponibilidad.setText("Disponibilidad:");
        getContentPane().add(jLabelDisponibilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, -1, -1));

        jComboBoxDisponibilidad.setBackground(new java.awt.Color(51, 51, 51));
        jComboBoxDisponibilidad.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jComboBoxDisponibilidad.setForeground(new java.awt.Color(255, 255, 255));
        jComboBoxDisponibilidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "False", "True" }));
        getContentPane().add(jComboBoxDisponibilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, -1, -1));

        jTextCantidad.setBackground(new java.awt.Color(51, 51, 51));
        jTextCantidad.setForeground(new java.awt.Color(255, 255, 255));
        jTextCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCantidadActionPerformed(evt);
            }
        });
        getContentPane().add(jTextCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 130, -1));

        jLabelCantidad1.setBackground(new java.awt.Color(51, 51, 51));
        jLabelCantidad1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelCantidad1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCantidad1.setText("CANTIDAD:");
        getContentPane().add(jLabelCantidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 110, 20));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/imagenes/FondoRojoMOD.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        String id = jTextIDBuscar.getText();
        Bebestible buscado = empresa.buscarBebestibleID(rut, id);
        int monto = 0;
        int cantidad = 0;
        boolean disponibilidad;

        if(buscado != null){
            jTextID.setText(id);
            jTextNombre.setText(buscado.getNombre());
            monto = buscado.getPrecio();
            jTextPrecio.setText(String.valueOf(monto));
            jTextArea.setText(buscado.getDescripcion());
            cantidad = buscado.getCantidad();
            jTextCantidad.setText(String.valueOf(cantidad));
            disponibilidad = buscado.getDisponibilidad();
            int miEntero = disponibilidad ? 1 : 0;
            jComboBoxDisponibilidad.setSelectedIndex(miEntero);
        }
        else{
            JOptionPane.showMessageDialog(null,"¡La ID no existe!");
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jTextNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNombreActionPerformed
    
    /**
     * Acción para cancelar la operación.
     * @param evt 
     */
    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        MenuBebestible frame = new MenuBebestible(empresa,rut);
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbCancelarActionPerformed
    
    /**
     * Acción para modificar el bebestible.
     * @param evt 
     */
    private void jbAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAceptarActionPerformed
        String id = jTextID.getText();
        String precio = jTextPrecio.getText();
        String nombre = jTextNombre.getText();
        String descripcion = jTextArea.getText();
        String cantidad = jTextCantidad.getText();
        int disponibilidad = jComboBoxDisponibilidad.getSelectedIndex();
        int monto = 0;
        int cantidadReal = 0;
        boolean bool = true;

        if(!(id.equals("") || precio.equals("") || nombre.equals("") || descripcion.equals(""))){
            if(validarNumero(precio)){
                monto = Integer.parseInt(precio);
                cantidadReal = Integer.parseInt(cantidad);
                if(disponibilidad == 0){
                    bool = false;
                }
                if(empresa.modificarBebestible(rut, jTextIDBuscar.getText(), new Bebestible(Integer.parseInt(id),nombre,monto,descripcion,cantidadReal,bool))){
                    JOptionPane.showMessageDialog(null,"¡El bebestible fue modificado con exito!");
                    MenuBebestible frame = new MenuBebestible(empresa,rut);
                    frame.setVisible(true);
                    this.dispose();
                }
                else{
                    JOptionPane.showMessageDialog(null,"¡El bebestible no fue modificado!");
                }
            }
            else{
                JOptionPane.showMessageDialog(null,"¡El precio ingresado no es valido!");
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
      
    private void jTextCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCantidadActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JComboBox<String> jComboBoxDisponibilidad;
    private javax.swing.JLabel jLabelCantidad1;
    private javax.swing.JLabel jLabelD;
    private javax.swing.JLabel jLabelDMod;
    private javax.swing.JLabel jLabelDescripcion;
    private javax.swing.JLabel jLabelDisponibilidad;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelPrecio;
    private javax.swing.JLabel jLabelTexto1;
    private javax.swing.JLabel jLabelTexto2;
    private javax.swing.JLabel jLabelTexto3;
    private javax.swing.JLabel jLabelTexto4;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea;
    private javax.swing.JTextField jTextCantidad;
    private javax.swing.JTextField jTextID;
    private javax.swing.JTextField jTextIDBuscar;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextPrecio;
    private javax.swing.JButton jbAceptar;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbCancelar;
    // End of variables declaration//GEN-END:variables
}
