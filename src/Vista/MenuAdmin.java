/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vista;

/**
 *
 * @author hp
 */
public class MenuAdmin extends javax.swing.JFrame {

    /**
     * Creates new form MenuAdmin
     */
    public MenuAdmin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblImagenAdmin = new javax.swing.JLabel();
        btnSalirLoginJugador = new javax.swing.JButton();
        lblCerrarSesion = new javax.swing.JLabel();
        lblBienvenidoAdmin = new javax.swing.JLabel();
        lblAdmin = new javax.swing.JLabel();
        lblNombreFutbolCopa = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnInfraccion = new javax.swing.JButton();
        lblGestionarInfraccion = new javax.swing.JLabel();
        btnPartidos = new javax.swing.JButton();
        lblGestionarPartido = new javax.swing.JLabel();
        btnEquipos = new javax.swing.JButton();
        lblGestionarEquipo = new javax.swing.JLabel();
        btnCalificacion = new javax.swing.JButton();
        lblGestionarCalificacion = new javax.swing.JLabel();
        lblGestionarNotificacion = new javax.swing.JLabel();
        btnJugadores = new javax.swing.JButton();
        btnNotificacion = new javax.swing.JButton();
        lblGestionarJugador = new javax.swing.JLabel();
        btnSalirMenuAdmin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(127, 187, 133));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblImagenAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario_admin.png"))); // NOI18N
        jPanel2.add(lblImagenAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 92, 92));

        btnSalirLoginJugador.setBackground(new java.awt.Color(255, 255, 255));
        btnSalirLoginJugador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        btnSalirLoginJugador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(btnSalirLoginJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 44, 45));

        lblCerrarSesion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        lblCerrarSesion.setText("Cerrar Sesión");
        jPanel2.add(lblCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, -1));

        lblBienvenidoAdmin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblBienvenidoAdmin.setForeground(new java.awt.Color(255, 255, 255));
        lblBienvenidoAdmin.setText("BIENVENIDO");
        jPanel2.add(lblBienvenidoAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        lblAdmin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblAdmin.setForeground(new java.awt.Color(255, 255, 255));
        lblAdmin.setText("ADMIN");
        jPanel2.add(lblAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 200, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 410));

        lblNombreFutbolCopa.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        lblNombreFutbolCopa.setText("FUTBOL COPA");
        jPanel1.add(lblNombreFutbolCopa, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnInfraccion.setBackground(new java.awt.Color(255, 153, 153));
        btnInfraccion.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnInfraccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/infraccion.png"))); // NOI18N
        btnInfraccion.setText("Infraccion");
        btnInfraccion.setFocusTraversalPolicyProvider(true);
        btnInfraccion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnInfraccion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel3.add(btnInfraccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 100, 120));

        lblGestionarInfraccion.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblGestionarInfraccion.setForeground(new java.awt.Color(153, 153, 153));
        lblGestionarInfraccion.setText("Gestionar Infraccion");
        lblGestionarInfraccion.setName(""); // NOI18N
        jPanel3.add(lblGestionarInfraccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 280, 140, -1));

        btnPartidos.setBackground(new java.awt.Color(153, 255, 153));
        btnPartidos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPartidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partido.png"))); // NOI18N
        btnPartidos.setText("Partidos");
        btnPartidos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPartidos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel3.add(btnPartidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 100, 120));

        lblGestionarPartido.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblGestionarPartido.setForeground(new java.awt.Color(153, 153, 153));
        lblGestionarPartido.setText("Gestionar Partidos");
        jPanel3.add(lblGestionarPartido, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 120, 130, -1));

        btnEquipos.setBackground(new java.awt.Color(153, 255, 153));
        btnEquipos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEquipos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/equipo.png"))); // NOI18N
        btnEquipos.setText("Equipos");
        btnEquipos.setFocusTraversalPolicyProvider(true);
        btnEquipos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEquipos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel3.add(btnEquipos, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 100, 120));

        lblGestionarEquipo.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblGestionarEquipo.setForeground(new java.awt.Color(153, 153, 153));
        lblGestionarEquipo.setText("Gestionar Equipos");
        jPanel3.add(lblGestionarEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 130, -1));

        btnCalificacion.setBackground(new java.awt.Color(255, 255, 153));
        btnCalificacion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCalificacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/calificacion.png"))); // NOI18N
        btnCalificacion.setText("Calificacion");
        btnCalificacion.setFocusTraversalPolicyProvider(true);
        btnCalificacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCalificacion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel3.add(btnCalificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 100, 120));

        lblGestionarCalificacion.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblGestionarCalificacion.setForeground(new java.awt.Color(153, 153, 153));
        lblGestionarCalificacion.setText("Gestionar Calificacion");
        lblGestionarCalificacion.setName(""); // NOI18N
        jPanel3.add(lblGestionarCalificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 140, -1));

        lblGestionarNotificacion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblGestionarNotificacion.setForeground(new java.awt.Color(153, 153, 153));
        lblGestionarNotificacion.setText("Gestionar Notificaciones");
        lblGestionarNotificacion.setName(""); // NOI18N
        jPanel3.add(lblGestionarNotificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 150, -1));

        btnJugadores.setBackground(new java.awt.Color(153, 255, 153));
        btnJugadores.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnJugadores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/jugadores.png"))); // NOI18N
        btnJugadores.setText("Jugadores");
        btnJugadores.setFocusTraversalPolicyProvider(true);
        btnJugadores.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnJugadores.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel3.add(btnJugadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 100, 120));

        btnNotificacion.setBackground(new java.awt.Color(153, 204, 255));
        btnNotificacion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNotificacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/notificacion.png"))); // NOI18N
        btnNotificacion.setText("Notificacion");
        btnNotificacion.setFocusTraversalPolicyProvider(true);
        btnNotificacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNotificacion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel3.add(btnNotificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 100, 120));

        lblGestionarJugador.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblGestionarJugador.setForeground(new java.awt.Color(153, 153, 153));
        lblGestionarJugador.setText("Gestionar Jugadores");
        jPanel3.add(lblGestionarJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 140, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 520, 300));

        btnSalirMenuAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar.png"))); // NOI18N
        jPanel1.add(btnSalirMenuAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 5, 25, 25));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalificacion;
    private javax.swing.JButton btnEquipos;
    private javax.swing.JButton btnInfraccion;
    private javax.swing.JButton btnJugadores;
    private javax.swing.JButton btnNotificacion;
    private javax.swing.JButton btnPartidos;
    private javax.swing.JButton btnSalirLoginJugador;
    private javax.swing.JButton btnSalirMenuAdmin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblAdmin;
    private javax.swing.JLabel lblBienvenidoAdmin;
    private javax.swing.JLabel lblCerrarSesion;
    private javax.swing.JLabel lblGestionarCalificacion;
    private javax.swing.JLabel lblGestionarEquipo;
    private javax.swing.JLabel lblGestionarInfraccion;
    private javax.swing.JLabel lblGestionarJugador;
    private javax.swing.JLabel lblGestionarNotificacion;
    private javax.swing.JLabel lblGestionarPartido;
    private javax.swing.JLabel lblImagenAdmin;
    private javax.swing.JLabel lblNombreFutbolCopa;
    // End of variables declaration//GEN-END:variables
}
