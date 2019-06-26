package hms;
import connection.MysqlConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Purchase extends javax.swing.JFrame {
    PreparedStatement pst=null;
    PreparedStatement pst1=null;
    ResultSet rs=null; 
    int vendorid=0;
    int itemid=0;
    int total,qty,price,amt=0,netamt,a,b,c;
    int purchaseid=0;
     public void dbconnection() throws SQLException
     {
     MysqlConnection db = new MysqlConnection();
     Statement st = db.connection.createStatement();     
     }
    public Purchase() {
        initComponents();
              displayvendor();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_bill = new javax.swing.JTextField();
        dtd_bill = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_qty = new javax.swing.JTextField();
        txt_price = new javax.swing.JTextField();
        cmb_vendor = new javax.swing.JComboBox<>();
        cmb_item = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        Total = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_dis = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_net = new javax.swing.JTextField();
        txt_amt = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btn_insert = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1370, 1370));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel1.setText("Bill No");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(26, 20, 120, 20);

        jLabel2.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel2.setText("Bill Date");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(429, 26, 110, 18);

        txt_bill.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        jPanel1.add(txt_bill);
        txt_bill.setBounds(190, 8, 158, 30);
        jPanel1.add(dtd_bill);
        dtd_bill.setBounds(536, 12, 231, 28);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(9, 76, 1260, 50);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel2.setLayout(null);

        jLabel3.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel3.setText("Vendor");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(24, 18, 110, 20);

        jLabel4.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel4.setText("Item");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(24, 65, 100, 20);

        jLabel6.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel6.setText("Unitprice");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(410, 70, 80, 18);

        jLabel5.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel5.setText("Quantity");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(408, 18, 80, 18);

        txt_qty.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        jPanel2.add(txt_qty);
        txt_qty.setBounds(517, 15, 235, 30);

        txt_price.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        jPanel2.add(txt_price);
        txt_price.setBounds(517, 53, 235, 33);

        cmb_vendor.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        cmb_vendor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Vendor--" }));
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
        jPanel2.add(cmb_vendor);
        cmb_vendor.setBounds(150, 10, 230, 31);

        cmb_item.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        cmb_item.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SelectItem--" }));
        cmb_item.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_itemItemStateChanged(evt);
            }
        });
        cmb_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_itemActionPerformed(evt);
            }
        });
        jPanel2.add(cmb_item);
        cmb_item.setBounds(150, 60, 230, 32);

        jButton2.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(770, 8, 88, 34);

        Total.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        Total.setText("Total");
        jPanel2.add(Total);
        Total.setBounds(889, 13, 40, 18);

        jLabel7.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel7.setText("Discount");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(886, 50, 60, 18);

        txt_dis.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        txt_dis.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_disFocusLost(evt);
            }
        });
        txt_dis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_disKeyReleased(evt);
            }
        });
        jPanel2.add(txt_dis);
        txt_dis.setBounds(964, 43, 162, 28);

        jLabel8.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel8.setText("NetAmount");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(876, 95, 70, 20);

        txt_net.setEditable(false);
        txt_net.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        jPanel2.add(txt_net);
        txt_net.setBounds(964, 87, 163, 28);

        txt_amt.setEditable(false);
        txt_amt.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        txt_amt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_amtActionPerformed(evt);
            }
        });
        jPanel2.add(txt_amt);
        txt_amt.setBounds(964, 6, 162, 29);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(7, 133, 1260, 120);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BillNo", "Item Code", "BillDate", "Vendor", "Item", "Quantity", "UnitPrice", "Total", "Remove"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 284, 1138, 170);

        btn_insert.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        btn_insert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/if_3floppy_unmount_18268 (1).png"))); // NOI18N
        btn_insert.setText("INSERT");
        btn_insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insertActionPerformed(evt);
            }
        });
        getContentPane().add(btn_insert);
        btn_insert.setBounds(550, 460, 120, 32);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        jLabel14.setFont(new java.awt.Font("Plantagenet Cherokee", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("ACTYMED | PURCHASE");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(150, 10, 650, 50);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(10, 0, 1010, 70);

        jLabel9.setBackground(new java.awt.Color(204, 204, 204));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/Actymed billing.png"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(-10, -100, 1370, 960);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmb_vendorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_vendorItemStateChanged
        // TODO add your handling code here:
        selectid();
        fillitem();
        
    }//GEN-LAST:event_cmb_vendorItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
      if(AlreadyExistValidation()== false)
      {
        qty=Integer.parseInt(txt_qty.getText());
        price=Integer.parseInt(txt_price.getText());
        total=qty*price;
        System.out.println("hello");
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        // df.format(dtd_bill.getDate());
        
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
       // jTable2.getColumnModel().getColumn(1).sizeWidthToFit();
        model.addRow(new Object[]{txt_bill.getText(),itemid,df.format(dtd_bill.getDate()),cmb_vendor.getSelectedItem(),
            cmb_item.getSelectedItem(),txt_qty.getText(),txt_price.getText(),total});
      }
      findtotal();
      
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cmb_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_itemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_itemActionPerformed

    private void cmb_itemItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_itemItemStateChanged
        // TODO add your handling code here:
        selectitemid();
        
    }//GEN-LAST:event_cmb_itemItemStateChanged

    private void txt_amtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_amtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_amtActionPerformed

    private void txt_disFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_disFocusLost
       //find net amount   
    }//GEN-LAST:event_txt_disFocusLost

    private void btn_insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insertActionPerformed
        // TODO add your handling code here:
        insertProduct();
        clearData();
    }//GEN-LAST:event_btn_insertActionPerformed

    private void cmb_vendorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_vendorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_vendorActionPerformed

    private void txt_disKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_disKeyReleased
        // TODO add your handling code here:
        a=Integer.parseInt(txt_amt.getText());
       b=Integer.parseInt(txt_dis.getText());
       c=a-b;
       txt_net.setText(""+c);
    }//GEN-LAST:event_txt_disKeyReleased

    /**
     * @param args the command line arguments
     */
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
     public void fillitem()
     {
         try
        {
           MysqlConnection db = new MysqlConnection(); 
       String  str="select * from hms_product where vendor_id='"+vendorid+"'";
        pst=db.connection.prepareStatement(str);
        rs=pst.executeQuery(str);
        cmb_item.removeAllItems();
        while(rs.next())
        {
            cmb_item.addItem(rs.getString("Item"));
        }
        }
        catch(Exception e)
        {System.out.println(e);}
         
     }
          public void  selectitemid()
   {
       try
        {
           MysqlConnection db = new MysqlConnection(); 
       String  str="select * from hms_product where item='"+cmb_item.getSelectedItem()+"'";
        pst=db.connection.prepareStatement(str);
        rs=pst.executeQuery(str);
        if(rs.next())
        {
           itemid=rs.getInt("product_id");
           System.out.println(itemid);
        }
        }
        catch(Exception e)
        {System.out.println(e);}
   }
         //To check itemalready exist
          public Boolean AlreadyExistValidation()
          {
              
              int rows=jTable2.getRowCount();
             for(int i=0;i<rows;i++)
             {
                 int exid=Integer.parseInt(jTable2.getValueAt(i,1).toString());
                 if(itemid==exid)
                 {
                      JOptionPane.showMessageDialog(null,"Itemalready exixst");
        
                     return true;
                 }
                 
             }
             return false;
          }
          public void findtotal()
          {
               int rows=jTable2.getRowCount();
               amt=0;
             for(int i=0;i<rows;i++)
             {
                  amt=amt+Integer.parseInt(jTable2.getValueAt(i,7).toString());
                  txt_amt.setText(""+amt);
                  txt_net.setText(""+amt);
             }
             
          }
          public void insertProduct()
          {
              //To select purchase id from purchase master table 
              try
        {
            
            MysqlConnection db = new MysqlConnection();
            String  str="SELECT IFNULL(max(purchase_id),0)+1 AS 'PID' FROM hms_purchasemaster";
            pst=db.connection.prepareStatement(str);
            rs=pst.executeQuery(str);
            if(rs.next())
            {
               purchaseid=rs.getInt("PID");
               System.out.println(purchaseid);
            }
            
            //  To insert Data to Master table
            DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
            
            str="INSERT INTO hms_purchasemaster(purchase_id,Billno,Bill_date,Total,discount,NetAmount)values(?,?,?,?,?,?)";
             PreparedStatement pst=db.connection.prepareStatement(str);
                pst.setInt(1,purchaseid);
                pst.setString(2, txt_bill.getText());
                pst.setString(3,df.format(dtd_bill.getDate()));
                pst.setString(4, txt_amt.getText());
                pst.setString(5, txt_dis.getText());
                pst.setString(6, txt_net.getText());
                pst.executeUpdate(); 
                System.out.println("inserted");
                //To insert details of product to purchase details table
                int rows=jTable2.getRowCount();
                for(int i=0;i<rows;i++)
             {
                 
             str="INSERT INTO hms_purchasedetails(purchase_id,Item,unitpice,quantity,Total)values(?,?,?,?,?)";
             PreparedStatement pst1=db.connection.prepareStatement(str);
                pst1.setInt(1,purchaseid);
                pst1.setString(2, jTable2.getValueAt(i,4).toString());
                  System.out.println("inserted1");
                pst1.setString(3,jTable2.getValueAt(i,5).toString());
                  System.out.println("inserted2");
                pst1.setString(4,jTable2.getValueAt(i,6).toString());
                  System.out.println("inserted3");
                pst1.setString(5, jTable2.getValueAt(i,7).toString());
                //pst.setString(6, jTable2.getValueAt(i,7).toString());
                pst1.executeUpdate(); 
             }
                JOptionPane.showMessageDialog(null,"product added sucessfully");
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"error"+e);
        }
    
          }
          public void clearData()
          {
              txt_bill.setText("");
              cmb_vendor.setSelectedItem("Select");
              cmb_item.setSelectedItem("Select");
              txt_qty.setText("");
              txt_amt.setText("");
              txt_dis.setText("");
              txt_price.setText("");
              txt_net.setText("");
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
            java.util.logging.Logger.getLogger(Purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Purchase().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Total;
    private javax.swing.JButton btn_insert;
    private javax.swing.JComboBox<String> cmb_item;
    private javax.swing.JComboBox<String> cmb_vendor;
    private com.toedter.calendar.JDateChooser dtd_bill;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField txt_amt;
    private javax.swing.JTextField txt_bill;
    private javax.swing.JTextField txt_dis;
    private javax.swing.JTextField txt_net;
    private javax.swing.JTextField txt_price;
    private javax.swing.JTextField txt_qty;
    // End of variables declaration//GEN-END:variables
}
