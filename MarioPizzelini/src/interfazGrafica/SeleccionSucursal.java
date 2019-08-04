/*
 * Interfaz gráfica que permite la seleccón de la sucursal para administrar
 * los pedidos e inventario.
 */
package interfazGrafica;

import clases.Cliente;
import clases.MarioPizzelini;
import clases.Sucursal;
import javax.swing.JOptionPane;

public class SeleccionSucursal extends javax.swing.JFrame {
    
    private MarioPizzelini empresa;
    /**
     * Constructor de SeleccionSucursal.
     */
    public SeleccionSucursal(MarioPizzelini empresa) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.empresa = empresa;
        ingresarMontoGeneral();
        ingresarSucursal();
        ingresarCliente();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbMenu = new javax.swing.JButton();
        jMenuDesplegable = new javax.swing.JPanel();
        jLabelImagen = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabelText6 = new javax.swing.JLabel();
        jLabelMONTOEMPRESA = new javax.swing.JLabel();
        jLabelText7 = new javax.swing.JLabel();
        jLabelText9 = new javax.swing.JLabel();
        jLabelText10 = new javax.swing.JLabel();
        jLabelDIRECCION = new javax.swing.JLabel();
        jLabelText = new javax.swing.JLabel();
        jLabelMONTOSUCURSAL = new javax.swing.JLabel();
        jLabelText11 = new javax.swing.JLabel();
        jLabelRUTCLIENTE = new javax.swing.JLabel();
        jLabelNOMBRECLIENTE = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaSucursales = new javax.swing.JTextArea();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelText1 = new javax.swing.JLabel();
        jLabelText2 = new javax.swing.JLabel();
        jTextRut = new javax.swing.JTextField();
        BtnEliminar = new javax.swing.JButton();
        BtnAgregar = new javax.swing.JButton();
        BtnIngresar = new javax.swing.JButton();
        BtnVolver = new javax.swing.JButton();
        Fondo1 = new javax.swing.JPanel();
        Fondo2 = new javax.swing.JPanel();
        Fondo3 = new javax.swing.JPanel();
        Fondo4 = new javax.swing.JPanel();
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
        jMenuDesplegable.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/imagenes/sucursales-icono_opt.png"))); // NOI18N
        jMenuDesplegable.add(jLabelImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Información de Empresa");
        jMenuDesplegable.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 182, -1, -1));

        jPanel6.setBackground(new java.awt.Color(0, 153, 51));
        jPanel6.setForeground(new java.awt.Color(0, 153, 51));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jMenuDesplegable.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 1, -1, 468));

        jLabelText6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelText6.setForeground(new java.awt.Color(255, 255, 255));
        jLabelText6.setText("Recaudación de Empresa:");
        jMenuDesplegable.add(jLabelText6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabelMONTOEMPRESA.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelMONTOEMPRESA.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMONTOEMPRESA.setText("12345");
        jMenuDesplegable.add(jLabelMONTOEMPRESA, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jLabelText7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelText7.setForeground(new java.awt.Color(255, 255, 255));
        jLabelText7.setText("$");
        jMenuDesplegable.add(jLabelText7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabelText9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelText9.setForeground(new java.awt.Color(255, 255, 255));
        jLabelText9.setText("Sucursal con mayor");
        jMenuDesplegable.add(jLabelText9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jLabelText10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelText10.setForeground(new java.awt.Color(255, 255, 255));
        jLabelText10.setText("recaudación:");
        jMenuDesplegable.add(jLabelText10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        jLabelDIRECCION.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelDIRECCION.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDIRECCION.setText("direccion");
        jMenuDesplegable.add(jLabelDIRECCION, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        jLabelText.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelText.setForeground(new java.awt.Color(255, 255, 255));
        jLabelText.setText("$");
        jMenuDesplegable.add(jLabelText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        jLabelMONTOSUCURSAL.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelMONTOSUCURSAL.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMONTOSUCURSAL.setText("12345");
        jMenuDesplegable.add(jLabelMONTOSUCURSAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        jLabelText11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelText11.setForeground(new java.awt.Color(255, 255, 255));
        jLabelText11.setText("Cliente con más pedidos:");
        jMenuDesplegable.add(jLabelText11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        jLabelRUTCLIENTE.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelRUTCLIENTE.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRUTCLIENTE.setText("12.345.678-9");
        jMenuDesplegable.add(jLabelRUTCLIENTE, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        jLabelNOMBRECLIENTE.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelNOMBRECLIENTE.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNOMBRECLIENTE.setText("nombre del cliente");
        jMenuDesplegable.add(jLabelNOMBRECLIENTE, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        getContentPane().add(jMenuDesplegable, new org.netbeans.lib.awtextra.AbsoluteConstraints(-200, 10, 210, 470));

        jTextAreaSucursales.setBackground(new java.awt.Color(51, 51, 51));
        jTextAreaSucursales.setColumns(20);
        jTextAreaSucursales.setForeground(new java.awt.Color(255, 255, 255));
        jTextAreaSucursales.setRows(5);
        jScrollPane1.setViewportView(jTextAreaSucursales);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 460, 280));

        jLabelTitulo.setFont(new java.awt.Font("Dialog", 1, 35)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("SUCURSALES REGISTRADAS :");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        jLabelText1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelText1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelText1.setText("Ingrese el RUT para ingresar a la sucursal :");
        getContentPane().add(jLabelText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, -1));

        jLabelText2.setBackground(new java.awt.Color(51, 51, 51));
        jLabelText2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelText2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelText2.setText("RUT:");
        getContentPane().add(jLabelText2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, -1, -1));

        jTextRut.setBackground(new java.awt.Color(51, 51, 51));
        jTextRut.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTextRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 190, -1));

        BtnEliminar.setBackground(new java.awt.Color(153, 0, 0));
        BtnEliminar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BtnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        BtnEliminar.setText("Eliminar");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, 120, -1));

        BtnAgregar.setBackground(new java.awt.Color(153, 0, 0));
        BtnAgregar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BtnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        BtnAgregar.setText("Agregar");
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, 120, -1));

        BtnIngresar.setBackground(new java.awt.Color(153, 0, 0));
        BtnIngresar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BtnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        BtnIngresar.setText("Ingresar");
        BtnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 390, 120, 30));

        BtnVolver.setBackground(new java.awt.Color(153, 0, 0));
        BtnVolver.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BtnVolver.setForeground(new java.awt.Color(255, 255, 255));
        BtnVolver.setText("Volver");
        BtnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(BtnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 430, 120, 30));

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

        Fondo4.setBackground(new java.awt.Color(0, 153, 51));
        Fondo4.setForeground(new java.awt.Color(0, 153, 51));

        javax.swing.GroupLayout Fondo4Layout = new javax.swing.GroupLayout(Fondo4);
        Fondo4.setLayout(Fondo4Layout);
        Fondo4Layout.setHorizontalGroup(
            Fondo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        Fondo4Layout.setVerticalGroup(
            Fondo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        getContentPane().add(Fondo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 10, 470));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/imagenes/FondoRojo.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Monto total de la empresa
     */
    private void ingresarMontoGeneral(){
        int montoTotal = empresa.recaudacionTotal();
        jLabelMONTOEMPRESA.setText(Integer.toString(montoTotal));
    }
    
    /**
     * Ingresar datos de la sucursal
     */
    private void ingresarSucursal(){
        Sucursal sucursalMasRecaudada = empresa.sucursalConMayorRecaudacion();
        int montoTotalSucursal = sucursalMasRecaudada.valorTotalPedidosSucursal();
        
        if(sucursalMasRecaudada == null){
            jLabelDIRECCION.setText("Ninguna");
            jLabelMONTOSUCURSAL.setText("0");
        }
        else{
            jLabelDIRECCION.setText(sucursalMasRecaudada.getDireccion());
            jLabelMONTOSUCURSAL.setText(Integer.toString(montoTotalSucursal));
        }
    }
    
    /**
     * Cliente con más pedidos en la sucursal
     */
    private void ingresarCliente(){
        Cliente clienteConMasPedidos = empresa.buscarClienteConMasPedidos();
        
        if(clienteConMasPedidos == null){
            jLabelNOMBRECLIENTE.setText("Ninguno");
            jLabelRUTCLIENTE.setText("");
        }
        else{
            jLabelNOMBRECLIENTE.setText(clienteConMasPedidos.getNombre());
            jLabelRUTCLIENTE.setText(clienteConMasPedidos.getRut());
        }
    }
    
    /**
     * Acción para ingresar a una sucursal, según el RUT seleccionado
     * anteriormente.
     * @param evt 
     */
    private void BtnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIngresarActionPerformed
       String rut = jTextRut.getText();
        
        if(!rut.equals("")){
            if(empresa.buscarSucursalPorRut(rut) != null){
                MenuPrincipalSucursal frame = new MenuPrincipalSucursal(empresa,rut);
                frame.setVisible(true);
                this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(null, "¡RUT no encontrado!");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "¡RUT no valido!");
        }
    }//GEN-LAST:event_BtnIngresarActionPerformed
    
    /**
     * Acción para volver al inicio del programa y cerrar sesión.
     * @param evt 
     */
    private void BtnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVolverActionPerformed
        Inicio frame = new Inicio(empresa);
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnVolverActionPerformed

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
     * Para agregar una sucursal
     * @param evt 
     */
    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed
        AgregarSucursal frame = new AgregarSucursal(empresa);
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnAgregarActionPerformed
    
    /**
     * Para eliminar una sucursal
     * @param evt 
     */
    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        if(empresa.estaVacioSucursales()){
            JOptionPane.showMessageDialog(null, "¡No hay sucursales por eliminar!");
        }
        else{
            EliminarSucursal frame = new EliminarSucursal(empresa);
            frame.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_BtnEliminarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnIngresar;
    private javax.swing.JButton BtnVolver;
    private javax.swing.JLabel Fondo;
    private javax.swing.JPanel Fondo1;
    private javax.swing.JPanel Fondo2;
    private javax.swing.JPanel Fondo3;
    private javax.swing.JPanel Fondo4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelDIRECCION;
    private javax.swing.JLabel jLabelImagen;
    private javax.swing.JLabel jLabelMONTOEMPRESA;
    private javax.swing.JLabel jLabelMONTOSUCURSAL;
    private javax.swing.JLabel jLabelNOMBRECLIENTE;
    private javax.swing.JLabel jLabelRUTCLIENTE;
    private javax.swing.JLabel jLabelText;
    private javax.swing.JLabel jLabelText1;
    private javax.swing.JLabel jLabelText10;
    private javax.swing.JLabel jLabelText11;
    private javax.swing.JLabel jLabelText2;
    private javax.swing.JLabel jLabelText6;
    private javax.swing.JLabel jLabelText7;
    private javax.swing.JLabel jLabelText9;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jMenuDesplegable;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaSucursales;
    private javax.swing.JTextField jTextRut;
    private javax.swing.JButton jbMenu;
    // End of variables declaration//GEN-END:variables
}
