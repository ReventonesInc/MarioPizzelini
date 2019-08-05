/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazGrafica;

import clases.Cliente;
import clases.Ingrediente;
import clases.MarioPizzelini;
import clases.Pedido;
import clases.Pizza;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author XavierKrostya
 */
public class AgregarPedido extends javax.swing.JFrame {
    
    private MarioPizzelini empresa;
    private String rut;
    /**
     * Creates new form AgregarPedido
     */
    public AgregarPedido(MarioPizzelini empresa, String rut) {
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
        jLabeldCliente = new javax.swing.JLabel();
        jTextIdCliente = new javax.swing.JTextField();
        jLabelPrecio = new javax.swing.JLabel();
        jTextRut = new javax.swing.JTextField();
        jLabelNombre = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        jLabelCantidad = new javax.swing.JLabel();
        jTextCantidadPizza = new javax.swing.JTextField();
        BtnCancelar = new javax.swing.JButton();
        BtnAceptar = new javax.swing.JButton();
        jLabelCantidad1 = new javax.swing.JLabel();
        jTextCantidadBebestible = new javax.swing.JTextField();
        jLabelCantidad2 = new javax.swing.JLabel();
        jTextApellido = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabelCantidad3 = new javax.swing.JLabel();
        jTextTelefono = new javax.swing.JTextField();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("AGREGAR PEDIDO");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabelTexto1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelTexto1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTexto1.setText("Ingrese correctamente los datos");
        getContentPane().add(jLabelTexto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabelTexto2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelTexto2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTexto2.setText("que se pedirán a continuación:");
        getContentPane().add(jLabelTexto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabeldCliente.setBackground(new java.awt.Color(51, 51, 51));
        jLabeldCliente.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabeldCliente.setForeground(new java.awt.Color(255, 255, 255));
        jLabeldCliente.setText("ID CLIENTE:");
        getContentPane().add(jLabeldCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jTextIdCliente.setBackground(new java.awt.Color(51, 51, 51));
        jTextIdCliente.setForeground(new java.awt.Color(255, 255, 255));
        jTextIdCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIdClienteActionPerformed(evt);
            }
        });
        getContentPane().add(jTextIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 110, -1));

