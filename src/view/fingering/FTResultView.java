package view.fingering;

import javax.swing.UIManager;

public class FTResultView extends javax.swing.JFrame {

    public FTResultView() throws Exception{
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        jbtDeleteTest = new javax.swing.JButton();
        jlStartTime = new javax.swing.JLabel();
        jlEndTime = new javax.swing.JLabel();
        jlDuration = new javax.swing.JLabel();
        jlTestAverage = new javax.swing.JLabel();
        jlSimilarityPercentage = new javax.swing.JLabel();
        jlStartTest = new javax.swing.JLabel();
        jlEndTest = new javax.swing.JLabel();
        jlDurationTest = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlTests = new javax.swing.JList<>();
        jLabel10 = new javax.swing.JLabel();
        jlName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/images/fingering_test/escritura.png")).getImage());
        setResizable(false);

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fingering_test/bg_resultview.png"))); // NOI18N
        panelImage1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtDeleteTest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fingering_test/btn_deletetest_off.png"))); // NOI18N
        jbtDeleteTest.setBorder(null);
        jbtDeleteTest.setBorderPainted(false);
        jbtDeleteTest.setContentAreaFilled(false);
        jbtDeleteTest.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtDeleteTest.setDefaultCapable(false);
        jbtDeleteTest.setFocusPainted(false);
        jbtDeleteTest.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fingering_test/btn_deletetest_on.png"))); // NOI18N
        jbtDeleteTest.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fingering_test/btn_deletetest_on.png"))); // NOI18N
        panelImage1.add(jbtDeleteTest, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 80, -1, -1));

        jlStartTime.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jlStartTime.setForeground(new java.awt.Color(51, 51, 51));
        jlStartTime.setText("dd/MM/yyyy hh:mm:ss aa");
        panelImage1.add(jlStartTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 68, -1, -1));

        jlEndTime.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jlEndTime.setForeground(new java.awt.Color(51, 51, 51));
        jlEndTime.setText("dd/MM/yyyy hh:mm:ss aa");
        panelImage1.add(jlEndTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 84, -1, -1));

        jlDuration.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jlDuration.setForeground(new java.awt.Color(51, 51, 51));
        jlDuration.setText("00:00:00:00");
        panelImage1.add(jlDuration, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 100, -1, -1));

        jlTestAverage.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jlTestAverage.setForeground(new java.awt.Color(51, 51, 51));
        jlTestAverage.setText("0.00%");
        panelImage1.add(jlTestAverage, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 84, -1, -1));

        jlSimilarityPercentage.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jlSimilarityPercentage.setForeground(new java.awt.Color(51, 51, 51));
        jlSimilarityPercentage.setText("Porcentaje de similitud: 0.00%");
        panelImage1.add(jlSimilarityPercentage, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, -1, -1));

        jlStartTest.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jlStartTest.setForeground(new java.awt.Color(51, 51, 51));
        jlStartTest.setText("Inicio: dd/MM/yyyy hh:mm:ss aa");
        panelImage1.add(jlStartTest, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, -1, -1));

        jlEndTest.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jlEndTest.setForeground(new java.awt.Color(51, 51, 51));
        jlEndTest.setText("Fin: dd/MM/yyyy hh:mm:ss aa");
        panelImage1.add(jlEndTest, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, -1, -1));

        jlDurationTest.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jlDurationTest.setForeground(new java.awt.Color(51, 51, 51));
        jlDurationTest.setText("Duración: 00:00:00:00");
        panelImage1.add(jlDurationTest, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, -1, -1));

        jScrollPane1.setBorder(null);

        jScrollPane1.setViewportView(jlTests);

        panelImage1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 158, 143, 175));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fingering_test/result.png"))); // NOI18N
        panelImage1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 340, 70));

        jlName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlName.setForeground(new java.awt.Color(102, 102, 102));
        jlName.setText("TEST");
        panelImage1.add(jlName, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 31, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton jbtDeleteTest;
    public javax.swing.JLabel jlDuration;
    public javax.swing.JLabel jlDurationTest;
    public javax.swing.JLabel jlEndTest;
    public javax.swing.JLabel jlEndTime;
    public javax.swing.JLabel jlName;
    public javax.swing.JLabel jlSimilarityPercentage;
    public javax.swing.JLabel jlStartTest;
    public javax.swing.JLabel jlStartTime;
    public javax.swing.JLabel jlTestAverage;
    public javax.swing.JList<String> jlTests;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    // End of variables declaration//GEN-END:variables
}
