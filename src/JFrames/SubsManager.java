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

public class SubsManager extends javax.swing.JFrame {

    public SubsManager() {
        initComponents();
        setSubsDetailsToTable();
    }

    String Email, Username, Contact, password;
    int SubID;
    DefaultTableModel model;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Sub_Table = new rojeru_san.complementos.RSTableMetro();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        UpdateBtn = new rojeru_san.complementos.RSButtonHover();
        DeleteBtn = new rojeru_san.complementos.RSButtonHover();
        AddBtn = new rojeru_san.complementos.RSButtonHover();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfID = new app.bolivia.swing.JCTextField();
        jLabel8 = new javax.swing.JLabel();
        tfUserName = new app.bolivia.swing.JCTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tfEmail = new app.bolivia.swing.JCTextField();
        jLabel12 = new javax.swing.JLabel();
        tfNumber = new app.bolivia.swing.JCTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        disable = new javax.swing.JLabel();
        tfPassword = new javax.swing.JPasswordField();
        show = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new java.awt.BorderLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, -1));

        jPanel3.setBackground(new java.awt.Color(238, 238, 238));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(34, 40, 49));
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/team.png"))); // NOI18N
        jLabel21.setText("   Subscribers Table OverView");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 810, -1));

        Sub_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sub ID", "UserName", "Crypted Password", "Email", "Contact"
            }
        ));
        Sub_Table.setColorBackgoundHead(new java.awt.Color(57, 62, 70));
        Sub_Table.setColorFilasForeground1(new java.awt.Color(57, 62, 70));
        Sub_Table.setColorFilasForeground2(new java.awt.Color(57, 62, 70));
        Sub_Table.setColorSelBackgound(new java.awt.Color(57, 62, 70));
        Sub_Table.setRowHeight(40);
        Sub_Table.setSelectionBackground(new java.awt.Color(238, 238, 238));
        Sub_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Sub_TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Sub_Table);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 930, 400));

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
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, -1, 20));

        UpdateBtn.setBackground(new java.awt.Color(57, 62, 70));
        UpdateBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        UpdateBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/update.png"))); // NOI18N
        UpdateBtn.setText("Update Book");
        UpdateBtn.setColorHover(new java.awt.Color(255, 211, 105));
        UpdateBtn.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });
        jPanel3.add(UpdateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 690, 260, 70));

        DeleteBtn.setBackground(new java.awt.Color(57, 62, 70));
        DeleteBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        DeleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/user.png"))); // NOI18N
        DeleteBtn.setText("Delete Member");
        DeleteBtn.setColorHover(new java.awt.Color(255, 211, 105));
        DeleteBtn.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });
        jPanel3.add(DeleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 690, 280, 70));

        AddBtn.setBackground(new java.awt.Color(57, 62, 70));
        AddBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        AddBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/library.png"))); // NOI18N
        AddBtn.setText("Add Member");
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
        jPanel3.add(AddBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 690, 250, 70));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 1020, 830));

        jPanel2.setBackground(new java.awt.Color(34, 40, 49));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(0, 173, 181));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 173, 181));
        jLabel6.setText("Subsciber ID");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 300, 40));

        jLabel5.setBackground(new java.awt.Color(0, 173, 181));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 173, 181));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/card.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 80, 70));

        tfID.setBackground(new java.awt.Color(34, 40, 49));
        tfID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        tfID.setForeground(new java.awt.Color(255, 255, 255));
        tfID.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfID.setPhColor(new java.awt.Color(255, 255, 255));
        tfID.setPlaceholder("Enter Subscriber ID...");
        tfID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfIDFocusLost(evt);
            }
        });
        jPanel2.add(tfID, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 290, 50));

        jLabel8.setBackground(new java.awt.Color(0, 173, 181));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 173, 181));
        jLabel8.setText("UserName");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 300, 40));

        tfUserName.setBackground(new java.awt.Color(34, 40, 49));
        tfUserName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        tfUserName.setForeground(new java.awt.Color(255, 255, 255));
        tfUserName.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfUserName.setPhColor(new java.awt.Color(255, 255, 255));
        tfUserName.setPlaceholder("Enter UserName...");
        jPanel2.add(tfUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 290, 50));

        jLabel7.setBackground(new java.awt.Color(0, 173, 181));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 173, 181));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/id-card.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 80, 70));

        jLabel9.setBackground(new java.awt.Color(0, 173, 181));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 173, 181));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/adress.png"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, 80, 70));

        jLabel10.setBackground(new java.awt.Color(0, 173, 181));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 173, 181));
        jLabel10.setText("Email Adresse");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 490, 300, 40));

        tfEmail.setBackground(new java.awt.Color(34, 40, 49));
        tfEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        tfEmail.setForeground(new java.awt.Color(255, 255, 255));
        tfEmail.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfEmail.setPhColor(new java.awt.Color(255, 255, 255));
        tfEmail.setPlaceholder("Enter Email Adresse...");
        jPanel2.add(tfEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 520, 290, 50));

        jLabel12.setBackground(new java.awt.Color(0, 173, 181));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 173, 181));
        jLabel12.setText("Contact");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 590, 300, 40));

        tfNumber.setBackground(new java.awt.Color(34, 40, 49));
        tfNumber.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        tfNumber.setForeground(new java.awt.Color(255, 255, 255));
        tfNumber.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfNumber.setPhColor(new java.awt.Color(255, 255, 255));
        tfNumber.setPlaceholder("Enter  Phone Number...");
        jPanel2.add(tfNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 620, 290, 50));

        jLabel11.setBackground(new java.awt.Color(0, 173, 181));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 173, 181));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/contact-information.png"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 610, 80, 70));

        jPanel4.setBackground(new java.awt.Color(57, 62, 70));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 211, 105));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/development.png"))); // NOI18N
        jLabel3.setText("  Manage Subscribers");

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
                .addContainerGap()
                .addComponent(jLabel19)
                .addContainerGap(484, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel3))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addGap(3, 3, 3)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 160));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/clear-2.png"))); // NOI18N
        jLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 710, 80, 80));

        jLabel13.setBackground(new java.awt.Color(0, 173, 181));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 173, 181));
        jLabel13.setText("Password Crypted");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 130, 40));

        jLabel14.setBackground(new java.awt.Color(0, 173, 181));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 173, 181));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/password.png"))); // NOI18N
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 80, 70));

        disable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_invisible_20px_1.png"))); // NOI18N
        disable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                disableMouseClicked(evt);
            }
        });
        jPanel2.add(disable, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, -1, -1));

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
        jPanel2.add(tfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 290, 30));

        show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_eye_20px_1.png"))); // NOI18N
        show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showMouseClicked(evt);
            }
        });
        jPanel2.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/refresh.png"))); // NOI18N
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 720, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 830));

        setSize(new java.awt.Dimension(1550, 825));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    //to set the book details into the table
    public void setSubsDetailsToTable(){
        try {
            java.sql.Connection con = DatabaseConnection.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from abonnés");
            
            while(rs.next()){
                int SubID = rs.getInt("idabonné");
                String Username = rs.getString("username");
                String Password = rs.getString("password");
                String Email = rs.getString("email");
                String Contact = rs.getString("contact");
                
                
                Object[] obj = {SubID,Username,Password,Email,Contact};
                model =(DefaultTableModel) Sub_Table.getModel();
                model.addRow(obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 
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

    public boolean addSubscriber() {
        boolean isAdded = false;
        int SubID = Integer.parseInt(tfID.getText());
        String Username = tfUserName.getText();
        String Email = tfEmail.getText();
        String Contact = tfNumber.getText();
        char[] passwordChars = tfPassword.getPassword();
        String pwd = new String(passwordChars);

        String hashedPassword = convertToMD5(passwordChars);

        try {
            java.sql.Connection con = DatabaseConnection.getConnection();
            String sql = "insert into abonnés values(?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, SubID);
            pst.setString(2, Username);
            pst.setString(3, hashedPassword); 
            pst.setString(4, Email);
            pst.setString(5, Contact);

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

    //Clears Table
    public void clearTable(){
        DefaultTableModel model = (DefaultTableModel) Sub_Table.getModel();
        model.setRowCount(0);
    }
    
    //to update book details
    public boolean updateSubscriber(){
        boolean isUpdated = false;
        int SubID = Integer.parseInt(tfID.getText());
        String Username = tfUserName.getText();
        String Email = tfEmail.getText();
        String Contact = tfNumber.getText();
        
        try {
            java.sql.Connection con = DatabaseConnection.getConnection();
            String sql = "update abonnés set username = ?,email = ?, contact = ? where idabonné = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, Username);
            pst.setString(2, Email);
            pst.setString(3, Contact);
            pst.setInt(4, SubID);

            int rowCount = pst.executeUpdate();
            if (rowCount > 0) {
                isUpdated = true;
            }else{
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

        this.setState(AdminLoginPage.ICONIFIED);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        // TODO add your handSub_Tablehere:
        AdminHomePage homepage = new AdminHomePage();
        homepage.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel19MouseClicked

    private void Sub_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sub_TableMouseClicked
        // TODO add your handling code here:
        int rowNo = Sub_Table.getSelectedRow();
        TableModel model = Sub_Table.getModel();

        String pwd = model.getValueAt(rowNo, 2).toString();
        char[] password = pwd.toCharArray(); 

        tfID.setText(model.getValueAt(rowNo, 0).toString());
        tfUserName.setText(model.getValueAt(rowNo, 1).toString());
        tfPassword.setEchoChar('*'); 
        tfPassword.setText(pwd); 
        tfEmail.setText(model.getValueAt(rowNo, 3).toString());
        tfNumber.setText(model.getValueAt(rowNo, 4).toString());
    }//GEN-LAST:event_Sub_TableMouseClicked

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
        // TODO add your handling code here:
        if (updateSubscriber() == true) {
            JOptionPane.showMessageDialog(this, "Subscriber Updated");
            clearTable();
            setSubsDetailsToTable();
        }else{
            JOptionPane.showMessageDialog(this, "Subscriber Updation Failed", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_UpdateBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        // TODO add your handling code here:
        DeleteFormSub deleteformsub = new DeleteFormSub();
        deleteformsub.setVisible(true);
        clearTable();
        setSubsDetailsToTable();
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        // TODO add your handling code here:
        tfID.setText("");
        tfUserName.setText("");
        tfEmail.setText("");
        tfNumber.setText("");
        tfPassword.setText("");
    }//GEN-LAST:event_jLabel20MouseClicked

    private void tfPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPasswordActionPerformed
    
     
    private void disableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disableMouseClicked
        // TODO add your handling code here:
        tfPassword.setEchoChar((char)0);
        disable.setVisible(false);
        disable.setEnabled(false);
        show.setEnabled(true);
        show.setEnabled(true);
    }//GEN-LAST:event_disableMouseClicked

    private void showMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showMouseClicked
        // TODO add your handling code here:
        tfPassword.setEchoChar((char)8226);
        disable.setVisible(true);
        disable.setEnabled(true);
        show.setEnabled(false);
        show.setEnabled(false);
    }//GEN-LAST:event_showMouseClicked

    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_AddBtnMouseClicked

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        // TODO add your handling code here:
        if (addSubscriber() == true) {
            JOptionPane.showMessageDialog(this, "Subscriber Added");
            clearTable();
            setSubsDetailsToTable();
        }else{
            JOptionPane.showMessageDialog(this, "Subscriber Addition Failed", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_AddBtnActionPerformed

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
        clearTable();
        setSubsDetailsToTable();
    }//GEN-LAST:event_jLabel15MouseClicked

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
            java.util.logging.Logger.getLogger(SubsManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SubsManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SubsManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SubsManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SubsManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.complementos.RSButtonHover AddBtn;
    private rojeru_san.complementos.RSButtonHover DeleteBtn;
    private rojeru_san.complementos.RSTableMetro Sub_Table;
    private rojeru_san.complementos.RSButtonHover UpdateBtn;
    private javax.swing.JLabel disable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
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
    private app.bolivia.swing.JCTextField tfID;
    private app.bolivia.swing.JCTextField tfNumber;
    private javax.swing.JPasswordField tfPassword;
    private app.bolivia.swing.JCTextField tfUserName;
    // End of variables declaration//GEN-END:variables
}
