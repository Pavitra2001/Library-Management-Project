package library.management.system;

import DAO.DatabaseHelper;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ReturnBook extends javax.swing.JFrame {

    Connection con = null;
    ResultSet rs = null;
    PreparedStatement ps = null;
    
    //create Issue Book Form Page
    public ReturnBook() {
        initComponents();
        con = DatabaseHelper.getConnection();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_main = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        SNAME = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        DUEDATE = new javax.swing.JLabel();
        ISSUEID = new javax.swing.JLabel();
        BNAME = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ISDATE = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtbid = new javax.swing.JTextField();
        txtsid = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        btnsearch = new javax.swing.JButton();
        btnreturn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_main.setBackground(new java.awt.Color(255, 255, 255));
        panel_main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Issued Book Details");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 360, 3));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Due Date :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 130, 30));

        SNAME.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        SNAME.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(SNAME, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 390, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Book Name :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 130, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Student Name :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 180, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Issued ID :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 130, 30));

        DUEDATE.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        DUEDATE.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(DUEDATE, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 580, 240, 30));

        ISSUEID.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        ISSUEID.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(ISSUEID, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 180, 30));

        BNAME.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        BNAME.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(BNAME, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 390, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Issue Date :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 130, 30));

        ISDATE.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        ISDATE.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(ISDATE, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 510, 240, 30));

        panel_main.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 440, 830));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 204));
        jLabel3.setText("RETURN BOOK");
        panel_main.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 90, -1, -1));

        jButton4.setBackground(new java.awt.Color(204, 204, 255));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setText("BACK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        panel_main.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 10, 90, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel13.setText("Student ID :");
        panel_main.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 290, 150, -1));

        txtbid.setBackground(new java.awt.Color(204, 204, 204));
        txtbid.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtbid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtbidFocusLost(evt);
            }
        });
        panel_main.add(txtbid, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 180, 250, 40));

        txtsid.setBackground(new java.awt.Color(204, 204, 204));
        txtsid.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        txtsid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtsidFocusLost(evt);
            }
        });
        panel_main.add(txtsid, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 280, 250, 40));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel15.setText("Book ID :");
        panel_main.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 190, 110, -1));

        btnsearch.setBackground(new java.awt.Color(255, 204, 0));
        btnsearch.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnsearch.setText("SEARCH");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });
        panel_main.add(btnsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(1370, 380, 120, 40));

        btnreturn.setBackground(new java.awt.Color(204, 204, 255));
        btnreturn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnreturn.setText("RETURN BOOK");
        btnreturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreturnActionPerformed(evt);
            }
        });
        panel_main.add(btnreturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 480, 220, 50));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sign_UP.png"))); // NOI18N
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 500, 370));

        panel_main.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 830));

        getContentPane().add(panel_main, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1520, 830));

        setSize(new java.awt.Dimension(1537, 835));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    //method to get loan details
    public void getissueBookDetails(){
        
        int bookID = Integer.parseInt(txtbid.getText());
        int studentID = Integer.parseInt(txtsid.getText());
        
        String sql = "select * from issuebook where B_ID=? and S_ID=? and STATUS = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, bookID);
            ps.setInt(2, studentID);
            ps.setString(3, "PENDING");
            rs = ps.executeQuery();
            
            if (rs.next()) {
                String add1 = rs.getString("ISSUEBOOK_ID");
                ISSUEID.setText(add1);

                String add2 = rs.getString("B_NAME");
                BNAME.setText(add2);

                String add3 = rs.getString("S_NAME");
                SNAME.setText(add3);
                
                String add4 = rs.getString("ISSUE_DATE");
                ISDATE.setText(add4);

                String add5 = rs.getString("DUE_DATE");
                DUEDATE.setText(add5);
                
            } else {
                JOptionPane.showMessageDialog(null, "No Record Found");
                ISSUEID.setText("");
                BNAME.setText("");
                SNAME.setText("");
                ISDATE.setText("");
                DUEDATE.setText("");
            }
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
        //return book
    public boolean returnbook(){
        boolean isReturn = false;
        
        String sql = "update issuebook set STATUS = ? where ISSUEBOOK_ID = ? and B_ID = ? and S_ID = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, "COMPLETED");
            ps.setString(2, ISSUEID.getText());
            ps.setString(3, txtbid.getText());
            ps.setString(4, txtsid.getText());
            rs = ps.executeQuery();
            
            int rowCount = ps.executeUpdate();
            if (rowCount >= 0){
                isReturn = true;
            }else{
                isReturn = false;
            }
        } 
        catch (HeadlessException | SQLException e) {
        }
        return isReturn;
    }
    
    public void updateBookCount(){
        
        int bookID = Integer.parseInt(txtbid.getText());
        
        String sql = "update book set B_STOCK = B_STOCK + 1 where B_ID = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, bookID);
            
            int rowCount = ps.executeUpdate();
                if (rowCount > 0){
                    JOptionPane.showMessageDialog(null, "Book Count Updated Successfully");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Book Count Failed to Update");
                }
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        Dashboard home = new Dashboard();
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        getissueBookDetails();
    }//GEN-LAST:event_btnsearchActionPerformed

    private void txtbidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtbidFocusLost

    }//GEN-LAST:event_txtbidFocusLost

    private void txtsidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtsidFocusLost

    }//GEN-LAST:event_txtsidFocusLost

    private void btnreturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreturnActionPerformed
        if (returnbook() == true){
            JOptionPane.showMessageDialog(null, "Book Returned Successfully");
            updateBookCount();
        } else {
            JOptionPane.showMessageDialog(null, "Book Return Failed");
        }
    }//GEN-LAST:event_btnreturnActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ReturnBook().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BNAME;
    private javax.swing.JLabel DUEDATE;
    private javax.swing.JLabel ISDATE;
    private javax.swing.JLabel ISSUEID;
    private javax.swing.JLabel SNAME;
    private javax.swing.JButton btnreturn;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel panel_main;
    private javax.swing.JTextField txtbid;
    private javax.swing.JTextField txtsid;
    // End of variables declaration//GEN-END:variables
}
