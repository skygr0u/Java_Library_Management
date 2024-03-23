package JFrames;

import biblio.DatabaseConnection;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.security.MessageDigest;

public class AuthorManager extends javax.swing.JFrame {

    public AuthorManager() {
        initComponents();
        setAuthorDetailsToTable();
    }

    String LastName, FirstName, UserName, Email, pwd;
    int AuthorID;
    DefaultTableModel model;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Author_Table = new rojeru_san.complementos.RSTableMetro();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        UpdateBtn = new rojeru_san.complementos.RSButtonHover();
        AddBtn = new rojeru_san.complementos.RSButtonHover();
        DeleteBtn = new rojeru_san.complementos.RSButtonHover();
        jLabel22 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfID = new app.bolivia.swing.JCTextField();
        jLabel8 = new javax.swing.JLabel();
        tfLastName = new app.bolivia.swing.JCTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tfFirstName = new app.bolivia.swing.JCTextField();
        jLabel12 = new javax.swing.JLabel();
        tfUsername = new app.bolivia.swing.JCTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tfEmail = new app.bolivia.swing.JCTextField();
        jLabel16 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        tfPassword = new javax.swing.JPasswordField();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        show = new javax.swing.JLabel();
        disable = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new java.awt.BorderLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, -1));

        jPanel3.setBackground(new java.awt.Color(238, 238, 238));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(34, 40, 49));
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/research.png"))); // NOI18N
        jLabel21.setText("   Authors Table OverView");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 730, -1));

        Author_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Author ID", "Last Name", "First Name", "UserName", "Password", "Email"
            }
        ));
        Author_Table.setColorBackgoundHead(new java.awt.Color(57, 62, 70));
        Author_Table.setColorFilasForeground1(new java.awt.Color(57, 62, 70));
        Author_Table.setColorFilasForeground2(new java.awt.Color(57, 62, 70));
        Author_Table.setColorSelBackgound(new java.awt.Color(57, 62, 70));
        Author_Table.setRowHeight(40);
        Author_Table.setSelectionBackground(new java.awt.Color(238, 238, 238));
        Author_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Author_TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Author_Table);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 940, 400));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("X");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, -10, 40, 60));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("-");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 0, -1, 50));

        jPanel6.setBackground(new java.awt.Color(34, 40, 49));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 320, 10));

        jPanel7.setBackground(new java.awt.Color(34, 40, 49));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, -1, 30));

        UpdateBtn.setBackground(new java.awt.Color(57, 62, 70));
        UpdateBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        UpdateBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/updated.png"))); // NOI18N
        UpdateBtn.setText("Update Author");
        UpdateBtn.setColorHover(new java.awt.Color(255, 211, 105));
        UpdateBtn.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });
        jPanel3.add(UpdateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 690, 270, 70));

        AddBtn.setBackground(new java.awt.Color(57, 62, 70));
        AddBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        AddBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/writer_add.png"))); // NOI18N
        AddBtn.setText("Add Author");
        AddBtn.setColorHover(new java.awt.Color(255, 211, 105));
        AddBtn.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtnMouseClicked(evt);
            }
        });
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });
        jPanel3.add(AddBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 690, 240, 70));

        DeleteBtn.setBackground(new java.awt.Color(57, 62, 70));
        DeleteBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        DeleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/writer.png"))); // NOI18N
        DeleteBtn.setText("Delete Author");
        DeleteBtn.setColorHover(new java.awt.Color(255, 211, 105));
        DeleteBtn.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });
        jPanel3.add(DeleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 690, 260, 70));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/refresh.png"))); // NOI18N
        jLabel22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 1020, 830));

        jPanel2.setBackground(new java.awt.Color(34, 40, 49));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(0, 173, 181));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 173, 181));
        jLabel6.setText("Author ID");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 300, -1));

        jLabel5.setBackground(new java.awt.Color(0, 173, 181));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 173, 181));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/user (1).png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 70, -1));

        tfID.setBackground(new java.awt.Color(34, 40, 49));
        tfID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        tfID.setForeground(new java.awt.Color(255, 255, 255));
        tfID.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfID.setPhColor(new java.awt.Color(255, 255, 255));
        tfID.setPlaceholder("Enter Author ID...");
        tfID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfIDFocusLost(evt);
            }
        });
        jPanel2.add(tfID, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 290, -1));

        jLabel8.setBackground(new java.awt.Color(0, 173, 181));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 173, 181));
        jLabel8.setText("Last Name");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 300, -1));

        tfLastName.setBackground(new java.awt.Color(34, 40, 49));
        tfLastName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        tfLastName.setForeground(new java.awt.Color(255, 255, 255));
        tfLastName.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfLastName.setPhColor(new java.awt.Color(255, 255, 255));
        tfLastName.setPlaceholder("Enter Author Last Name...");
        jPanel2.add(tfLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 290, -1));

        jLabel7.setBackground(new java.awt.Color(0, 173, 181));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 173, 181));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/name.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 80, 50));

        jLabel9.setBackground(new java.awt.Color(0, 173, 181));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 173, 181));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pass.png"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 70, -1));

        jLabel10.setBackground(new java.awt.Color(0, 173, 181));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 173, 181));
        jLabel10.setText("First Name");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 300, -1));

        tfFirstName.setBackground(new java.awt.Color(34, 40, 49));
        tfFirstName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        tfFirstName.setForeground(new java.awt.Color(255, 255, 255));
        tfFirstName.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfFirstName.setPhColor(new java.awt.Color(255, 255, 255));
        tfFirstName.setPlaceholder("Enter Author First Name...");
        jPanel2.add(tfFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 290, -1));

        jLabel12.setBackground(new java.awt.Color(0, 173, 181));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 173, 181));
        jLabel12.setText("UserName");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 300, -1));

        tfUsername.setBackground(new java.awt.Color(34, 40, 49));
        tfUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        tfUsername.setForeground(new java.awt.Color(255, 255, 255));
        tfUsername.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfUsername.setPhColor(new java.awt.Color(255, 255, 255));
        tfUsername.setPlaceholder("Enter  UserName...");
        jPanel2.add(tfUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 490, 290, -1));

        jLabel11.setBackground(new java.awt.Color(0, 173, 181));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 173, 181));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/id-card.png"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, 70, 50));

        jLabel15.setBackground(new java.awt.Color(0, 173, 181));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 173, 181));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/adress.png"))); // NOI18N
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 650, 80, 50));

        tfEmail.setBackground(new java.awt.Color(34, 40, 49));
        tfEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        tfEmail.setForeground(new java.awt.Color(255, 255, 255));
        tfEmail.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfEmail.setPhColor(new java.awt.Color(255, 255, 255));
        tfEmail.setPlaceholder("Enter  Email Adresse...");
        jPanel2.add(tfEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 660, 290, -1));

        jLabel16.setBackground(new java.awt.Color(0, 173, 181));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 173, 181));
        jLabel16.setText("Email");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 630, 300, -1));

        jPanel4.setBackground(new java.awt.Color(57, 62, 70));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 211, 105));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Author.png"))); // NOI18N
        jLabel3.setText("  Manage Authors");

        jPanel5.setBackground(new java.awt.Color(255, 211, 105));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.png"))); // NOI18N
        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel19)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel3))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel19)))
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 150));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/clear.png"))); // NOI18N
        jLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 740, -1, -1));

        tfPassword.setBackground(new java.awt.Color(34, 40, 49));
        tfPassword.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfPassword.setForeground(new java.awt.Color(255, 255, 255));
        tfPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        tfPassword.setCaretColor(new java.awt.Color(255, 255, 255));
        tfPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPasswordActionPerformed(evt);
            }
        });
        jPanel2.add(tfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 580, 290, 30));

        jLabel14.setBackground(new java.awt.Color(0, 173, 181));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 173, 181));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/password.png"))); // NOI18N
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 550, 70, 70));

        jLabel13.setBackground(new java.awt.Color(0, 173, 181));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 173, 181));
        jLabel13.setText("Password Crypted");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 540, 130, 40));

        show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_eye_20px_1.png"))); // NOI18N
        show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showMouseClicked(evt);
            }
        });
        jPanel2.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 550, -1, -1));

        disable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_invisible_20px_1.png"))); // NOI18N
        disable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                disableMouseClicked(evt);
            }
        });
        jPanel2.add(disable, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 550, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 830));

        setSize(new java.awt.Dimension(1550, 825));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    //to set the book details into the table
    public void setAuthorDetailsToTable(){
        
        try {
            java.sql.Connection con = DatabaseConnection.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from auteurs");
            
            while(rs.next()){
                String AuthorID = rs.getString("idauteur");
                String LastName = rs.getString("nom");
                String FirstName = rs.getString("prenom");
                String UserName = rs.getString("username");
                String Email = rs.getString("password");
                String pwd = rs.getString("email");

                Object[] obj = {AuthorID,LastName,FirstName,UserName,Email,pwd};
                model =(DefaultTableModel) Author_Table.getModel();
                model.addRow(obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    //Clears Table
    public void clearTable(){
        DefaultTableModel model = (DefaultTableModel) Author_Table.getModel();
        model.setRowCount(0);
    }
    
    public String convertToMD5(char[] passwordChars) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(new String(passwordChars).getBytes());
            byte[] digest = md.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(String.format("%02x", b & 0xff));
            }
            return sb.toString();
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public boolean addAuthor() {
        boolean isAdded = false;
        int AuthorID = Integer.parseInt(tfID.getText());
        String LastName = tfLastName.getText();
        String FirstName = tfFirstName.getText();
        String UserName = tfUsername.getText();
        char[] passwordChars = tfPassword.getPassword();
        String Email = tfEmail.getText();

        String hashedPassword = convertToMD5(passwordChars);

        try {
            java.sql.Connection con = DatabaseConnection.getConnection();
            String sql = "insert into auteurs values(?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, AuthorID);
            pst.setString(2, LastName);
            pst.setString(3, FirstName);
            pst.setString(4, UserName);
            pst.setString(5, hashedPassword);
            pst.setString(6, Email);

            int rowCount = pst.executeUpdate();
            if (rowCount > 0) {
                isAdded = true;
            } else {
                isAdded = false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isAdded;
    }

    
    /*public String getAuthorName(int bookId) {
        String authorName = null;
        
        java.sql.Connection con = DatabaseConnection.getConnection();
        try{
            String query = "SELECT auteurs.nom FROM livres JOIN auteurs ON livres.idAuteur = auteurs.idAuteur WHERE livres.idLivre = ?";
            try (PreparedStatement statement = con.prepareStatement(query)) {
                statement.setInt(1, bookId);
                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        authorName = resultSet.getString("nom");
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return authorName;
    }*/

    public int getAuthorId(String authorName) {
        int authorId = -1;
        
        java.sql.Connection con = DatabaseConnection.getConnection();
        try {
            String query = "SELECT idAuteur FROM auteurs WHERE nom = ?";
            try (PreparedStatement statement = con.prepareStatement(query)) {
                statement.setString(1, authorName);
                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        authorId = resultSet.getInt("idAuteur");
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return authorId;
    }
    
    //to update book details
    public boolean updateAuthor() {
        boolean isUpdated = false;
        int AuthorID = Integer.parseInt(tfID.getText());
        String LastName = tfLastName.getText();
        String FirstName = tfFirstName.getText();
        String UserName = tfUsername.getText();
        char[] passwordChars = tfPassword.getPassword();
        String Email = tfEmail.getText();

        String hashedPassword = convertToMD5(passwordChars);

        try {
            java.sql.Connection con = DatabaseConnection.getConnection();
            String sql = "update auteurs set nom = ?,prenom = ?, username = ?, password = ?, email = ? where idauteur = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, LastName);
            pst.setString(2, FirstName);
            pst.setString(3, UserName);
            pst.setString(4, hashedPassword);
            pst.setString(5, Email);
            pst.setInt(6, AuthorID);

            int rowCount = pst.executeUpdate();
            if (rowCount > 0) {
                isUpdated = true;
            } else {
                isUpdated = false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isUpdated;
    }
    
    private void tfIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfIDFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_tfIDFocusLost

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        this.setState(AdminLoginPage.ICONIFIED);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        // TODO add your handling code here:
        AdminHomePage homepage = new AdminHomePage();
        homepage.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel19MouseClicked

    private void Author_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Author_TableMouseClicked
        // TODO add your handling code here:
        int rowNo = Author_Table.getSelectedRow();
        TableModel model = Author_Table.getModel();
        
        String pwd = model.getValueAt(rowNo, 4).toString();
        char[] password = pwd.toCharArray(); 
        
        tfID.setText(model.getValueAt(rowNo, 0).toString());
        tfLastName.setText(model.getValueAt(rowNo, 1).toString());
        tfFirstName.setText(model.getValueAt(rowNo, 2).toString());
        tfUsername.setText(model.getValueAt(rowNo, 3).toString());
        tfPassword.setEchoChar('*'); 
        tfPassword.setText(pwd); 
        tfEmail.setText(model.getValueAt(rowNo, 5).toString());
    }//GEN-LAST:event_Author_TableMouseClicked

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
        // TODO add your handling code here:
        if (updateAuthor() == true) {
            JOptionPane.showMessageDialog(this, "Author Updated");
            clearTable();
            setAuthorDetailsToTable();
        }else{
            JOptionPane.showMessageDialog(this, "Author Updation Failed", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_UpdateBtnActionPerformed

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        // TODO add your handling code here:
        if (addAuthor()== true) {
            JOptionPane.showMessageDialog(this, "Author Added");
            clearTable();
            setAuthorDetailsToTable();
        }else{
            JOptionPane.showMessageDialog(this, "Author Addition Failed", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_AddBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        // TODO add your handling code here:
        DeleteFormAuthor deleteformauthor = new DeleteFormAuthor();
        deleteformauthor.setVisible(true);
        clearTable();
        setAuthorDetailsToTable();
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_AddBtnMouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        // TODO add your handling code here:
        tfID.setText("");
        tfLastName.setText("");
        tfFirstName.setText("");
        tfUsername.setText("");
        tfPassword.setText("");
        tfEmail.setText("");
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        // TODO add your handling code here:
        clearTable();
        setAuthorDetailsToTable();
    }//GEN-LAST:event_jLabel22MouseClicked

    private void tfPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPasswordActionPerformed

    private void showMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showMouseClicked
        // TODO add your handling code here:
        tfPassword.setEchoChar((char)8226);
        disable.setVisible(true);
        disable.setEnabled(true);
        show.setEnabled(false);
        show.setEnabled(false);
    }//GEN-LAST:event_showMouseClicked

    private void disableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disableMouseClicked
        // TODO add your handling code here:
        tfPassword.setEchoChar((char)0);
        disable.setVisible(false);
        disable.setEnabled(false);
        show.setEnabled(true);
        show.setEnabled(true);
    }//GEN-LAST:event_disableMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AuthorManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AuthorManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AuthorManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AuthorManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AuthorManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.complementos.RSButtonHover AddBtn;
    private rojeru_san.complementos.RSTableMetro Author_Table;
    private rojeru_san.complementos.RSButtonHover DeleteBtn;
    private rojeru_san.complementos.RSButtonHover UpdateBtn;
    private javax.swing.JLabel disable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel show;
    private app.bolivia.swing.JCTextField tfEmail;
    private app.bolivia.swing.JCTextField tfFirstName;
    private app.bolivia.swing.JCTextField tfID;
    private app.bolivia.swing.JCTextField tfLastName;
    private javax.swing.JPasswordField tfPassword;
    private app.bolivia.swing.JCTextField tfUsername;
    // End of variables declaration//GEN-END:variables
}
