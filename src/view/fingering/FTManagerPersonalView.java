package view.fingering;

import javax.swing.UIManager;

public class FTManagerPersonalView extends javax.swing.JFrame {

    public FTManagerPersonalView() throws Exception{
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        piBackground = new org.edisoncor.gui.panel.PanelImage();
        jbtSearch = new javax.swing.JButton();
        jtfSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPersonal = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/images/fingering_test/escritura.png")).getImage());
        setResizable(false);

        piBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fingering_test/bg_mp.png"))); // NOI18N
        piBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fingering_test/btn_search_mp_off.png"))); // NOI18N
        jbtSearch.setBorder(null);
        jbtSearch.setBorderPainted(false);
        jbtSearch.setContentAreaFilled(false);
        jbtSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtSearch.setDefaultCapable(false);
        jbtSearch.setFocusPainted(false);
        jbtSearch.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fingering_test/btn_search_mp_on.png"))); // NOI18N
        jbtSearch.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fingering_test/btn_search_mp_on.png"))); // NOI18N
        piBackground.add(jbtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 51, -1, -1));

        jtfSearch.setBorder(null);
        piBackground.add(jtfSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 57, 205, -1));

        jtPersonal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DNI", "NOMBRE", "RESULTADOS"
            }
        ));
        jScrollPane1.setViewportView(jtPersonal);

        piBackground.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 118, 692, 288));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(piBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(piBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton jbtSearch;
    public javax.swing.JTable jtPersonal;
    public javax.swing.JTextField jtfSearch;
    private org.edisoncor.gui.panel.PanelImage piBackground;
    // End of variables declaration//GEN-END:variables
}
