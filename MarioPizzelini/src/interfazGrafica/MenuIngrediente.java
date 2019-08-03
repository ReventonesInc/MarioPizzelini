/*
 * Interfaz gráfica que permite manejar todas las funciones
 * correspondientes para ingredientes del inventario.
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

        jbVolver = new javax.swing.JButton();
        jbAgregar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbMostrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbVolver.setBackground(new java.awt.Color(153, 0, 0));
        jbVolver.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbVolver.setForeground(new java.awt.Color(255, 255, 255));
        jbVolver.setText("Volver");
        jbVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVolverActionPerformed(evt);
            }
        });
        getContentPane().add(jbVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 80, 30));

        jbAgregar.setBackground(new java.awt.Color(153, 0, 0));
        jbAgregar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jbAgregar.setForeground(new java.awt.Color(255, 255, 255));
        jbAgregar.setText("Agregar");
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(jbAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 260, -1));

        jbEliminar.setBackground(new java.awt.Color(153, 0, 0));
        jbEliminar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jbEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(jbEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 260, -1));

        jbModificar.setBackground(new java.awt.Color(153, 0, 0));
        jbModificar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jbModificar.setForeground(new java.awt.Color(255, 255, 255));
        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });
        getContentPane().add(jbModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 260, -1));

        jbMostrar.setBackground(new java.awt.Color(153, 0, 0));
        jbMostrar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jbMostrar.setForeground(new java.awt.Color(255, 255, 255));
        jbMostrar.setText("Mostrar Ingredientes");
        jbMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMostrarActionPerformed(evt);
            }
        });
        getContentPane().add(jbMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 260, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/imagenes/icon_ingredients_opt.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, -1));

        jLabelTitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("INVENTARIO INGREDIENTES");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/imagenes/FondoRojo_opt.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Acción para volver al menú del inventario.
     * @param evt 
     */
    private void jbVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVolverActionPerformed
        //volver al menu inventario
    }//GEN-LAST:event_jbVolverActionPerformed
    
    /**
     * Acción para agregar un ingrediente.
     * @param evt 
     */
    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
        //ingresar a la ventana para agregar un ingrediente
    }//GEN-LAST:event_jbAgregarActionPerformed
    
    /**
     * Acción para eliminar un ingrediente.
     * @param evt 
     */
    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        //ingresar a la ventana para eliminar un ingrediente
    }//GEN-LAST:event_jbEliminarActionPerformed
    
    /**
     * Acción para modificar un ingrediente
     * @param evt 
     */
    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        //ingresar a la ventana para modificar un ingrediente
    }//GEN-LAST:event_jbModificarActionPerformed
    
    /**
     * Acción para mostrar todos los ingredientes.
     * @param evt 
     */
    private void jbMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMostrarActionPerformed
        //mostrar ingredientes en tabla
    }//GEN-LAST:event_jbMostrarActionPerformed

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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbMostrar;
    private javax.swing.JButton jbVolver;
    // End of variables declaration//GEN-END:variables
}
