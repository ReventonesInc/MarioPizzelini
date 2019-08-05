/*
 * Interfaz gráfica que permite manejar de menú principal para
 * una sucursal, en la cual fue seleccionada anteriormente.
 */
package interfazGrafica;
import clases.MarioPizzelini;

public class MenuPrincipalSucursal extends javax.swing.JFrame {
    
    private MarioPizzelini empresa;
    private String rutSucursal;
    private String montoSucursal;
    
    /**
     * Constructor de MenuPrincipalSucursal
     */
    public MenuPrincipalSucursal(MarioPizzelini empresa, String rutSucursal) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.empresa = empresa;
        this.rutSucursal = rutSucursal;
        jLabelRUT.setText(rutSucursal);
        montoSucursal = String.valueOf(empresa.montoRecaudadoSucursal(rutSucursal));
        jLabelMONTOS.setText(montoSucursal);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbMenu = new javax.swing.JButton();
        jMenuDesplegable = new javax.swing.JPanel();
        jLabelImagen = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelRUT = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelMONTOS = new javax.swing.JLabel();
        jbCerrarSesion = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BtnPedidos = new javax.swing.JButton();
        BtnInventario = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/imagenes/icono menu.jpg"))); // NOI18N
        jbMenu.setBorder(null);
        jbMenu.setContentAreaFilled(false);
        jbMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbMenu.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/imagenes/icono menu.jpg"))); // NOI18N
        jbMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMenuActionPerformed(evt);
            }
        });
        getContentPane().add(jbMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 70));

        jMenuDesplegable.setBackground(new java.awt.Color(153, 0, 0));
        jMenuDesplegable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0)));
        jMenuDesplegable.setForeground(new java.awt.Color(255, 255, 255));

        jLabelImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/imagenes/sucursales-icono_opt.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Información de sucursal");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("RUT:");

        jLabelRUT.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelRUT.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRUT.setText("12.345.678-9");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Monto:");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("$");

        jLabelMONTOS.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelMONTOS.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMONTOS.setText("10000");

        jbCerrarSesion.setBackground(new java.awt.Color(153, 0, 0));
        jbCerrarSesion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        jbCerrarSesion.setText("Cerrar Sesión");
        jbCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerrarSesionActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(0, 153, 51));
        jPanel5.setForeground(new java.awt.Color(0, 153, 51));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jMenuDesplegableLayout = new javax.swing.GroupLayout(jMenuDesplegable);
        jMenuDesplegable.setLayout(jMenuDesplegableLayout);
        jMenuDesplegableLayout.setHorizontalGroup(
            jMenuDesplegableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jMenuDesplegableLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jMenuDesplegableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jMenuDesplegableLayout.createSequentialGroup()
                        .addGroup(jMenuDesplegableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jMenuDesplegableLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelMONTOS))
                            .addGroup(jMenuDesplegableLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelRUT)))
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jMenuDesplegableLayout.createSequentialGroup()
                        .addGroup(jMenuDesplegableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jMenuDesplegableLayout.createSequentialGroup()
                        .addComponent(jLabelImagen)
                        .addGap(18, 18, 18)))
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jMenuDesplegableLayout.setVerticalGroup(
            jMenuDesplegableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jMenuDesplegableLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabelImagen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jMenuDesplegableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRUT)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jMenuDesplegableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabelMONTOS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                .addComponent(jbCerrarSesion)
                .addGap(20, 20, 20))
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jMenuDesplegable, new org.netbeans.lib.awtextra.AbsoluteConstraints(-200, 10, 210, 470));

        jLabelTitulo.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("MENU SUCURSAL");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/imagenes/coloresl_opt.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, -1, -1));

        BtnPedidos.setBackground(new java.awt.Color(153, 0, 0));
        BtnPedidos.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BtnPedidos.setForeground(new java.awt.Color(255, 255, 255));
        BtnPedidos.setText("Pedidos");
        BtnPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPedidosActionPerformed(evt);
            }
        });
        getContentPane().add(BtnPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 340, -1));

        BtnInventario.setBackground(new java.awt.Color(153, 0, 0));
        BtnInventario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BtnInventario.setForeground(new java.awt.Color(255, 255, 255));
        BtnInventario.setText("Inventario");
        BtnInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInventarioActionPerformed(evt);
            }
        });
        getContentPane().add(BtnInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 340, -1));

        jbSalir.setBackground(new java.awt.Color(153, 0, 0));
        jbSalir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbSalir.setForeground(new java.awt.Color(255, 255, 255));
        jbSalir.setText("Salir");
        jbSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 70, -1));

        jPanel1.setBackground(new java.awt.Color(0, 153, 51));
        jPanel1.setForeground(new java.awt.Color(0, 153, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 700, 10));

        jPanel4.setBackground(new java.awt.Color(0, 153, 51));
        jPanel4.setForeground(new java.awt.Color(0, 153, 51));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 10));

        jPanel3.setBackground(new java.awt.Color(0, 153, 51));
        jPanel3.setForeground(new java.awt.Color(0, 153, 51));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, 10, 490));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/imagenes/FondoRojo.jpg"))); // NOI18N
        Fondo.setPreferredSize(new java.awt.Dimension(700, 480));
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Acción que permite salir del programa.
     * @param evt 
     */
    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbSalirActionPerformed
    
    /**
     * Permite desplazar el menú que está en la parte izquierda de la ventana
     * @param evt 
     */
    private void jbMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMenuActionPerformed
        int posicion = jbMenu.getX();
        if(posicion > 10){
            Animacion.Animacion.mover_izquierda(210, 10, 2, 2, jbMenu);
            Animacion.Animacion.mover_izquierda(0, -200, 2, 2, jMenuDesplegable);
        }
        else{
            Animacion.Animacion.mover_derecha(10, 210, 2, 2, jbMenu);
            Animacion.Animacion.mover_derecha(-200, 0, 2, 2, jMenuDesplegable);
        }
    }//GEN-LAST:event_jbMenuActionPerformed
    
    /**
     * Acción para volver a seleccionar una sucursal para administrar.
     * @param evt 
     */
    private void jbCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrarSesionActionPerformed
        SeleccionSucursal frame = new SeleccionSucursal(empresa);
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbCerrarSesionActionPerformed

    private void BtnPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPedidosActionPerformed
        MenuPedido frame = new MenuPedido(empresa,rutSucursal);
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnPedidosActionPerformed

    private void BtnInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInventarioActionPerformed
        MenuInventario frame = new MenuInventario(empresa,rutSucursal);
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnInventarioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnInventario;
    private javax.swing.JButton BtnPedidos;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelImagen;
    private javax.swing.JLabel jLabelMONTOS;
    private javax.swing.JLabel jLabelRUT;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jMenuDesplegable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton jbCerrarSesion;
    private javax.swing.JButton jbMenu;
    private javax.swing.JButton jbSalir;
    // End of variables declaration//GEN-END:variables
}
