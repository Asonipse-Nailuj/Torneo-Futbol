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
public class DetalleEquipos extends javax.swing.JFrame {

    /**
     * Creates new form GestionarPartidos
     */
    public DetalleEquipos() {
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
        lblEquipo1Detalle = new javax.swing.JLabel();
        lblEquipo2Detalle = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableEquipo1Detalle = new javax.swing.JTable();
        btnSalirDetalleEquipos = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableEquipo2Detalle = new javax.swing.JTable();
        lblVsDetalleEquipo = new javax.swing.JLabel();
        lblDetalleEquipos = new javax.swing.JLabel();
        lblImagenEquipo1 = new javax.swing.JLabel();
        lblImagenEquipo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEquipo1Detalle.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        lblEquipo1Detalle.setText("EQUIPO 1");
        jPanel1.add(lblEquipo1Detalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, -1, -1));

        lblEquipo2Detalle.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        lblEquipo2Detalle.setText("EQUIPO 2");
        jPanel1.add(lblEquipo2Detalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(887, 100, -1, -1));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableEquipo1Detalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Documento", "Nombre", "Suscripcion", "Modo", "Reemplazar", "Sancionar"
            }
        ));
        jScrollPane4.setViewportView(tableEquipo1Detalle);

        jPanel2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 250));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 560, 250));

        btnSalirDetalleEquipos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar.png"))); // NOI18N
        jPanel1.add(btnSalirDetalleEquipos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1245, 5, 25, 25));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableEquipo2Detalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Documento", "Nombre", "Suscripcion", "Modo", "Reemplazar", "Sancionar"
            }
        ));
        jScrollPane2.setViewportView(tableEquipo2Detalle);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 250));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(695, 150, 580, 250));

        lblVsDetalleEquipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/vs.png"))); // NOI18N
        jPanel1.add(lblVsDetalleEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 200, 92, -1));

        lblDetalleEquipos.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        lblDetalleEquipos.setText("DETALLE  EQUIPOS");
        jPanel1.add(lblDetalleEquipos, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, -1, -1));

        lblImagenEquipo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/camiseta_1.png"))); // NOI18N
        lblImagenEquipo1.setText("jLabel2");
        jPanel1.add(lblImagenEquipo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 0, 332, 333));

        lblImagenEquipo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/camiseta_2.png"))); // NOI18N
        lblImagenEquipo2.setText("jLabel2");
        jPanel1.add(lblImagenEquipo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 0, 332, 333));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(DetalleEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetalleEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetalleEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetalleEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetalleEquipos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnSalirDetalleEquipos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblDetalleEquipos;
    private javax.swing.JLabel lblEquipo1Detalle;
    private javax.swing.JLabel lblEquipo2Detalle;
    private javax.swing.JLabel lblImagenEquipo1;
    private javax.swing.JLabel lblImagenEquipo2;
    private javax.swing.JLabel lblVsDetalleEquipo;
    public javax.swing.JTable tableEquipo1Detalle;
    public javax.swing.JTable tableEquipo2Detalle;
    // End of variables declaration//GEN-END:variables
}
