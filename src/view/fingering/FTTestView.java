package view.fingering;

import javax.swing.UIManager;

public class FTTestView extends javax.swing.JFrame {

    public FTTestView() throws Exception{
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        piBackground = new org.edisoncor.gui.panel.PanelImage();
        jbtCancel = new javax.swing.JButton();
        jbtNext = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaPreview = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtaResult = new javax.swing.JTextArea();
        jlNameTest = new javax.swing.JLabel();
        jlTime = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        piBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fingering_test/bg_testview.png"))); // NOI18N
        piBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fingering_test/btn_cancel_off.png"))); // NOI18N
        jbtCancel.setBorder(null);
        jbtCancel.setBorderPainted(false);
        jbtCancel.setContentAreaFilled(false);
        jbtCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtCancel.setDefaultCapable(false);
        jbtCancel.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fingering_test/btn_cancel_on.png"))); // NOI18N
        jbtCancel.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fingering_test/btn_cancel_on.png"))); // NOI18N
        piBackground.add(jbtCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 230, -1, -1));

        jbtNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fingering_test/btn_next_off.png"))); // NOI18N
        jbtNext.setBorder(null);
        jbtNext.setBorderPainted(false);
        jbtNext.setContentAreaFilled(false);
        jbtNext.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtNext.setDefaultCapable(false);
        jbtNext.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fingering_test/btn_next_on.png"))); // NOI18N
        jbtNext.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fingering_test/btn_next_on.png"))); // NOI18N
        piBackground.add(jbtNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 190, -1, -1));

        jScrollPane1.getViewport().setOpaque(false);
        jScrollPane1.setOpaque(false);

        jtaPreview.setEditable(false);
        jtaPreview.setColumns(20);
        jtaPreview.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jtaPreview.setLineWrap(true);
        jtaPreview.setFocusable(false);
        jtaPreview.setOpaque(false);
        jScrollPane1.setViewportView(jtaPreview);

        piBackground.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 140, 308, 262));

        jScrollPane5.setOpaque(false);

        jtaResult.setTransferHandler(null);
        jtaResult.setColumns(20);
        jtaResult.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jtaResult.setLineWrap(true);
        jScrollPane5.setViewportView(jtaResult);

        piBackground.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 140, 308, 262));

        jlNameTest.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlNameTest.setForeground(new java.awt.Color(118, 118, 118));
        piBackground.add(jlNameTest, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 28, -1, -1));

        jlTime.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlTime.setForeground(new java.awt.Color(118, 118, 118));
        jlTime.setText("Tiempo restante: 00:00:00");
        piBackground.add(jlTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(piBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 904, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(piBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    public javax.swing.JButton jbtCancel;
    public javax.swing.JButton jbtNext;
    public javax.swing.JLabel jlNameTest;
    public javax.swing.JLabel jlTime;
    public javax.swing.JTextArea jtaPreview;
    public javax.swing.JTextArea jtaResult;
    private org.edisoncor.gui.panel.PanelImage piBackground;
    // End of variables declaration//GEN-END:variables
}
