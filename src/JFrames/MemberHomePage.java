package JFrames;

import biblio.DatabaseConnection;
import com.mysql.cj.xdevapi.Statement;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class MemberHomePage extends javax.swing.JFrame {
    
    Color mouseEnterColor = new Color(57,62,70);
    Color mouseExitColor = new Color(34,40,49);
    DefaultTableModel model;
    
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
    
    public MemberHomePage(int memberId) {
        initComponents();
        this.memberId = memberId;
        Name.setText(getMemberName());
        setDataToCard(memberId);
    }
    
    String Email, Username, Contact;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        Name = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        panel1 = new java.awt.Panel();
        jLabel8 = new javax.swing.JLabel();
        panel2 = new java.awt.Panel();
        jLabel9 = new javax.swing.JLabel();
        panel3 = new java.awt.Panel();
        jLabel10 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        panel5 = new java.awt.Panel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        Num_Loans = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();

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
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 220, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/dashboard (1).png"))); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 440, 80));

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

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 450, -1));

        Name.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        Name.setForeground(new java.awt.Color(255, 211, 105));
        Name.setText("Name");
        jPanel1.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 140, 50));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Account_icon.png"))); // NOI18N
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/gear.png"))); // NOI18N
        jLabel30.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel30MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        panel1.setBackground(new java.awt.Color(34, 40, 49));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 211, 105));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/issue_book.png"))); // NOI18N
        jLabel8.setText("   Loan Book");
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
        panel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 370, -1));

        jPanel1.add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 440, 70));

        panel2.setBackground(new java.awt.Color(34, 40, 49));
        panel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel2MouseClicked(evt);
            }
        });
        panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 211, 105));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/parchment.png"))); // NOI18N
        jLabel9.setText("  See Loan History");
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

        jPanel1.add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 590, 440, 70));

        panel3.setBackground(new java.awt.Color(57, 62, 70));
        panel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel3MouseClicked(evt);
            }
        });
        panel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Log Out");
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
        panel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 110, 40));

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/switch.png"))); // NOI18N
        jLabel38.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel38MouseClicked(evt);
            }
        });
        panel3.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        jPanel1.add(panel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 740, 440, 90));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Welcome,");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 140, 50));

        panel5.setBackground(new java.awt.Color(34, 40, 49));
        panel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel5MouseClicked(evt);
            }
        });
        panel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
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

        jPanel1.add(panel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 440, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/alarm.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 830));

        jPanel2.setBackground(new java.awt.Color(238, 238, 238));
        jPanel2.setPreferredSize(new java.awt.Dimension(1370, 1010));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(34, 40, 49));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 20, 1050));

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
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 0, 40, 29));

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
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 0, 30, 30));

        jPanel5.setBackground(new java.awt.Color(34, 40, 49));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel42.setBackground(new java.awt.Color(102, 102, 102));
        jLabel42.setFont(new java.awt.Font("Segoe Pro", 2, 36)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("Library Book");
        jPanel5.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 210, -1));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 360, 70));

        jPanel7.setBackground(new java.awt.Color(34, 40, 49));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BooksCover/wuthering heights.jpg"))); // NOI18N
        jPanel7.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 300, -1, 240));

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BooksCover/TheGreatGatsby.jpg"))); // NOI18N
        jPanel7.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, -1));

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BooksCover/1984.jpg"))); // NOI18N
        jPanel7.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, -1, -1));

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BooksCover/LordOfTheRings.jpg"))); // NOI18N
        jPanel7.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 30, 150, -1));

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BooksCover/HarryPotter.jpg"))); // NOI18N
        jPanel7.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, -1));

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BooksCover/ToKillAMokinbird.jpg"))); // NOI18N
        jPanel7.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, 240));

        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BooksCover/Frankenstein.jpg"))); // NOI18N
        jPanel7.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, 240));

        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BooksCover/peace and war.jpg"))); // NOI18N
        jPanel7.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, -1, 240));

        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BooksCover/Don-Quixote-COVER.jpg"))); // NOI18N
        jPanel7.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, -1, 240));

        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BooksCover/Lolita.jpg"))); // NOI18N
        jPanel7.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, -1, 240));

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 850, 560));

        jPanel8.setBackground(new java.awt.Color(57, 62, 70));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Most Popular Books :");
        jLabel17.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 0, new java.awt.Color(255, 255, 255)));
        jPanel8.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 300, -1));

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 850, 70));

        jPanel21.setBackground(new java.awt.Color(57, 62, 70));
        jPanel21.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 0, 15, 0, new java.awt.Color(255, 211, 105)));
        jPanel21.setPreferredSize(new java.awt.Dimension(260, 1));
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Num_Loans.setBackground(new java.awt.Color(102, 102, 102));
        Num_Loans.setFont(new java.awt.Font("Segoe Pro Black", 0, 50)); // NOI18N
        Num_Loans.setForeground(new java.awt.Color(255, 255, 255));
        Num_Loans.setText("10");
        jPanel21.add(Num_Loans, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 71, -1));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/bookshelf.png"))); // NOI18N
        jPanel21.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel40.setBackground(new java.awt.Color(102, 102, 102));
        jLabel40.setFont(new java.awt.Font("Segoe Pro", 2, 20)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Total Loans");
        jLabel40.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jPanel21.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 110, -1));

        jPanel2.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 150, 130));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 1110, 830));

        setSize(new java.awt.Dimension(1550, 825));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void setDataToCard(int memberId) {
        java.sql.Statement st = null;
        ResultSet rs = null;
        Connection con = null;

        try {
            con = DatabaseConnection.getConnection();
            st = con.createStatement();
            String sql = "SELECT COUNT(*) AS numLoans FROM emprunts WHERE idabonné = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, memberId);
            rs = pst.executeQuery();
            if (rs.next()) {
                Num_Loans.setText(Integer.toString(rs.getInt("numLoans")));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (st != null) {
                    st.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
}

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
        this.setState(AdminLoginPage.ICONIFIED);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel38MouseClicked
        // TODO add your handling code here:
        MemberLoginPage memberloginpage = new MemberLoginPage();
        memberloginpage.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel38MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        MemberLoanBookPage memberloanbookpage = new MemberLoanBookPage(memberId);
        memberloanbookpage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        MemberHistoryLoanBookPage memberhistoryloanbookpage = new MemberHistoryLoanBookPage(memberId);
        memberhistoryloanbookpage.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseClicked

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

    private void panel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel3MouseClicked
        // TODO add your handling code here:
        MemberLoginPage memberloginpage = new MemberLoginPage();
        memberloginpage.setVisible(true);
        dispose();
    }//GEN-LAST:event_panel3MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        MemberReturnLoanBookPage memberreturnloanbookpage = new MemberReturnLoanBookPage(memberId);
        memberreturnloanbookpage.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseEntered
        // TODO add your handling code here:
        panel5.setBackground(mouseEnterColor);
    }//GEN-LAST:event_jLabel12MouseEntered

    private void jLabel12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseExited
        // TODO add your handling code here:
        panel5.setBackground(mouseExitColor);
    }//GEN-LAST:event_jLabel12MouseExited

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        MemberOverDueLoans memberoverdueloans = new MemberOverDueLoans(memberId);
        memberoverdueloans.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void panel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_panel2MouseClicked

    private void panel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_panel5MouseClicked

    private void jLabel30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseClicked
        // TODO add your handling code here:
        MemberSettingsPage membersettingspage = new MemberSettingsPage(memberId);
        membersettingspage.setVisible(true);
    }//GEN-LAST:event_jLabel30MouseClicked

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
            java.util.logging.Logger.getLogger(MemberHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MemberHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MemberHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MemberHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JLabel Name;
    private javax.swing.JLabel Num_Loans;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private java.awt.Panel panel3;
    private java.awt.Panel panel5;
    // End of variables declaration//GEN-END:variables

}
