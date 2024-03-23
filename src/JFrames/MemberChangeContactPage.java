package JFrames;

import biblio.DatabaseConnection;
import biblio.DatabaseConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class MemberChangeContactPage extends javax.swing.JFrame {

    private int idMemberId;
    
    public MemberChangeContactPage(int idmemberId) {
        initComponents();
        this.idMemberId = idmemberId;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        verify1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        NewContact = new app.bolivia.swing.JCTextField();
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
        jPanel1.add(verify1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 160, 40));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 173, 181));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("New Contact :");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 150, 40));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.png"))); // NOI18N
        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        NewContact.setBackground(new java.awt.Color(34, 40, 49));
        NewContact.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        NewContact.setForeground(new java.awt.Color(255, 255, 255));
        NewContact.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        NewContact.setPhColor(new java.awt.Color(255, 255, 255));
        NewContact.setPlaceholder("Enter New Contact...");
        jPanel1.add(NewContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 290, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 590, 200));

        jPanel2.setBackground(new java.awt.Color(57, 62, 70));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 600, 10));

        jPanel3.setBackground(new java.awt.Color(57, 62, 70));
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 220));

        jPanel4.setBackground(new java.awt.Color(57, 62, 70));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 590, 10));

        jPanel5.setBackground(new java.awt.Color(57, 62, 70));
        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, -1, 220));

        setSize(new java.awt.Dimension(610, 219));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void changeContact(String newContact) {
        try {
            Connection con = DatabaseConnection.getConnection();
            String sql = "UPDATE abonnés SET contact = ? WHERE idabonné = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, newContact);
            pst.setInt(2, idMemberId);
            pst.executeUpdate();
            pst.close();
            con.close();
            JOptionPane.showMessageDialog(this, "Contact changed successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error changing contact", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void verify1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verify1ActionPerformed
        // TODO add your handling code here:
        String newContact = NewContact.getText();

        if (newContact.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a new contact", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            changeContact(newContact);
            dispose();
        }
    }//GEN-LAST:event_verify1ActionPerformed

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        // TODO add your handling code here:
        MemberHomePage memberhomepage = new MemberHomePage(idMemberId);
        memberhomepage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel19MouseClicked

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
            java.util.logging.Logger.getLogger(MemberChangeContactPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MemberChangeContactPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MemberChangeContactPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MemberChangeContactPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
    private app.bolivia.swing.JCTextField NewContact;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton verify1;
    // End of variables declaration//GEN-END:variables
}
