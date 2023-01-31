package view.fingering;

import javax.swing.UIManager;

public class FTMainView extends javax.swing.JFrame {

    public FTMainView() throws Exception{
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpiBackground = new org.edisoncor.gui.panel.PanelImage();
        jbtStartTest = new javax.swing.JButton();
        jbtManager = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/images/fingering_test/escritura.png")).getImage());
        setResizable(false);

        jpiBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fingering_test/bg_mainview.png"))); // NOI18N
        jpiBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtStartTest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fingering_test/btn_start_test_off.png"))); // NOI18N
        jbtStartTest.setBorder(null);
        jbtStartTest.setBorderPainted(false);
        jbtStartTest.setContentAreaFilled(false);
        jbtStartTest.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtStartTest.setDefaultCapable(false);
        jbtStartTest.setFocusPainted(false);
        jbtStartTest.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fingering_test/btn_start_test_on.png"))); // NOI18N
        jbtStartTest.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fingering_test/btn_start_test_on.png"))); // NOI18N
        jpiBackground.add(jbtStartTest, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jbtManager.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fingering_test/btn_admin_off.png"))); // NOI18N
        jbtManager.setBorder(null);
        jbtManager.setBorderPainted(false);
        jbtManager.setContentAreaFilled(false);
        jbtManager.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtManager.setDefaultCapable(false);
        jbtManager.setFocusPainted(false);
        jbtManager.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fingering_test/btn_admin_on.png"))); // NOI18N
        jbtManager.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fingering_test/btn_admin_on.png"))); // NOI18N
        jpiBackground.add(jbtManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpiBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpiBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jbtManager;
    public javax.swing.JButton jbtStartTest;
    private org.edisoncor.gui.panel.PanelImage jpiBackground;
    // End of variables declaration//GEN-END:variables
}
