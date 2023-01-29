package view.fingering;

import javax.swing.UIManager;

public class FTLoginTestView extends javax.swing.JFrame {

    public FTLoginTestView() throws Exception{
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        piBackground = new org.edisoncor.gui.panel.PanelImage();
        jbtStart = new javax.swing.JButton();
        jtfName = new javax.swing.JTextField();
        jtfDni = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        piBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fingering_test/bg_logintest.png"))); // NOI18N
        piBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtStart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fingering_test/btn_start_off.png"))); // NOI18N
        jbtStart.setBorder(null);
        jbtStart.setBorderPainted(false);
        jbtStart.setContentAreaFilled(false);
        jbtStart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtStart.setDefaultCapable(false);
        jbtStart.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fingering_test/btn_start_on.png"))); // NOI18N
        jbtStart.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fingering_test/btn_start_on.png"))); // NOI18N
        piBackground.add(jbtStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, -1, -1));

        jtfName.setBorder(null);
        piBackground.add(jtfName, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 148, 200, -1));

        jtfDni.setBorder(null);
        piBackground.add(jtfDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 118, 200, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(piBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(piBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jbtStart;
    public javax.swing.JTextField jtfDni;
    public javax.swing.JTextField jtfName;
    private org.edisoncor.gui.panel.PanelImage piBackground;
    // End of variables declaration//GEN-END:variables
}