        jLabelPrecio.setBackground(new java.awt.Color(51, 51, 51));
        jLabelPrecio.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelPrecio.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPrecio.setText("RUT:");
        getContentPane().add(jLabelPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jTextRut.setBackground(new java.awt.Color(51, 51, 51));
        jTextRut.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTextRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 170, -1));

        jLabelNombre.setBackground(new java.awt.Color(51, 51, 51));
        jLabelNombre.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombre.setText("NOMBRE:");
        getContentPane().add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jTextNombre.setBackground(new java.awt.Color(51, 51, 51));
        jTextNombre.setForeground(new java.awt.Color(255, 255, 255));
        jTextNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNombreActionPerformed(evt);
            }
        });
        getContentPane().add(jTextNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 130, -1));

        jLabelCantidad.setBackground(new java.awt.Color(51, 51, 51));
        jLabelCantidad.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelCantidad.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCantidad.setText("CANTIDAD DE BEBESTIBLES:");
        getContentPane().add(jLabelCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        jTextCantidadPizza.setBackground(new java.awt.Color(51, 51, 51));
        jTextCantidadPizza.setForeground(new java.awt.Color(255, 255, 255));
        jTextCantidadPizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCantidadPizzaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextCantidadPizza, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 120, -1));

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
        getContentPane().add(BtnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));

        BtnAceptar.setBackground(new java.awt.Color(153, 0, 0));
        BtnAceptar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BtnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        BtnAceptar.setText("Agregar");
        BtnAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 450, -1, -1));

        jLabelCantidad1.setBackground(new java.awt.Color(51, 51, 51));
        jLabelCantidad1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelCantidad1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCantidad1.setText("TELÉFONO:");
        getContentPane().add(jLabelCantidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jTextCantidadBebestible.setBackground(new java.awt.Color(51, 51, 51));
        jTextCantidadBebestible.setForeground(new java.awt.Color(255, 255, 255));
        jTextCantidadBebestible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCantidadBebestibleActionPerformed(evt);
            }
        });
        getContentPane().add(jTextCantidadBebestible, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, 120, -1));

        jLabelCantidad2.setBackground(new java.awt.Color(51, 51, 51));
        jLabelCantidad2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelCantidad2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCantidad2.setText("CANTIDAD DE PIZZAS:");
        getContentPane().add(jLabelCantidad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        jTextApellido.setBackground(new java.awt.Color(51, 51, 51));
        jTextApellido.setForeground(new java.awt.Color(255, 255, 255));
        jTextApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextApellidoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 120, -1));

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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 490, -1));

        jLabelCantidad3.setBackground(new java.awt.Color(51, 51, 51));
        jLabelCantidad3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelCantidad3.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCantidad3.setText("APELLIDO:");
        getContentPane().add(jLabelCantidad3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jTextTelefono.setBackground(new java.awt.Color(51, 51, 51));
        jTextTelefono.setForeground(new java.awt.Color(255, 255, 255));
        jTextTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTelefonoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 110, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/imagenes/FondoRojoMOD.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextIdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIdClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextIdClienteActionPerformed

    private void jTextNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNombreActionPerformed

    private void jTextCantidadPizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCantidadPizzaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCantidadPizzaActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        MenuPedido frame = new MenuPedido(empresa,rut);
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void BtnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAceptarActionPerformed
        String id = jTextIdCliente.getText();
        String rutCliente = jTextRut.getText();
        String nombre = jTextNombre.getText();
        String apellido = jTextApellido.getText();
        String fono = jTextApellido.getText();
        String cantidadPizzas = jTextCantidadPizza.getText();
        String cantidadBebestible = jTextCantidadBebestible.getText();
        
        int cantPizzas = Integer.parseInt(cantidadPizzas);
        int cantBebestibles = Integer.parseInt(cantidadBebestible);
        int idCliente = Integer.parseInt(id);
        Cliente nuevo = new Cliente(idCliente,rutCliente,nombre,apellido,fono);
        
        if(!(id.equals("") || rutCliente.equals("") || nombre.equals("") || apellido.equals("") || fono.equals("") || cantidadPizzas.equals("") || cantidadBebestible.equals(""))){
            if(validarNumero(rutCliente)){
                Cliente comparar = empresa.retornarClienteRut(rutCliente);
                if(comparar != null){
                    Pedido nuevoPedido = new Pedido(comparar,cantPizzas,cantBebestibles);
                    if(empresa.agregarPedido(rut, nuevoPedido)){
                        ArrayList<Ingrediente> ingredientes = empresa.mostrarListaIngrediente(rut);
                        String[] nombreIngredientes = crearVectorIngredientes(ingredientes);
                        Pizza auxPizzas[] = new Pizza[cantPizzas];
                        
                        for(int i = 0; i < cantPizzas; i++){
                            int cantidadIngredientes = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos ingredientes desea en su pizza numero "+ (i+1) +" ?"));
                            System.out.println("Usted eligio "+cantidadIngredientes+" Ingredientes, por favor seleccionelos");
                            auxPizzas[i] = new Pizza(cantidadIngredientes, null, 0, null);
            
                            for(int j = 0; j<cantidadIngredientes; j++) {
                                Object opcion = JOptionPane.showInputDialog(null,"Selecciona un ingrediente", "Elegir",JOptionPane.QUESTION_MESSAGE,null,nombreIngredientes,nombreIngredientes[0]);                
                                String ide = opcion.toString();
                                //System.out.println(ide);
                                Ingrediente buscar = empresa.buscarIngredienteID(rut, ide);
                                auxPizzas[i].agregarIngrediente(buscar);
                            }
                            auxPizzas[i].calcularValor();
                        }
                        JOptionPane.showMessageDialog(null,"¡El pedido fue creado con exito!");
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"¡El pedido no fue creado!");
                    }
                }
                else{
                    Pedido nuevoPedido = new Pedido(nuevo,cantPizzas,cantBebestibles);
                    if(empresa.agregarPedido(rut, nuevoPedido)){
                        ArrayList<Ingrediente> ingredientes = empresa.mostrarListaIngrediente(rut);
                        String[] nombreIngredientes = crearVectorIngredientes(ingredientes);
                        Pizza auxPizzas[] = new Pizza[cantPizzas];
                        
                        for(int i = 0; i < cantPizzas; i++){
                            int cantidadIngredientes = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos ingredientes desea en su pizza numero "+ (i+1) +" ?"));
                            System.out.println("Usted eligio "+cantidadIngredientes+" Ingredientes, por favor seleccionelos");
                            auxPizzas[i] = new Pizza(cantidadIngredientes, null, 0, null);
            
                            for(int j = 0; j<cantidadIngredientes; j++) {
                                Object opcion = JOptionPane.showInputDialog(null,"Selecciona un ingrediente", "Elegir",JOptionPane.QUESTION_MESSAGE,null,nombreIngredientes,nombreIngredientes[0]);                
                                String ide = opcion.toString();
                                //System.out.println(ide);
                                Ingrediente buscar = empresa.buscarIngredienteID(rut, ide);
                                auxPizzas[i].agregarIngrediente(buscar);
                            }
                            auxPizzas[i].calcularValor();
                        }
                        JOptionPane.showMessageDialog(null,"¡El pedido fue creado con exito!");
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"¡El pedido no fue creado!");
                    }
                }
            }
            else{
                JOptionPane.showMessageDialog(null,"¡El rut ingresado no es valido!");
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"¡Datos no validos!");
        }
        
    }//GEN-LAST:event_BtnAceptarActionPerformed
    
    public String[] crearVectorIngredientes(ArrayList<Ingrediente> array){
        String[] vector = new String[array.size()];
        
        for(int i = 0; i < vector.length; i++){
            vector[i] = array.get(i).getNombre();
        }
        return vector;
    }
    
    public boolean validarNumero(String cadena){
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException excepcion) {
            return false;
        }
    }
    
    private void jTextCantidadBebestibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCantidadBebestibleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCantidadBebestibleActionPerformed

    private void jTextApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextApellidoActionPerformed

    private void jTextTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextTelefonoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAceptar;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel jLabelCantidad;
    private javax.swing.JLabel jLabelCantidad1;
    private javax.swing.JLabel jLabelCantidad2;
    private javax.swing.JLabel jLabelCantidad3;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelPrecio;
    private javax.swing.JLabel jLabelTexto1;
    private javax.swing.JLabel jLabelTexto2;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabeldCliente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextApellido;
    private javax.swing.JTextField jTextCantidadBebestible;
    private javax.swing.JTextField jTextCantidadPizza;
    private javax.swing.JTextField jTextIdCliente;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextRut;
    private javax.swing.JTextField jTextTelefono;
    // End of variables declaration//GEN-END:variables
}
