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


public class MemberReturnLoanBookPage extends javax.swing.JFrame {

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
    

    public MemberReturnLoanBookPage(int memberId) {
        initComponents();
        this.memberId = memberId;
        setLoansDetailsToTable();
    }
    
    String bookTitle, author, ISBN, PublicationDate;
    int bookID, dispo, quantity;
    String Email, Username, Contact;
    int SubID;
    DefaultTableModel model;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        BookTitle = new app.bolivia.swing.JCTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        AddBtn = new rojeru_san.complementos.RSButtonHover();
        jLabel22 = new javax.swing.JLabel();
        tfAuthorName = new app.bolivia.swing.JCTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
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

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/clear.png"))); // NOI18N
        jLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1490, 380, 50, 60));

        BookTitle.setBackground(new java.awt.Color(34, 40, 49));
        BookTitle.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        BookTitle.setForeground(new java.awt.Color(255, 255, 255));
        BookTitle.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        BookTitle.setPhColor(new java.awt.Color(255, 255, 255));
        BookTitle.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                BookTitleFocusLost(evt);
            }
        });
        jPanel1.add(BookTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 300, 50));

        jLabel6.setBackground(new java.awt.Color(0, 173, 181));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 173, 181));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/notebook.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 80, 70));

        jLabel13.setBackground(new java.awt.Color(0, 173, 181));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 173, 181));
        jLabel13.setText("Book Title");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 300, 40));

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
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        AddBtn.setBackground(new java.awt.Color(57, 62, 70));
        AddBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        AddBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/issue_book.png"))); // NOI18N
        AddBtn.setText("Return  Book");
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
        jPanel1.add(AddBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 270, 300, 70));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ReturnBook.png"))); // NOI18N
        jLabel22.setText("   Return Book");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 490, 130));

        tfAuthorName.setBackground(new java.awt.Color(34, 40, 49));
        tfAuthorName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        tfAuthorName.setForeground(new java.awt.Color(255, 255, 255));
        tfAuthorName.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfAuthorName.setPhColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(tfAuthorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, 300, 50));

        jLabel7.setBackground(new java.awt.Color(0, 173, 181));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 173, 181));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pass.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 80, 70));

        jLabel8.setBackground(new java.awt.Color(0, 173, 181));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 173, 181));
        jLabel8.setText("Author Name");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, 300, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1550, 440));

        jPanel2.setBackground(new java.awt.Color(238, 238, 238));
        jPanel2.setPreferredSize(new java.awt.Dimension(1730, 450));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1550, 400));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 1550, 390));

        setSize(new java.awt.Dimension(1550, 825));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    //to set the loan details into the table
    public void setLoansDetailsToTable() {
    try {
        java.sql.Connection con = DatabaseConnection.getConnection();
        String sql = "SELECT e.idEmprunt, e.idLivre, e.idAbonné, e.dateEmprunt, e.Retour, e.Status, l.titre, a.username, au.nom, au.prenom " +
                "FROM emprunts e JOIN livres l ON e.idLivre = l.idLivre JOIN auteurs au ON l.idauteur = au.idauteur JOIN abonnés a ON e.idAbonné = a.idAbonné " +
                "WHERE a.idabonné = ? AND e.status = ?";
        PreparedStatement pst = con.prepareStatement(sql);
        
        pst.setInt(1, memberId);
        pst.setString(2, "pending");

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

        rs.close();
        pst.close();
        con.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
}


    //return details to database
    public boolean returnLoan() {
        boolean updated = false;
        int bookId = getBookIdByName(BookTitle.getText());
        int SubsId = memberId;

        try {
            java.sql.Connection con = DatabaseConnection.getConnection();
            String sql = "update emprunts set status = ? where idlivre = ? and idabonné = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, "Returned");
            pst.setInt(2, bookId);
            pst.setInt(3, SubsId);

            int rowCount = pst.executeUpdate();
            if (rowCount > 0) {
                updated = true;
            } else {
                updated = false;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return updated;

    }

    public int returnLoanId() {
        int idemprunt = -1;
        int bookId = getBookIdByName(BookTitle.getText());
        int SubsId = memberId;

        try {
            java.sql.Connection con = DatabaseConnection.getConnection();
            String sql = "SELECT idemprunt FROM emprunts WHERE status = ? AND idlivre = ? AND idabonné = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, "Returned");
            pst.setInt(2, bookId);
            pst.setInt(3, SubsId);

            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                idemprunt = rs.getInt("idemprunt");
            }

            rs.close();
            pst.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return idemprunt;
    }
    
    private int getBookIdByName(String bookName) {
        int bookId = -1;
        try {
            java.sql.Connection con = DatabaseConnection.getConnection();
            PreparedStatement pst = con.prepareStatement("SELECT idLivre FROM livres WHERE titre = ?");
            pst.setString(1, bookName);

            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                bookId = rs.getInt("idLivre");
            } else {
                JOptionPane.showMessageDialog(this, "Book not found", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bookId;
}
    
    //Clears Table
    public void clearTable(){
        DefaultTableModel model = (DefaultTableModel) Loan_Table.getModel();
        model.setRowCount(0);
    }
    
    //updating book count
    public void updateBookCount() {
        int bookId = getBookIdByName(BookTitle.getText());
        try {
            java.sql.Connection con = DatabaseConnection.getConnection();
            String sql = "update livres set quantite = quantite + 1 where idlivre = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, bookId);

            int rowCount = pst.executeUpdate();

            if (rowCount > 0) {
                
            } else {
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private int getBookQuantity(int bookId) throws Exception {
        int quantity = 0;
        java.sql.Connection con = DatabaseConnection.getConnection();
        String query = "SELECT quantite FROM livres WHERE idLivre = ?";
        try (PreparedStatement statement = con.prepareStatement(query)) {
            statement.setInt(1, bookId);
            try (java.sql.ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    quantity = resultSet.getInt("quantite");
                }
            }
        }
        return quantity;
    }
    
     public void updateBookDispo() {
        int bookId = getBookIdByName(BookTitle.getText());
        java.sql.Connection con = DatabaseConnection.getConnection();
        try {
            // Get the current quantity of the book
            int quantity = getBookQuantity(bookId);
            
            // Update disponibilite based on quantity
            int disponibilite = (quantity > 0) ? 1 : 0;
            
            String query = "UPDATE livres SET disponibilite = ? WHERE idLivre = ?";
            try (PreparedStatement statement = con.prepareStatement(query)) {
                statement.setInt(1, disponibilite);
                statement.setInt(2, bookId);
                statement.executeUpdate();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public int getBookDispo(int bookId) {
        int dispo = -1;
        
        try (Connection connection = DatabaseConnection.getConnection()) {
            String query = "SELECT disponibilite FROM livres WHERE idlivre = ?";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setInt(1, bookId);
                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        dispo = resultSet.getInt("disponibilite");
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return dispo;
    }
    
    //checking whether book already returned or not
    public boolean isAlreadyReturned() {

        boolean isAlreadyReturned = false;
        int bookId = getBookIdByName(BookTitle.getText());
        int SubsId = memberId;

        try {
            java.sql.Connection con = DatabaseConnection.getConnection();
            String sql = "select * from emprunts where idlivre = ? and idabonné = ? and status = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, bookId);
            pst.setInt(2, SubsId);
            pst.setString(3, "Returned");

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                isAlreadyReturned = true;
            } else {
                isAlreadyReturned = false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isAlreadyReturned;

    }
    
    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
        this.setState(AdminLoginPage.ICONIFIED);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        // TODO add your handling code here:
        BookTitle.setText("");
        tfAuthorName.setText("");
    }//GEN-LAST:event_jLabel20MouseClicked

    private void BookTitleFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BookTitleFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_BookTitleFocusLost

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        // TODO add your handling code here:
        MemberHomePage memberhomepage = new MemberHomePage(memberId);
        memberhomepage.setVisible(true);
        this.dispose();
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

    private void Loan_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Loan_TableMouseClicked
        // TODO add your handling code here:
        int rowNo = Loan_Table.getSelectedRow();
        TableModel model = Loan_Table.getModel();

        BookTitle.setText(model.getValueAt(rowNo, 0).toString());
        tfAuthorName.setText(model.getValueAt(rowNo, 1).toString());
    }//GEN-LAST:event_Loan_TableMouseClicked

    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_AddBtnMouseClicked

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        // TODO add your handling code here:
        int bookId = getBookIdByName(BookTitle.getText());
        if (!isAlreadyReturned()) {
            if (returnLoan()) {
                // add interface for review
                int LoanId = returnLoanId();
                MemberReviewPage MemberReviewPage = new MemberReviewPage(LoanId, bookId, memberId);
                MemberReviewPage.setVisible(true);
                JOptionPane.showMessageDialog(this, "Book returned successfully");
                updateBookCount();
                clearTable();
                setLoansDetailsToTable();
                updateBookDispo();

            } else {
                JOptionPane.showMessageDialog(this, "Can't return the book");
            }
        } else {
            JOptionPane.showMessageDialog(this, "This subscriber already returned this book");
        }
    }//GEN-LAST:event_AddBtnActionPerformed

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
            java.util.logging.Logger.getLogger(MemberReturnLoanBookPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MemberReturnLoanBookPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MemberReturnLoanBookPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MemberReturnLoanBookPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
    private rojeru_san.complementos.RSButtonHover AddBtn;
    private app.bolivia.swing.JCTextField BookTitle;
    private rojeru_san.complementos.RSTableMetro Loan_Table;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private app.bolivia.swing.JCTextField tfAuthorName;
    // End of variables declaration//GEN-END:variables
}
