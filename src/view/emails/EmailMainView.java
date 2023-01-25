package view.emails;

import javax.swing.UIManager;

public class EmailMainView extends javax.swing.JFrame {

    public EmailMainView() throws Exception{
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbgModalitySend = new javax.swing.ButtonGroup();
        jpiBackground = new org.edisoncor.gui.panel.PanelImage();
        jtfEmail = new javax.swing.JTextField();
        jpPasswordEmail = new javax.swing.JPasswordField();
        jcbShowPassword = new javax.swing.JCheckBox();
        jtfSetTimeSeconds = new javax.swing.JTextField();
        jrbCustomers = new javax.swing.JRadioButton();
        jrbTest = new javax.swing.JRadioButton();
        jbtTestAccounts = new javax.swing.JButton();
        jtfDirectoryPDFs = new javax.swing.JTextField();
        jtfCurrentPathFile = new javax.swing.JTextField();
        jbtBrowseFolderFiles = new javax.swing.JButton();
        jtfPathFileExcel = new javax.swing.JTextField();
        jbtUploadDataExcel = new javax.swing.JButton();
        jcbTemplates = new javax.swing.JComboBox<>();
        jbtTemplates = new javax.swing.JButton();
        jbtStart = new javax.swing.JButton();
        jbtContinue = new javax.swing.JButton();
        jbtPause = new javax.swing.JButton();
        jbtFinish = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaConsole = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/images/emails/enviar-correo.png")).getImage());
        setResizable(false);

        jpiBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/emails/bg_main.png"))); // NOI18N
        jpiBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtfEmail.setBackground(new java.awt.Color(61, 101, 182));
        jtfEmail.setFont(new java.awt.Font("Montserrat Alternates SemiBold", 1, 12)); // NOI18N
        jtfEmail.setForeground(new java.awt.Color(255, 255, 255));
        jtfEmail.setBorder(null);
        jpiBackground.add(jtfEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 230, -1));

