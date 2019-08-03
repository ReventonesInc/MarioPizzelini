/*
 * Primera interfaz gráfica para iniciar el programa, se encargará
 * de contener el main y los datos iniciales.
 */
package interfazGrafica;

public class InicioMenu extends javax.swing.JFrame {

    /**
     * Constructor de InicioMenu
     */
    public InicioMenu() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        icono = new javax.swing.JLabel();
        Fondo2 = new javax.swing.JPanel();
        Fondo3 = new javax.swing.JPanel();
        Fondo4 = new javax.swing.JPanel();
        Fondo5 = new javax.swing.JPanel();
        BtnInicio = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        Version = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/imagenes/coloresl_opt.png"))); // NOI18N
        getContentPane().add(icono, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, -1, -1));

        Fondo2.setBackground(new java.awt.Color(0, 153, 51));
        getContentPane().add(Fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 555, 10));

        Fondo3.setBackground(new java.awt.Color(0, 153, 51));
        getContentPane().add(Fondo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 380));

        Fondo4.setBackground(new java.awt.Color(0, 153, 51));
        getContentPane().add(Fondo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 0, 10, 380));

        Fondo5.setBackground(new java.awt.Color(0, 153, 51));
        getContentPane().add(Fondo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 374, 555, 10));

        BtnInicio.setBackground(new java.awt.Color(153, 0, 0));
        BtnInicio.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        BtnInicio.setForeground(new java.awt.Color(255, 255, 255));
        BtnInicio.setText("Iniciar");
        BtnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInicioActionPerformed(evt);
            }
        });
        getContentPane().add(BtnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 170, -1));

        BtnSalir.setBackground(new java.awt.Color(153, 0, 0));
        BtnSalir.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        BtnSalir.setForeground(new java.awt.Color(255, 255, 255));
        BtnSalir.setText("Salir");
        BtnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(BtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 170, -1));

        Version.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        Version.setForeground(new java.awt.Color(255, 255, 255));
        Version.setText("Versión 3.1");
        getContentPane().add(Version, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/imagenes/FondoRojoInicio.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Acción para iniciar el programa
     * @param evt 
     */
    private void BtnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInicioActionPerformed
        
    }//GEN-LAST:event_BtnInicioActionPerformed
    
    /**
     * Acción para salir del programa
     * @param evt 
     */
    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnSalirActionPerformed
    
    /**
     * Es el main del programa MarioPizzilini, donde se iniciarán
     * la clase principal y archivos correspondientes.
     * @param args 
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnInicio;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JLabel Fondo;
    private javax.swing.JPanel Fondo2;
    private javax.swing.JPanel Fondo3;
    private javax.swing.JPanel Fondo4;
    private javax.swing.JPanel Fondo5;
    private javax.swing.JLabel Version;
    private javax.swing.JLabel icono;
    // End of variables declaration//GEN-END:variables
}
