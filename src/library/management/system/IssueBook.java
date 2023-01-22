package library.management.system;

import DAO.DatabaseHelper;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;

public class IssueBook extends javax.swing.JFrame {

    Connection con = null;
    ResultSet rs = null;
    PreparedStatement ps = null;
    
    //create Issue Book Form Page
    public IssueBook() {
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
        BTITLE = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        BQUANTITY = new javax.swing.JLabel();
        BID = new javax.swing.JLabel();
        BAUTHOR = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        SNAME = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        SSEM = new javax.swing.JLabel();
        SID = new javax.swing.JLabel();
        SSCHOOL = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        SYEAR = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtbid = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtsid = new javax.swing.JTextField();
        Due_Date = new rojeru_san.componentes.RSDateChooser();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        Issue_Date = new rojeru_san.componentes.RSDateChooser();
        btnissue = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_main.setBackground(new java.awt.Color(255, 255, 255));
        panel_main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Book Details");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

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

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 360, 3));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Quantity : ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 130, 30));

        BTITLE.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        BTITLE.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(BTITLE, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 440, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Book Name :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 130, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Author :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 130, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Book ID :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 130, 30));

        BQUANTITY.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        BQUANTITY.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(BQUANTITY, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 510, 280, 30));

        BID.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        BID.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(BID, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 280, 30));

        BAUTHOR.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        BAUTHOR.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(BAUTHOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 280, 30));

        panel_main.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 830));

        jPanel3.setBackground(new java.awt.Color(0, 51, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 360, 3));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Semester : ");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 610, 130, 30));

        SNAME.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        SNAME.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(SNAME, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 440, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Student Name :");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 160, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("School :");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 130, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Student ID :");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 130, 30));

        SSEM.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        SSEM.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(SSEM, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 610, 250, 30));

        SID.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        SID.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(SID, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 280, 30));

        SSCHOOL.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        SSCHOOL.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(SSCHOOL, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 430, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Year : ");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 130, 30));

        SYEAR.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        SYEAR.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(SYEAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 510, 250, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Student Details");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, -1, -1));

        panel_main.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 490, 830));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 204));
        jLabel3.setText("ISSUE BOOK");
        panel_main.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 50, -1, -1));

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
        panel_main.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 280, 150, -1));

        txtbid.setBackground(new java.awt.Color(204, 204, 204));
        txtbid.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtbid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtbidFocusLost(evt);
            }
        });
        panel_main.add(txtbid, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 170, 270, 40));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel14.setText("Due Date :");
        panel_main.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 520, 150, -1));

        txtsid.setBackground(new java.awt.Color(204, 204, 204));
        txtsid.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        txtsid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtsidFocusLost(evt);
            }
        });
        panel_main.add(txtsid, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 270, 270, 40));

        Due_Date.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Due_Date.setPlaceholder("Select Due Date");
        panel_main.add(Due_Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 520, 270, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel15.setText("Book ID :");
        panel_main.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 180, 110, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel16.setText("Issue Date :");
        panel_main.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 420, 150, -1));

        Issue_Date.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Issue_Date.setPlaceholder("Select Issue Date");
        panel_main.add(Issue_Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 410, 270, -1));

        btnissue.setBackground(new java.awt.Color(204, 204, 255));
        btnissue.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnissue.setText("ISSUE DATE");
        btnissue.setActionCommand("ISSUE DATE");
        btnissue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnissueActionPerformed(evt);
            }
        });
        panel_main.add(btnissue, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 650, 180, 40));

        getContentPane().add(panel_main, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1520, 830));

        setSize(new java.awt.Dimension(1537, 835));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    //method to get book details
    public void getBookDetails(){
        
        int bookID = Integer.parseInt(txtbid.getText());
        
        String sql = "select * from book where B_ID=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, bookID);
            rs = ps.executeQuery();
            
            if (rs.next()) {
                String add1 = rs.getString("B_ID");
                BID.setText(add1);

                String add2 = rs.getString("B_NAME");
                BTITLE.setText(add2);

                String add3 = rs.getString("B_AUTHOR");
                BAUTHOR.setText(add3);

                String add4 = rs.getString("B_STOCK");
                BQUANTITY.setText(add4);

                rs.close();
                ps.close();
            } else {
                JOptionPane.showMessageDialog(null, "Book is not found");
            }
        } catch (HeadlessException | SQLException e) {
        }
    }
    
    //method to get student details
    public void getStudentDetails(){
        
        int studentID = Integer.parseInt(txtsid.getText());
        
        String sql = "select * from student where  S_ID=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, studentID);
            rs = ps.executeQuery();
            
            if (rs.next()) {
                String add1 = rs.getString("S_ID");
                SID.setText(add1);

                String add2 = rs.getString("S_NAME");
                SNAME.setText(add2);

                String add3 = rs.getString("S_SCHOOL");
                SSCHOOL.setText(add3);

                String add4 = rs.getString("S_YEAR");
                SYEAR.setText(add4);
                
                String add5 = rs.getString("S_SEM");
                SSEM.setText(add5);

                rs.close();
                ps.close();
            } else {
                JOptionPane.showMessageDialog(null, "Student is not found");
            }
        } catch (HeadlessException | SQLException e) {
        }
    }
    
    //insert issue book details
    public boolean issuebook(){
        
        boolean isIssued = false;
        int studentID = Integer.parseInt(txtsid.getText());
        int bookID = Integer.parseInt(txtbid.getText());
        String bookName = BTITLE.getText();
        String studentName = SNAME.getText();
        
        Date issueDate = Issue_Date.getDatoFecha();
        Date dueDate = Due_Date.getDatoFecha();
        
        Long A = issueDate.getTime();
        Long B = dueDate.getTime();
        
        java.sql.Date sissueDate = new java.sql.Date(A);
        java.sql.Date sdueDate = new java.sql.Date(B);
        
        String sql = "insert into issuebook(B_ID, B_NAME, S_ID, S_NAME, ISSUE_DATE, DUE_DATE, STATUS)"
                        + "values(?,?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, bookID);
            ps.setString(2, bookName);
            ps.setInt(3, studentID);
            ps.setString(4, studentName);
            ps.setDate(5, sissueDate);
            ps.setDate(6, sdueDate);
            ps.setString(7, "PENDING");
            
            int rowCount = ps.executeUpdate();
            isIssued = rowCount > 0;
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        return isIssued;
    }
    
    public void updateBookCount(){
        
        int bookID = Integer.parseInt(txtbid.getText());
        
        String sql = "update book set B_STOCK = B_STOCK - 1 where B_ID = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, bookID);
            
            int rowCount = ps.executeUpdate();
                if (rowCount > 0){
                    JOptionPane.showMessageDialog(null, "Book Count Updated Successfully");
                    int initialCount = Integer.parseInt(BQUANTITY.getText());
                    BQUANTITY.setText(Integer.toString(initialCount - 1));
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

    private void btnissueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnissueActionPerformed
        if (issuebook() == true){
            JOptionPane.showMessageDialog(null, "Book Issued Successfully");
            updateBookCount();
        } else {
            JOptionPane.showMessageDialog(null, "Book Issue Failed");
        }
    }//GEN-LAST:event_btnissueActionPerformed

    private void txtbidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtbidFocusLost
        getBookDetails();
    }//GEN-LAST:event_txtbidFocusLost

    private void txtsidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtsidFocusLost
        getStudentDetails();
    }//GEN-LAST:event_txtsidFocusLost

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
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new IssueBook().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BAUTHOR;
    private javax.swing.JLabel BID;
    private javax.swing.JLabel BQUANTITY;
    private javax.swing.JLabel BTITLE;
    private rojeru_san.componentes.RSDateChooser Due_Date;
    private rojeru_san.componentes.RSDateChooser Issue_Date;
    private javax.swing.JLabel SID;
    private javax.swing.JLabel SNAME;
    private javax.swing.JLabel SSCHOOL;
    private javax.swing.JLabel SSEM;
    private javax.swing.JLabel SYEAR;
    private javax.swing.JButton btnissue;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel panel_main;
    private javax.swing.JTextField txtbid;
    private javax.swing.JTextField txtsid;
    // End of variables declaration//GEN-END:variables
}
