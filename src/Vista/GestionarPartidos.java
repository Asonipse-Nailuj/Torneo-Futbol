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
public class GestionarPartidos extends javax.swing.JFrame {

    /**
     * Creates new form GestionarPartidos
     */
    public GestionarPartidos() {
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
        lblGestionPartidos = new javax.swing.JLabel();
        btnCrearPartido = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablePartidos = new javax.swing.JTable();
        btnSalirGestionPartidos = new javax.swing.JButton();
        lblEstadio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblGestionPartidos.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        lblGestionPartidos.setText("GESTION      PARTIDOS");
        jPanel1.add(lblGestionPartidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, -1));

        btnCrearPartido.setBackground(new java.awt.Color(255, 255, 255));
        btnCrearPartido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCrearPartido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/crear.png"))); // NOI18N
        btnCrearPartido.setText(" Crear Partido");
        jPanel1.add(btnCrearPartido, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablePartidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No°", "Fecha", "Estado", "Ver Detalle", "Confirmar"
            }
        ));
        jScrollPane2.setViewportView(tablePartidos);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 250));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 740, 250));

        btnSalirGestionPartidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar.png"))); // NOI18N
        jPanel1.add(btnSalirGestionPartidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 5, 25, 25));

        lblEstadio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/estadio.png"))); // NOI18N
        jPanel1.add(lblEstadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 440));

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCrearPartido;
    public javax.swing.JButton btnSalirGestionPartidos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblEstadio;
    private javax.swing.JLabel lblGestionPartidos;
    public javax.swing.JTable tablePartidos;
    // End of variables declaration//GEN-END:variables
}
