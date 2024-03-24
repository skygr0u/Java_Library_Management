package JFrames;

import biblio.DatabaseConnection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AuthorBooksPage extends javax.swing.JFrame {

    private int authorId;
    
    public AuthorBooksPage(int authorId) {
        initComponents();
        this.authorId = authorId;
        model = (DefaultTableModel) Book_Table.getModel();
        setBookDetailsToTable();
    }

    String bookTitle, ISBN, PublicationDate;
    int dispo, quantity;
    DefaultTableModel model;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Book_Table = new rojeru_san.complementos.RSTableMetro();
        jPanel7 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Book_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book Title", "ISBN", "Date Publication", "Availability", "Quantity", "Nombre of Loans"
            }
        ));
        Book_Table.setColorBackgoundHead(new java.awt.Color(57, 62, 70));
        Book_Table.setColorFilasForeground1(new java.awt.Color(57, 62, 70));
        Book_Table.setColorFilasForeground2(new java.awt.Color(57, 62, 70));
        Book_Table.setColorSelBackgound(new java.awt.Color(57, 62, 70));
        Book_Table.setRowHeight(40);
        Book_Table.setSelectionBackground(new java.awt.Color(238, 238, 238));
        Book_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Book_TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Book_Table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 1070, 460));

        jPanel7.setBackground(new java.awt.Color(34, 40, 49));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, -1, 40));

        jPanel6.setBackground(new java.awt.Color(34, 40, 49));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, 320, 10));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(34, 40, 49));
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search.png"))); // NOI18N
        jLabel21.setText("   Books Table OverView");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 690, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.png"))); // NOI18N
        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("X");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1510, 0, 40, 29));

        jLabel15.setBackground(new java.awt.Color(238, 238, 238));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 55)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("-");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1490, 0, 30, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1550, 830));

        setSize(new java.awt.Dimension(1550, 825));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    // Method to set the book details into the table model
    public void setBookDetailsToTable() {
        try {
            java.sql.Connection con = DatabaseConnection.getConnection();
            String sql = "SELECT b.titre as BookTitle, b.ISBN, b.DatePublication, b.Disponibilite, b.Quantite, COUNT(e.idemprunt) as NumberOfLoans " +
                         "FROM livres b " +
                         "JOIN emprunts e ON b.idlivre = e.idlivre " +
                         "WHERE b.idauteur = ? " +
                         "GROUP BY b.titre, b.ISBN, b.DatePublication, b.Disponibilite, b.Quantite";
            PreparedStatement pstmt = con.prepareStatement(sql);

            pstmt.setInt(1, authorId);
            ResultSet rs = pstmt.executeQuery();

            model.setRowCount(0);
            while (rs.next()) {
                String bookTitle = rs.getString("BookTitle");
                String ISBN = rs.getString("ISBN");
                String DatePublication = rs.getString("DatePublication");
                int Dispo = rs.getInt("Disponibilite");
                int Quantity = rs.getInt("Quantite");
                int NumberOfLoans = rs.getInt("NumberOfLoans");

                model.addRow(new Object[]{bookTitle, ISBN, DatePublication, Dispo, Quantity, NumberOfLoans});
            }
            rs.close();
            pstmt.close();
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void Book_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Book_TableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Book_TableMouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        // TODO add your handling code here:
        AuthorHomePage authorpage = new AuthorHomePage(authorId);
        authorpage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
        this.setState(AdminLoginPage.ICONIFIED);
    }//GEN-LAST:event_jLabel15MouseClicked

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
            java.util.logging.Logger.getLogger(AuthorBooksPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AuthorBooksPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AuthorBooksPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AuthorBooksPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private rojeru_san.complementos.RSTableMetro Book_Table;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
