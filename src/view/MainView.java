package view;

import javax.swing.UIManager;

public class MainView extends javax.swing.JFrame {

    public MainView() throws Exception{
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        piBackground = new org.edisoncor.gui.panel.PanelImage();
        jbtVerifyEmails = new javax.swing.JButton();
        jbtEmails = new javax.swing.JButton();
        jbtFingeringTest = new javax.swing.JButton();
        jbtProposal = new javax.swing.JButton();
        jbtVouchers = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/images/main_logo.png")).getImage());
        setResizable(false);

        piBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mainview/bg_main.png"))); // NOI18N
        piBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtVerifyEmails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mainview/btn_verify_email_off.png"))); // NOI18N
        jbtVerifyEmails.setBorder(null);
        jbtVerifyEmails.setBorderPainted(false);
        jbtVerifyEmails.setContentAreaFilled(false);
        jbtVerifyEmails.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtVerifyEmails.setDefaultCapable(false);
        jbtVerifyEmails.setFocusPainted(false);
        jbtVerifyEmails.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mainview/btn_verify_email_on.png"))); // NOI18N
        jbtVerifyEmails.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mainview/btn_verify_email_on.png"))); // NOI18N
        piBackground.add(jbtVerifyEmails, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jbtEmails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mainview/btn_email_off.png"))); // NOI18N
        jbtEmails.setBorder(null);
        jbtEmails.setBorderPainted(false);
        jbtEmails.setContentAreaFilled(false);
        jbtEmails.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtEmails.setDefaultCapable(false);
        jbtEmails.setFocusPainted(false);
        jbtEmails.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mainview/btn_email_on.png"))); // NOI18N
        jbtEmails.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mainview/btn_email_on.png"))); // NOI18N
        piBackground.add(jbtEmails, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jbtFingeringTest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mainview/btn_fingering_test_off.png"))); // NOI18N
        jbtFingeringTest.setBorder(null);
        jbtFingeringTest.setBorderPainted(false);
        jbtFingeringTest.setContentAreaFilled(false);
        jbtFingeringTest.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtFingeringTest.setDefaultCapable(false);
        jbtFingeringTest.setFocusPainted(false);
        jbtFingeringTest.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mainview/btn_fingering_test_on.png"))); // NOI18N
        jbtFingeringTest.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mainview/btn_fingering_test_on.png"))); // NOI18N
        piBackground.add(jbtFingeringTest, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jbtProposal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mainview/btn_proposal_off.png"))); // NOI18N
        jbtProposal.setBorder(null);
        jbtProposal.setBorderPainted(false);
        jbtProposal.setContentAreaFilled(false);
        jbtProposal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtProposal.setDefaultCapable(false);
        jbtProposal.setFocusPainted(false);
        jbtProposal.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mainview/btn_proposal_on.png"))); // NOI18N
        jbtProposal.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mainview/btn_proposal_on.png"))); // NOI18N
        piBackground.add(jbtProposal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jbtVouchers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mainview/btn_vouches_off.png"))); // NOI18N
        jbtVouchers.setBorder(null);
        jbtVouchers.setBorderPainted(false);
        jbtVouchers.setContentAreaFilled(false);
        jbtVouchers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtVouchers.setDefaultCapable(false);
        jbtVouchers.setFocusPainted(false);
        jbtVouchers.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mainview/btn_vouches_on.png"))); // NOI18N
        jbtVouchers.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mainview/btn_vouches_on.png"))); // NOI18N
        piBackground.add(jbtVouchers, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(piBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(piBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jbtEmails;
    public javax.swing.JButton jbtFingeringTest;
    public javax.swing.JButton jbtProposal;
    public javax.swing.JButton jbtVerifyEmails;
    public javax.swing.JButton jbtVouchers;
    private org.edisoncor.gui.panel.PanelImage piBackground;
    // End of variables declaration//GEN-END:variables
}