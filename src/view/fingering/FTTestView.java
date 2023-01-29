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
        jtaTestText1 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtaInputText1 = new javax.swing.JTextArea();

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

        jtaTestText1.setEditable(false);
        jtaTestText1.setColumns(20);
        jtaTestText1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jtaTestText1.setLineWrap(true);
        jtaTestText1.setFocusable(false);
        jtaTestText1.setOpaque(false);
        jScrollPane1.setViewportView(jtaTestText1);

        piBackground.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 140, 308, 262));

        jScrollPane5.setOpaque(false);

        jtaInputText1.setTransferHandler(null);
        jtaInputText1.setColumns(20);
        jtaInputText1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jtaInputText1.setLineWrap(true);
        jScrollPane5.setViewportView(jtaInputText1);

        piBackground.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 140, 308, 262));

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
    public javax.swing.JTextArea jtaInputText1;
    public javax.swing.JTextArea jtaTestText1;
    private org.edisoncor.gui.panel.PanelImage piBackground;
    // End of variables declaration//GEN-END:variables
}