        jpPasswordEmail.setBackground(new java.awt.Color(61, 101, 182));
        jpPasswordEmail.setFont(new java.awt.Font("Montserrat Alternates SemiBold", 1, 12)); // NOI18N
        jpPasswordEmail.setForeground(new java.awt.Color(255, 255, 255));
        jpPasswordEmail.setBorder(null);
        jpPasswordEmail.setEchoChar('•');
        jpPasswordEmail.setOpaque(true);
        jpiBackground.add(jpPasswordEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 230, -1));

        jcbShowPassword.setFont(new java.awt.Font("Montserrat Alternates SemiBold", 0, 12)); // NOI18N
        jcbShowPassword.setForeground(new java.awt.Color(255, 255, 255));
        jcbShowPassword.setBorder(null);
        jcbShowPassword.setContentAreaFilled(false);
        jcbShowPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jcbShowPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/emails/password_toggle_off.png"))); // NOI18N
        jcbShowPassword.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/emails/password_toggle_on.png"))); // NOI18N
        jpiBackground.add(jcbShowPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, -1, -1));

        jtfSetTimeSeconds.setBackground(new java.awt.Color(61, 101, 182));
        jtfSetTimeSeconds.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jtfSetTimeSeconds.setForeground(new java.awt.Color(255, 255, 255));
        jtfSetTimeSeconds.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfSetTimeSeconds.setBorder(null);
        jpiBackground.add(jtfSetTimeSeconds, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 40, -1));

        jbgModalitySend.add(jrbCustomers);
        jrbCustomers.setFont(new java.awt.Font("Montserrat Alternates SemiBold", 1, 12)); // NOI18N
        jrbCustomers.setForeground(new java.awt.Color(255, 255, 255));
        jrbCustomers.setText("Clientes");
        jrbCustomers.setContentAreaFilled(false);
        jrbCustomers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jrbCustomers.setFocusPainted(false);
        jrbCustomers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/emails/password_toggle_off.png"))); // NOI18N
        jrbCustomers.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/emails/password_toggle_on.png"))); // NOI18N
        jpiBackground.add(jrbCustomers, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, -1, -1));

        jbgModalitySend.add(jrbTest);
        jrbTest.setFont(new java.awt.Font("Montserrat Alternates SemiBold", 1, 12)); // NOI18N
        jrbTest.setForeground(new java.awt.Color(255, 255, 255));
        jrbTest.setSelected(true);
        jrbTest.setText("Prueba");
        jrbTest.setContentAreaFilled(false);
        jrbTest.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jrbTest.setFocusPainted(false);
        jrbTest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/emails/password_toggle_off.png"))); // NOI18N
        jrbTest.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/emails/password_toggle_on.png"))); // NOI18N
        jpiBackground.add(jrbTest, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, -1, -1));

        jbtTestAccounts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/emails/btn_emails_test_off.png"))); // NOI18N
        jbtTestAccounts.setBorder(null);
        jbtTestAccounts.setBorderPainted(false);
        jbtTestAccounts.setContentAreaFilled(false);
        jbtTestAccounts.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtTestAccounts.setFocusPainted(false);
        jbtTestAccounts.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/emails/btn_emails_test_on.png"))); // NOI18N
        jbtTestAccounts.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/emails/btn_emails_test_on.png"))); // NOI18N
        jpiBackground.add(jbtTestAccounts, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 580, -1, -1));

        jtfDirectoryPDFs.setEditable(false);
        jtfDirectoryPDFs.setBackground(new java.awt.Color(61, 101, 182));
        jtfDirectoryPDFs.setFont(new java.awt.Font("Montserrat Alternates SemiBold", 1, 12)); // NOI18N
        jtfDirectoryPDFs.setForeground(new java.awt.Color(255, 255, 255));
        jtfDirectoryPDFs.setBorder(null);
        jpiBackground.add(jtfDirectoryPDFs, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 230, -1));

        jtfCurrentPathFile.setEditable(false);
        jtfCurrentPathFile.setBackground(new java.awt.Color(61, 101, 182));
        jtfCurrentPathFile.setFont(new java.awt.Font("Montserrat Alternates SemiBold", 1, 12)); // NOI18N
        jtfCurrentPathFile.setForeground(new java.awt.Color(255, 255, 255));
        jtfCurrentPathFile.setBorder(null);
        jpiBackground.add(jtfCurrentPathFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 345, 230, -1));

        jbtBrowseFolderFiles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/emails/btn_examine_files_off.png"))); // NOI18N
        jbtBrowseFolderFiles.setBorder(null);
        jbtBrowseFolderFiles.setBorderPainted(false);
        jbtBrowseFolderFiles.setContentAreaFilled(false);
        jbtBrowseFolderFiles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtBrowseFolderFiles.setFocusPainted(false);
        jbtBrowseFolderFiles.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/emails/btn_examine_files_on.png"))); // NOI18N
        jbtBrowseFolderFiles.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/emails/btn_examine_files_on.png"))); // NOI18N
        jpiBackground.add(jbtBrowseFolderFiles, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, -1, -1));

        jtfPathFileExcel.setEditable(false);
        jtfPathFileExcel.setBackground(new java.awt.Color(61, 101, 182));
        jtfPathFileExcel.setFont(new java.awt.Font("Montserrat Alternates SemiBold", 1, 12)); // NOI18N
        jtfPathFileExcel.setForeground(new java.awt.Color(255, 255, 255));
        jtfPathFileExcel.setBorder(null);
        jpiBackground.add(jtfPathFileExcel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 425, 230, -1));

        jbtUploadDataExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/emails/btn_examine_excel_off.png"))); // NOI18N
        jbtUploadDataExcel.setBorder(null);
        jbtUploadDataExcel.setBorderPainted(false);
        jbtUploadDataExcel.setContentAreaFilled(false);
        jbtUploadDataExcel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtUploadDataExcel.setFocusPainted(false);
        jbtUploadDataExcel.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/emails/btn_examine_excel_on.png"))); // NOI18N
        jbtUploadDataExcel.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/emails/btn_examine_excel_on.png"))); // NOI18N
        jpiBackground.add(jbtUploadDataExcel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, -1, -1));

        jcbTemplates.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---- Seleccionar ----" }));
        jcbTemplates.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jcbTemplates.setFocusable(false);
        jpiBackground.add(jcbTemplates, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 540, 390, -1));

        jbtTemplates.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/emails/btn_templates_off.png"))); // NOI18N
        jbtTemplates.setBorder(null);
        jbtTemplates.setBorderPainted(false);
        jbtTemplates.setContentAreaFilled(false);
        jbtTemplates.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtTemplates.setFocusPainted(false);
        jbtTemplates.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/emails/btn_templates_on.png"))); // NOI18N
        jbtTemplates.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/emails/btn_templates_on.png"))); // NOI18N
        jpiBackground.add(jbtTemplates, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 580, -1, -1));

        jbtStart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/emails/btn_start_off.png"))); // NOI18N
        jbtStart.setBorder(null);
        jbtStart.setBorderPainted(false);
        jbtStart.setContentAreaFilled(false);
        jbtStart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtStart.setFocusPainted(false);
        jbtStart.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/emails/btn_start_on.png"))); // NOI18N
        jbtStart.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/emails/btn_start_on.png"))); // NOI18N
        jpiBackground.add(jbtStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, -1, -1));

        jbtContinue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/emails/btn_continue_off.png"))); // NOI18N
        jbtContinue.setBorder(null);
        jbtContinue.setBorderPainted(false);
        jbtContinue.setContentAreaFilled(false);
        jbtContinue.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtContinue.setEnabled(false);
        jbtContinue.setFocusPainted(false);
        jbtContinue.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/emails/btn_continue_on.png"))); // NOI18N
        jbtContinue.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/emails/btn_continue_on.png"))); // NOI18N
        jpiBackground.add(jbtContinue, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 110, -1, -1));

        jbtPause.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/emails/btn_pause_off.png"))); // NOI18N
        jbtPause.setBorder(null);
        jbtPause.setBorderPainted(false);
        jbtPause.setContentAreaFilled(false);
        jbtPause.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtPause.setEnabled(false);
        jbtPause.setFocusPainted(false);
        jbtPause.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/emails/btn_pause_on.png"))); // NOI18N
        jbtPause.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/emails/btn_pause_on.png"))); // NOI18N
        jpiBackground.add(jbtPause, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 110, -1, -1));

        jbtFinish.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/emails/btn_finish_off.png"))); // NOI18N
        jbtFinish.setBorder(null);
        jbtFinish.setBorderPainted(false);
        jbtFinish.setContentAreaFilled(false);
        jbtFinish.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtFinish.setEnabled(false);
        jbtFinish.setFocusPainted(false);
        jbtFinish.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/emails/btn_finish_on.png"))); // NOI18N
        jbtFinish.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/emails/btn_finish_on.png"))); // NOI18N
        jpiBackground.add(jbtFinish, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 110, -1, -1));

        jScrollPane1.getViewport().setOpaque(false);
        jScrollPane1.setBorder(null);
        jScrollPane1.setOpaque(false);

        jtaConsole.setEditable(false);
        jtaConsole.setColumns(20);
        jtaConsole.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jtaConsole.setForeground(new java.awt.Color(255, 255, 255));
        jtaConsole.setLineWrap(true);
        jtaConsole.setRows(5);
        jtaConsole.setBorder(null);
        jtaConsole.setFocusable(false);
        jtaConsole.setOpaque(false);
        jScrollPane1.setViewportView(jtaConsole);

        jpiBackground.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, 800, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpiBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 1347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpiBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.ButtonGroup jbgModalitySend;
    public javax.swing.JButton jbtBrowseFolderFiles;
    public javax.swing.JButton jbtContinue;
    public javax.swing.JButton jbtFinish;
    public javax.swing.JButton jbtPause;
    public javax.swing.JButton jbtStart;
    public javax.swing.JButton jbtTemplates;
    public javax.swing.JButton jbtTestAccounts;
    public javax.swing.JButton jbtUploadDataExcel;
    public javax.swing.JCheckBox jcbShowPassword;
    public javax.swing.JComboBox<String> jcbTemplates;
    public javax.swing.JPasswordField jpPasswordEmail;
    public org.edisoncor.gui.panel.PanelImage jpiBackground;
    public javax.swing.JRadioButton jrbCustomers;
    public javax.swing.JRadioButton jrbTest;
    public javax.swing.JTextArea jtaConsole;
    public javax.swing.JTextField jtfCurrentPathFile;
    public javax.swing.JTextField jtfDirectoryPDFs;
    public javax.swing.JTextField jtfEmail;
    public javax.swing.JTextField jtfPathFileExcel;
    public javax.swing.JTextField jtfSetTimeSeconds;
    // End of variables declaration//GEN-END:variables
}
