package JFrames;

import biblio.DatabaseConnection;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;

public class MemberReviewPage extends javax.swing.JFrame {

    private int totalStars;
    private int LoanId;
    private int BookId;
    private int MemberId;
    
    public MemberReviewPage(int LoanId, int BookId, int MemberId) {
        initComponents();
        this.LoanId = LoanId;
        this.BookId = BookId;
        this.MemberId = MemberId;
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        Star5 = new javax.swing.JLabel();
        Star1 = new javax.swing.JLabel();
        Star2 = new javax.swing.JLabel();
        Star3 = new javax.swing.JLabel();
        Star4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        star = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Comment = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        AddBtn = new rojeru_san.complementos.RSButtonHover();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(34, 40, 49));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(100, 5));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 270, 3));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(100, 5));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, 270, 3));

        Star5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/star.png"))); // NOI18N
        Star5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Star5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Star5MouseClicked(evt);
            }
        });
        jPanel1.add(Star5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, -1, -1));

        Star1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/star.png"))); // NOI18N
        Star1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Star1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Star1MouseClicked(evt);
            }
        });
        jPanel1.add(Star1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, -1, -1));

        Star2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/star.png"))); // NOI18N
        Star2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Star2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Star2MouseClicked(evt);
            }
        });
        jPanel1.add(Star2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, -1, -1));

        Star3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/star.png"))); // NOI18N
        Star3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Star3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Star3MouseClicked(evt);
            }
        });
        jPanel1.add(Star3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, -1, -1));

        Star4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/star.png"))); // NOI18N
        Star4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Star4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Star4MouseClicked(evt);
            }
        });
        jPanel1.add(Star4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Review");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 130, -1));

        star.setBackground(new java.awt.Color(255, 255, 255));
        star.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        star.setForeground(new java.awt.Color(255, 255, 255));
        star.setText("0");
        jPanel1.add(star, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 10, 20));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("X");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, 30, -1));

        Comment.setBackground(new java.awt.Color(34, 40, 49));
        Comment.setColumns(20);
        Comment.setForeground(new java.awt.Color(255, 255, 255));
        Comment.setRows(5);
        Comment.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jScrollPane1.setViewportView(Comment);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 520, 190));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/comment.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        AddBtn.setBackground(new java.awt.Color(57, 62, 70));
        AddBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        AddBtn.setText(" Submit");
        AddBtn.setActionCommand("Loan Book");
        AddBtn.setColorHover(new java.awt.Color(0, 153, 204));
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
        jPanel1.add(AddBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, 190, 50));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Comment :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 100, -1));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Stars");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 50, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 740, 500));

        jPanel5.setBackground(new java.awt.Color(57, 62, 70));

        jPanel6.setBackground(new java.awt.Color(57, 62, 70));
        jPanel5.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(57, 62, 70));
        jPanel5.add(jPanel7);

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 20, 540));

        jPanel8.setBackground(new java.awt.Color(57, 62, 70));
        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, 540));

        jPanel4.setBackground(new java.awt.Color(57, 62, 70));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 740, 20));

        jPanel9.setBackground(new java.awt.Color(57, 62, 70));
        jPanel9.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 740, 20));

        setSize(new java.awt.Dimension(780, 540));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void insertReview(int stars, String comment) {
        try {
            java.sql.Connection con = DatabaseConnection.getConnection();
            String sql = "INSERT INTO reviews (idemprunt, stars, comment) VALUES (?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, LoanId);
            pst.setInt(2, stars);
            pst.setString(3, comment);

            int rowCount = pst.executeUpdate();
            if (rowCount > 0) {
                JOptionPane.showMessageDialog(this, "Review submitted successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Failed to submit review", "Error", JOptionPane.ERROR_MESSAGE);
            }

            pst.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error inserting review", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
  
    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_AddBtnMouseClicked

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        // TODO add your handling code here:
        int stars = totalStars; 
        String comment = Comment.getText();

        if (stars <= 0 || stars > 5 || comment.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please provide a valid stars rating (1-5) and comment.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        insertReview(stars, comment);
        dispose();
    }//GEN-LAST:event_AddBtnActionPerformed

    private void Star1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Star1MouseClicked
        // TODO add your handling code here:
        totalStars = 1;
        star.setText("1");
    }//GEN-LAST:event_Star1MouseClicked

    private void Star2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Star2MouseClicked
        // TODO add your handling code here:
        totalStars = 2;
        star.setText("2");
    }//GEN-LAST:event_Star2MouseClicked

    private void Star3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Star3MouseClicked
        // TODO add your handling code here:
        totalStars = 3;
        star.setText("3");
    }//GEN-LAST:event_Star3MouseClicked

    private void Star4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Star4MouseClicked
        // TODO add your handling code here:
        totalStars = 4;
        star.setText("4");
    }//GEN-LAST:event_Star4MouseClicked

    private void Star5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Star5MouseClicked
        // TODO add your handling code here:
        totalStars = 5;
        star.setText("5");
    }//GEN-LAST:event_Star5MouseClicked
    
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
            java.util.logging.Logger.getLogger(MemberReviewPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MemberReviewPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MemberReviewPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MemberReviewPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.complementos.RSButtonHover AddBtn;
    private javax.swing.JTextArea Comment;
    private javax.swing.JLabel Star1;
    private javax.swing.JLabel Star2;
    private javax.swing.JLabel Star3;
    private javax.swing.JLabel Star4;
    private javax.swing.JLabel Star5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel star;
    // End of variables declaration//GEN-END:variables
}
