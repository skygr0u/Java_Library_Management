package JFrames;

import biblio.DatabaseConnection;
import biblio.DatabaseConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class MemberSettingsPage extends javax.swing.JFrame {

    private int MemberId;
    
    public MemberSettingsPage(int memberId) {
        initComponents();
        this.MemberId = memberId;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        verify = new javax.swing.JButton();
        verify1 = new javax.swing.JButton();
        verify2 = new javax.swing.JButton();
        verify3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
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
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, -1, -1));

        verify.setBackground(new java.awt.Color(57, 62, 70));
        verify.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        verify.setForeground(new java.awt.Color(255, 255, 255));
        verify.setText("Contact");
        verify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verifyActionPerformed(evt);
            }
        });
        jPanel1.add(verify, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 150, 40));

        verify1.setBackground(new java.awt.Color(57, 62, 70));
        verify1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        verify1.setForeground(new java.awt.Color(255, 255, 255));
        verify1.setText("User Name");
        verify1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verify1ActionPerformed(evt);
            }
        });
        jPanel1.add(verify1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 150, 40));

        verify2.setBackground(new java.awt.Color(57, 62, 70));
        verify2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        verify2.setForeground(new java.awt.Color(255, 255, 255));
        verify2.setText("Password");
        verify2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verify2ActionPerformed(evt);
            }
        });
        jPanel1.add(verify2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 150, 40));

        verify3.setBackground(new java.awt.Color(57, 62, 70));
        verify3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        verify3.setForeground(new java.awt.Color(255, 255, 255));
        verify3.setText("Email");
        verify3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verify3ActionPerformed(evt);
            }
        });
        jPanel1.add(verify3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 150, 40));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 173, 181));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Change :");
        jLabel11.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 107, -1, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/settings.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 300, 430));

        jPanel2.setBackground(new java.awt.Color(57, 62, 70));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 320, 10));

        jPanel3.setBackground(new java.awt.Color(57, 62, 70));
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 450));

        jPanel4.setBackground(new java.awt.Color(57, 62, 70));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 300, 10));

        jPanel5.setBackground(new java.awt.Color(57, 62, 70));
        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, -1, 450));

        setSize(new java.awt.Dimension(319, 448));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void verifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verifyActionPerformed
        // TODO add your handling code here:
        MemberChangeContactPage memberchangecontactpage = new MemberChangeContactPage(MemberId);
        memberchangecontactpage.setVisible(true);
        dispose();
    }//GEN-LAST:event_verifyActionPerformed

    private void verify1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verify1ActionPerformed
        // TODO add your handling code here:
        MemberChangeNamePage memberchangenamepage = new MemberChangeNamePage(MemberId);
        memberchangenamepage.setVisible(true);
        dispose();
    }//GEN-LAST:event_verify1ActionPerformed

    private void verify2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verify2ActionPerformed
        // TODO add your handling code here:
        MemberChangePwdPage memberchangepwdpage = new MemberChangePwdPage(MemberId);
        memberchangepwdpage.setVisible(true);
        dispose();
    }//GEN-LAST:event_verify2ActionPerformed

    private void verify3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verify3ActionPerformed
        // TODO add your handling code here:
        MemberChangeEmailPage memberchangeemailpage = new MemberChangeEmailPage(MemberId);
        memberchangeemailpage.setVisible(true);
        dispose();
    }//GEN-LAST:event_verify3ActionPerformed

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
            java.util.logging.Logger.getLogger(MemberSettingsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MemberSettingsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MemberSettingsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MemberSettingsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton verify;
    private javax.swing.JButton verify1;
    private javax.swing.JButton verify2;
    private javax.swing.JButton verify3;
    // End of variables declaration//GEN-END:variables
}
