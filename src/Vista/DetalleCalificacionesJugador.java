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
public class DetalleCalificacionesJugador extends javax.swing.JFrame {

    /**
     * Creates new form GestionarPartidos
     */
    public DetalleCalificacionesJugador() {
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
        btnCancelarCalificacionJugador = new javax.swing.JButton();
        btnSalirDetalleCalificacionJugador = new javax.swing.JButton();
        lblReseñaCalificacionJugador = new javax.swing.JLabel();
        lblCalifiacionJugador = new javax.swing.JLabel();
        cboxCalificacionJugador = new javax.swing.JComboBox();
        lblIdentificacionCalificacionJugador = new javax.swing.JLabel();
        txtIdentificacionCalificacionJugador = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAReseñaCalificacionJugador = new javax.swing.JTextArea();
        btnAceptarCalificacionJugador = new javax.swing.JButton();
        lblCalificacionJugador = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDetalleSancionar.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        lblDetalleSancionar.setText("detalle CALIFICACIONES");
        lblDetalleSancionar.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                lblDetalleSancionarInputMethodTextChanged(evt);
            }
        });
        jPanel1.add(lblDetalleSancionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        btnCancelarCalificacionJugador.setBackground(new java.awt.Color(255, 204, 204));
        btnCancelarCalificacionJugador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCancelarCalificacionJugador.setText("CANCELAR");
        btnCancelarCalificacionJugador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnCancelarCalificacionJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, -1, -1));

        btnSalirDetalleCalificacionJugador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar.png"))); // NOI18N
        btnSalirDetalleCalificacionJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirDetalleCalificacionJugadorActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalirDetalleCalificacionJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 25, 25));

        lblReseñaCalificacionJugador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/escribir.png"))); // NOI18N
        jPanel1.add(lblReseñaCalificacionJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 39, 42));

        lblCalifiacionJugador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/calificacion_3.png"))); // NOI18N
        jPanel1.add(lblCalifiacionJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 155, 39, 42));

        cboxCalificacionJugador.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar...", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jPanel1.add(cboxCalificacionJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 165, 400, -1));

        lblIdentificacionCalificacionJugador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/identificacion.png"))); // NOI18N
        jPanel1.add(lblIdentificacionCalificacionJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 39, 42));

        txtIdentificacionCalificacionJugador.setText("Identificacion");
        jPanel1.add(txtIdentificacionCalificacionJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 400, 30));

        txtAReseñaCalificacionJugador.setColumns(20);
        txtAReseñaCalificacionJugador.setRows(5);
        jScrollPane1.setViewportView(txtAReseñaCalificacionJugador);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 400, 120));

        btnAceptarCalificacionJugador.setBackground(new java.awt.Color(204, 255, 204));
        btnAceptarCalificacionJugador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAceptarCalificacionJugador.setText("ACEPTAR");
        btnAceptarCalificacionJugador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnAceptarCalificacionJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, -1));

        lblCalificacionJugador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/calificacion_1.png"))); // NOI18N
        jPanel1.add(lblCalificacionJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 450));

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

    private void btnSalirDetalleCalificacionJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirDetalleCalificacionJugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirDetalleCalificacionJugadorActionPerformed

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
            java.util.logging.Logger.getLogger(DetalleCalificacionesJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetalleCalificacionesJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetalleCalificacionesJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetalleCalificacionesJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetalleCalificacionesJugador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAceptarCalificacionJugador;
    public javax.swing.JButton btnCancelarCalificacionJugador;
    public javax.swing.JButton btnSalirDetalleCalificacionJugador;
    public javax.swing.JComboBox cboxCalificacionJugador;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCalifiacionJugador;
    private javax.swing.JLabel lblCalificacionJugador;
    private javax.swing.JLabel lblDetalleSancionar;
    private javax.swing.JLabel lblIdentificacionCalificacionJugador;
    private javax.swing.JLabel lblReseñaCalificacionJugador;
    public javax.swing.JTextArea txtAReseñaCalificacionJugador;
    public javax.swing.JTextField txtIdentificacionCalificacionJugador;
    // End of variables declaration//GEN-END:variables
}