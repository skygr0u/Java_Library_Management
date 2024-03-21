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


public class LoanBookPage extends javax.swing.JFrame {


    public LoanBookPage() {
        initComponents();
        setBookDetailsToTable();
        setSubsDetailsToTable();
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
        jLabel22 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tfSubscriber = new app.bolivia.swing.JCTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfBookID = new app.bolivia.swing.JCTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        AddBtn = new rojeru_san.complementos.RSButtonHover();
        jLabel19 = new javax.swing.JLabel();
        date_loan = new rojeru_san.componentes.RSDateChooser();
        date_dueDate = new rojeru_san.componentes.RSDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Sub_Table = new rojeru_san.complementos.RSTableMetro();
        jScrollPane2 = new javax.swing.JScrollPane();
        Book_Table = new rojeru_san.complementos.RSTableMetro();

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
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/education-cost.png"))); // NOI18N
        jLabel22.setText("   Loan Book");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 420, 120));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/clear.png"))); // NOI18N
        jLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1490, 380, 50, 60));

        jLabel11.setBackground(new java.awt.Color(0, 173, 181));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 173, 181));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/return-to-the-past.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 300, 80, 70));

        jLabel12.setBackground(new java.awt.Color(0, 173, 181));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 173, 181));
        jLabel12.setText("Return Date");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 280, 300, 40));

        jLabel9.setBackground(new java.awt.Color(0, 173, 181));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 173, 181));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/loan_date.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 80, 70));

        jLabel10.setBackground(new java.awt.Color(0, 173, 181));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 173, 181));
        jLabel10.setText("Loan Date");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 300, 40));

        tfSubscriber.setBackground(new java.awt.Color(34, 40, 49));
        tfSubscriber.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        tfSubscriber.setForeground(new java.awt.Color(255, 255, 255));
        tfSubscriber.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfSubscriber.setPhColor(new java.awt.Color(255, 255, 255));
        tfSubscriber.setPlaceholder("Enter Subsciber ID...");
        jPanel1.add(tfSubscriber, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 210, 290, 50));

        jLabel7.setBackground(new java.awt.Color(0, 173, 181));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 173, 181));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pass.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 200, 80, 70));

        jLabel8.setBackground(new java.awt.Color(0, 173, 181));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 173, 181));
        jLabel8.setText("Member ID");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 180, 300, 40));

        tfBookID.setBackground(new java.awt.Color(34, 40, 49));
        tfBookID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        tfBookID.setForeground(new java.awt.Color(255, 255, 255));
        tfBookID.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfBookID.setPhColor(new java.awt.Color(255, 255, 255));
        tfBookID.setPlaceholder("Enter Book ID...");
        tfBookID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfBookIDFocusLost(evt);
            }
        });
        jPanel1.add(tfBookID, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 290, 50));

        jLabel6.setBackground(new java.awt.Color(0, 173, 181));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 173, 181));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/notebook.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 80, 70));

        jLabel13.setBackground(new java.awt.Color(0, 173, 181));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 173, 181));
        jLabel13.setText("Book ID");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 300, 40));

        AddBtn.setBackground(new java.awt.Color(57, 62, 70));
        AddBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        AddBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/issue_book.png"))); // NOI18N
        AddBtn.setText("Add Loan");
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
        jPanel1.add(AddBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 240, 290, 70));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/arrow.png"))); // NOI18N
        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        date_loan.setColorBackground(new java.awt.Color(57, 62, 70));
        date_loan.setColorButtonHover(new java.awt.Color(255, 211, 105));
        date_loan.setColorForeground(new java.awt.Color(0, 0, 0));
        date_loan.setPlaceholder("Enter Load Date...");
        jPanel1.add(date_loan, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 270, -1));

        date_dueDate.setColorBackground(new java.awt.Color(57, 62, 70));
        date_dueDate.setColorButtonHover(new java.awt.Color(255, 211, 105));
        date_dueDate.setColorForeground(new java.awt.Color(0, 0, 0));
        date_dueDate.setPlaceholder("Enter Return Date...");
        jPanel1.add(date_dueDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 320, 270, -1));

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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1550, 440));

        jPanel2.setBackground(new java.awt.Color(238, 238, 238));
        jPanel2.setPreferredSize(new java.awt.Dimension(1730, 450));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Sub_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sub ID", "UserName", "Email", "Contact"
            }
        ));
        Sub_Table.setColorBackgoundHead(new java.awt.Color(57, 62, 70));
        Sub_Table.setColorFilasForeground1(new java.awt.Color(57, 62, 70));
        Sub_Table.setColorFilasForeground2(new java.awt.Color(57, 62, 70));
        Sub_Table.setColorSelBackgound(new java.awt.Color(57, 62, 70));
        Sub_Table.setRowHeight(40);
        Sub_Table.setSelectionBackground(new java.awt.Color(238, 238, 238));
        Sub_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Sub_TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Sub_Table);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 0, 600, 390));

        Book_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book ID", "Book Title", "Author Name", "ISBN", "Date Publication", "Availability", "Quantity"
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
        jScrollPane2.setViewportView(Book_Table);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 390));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 1550, 390));

        setSize(new java.awt.Dimension(1550, 825));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    //to set the book details into the table
    public void setBookDetailsToTable(){
        
        try {
            java.sql.Connection con = DatabaseConnection.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select l.idlivre, l.titre, l.isbn, l.datepublication, l.disponibilite, l.quantite, a.nom, a.prenom from livres l join auteurs a on (l.idauteur = a.idauteur)");
            
            while(rs.next()){
                String bookID = rs.getString("idlivre");
                String bookTitle = rs.getString("titre");
                String author = rs.getString("nom");
                String ISBN = rs.getString("isbn");
                String PublicationDate = rs.getString("datepublication");
                String dispo = rs.getString("disponibilite");
                int quantity = rs.getInt("quantite");
                
                Object[] obj = {bookID,bookTitle,author,ISBN,PublicationDate,dispo,quantity};
                model =(DefaultTableModel) Book_Table.getModel();
                model.addRow(obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    //to set the book details into the table
    public void setSubsDetailsToTable(){
        try {
            java.sql.Connection con = DatabaseConnection.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select idabonné, username, email, contact from abonnés");
            
            while(rs.next()){
                int SubID = rs.getInt("idabonné");
                String Username = rs.getString("username");
                String Email = rs.getString("email");
                String Contact = rs.getString("contact");
                
                Object[] obj = {SubID,Username,Email,Contact};
                model =(DefaultTableModel) Sub_Table.getModel();
                model.addRow(obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
    
    //insert issue book details to database
    public boolean issueBook() {
        boolean isIssued = false;
        int bookId = Integer.parseInt(tfBookID.getText());
        int SubsId = Integer.parseInt(tfSubscriber.getText());
        
        Date uIssueDate = date_loan.getDatoFecha();
        Date uDueDate = date_dueDate.getDatoFecha();

        Long l1 = uIssueDate.getTime();
        long l2 = uDueDate.getTime();

        java.sql.Date sIssueDate = new java.sql.Date(l1);
        java.sql.Date sDueDate = new java.sql.Date(l2);

        try {
            java.sql.Connection con = DatabaseConnection.getConnection();
            String sql = "insert into emprunts(idlivre,idabonné,dateemprunt,retour,status) values(?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, bookId);
            pst.setInt(2, SubsId);
            pst.setDate(3, sIssueDate);
            pst.setDate(4, sDueDate);
            pst.setString(5, "pending");

            int rowCount = pst.executeUpdate();
            if (rowCount > 0) {
                isIssued = true;
            } else {
                isIssued = false;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return isIssued;

    }
    
    //Clears Table
    public void clearTable(){
        DefaultTableModel model = (DefaultTableModel) Book_Table.getModel();
        model.setRowCount(0);
    }
    
    //updating book count
    public void updateBookCount() {
        int bookId = Integer.parseInt(tfBookID.getText());
        try {
            java.sql.Connection con = DatabaseConnection.getConnection();
            String sql = "update livres set quantite = quantite - 1 where idlivre = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, bookId);

            int rowCount = pst.executeUpdate();

            if (rowCount > 0) {
                JOptionPane.showMessageDialog(this, "book count updated");
            } else {
                JOptionPane.showMessageDialog(this, "can't update book count");
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
    
    public void updateBookDispo(int bookId) {
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
    
    //checking whether book already allocated or not
    public boolean isAlreadyIssued() {

        boolean isAlreadyIssued = false;
        int bookId = Integer.parseInt(tfBookID.getText());
        int SubsId = Integer.parseInt(tfSubscriber.getText());

        try {
            java.sql.Connection con = DatabaseConnection.getConnection();
            String sql = "select * from emprunts where idlivre = ? and idabonné = ? and status = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, bookId);
            pst.setInt(2, SubsId);
            pst.setString(3, "pending");

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                isAlreadyIssued = true;
            } else {
                isAlreadyIssued = false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isAlreadyIssued;

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
    
    
    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
        this.setState(AdminLoginPage.ICONIFIED);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void Sub_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sub_TableMouseClicked
        // TODO add your handling code here:
        int rowNo = Sub_Table.getSelectedRow();
        TableModel model = Sub_Table.getModel();

        tfSubscriber.setText(model.getValueAt(rowNo, 0).toString());
    }//GEN-LAST:event_Sub_TableMouseClicked

    private void Book_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Book_TableMouseClicked
        // TODO add your handling code here:
        int rowNo = Book_Table.getSelectedRow();
        TableModel model = Book_Table.getModel();
        
        tfBookID.setText(model.getValueAt(rowNo, 0).toString());

    }//GEN-LAST:event_Book_TableMouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        // TODO add your handling code here:
        tfBookID.setText("");
        tfSubscriber.setText("");
    }//GEN-LAST:event_jLabel20MouseClicked

    private void tfBookIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfBookIDFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBookIDFocusLost

    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_AddBtnMouseClicked

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        // TODO add your handling code here:
        int bookId = Integer.parseInt(tfBookID.getText());
        int dispo = getBookDispo(bookId);

        if (dispo == 0) {
            JOptionPane.showMessageDialog(this, "Book is not available");
        } else {
            if (!isAlreadyIssued()) {
                if (issueBook()) {
                    JOptionPane.showMessageDialog(this, "Book issued successfully");
                    updateBookCount();
                    updateBookDispo(bookId);
                    clearTable();
                    setBookDetailsToTable();
                } else {
                    JOptionPane.showMessageDialog(this, "Can't issue the book");
                }
            } else {
                JOptionPane.showMessageDialog(this, "This subscriber already has this book");
            }
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
        setBookDetailsToTable();
        setSubsDetailsToTable();
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
            java.util.logging.Logger.getLogger(LoanBookPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoanBookPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoanBookPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoanBookPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoanBookPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.complementos.RSButtonHover AddBtn;
    private rojeru_san.complementos.RSTableMetro Book_Table;
    private rojeru_san.complementos.RSTableMetro Sub_Table;
    private rojeru_san.componentes.RSDateChooser date_dueDate;
    private rojeru_san.componentes.RSDateChooser date_loan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private app.bolivia.swing.JCTextField tfBookID;
    private app.bolivia.swing.JCTextField tfSubscriber;
    // End of variables declaration//GEN-END:variables
}
