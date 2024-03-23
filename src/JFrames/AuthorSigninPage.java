package JFrames;
import biblio.*;
import com.sun.jdi.connect.spi.Connection;
import java.security.MessageDigest;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class AuthorSigninPage extends javax.swing.JFrame {
    UserService userService = new UserService();
    GestionnaireUser gestionnaire = new GestionnaireUser(userService);
    
    public AuthorSigninPage() {
        initComponents();
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

    public boolean insertSignupDetails() {
        boolean isAdded = false;
        String lastName = tfLastName.getText();
        String firstName = tfFirstName.getText();
        String username = tfUsername.getText();
        char[] passwordChars = tfPassword.getPassword();
        String email = tfEmail.getText();

        String hashedPassword = convertToMD5(passwordChars);

        try {
            java.sql.Connection con = DatabaseConnection.getConnection();
            String sql = "INSERT INTO auteurs (nom, prenom, username, password, email) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, lastName);
            pst.setString(2, firstName);
            pst.setString(3, username);
            pst.setString(4, hashedPassword);
            pst.setString(5, email);

            int rowCount = pst.executeUpdate();
            if (rowCount > 0) {
                isAdded = true;
            } else {
                isAdded = false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return isAdded;
    }

    
    public boolean validateSignup(){
        String lastName = tfLastName.getText();
        String firstName = tfFirstName.getText();
        String username = tfUsername.getText();
        char[] passwordChars = tfPassword.getPassword();
        String pwd = new String(passwordChars);
        String email = tfEmail.getText();
        
        if (lastName.equals("")) {
            JOptionPane.showMessageDialog(this, "please enter LastName");
            return false;
        }
        if (firstName.equals("")) {
            JOptionPane.showMessageDialog(this, "please enter LirstName");
            return false;
        }
        
        if (username.equals("")) {
            JOptionPane.showMessageDialog(this, "please enter username");
            return false;
        }
        
        if (pwd.equals("")) {
            JOptionPane.showMessageDialog(this, "please enter password");
            return false;
        }
        
        if (email.equals("") || !email.matches("^.+@.+\\..+$")) {
            JOptionPane.showMessageDialog(this, "please enter valid email");
            return false;
        }
        
        
        return true;
    }
    
    public boolean checkDuplicateUser(){
        String name = tfUsername.getText();
        boolean isExist = false;
        
        try {
            java.sql.Connection con = DatabaseConnection.getConnection();
            PreparedStatement pst = con.prepareStatement("select * from auteurs where username = ?");
            pst.setString(1, name);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                isExist = true;
            }else{
                isExist = false;
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isExist;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LoginBtn = new rojeru_san.complementos.RSButtonHover();
        SigninBtn = new rojeru_san.complementos.RSButtonHover();
        jLabel13 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfUsername = new app.bolivia.swing.JCTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tfEmail = new app.bolivia.swing.JCTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        tfLastName = new app.bolivia.swing.JCTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        tfFirstName = new app.bolivia.swing.JCTextField();
        tfPassword = new javax.swing.JPasswordField();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        show = new javax.swing.JLabel();
        disable = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(238, 238, 238));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 550));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon4.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 560, 600));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 600));

        jPanel2.setBackground(new java.awt.Color(34, 40, 49));
        jPanel2.setForeground(new java.awt.Color(0, 173, 181));
        jPanel2.setPreferredSize(new java.awt.Dimension(380, 550));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 173, 181));
        jLabel2.setText("Create a New Account");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 173, 181));
        jLabel3.setText("Signup Page");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        LoginBtn.setBackground(new java.awt.Color(30, 30, 30));
        LoginBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        LoginBtn.setText("Login");
        LoginBtn.setColorHover(new java.awt.Color(57, 62, 70));
        LoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBtnActionPerformed(evt);
            }
        });
        jPanel2.add(LoginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 530, 140, 50));

        SigninBtn.setBackground(new java.awt.Color(30, 30, 30));
        SigninBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        SigninBtn.setText("SignUp");
        SigninBtn.setColorHover(new java.awt.Color(57, 62, 70));
        SigninBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SigninBtnActionPerformed(evt);
            }
        });
        jPanel2.add(SigninBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 530, 140, 50));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("X");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 40, 29));

        jLabel5.setBackground(new java.awt.Color(0, 173, 181));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 173, 181));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Account_50px.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        tfUsername.setBackground(new java.awt.Color(34, 40, 49));
        tfUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        tfUsername.setForeground(new java.awt.Color(255, 255, 255));
        tfUsername.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfUsername.setPhColor(new java.awt.Color(255, 255, 255));
        tfUsername.setPlaceholder("Enter Username...");
        tfUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfUsernameFocusLost(evt);
            }
        });
        jPanel2.add(tfUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 270, -1));

        jLabel6.setBackground(new java.awt.Color(0, 173, 181));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 173, 181));
        jLabel6.setText("Username");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 270, -1));

        jLabel14.setBackground(new java.awt.Color(238, 238, 238));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("-");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, -20, 20, -1));

        jLabel9.setBackground(new java.awt.Color(0, 173, 181));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 173, 181));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Secured_Letter_50px.png"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, -1, -1));

        jLabel10.setBackground(new java.awt.Color(0, 173, 181));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 173, 181));
        jLabel10.setText("Email");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, 270, -1));

        tfEmail.setBackground(new java.awt.Color(34, 40, 49));
        tfEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        tfEmail.setForeground(new java.awt.Color(255, 255, 255));
        tfEmail.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfEmail.setPhColor(new java.awt.Color(255, 255, 255));
        tfEmail.setPlaceholder("Enter Email...");
        jPanel2.add(tfEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 470, 270, -1));

        jLabel11.setBackground(new java.awt.Color(0, 173, 181));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 173, 181));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/id-card.png"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 70, 50));

        jLabel17.setBackground(new java.awt.Color(0, 173, 181));
        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 173, 181));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/name.png"))); // NOI18N
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 80, 50));

        tfLastName.setBackground(new java.awt.Color(34, 40, 49));
        tfLastName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        tfLastName.setForeground(new java.awt.Color(255, 255, 255));
        tfLastName.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfLastName.setPhColor(new java.awt.Color(255, 255, 255));
        tfLastName.setPlaceholder("Enter Last Name...");
        jPanel2.add(tfLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 270, -1));

        jLabel12.setBackground(new java.awt.Color(0, 173, 181));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 173, 181));
        jLabel12.setText("Last Name");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 270, -1));

        jLabel16.setBackground(new java.awt.Color(0, 173, 181));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 173, 181));
        jLabel16.setText("First Name");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 270, -1));

        tfFirstName.setBackground(new java.awt.Color(34, 40, 49));
        tfFirstName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        tfFirstName.setForeground(new java.awt.Color(255, 255, 255));
        tfFirstName.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfFirstName.setPhColor(new java.awt.Color(255, 255, 255));
        tfFirstName.setPlaceholder("Enter First Name...");
        jPanel2.add(tfFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 270, -1));

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
        jPanel2.add(tfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 270, 30));

        jLabel15.setBackground(new java.awt.Color(0, 173, 181));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 173, 181));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/password.png"))); // NOI18N
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 80, 70));

        jLabel18.setBackground(new java.awt.Color(0, 173, 181));
        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 173, 181));
        jLabel18.setText("Password Crypted");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 130, 40));

        show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_eye_20px_1.png"))); // NOI18N
        show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showMouseClicked(evt);
            }
        });
        jPanel2.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, -1, -1));

        disable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_invisible_20px_1.png"))); // NOI18N
        disable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                disableMouseClicked(evt);
            }
        });
        jPanel2.add(disable, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 470, 600));

        setSize(new java.awt.Dimension(1000, 601));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBtnActionPerformed
        // TODO add your handling code here:
        AuthorLoginPage authorloginpage = new AuthorLoginPage();
        authorloginpage.setVisible(true);
        dispose();
    }//GEN-LAST:event_LoginBtnActionPerformed

    private void SigninBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SigninBtnActionPerformed
        // TODO add your handling code here:
        if (validateSignup() == true) {
            if (checkDuplicateUser() == false) {
                insertSignupDetails();
                JOptionPane.showMessageDialog(this, "Signed in Successfully");
            }else{
                JOptionPane.showMessageDialog(this, "username already exist", "Error", JOptionPane.ERROR_MESSAGE);
            }
        };
    }//GEN-LAST:event_SigninBtnActionPerformed

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void tfUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfUsernameFocusLost
        // TODO add your handling code here:
        if (checkDuplicateUser() == true) {
            JOptionPane.showMessageDialog(this, "username already exist", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_tfUsernameFocusLost

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
        this.setState(MemberSigninPage.ICONIFIED);
    }//GEN-LAST:event_jLabel14MouseClicked

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

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {                                     
        System.exit(0);
    }   

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
            java.util.logging.Logger.getLogger(AuthorSigninPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AuthorSigninPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AuthorSigninPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AuthorSigninPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AuthorSigninPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.complementos.RSButtonHover LoginBtn;
    private rojeru_san.complementos.RSButtonHover SigninBtn;
    private javax.swing.JLabel disable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel show;
    private app.bolivia.swing.JCTextField tfEmail;
    private app.bolivia.swing.JCTextField tfFirstName;
    private app.bolivia.swing.JCTextField tfLastName;
    private javax.swing.JPasswordField tfPassword;
    private app.bolivia.swing.JCTextField tfUsername;
    // End of variables declaration//GEN-END:variables
}
