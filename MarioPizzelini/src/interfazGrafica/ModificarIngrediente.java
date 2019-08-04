/*
 * Interfaz gráfica para modificar un ingrediente registrado en
 * el inventario de sucursal.
 */
package interfazGrafica;

import clases.Ingrediente;
import clases.MarioPizzelini;
import javax.swing.JOptionPane;

public class ModificarIngrediente extends javax.swing.JFrame {
    
    private MarioPizzelini empresa;
    private String rut;
    
    /**
     * Constructor de ModificarIngrediente
     */
    public ModificarIngrediente(MarioPizzelini empresa, String rut) {
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
        jTextIDBuscar = new javax.swing.JTextField();
        jLabelD = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        BtnBuscar = new javax.swing.JButton();
        jLabelTexto3 = new javax.swing.JLabel();
        jLabelTexto4 = new javax.swing.JLabel();
        jLabelDMod = new javax.swing.JLabel();
        jTextID = new javax.swing.JTextField();
        jLabelPrecio = new javax.swing.JLabel();
        jTextPrecio = new javax.swing.JTextField();
        jLabelNombre = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        BtnCancelar = new javax.swing.JButton();
        BtnModificar = new javax.swing.JButton();
        jLabelDisponibilidad = new javax.swing.JLabel();
        jTextCantidad = new javax.swing.JTextField();
        jLabelCantidad1 = new javax.swing.JLabel();
        jComboBoxDisponibilidad = new javax.swing.JComboBox<>();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("MODIFICAR INGREDIENTES");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabelTexto1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelTexto1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTexto1.setText("Para modificar un ingrediente deberá");
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

        BtnBuscar.setBackground(new java.awt.Color(153, 0, 0));
        BtnBuscar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BtnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        BtnBuscar.setText("Buscar");
        BtnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 80, 30));

        jLabelTexto3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelTexto3.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTexto3.setText("Ingresa los datos que desea modificar");
        getContentPane().add(jLabelTexto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabelTexto4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelTexto4.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTexto4.setText("correctamente:");
        getContentPane().add(jLabelTexto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabelDMod.setBackground(new java.awt.Color(51, 51, 51));
        jLabelDMod.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelDMod.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDMod.setText("ID:");
        getContentPane().add(jLabelDMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        jTextID.setBackground(new java.awt.Color(51, 51, 51));
        jTextID.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTextID, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 110, -1));

        jLabelPrecio.setBackground(new java.awt.Color(51, 51, 51));
        jLabelPrecio.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelPrecio.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPrecio.setText("PRECIO:");
        getContentPane().add(jLabelPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        jTextPrecio.setBackground(new java.awt.Color(51, 51, 51));
        jTextPrecio.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTextPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 140, -1));

        jLabelNombre.setBackground(new java.awt.Color(51, 51, 51));
        jLabelNombre.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombre.setText("NOMBRE:");
        getContentPane().add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        jTextNombre.setBackground(new java.awt.Color(51, 51, 51));
        jTextNombre.setForeground(new java.awt.Color(255, 255, 255));
        jTextNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNombreActionPerformed(evt);
            }
        });
        getContentPane().add(jTextNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 130, -1));

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
        getContentPane().add(BtnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 130, -1));

        BtnModificar.setBackground(new java.awt.Color(153, 0, 0));
        BtnModificar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BtnModificar.setForeground(new java.awt.Color(255, 255, 255));
        BtnModificar.setText("Modificar");
        BtnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 440, 130, -1));

        jLabelDisponibilidad.setBackground(new java.awt.Color(51, 51, 51));
        jLabelDisponibilidad.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelDisponibilidad.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDisponibilidad.setText("Disponibilidad:");
        getContentPane().add(jLabelDisponibilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, -1, -1));

        jTextCantidad.setBackground(new java.awt.Color(51, 51, 51));
        jTextCantidad.setForeground(new java.awt.Color(255, 255, 255));
        jTextCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCantidadActionPerformed(evt);
            }
        });
        getContentPane().add(jTextCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 120, -1));

        jLabelCantidad1.setBackground(new java.awt.Color(51, 51, 51));
        jLabelCantidad1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelCantidad1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCantidad1.setText("CANTIDAD:");
        getContentPane().add(jLabelCantidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, 20));

        jComboBoxDisponibilidad.setBackground(new java.awt.Color(51, 51, 51));
        jComboBoxDisponibilidad.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jComboBoxDisponibilidad.setForeground(new java.awt.Color(255, 255, 255));
        jComboBoxDisponibilidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "False", "True" }));
        getContentPane().add(jComboBoxDisponibilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/imagenes/FondoRojoMOD.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Acción para buscar ingrediente por modificar según la ID
     * @param evt 
     */
    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        String id = jTextIDBuscar.getText();
        Ingrediente buscado = empresa.buscarIngredienteID(rut, id); //Arreglado gracias al debugger : by C bastian
        int monto = 0;
        int cantidad = 0;
        boolean disponibilidad;
        
        if(buscado != null){
            jTextID.setText(id);
            jTextNombre.setText(buscado.getNombre());
            monto = buscado.getPrecio();
            jTextPrecio.setText(String.valueOf(monto));
            cantidad = buscado.getCantidad();
            jTextCantidad.setText(String.valueOf(cantidad));
            disponibilidad = buscado.getDisponibilidad();
            int miEntero = disponibilidad ? 1 : 0;
            jComboBoxDisponibilidad.setSelectedIndex(miEntero);
        }
        else{
            JOptionPane.showMessageDialog(null,"¡La ID no existe!");
        }
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void jTextNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNombreActionPerformed
    
    /**
     * Acción para cancelar la operación.
     * @param evt 
     */
    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        MenuIngrediente frame = new MenuIngrediente(empresa,rut);
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnCancelarActionPerformed
    
    /**
     * Acción para modificar el ingrediente
     * @param evt 
     */
    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
        String id = jTextID.getText();
        String precio = jTextPrecio.getText();
        String nombre = jTextNombre.getText();
        String cantidad = jTextCantidad.getText();
        int disponibilidad = jComboBoxDisponibilidad.getSelectedIndex();
        int monto = 0;
        int cantidadReal = 0;
        boolean bool = true;
        
        if(!(id.equals("") || precio.equals("") || nombre.equals("") || cantidad.equals(""))){
            if(validarNumero(precio)){
                monto = Integer.parseInt(precio);
                cantidadReal = Integer.parseInt(cantidad);
                if(disponibilidad == 0){
                    bool = false;
                }
                if(empresa.modificarIngrediente(rut, jTextIDBuscar.getText(), new Ingrediente(Integer.parseInt(id),nombre,monto,cantidadReal,bool))){
                    JOptionPane.showMessageDialog(null,"¡El ingrediente fue modificado con exito!");
                    MenuIngrediente frame = new MenuIngrediente(empresa,rut);
                    frame.setVisible(true);
                    this.dispose();
                }
                else{
                    JOptionPane.showMessageDialog(null,"¡El ingrediente no fue modificado!");
                }
            }
            else{
                JOptionPane.showMessageDialog(null,"¡El precio ingresado no es valido!");
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"¡Datos no validos!");
        }
    }//GEN-LAST:event_BtnModificarActionPerformed
    
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
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JLabel Fondo;
    private javax.swing.JComboBox<String> jComboBoxDisponibilidad;
    private javax.swing.JLabel jLabelCantidad1;
    private javax.swing.JLabel jLabelD;
    private javax.swing.JLabel jLabelDMod;
    private javax.swing.JLabel jLabelDisponibilidad;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelPrecio;
    private javax.swing.JLabel jLabelTexto1;
    private javax.swing.JLabel jLabelTexto2;
    private javax.swing.JLabel jLabelTexto3;
    private javax.swing.JLabel jLabelTexto4;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextCantidad;
    private javax.swing.JTextField jTextID;
    private javax.swing.JTextField jTextIDBuscar;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextPrecio;
    // End of variables declaration//GEN-END:variables
}
