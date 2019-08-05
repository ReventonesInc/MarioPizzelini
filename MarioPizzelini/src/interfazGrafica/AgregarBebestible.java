/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazGrafica;
import clases.Bebestible;
import clases.MarioPizzelini;
import javax.swing.JOptionPane;

public class AgregarBebestible extends javax.swing.JFrame {
    
    private MarioPizzelini empresa;
    private String rut;
    
    /**
     * 
     * Creates new form AgregarBebestible
     */
    public AgregarBebestible(MarioPizzelini empresa, String rut) {
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
        jLabelPrecio = new javax.swing.JLabel();
        jTextPrecio = new javax.swing.JTextField();
        jLabelNombre1 = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        jLabelNombre = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea = new javax.swing.JTextArea();
        jbCancelar = new javax.swing.JButton();
        jbAceptar = new javax.swing.JButton();
        jLabelCantidad = new javax.swing.JLabel();
        jTextCantidad = new javax.swing.JTextField();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("AGREGAR BEBESTIBLES");
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
        getContentPane().add(jLabelD, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jTextID.setBackground(new java.awt.Color(51, 51, 51));
        jTextID.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTextID, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 110, -1));

        jLabelPrecio.setBackground(new java.awt.Color(51, 51, 51));
        jLabelPrecio.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelPrecio.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPrecio.setText("PRECIO:");
        getContentPane().add(jLabelPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jTextPrecio.setBackground(new java.awt.Color(51, 51, 51));
        jTextPrecio.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTextPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 140, -1));

        jLabelNombre1.setBackground(new java.awt.Color(51, 51, 51));
        jLabelNombre1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelNombre1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombre1.setText("NOMBRE:");
        getContentPane().add(jLabelNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jTextNombre.setBackground(new java.awt.Color(51, 51, 51));
        jTextNombre.setForeground(new java.awt.Color(255, 255, 255));
        jTextNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNombreActionPerformed(evt);
            }
        });
        getContentPane().add(jTextNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 130, -1));

        jLabelNombre.setBackground(new java.awt.Color(51, 51, 51));
        jLabelNombre.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombre.setText("DESCRIPCIÓN:");
        getContentPane().add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jTextArea.setBackground(new java.awt.Color(51, 51, 51));
        jTextArea.setColumns(20);
        jTextArea.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea.setRows(5);
        jScrollPane1.setViewportView(jTextArea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, -1, -1));

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
        getContentPane().add(jbCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        jbAceptar.setBackground(new java.awt.Color(153, 0, 0));
        jbAceptar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jbAceptar.setForeground(new java.awt.Color(255, 255, 255));
        jbAceptar.setText("Agregar");
        jbAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(jbAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, -1, -1));

        jLabelCantidad.setBackground(new java.awt.Color(51, 51, 51));
        jLabelCantidad.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelCantidad.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCantidad.setText("CANTIDAD:");
        getContentPane().add(jLabelCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 100, -1));

        jTextCantidad.setBackground(new java.awt.Color(51, 51, 51));
        jTextCantidad.setForeground(new java.awt.Color(255, 255, 255));
        jTextCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCantidadActionPerformed(evt);
            }
        });
        getContentPane().add(jTextCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 100, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/imagenes/FondoRojo_opt.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNombreActionPerformed
    
    /**
     * Acción para cancelar la operación.
     * @param evt 
     */
    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        MenuBebestible frame = new MenuBebestible(empresa, rut);
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAceptarActionPerformed
        String id = jTextID.getText();
        String precio = jTextPrecio.getText();
        String nombre = jTextNombre.getText();
        String descripcion = jTextArea.getText();
        String cantidad = jTextCantidad.getText();
        int cantidadReal = 0;
        int monto = 0;

        if(!(id.equals("") || precio.equals("") || nombre.equals("") || descripcion.equals("") || cantidad.equals(""))){
            if(validarNumero(precio)){
                monto = Integer.parseInt(precio);
                cantidadReal = Integer.parseInt(cantidad);
                if(empresa.agregarBebestible(rut, new Bebestible(Integer.parseInt(id),nombre,monto,descripcion,cantidadReal,true))){
                    JOptionPane.showMessageDialog(null,"¡El Bebestible fue registrado con exito!");
                    MenuBebestible frame = new MenuBebestible(empresa,rut);
                    frame.setVisible(true);
                    this.dispose();
                }
                else{
                    JOptionPane.showMessageDialog(null,"¡El Bebestible no fue registrado!");
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

    private void jTextCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCantidadActionPerformed

    public boolean validarNumero(String cadena){
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException excepcion) {
            return false;
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel jLabelCantidad;
    private javax.swing.JLabel jLabelD;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelNombre1;
    private javax.swing.JLabel jLabelPrecio;
    private javax.swing.JLabel jLabelTexto1;
    private javax.swing.JLabel jLabelTexto2;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea;
    private javax.swing.JTextField jTextCantidad;
    private javax.swing.JTextField jTextID;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextPrecio;
    private javax.swing.JButton jbAceptar;
    private javax.swing.JButton jbCancelar;
    // End of variables declaration//GEN-END:variables
}
