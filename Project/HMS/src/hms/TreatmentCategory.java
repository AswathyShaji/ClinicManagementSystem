package hms;
import connection.MysqlConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TreatmentCategory extends javax.swing.JFrame {
PreparedStatement pst=null;
    ResultSet rs=null;  
    int slno=0;
public void dbconnection() throws SQLException
    {
     MysqlConnection db = new MysqlConnection();
     Statement st = db.connection.createStatement();       
    }
   
    public TreatmentCategory() throws SQLException {
        initComponents();
         dbconnection();
        lblname.setVisible(false);
        lblamt.setVisible(false);
        lblcategory1.setVisible(false);
        show_user();
        show_sub();
        fillcat();
    }
    public void fillcat()
   {
       try
        {
            MysqlConnection db = new MysqlConnection();
            pst=db.connection.prepareStatement("SELECT * from hms_treatmentcategory" );
            rs=pst.executeQuery();
            while(rs.next())
            {
                combocategory.addItem(rs.getString(2));
            }           
        }
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(null,"error in getting data from hms_treatmentcategory");
   
        }
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        lblname = new javax.swing.JLabel();
        btnsave = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbltreat = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtsubcategory = new javax.swing.JTextField();
        combocategory = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        lblcategory1 = new javax.swing.JLabel();
        btnsavesub = new javax.swing.JButton();
        btncancelsub = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtamt = new javax.swing.JTextField();
        lblamt = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbldistrict = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1500, 1500));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Add Category", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Georgia", 0, 11))); // NOI18N
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel1.setText("Treatment Name");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 30, 130, 30);

        txtname.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        txtname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtnameFocusLost(evt);
            }
        });
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        jPanel1.add(txtname);
        txtname.setBounds(170, 30, 210, 30);

        lblname.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        lblname.setForeground(new java.awt.Color(255, 0, 0));
        lblname.setText("Enter category Name");
        jPanel1.add(lblname);
        lblname.setBounds(390, 30, 180, 40);

        btnsave.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        btnsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/if_3floppy_unmount_18268 (1).png"))); // NOI18N
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnsave);
        btnsave.setBounds(170, 80, 100, 30);

        btncancel.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        btncancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/if_cancel_326554.png"))); // NOI18N
        btncancel.setText("Cancel");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });
        jPanel1.add(btncancel);
        btncancel.setBounds(280, 80, 110, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 110, 520, 180);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(null);

        jLabel11.setFont(new java.awt.Font("Plantagenet Cherokee", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("ACTYMED | SPECIAL TREATMENTS");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(140, 20, 820, 50);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1070, 110);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "View Treatments", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Georgia", 0, 11))); // NOI18N
        jPanel6.setLayout(null);

        tbltreat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sl.no", "Treatment"
            }
        ));
        tbltreat.setGridColor(new java.awt.Color(255, 255, 255));
        tbltreat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbltreatMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbltreat);

        jPanel6.add(jScrollPane1);
        jScrollPane1.setBounds(10, 20, 480, 380);

        getContentPane().add(jPanel6);
        jPanel6.setBounds(0, 290, 520, 420);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Add SubCategory", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Georgia", 0, 11))); // NOI18N
        jPanel3.setLayout(null);

        jLabel2.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel2.setText("Category");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(20, 30, 110, 20);

        txtsubcategory.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        txtsubcategory.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtsubcategoryFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtsubcategoryFocusLost(evt);
            }
        });
        jPanel3.add(txtsubcategory);
        txtsubcategory.setBounds(150, 70, 190, 30);

        combocategory.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        combocategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select" }));
        combocategory.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                combocategoryFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                combocategoryFocusLost(evt);
            }
        });
        jPanel3.add(combocategory);
        combocategory.setBounds(150, 30, 190, 30);

        jLabel3.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel3.setText("Amount");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(20, 110, 110, 30);

        lblcategory1.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        lblcategory1.setForeground(new java.awt.Color(255, 0, 0));
        lblcategory1.setText("Select any category");
        lblcategory1.setMaximumSize(new java.awt.Dimension(1500, 1500));
        lblcategory1.setMinimumSize(new java.awt.Dimension(1500, 1500));
        jPanel3.add(lblcategory1);
        lblcategory1.setBounds(350, 40, 110, 19);

        btnsavesub.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        btnsavesub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/if_3floppy_unmount_18268 (1).png"))); // NOI18N
        btnsavesub.setText("Save");
        btnsavesub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsavesubActionPerformed(evt);
            }
        });
        jPanel3.add(btnsavesub);
        btnsavesub.setBounds(150, 150, 110, 30);

        btncancelsub.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        btncancelsub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/if_cancel_326554.png"))); // NOI18N
        btncancelsub.setText("Cancel");
        btncancelsub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelsubActionPerformed(evt);
            }
        });
        jPanel3.add(btncancelsub);
        btncancelsub.setBounds(270, 150, 120, 30);

        jLabel4.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel4.setText("Subcategory");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(20, 70, 110, 30);

        txtamt.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        txtamt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtamtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtamtFocusLost(evt);
            }
        });
        jPanel3.add(txtamt);
        txtamt.setBounds(150, 110, 190, 30);

        lblamt.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        lblamt.setForeground(new java.awt.Color(255, 0, 0));
        lblamt.setText("Enter amount");
        jPanel3.add(lblamt);
        lblamt.setBounds(350, 110, 76, 20);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(520, 110, 550, 190);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "View SubCategory", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Georgia", 0, 11))); // NOI18N
        jPanel4.setLayout(null);

        tbldistrict.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        tbldistrict.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sl.no", "Category", "Subcategory", "Amount"
            }
        ));
        jScrollPane2.setViewportView(tbldistrict);

        jPanel4.add(jScrollPane2);
        jScrollPane2.setBounds(30, 40, 470, 340);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(520, 300, 550, 410);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel7.setLayout(null);
        getContentPane().add(jPanel7);
        jPanel7.setBounds(1070, 0, 260, 710);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnameFocusGained
        lblname.setVisible(false);
    }//GEN-LAST:event_txtnameFocusGained

    private void txtnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnameFocusLost
        
    }//GEN-LAST:event_txtnameFocusLost

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed

    }//GEN-LAST:event_txtnameActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        inserttreatment();
    }//GEN-LAST:event_btnsaveActionPerformed
    public void inserttreatment()
    {
        try
        {
           int i=0,fl=0;
           String name=txtname.getText();
           i=name.length();
           if(i==0)
           {
               lblname.setVisible(true);
               fl=1;
           }
            MysqlConnection db = new MysqlConnection();
            Statement st = db.connection.createStatement();    
            String sel="select tc_name from hms_treatmentcategory where tc_name='"+name+"'";
            ResultSet rs=st.executeQuery(sel);
            if(rs.next())
            {
                fl=1;
                JOptionPane.showMessageDialog(null,"Already Exist");
            }
           if(fl==0)
           {     
             PreparedStatement pst=db.connection.prepareStatement("insert into hms_treatmentcategory(tc_name)values(?)");
             pst.setString(1,name);
             pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"SAVED SUCCESSFULLY");
            
             txtname.setText(null); 
             show_user();
           }            
       }
       catch(SQLException e)
       {
          System.out.print(e);
       }  
    }
    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        txtname.setText(null); 
         lblname.setVisible(false);
    }//GEN-LAST:event_btncancelActionPerformed

    private void tbltreatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbltreatMouseClicked
       
    }//GEN-LAST:event_tbltreatMouseClicked

    private void txtsubcategoryFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtsubcategoryFocusGained
 
    }//GEN-LAST:event_txtsubcategoryFocusGained

    private void txtsubcategoryFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtsubcategoryFocusLost

    }//GEN-LAST:event_txtsubcategoryFocusLost

    private void combocategoryFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_combocategoryFocusGained
        lblcategory1.setVisible(false);
    }//GEN-LAST:event_combocategoryFocusGained

    private void combocategoryFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_combocategoryFocusLost

    }//GEN-LAST:event_combocategoryFocusLost

    private void btnsavesubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsavesubActionPerformed
    try {
        insertsub();
    } catch (SQLException ex) {
        Logger.getLogger(TreatmentCategory.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_btnsavesubActionPerformed
    public void insertsub() throws SQLException
    {
         String statename=null;
        int stateid=0;
        int fl=0;
        statename=combocategory.getSelectedItem().toString();
        if(statename.equals("select"))
        {
            fl=1;
            lblcategory1.setVisible(true);
        }
        String name=txtsubcategory.getText();
        int amt=0;
        String amount=txtamt.getText();
        amt=amount.length();
        if(amt==0)
        {
            fl=1;
            lblamt.setVisible(true);
        }
        try
        {
            MysqlConnection db = new MysqlConnection();
            pst=db.connection.prepareStatement("SELECT * from hms_treatmentcategory where tc_name=?");
            pst.setString(1, statename);
            rs=pst.executeQuery();
            while(rs.next())
            {
                stateid=rs.getInt(1);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
             MysqlConnection db = new MysqlConnection();
            Statement st = db.connection.createStatement();    
            String sel="select tsc_name from hms_treatmentsubcategory where tsc_name='"+name+"'";
            ResultSet rs=st.executeQuery(sel);
            if(rs.next())
            {
                fl=1;
                JOptionPane.showMessageDialog(null,"Already Exist");
            }   
        if(fl==0)
        {
            try
            {
                PreparedStatement pst=db.connection.prepareStatement("insert into hms_treatmentsubcategory(tsc_name,tc_id,tsc_amount)values(?,?,?)");
                pst.setString(1,name);
                pst.setInt(2, stateid);
                pst.setString(3,amount);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null,"SAVED SUCCESSFULLY");
                show_sub();
                txtsubcategory.setText("");
                txtamt.setText("");
                combocategory.setSelectedItem("select");
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
    public void show_sub()
{
     try {
        DefaultTableModel dtm=(DefaultTableModel) tbldistrict.getModel();
                dtm.setRowCount(0);
                int SINO=0; 
                MysqlConnection db = new MysqlConnection();
                Statement st = db.connection.createStatement();
        ResultSet rs=st.executeQuery("select s.tsc_name,d.tc_name,s.tsc_amount from hms_treatmentsubcategory s\n" +
"inner join hms_treatmentcategory d on s.tc_id=d.tc_id");
        
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
    private void btncancelsubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelsubActionPerformed
        lblcategory1.setVisible(false);
        lblamt.setVisible(false);
        txtsubcategory.setText("");
        txtamt.setText("");
        combocategory.setSelectedItem("select");
    }//GEN-LAST:event_btncancelsubActionPerformed

    private void txtamtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtamtFocusGained
        lblamt.setVisible(false);
    }//GEN-LAST:event_txtamtFocusGained

    private void txtamtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtamtFocusLost
            
    }//GEN-LAST:event_txtamtFocusLost
 public void show_user()
    {
        try {
                DefaultTableModel dtm=(DefaultTableModel) tbltreat.getModel();
                dtm.setRowCount(0);
                int SINO=0; 
                MysqlConnection db = new MysqlConnection();
                Statement st = db.connection.createStatement();
                ResultSet rs=st.executeQuery("select  * from hms_treatmentcategory");
                while (rs.next())
                {
                    dtm.addRow(new Object[]{++SINO,rs.getString(2)});
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
            java.util.logging.Logger.getLogger(TreatmentCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TreatmentCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TreatmentCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TreatmentCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TreatmentCategory().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(TreatmentCategory.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btncancelsub;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnsavesub;
    private javax.swing.JComboBox<String> combocategory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblamt;
    private javax.swing.JLabel lblcategory1;
    private javax.swing.JLabel lblname;
    private javax.swing.JTable tbldistrict;
    private javax.swing.JTable tbltreat;
    private javax.swing.JTextField txtamt;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtsubcategory;
    // End of variables declaration//GEN-END:variables
}
