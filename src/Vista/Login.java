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
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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
        btnAdminLogin = new javax.swing.JButton();
        btnJugadorLogin = new javax.swing.JButton();
        lblIngreso = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblPastoLogin = new javax.swing.JLabel();
        btnSalirLogin = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAdminLogin.setBackground(new java.awt.Color(0, 153, 51));
        btnAdminLogin.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnAdminLogin.setText("ADMINISTRADOR");
        btnAdminLogin.setToolTipText("");
        btnAdminLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdminLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminLoginActionPerformed(evt);
            }
        });
        jPanel2.add(btnAdminLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, 40));

        btnJugadorLogin.setBackground(new java.awt.Color(153, 255, 153));
        btnJugadorLogin.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnJugadorLogin.setText("JUGADOR");
        btnJugadorLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(btnJugadorLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 240, -1, 40));

        lblIngreso.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblIngreso.setText("INGRESO USUARIOS");
        jPanel2.add(lblIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, -1));

        lblNombre.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        lblNombre.setText("FUTBOL COPA");
        jPanel2.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        lblPastoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/login_principal.png"))); // NOI18N
        jPanel2.add(lblPastoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 175, 396, 283));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 400, 460));

        btnSalirLogin.setBackground(new java.awt.Color(255, 255, 255));
        btnSalirLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        btnSalirLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnSalirLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, 44, 45));

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

    private void btnAdminLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdminLoginActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAdminLogin;
    public javax.swing.JButton btnJugadorLogin;
    public javax.swing.JButton btnSalirLogin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblIngreso;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPastoLogin;
    // End of variables declaration//GEN-END:variables
}
