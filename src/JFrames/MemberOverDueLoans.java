package JFrames;

import biblio.DatabaseConnection;
import java.awt.Panel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class MemberOverDueLoans extends javax.swing.JFrame {
    
    public int memberId;
     
    public String getMemberName() {
        String Name = null;
        try {
            java.sql.Connection con = DatabaseConnection.getConnection();
            PreparedStatement pst = con.prepareStatement("SELECT username FROM abonnés WHERE idabonné = ?");

            pst.setInt(1, memberId);

            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                Name = rs.getString("username");
            } else {
                JOptionPane.showMessageDialog(this, "Error", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Name;
    }

    public MemberOverDueLoans(int memberId) {
        initComponents();
        this.memberId = memberId;
        setLoansDetailsToTable(memberId);
}

    String LoanDate, ReturnDate, Status, BookTitle, MemberName;
    int LoanID, BookID, SubscriberID;
    DefaultTableModel model;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Loan_Table = new rojeru_san.complementos.RSTableMetro();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(34, 40, 49));
        jPanel1.setName("Enter Return Date..."); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1730, 550));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setBackground(new java.awt.Color(238, 238, 238));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 55)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("-");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 0, 30, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("X");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1510, 0, 40, 29));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/expired.png"))); // NOI18N
        jLabel22.setText("Loans Not Returned");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 620, 130));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/arrow.png"))); // NOI18N
        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/maximaze.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1480, 0, 30, 30));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, 640, 10));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 0, -1, 150));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, -1, 150));

        jLabel10.setBackground(new java.awt.Color(0, 173, 181));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 173, 181));
        jLabel10.setText("Loans That Have Passed the Return Date");
        jLabel10.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 6, 0, new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 640, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/alarm.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 230, -1, -1));

        Loan_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book Title", "Author Name", "Loan Date", "Return Date", "Status"
            }
        ));
        Loan_Table.setColorBackgoundHead(new java.awt.Color(57, 62, 70));
        Loan_Table.setColorFilasForeground1(new java.awt.Color(57, 62, 70));
        Loan_Table.setColorFilasForeground2(new java.awt.Color(57, 62, 70));
        Loan_Table.setColorSelBackgound(new java.awt.Color(57, 62, 70));
        Loan_Table.setRowHeight(40);
        Loan_Table.setSelectionBackground(new java.awt.Color(238, 238, 238));
        Loan_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Loan_TableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Loan_Table);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 1220, 400));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1550, 830));

        setSize(new java.awt.Dimension(1550, 825));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    //to set the loan details into the table
    public void setLoansDetailsToTable(int memberId) {
        long l = System.currentTimeMillis();
        java.sql.Date todaysDate = new java.sql.Date(l);
        try {
            java.sql.Connection con = DatabaseConnection.getConnection();
            PreparedStatement pst = con.prepareStatement("SELECT e.idEmprunt, e.idLivre, e.idAbonné, e.dateEmprunt, e.Retour, e.Status, l.titre, a.username, au.nom, au.prenom " +
                "FROM emprunts e JOIN livres l ON e.idLivre = l.idLivre JOIN auteurs au ON l.idauteur = au.idauteur JOIN abonnés a ON e.idAbonné = a.idAbonné " +
                "WHERE a.idabonné = ? AND e.Retour < ? AND e.Status = ?");

            pst.setInt(1, memberId);
            pst.setDate(2, todaysDate);
            pst.setString(3, "pending");
            ResultSet rs = pst.executeQuery();

            DefaultTableModel model = (DefaultTableModel) Loan_Table.getModel();
            model.setRowCount(0);

            while (rs.next()) {
                int LoanID = rs.getInt("idEmprunt");
                int BookID = rs.getInt("idLivre");
                String BookTitle = rs.getString("titre");
                String LoanDate = rs.getString("dateEmprunt");
                String ReturnDate = rs.getString("Retour");
                String Status = rs.getString("Status");
                String AuthorName = rs.getString("nom") + " " + rs.getString("prenom");

                Object[] obj = {BookTitle, AuthorName, LoanDate, ReturnDate, Status};
                model.addRow(obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
}


    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
        this.setState(AdminLoginPage.ICONIFIED);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel5MouseClicked
    
    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        // TODO add your handling code here:
        MemberHomePage memberhomepage = new MemberHomePage(memberId);
        memberhomepage.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        //this.setExtendedState(JFrame.MAXIMIZED_BOTH);
     
            // Maximiser la fenêtre sans redimensionner les sous-composants
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.revalidate(); // Mettre à jour la disposition des composants
       
    }//GEN-LAST:event_jLabel1MouseClicked

    private void Loan_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Loan_TableMouseClicked
        // TODO add your handling code here:
 
    }//GEN-LAST:event_Loan_TableMouseClicked

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
            java.util.logging.Logger.getLogger(MemberOverDueLoans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MemberOverDueLoans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MemberOverDueLoans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MemberOverDueLoans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private rojeru_san.complementos.RSTableMetro Loan_Table;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
