package JFrames;

import biblio.DatabaseConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class AuthorHomePage extends javax.swing.JFrame {

    private int AuthorId;
    public AuthorHomePage(int AuthorId) {
        initComponents();
        this.AuthorId = AuthorId;
        Name.setText(getAuthorName());
        Name1.setText(getAuthorName());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Name1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(34, 40, 49));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/author_user.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        Name.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        Name.setForeground(new java.awt.Color(255, 211, 105));
        Name.setText("Name");
        jPanel1.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 200, 40));

        jPanel3.setBackground(new java.awt.Color(57, 62, 70));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/settings2.png"))); // NOI18N
        jLabel4.setText("Settings");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 70, 180, 50));

        jPanel4.setBackground(new java.awt.Color(57, 62, 70));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/books_2.png"))); // NOI18N
        jLabel1.setText("Books");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 180, 50));

        jPanel5.setBackground(new java.awt.Color(57, 62, 70));
        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/bar-chart.png"))); // NOI18N
        jLabel3.setText("Books Statis");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 30));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 200, 50));

        jLabel10.setBackground(new java.awt.Color(34, 40, 49));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("and introduce them to new readers.");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 760, 40));

        jLabel9.setBackground(new java.awt.Color(34, 40, 49));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("a source of inspiration and joy, and we can't wait to promote them  ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 780, 40));

        jLabel8.setBackground(new java.awt.Color(34, 40, 49));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText(" sharing your wonderful stories with our readers.Your books have always been ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 760, 40));

        jLabel11.setBackground(new java.awt.Color(34, 40, 49));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Welcome back to our author page! We are delighted to have you here again, ");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 760, 40));

        jLabel12.setBackground(new java.awt.Color(34, 40, 49));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Dear, ");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 90, 40));

        Name1.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        Name1.setForeground(new java.awt.Color(255, 211, 105));
        Name1.setText("Name");
        jPanel1.add(Name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 140, 50));

        jLabel13.setBackground(new java.awt.Color(34, 40, 49));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Thank you for choosing our platform to showcase your work.");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, 760, 40));

        jLabel14.setBackground(new java.awt.Color(34, 40, 49));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("We're excited about the journey ahead and look forward");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 550, 760, 40));

        jLabel15.setBackground(new java.awt.Color(34, 40, 49));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText(" to continuing our collaboration with you!");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 590, 760, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/happy.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 640, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("X");
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 0, 40, 29));

        jLabel17.setBackground(new java.awt.Color(238, 238, 238));
        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 55)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("-");
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, 30, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, 850, 830));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/brainstorm.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 60)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Welcome Back !");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 460, 90));

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/switch.png"))); // NOI18N
        jLabel40.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel40MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 820));

        setSize(new java.awt.Dimension(1550, 825));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public String getAuthorName() {
        String Name = null;
        try {
            java.sql.Connection con = DatabaseConnection.getConnection();
            PreparedStatement pst = con.prepareStatement("SELECT prenom FROM auteurs WHERE idauteur = ?");

            pst.setInt(1, AuthorId);

            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                Name = rs.getString("prenom");
            } else {
                JOptionPane.showMessageDialog(this, "Error", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Name;
    }
    
    private void jLabel40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel40MouseClicked
        // TODO add your handling code here:
        AuthorLoginPage AuthorLoginPage = new AuthorLoginPage();
        AuthorLoginPage.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel40MouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jPanel4MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        AuthorBooksPage AuthorBooksPage = new AuthorBooksPage(AuthorId);
        AuthorBooksPage.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        // TODO add your handling code here:
        this.setState(AdminLoginPage.ICONIFIED);
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        AuthorSettingsPage AuthorSettingsPage = new AuthorSettingsPage(AuthorId);
        AuthorSettingsPage.setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        AuthorStatsPage AuthorStatsPage = new AuthorStatsPage(AuthorId);
        AuthorStatsPage.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

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
            java.util.logging.Logger.getLogger(AuthorHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AuthorHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AuthorHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AuthorHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JLabel Name;
    private javax.swing.JLabel Name1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
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
    // End of variables declaration//GEN-END:variables
}
