package view.emails;

import javax.swing.UIManager;

public class EmailTemplateView extends javax.swing.JFrame {

    public EmailTemplateView() throws Exception{
        UIManager.setLookAndFeel(UIManager.getLookAndFeel());
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpiBackground = new org.edisoncor.gui.panel.PanelImage();
        jLabel1 = new javax.swing.JLabel();
        jpAccount = new javax.swing.JPanel();
        jtfSubject = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jbtUpdateTemplate = new javax.swing.JButton();
        jbtSaveTemplate = new javax.swing.JButton();
        jbtCancelTemplate = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaTemplate = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jcbTemplates = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jtfNameTemplate = new javax.swing.JTextField();
        jbtDeleteTemplate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/images/emails/enviar-correo.png")).getImage());
        setResizable(false);

        jpiBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/emails/bg_test.png"))); // NOI18N
        jpiBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Montserrat Alternates ExtraBold", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Plantillas de correos");
        jpiBackground.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jpAccount.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Plantillas"), "Plantilla", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Montserrat Alternates Medium", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jpAccount.setOpaque(false);
        jpAccount.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtfSubject.setFont(new java.awt.Font("Montserrat Alternates SemiBold", 0, 12)); // NOI18N
        jpAccount.add(jtfSubject, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 720, -1));

        jLabel3.setFont(new java.awt.Font("Montserrat Alternates SemiBold", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Texto:");
        jpAccount.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jbtUpdateTemplate.setText("Actualizar");
        jbtUpdateTemplate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtUpdateTemplate.setEnabled(false);
        jbtUpdateTemplate.setFocusPainted(false);
        jpAccount.add(jbtUpdateTemplate, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 100, -1));

        jbtSaveTemplate.setText("Guardar");
        jbtSaveTemplate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtSaveTemplate.setFocusPainted(false);
        jpAccount.add(jbtSaveTemplate, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 100, -1));

        jbtCancelTemplate.setText("Cancelar");
        jbtCancelTemplate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtCancelTemplate.setEnabled(false);
        jbtCancelTemplate.setFocusPainted(false);
        jpAccount.add(jbtCancelTemplate, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 100, -1));

        jLabel4.setFont(new java.awt.Font("Montserrat Alternates SemiBold", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre de plantilla:");
        jpAccount.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jtaTemplate.setColumns(20);
        jtaTemplate.setLineWrap(true);
        jScrollPane1.setViewportView(jtaTemplate);

        jpAccount.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 800, 240));

        jLabel8.setFont(new java.awt.Font("Montserrat Alternates SemiBold", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Plantillas disponibles:");
        jpAccount.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jcbTemplates.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---- Seleccionar ----" }));
        jcbTemplates.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jcbTemplates.setFocusable(false);
        jpAccount.add(jcbTemplates, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 230, -1));

        jLabel5.setFont(new java.awt.Font("Montserrat Alternates SemiBold", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Asunto:");
        jpAccount.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jtfNameTemplate.setFont(new java.awt.Font("Montserrat Alternates SemiBold", 0, 12)); // NOI18N
        jpAccount.add(jtfNameTemplate, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 650, -1));

        jbtDeleteTemplate.setText("Eliminar");
        jbtDeleteTemplate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtDeleteTemplate.setEnabled(false);
        jbtDeleteTemplate.setFocusPainted(false);
        jpAccount.add(jbtDeleteTemplate, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, 100, -1));

        jpiBackground.add(jpAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 860, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpiBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 893, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpiBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton jbtCancelTemplate;
    public javax.swing.JButton jbtDeleteTemplate;
    public javax.swing.JButton jbtSaveTemplate;
    public javax.swing.JButton jbtUpdateTemplate;
    public javax.swing.JComboBox<String> jcbTemplates;
    private javax.swing.JPanel jpAccount;
    public org.edisoncor.gui.panel.PanelImage jpiBackground;
    public javax.swing.JTextArea jtaTemplate;
    public javax.swing.JTextField jtfNameTemplate;
    public javax.swing.JTextField jtfSubject;
    // End of variables declaration//GEN-END:variables
}
