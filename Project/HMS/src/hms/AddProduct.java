package hms;
import connection.MysqlConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class AddProduct extends javax.swing.JFrame {

    PreparedStatement pst=null;
    ResultSet rs=null; 
    int vendorid=0;
     public void dbconnection() throws SQLException
     {
     MysqlConnection db = new MysqlConnection();
     Statement st = db.connection.createStatement();     
     }
    public AddProduct() throws SQLException {
        initComponents();
        dbconnection();
        displayvendor();
        show_sub();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cmb_vendor = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1370, 1370));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Add Product", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Georgia", 0, 11))); // NOI18N
        jPanel1.setLayout(null);

        jLabel12.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel12.setText("Vendor");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(60, 40, 120, 30);

        jLabel13.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel13.setText("Unit Price");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(60, 140, 120, 30);

        cmb_vendor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Select---" }));
        cmb_vendor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_vendorItemStateChanged(evt);
            }
        });
        cmb_vendor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_vendorActionPerformed(evt);
            }
        });
        jPanel1.add(cmb_vendor);
        cmb_vendor.setBounds(210, 40, 190, 30);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(210, 90, 190, 30);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(210, 140, 190, 30);

        jButton1.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/if_3floppy_unmount_18268 (1).png"))); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(210, 190, 90, 30);

        jLabel14.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel14.setText("Product Name");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(60, 90, 120, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 100, 610, 230);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(null);

        jLabel15.setFont(new java.awt.Font("Plantagenet Cherokee", 1, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("ACTYMED | ADD PRODUCT");
        jPanel5.add(jLabel15);
        jLabel15.setBounds(100, 20, 790, 50);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(0, 0, 1330, 100);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "View Designations", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Georgia", 0, 11))); // NOI18N
        jPanel2.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sl.no", "Vendor ", "Item", "Rate"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(70, 30, 490, 170);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(610, 100, 720, 230);

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/Actymed billing.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -100, 1370, 960);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmb_vendorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_vendorItemStateChanged
selectid() ;       // TODO add your handling code here:
    }//GEN-LAST:event_cmb_vendorItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       //insertdata to table
       insertData();
       show_sub();
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void cmb_vendorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_vendorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_vendorActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

    }//GEN-LAST:event_jTable1MouseClicked

   public void displayvendor()
   {
       try
        {
           MysqlConnection db = new MysqlConnection(); 
       String  str="select * from hms_vendorsregistration";
        pst=db.connection.prepareStatement(str);
        rs=pst.executeQuery(str);
        while(rs.next())
        {
            cmb_vendor.addItem(rs.getString("vendor_name"));
        }
        }
        catch(Exception e)
        {System.out.println(e);}
    
   }
   public void  selectid()
   {
       try
        {
           MysqlConnection db = new MysqlConnection(); 
       String  str="select * from hms_vendorsregistration where vendor_name='"+cmb_vendor.getSelectedItem()+"'";
        pst=db.connection.prepareStatement(str);
        rs=pst.executeQuery(str);
        if(rs.next())
        {
           vendorid=rs.getInt("vendor_id");
           System.out.println(vendorid);
        }
        }
        catch(Exception e)
        {System.out.println(e);}
   } 
   public void insertData()
   {
       try
        {
            String name=jTextField1.getText();
            int qty=Integer.parseInt(jTextField2.getText());
            MysqlConnection db = new MysqlConnection();
                PreparedStatement pst=db.connection.prepareStatement("insert into hms_product(vendor_id,Item,unitprice)values(?,?,?)");
                pst.setInt(1,vendorid);
                pst.setString(2, name);
                pst.setInt(3, qty);
                pst.executeUpdate();
//                PreparedStatement pst1=db.connection.prepareStatement("insert into tbl_stock(vendor_id,product_id)values(?,?)");
//                pst1.setInt(1,vendorid);
//                pst1.setString(2, name);
//                pst1.setInt(3, qty);
//                pst1.executeUpdate();
         
            JOptionPane.showMessageDialog(null,"product added sucessfully");
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"error"+e);
        }
    
   }
   public void show_sub()
{
     try {
        DefaultTableModel dtm=(DefaultTableModel) jTable1.getModel();
                dtm.setRowCount(0);
                int SINO=0; 
                MysqlConnection db = new MysqlConnection();
                Statement st = db.connection.createStatement();
        ResultSet rs=st.executeQuery("select s.vendor_name,d.item,d.unitprice from hms_vendorsregistration s\n" +
"inner join hms_product d on s.vendor_id=d.vendor_id");
        
        while (rs.next())
        {
            
            dtm.addRow(new Object[]{++SINO,rs.getString(2),rs.getString(1),rs.getString(3)});
        }
        }
         catch (Exception ex) 
         {
           System.out.println(ex);
         }
}        
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
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AddProduct().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(AddProduct.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmb_vendor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
