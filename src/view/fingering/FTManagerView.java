package view.fingering;

import javax.swing.UIManager;

public class FTManagerView extends javax.swing.JFrame {

    public FTManagerView() throws Exception{
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpiBackground = new org.edisoncor.gui.panel.PanelImage();
        jbtTests = new javax.swing.JButton();
        jbtRegisterPersonal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jpiBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fingering_test/bg_managerview.png"))); // NOI18N
        jpiBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtTests.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fingering_test/btn_test_off.png"))); // NOI18N
        jbtTests.setBorder(null);
        jbtTests.setBorderPainted(false);
        jbtTests.setContentAreaFilled(false);
        jbtTests.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtTests.setDefaultCapable(false);
        jbtTests.setFocusPainted(false);
        jbtTests.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fingering_test/btn_test_on.png"))); // NOI18N
        jbtTests.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fingering_test/btn_test_on.png"))); // NOI18N
        jpiBackground.add(jbtTests, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jbtRegisterPersonal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fingering_test/btn_register_personal_off.png"))); // NOI18N
        jbtRegisterPersonal.setBorder(null);
        jbtRegisterPersonal.setBorderPainted(false);
        jbtRegisterPersonal.setContentAreaFilled(false);
        jbtRegisterPersonal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtRegisterPersonal.setDefaultCapable(false);
        jbtRegisterPersonal.setFocusPainted(false);
        jbtRegisterPersonal.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fingering_test/btn_register_personal_on.png"))); // NOI18N
        jbtRegisterPersonal.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fingering_test/btn_register_personal_on.png"))); // NOI18N
        jpiBackground.add(jbtRegisterPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpiBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpiBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jbtRegisterPersonal;
    public javax.swing.JButton jbtTests;
    private org.edisoncor.gui.panel.PanelImage jpiBackground;
    // End of variables declaration//GEN-END:variables
}
