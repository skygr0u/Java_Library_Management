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


public class ViewRecordsPage extends javax.swing.JFrame {


    public ViewRecordsPage() {
        initComponents();
        setLoansDetailsToTable();
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
        jLabel20 = new javax.swing.JLabel();
        AddBtn = new rojeru_san.complementos.RSButtonHover();
        jLabel19 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        date_loan = new rojeru_san.componentes.RSDateChooser();
        jLabel9 = new javax.swing.JLabel();
        date_dueDate = new rojeru_san.componentes.RSDateChooser();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
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
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ReturnBook.png"))); // NOI18N
        jLabel22.setText("  Loan Records");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 480, 130));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/clear.png"))); // NOI18N
        jLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1490, 390, 60, 60));

        AddBtn.setBackground(new java.awt.Color(57, 62, 70));
        AddBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        AddBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search_loan.png"))); // NOI18N
        AddBtn.setText(" Search Loan");
        AddBtn.setActionCommand("Loan Book");
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
        jPanel1.add(AddBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 250, 310, 70));

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

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/refresh.png"))); // NOI18N
        jLabel23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        date_loan.setColorBackground(new java.awt.Color(57, 62, 70));
        date_loan.setColorButtonHover(new java.awt.Color(255, 211, 105));
        date_loan.setColorForeground(new java.awt.Color(0, 0, 0));
        date_loan.setPlaceholder("Enter Load Date...");
        jPanel1.add(date_loan, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 270, 50));

        jLabel9.setBackground(new java.awt.Color(0, 173, 181));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 173, 181));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/loan_date.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 80, 80));

        date_dueDate.setColorBackground(new java.awt.Color(57, 62, 70));
        date_dueDate.setColorButtonHover(new java.awt.Color(255, 211, 105));
        date_dueDate.setColorForeground(new java.awt.Color(0, 0, 0));
        date_dueDate.setPlaceholder("Enter  Date...");
        jPanel1.add(date_dueDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, 270, 50));

        jLabel11.setBackground(new java.awt.Color(0, 173, 181));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 173, 181));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/return-to-the-past.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 80, 80));

        jPanel3.setBackground(new java.awt.Color(57, 62, 70));
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, 500, 10));

        jPanel4.setBackground(new java.awt.Color(57, 62, 70));
        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 0, -1, 150));

        jPanel5.setBackground(new java.awt.Color(57, 62, 70));
        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, -1, 150));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1550, 450));

        jPanel2.setBackground(new java.awt.Color(238, 238, 238));
        jPanel2.setPreferredSize(new java.awt.Dimension(1730, 450));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Loan_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Loan ID", "Book ID", "Book Title", "Member ID", "Member Name", "Loan Date", "Return Date", "Status"
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

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1550, 380));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 1550, 380));

        setSize(new java.awt.Dimension(1550, 825));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    //to set the loan details into the table
    public void setLoansDetailsToTable() {
    try {
        java.sql.Connection con = DatabaseConnection.getConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT e.idEmprunt, e.idLivre, e.idAbonné, e.dateEmprunt, e.Retour, e.Status, l.titre, a.username " +
                "FROM emprunts e JOIN livres l ON e.idLivre = l.idLivre JOIN abonnés a ON e.idAbonné = a.idAbonné");

        while (rs.next()) {
            int LoanID = rs.getInt("idEmprunt");
            int BookID = rs.getInt("idLivre");
            String BookTitle = rs.getString("titre");
            int SubscriberID = rs.getInt("idAbonné");
            String MemberName = rs.getString("username");
            String LoanDate = rs.getString("dateEmprunt");
            String ReturnDate = rs.getString("Retour");
            String Status = rs.getString("Status");

            Object[] obj = {LoanID, BookID, BookTitle, SubscriberID, MemberName, LoanDate, ReturnDate, Status};
            DefaultTableModel model = (DefaultTableModel) Loan_Table.getModel();
            model.addRow(obj);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}
    
    //Clears Table
    public void clearTable(){
        DefaultTableModel model = (DefaultTableModel) Loan_Table.getModel();
        model.setRowCount(0);
    }
    
    public void search() {
    Date uFromDate = date_loan.getDatoFecha();
    Date uToDate = date_dueDate.getDatoFecha();

    long l1 = uFromDate.getTime();
    long l2 = uToDate.getTime();

    java.sql.Date fromDate = new java.sql.Date(l1);
    java.sql.Date toDate = new java.sql.Date(l2);

    try {
        java.sql.Connection con = DatabaseConnection.getConnection();
        String sql = "SELECT e.idEmprunt, e.idLivre, e.idAbonné, e.dateEmprunt, e.Retour, e.Status, l.titre, a.username " +
                "FROM emprunts e JOIN livres l ON e.idLivre = l.idLivre JOIN abonnés a ON e.idAbonné = a.idAbonné " +
                "WHERE e.dateEmprunt BETWEEN ? AND ?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setDate(1, fromDate);
        pst.setDate(2, toDate);

        ResultSet rs = pst.executeQuery();

        DefaultTableModel model = (DefaultTableModel) Loan_Table.getModel();
        model.setRowCount(0); 
        if (!rs.next()) {
            JOptionPane.showMessageDialog(this, "No Record Found");
        } else {
            do {
                int LoanID = rs.getInt("idEmprunt");
                int BookID = rs.getInt("idLivre");
                String BookTitle = rs.getString("titre");
                int SubscriberID = rs.getInt("idAbonné");
                String MemberName = rs.getString("username");
                String LoanDate = rs.getString("dateEmprunt");
                String ReturnDate = rs.getString("Retour");
                String Status = rs.getString("Status");

                Object[] obj = {LoanID, BookID, BookTitle, SubscriberID, MemberName, LoanDate, ReturnDate, Status};
                model.addRow(obj);
            } while (rs.next());
        }

        con.close(); 
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

    private void Loan_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Loan_TableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Loan_TableMouseClicked
    
    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jLabel20MouseClicked

    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_AddBtnMouseClicked

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        // TODO add your handling code here:
        if (date_loan.getDatoFecha() != null && date_dueDate.getDatoFecha() != null) {
            clearTable();
            search();
        }else{
            JOptionPane.showMessageDialog(this, "please select a date");
        }
    }//GEN-LAST:event_AddBtnActionPerformed

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        // TODO add your handling code here:
        AdminHomePage homepage = new AdminHomePage();
        homepage.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        //this.setExtendedState(JFrame.MAXIMIZED_BOTH);
     
            // Maximiser la fenêtre sans redimensionner les sous-composants
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.revalidate(); // Mettre à jour la disposition des composants
       
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        // TODO add your handling code here:
        clearTable();
        setLoansDetailsToTable();
    }//GEN-LAST:event_jLabel23MouseClicked

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
            java.util.logging.Logger.getLogger(ViewRecordsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewRecordsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewRecordsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewRecordsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewRecordsPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.complementos.RSButtonHover AddBtn;
    private rojeru_san.complementos.RSTableMetro Loan_Table;
    private rojeru_san.componentes.RSDateChooser date_dueDate;
    private rojeru_san.componentes.RSDateChooser date_loan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
