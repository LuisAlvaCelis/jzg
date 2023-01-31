package view.fingering;

import javax.swing.UIManager;

public class FTManagerLoginView extends javax.swing.JFrame {

    public FTManagerLoginView() throws Exception{
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpiBackground = new org.edisoncor.gui.panel.PanelImage();
        jbtShowPassword = new javax.swing.JCheckBox();
        jtfUsername = new javax.swing.JTextField();
        jpfPassword = new javax.swing.JPasswordField();
        jbtJoin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/images/fingering_test/escritura.png")).getImage());
        setResizable(false);

        jpiBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fingering_test/bg_loginview.png"))); // NOI18N
        jpiBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtShowPassword.setBorder(null);
        jbtShowPassword.setContentAreaFilled(false);
        jbtShowPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtShowPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fingering_test/show_password.png"))); // NOI18N
        jbtShowPassword.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fingering_test/hidden_password.png"))); // NOI18N
        jpiBackground.add(jbtShowPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, -1, -1));

        jtfUsername.setBorder(null);
        jpiBackground.add(jtfUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 132, 175, -1));

        jpfPassword.setBorder(null);
        jpiBackground.add(jpfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 174, 175, -1));

        jbtJoin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fingering_test/btn_ft_join_off.png"))); // NOI18N
        jbtJoin.setBorder(null);
        jbtJoin.setBorderPainted(false);
        jbtJoin.setContentAreaFilled(false);
        jbtJoin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtJoin.setDefaultCapable(false);
        jbtJoin.setFocusPainted(false);
        jbtJoin.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fingering_test/btn_ft_join_on.png"))); // NOI18N
        jbtJoin.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fingering_test/btn_ft_join_on.png"))); // NOI18N
        jpiBackground.add(jbtJoin, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpiBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpiBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jbtJoin;
    public javax.swing.JCheckBox jbtShowPassword;
    public javax.swing.JPasswordField jpfPassword;
    private org.edisoncor.gui.panel.PanelImage jpiBackground;
    public javax.swing.JTextField jtfUsername;
    // End of variables declaration//GEN-END:variables
}
