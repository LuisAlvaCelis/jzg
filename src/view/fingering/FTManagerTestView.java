package view.fingering;

import javax.swing.UIManager;

public class FTManagerTestView extends javax.swing.JFrame {

    public FTManagerTestView() throws Exception{
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpiBackground = new org.edisoncor.gui.panel.PanelImage();
        jbtTests = new javax.swing.JButton();
        jbtTests1 = new javax.swing.JButton();
        jbtTests2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtaTestText1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jpiBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fingering_test/bg_mtview.png"))); // NOI18N
        jpiBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtTests.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fingering_test/btn_update_mt_off.png"))); // NOI18N
        jbtTests.setBorder(null);
        jbtTests.setBorderPainted(false);
        jbtTests.setContentAreaFilled(false);
        jbtTests.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtTests.setDefaultCapable(false);
        jbtTests.setEnabled(false);
        jbtTests.setFocusPainted(false);
        jbtTests.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fingering_test/btn_update_mt_on.png"))); // NOI18N
        jbtTests.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fingering_test/btn_update_mt_on.png"))); // NOI18N
        jpiBackground.add(jbtTests, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, -1, -1));

        jbtTests1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fingering_test/btn_register_mt_off.png"))); // NOI18N
        jbtTests1.setBorder(null);
        jbtTests1.setBorderPainted(false);
        jbtTests1.setContentAreaFilled(false);
        jbtTests1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtTests1.setDefaultCapable(false);
        jbtTests1.setFocusPainted(false);
        jbtTests1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fingering_test/btn_register_mt_on.png"))); // NOI18N
        jbtTests1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fingering_test/btn_register_mt_on.png"))); // NOI18N
        jpiBackground.add(jbtTests1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, -1, -1));

        jbtTests2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fingering_test/btn_new_mt_off.png"))); // NOI18N
        jbtTests2.setBorder(null);
        jbtTests2.setBorderPainted(false);
        jbtTests2.setContentAreaFilled(false);
        jbtTests2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtTests2.setDefaultCapable(false);
        jbtTests2.setFocusPainted(false);
        jbtTests2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fingering_test/btn_new_mt_on.png"))); // NOI18N
        jbtTests2.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fingering_test/btn_new_mt_on.png"))); // NOI18N
        jpiBackground.add(jbtTests2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "F. REGISTRO", "MODIFICAR", "ELIMINAR"
            }
        ));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        jpiBackground.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 370, 300));

        jScrollPane1.getViewport().setOpaque(false);
        jScrollPane2.setBorder(null);
        jScrollPane2.setOpaque(false);

        jtaTestText1.setColumns(20);
        jtaTestText1.setForeground(new java.awt.Color(51, 51, 51));
        jtaTestText1.setLineWrap(true);
        jtaTestText1.setBorder(null);
        jScrollPane2.setViewportView(jtaTestText1);

        jpiBackground.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 150, 278, 270));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpiBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 868, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpiBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    public javax.swing.JButton jbtTests;
    public javax.swing.JButton jbtTests1;
    public javax.swing.JButton jbtTests2;
    private org.edisoncor.gui.panel.PanelImage jpiBackground;
    public javax.swing.JTextArea jtaTestText1;
    // End of variables declaration//GEN-END:variables
}
