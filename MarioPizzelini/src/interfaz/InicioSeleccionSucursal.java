/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;
import clases.Cliente;
import clases.MarioPizzelini;
import clases.Sucursal;
import javax.swing.JOptionPane;

/**
 *
 * @author XavierKrostya
 */
public class InicioSeleccionSucursal extends javax.swing.JFrame {
    
    private MarioPizzelini empresa;
    private int montoTotal;
    private int montoTotalSucursal;
    private Sucursal sucursalMasRecaudada;
    private Cliente clienteConMasPedidos;
    /**
     * Creates new form InicioSeleccionSucursal
     */
    public InicioSeleccionSucursal(MarioPizzelini empresa) {
        initComponents();
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.empresa = empresa;
        ingresarMontoGeneral();
        ingresarSucursal();
        ingresarCliente();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuDesplegable = new javax.swing.JPanel();
        jLabelImagen = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
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
        jbMenu = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jbIngresar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jLabelText1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaSucursales = new javax.swing.JTextArea();
        jLabelText2 = new javax.swing.JLabel();
        jTextRut = new javax.swing.JTextField();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jMenuDesplegable.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 1, -1, 468));

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

        jPanel2.setBackground(new java.awt.Color(0, 153, 51));
        jPanel2.setForeground(new java.awt.Color(0, 153, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

        jbIngresar.setBackground(new java.awt.Color(153, 0, 0));
        jbIngresar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jbIngresar.setForeground(new java.awt.Color(255, 255, 255));
        jbIngresar.setText("Ingresar");
        jbIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(jbIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, 160, 30));

        jbSalir.setBackground(new java.awt.Color(153, 0, 0));
        jbSalir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbSalir.setForeground(new java.awt.Color(255, 255, 255));
        jbSalir.setText("Volver");
        jbSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 80, 30));

        jLabelText1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelText1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelText1.setText("Ingrese el RUT de alguna sucursal:");
        getContentPane().add(jLabelText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, -1, -1));

        jTextAreaSucursales.setBackground(new java.awt.Color(51, 51, 51));
        jTextAreaSucursales.setColumns(20);
        jTextAreaSucursales.setForeground(new java.awt.Color(255, 255, 255));
        jTextAreaSucursales.setRows(5);
        jScrollPane1.setViewportView(jTextAreaSucursales);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 560, 300));

        jLabelText2.setBackground(new java.awt.Color(51, 51, 51));
        jLabelText2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelText2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelText2.setText("RUT:");
        getContentPane().add(jLabelText2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, -1, -1));

        jTextRut.setBackground(new java.awt.Color(51, 51, 51));
        jTextRut.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTextRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, 190, -1));

        jLabelTitulo.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("SUCURSALES REGISTRADAS");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/imagenes/FondoRojo.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

        private void ingresarMontoGeneral(){
        montoTotal = empresa.recaudacionTotal();
        jLabelMONTOEMPRESA.setText(Integer.toString(montoTotal));
    }
    
    private void ingresarSucursal(){
        sucursalMasRecaudada = empresa.sucursalConMayorRecaudacion();
        montoTotalSucursal = sucursalMasRecaudada.valorTotalPedidosSucursal();
        
        if(sucursalMasRecaudada == null){
            jLabelDIRECCION.setText("Ninguna");
            jLabelMONTOSUCURSAL.setText("0");
        }
        else{
            jLabelDIRECCION.setText(sucursalMasRecaudada.getDireccion());
            jLabelMONTOSUCURSAL.setText(Integer.toString(montoTotalSucursal));
        }
    }
    
    private void ingresarCliente(){
        clienteConMasPedidos = empresa.buscarClienteConMasPedidos();
        
        if(clienteConMasPedidos == null){
            jLabelNOMBRECLIENTE.setText("Ninguno");
            jLabelRUTCLIENTE.setText("");
        }
        else{
            jLabelNOMBRECLIENTE.setText(clienteConMasPedidos.getNombre());
            jLabelRUTCLIENTE.setText(clienteConMasPedidos.getRut());
        }
    }
    
    private void jbIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIngresarActionPerformed
        String rut = jTextRut.getText();

        if(!rut.equals("")){
            if(empresa.buscarSucursalPorRut(rut) != null){
                MenuPrincipal frame = new MenuPrincipal(rut,empresa);
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
    }//GEN-LAST:event_jbIngresarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        Inicio frame = new Inicio(empresa);
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelDIRECCION;
    private javax.swing.JLabel jLabelFondo;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaSucursales;
    private javax.swing.JTextField jTextRut;
    private javax.swing.JButton jbIngresar;
    private javax.swing.JButton jbMenu;
    private javax.swing.JButton jbSalir;
    // End of variables declaration//GEN-END:variables
}
