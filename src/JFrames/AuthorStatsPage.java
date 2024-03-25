package JFrames;

import biblio.DatabaseConnection;
import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;


public class AuthorStatsPage extends javax.swing.JFrame {
    
    private int AuthorId;

    
    public AuthorStatsPage(int AuthorId) {
        initComponents();
        showPieChartBooks();
        showPieChartMember();
        this.AuthorId = AuthorId;
    }
    
    public void showPieChartBooks() {

        DefaultPieDataset barDataset = new DefaultPieDataset();
        
        try {
            java.sql.Connection con = DatabaseConnection.getConnection();
            String sql = "select l.titre as title,count(*) as loan_count from emprunts e join livres l on(e.idlivre = l.idlivre) group by e.idlivre";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
              barDataset.setValue(rs.getString("title"), new Double(rs.getDouble("loan_count")));  
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        JFreeChart piechart = ChartFactory.createPieChart("Loaned Book Details", barDataset, true, true, false);

        PiePlot piePlot = (PiePlot) piechart.getPlot();

        piePlot.setBackgroundPaint(new Color(34,40,49));

        //create chartPanel to display chart(graph)
        ChartPanel barChartPanel = new ChartPanel(piechart);
        LoanedBooks.removeAll();
        LoanedBooks.add(barChartPanel, BorderLayout.CENTER);
        LoanedBooks.validate();
    }
    
    public void showPieChartMember() {

        //create dataset
        DefaultPieDataset barDataset = new DefaultPieDataset();
        
        try {
            java.sql.Connection con = DatabaseConnection.getConnection();
            String sql = "select a.username as Name,count(*) as loan_count from emprunts e join abonnés a on(e.idabonné = a.idabonné) group by e.idabonné";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
              barDataset.setValue(rs.getString("Name"), new Double(rs.getDouble("loan_count")));  
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        JFreeChart piechart = ChartFactory.createPieChart("Subsciber Loans Details", barDataset, true, true, false);

        PiePlot piePlot = (PiePlot) piechart.getPlot();

        piePlot.setBackgroundPaint(new Color(34,40,49));

        //create chartPanel to display chart(graph)
        ChartPanel barChartPanel = new ChartPanel(piechart);
        Subs.removeAll();
        Subs.add(barChartPanel, BorderLayout.CENTER);
        Subs.validate();
    }
    
    DefaultTableModel model;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        Subs = new javax.swing.JPanel();
        LoanedBooks = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(34, 40, 49));
        jPanel1.setName("Enter Return Date..."); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1730, 550));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(57, 62, 70));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel42.setBackground(new java.awt.Color(102, 102, 102));
        jLabel42.setFont(new java.awt.Font("Segoe Pro", 1, 48)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/monitor.png"))); // NOI18N
        jLabel42.setText("  Library Stats");
        jPanel5.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, 500, -1));

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
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1460, 0, 30, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/maximaze.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1490, 0, 30, 30));

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
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1510, 0, 40, 29));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/arrow.png"))); // NOI18N
        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1550, 180));
        jPanel1.add(Subs, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 260, 700, 440));
        jPanel1.add(LoanedBooks, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 700, 440));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1560, 830));

        setSize(new java.awt.Dimension(1550, 825));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
        this.setState(AdminLoginPage.ICONIFIED);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel5MouseClicked
    
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:

        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.revalidate(); 
       
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        // TODO add your handling code here:
        AuthorHomePage AuthorHomePage = new AuthorHomePage(AuthorId);
        AuthorHomePage.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel19MouseClicked

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
            java.util.logging.Logger.getLogger(AuthorStatsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AuthorStatsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AuthorStatsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AuthorStatsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LoanedBooks;
    private javax.swing.JPanel Subs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
