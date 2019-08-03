/*
 * Interfaz gráfica para manejar el inventario de la sucursal
 * anteriormente seleccionada.
 */
package interfazGrafica;

public class MenuInventario extends javax.swing.JFrame {

    /**
     * Constructor de MenuInventario
     */
    public MenuInventario() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jLabelImagen = new javax.swing.JLabel();
        jbVolver = new javax.swing.JButton();
        BtnIngredientes = new javax.swing.JButton();
        BtnBebestibles = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("INVENTARIO SUCURSAL");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabelImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/imagenes/inventario-icon_opt.png"))); // NOI18N
        getContentPane().add(jLabelImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, -1));

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

        BtnIngredientes.setBackground(new java.awt.Color(153, 0, 0));
        BtnIngredientes.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BtnIngredientes.setForeground(new java.awt.Color(255, 255, 255));
        BtnIngredientes.setText("Ingredientes");
        BtnIngredientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIngredientesActionPerformed(evt);
            }
        });
        getContentPane().add(BtnIngredientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 260, -1));

        BtnBebestibles.setBackground(new java.awt.Color(153, 0, 0));
        BtnBebestibles.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BtnBebestibles.setForeground(new java.awt.Color(255, 255, 255));
        BtnBebestibles.setText("Bebestibles");
        BtnBebestibles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBebestiblesActionPerformed(evt);
            }
        });
        getContentPane().add(BtnBebestibles, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 260, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/imagenes/FondoRojo_opt.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Acción para volver al menu de la sucursal
     * @param evt 
     */
    private void jbVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVolverActionPerformed
        //volver menu sucursal
    }//GEN-LAST:event_jbVolverActionPerformed
    
    /**
     * Acción para ingresar a menu ingredientes
     * @param evt 
     */
    private void BtnIngredientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIngredientesActionPerformed
        //ir a menu ingredientes
    }//GEN-LAST:event_BtnIngredientesActionPerformed
    
    /**
     * Acción pra ingresar a menu bebestibles
     * @param evt 
     */
    private void BtnBebestiblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBebestiblesActionPerformed
        //ir a menu bebestibles
    }//GEN-LAST:event_BtnBebestiblesActionPerformed

    
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
            java.util.logging.Logger.getLogger(MenuInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuInventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBebestibles;
    private javax.swing.JButton BtnIngredientes;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel jLabelImagen;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JButton jbVolver;
    // End of variables declaration//GEN-END:variables
}
