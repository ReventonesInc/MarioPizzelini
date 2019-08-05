/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;
import clases.MarioPizzelini;
import javax.swing.JOptionPane;

public class MenuBebestibles extends javax.swing.JFrame {
    private MarioPizzelini empresa;
    private String rutEmpresa;
    
    
    //Constructor
    public MenuBebestibles(String rutEmpresa, MarioPizzelini empresa) {
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
        jLabel2 = new javax.swing.JLabel();
        jbAgregar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbMostrar = new javax.swing.JButton();
        jbVolver = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("INVENTARIO BEBESTIBLES");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/imagenes/ico-trago_opt.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, -1));

        jbAgregar.setBackground(new java.awt.Color(101, 48, 0));
        jbAgregar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jbAgregar.setForeground(new java.awt.Color(255, 255, 255));
        jbAgregar.setText("Agregar");
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(jbAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 260, -1));

        jbModificar.setBackground(new java.awt.Color(101, 48, 0));
        jbModificar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jbModificar.setForeground(new java.awt.Color(255, 255, 255));
        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });
        getContentPane().add(jbModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 260, -1));

        jbEliminar.setBackground(new java.awt.Color(101, 48, 0));
        jbEliminar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jbEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(jbEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 260, -1));

        jbMostrar.setBackground(new java.awt.Color(101, 48, 0));
        jbMostrar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jbMostrar.setForeground(new java.awt.Color(255, 255, 255));
        jbMostrar.setText("Mostrar Bebestibles");
        jbMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMostrarActionPerformed(evt);
            }
        });
        getContentPane().add(jbMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 260, -1));

        jbVolver.setBackground(new java.awt.Color(101, 48, 0));
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

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/imagenes/fondoop_opt.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVolverActionPerformed
        MenuInventario frame = new MenuInventario(rutEmpresa,empresa);
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbVolverActionPerformed

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
        AgregarBebestibles frame = new AgregarBebestibles(rutEmpresa,empresa);
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbAgregarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        if(!empresa.estaVacioBebestibles(rutEmpresa)){
            EliminarBebestibles frame = new EliminarBebestibles(rutEmpresa,empresa);
            frame.setVisible(true);
            this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(null, "No hay bebestibles por eliminar");
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        if(!empresa.estaVacioBebestibles(rutEmpresa)){
            ModificarBebestibles frame = new ModificarBebestibles(rutEmpresa,empresa);
            frame.setVisible(true);
            this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(null, "No hay bebestibles por modificar");
        }
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMostrarActionPerformed
        if(!empresa.estaVacioBebestibles(rutEmpresa)){
            empresa.mostrarBebestibles(rutEmpresa);
        }
        else{
            JOptionPane.showMessageDialog(null, "No hay bebestibles por mostrar");
        }
    }//GEN-LAST:event_jbMostrarActionPerformed

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
