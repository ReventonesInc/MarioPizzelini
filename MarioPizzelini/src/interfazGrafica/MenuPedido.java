/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazGrafica;
import clases.MarioPizzelini;


public class MenuPedido extends javax.swing.JFrame {
    
    private MarioPizzelini empresa;
    private String rut;
    /**
     * Creates new form MenuPedido
     */
    public MenuPedido(MarioPizzelini empresa, String rut) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.empresa = empresa;
        this.rut = rut;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        Fondo2 = new javax.swing.JPanel();
        Fondo1 = new javax.swing.JPanel();
        Fondo3 = new javax.swing.JPanel();
        BtnEliminar = new javax.swing.JButton();
        BtnAgregar = new javax.swing.JButton();
        BtnEliminarCliente = new javax.swing.JButton();
        jLabelText2 = new javax.swing.JLabel();
        jLabelText1 = new javax.swing.JLabel();
        BtnVolver = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaIngredientes = new javax.swing.JTextArea();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
            .addGap(0, 480, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 480));

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

        BtnEliminarCliente.setBackground(new java.awt.Color(153, 0, 0));
        BtnEliminarCliente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BtnEliminarCliente.setForeground(new java.awt.Color(255, 255, 255));
        BtnEliminarCliente.setText("Eliminar un cliente");
        BtnEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(BtnEliminarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 260, -1));

        jLabelText2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelText2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelText2.setText("Presione un botón para modificar");
        getContentPane().add(jLabelText2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 280, -1));

        jLabelText1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelText1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelText1.setText("la lista de pedidos.");
        getContentPane().add(jLabelText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 280, -1));

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

        jLabelTitulo.setFont(new java.awt.Font("Dialog", 1, 35)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("PEDIDOS REGISTRADOS:");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jTextAreaIngredientes.setBackground(new java.awt.Color(51, 51, 51));
        jTextAreaIngredientes.setColumns(20);
        jTextAreaIngredientes.setForeground(new java.awt.Color(255, 255, 255));
        jTextAreaIngredientes.setRows(5);
        jScrollPane1.setViewportView(jTextAreaIngredientes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 600, 240));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/imagenes/FondoRojo.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        EliminarPedido frame = new EliminarPedido(empresa, rut);
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed
        
    }//GEN-LAST:event_BtnAgregarActionPerformed

    private void BtnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVolverActionPerformed
        MenuPrincipalSucursal frame = new MenuPrincipalSucursal(empresa,rut);
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnVolverActionPerformed

    private void BtnEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarClienteActionPerformed
        EliminarCliente frame = new EliminarCliente(empresa,rut);
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnEliminarClienteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnEliminarCliente;
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
