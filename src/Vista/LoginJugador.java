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
public class LoginJugador extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public LoginJugador() {
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
        lblNombre = new javax.swing.JLabel();
        btnIngresarJugador = new javax.swing.JButton();
        btnVolverJugador = new javax.swing.JButton();
        lblIdentificacionJugador = new javax.swing.JLabel();
        txtIdentificacionJugador = new javax.swing.JTextField();
        lblPastoLogin = new javax.swing.JLabel();
        btnSalirLoginJugador = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombre.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        lblNombre.setText("FUTBOL COPA");
        jPanel2.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        btnIngresarJugador.setBackground(new java.awt.Color(0, 204, 0));
        btnIngresarJugador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnIngresarJugador.setText("INGRESAR");
        btnIngresarJugador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresarJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarJugadorActionPerformed(evt);
            }
        });
        jPanel2.add(btnIngresarJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, -1, -1));

        btnVolverJugador.setBackground(new java.awt.Color(255, 255, 255));
        btnVolverJugador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/anterior.png"))); // NOI18N
        btnVolverJugador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(btnVolverJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 405, 44, 45));

        lblIdentificacionJugador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/identificacion.png"))); // NOI18N
        jPanel2.add(lblIdentificacionJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 39, 42));

        txtIdentificacionJugador.setText("Identificacion");
        jPanel2.add(txtIdentificacionJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 250, 30));

        lblPastoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/login_principal.png"))); // NOI18N
        jPanel2.add(lblPastoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 175, 396, 283));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 400, 460));

        btnSalirLoginJugador.setBackground(new java.awt.Color(255, 255, 255));
        btnSalirLoginJugador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        btnSalirLoginJugador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnSalirLoginJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, 44, 45));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/login.png"))); // NOI18N
        jPanel1.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 902, 535));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarJugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIngresarJugadorActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnIngresarJugador;
    public javax.swing.JButton btnSalirLoginJugador;
    public javax.swing.JButton btnVolverJugador;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblIdentificacionJugador;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPastoLogin;
    public javax.swing.JTextField txtIdentificacionJugador;
    // End of variables declaration//GEN-END:variables
}
