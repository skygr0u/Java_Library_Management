package ResetPwd;

import JFrames.*;
import biblio.DatabaseConnection;
import biblio.DatabaseConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;
import javax.swing.JOptionPane;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
import java.util.Random;

public class MemberCodeVerification extends javax.swing.JFrame {

    private static final String EMAIL_USERNAME = "librarybookclub2@gmail.com"; // Replace with your Gmail email address
    private static final String EMAIL_PASSWORD = "mfqikvgvoaqcltxk"; // Replace with your application-specific password
    private static final String SMTP_HOST = "smtp.gmail.com"; // Gmail SMTP host
    private static final int SMTP_PORT = 465; // Gmail SMTP port for SSL
    
    private String Email;
    private int MemberId;
    String resetCode = generateCode();

    public MemberCodeVerification(String Email) {
        initComponents();
        sendEmail(Email, resetCode);
        this.Email = Email;
    }
    
    
    public static void sendEmail(String recipientEmail, String code) {
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", SMTP_HOST);
        properties.put("mail.smtp.port", SMTP_PORT);
        properties.put("mail.smtp.ssl.enable", "true"); // Enable SSL

        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(EMAIL_USERNAME, EMAIL_PASSWORD);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(EMAIL_USERNAME));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipientEmail));
            message.setSubject("Password Reset Code");
            message.setText("Your password reset code is: " + code);

            Transport.send(message);
            System.out.println("Email sent successfully.");
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Code = new app.bolivia.swing.JCTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        verify = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(34, 40, 49));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Code.setBackground(new java.awt.Color(34, 40, 49));
        Code.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        Code.setForeground(new java.awt.Color(255, 255, 255));
        Code.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Code.setPhColor(new java.awt.Color(255, 255, 255));
        Code.setPlaceholder("Enter Verification Code");
        Code.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                CodeFocusLost(evt);
            }
        });
        jPanel1.add(Code, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 180, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/password-key.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("X");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, -1, -1));

        verify.setBackground(new java.awt.Color(57, 62, 70));
        verify.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        verify.setForeground(new java.awt.Color(255, 255, 255));
        verify.setText("Verify");
        verify.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verifyMouseClicked(evt);
            }
        });
        verify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verifyActionPerformed(evt);
            }
        });
        jPanel1.add(verify, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 110, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("code in your email");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 270, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("We Sent u a verification ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 470, 330));

        jPanel2.setBackground(new java.awt.Color(57, 62, 70));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 490, 10));

        jPanel3.setBackground(new java.awt.Color(57, 62, 70));
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 340));

        jPanel4.setBackground(new java.awt.Color(57, 62, 70));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 470, 10));

        jPanel5.setBackground(new java.awt.Color(57, 62, 70));
        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, -1, 340));

        setSize(new java.awt.Dimension(491, 349));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static String generateCode() {
        // Generate a random code
        Random random = new Random();
        int code = 100000 + random.nextInt(900000); // 6-digit code
        return String.valueOf(code);
    }
    
    public static int getIdByEmail(String email) {
        int id = -1; 

        try {
            Connection con = DatabaseConnection.getConnection();
            String sql = "SELECT idabonné FROM abonnés WHERE email = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, email);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                id = rs.getInt("idabonné");
            }

            rs.close();
            pst.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return id;
    }
        
    private void CodeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CodeFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_CodeFocusLost

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void verifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verifyActionPerformed
        // TODO add your handling code here:
        String enteredCode = Code.getText();
        MemberId = getIdByEmail(Email);

        if (enteredCode.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter the code that was sent in the mail", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (resetCode.equals(enteredCode)) {
            JOptionPane.showMessageDialog(this, "Correct Code!", "Success", JOptionPane.INFORMATION_MESSAGE);
            MemberPwdChangePage MemberPwdChangePage = new MemberPwdChangePage(MemberId);
            MemberPwdChangePage.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Incorrect code entered", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_verifyActionPerformed

    private void verifyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verifyMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_verifyMouseClicked

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
            java.util.logging.Logger.getLogger(MemberCodeVerification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MemberCodeVerification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MemberCodeVerification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MemberCodeVerification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private app.bolivia.swing.JCTextField Code;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton verify;
    // End of variables declaration//GEN-END:variables
}
