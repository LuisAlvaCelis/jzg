package view.svc;

import javax.swing.UIManager;

public class SVCMainView extends javax.swing.JFrame {

    public SVCMainView() throws Exception{
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpiBackground = new org.edisoncor.gui.panel.PanelImage();
        jtfPathFile1 = new javax.swing.JTextField();
        jtfPathFile2 = new javax.swing.JTextField();
        jbtStart1 = new javax.swing.JButton();
        jbtExamine1 = new javax.swing.JButton();
        jbtExamine2 = new javax.swing.JButton();
        jbtStart2 = new javax.swing.JButton();
        jlCurrent1 = new javax.swing.JLabel();
        jlCurrent2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/images/svc/validacion.png")).getImage());
        setResizable(false);

        jpiBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/svc/bg_mainview.png"))); // NOI18N
        jpiBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtfPathFile1.setEditable(false);
        jtfPathFile1.setBackground(new java.awt.Color(255, 255, 255));
        jtfPathFile1.setBorder(null);
        jtfPathFile1.setRequestFocusEnabled(false);
        jpiBackground.add(jtfPathFile1, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 225, 320, -1));

        jtfPathFile2.setEditable(false);
        jtfPathFile2.setBackground(new java.awt.Color(255, 255, 255));
        jtfPathFile2.setBorder(null);
        jtfPathFile2.setRequestFocusEnabled(false);
        jpiBackground.add(jtfPathFile2, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 200, 320, -1));

        jbtStart1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/svc/btn_start_svc_off.png"))); // NOI18N
        jbtStart1.setBorder(null);
        jbtStart1.setBorderPainted(false);
        jbtStart1.setContentAreaFilled(false);
        jbtStart1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtStart1.setDefaultCapable(false);
        jbtStart1.setFocusPainted(false);
        jbtStart1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/svc/btn_start_svc_on.png"))); // NOI18N
        jbtStart1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/svc/btn_start_svc_on.png"))); // NOI18N
        jpiBackground.add(jbtStart1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, -1, -1));

        jbtExamine1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/svc/btn_examine_svc_off.png"))); // NOI18N
        jbtExamine1.setBorder(null);
        jbtExamine1.setBorderPainted(false);
        jbtExamine1.setContentAreaFilled(false);
        jbtExamine1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtExamine1.setDefaultCapable(false);
        jbtExamine1.setFocusPainted(false);
        jbtExamine1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/svc/btn_examine_svc_on.png"))); // NOI18N
        jbtExamine1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/svc/btn_examine_svc_on.png"))); // NOI18N
        jpiBackground.add(jbtExamine1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, -1, -1));

        jbtExamine2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/svc/btn_examine_svc_off.png"))); // NOI18N
        jbtExamine2.setBorder(null);
        jbtExamine2.setBorderPainted(false);
        jbtExamine2.setContentAreaFilled(false);
        jbtExamine2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtExamine2.setDefaultCapable(false);
        jbtExamine2.setFocusPainted(false);
        jbtExamine2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/svc/btn_examine_svc_on.png"))); // NOI18N
        jbtExamine2.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/svc/btn_examine_svc_on.png"))); // NOI18N
        jpiBackground.add(jbtExamine2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 230, -1, -1));

        jbtStart2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/svc/btn_start_svc_off.png"))); // NOI18N
        jbtStart2.setBorder(null);
        jbtStart2.setBorderPainted(false);
        jbtStart2.setContentAreaFilled(false);
        jbtStart2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtStart2.setDefaultCapable(false);
        jbtStart2.setFocusPainted(false);
        jbtStart2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/svc/btn_start_svc_on.png"))); // NOI18N
        jbtStart2.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/svc/btn_start_svc_on.png"))); // NOI18N
        jpiBackground.add(jbtStart2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, -1, -1));
        jpiBackground.add(jlCurrent1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, -1));
        jpiBackground.add(jlCurrent2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpiBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 892, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpiBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jbtExamine1;
    public javax.swing.JButton jbtExamine2;
    public javax.swing.JButton jbtStart1;
    public javax.swing.JButton jbtStart2;
    public javax.swing.JLabel jlCurrent1;
    public javax.swing.JLabel jlCurrent2;
    private org.edisoncor.gui.panel.PanelImage jpiBackground;
    public javax.swing.JTextField jtfPathFile1;
    public javax.swing.JTextField jtfPathFile2;
    // End of variables declaration//GEN-END:variables
}
