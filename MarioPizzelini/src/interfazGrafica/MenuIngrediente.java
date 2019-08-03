/*
 * Interfaz gráfica para desplegar el menu ingrediente, donde tendrá la
 * lista de todos los ingredientes registrados en el invatiro de la sucursal.
 */
package interfazGrafica;

public class MenuIngrediente extends javax.swing.JFrame {

    /**
     * Constructor de MenuIngrediente
     */
    public MenuIngrediente() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnVolver = new javax.swing.JButton();
        BtnAgregar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        BtnModificar = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        Fondo3 = new javax.swing.JPanel();
        Fondo2 = new javax.swing.JPanel();
        Fondo1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaIngredientes = new javax.swing.JTextArea();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelText1 = new javax.swing.JLabel();
        jLabelText2 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnVolver.setBackground(new java.awt.Color(153, 0, 0));
        BtnVolver.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BtnVolver.setForeground(new java.awt.Color(255, 255, 255));
        BtnVolver.setText("Volver");
        BtnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(BtnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 80, 30));

        BtnAgregar.setBackground(new java.awt.Color(153, 0, 0));
        BtnAgregar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BtnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        BtnAgregar.setText("Agregar");
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 260, -1));

        BtnEliminar.setBackground(new java.awt.Color(153, 0, 0));
        BtnEliminar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BtnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        BtnEliminar.setText("Eliminar");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 260, -1));

        BtnModificar.setBackground(new java.awt.Color(153, 0, 0));
        BtnModificar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BtnModificar.setForeground(new java.awt.Color(255, 255, 255));
        BtnModificar.setText("Modificar");
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 260, -1));

        jPanel6.setBackground(new java.awt.Color(0, 153, 51));
        jPanel6.setForeground(new java.awt.Color(0, 153, 51));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 480));

        Fondo3.setBackground(new java.awt.Color(0, 153, 51));
        Fondo3.setForeground(new java.awt.Color(0, 153, 51));

        javax.swing.GroupLayout Fondo3Layout = new javax.swing.GroupLayout(Fondo3);
        Fondo3.setLayout(Fondo3Layout);
        Fondo3Layout.setHorizontalGroup(
            Fondo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        Fondo3Layout.setVerticalGroup(
            Fondo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(Fondo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 700, 10));

        Fondo2.setBackground(new java.awt.Color(0, 153, 51));
        Fondo2.setForeground(new java.awt.Color(0, 153, 51));

        javax.swing.GroupLayout Fondo2Layout = new javax.swing.GroupLayout(Fondo2);
        Fondo2.setLayout(Fondo2Layout);
        Fondo2Layout.setHorizontalGroup(
            Fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        Fondo2Layout.setVerticalGroup(
            Fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(Fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 10));

        Fondo1.setBackground(new java.awt.Color(0, 153, 51));
        Fondo1.setForeground(new java.awt.Color(0, 153, 51));

        javax.swing.GroupLayout Fondo1Layout = new javax.swing.GroupLayout(Fondo1);
        Fondo1.setLayout(Fondo1Layout);
        Fondo1Layout.setHorizontalGroup(
            Fondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        Fondo1Layout.setVerticalGroup(
            Fondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        getContentPane().add(Fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, 10, 490));

        jTextAreaIngredientes.setBackground(new java.awt.Color(51, 51, 51));
        jTextAreaIngredientes.setColumns(20);
        jTextAreaIngredientes.setForeground(new java.awt.Color(255, 255, 255));
        jTextAreaIngredientes.setRows(5);
        jScrollPane1.setViewportView(jTextAreaIngredientes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 600, 240));

        jLabelTitulo.setFont(new java.awt.Font("Dialog", 1, 35)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("INGREDIENTES REGISTRADOS:");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jLabelText1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelText1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelText1.setText("la lista de ingredientes.");
        getContentPane().add(jLabelText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 280, -1));

        jLabelText2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelText2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelText2.setText("Presione un botón para modificar");
        getContentPane().add(jLabelText2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 280, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/imagenes/FondoRojo.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Acción para agregar un ingrediente al inventario.
     * @param evt 
     */
    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed
        //ventana para agregar
    }//GEN-LAST:event_BtnAgregarActionPerformed
    
    /**
     * Acción para eliminar un ingrediente del inventario.
     * @param evt 
     */
    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        //ventana para eliminar
    }//GEN-LAST:event_BtnEliminarActionPerformed
    
    /**
     * Acción para modificar un ingrediente del inventario.
     * @param evt 
     */
    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
        //ventana para modificar
    }//GEN-LAST:event_BtnModificarActionPerformed
    
    /**
     * Acción para volver al menu del inventario.
     * @param evt 
     */
    private void BtnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVolverActionPerformed
        //volver a menu inventario
    }//GEN-LAST:event_BtnVolverActionPerformed

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
            java.util.logging.Logger.getLogger(MenuIngrediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuIngrediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuIngrediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuIngrediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuIngrediente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JButton BtnVolver;
    private javax.swing.JLabel Fondo;
    private javax.swing.JPanel Fondo1;
    private javax.swing.JPanel Fondo2;
    private javax.swing.JPanel Fondo3;
    private javax.swing.JLabel jLabelText1;
    private javax.swing.JLabel jLabelText2;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaIngredientes;
    // End of variables declaration//GEN-END:variables
}
