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
        jbtUpdate = new javax.swing.JButton();
        jbtSearch = new javax.swing.JButton();
        jbtNew = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTests = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtaDetailTest = new javax.swing.JTextArea();
        jtfSearchTest = new javax.swing.JTextField();
        jtfNameTest = new javax.swing.JTextField();
        jbtRegister = new javax.swing.JButton();
        jsMinutes = new javax.swing.JSpinner();
        jsSeconds = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/images/fingering_test/escritura.png")).getImage());
        setResizable(false);

        jpiBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fingering_test/bg_mtview.png"))); // NOI18N
        jpiBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fingering_test/btn_update_mt_off.png"))); // NOI18N
        jbtUpdate.setBorder(null);
        jbtUpdate.setBorderPainted(false);
        jbtUpdate.setContentAreaFilled(false);
        jbtUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtUpdate.setDefaultCapable(false);
        jbtUpdate.setEnabled(false);
        jbtUpdate.setFocusPainted(false);
        jbtUpdate.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fingering_test/btn_update_mt_on.png"))); // NOI18N
        jbtUpdate.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fingering_test/btn_update_mt_on.png"))); // NOI18N
        jpiBackground.add(jbtUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, -1, -1));

        jbtSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fingering_test/btn_search_mt_off.png"))); // NOI18N
        jbtSearch.setBorder(null);
        jbtSearch.setBorderPainted(false);
        jbtSearch.setContentAreaFilled(false);
        jbtSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtSearch.setDefaultCapable(false);
        jbtSearch.setFocusPainted(false);
        jbtSearch.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fingering_test/btn_search_mt_on.png"))); // NOI18N
        jbtSearch.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fingering_test/btn_search_mt_on.png"))); // NOI18N
        jpiBackground.add(jbtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 110, -1, -1));

        jbtNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fingering_test/btn_new_mt_off.png"))); // NOI18N
        jbtNew.setBorder(null);
        jbtNew.setBorderPainted(false);
        jbtNew.setContentAreaFilled(false);
        jbtNew.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtNew.setDefaultCapable(false);
        jbtNew.setFocusPainted(false);
        jbtNew.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fingering_test/btn_new_mt_on.png"))); // NOI18N
        jbtNew.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fingering_test/btn_new_mt_on.png"))); // NOI18N
        jpiBackground.add(jbtNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, -1, -1));

        jtTests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "F. ACTUALIZACIÓN", "MODIFICAR", "ELIMINAR"
            }
        ));
        jtTests.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtTests);

        jpiBackground.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 410, 310));

        jScrollPane1.getViewport().setOpaque(false);
        jScrollPane2.setBorder(null);
        jScrollPane2.setOpaque(false);

        jtaDetailTest.setColumns(20);
        jtaDetailTest.setForeground(new java.awt.Color(51, 51, 51));
        jtaDetailTest.setLineWrap(true);
        jtaDetailTest.setBorder(null);
        jScrollPane2.setViewportView(jtaDetailTest);

        jpiBackground.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 150, 270, 300));

        jtfSearchTest.setBorder(null);
        jpiBackground.add(jtfSearchTest, new org.netbeans.lib.awtextra.AbsoluteConstraints(608, 82, 176, -1));

        jtfNameTest.setBorder(null);
        jpiBackground.add(jtfNameTest, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 83, 175, -1));

        jbtRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fingering_test/btn_register_mt_off.png"))); // NOI18N
        jbtRegister.setBorder(null);
        jbtRegister.setBorderPainted(false);
        jbtRegister.setContentAreaFilled(false);
        jbtRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtRegister.setDefaultCapable(false);
        jbtRegister.setFocusPainted(false);
        jbtRegister.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fingering_test/btn_register_mt_on.png"))); // NOI18N
        jbtRegister.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fingering_test/btn_register_mt_on.png"))); // NOI18N
        jpiBackground.add(jbtRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, -1, -1));

        jsMinutes.setBorder(javax.swing.BorderFactory.createTitledBorder("Minutos"));
        jpiBackground.add(jsMinutes, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 100, -1));

        jsSeconds.setBorder(javax.swing.BorderFactory.createTitledBorder("Segundos"));
        jpiBackground.add(jsSeconds, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 100, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpiBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 917, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpiBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JButton jbtNew;
    public javax.swing.JButton jbtRegister;
    public javax.swing.JButton jbtSearch;
    public javax.swing.JButton jbtUpdate;
    private org.edisoncor.gui.panel.PanelImage jpiBackground;
    public javax.swing.JSpinner jsMinutes;
    public javax.swing.JSpinner jsSeconds;
    public javax.swing.JTable jtTests;
    public javax.swing.JTextArea jtaDetailTest;
    public javax.swing.JTextField jtfNameTest;
    public javax.swing.JTextField jtfSearchTest;
    // End of variables declaration//GEN-END:variables
}
