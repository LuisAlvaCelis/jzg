package view.fingering;

import javax.swing.UIManager;

public class FTStartTimeView extends javax.swing.JFrame {

    public FTStartTimeView() throws Exception{
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        piBackground = new org.edisoncor.gui.panel.PanelImage();
        jlSeconds = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        piBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fingering_test/bg_startime.png"))); // NOI18N
        piBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlSeconds.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jlSeconds.setForeground(new java.awt.Color(11, 34, 57));
        piBackground.add(jlSeconds, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 190, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(piBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(piBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel jlSeconds;
    private org.edisoncor.gui.panel.PanelImage piBackground;
    // End of variables declaration//GEN-END:variables
}
