package JFrames;

import biblio.DatabaseConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class BookManager extends javax.swing.JFrame {

    public BookManager() {
        initComponents();
        setBookDetailsToTable();
    }

    String bookTitle, author, ISBN, PublicationDate;
    int bookID, dispo, quantity;
    DefaultTableModel model;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Book_Table = new rojeru_san.complementos.RSTableMetro();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        UpdateBtn = new rojeru_san.complementos.RSButtonHover();
        AddBtn = new rojeru_san.complementos.RSButtonHover();
        DeleteBtn = new rojeru_san.complementos.RSButtonHover();
        jLabel22 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfID = new app.bolivia.swing.JCTextField();
        jLabel8 = new javax.swing.JLabel();
        tfTitle = new app.bolivia.swing.JCTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tfAuthor = new app.bolivia.swing.JCTextField();
        jLabel12 = new javax.swing.JLabel();
        tfISBN = new app.bolivia.swing.JCTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tfDate = new app.bolivia.swing.JCTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tfAvailability = new app.bolivia.swing.JCTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        tfQuantity = new app.bolivia.swing.JCTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new java.awt.BorderLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, -1));

        jPanel3.setBackground(new java.awt.Color(238, 238, 238));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(34, 40, 49));
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search.png"))); // NOI18N
        jLabel21.setText("   Books Table OverView");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 690, -1));

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
        jScrollPane1.setViewportView(Book_Table);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 910, 400));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("X");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, -10, 40, 60));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("-");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 0, -1, 50));

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

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 320, 10));

        jPanel7.setBackground(new java.awt.Color(34, 40, 49));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, -1, 30));

        UpdateBtn.setBackground(new java.awt.Color(57, 62, 70));
        UpdateBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        UpdateBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/updated.png"))); // NOI18N
        UpdateBtn.setText("Update Book");
        UpdateBtn.setColorHover(new java.awt.Color(255, 211, 105));
        UpdateBtn.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });
        jPanel3.add(UpdateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 660, 250, 70));

        AddBtn.setBackground(new java.awt.Color(57, 62, 70));
        AddBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        AddBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/library.png"))); // NOI18N
        AddBtn.setText("Add Book");
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
        jPanel3.add(AddBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 660, 230, 70));

        DeleteBtn.setBackground(new java.awt.Color(57, 62, 70));
        DeleteBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        DeleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete.png"))); // NOI18N
        DeleteBtn.setText("Delete Book");
        DeleteBtn.setColorHover(new java.awt.Color(255, 211, 105));
        DeleteBtn.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });
        jPanel3.add(DeleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 660, 240, 70));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/refresh.png"))); // NOI18N
        jLabel22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 1020, 830));

        jPanel2.setBackground(new java.awt.Color(34, 40, 49));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(0, 173, 181));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 173, 181));
        jLabel6.setText("Book ID");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 300, -1));

        jLabel5.setBackground(new java.awt.Color(0, 173, 181));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 173, 181));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/book (1).png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 80, -1));

        tfID.setBackground(new java.awt.Color(34, 40, 49));
        tfID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        tfID.setForeground(new java.awt.Color(255, 255, 255));
        tfID.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfID.setPhColor(new java.awt.Color(255, 255, 255));
        tfID.setPlaceholder("Enter Book ID...");
        tfID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfIDFocusLost(evt);
            }
        });
        jPanel2.add(tfID, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 290, -1));

        jLabel8.setBackground(new java.awt.Color(0, 173, 181));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 173, 181));
        jLabel8.setText("Book Title");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 300, -1));

        tfTitle.setBackground(new java.awt.Color(34, 40, 49));
        tfTitle.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        tfTitle.setForeground(new java.awt.Color(255, 255, 255));
        tfTitle.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfTitle.setPhColor(new java.awt.Color(255, 255, 255));
        tfTitle.setPlaceholder("Enter Book Title...");
        jPanel2.add(tfTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 290, -1));

        jLabel7.setBackground(new java.awt.Color(0, 173, 181));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 173, 181));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/notebook.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 80, 50));

        jLabel9.setBackground(new java.awt.Color(0, 173, 181));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 173, 181));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pass.png"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 70, -1));

        jLabel10.setBackground(new java.awt.Color(0, 173, 181));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 173, 181));
        jLabel10.setText("Author Name (ID)");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 300, -1));

        tfAuthor.setBackground(new java.awt.Color(34, 40, 49));
        tfAuthor.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        tfAuthor.setForeground(new java.awt.Color(255, 255, 255));
        tfAuthor.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfAuthor.setPhColor(new java.awt.Color(255, 255, 255));
        tfAuthor.setPlaceholder("Enter Author Name...");
        jPanel2.add(tfAuthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 290, -1));

        jLabel12.setBackground(new java.awt.Color(0, 173, 181));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 173, 181));
        jLabel12.setText("ISBN");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 300, -1));

        tfISBN.setBackground(new java.awt.Color(34, 40, 49));
        tfISBN.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        tfISBN.setForeground(new java.awt.Color(255, 255, 255));
        tfISBN.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfISBN.setPhColor(new java.awt.Color(255, 255, 255));
        tfISBN.setPlaceholder("Enter  ISBN...");
        jPanel2.add(tfISBN, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 290, -1));

        jLabel11.setBackground(new java.awt.Color(0, 173, 181));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 173, 181));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/barcode-product.png"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 80, 50));

        jLabel13.setBackground(new java.awt.Color(0, 173, 181));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 173, 181));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/schedule.png"))); // NOI18N
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, 80, 50));

        tfDate.setBackground(new java.awt.Color(34, 40, 49));
        tfDate.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        tfDate.setForeground(new java.awt.Color(255, 255, 255));
        tfDate.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfDate.setPhColor(new java.awt.Color(255, 255, 255));
        tfDate.setPlaceholder("Enter  Publication Date...");
        tfDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDateActionPerformed(evt);
            }
        });
        jPanel2.add(tfDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 520, 290, -1));

        jLabel14.setBackground(new java.awt.Color(0, 173, 181));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 173, 181));
        jLabel14.setText("Publication Date (YY-MM-DD)");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 490, 300, -1));

        jLabel15.setBackground(new java.awt.Color(0, 173, 181));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 173, 181));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/check-list.png"))); // NOI18N
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 590, 80, 50));

        tfAvailability.setBackground(new java.awt.Color(34, 40, 49));
        tfAvailability.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        tfAvailability.setForeground(new java.awt.Color(255, 255, 255));
        tfAvailability.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfAvailability.setPhColor(new java.awt.Color(255, 255, 255));
        tfAvailability.setPlaceholder("Enter  Availability...");
        jPanel2.add(tfAvailability, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 600, 290, -1));

        jLabel16.setBackground(new java.awt.Color(0, 173, 181));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 173, 181));
        jLabel16.setText("Availability");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 570, 300, -1));

        jLabel17.setBackground(new java.awt.Color(0, 173, 181));
        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 173, 181));
        jLabel17.setText("Quantity");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 650, 300, -1));

        jLabel18.setBackground(new java.awt.Color(0, 173, 181));
        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 173, 181));
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/boxes.png"))); // NOI18N
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 670, 80, -1));

        tfQuantity.setBackground(new java.awt.Color(34, 40, 49));
        tfQuantity.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        tfQuantity.setForeground(new java.awt.Color(255, 255, 255));
        tfQuantity.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfQuantity.setPhColor(new java.awt.Color(255, 255, 255));
        tfQuantity.setPlaceholder("Enter  Quantity...");
        tfQuantity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfQuantityFocusLost(evt);
            }
        });
        tfQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfQuantityActionPerformed(evt);
            }
        });
        jPanel2.add(tfQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 680, 290, -1));

        jPanel4.setBackground(new java.awt.Color(57, 62, 70));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 211, 105));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/execution.png"))); // NOI18N
        jLabel3.setText("  Manage Books");

        jPanel5.setBackground(new java.awt.Color(255, 211, 105));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.png"))); // NOI18N
        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel19)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel19)))
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 150));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/clear.png"))); // NOI18N
        jLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 750, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 830));

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
    
    //Clears Table
    public void clearTable(){
        DefaultTableModel model = (DefaultTableModel) Book_Table.getModel();
        model.setRowCount(0);
    }
    
    //add book to book_details table
    public boolean addBook(){
        boolean isAdded = false;
        int bookID = Integer.parseInt(tfID.getText());
        String bookTitle = tfTitle.getText();
        String author = tfAuthor.getText();
        String ISBN = tfISBN.getText();
        String PublicationDate = tfDate.getText();
        int dispo = Integer.parseInt(tfAvailability.getText());
        int quantity = Integer.parseInt(tfQuantity.getText());

        try {
            java.sql.Connection con = DatabaseConnection.getConnection();
            String sql = "insert into livres values(?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, bookID);
            pst.setString(2, bookTitle);
            pst.setString(3, author);
            pst.setString(4, ISBN);
            pst.setString(5, PublicationDate);
            pst.setInt(6, dispo);
            pst.setInt(7, quantity);
            
            int rowCount = pst.executeUpdate();
            if (rowCount > 0) {
                isAdded = true;
            }else{
                isAdded = false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isAdded;
    }
    
    /*public String getAuthorName(int bookId) {
        String authorName = null;
        
        java.sql.Connection con = DatabaseConnection.getConnection();
        try{
            String query = "SELECT auteurs.nom FROM livres JOIN auteurs ON livres.idAuteur = auteurs.idAuteur WHERE livres.idLivre = ?";
            try (PreparedStatement statement = con.prepareStatement(query)) {
                statement.setInt(1, bookId);
                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        authorName = resultSet.getString("nom");
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return authorName;
    }*/

    public int getAuthorId(String authorName) {
        int authorId = -1;
        
        java.sql.Connection con = DatabaseConnection.getConnection();
        try {
            String query = "SELECT idAuteur FROM auteurs WHERE nom = ?";
            try (PreparedStatement statement = con.prepareStatement(query)) {
                statement.setString(1, authorName);
                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        authorId = resultSet.getInt("idAuteur");
                    }
                }
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

        return authorId;
    }
    
    //to update book details
    public boolean updateBook(){
        boolean isUpdated = false;
        int bookID = Integer.parseInt(tfID.getText());
        String bookTitle = tfTitle.getText();
        String author = tfAuthor.getText();
        int authorID = getAuthorId(author);
        String ISBN = tfISBN.getText();
        String PublicationDate = tfDate.getText();
        int dispo = Integer.parseInt(tfAvailability.getText());
        int quantity = Integer.parseInt(tfQuantity.getText()); 
        
        try {
            java.sql.Connection con = DatabaseConnection.getConnection();
            String sql = "update livres set titre = ?,idauteur = ?,isbn = ?, datepublication = ?, disponibilite = ?, quantite = ? where idlivre = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, bookTitle);
            pst.setInt(2, authorID);
            pst.setString(3, ISBN);
            pst.setString(4, PublicationDate);
            pst.setInt(5, dispo);
            pst.setInt(6, quantity);
            pst.setInt(7, bookID);
            
            int rowCount = pst.executeUpdate();
            if (rowCount > 0) {
                isUpdated = true;
            }else{
                isUpdated = false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return isUpdated;
    }
    
    private void tfIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfIDFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_tfIDFocusLost

    private void tfDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDateActionPerformed

    private void tfQuantityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfQuantityFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_tfQuantityFocusLost

    private void tfQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfQuantityActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        this.setState(AdminLoginPage.ICONIFIED);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        // TODO add your handling code here:
        AdminHomePage homepage = new AdminHomePage();
        homepage.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel19MouseClicked

    private void Book_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Book_TableMouseClicked
        // TODO add your handling code here:
        int rowNo = Book_Table.getSelectedRow();
        TableModel model = Book_Table.getModel();
        
        tfID.setText(model.getValueAt(rowNo, 0).toString());
        tfTitle.setText(model.getValueAt(rowNo, 1).toString());
        tfAuthor.setText(model.getValueAt(rowNo, 2).toString());
        tfISBN.setText(model.getValueAt(rowNo, 3).toString());
        tfDate.setText(model.getValueAt(rowNo, 4).toString());
        tfAvailability.setText(model.getValueAt(rowNo, 5).toString());
        tfQuantity.setText(model.getValueAt(rowNo, 6).toString());
    }//GEN-LAST:event_Book_TableMouseClicked

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
        // TODO add your handling code here:
        if (updateBook() == true) {
            JOptionPane.showMessageDialog(this, "Book Updated");
            clearTable();
            setBookDetailsToTable();
        }else{
            JOptionPane.showMessageDialog(this, "Book Updation Failed", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_UpdateBtnActionPerformed

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        // TODO add your handling code here:
        if (addBook() == true) {
            JOptionPane.showMessageDialog(this, "Book Added");
            clearTable();
            setBookDetailsToTable();
        }else{
            JOptionPane.showMessageDialog(this, "Book Addition Failed", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_AddBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        // TODO add your handling code here:
        DeleteForm deleteform = new DeleteForm();
        deleteform.setVisible(true);
        clearTable();
        setBookDetailsToTable();
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_AddBtnMouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        // TODO add your handling code here:
        tfID.setText("");
        tfTitle.setText("");
        tfAuthor.setText("");
        tfISBN.setText("");
        tfDate.setText("");
        tfAvailability.setText("");
        tfQuantity.setText("");
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        // TODO add your handling code here:
        clearTable();
        setBookDetailsToTable();
    }//GEN-LAST:event_jLabel22MouseClicked

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
            java.util.logging.Logger.getLogger(BookManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.complementos.RSButtonHover AddBtn;
    private rojeru_san.complementos.RSTableMetro Book_Table;
    private rojeru_san.complementos.RSButtonHover DeleteBtn;
    private rojeru_san.complementos.RSButtonHover UpdateBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JScrollPane jScrollPane1;
    private app.bolivia.swing.JCTextField tfAuthor;
    private app.bolivia.swing.JCTextField tfAvailability;
    private app.bolivia.swing.JCTextField tfDate;
    private app.bolivia.swing.JCTextField tfID;
    private app.bolivia.swing.JCTextField tfISBN;
    private app.bolivia.swing.JCTextField tfQuantity;
    private app.bolivia.swing.JCTextField tfTitle;
    // End of variables declaration//GEN-END:variables
}
