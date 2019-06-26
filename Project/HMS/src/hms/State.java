package hms;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.JOptionPane;
import connection.MysqlConnection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class State extends javax.swing.JFrame {
    PreparedStatement pst=null;
    ResultSet rs=null;  
    ResultSet rs1=null;  
    Connection connection=null;
    int opno;
    public void dbconnection() throws SQLException
    {
        MysqlConnection db = new MysqlConnection();
        Statement st = db.connection.createStatement();    
    }
    
    public State() throws SQLException {
        dbconnection();
        initComponents();
        show_user();
        lblname.setVisible(false);     
        show_district();
        lblstate.setVisible(false);
        lbldistrict.setVisible(false);
        fillstate();
        lblstate1.setVisible(false);
        lbldistrict1.setVisible(false);
        lblplace.setVisible(false);
        showplace();
    }
   public void fillstate()
   {
       try
        {
            MysqlConnection db = new MysqlConnection();
            pst=db.connection.prepareStatement("SELECT * from hms_state" );
            rs=pst.executeQuery();
            while(rs.next())
            {
                combostate.addItem(rs.getString(2));
                combostate1.addItem(rs.getString(2));
            }           
        }
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(null,"error in getting data for sate");
   
        }
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        lblname = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtdistrict = new javax.swing.JTextField();
        combostate = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        btnsavedistrict = new javax.swing.JButton();
        btncanceldistrict = new javax.swing.JButton();
        lblstate = new javax.swing.JLabel();
        lbldistrict = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbldistrict = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblstate = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblplace = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtplace = new javax.swing.JTextField();
        combodistrict1 = new javax.swing.JComboBox<>();
        btnsaveplace = new javax.swing.JButton();
        btncancelplace = new javax.swing.JButton();
        lblplace = new javax.swing.JLabel();
        lbldistrict1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        combostate1 = new javax.swing.JComboBox<>();
        lblstate1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1370, 1370));
        setSize(new java.awt.Dimension(400, 500));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Add State", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Georgia", 0, 11))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel1.setText("State Name");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 50, 110, 20);

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
        txtname.setBounds(100, 40, 230, 30);

        lblname.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        lblname.setForeground(new java.awt.Color(255, 0, 0));
        lblname.setText("Enter State Name");
        jPanel1.add(lblname);
        lblname.setBounds(330, 40, 160, 40);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/if_3floppy_unmount_18268 (1).png"))); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(100, 80, 90, 30);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/if_cancel_326554.png"))); // NOI18N
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(200, 80, 95, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 90, 440, 200);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(null);

        jLabel11.setFont(new java.awt.Font("Plantagenet Cherokee", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("ACTYMED | ADD LOCATION");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(140, 30, 610, 50);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1360, 90);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Add District", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Georgia", 0, 11))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel2.setText("State");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 100, 20));

        txtdistrict.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        txtdistrict.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtdistrictFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtdistrictFocusLost(evt);
            }
        });
        jPanel4.add(txtdistrict, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 230, 30));

        combostate.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        combostate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select" }));
        combostate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                combostateFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                combostateFocusLost(evt);
            }
        });
        jPanel4.add(combostate, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 230, 30));

        jLabel3.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel3.setText("District");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 90, 30));

        btnsavedistrict.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        btnsavedistrict.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/if_3floppy_unmount_18268 (1).png"))); // NOI18N
        btnsavedistrict.setText("Save");
        btnsavedistrict.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsavedistrictActionPerformed(evt);
            }
        });
        jPanel4.add(btnsavedistrict, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 100, 30));

        btncanceldistrict.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        btncanceldistrict.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/if_cancel_326554.png"))); // NOI18N
        btncanceldistrict.setText("Cancel");
        btncanceldistrict.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncanceldistrictActionPerformed(evt);
            }
        });
        jPanel4.add(btncanceldistrict, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 100, 30));

        lblstate.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        lblstate.setForeground(new java.awt.Color(255, 0, 0));
        lblstate.setText("Select any state");
        lblstate.setMaximumSize(new java.awt.Dimension(1500, 1500));
        lblstate.setMinimumSize(new java.awt.Dimension(1500, 1500));
        jPanel4.add(lblstate, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 180, 30));

        lbldistrict.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        lbldistrict.setForeground(new java.awt.Color(255, 0, 0));
        lbldistrict.setText("Enter district");
        jPanel4.add(lbldistrict, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 170, 30));

        getContentPane().add(jPanel4);
        jPanel4.setBounds(440, 90, 440, 200);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "View District", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Georgia", 0, 11))); // NOI18N
        jPanel5.setLayout(null);

        tbldistrict.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        tbldistrict.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sl.no", "State", "District"
            }
        ));
        tbldistrict.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbldistrictMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbldistrict);

        jPanel5.add(jScrollPane3);
        jScrollPane3.setBounds(10, 20, 420, 380);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(430, 290, 450, 430);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "View State", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Georgia", 0, 11))); // NOI18N
        jPanel6.setLayout(null);

        tblstate.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sl.no", "State"
            }
        ));
        tblstate.setGridColor(new java.awt.Color(255, 255, 255));
        tblstate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblstateMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblstate);

        jPanel6.add(jScrollPane1);
        jScrollPane1.setBounds(10, 20, 380, 380);

        getContentPane().add(jPanel6);
        jPanel6.setBounds(0, 290, 440, 430);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "View Place", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        jPanel3.setLayout(null);

        tblplace.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        tblplace.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sl.no", "State", "District", "Place"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblplace.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblplaceMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblplace);

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(20, 20, 430, 380);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(880, 290, 480, 430);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Add Place", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Georgia", 0, 11))); // NOI18N
        jPanel7.setLayout(null);

        jLabel4.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel4.setText("District");
        jPanel7.add(jLabel4);
        jLabel4.setBounds(10, 70, 80, 30);

        txtplace.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        txtplace.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtplaceFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtplaceFocusLost(evt);
            }
        });
        jPanel7.add(txtplace);
        txtplace.setBounds(80, 120, 230, 30);

        combodistrict1.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        combodistrict1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select" }));
        combodistrict1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                combodistrict1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                combodistrict1FocusLost(evt);
            }
        });
        jPanel7.add(combodistrict1);
        combodistrict1.setBounds(80, 70, 230, 30);

        btnsaveplace.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        btnsaveplace.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/if_3floppy_unmount_18268 (1).png"))); // NOI18N
        btnsaveplace.setText("Save");
        btnsaveplace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveplaceActionPerformed(evt);
            }
        });
        jPanel7.add(btnsaveplace);
        btnsaveplace.setBounds(100, 160, 100, 30);

        btncancelplace.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        btncancelplace.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/if_cancel_326554.png"))); // NOI18N
        btncancelplace.setText("Cancel");
        btncancelplace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelplaceActionPerformed(evt);
            }
        });
        jPanel7.add(btncancelplace);
        btncancelplace.setBounds(210, 160, 100, 30);

        lblplace.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        lblplace.setForeground(new java.awt.Color(255, 0, 0));
        lblplace.setText("Enter place");
        jPanel7.add(lblplace);
        lblplace.setBounds(330, 120, 160, 30);

        lbldistrict1.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        lbldistrict1.setForeground(new java.awt.Color(255, 0, 0));
        lbldistrict1.setText("Select any district");
        jPanel7.add(lbldistrict1);
        lbldistrict1.setBounds(330, 70, 160, 40);

        jLabel5.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel5.setText("State");
        jPanel7.add(jLabel5);
        jLabel5.setBounds(10, 20, 80, 30);

        combostate1.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        combostate1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select" }));
        combostate1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combostate1ItemStateChanged(evt);
            }
        });
        combostate1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                combostate1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                combostate1FocusLost(evt);
            }
        });
        combostate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combostate1ActionPerformed(evt);
            }
        });
        jPanel7.add(combostate1);
        combostate1.setBounds(80, 30, 230, 30);

        lblstate1.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        lblstate1.setForeground(new java.awt.Color(255, 0, 0));
        lblstate1.setText("Select any state");
        jPanel7.add(lblstate1);
        lblstate1.setBounds(330, 20, 170, 30);

        jLabel6.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel6.setText("Place");
        jPanel7.add(jLabel6);
        jLabel6.setBounds(10, 120, 80, 30);

        getContentPane().add(jPanel7);
        jPanel7.setBounds(880, 90, 480, 200);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         insertstate();
    }//GEN-LAST:event_jButton1ActionPerformed
    public void insertstate()
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
            String sel="select state_name from hms_state where state_name='"+name+"'";
            ResultSet rs=st.executeQuery(sel);
            if(rs.next())
            {
                fl=1;
                JOptionPane.showMessageDialog(null,"State Already Exist", "Error", JOptionPane.ERROR_MESSAGE);
            }
           if(fl==0)
           {                 
             PreparedStatement pst=db.connection.prepareStatement("insert into hms_state(state_name)values(?)");
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
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
              txtname.setText(null); 
              lblname.setVisible(false);         
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        
    }//GEN-LAST:event_txtnameActionPerformed

    private void txtnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnameFocusGained
        lblname.setVisible(false);   
    }//GEN-LAST:event_txtnameFocusGained

    private void txtnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnameFocusLost

    }//GEN-LAST:event_txtnameFocusLost

    private void tblstateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblstateMouseClicked
       
    }//GEN-LAST:event_tblstateMouseClicked

    private void txtdistrictFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtdistrictFocusGained

        lbldistrict.setVisible(false);
    }//GEN-LAST:event_txtdistrictFocusGained

    private void txtdistrictFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtdistrictFocusLost

    }//GEN-LAST:event_txtdistrictFocusLost

    private void combostateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_combostateFocusGained

        lblstate.setVisible(false);
    }//GEN-LAST:event_combostateFocusGained

    private void combostateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_combostateFocusLost

    }//GEN-LAST:event_combostateFocusLost

    private void btnsavedistrictActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsavedistrictActionPerformed
        try {
            insertdistrict();
        } catch (SQLException ex) {
            Logger.getLogger(State.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnsavedistrictActionPerformed
public void insertdistrict() throws SQLException
{
        String statename=null;
        int stateid=0;
        int fl=0;
        statename=combostate.getSelectedItem().toString();
        if(statename.equals("select"))
        {
            fl=1;
            lblstate.setVisible(true);
        }
        int i=0;
        String name=txtdistrict.getText();
        i=name.length();
        if(i==0)
        {
            fl=1;
            lbldistrict.setVisible(true);
        }
        try
        {
            MysqlConnection db = new MysqlConnection();
            pst=db.connection.prepareStatement("SELECT * from hms_state where state_name=?");
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
            String sel="select district_name from hms_district where district_name='"+name+"'";
            ResultSet rs=st.executeQuery(sel);
            if(rs.next())
            {
                fl=1;
                JOptionPane.showMessageDialog(null,"District Already Exist");
            }   
        if(fl==0)
        {
            try
            {
                PreparedStatement pst=db.connection.prepareStatement("insert into hms_district(district_name,state_id)values(?,?)");
                pst.setString(1,name);
                pst.setInt(2, stateid);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null,"SAVED SUCCESSFULLY");
                show_district();
                txtdistrict.setText("");
                combostate.setSelectedItem("select");
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
}
public void show_district()
{
     try {
        DefaultTableModel dtm=(DefaultTableModel) tbldistrict.getModel();
                dtm.setRowCount(0);
                int SINO=0; 
                MysqlConnection db = new MysqlConnection();
                Statement st = db.connection.createStatement();
        ResultSet rs=st.executeQuery("select s.state_name, d.district_name from hms_district d\n" +
"inner join hms_state s on s.state_id=d.state_id");
        
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
    private void btncanceldistrictActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncanceldistrictActionPerformed
        txtdistrict.setText(null);
        combostate.setSelectedItem("select");
        lbldistrict.setVisible(false);
        lblstate.setVisible(false);
    }//GEN-LAST:event_btncanceldistrictActionPerformed
    public void showplace()
    {
        try {
        DefaultTableModel dtm=(DefaultTableModel) tblplace.getModel();
                dtm.setRowCount(0);
                int SINO=0; 
                MysqlConnection db = new MysqlConnection();
                Statement st = db.connection.createStatement();
        ResultSet rs=st.executeQuery("select p.place_name,d.district_name,s.state_name from hms_place  p \n" +
            "inner join hms_district d on p.district_id=d.district_id\n" +
                 "inner join hms_state s on s.state_id=d.state_id");
        
        while (rs.next())
        {
         
            dtm.addRow(new Object[]{++SINO,rs.getString(3),rs.getString(2),rs.getString(1)});
        }
        }
         catch (Exception ex) 
         {
           System.out.println(ex);
         }
    }
    private void tbldistrictMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbldistrictMouseClicked

    }//GEN-LAST:event_tbldistrictMouseClicked

    private void tblplaceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblplaceMouseClicked

    }//GEN-LAST:event_tblplaceMouseClicked

    private void txtplaceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtplaceFocusGained

        lblplace.setVisible(false);
    }//GEN-LAST:event_txtplaceFocusGained

    private void txtplaceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtplaceFocusLost

    }//GEN-LAST:event_txtplaceFocusLost

    private void combodistrict1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_combodistrict1FocusGained
        lbldistrict1.setVisible(false);
    }//GEN-LAST:event_combodistrict1FocusGained

    private void combodistrict1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_combodistrict1FocusLost

    }//GEN-LAST:event_combodistrict1FocusLost

    private void btnsaveplaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveplaceActionPerformed
        try {
            insertplace();
        } catch (SQLException ex) {
            Logger.getLogger(State.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnsaveplaceActionPerformed
    public void insertplace() throws SQLException
    {
        String statename=null;
        int fl=0;
        statename=combostate1.getSelectedItem().toString();
        if(statename.equals("select"))
        {
            fl=1;
            lblstate1.setVisible(true);
        }
        String districtname=null;
        int districtid=0;
        districtname=combodistrict1.getSelectedItem().toString();
        if(districtname.equals("select"))
        {
            fl=1;
            lbldistrict1.setVisible(true);
        }
        int i=0;
        String name=txtplace.getText();
        i=name.length();
        if(i==0)
        {
            fl=1;
            lblplace.setVisible(true);
        }
        try
        {
            MysqlConnection db = new MysqlConnection();
            pst=db.connection.prepareStatement("SELECT * from hms_district where district_name=?");
            pst.setString(1, districtname);
            rs=pst.executeQuery();
            while(rs.next())
            {
                districtid=rs.getInt(1);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
            MysqlConnection db = new MysqlConnection();
            Statement st = db.connection.createStatement();    
            String sel="select place_name from hms_place where place_name='"+name+"'";
            ResultSet rs=st.executeQuery(sel);
            if(rs.next())
            {
                fl=1;
                JOptionPane.showMessageDialog(null,"Place Already Exist");
            }
        if(fl==0)
        {
            try
            {
                PreparedStatement pst=db.connection.prepareStatement("insert into hms_place(district_id,place_name)values(?,?)");
                pst.setInt(1, districtid);
                pst.setString(2,name);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null,"SAVED SUCCESSFULLY");
                txtplace.setText("");
                combodistrict1.setSelectedItem("select");
                combostate1.setSelectedItem("select");
                 showplace();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
    private void btncancelplaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelplaceActionPerformed
        txtplace.setText(null);
        combodistrict1.setSelectedItem("select");
        combostate1.setSelectedItem("select");
        lbldistrict1.setVisible(false);
        lblstate1.setVisible(false);
        lblplace.setVisible(false);
    }//GEN-LAST:event_btncancelplaceActionPerformed

    private void combostate1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combostate1ItemStateChanged
        try
        {
            MysqlConnection db = new MysqlConnection();
            int state=combostate1.getSelectedIndex();

            pst=db.connection.prepareStatement("SELECT * from hms_district where state_id=?" );
            pst.setInt(1, state);
            rs=pst.executeQuery();
            while(rs.next())
            {
                combodistrict1.addItem(rs.getString("district_name"));
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"error in getting data for sate");

        }
    }//GEN-LAST:event_combostate1ItemStateChanged

    private void combostate1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_combostate1FocusGained
        lblstate1.setVisible(false);
    }//GEN-LAST:event_combostate1FocusGained

    private void combostate1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_combostate1FocusLost

    }//GEN-LAST:event_combostate1FocusLost

    private void combostate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combostate1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combostate1ActionPerformed
     public void show_user()
    {
        try {
                DefaultTableModel dtm=(DefaultTableModel) tblstate.getModel();
                dtm.setRowCount(0);
                int SINO=0; 
                MysqlConnection db = new MysqlConnection();
                Statement st = db.connection.createStatement();
                ResultSet rs=st.executeQuery("select  * from hms_state");
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
            java.util.logging.Logger.getLogger(State.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(State.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(State.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(State.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new State().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(State.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncanceldistrict;
    private javax.swing.JButton btncancelplace;
    private javax.swing.JButton btnsavedistrict;
    private javax.swing.JButton btnsaveplace;
    private javax.swing.JComboBox<String> combodistrict1;
    private javax.swing.JComboBox<String> combostate;
    private javax.swing.JComboBox<String> combostate1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbldistrict;
    private javax.swing.JLabel lbldistrict1;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblplace;
    private javax.swing.JLabel lblstate;
    private javax.swing.JLabel lblstate1;
    private javax.swing.JTable tbldistrict;
    private javax.swing.JTable tblplace;
    private javax.swing.JTable tblstate;
    private javax.swing.JTextField txtdistrict;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtplace;
    // End of variables declaration//GEN-END:variables
}
