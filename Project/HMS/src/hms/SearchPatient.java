package hms;
import connection.MysqlConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class SearchPatient extends javax.swing.JFrame {
    PreparedStatement pst=null;
    ResultSet rs=null;  
    int slno=0;
public void dbconnection() throws SQLException
 {
     MysqlConnection db = new MysqlConnection();
     Statement st = db.connection.createStatement();       
 }
    
    public SearchPatient() throws SQLException {
        initComponents();
        dbconnection();
        //show_user();
        fillcity();
        
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        txtname = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtopno = new javax.swing.JTextField();
        btnsearch = new javax.swing.JButton();
        btnnew = new javax.swing.JButton();
        btnbook = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1500, 1500));
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Search Patient", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Georgia", 0, 11))); // NOI18N
        jPanel2.setLayout(null);

        txtname.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        jPanel2.add(txtname);
        txtname.setBounds(570, 40, 240, 30);

        jLabel11.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel11.setText("OP Number");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(60, 40, 120, 30);

        jLabel3.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel3.setText("Name");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(460, 40, 120, 30);

        txtopno.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        txtopno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtopnoActionPerformed(evt);
            }
        });
        jPanel2.add(txtopno);
        txtopno.setBounds(190, 40, 240, 30);

        btnsearch.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        btnsearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/if_search_322497.png"))); // NOI18N
        btnsearch.setText("Search");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });
        jPanel2.add(btnsearch);
        btnsearch.setBounds(400, 90, 110, 30);

        btnnew.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        btnnew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/if_new10_216291.png"))); // NOI18N
        btnnew.setText("New");
        btnnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewActionPerformed(evt);
            }
        });
        jPanel2.add(btnnew);
        btnnew.setBounds(520, 90, 110, 30);

        btnbook.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        btnbook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/if_new10_216291.png"))); // NOI18N
        btnbook.setText("Booking");
        btnbook.setMaximumSize(new java.awt.Dimension(61, 25));
        btnbook.setMinimumSize(new java.awt.Dimension(61, 25));
        btnbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbookActionPerformed(evt);
            }
        });
        jPanel2.add(btnbook);
        btnbook.setBounds(640, 90, 110, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 60, 1350, 140);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Patient List", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        jPanel3.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sl.no", "OP Number", "Name", "gender", "Address", "City", "Phone Number", "Email", "Date"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(30, 40, 1150, 190);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 200, 1350, 240);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(null);

        jLabel14.setFont(new java.awt.Font("Plantagenet Cherokee", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("ACTYMED | SEARCH PATIENT");
        jPanel4.add(jLabel14);
        jLabel14.setBounds(110, 10, 650, 50);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 0, 1020, 60);

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/Actymed billing.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-10, -100, 1370, 960);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        

    }//GEN-LAST:event_txtnameActionPerformed
public void displaycity()
     {
       {
        try {
        MysqlConnection db = new MysqlConnection();
            Statement st = db.connection.createStatement();
        ResultSet rs=st.executeQuery("select o.op_id,o.op_name,o.op_gender,o.op_address,p.place_name,o.op_phone,o.op_email,o.op_date from hms_opregistration o\n" +
"inner join hms_place p on p.place_id=o.place_id");
        DefaultTableModel dtm=(DefaultTableModel) jTable1.getModel();
        while (rs.next())
        {
            //System.out.println(rs.getString("sta"));
            
            dtm.addRow(new Object[]{++slno,rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8)});
        }
        }
         catch (Exception ex) 
         {
           System.out.println(ex);
         }
    }  
     }
public void fillcity()
     {
                 try
         {
      

        MysqlConnection db = new MysqlConnection();
            Statement st = db.connection.createStatement();
        //String sel = "select * from hms_opregistration ";

ResultSet rs=st.executeQuery("select * from hms_place ");
        
            while (rs.next()) {
//               combocity.addItem(rs.getString("place_name"));

             
            }
        } catch (SQLException ex) {
            
            System.out.println(ex);
        } 
     }
    private void txtopnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtopnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtopnoActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        //jTable1.clearSelection();
        search();
        txtopno.setText("");
        txtname.setText("");
//        combocity.setSelectedItem("select");
    }//GEN-LAST:event_btnsearchActionPerformed

    private void btnnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewActionPerformed
       try
        {
        OpRegistration obj=new OpRegistration();
        obj.show();
        }
        catch(Exception e)
        {
            
        }
    }//GEN-LAST:event_btnnewActionPerformed

    private void btnbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbookActionPerformed
        try
        {
            OpBooking bo=new OpBooking();
            bo.show();

        }
        catch(Exception e)
        {

        }

    }//GEN-LAST:event_btnbookActionPerformed
     public void show_user()
    {
        try {
        MysqlConnection db = new MysqlConnection();
            Statement st = db.connection.createStatement();
        ResultSet rs=st.executeQuery("select o.op_id,o.op_name,o.op_gender,o.op_address,p.place_name,o.op_phone,o.op_email,o.op_date from hms_opregistration o\n" +
"inner join hms_place p on p.place_id=o.place_id");
        DefaultTableModel dtm=(DefaultTableModel) jTable1.getModel();
        while (rs.next())
        {
            //System.out.println(rs.getString("sta"));
            
            dtm.addRow(new Object[]{++slno,rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8)});
        }
        }
         catch (Exception ex) 
         {
           System.out.println(ex);
         }
    }
      public void search()
     {
        try
        {
        MysqlConnection db = new MysqlConnection();
        Statement st = db.connection.createStatement();
        ResultSet rs=st.executeQuery("select * from hms_opregistration o inner join hms_place p on p.place_id=o.place_id where op_id='"+txtopno.getText()+"'or op_name like '"+txtname.getText()+"'");
        DefaultTableModel dtm=(DefaultTableModel) jTable1.getModel();
        while (rs.next())
        {        
            dtm.addRow(new Object[]{++slno,rs.getInt("op_id"),rs.getString("op_name"),rs.getString("op_gender"),rs.getString("op_address"),rs.getString("place_name"),rs.getString("op_phone"),rs.getString("op_email"),rs.getString("op_date")});
        }
        }
         catch(Exception e)
         {
             System.out.println(e);
         }
     }
     

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(SearchPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new SearchPatient().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(SearchPatient.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbook;
    private javax.swing.JButton btnnew;
    private javax.swing.JButton btnsearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtopno;
    // End of variables declaration//GEN-END:variables
}
