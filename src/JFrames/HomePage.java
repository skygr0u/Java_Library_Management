package JFrames;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class HomePage extends javax.swing.JFrame {
    
    Color mouseEnterColor = new Color(57,62,70);
    Color mouseExitColor = new Color(34,40,49);
    DefaultTableModel model;
    
    public HomePage() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        panel1 = new java.awt.Panel();
        jLabel8 = new javax.swing.JLabel();
        panel2 = new java.awt.Panel();
        jLabel9 = new javax.swing.JLabel();
        panel3 = new java.awt.Panel();
        jLabel10 = new javax.swing.JLabel();
        panel4 = new java.awt.Panel();
        jLabel11 = new javax.swing.JLabel();
        panel5 = new java.awt.Panel();
        jLabel12 = new javax.swing.JLabel();
        panel6 = new java.awt.Panel();
        jLabel13 = new javax.swing.JLabel();
        panel7 = new java.awt.Panel();
        jLabel14 = new javax.swing.JLabel();
        panel8 = new java.awt.Panel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        lbl_nofOfBooks = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        lbl_nofOfBooks2 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        lbl_nofOfBooks3 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        lbl_nofOfBooks4 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        lbl_nofOfBooks5 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        lbl_nofOfBooks6 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        rSTableMetro1 = new rojeru_san.complementos.RSTableMetro();
        jScrollPane2 = new javax.swing.JScrollPane();
        rSTableMetro2 = new rojeru_san.complementos.RSTableMetro();
        jScrollPane3 = new javax.swing.JScrollPane();
        rSTableMetro3 = new rojeru_san.complementos.RSTableMetro();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(34, 40, 49));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 900));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(57, 62, 70));
        jPanel3.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Dashboard");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 220, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/dashboard (1).png"))); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 440, 60));

        jPanel6.setBackground(new java.awt.Color(238, 238, 238));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 450, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Welcome, Admin");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 240, 50));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Account_icon.png"))); // NOI18N
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/gear.png"))); // NOI18N
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/active.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, -1, -1));

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/switch.png"))); // NOI18N
        jLabel38.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel38MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        panel1.setBackground(new java.awt.Color(34, 40, 49));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 211, 105));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/manager.png"))); // NOI18N
        jLabel8.setText("  Manage Subscribers");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
        });
        panel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 370, -1));

        jPanel1.add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 440, 80));

        panel2.setBackground(new java.awt.Color(34, 40, 49));
        panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 211, 105));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Author.png"))); // NOI18N
        jLabel9.setText("  Manage Authors");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel9MouseExited(evt);
            }
        });
        panel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 370, -1));

        jPanel1.add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 440, 70));

        panel3.setBackground(new java.awt.Color(34, 40, 49));
        panel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 211, 105));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/book.png"))); // NOI18N
        jLabel10.setText("  Manage Books");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel10MouseExited(evt);
            }
        });
        panel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 370, -1));

        jPanel1.add(panel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 440, 70));

        panel4.setBackground(new java.awt.Color(34, 40, 49));
        panel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 211, 105));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/issue_book.png"))); // NOI18N
        jLabel11.setText("  Loan a Book");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel11MouseExited(evt);
            }
        });
        panel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 370, -1));

        jPanel1.add(panel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 440, 70));

        panel5.setBackground(new java.awt.Color(34, 40, 49));
        panel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 211, 105));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/return.png"))); // NOI18N
        jLabel12.setText("  Return Book");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel12MouseExited(evt);
            }
        });
        panel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 370, -1));

        jPanel1.add(panel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 660, 440, 70));

        panel6.setBackground(new java.awt.Color(34, 40, 49));
        panel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 211, 105));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/records.png"))); // NOI18N
        jLabel13.setText("  View Records");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel13MouseExited(evt);
            }
        });
        panel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 370, -1));

        jPanel1.add(panel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 740, 440, 70));

        panel7.setBackground(new java.awt.Color(34, 40, 49));
        panel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 211, 105));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/research-center.png"))); // NOI18N
        jLabel14.setText("  View Loaned Books");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel14MouseExited(evt);
            }
        });
        panel7.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 370, -1));

        jPanel1.add(panel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 820, 440, 70));

        panel8.setBackground(new java.awt.Color(34, 40, 49));
        panel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 211, 105));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/check-list.png"))); // NOI18N
        jLabel7.setText("  Library Status");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });
        panel8.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 370, -1));

        jPanel1.add(panel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 900, 440, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 1000));

        jPanel2.setBackground(new java.awt.Color(238, 238, 238));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(34, 40, 49));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 20, 1010));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("X");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 0, 40, 29));

        jLabel15.setBackground(new java.awt.Color(238, 238, 238));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 55)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("-");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, -10, 30, 50));

        jPanel15.setBackground(new java.awt.Color(57, 62, 70));
        jPanel15.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 0, 15, 0, new java.awt.Color(0, 173, 181)));
        jPanel15.setPreferredSize(new java.awt.Dimension(260, 1));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_nofOfBooks.setBackground(new java.awt.Color(102, 102, 102));
        lbl_nofOfBooks.setFont(new java.awt.Font("Segoe Pro Black", 0, 50)); // NOI18N
        lbl_nofOfBooks.setForeground(new java.awt.Color(255, 255, 255));
        lbl_nofOfBooks.setText("10");
        jPanel15.add(lbl_nofOfBooks, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 71, -1));

        jLabel24.setBackground(new java.awt.Color(102, 102, 102));
        jLabel24.setFont(new java.awt.Font("Segoe Pro", 2, 20)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Subscribers");
        jPanel15.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/follow.png"))); // NOI18N
        jPanel15.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/points.png"))); // NOI18N
        jPanel15.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        jLabel41.setBackground(new java.awt.Color(102, 102, 102));
        jLabel41.setFont(new java.awt.Font("Segoe Pro", 2, 20)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("Number Of ");
        jPanel15.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jPanel2.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 210, 210));

        jPanel19.setBackground(new java.awt.Color(57, 62, 70));
        jPanel19.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 0, 15, 0, new java.awt.Color(255, 211, 105)));
        jPanel19.setPreferredSize(new java.awt.Dimension(260, 1));
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_nofOfBooks2.setBackground(new java.awt.Color(102, 102, 102));
        lbl_nofOfBooks2.setFont(new java.awt.Font("Segoe Pro Black", 0, 50)); // NOI18N
        lbl_nofOfBooks2.setForeground(new java.awt.Color(255, 255, 255));
        lbl_nofOfBooks2.setText("10");
        jPanel19.add(lbl_nofOfBooks2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 71, -1));

        jLabel26.setBackground(new java.awt.Color(102, 102, 102));
        jLabel26.setFont(new java.awt.Font("Segoe Pro", 2, 20)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Number Of Authors");
        jPanel19.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 180, -1));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/writer.png"))); // NOI18N
        jPanel19.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/points.png"))); // NOI18N
        jPanel19.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        jPanel20.setBackground(new java.awt.Color(57, 62, 70));
        jPanel20.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 0, 15, 0, new java.awt.Color(255, 211, 105)));
        jPanel20.setPreferredSize(new java.awt.Dimension(260, 1));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_nofOfBooks3.setBackground(new java.awt.Color(102, 102, 102));
        lbl_nofOfBooks3.setFont(new java.awt.Font("Segoe Pro Black", 0, 50)); // NOI18N
        lbl_nofOfBooks3.setForeground(new java.awt.Color(255, 255, 255));
        lbl_nofOfBooks3.setText("10");
        jPanel20.add(lbl_nofOfBooks3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 71, -1));

        jLabel27.setBackground(new java.awt.Color(102, 102, 102));
        jLabel27.setFont(new java.awt.Font("Segoe Pro", 2, 20)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Number Of Books");
        jPanel20.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 170, -1));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/bookshelf.png"))); // NOI18N
        jPanel20.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/downward-arrow.png"))); // NOI18N
        jPanel20.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        jPanel19.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 550, 210, 210));

        jPanel2.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 210, 210));

        jPanel21.setBackground(new java.awt.Color(57, 62, 70));
        jPanel21.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 0, 15, 0, new java.awt.Color(255, 211, 105)));
        jPanel21.setPreferredSize(new java.awt.Dimension(260, 1));
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_nofOfBooks4.setBackground(new java.awt.Color(102, 102, 102));
        lbl_nofOfBooks4.setFont(new java.awt.Font("Segoe Pro Black", 0, 50)); // NOI18N
        lbl_nofOfBooks4.setForeground(new java.awt.Color(255, 255, 255));
        lbl_nofOfBooks4.setText("10");
        jPanel21.add(lbl_nofOfBooks4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 71, -1));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/bookshelf.png"))); // NOI18N
        jPanel21.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/points.png"))); // NOI18N
        jPanel21.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        jLabel40.setBackground(new java.awt.Color(102, 102, 102));
        jLabel40.setFont(new java.awt.Font("Segoe Pro", 2, 20)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Number Of Books");
        jPanel21.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 170, -1));

        jPanel2.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 210, 210));

        jPanel22.setBackground(new java.awt.Color(57, 62, 70));
        jPanel22.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 0, 15, 0, new java.awt.Color(0, 173, 181)));
        jPanel22.setPreferredSize(new java.awt.Dimension(260, 1));
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_nofOfBooks5.setBackground(new java.awt.Color(102, 102, 102));
        lbl_nofOfBooks5.setFont(new java.awt.Font("Segoe Pro Black", 0, 50)); // NOI18N
        lbl_nofOfBooks5.setForeground(new java.awt.Color(255, 255, 255));
        lbl_nofOfBooks5.setText("10");
        jPanel22.add(lbl_nofOfBooks5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 71, -1));

        jLabel33.setBackground(new java.awt.Color(102, 102, 102));
        jLabel33.setFont(new java.awt.Font("Segoe Pro", 2, 20)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Number Of ");
        jPanel22.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 110, -1));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/hand-over.png"))); // NOI18N
        jPanel22.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/points.png"))); // NOI18N
        jPanel22.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        jPanel23.setBackground(new java.awt.Color(57, 62, 70));
        jPanel23.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 0, 15, 0, new java.awt.Color(255, 211, 105)));
        jPanel23.setPreferredSize(new java.awt.Dimension(260, 1));
        jPanel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_nofOfBooks6.setBackground(new java.awt.Color(102, 102, 102));
        lbl_nofOfBooks6.setFont(new java.awt.Font("Segoe Pro Black", 0, 50)); // NOI18N
        lbl_nofOfBooks6.setForeground(new java.awt.Color(255, 255, 255));
        lbl_nofOfBooks6.setText("10");
        jPanel23.add(lbl_nofOfBooks6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 71, -1));

        jLabel35.setBackground(new java.awt.Color(102, 102, 102));
        jLabel35.setFont(new java.awt.Font("Segoe Pro", 2, 20)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Number Of Books");
        jPanel23.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 170, -1));

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/bookshelf.png"))); // NOI18N
        jPanel23.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/downward-arrow.png"))); // NOI18N
        jPanel23.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        jPanel22.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 550, 210, 210));

        jLabel39.setBackground(new java.awt.Color(102, 102, 102));
        jLabel39.setFont(new java.awt.Font("Segoe Pro", 2, 20)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("loaned books");
        jPanel22.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        jPanel2.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 750, 210, 210));

        jPanel5.setBackground(new java.awt.Color(34, 40, 49));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel42.setBackground(new java.awt.Color(102, 102, 102));
        jLabel42.setFont(new java.awt.Font("Segoe Pro", 2, 36)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("OverView");
        jPanel5.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 170, -1));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 360, 50));

        rSTableMetro1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Last Name", "First Name", "Email"
            }
        ));
        rSTableMetro1.setColorBackgoundHead(new java.awt.Color(57, 62, 70));
        rSTableMetro1.setRowHeight(40);
        jScrollPane1.setViewportView(rSTableMetro1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 730, 830, 220));

        rSTableMetro2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Email Adresse", "Contact"
            }
        ));
        rSTableMetro2.setColorBackgoundHead(new java.awt.Color(57, 62, 70));
        rSTableMetro2.setRowHeight(40);
        jScrollPane2.setViewportView(rSTableMetro2);
        if (rSTableMetro2.getColumnModel().getColumnCount() > 0) {
            rSTableMetro2.getColumnModel().getColumn(1).setResizable(false);
        }

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 830, 220));

        rSTableMetro3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title", "ISBN", "Publication Date", "Availability"
            }
        ));
        rSTableMetro3.setColorBackgoundHead(new java.awt.Color(57, 62, 70));
        rSTableMetro3.setRowHeight(40);
        jScrollPane3.setViewportView(rSTableMetro3);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 440, 830, 220));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(34, 40, 49));
        jLabel17.setText("Authors's Details :");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 680, 340, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(34, 40, 49));
        jLabel18.setText("Subscriber's Details :");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 340, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(34, 40, 49));
        jLabel20.setText("Book Details :");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, 340, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 1300, 1000));

        setSize(new java.awt.Dimension(1730, 1000));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
        this.setState(LoginPage.ICONIFIED);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel38MouseClicked
        // TODO add your handling code here:
        LoginPage loginpage = new LoginPage();
        loginpage.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel38MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        BookManager addbooks = new BookManager();
        addbooks.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
        // TODO add your handling code here:
        panel1.setBackground(mouseEnterColor);
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
        // TODO add your handling code here:
        panel1.setBackground(mouseExitColor);
    }//GEN-LAST:event_jLabel8MouseExited

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered
        // TODO add your handling code here:
        panel2.setBackground(mouseEnterColor);
    }//GEN-LAST:event_jLabel9MouseEntered

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
        // TODO add your handling code here:
        panel2.setBackground(mouseExitColor);
    }//GEN-LAST:event_jLabel9MouseExited

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered
        // TODO add your handling code here:
        panel3.setBackground(mouseEnterColor);
    }//GEN-LAST:event_jLabel10MouseEntered

    private void jLabel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseExited
        // TODO add your handling code here:
        panel3.setBackground(mouseExitColor);
    }//GEN-LAST:event_jLabel10MouseExited

    private void jLabel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseEntered
        // TODO add your handling code here:
        panel4.setBackground(mouseEnterColor);
    }//GEN-LAST:event_jLabel11MouseEntered

    private void jLabel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseExited
        // TODO add your handling code here:
        panel4.setBackground(mouseExitColor);
    }//GEN-LAST:event_jLabel11MouseExited

    private void jLabel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseEntered
        // TODO add your handling code here:
        panel5.setBackground(mouseEnterColor);
    }//GEN-LAST:event_jLabel12MouseEntered

    private void jLabel12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseExited
        // TODO add your handling code here:
        panel5.setBackground(mouseExitColor);
    }//GEN-LAST:event_jLabel12MouseExited

    private void jLabel13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseEntered
        // TODO add your handling code here:
        panel6.setBackground(mouseEnterColor);
    }//GEN-LAST:event_jLabel13MouseEntered

    private void jLabel13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseExited
        // TODO add your handling code here:
        panel6.setBackground(mouseExitColor);
    }//GEN-LAST:event_jLabel13MouseExited

    private void jLabel14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseEntered
        // TODO add your handling code here:
        panel7.setBackground(mouseEnterColor);
    }//GEN-LAST:event_jLabel14MouseEntered

    private void jLabel14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseExited
        // TODO add your handling code here:
        panel7.setBackground(mouseExitColor);
    }//GEN-LAST:event_jLabel14MouseExited

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        // TODO add your handling code here:
        panel8.setBackground(mouseEnterColor);
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        // TODO add your handling code here:
        panel8.setBackground(mouseExitColor);
    }//GEN-LAST:event_jLabel7MouseExited

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbl_nofOfBooks;
    private javax.swing.JLabel lbl_nofOfBooks2;
    private javax.swing.JLabel lbl_nofOfBooks3;
    private javax.swing.JLabel lbl_nofOfBooks4;
    private javax.swing.JLabel lbl_nofOfBooks5;
    private javax.swing.JLabel lbl_nofOfBooks6;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private java.awt.Panel panel3;
    private java.awt.Panel panel4;
    private java.awt.Panel panel5;
    private java.awt.Panel panel6;
    private java.awt.Panel panel7;
    private java.awt.Panel panel8;
    private rojeru_san.complementos.RSTableMetro rSTableMetro1;
    private rojeru_san.complementos.RSTableMetro rSTableMetro2;
    private rojeru_san.complementos.RSTableMetro rSTableMetro3;
    // End of variables declaration//GEN-END:variables

}
