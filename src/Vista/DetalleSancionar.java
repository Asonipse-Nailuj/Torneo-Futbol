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
public class DetalleSancionar extends javax.swing.JFrame {

    /**
     * Creates new form GestionarPartidos
     */
    public DetalleSancionar() {
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
        lblDetalleSancionar = new javax.swing.JLabel();
        btnCancelarSancionar = new javax.swing.JButton();
        btnSalirDetalleSancionar = new javax.swing.JButton();
        lblCritica = new javax.swing.JLabel();
        lblSigno = new javax.swing.JLabel();
        cboxMotivo = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtACritica = new javax.swing.JTextArea();
        btnAceptarSancionar = new javax.swing.JButton();
        lblAdvertenciaSancionar = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDetalleSancionar.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        lblDetalleSancionar.setText("detalle sancionar");
        lblDetalleSancionar.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                lblDetalleSancionarInputMethodTextChanged(evt);
            }
        });
        jPanel1.add(lblDetalleSancionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        btnCancelarSancionar.setBackground(new java.awt.Color(255, 204, 204));
        btnCancelarSancionar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCancelarSancionar.setText("CANCELAR");
        btnCancelarSancionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnCancelarSancionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, -1, -1));

        btnSalirDetalleSancionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar.png"))); // NOI18N
        btnSalirDetalleSancionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirDetalleSancionarActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalirDetalleSancionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 25, 25));

        lblCritica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/escribir.png"))); // NOI18N
        jPanel1.add(lblCritica, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 39, 42));

        lblSigno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/signo.png"))); // NOI18N
        jPanel1.add(lblSigno, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 39, 42));

        jPanel1.add(cboxMotivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 400, -1));

        txtACritica.setColumns(20);
        txtACritica.setRows(5);
        jScrollPane1.setViewportView(txtACritica);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 400, 190));

        btnAceptarSancionar.setBackground(new java.awt.Color(204, 255, 204));
        btnAceptarSancionar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAceptarSancionar.setText("ACEPTAR");
        btnAceptarSancionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnAceptarSancionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, -1));

        lblAdvertenciaSancionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/advertencia.png"))); // NOI18N
        jPanel1.add(lblAdvertenciaSancionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 450));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 590, 250));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblDetalleSancionarInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_lblDetalleSancionarInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_lblDetalleSancionarInputMethodTextChanged

    private void btnSalirDetalleSancionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirDetalleSancionarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirDetalleSancionarActionPerformed

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
            java.util.logging.Logger.getLogger(DetalleSancionar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetalleSancionar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetalleSancionar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetalleSancionar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetalleSancionar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAceptarSancionar;
    public javax.swing.JButton btnCancelarSancionar;
    public javax.swing.JButton btnSalirDetalleSancionar;
    public javax.swing.JComboBox cboxMotivo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAdvertenciaSancionar;
    private javax.swing.JLabel lblCritica;
    private javax.swing.JLabel lblDetalleSancionar;
    private javax.swing.JLabel lblSigno;
    public javax.swing.JTextArea txtACritica;
    // End of variables declaration//GEN-END:variables
}
