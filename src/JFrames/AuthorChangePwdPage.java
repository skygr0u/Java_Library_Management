package JFrames;

import biblio.DatabaseConnection;
import biblio.DatabaseConnection;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class AuthorChangePwdPage extends javax.swing.JFrame {

    private int AuthorId;
    
    public AuthorChangePwdPage(int AuthorId) {
        initComponents();
        this.AuthorId = AuthorId;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        verify1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        tfPassword = new javax.swing.JPasswordField();
        PwdConfirm = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        oldpwd = new javax.swing.JPasswordField();
        jLabel19 = new javax.swing.JLabel();
        show = new javax.swing.JLabel();
        disable = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(34, 40, 49));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, -1, -1));

        verify1.setBackground(new java.awt.Color(57, 62, 70));
        verify1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        verify1.setForeground(new java.awt.Color(255, 255, 255));
        verify1.setText("Confirm");
        verify1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verify1ActionPerformed(evt);
            }
        });
        jPanel1.add(verify1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 150, 40));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 173, 181));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Confirm Password ");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 150, 40));

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
        jPanel1.add(tfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 290, 30));

        PwdConfirm.setBackground(new java.awt.Color(34, 40, 49));
        PwdConfirm.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        PwdConfirm.setForeground(new java.awt.Color(255, 255, 255));
        PwdConfirm.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        PwdConfirm.setCaretColor(new java.awt.Color(255, 255, 255));
        PwdConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PwdConfirmActionPerformed(evt);
            }
        });
        jPanel1.add(PwdConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 290, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 173, 181));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Old Password ");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, 40));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 173, 181));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("New Password ");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, 40));

        oldpwd.setBackground(new java.awt.Color(34, 40, 49));
        oldpwd.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        oldpwd.setForeground(new java.awt.Color(255, 255, 255));
        oldpwd.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        oldpwd.setCaretColor(new java.awt.Color(255, 255, 255));
        oldpwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oldpwdActionPerformed(evt);
            }
        });
        jPanel1.add(oldpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 290, 30));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.png"))); // NOI18N
        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        show.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_eye_20px_1.png"))); // NOI18N
        show.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showMouseClicked(evt);
            }
        });
        jPanel1.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 40, 40));

        disable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        disable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_invisible_20px_1.png"))); // NOI18N
        disable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        disable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                disableMouseClicked(evt);
            }
        });
        jPanel1.add(disable, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 40, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 590, 300));

        jPanel2.setBackground(new java.awt.Color(57, 62, 70));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 600, 10));

        jPanel3.setBackground(new java.awt.Color(57, 62, 70));
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 320));

        jPanel4.setBackground(new java.awt.Color(57, 62, 70));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 590, 10));

        jPanel5.setBackground(new java.awt.Color(57, 62, 70));
        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, -1, 310));

        setSize(new java.awt.Dimension(610, 319));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private boolean checkOldPassword(char[] oldPasswordChars) {
        try {
            Connection con = DatabaseConnection.getConnection();
            String sql = "SELECT password FROM auteurs WHERE idauteur = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, AuthorId);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                String storedPassword = rs.getString("password");
                String hashedOldPassword = convertToMD5(oldPasswordChars);
                return hashedOldPassword.equals(storedPassword);
            }
            rs.close();
            pst.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    private String convertToMD5(char[] passwordChars) {
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

    private void resetPassword(char[] newPasswordChars) {
        try {
            String newPassword = convertToMD5(newPasswordChars);
            Connection con = DatabaseConnection.getConnection();
            String sql = "UPDATE auteurs SET password = ? WHERE idauteur = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, newPassword);
            pst.setInt(2, AuthorId);
            pst.executeUpdate();
            pst.close();
            con.close();
            JOptionPane.showMessageDialog(this, "Password reset successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error resetting password", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void verify1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verify1ActionPerformed
        // TODO add your handling code here:
        char[] oldPasswordChars = oldpwd.getPassword();
        char[] newPasswordChars = tfPassword.getPassword();
        char[] confirmPasswordChars = PwdConfirm.getPassword();

        if (!checkOldPassword(oldPasswordChars)) {
            JOptionPane.showMessageDialog(this, "Incorrect old password", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (!Arrays.equals(newPasswordChars, confirmPasswordChars)) {
            JOptionPane.showMessageDialog(this, "New password and confirm password do not match", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            resetPassword(newPasswordChars);
            dispose();
        }
    }//GEN-LAST:event_verify1ActionPerformed

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        // TODO add your handling code here:
        AuthorHomePage AuthorHomePage = new AuthorHomePage(AuthorId);
        AuthorHomePage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel19MouseClicked

    private void showMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showMouseClicked
        tfPassword.setEchoChar((char)8226);
        disable.setVisible(true);
        disable.setEnabled(true);
        show.setEnabled(false);
        show.setEnabled(false);
    }//GEN-LAST:event_showMouseClicked

    private void disableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disableMouseClicked
        tfPassword.setEchoChar((char)0);
        disable.setVisible(false);
        disable.setEnabled(false);
        show.setEnabled(true);
        show.setEnabled(true);
    }//GEN-LAST:event_disableMouseClicked

    private void oldpwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oldpwdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oldpwdActionPerformed

    private void PwdConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PwdConfirmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PwdConfirmActionPerformed

    private void tfPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPasswordActionPerformed

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
            java.util.logging.Logger.getLogger(AuthorChangePwdPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AuthorChangePwdPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AuthorChangePwdPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AuthorChangePwdPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PwdConfirm;
    private javax.swing.JLabel disable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPasswordField oldpwd;
    private javax.swing.JLabel show;
    private javax.swing.JPasswordField tfPassword;
    private javax.swing.JButton verify1;
    // End of variables declaration//GEN-END:variables
}
