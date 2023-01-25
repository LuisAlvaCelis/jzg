package view.emails;

import javax.swing.UIManager;

public class TestAccountView extends javax.swing.JFrame {

    public TestAccountView() throws Exception{
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpiBackground = new org.edisoncor.gui.panel.PanelImage();
        jLabel1 = new javax.swing.JLabel();
        jpAccount = new javax.swing.JPanel();
        jtfEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jbtUpdateTestAccount = new javax.swing.JButton();
        jbtSaveTestAccount = new javax.swing.JButton();
        jbtCancelUpdate = new javax.swing.JButton();
        jpListAccounts = new javax.swing.JPanel();
        jtfSearch = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtListTestAccounts = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/images/emails/enviar-correo.png")).getImage());
        setResizable(false);

        jpiBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/emails/bg_test.png"))); // NOI18N
        jpiBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Montserrat Alternates ExtraBold", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Correos de Prueba");
        jpiBackground.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jpAccount.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Correo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Montserrat Alternates Medium", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jpAccount.setOpaque(false);
        jpAccount.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtfEmail.setFont(new java.awt.Font("Montserrat Alternates SemiBold", 0, 12)); // NOI18N
        jpAccount.add(jtfEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 280, -1));

        jLabel3.setFont(new java.awt.Font("Montserrat Alternates SemiBold", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Correo:");
        jpAccount.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jbtUpdateTestAccount.setText("Actualizar");
        jbtUpdateTestAccount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtUpdateTestAccount.setEnabled(false);
        jbtUpdateTestAccount.setFocusPainted(false);
        jpAccount.add(jbtUpdateTestAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 100, -1));

        jbtSaveTestAccount.setText("Guardar");
        jbtSaveTestAccount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtSaveTestAccount.setFocusPainted(false);
        jpAccount.add(jbtSaveTestAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 100, -1));

        jbtCancelUpdate.setText("Cancelar");
        jbtCancelUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtCancelUpdate.setEnabled(false);
        jbtCancelUpdate.setFocusPainted(false);
        jpAccount.add(jbtCancelUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, 100, -1));

        jpiBackground.add(jpAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 720, 70));

        jpListAccounts.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de correos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Montserrat Alternates Medium", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jpListAccounts.setOpaque(false);
        jpListAccounts.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtfSearch.setFont(new java.awt.Font("Montserrat Alternates SemiBold", 0, 12)); // NOI18N
        jpListAccounts.add(jtfSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 240, -1));

        jLabel4.setFont(new java.awt.Font("Montserrat Alternates SemiBold", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Buscar");
        jpListAccounts.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jtListTestAccounts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Correo", "Fecha de Registro", "Fecha de Actualización", "Modificar", "Eliminar"
            }
        ));
        jtListTestAccounts.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtListTestAccounts);

        jpListAccounts.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 680, 190));

        jpiBackground.add(jpListAccounts, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 720, 280));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpiBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 757, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpiBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton jbtCancelUpdate;
    public javax.swing.JButton jbtSaveTestAccount;
    public javax.swing.JButton jbtUpdateTestAccount;
    private javax.swing.JPanel jpAccount;
    private javax.swing.JPanel jpListAccounts;
    private org.edisoncor.gui.panel.PanelImage jpiBackground;
    public javax.swing.JTable jtListTestAccounts;
    public javax.swing.JTextField jtfEmail;
    public javax.swing.JTextField jtfSearch;
    // End of variables declaration//GEN-END:variables
}
