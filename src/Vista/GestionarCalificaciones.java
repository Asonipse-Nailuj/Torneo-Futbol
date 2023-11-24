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
public class GestionarCalificaciones extends javax.swing.JFrame {

    /**
     * Creates new form GestionarPartidos
     */
    public GestionarCalificaciones() {
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
        lblGestionCalificacion = new javax.swing.JLabel();
        btnConsultarCalificacion = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableCalificacion = new javax.swing.JTable();
        btnSalirGestionCalificaciones = new javax.swing.JButton();
        lblIdentificacionJugadorCalificacion = new javax.swing.JLabel();
        txtIdentificacionJugadorCalificacion = new javax.swing.JTextField();
        lblImagenInfraccion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblGestionCalificacion.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        lblGestionCalificacion.setText("GESTION CALIFICACIONES");
        lblGestionCalificacion.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                lblGestionCalificacionInputMethodTextChanged(evt);
            }
        });
        jPanel1.add(lblGestionCalificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        btnConsultarCalificacion.setBackground(new java.awt.Color(204, 255, 204));
        btnConsultarCalificacion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnConsultarCalificacion.setText("CONSULTAR");
        btnConsultarCalificacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnConsultarCalificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableCalificacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Documento", "Puntaje Promedio", "Ver Detalle"
            }
        ));
        jScrollPane2.setViewportView(tableCalificacion);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 250));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 760, 250));

        btnSalirGestionCalificaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar.png"))); // NOI18N
        jPanel1.add(btnSalirGestionCalificaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 5, 25, 25));

        lblIdentificacionJugadorCalificacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/identificacion.png"))); // NOI18N
        jPanel1.add(lblIdentificacionJugadorCalificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 39, 42));

        txtIdentificacionJugadorCalificacion.setText("Identificacion");
        jPanel1.add(txtIdentificacionJugadorCalificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 250, 30));

        lblImagenInfraccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/calificacion_1.png"))); // NOI18N
        jPanel1.add(lblImagenInfraccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 618, 443));

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

    private void lblGestionCalificacionInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_lblGestionCalificacionInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_lblGestionCalificacionInputMethodTextChanged

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
            java.util.logging.Logger.getLogger(GestionarCalificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionarCalificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionarCalificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionarCalificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionarCalificaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnConsultarCalificacion;
    public javax.swing.JButton btnSalirGestionCalificaciones;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblGestionCalificacion;
    private javax.swing.JLabel lblIdentificacionJugadorCalificacion;
    private javax.swing.JLabel lblImagenInfraccion;
    public javax.swing.JTable tableCalificacion;
    public javax.swing.JTextField txtIdentificacionJugadorCalificacion;
    // End of variables declaration//GEN-END:variables
}
