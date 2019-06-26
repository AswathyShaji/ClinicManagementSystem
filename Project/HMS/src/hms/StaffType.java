package hms;
import connection.MysqlConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class StaffType extends javax.swing.JFrame {
    PreparedStatement pst=null;
    ResultSet rs=null;  
    int slno=0;
public void dbconnection() throws SQLException
    {
     MysqlConnection db = new MysqlConnection();
     Statement st = db.connection.createStatement();       
    }
   
    public StaffType() throws SQLException {
        initComponents();
        dbconnection();     
        lblstype.setVisible(false);
        show_user();
        DateFormat dateformat=new SimpleDateFormat("dd-MM-YYYY");
        java.util.Date date=new java.util.Date();
        String d=dateformat.format(date);
        lbldate.setText(d);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtstype = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtdescription = new javax.swing.JTextArea();
        lblstype = new javax.swing.JLabel();
        btnsave = new javax.swing.JButton();
        btncancel1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        lbldate = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1500, 1500));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Employee Designation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Georgia", 0, 11))); // NOI18N
        jPanel1.setLayout(null);

        jLabel11.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel11.setText("Description");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(30, 120, 120, 30);

        jLabel13.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel13.setText("Designation");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(30, 60, 120, 30);

        txtstype.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        txtstype.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtstypeFocusGained(evt);
            }
        });
        txtstype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstypeActionPerformed(evt);
            }
        });
        jPanel1.add(txtstype);
        txtstype.setBounds(160, 60, 240, 30);

        txtdescription.setColumns(20);
        txtdescription.setRows(5);
        jScrollPane1.setViewportView(txtdescription);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(160, 110, 240, 60);

        lblstype.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        lblstype.setForeground(new java.awt.Color(255, 0, 0));
        lblstype.setText("Enter Staff Type");
        jPanel1.add(lblstype);
        lblstype.setBounds(410, 60, 170, 30);

        btnsave.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        btnsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/if_3floppy_unmount_18268 (1).png"))); // NOI18N
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnsave);
        btnsave.setBounds(160, 190, 90, 30);

        btncancel1.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        btncancel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/if_cancel_326554.png"))); // NOI18N
        btncancel1.setText("Cancel");
        btncancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancel1ActionPerformed(evt);
            }
        });
        jPanel1.add(btncancel1);
        btncancel1.setBounds(270, 190, 110, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 90, 590, 260);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "View Designations", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Georgia", 0, 11))); // NOI18N
        jPanel2.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sl.no", "Designation ", "Description"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(70, 30, 490, 210);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(590, 90, 760, 260);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.setLayout(null);

        jLabel12.setFont(new java.awt.Font("Plantagenet Cherokee", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("ACTYMED | DESIGNATIONS");
        jPanel6.add(jLabel12);
        jLabel12.setBounds(140, 20, 590, 50);

        lbldate.setFont(new java.awt.Font("PMingLiU", 1, 14)); // NOI18N
        lbldate.setText("date");
        jPanel6.add(lbldate);
        lbldate.setBounds(790, 50, 200, 20);

        getContentPane().add(jPanel6);
        jPanel6.setBounds(0, 0, 1350, 90);

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/Actymed billing.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-10, -100, 1370, 960);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtstypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstypeActionPerformed

    private void txtstypeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtstypeFocusGained
       lblstype.setVisible(false);
    }//GEN-LAST:event_txtstypeFocusGained

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
            insert();
    }//GEN-LAST:event_btnsaveActionPerformed
    public void insert()
    {
                 try
       {
           int i=0,fl=0;
           String description=txtdescription.getText();
           String type=txtstype.getText();
           i=type.length();
           if(i==0)
           {
               lblstype.setVisible(true);
               fl=1;
           }
            MysqlConnection db = new MysqlConnection();
            Statement st = db.connection.createStatement();    
            String sel="select designation_type from hms_designation where designation_type='"+type+"'";
            ResultSet rs=st.executeQuery(sel);
            if(rs.next())
            {
                fl=1;
                JOptionPane.showMessageDialog(null,"Already Exist", "Error", JOptionPane.ERROR_MESSAGE);
            }
           if(fl==0)
            {
             PreparedStatement pst=db.connection.prepareStatement("insert into hms_designation(designation_type,Description)values(?,?)");
             pst.setString(1,type);
             pst.setString(2,description);
             pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"SAVED SUCCESSFULLY");
             txtstype.setText(null); 
            show_user();
           }  
       }
       catch(SQLException e)
       {
          System.out.print(e);
       } 
    }
    private void btncancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancel1ActionPerformed
         txtstype.setText(null); 
         lblstype.setVisible(false);
    }//GEN-LAST:event_btncancel1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

    }//GEN-LAST:event_jTable1MouseClicked
public void show_user()
    {
        try {
        DefaultTableModel dtm=(DefaultTableModel) jTable1.getModel();
                dtm.setRowCount(0);
                int SINO=0; 
                MysqlConnection db = new MysqlConnection();
                Statement st = db.connection.createStatement();
        ResultSet rs=st.executeQuery("select designation_type,Description from hms_designation");
        
        while (rs.next())
        {
            
            dtm.addRow(new Object[]{++SINO,rs.getString(1),rs.getString(2)});
        }
        }
         catch (Exception ex) 
         {
           System.out.println(ex);
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
            java.util.logging.Logger.getLogger(StaffType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StaffType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StaffType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StaffType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new StaffType().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(StaffType.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancel1;
    private javax.swing.JButton btnsave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbldate;
    private javax.swing.JLabel lblstype;
    private javax.swing.JTextArea txtdescription;
    private javax.swing.JTextField txtstype;
    // End of variables declaration//GEN-END:variables
}
