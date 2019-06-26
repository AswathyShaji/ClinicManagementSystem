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

public class EditVendor extends javax.swing.JFrame {
    PreparedStatement pst=null;
    ResultSet rs=null; 
    String gender=null;
    int sid =0;
    String d;
    public void dbconnection() throws SQLException
     {
     MysqlConnection db = new MysqlConnection();
     Statement st = db.connection.createStatement();     
     }
  
    public EditVendor() throws SQLException {
        initComponents();
        dbconnection();
        lblop.setVisible(false);
        lblname.setVisible(false);
        lbladdress.setVisible(false);
        lblstate.setVisible(false); 
        lbldistrict.setVisible(false);
        lblemail.setVisible(false);
        lblcity.setVisible(false);
        lblph.setVisible(false);
        lbldistrictid.hide();
        DateFormat dateformat=new SimpleDateFormat("dd-MM-YYYY");
        java.util.Date date=new java.util.Date();
         d=dateformat.format(date);
        lbldate.setText(d);
        fillstate(); 
        fillid();
    }
    public void fillid()
    {
        try
        {
            MysqlConnection db = new MysqlConnection();
            pst=db.connection.prepareStatement("SELECT * from hms_vendorsregistration" );
            rs=pst.executeQuery();
            while(rs.next())
            {
                comboop.addItem(rs.getString(1));             
            }   
        }
        catch(Exception e)
        {
        }
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
            }          
        }
        catch(Exception e)
        { 
        }
   }
     public void clear()
        {
                txtname.setText("");
                txtaddress.setText("");
                txtphone.setText("");
                txtemail.setText("");
                comboop.setSelectedItem("select");
                combodistrict.removeAllItems();
                combodistrict.addItem("select");
                combostate.setSelectedItem("select");
                comboplace.removeAllItems();
                comboplace.addItem("select");
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        btncancel = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        lbldate = new javax.swing.JLabel();
        comboop = new javax.swing.JComboBox<>();
        lblop = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtphone = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaddress = new javax.swing.JTextArea();
        lblemail = new javax.swing.JLabel();
        lbladdress = new javax.swing.JLabel();
        lblname = new javax.swing.JLabel();
        lblph = new javax.swing.JLabel();
        lbldistrictid = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        combostate = new javax.swing.JComboBox<>();
        lblstate = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        combodistrict = new javax.swing.JComboBox<>();
        lbldistrict = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        comboplace = new javax.swing.JComboBox<>();
        lblcity = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1370, 1370));
        getContentPane().setLayout(null);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(null);

        btncancel.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        btncancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/if_cancel_326554.png"))); // NOI18N
        btncancel.setText("Cancel");
        btncancel.setMaximumSize(new java.awt.Dimension(61, 25));
        btncancel.setMinimumSize(new java.awt.Dimension(61, 25));
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });
        jPanel4.add(btncancel);
        btncancel.setBounds(580, 10, 110, 30);

        btnedit.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        btnedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/if_edit2_1167984.png"))); // NOI18N
        btnedit.setText("Save");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });
        jPanel4.add(btnedit);
        btnedit.setBounds(350, 10, 100, 30);

        btndelete.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        btndelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/if_ic_delete_48px_352303.png"))); // NOI18N
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        jPanel4.add(btndelete);
        btndelete.setBounds(460, 10, 100, 30);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 400, 1180, 60);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(null);

        jLabel11.setFont(new java.awt.Font("PMingLiU", 1, 14)); // NOI18N
        jLabel11.setText("ID");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(40, 80, 120, 20);

        lbldate.setFont(new java.awt.Font("PMingLiU", 1, 14)); // NOI18N
        lbldate.setText("date");
        jPanel2.add(lbldate);
        lbldate.setBounds(910, 80, 200, 20);

        comboop.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        comboop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        comboop.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboopItemStateChanged(evt);
            }
        });
        jPanel2.add(comboop);
        comboop.setBounds(170, 80, 220, 30);

        lblop.setBackground(new java.awt.Color(0, 0, 255));
        lblop.setFont(new java.awt.Font("Palatino Linotype", 1, 12)); // NOI18N
        lblop.setText("no");
        jPanel2.add(lblop);
        lblop.setBounds(430, 80, 110, 30);

        jLabel12.setFont(new java.awt.Font("Plantagenet Cherokee", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("ACTYMED | EDIT VENDORS");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(100, 20, 790, 50);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1180, 130);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Basic Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Georgia", 0, 11))); // NOI18N
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel2.setText("Name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 40, 110, 30);

        txtemail.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        txtemail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtemailFocusGained(evt);
            }
        });
        jPanel1.add(txtemail);
        txtemail.setBounds(140, 220, 240, 30);

        jLabel3.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel3.setText("Address");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 100, 80, 30);

        jLabel6.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel6.setText("Phone Number");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 170, 100, 30);

        jLabel7.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel7.setText("Email");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(20, 220, 110, 30);

        txtname.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        txtname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtnameFocusGained(evt);
            }
        });
        jPanel1.add(txtname);
        txtname.setBounds(140, 40, 240, 30);

        txtphone.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        txtphone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtphoneFocusGained(evt);
            }
        });
        jPanel1.add(txtphone);
        txtphone.setBounds(140, 170, 240, 30);

        txtaddress.setColumns(20);
        txtaddress.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        txtaddress.setRows(5);
        txtaddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtaddressFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(txtaddress);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(140, 90, 240, 60);

        lblemail.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        lblemail.setForeground(new java.awt.Color(255, 0, 0));
        lblemail.setText("Enter Email");
        jPanel1.add(lblemail);
        lblemail.setBounds(390, 220, 170, 40);

        lbladdress.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        lbladdress.setForeground(new java.awt.Color(255, 0, 0));
        lbladdress.setText("Enter Address");
        jPanel1.add(lbladdress);
        lbladdress.setBounds(390, 110, 170, 30);

        lblname.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        lblname.setForeground(new java.awt.Color(255, 0, 0));
        lblname.setText("Enter Name");
        jPanel1.add(lblname);
        lblname.setBounds(390, 40, 170, 30);

        lblph.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        lblph.setForeground(new java.awt.Color(255, 0, 0));
        lblph.setText("Enter Phone number");
        jPanel1.add(lblph);
        lblph.setBounds(390, 170, 170, 40);
        jPanel1.add(lbldistrictid);
        lbldistrictid.setBounds(470, 500, 150, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 130, 530, 270);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Location", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Georgia", 0, 11))); // NOI18N
        jPanel6.setLayout(null);

        jLabel8.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel8.setText("State");
        jPanel6.add(jLabel8);
        jLabel8.setBounds(30, 40, 120, 40);

        combostate.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        combostate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select" }));
        combostate.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combostateItemStateChanged(evt);
            }
        });
        combostate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                combostateFocusGained(evt);
            }
        });
        jPanel6.add(combostate);
        combostate.setBounds(160, 50, 240, 30);

        lblstate.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        lblstate.setForeground(new java.awt.Color(255, 0, 0));
        lblstate.setText("Select State");
        jPanel6.add(lblstate);
        lblstate.setBounds(410, 50, 170, 30);

        jLabel9.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel9.setText("District");
        jPanel6.add(jLabel9);
        jLabel9.setBounds(40, 100, 110, 40);

        combodistrict.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        combodistrict.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select" }));
        combodistrict.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combodistrictItemStateChanged(evt);
            }
        });
        combodistrict.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                combodistrictFocusGained(evt);
            }
        });
        jPanel6.add(combodistrict);
        combodistrict.setBounds(160, 100, 240, 30);

        lbldistrict.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        lbldistrict.setForeground(new java.awt.Color(255, 0, 0));
        lbldistrict.setText("Select District");
        jPanel6.add(lbldistrict);
        lbldistrict.setBounds(410, 100, 170, 30);

        jLabel10.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel10.setText("City");
        jPanel6.add(jLabel10);
        jLabel10.setBounds(40, 150, 100, 40);

        comboplace.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        comboplace.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select" }));
        comboplace.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                comboplaceFocusGained(evt);
            }
        });
        jPanel6.add(comboplace);
        comboplace.setBounds(160, 150, 240, 30);

        lblcity.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        lblcity.setForeground(new java.awt.Color(255, 0, 0));
        lblcity.setText("Select City");
        jPanel6.add(lblcity);
        lblcity.setBounds(410, 140, 170, 40);

        getContentPane().add(jPanel6);
        jPanel6.setBounds(530, 130, 650, 270);

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/Actymed billing.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -100, 1360, 960);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        clear();
        comboop.removeAllItems();
        comboop.addItem("select");
        lblname.setVisible(false);
        lbladdress.setVisible(false);
        lblstate.setVisible(false); 
        lbldistrict.setVisible(false);
        lblemail.setVisible(false);
        lblcity.setVisible(false);
        lblph.setVisible(false);
        fillid();
    }//GEN-LAST:event_btncancelActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
      String name,address,phone,email,statename,districtname,placename;
        int iname,iaddress,iphone,iemail,igender,istatename,idistrictname,iplacename;
        int fl=0;
        name=txtname.getText();
        address=txtaddress.getText();
        phone=txtphone.getText();
        email=txtemail.getText();
        statename=combostate.getSelectedItem().toString();
        districtname=combodistrict.getSelectedItem().toString();
        placename=comboplace.getSelectedItem().toString();       
        iname=name.length();
        if(iname==0)     
        {
         fl=1;
         lblname.setVisible(true);
        }
        iaddress=address.length();
        if(iaddress==0)     
        {
         fl=1;
         lbladdress.setVisible(true);
        } 
        iphone=phone.length();
        if(iphone==0)     
        {
         fl=1;
         lblph.setVisible(true);
        }
        iemail=email.length();
        if(iemail==0)     
        {
         fl=1;
         lblemail.setVisible(true);
        }
        if(statename.equals("select"))
        {
            fl=1;
            lblstate.setVisible(true);
        }
        if(districtname.equals("select"))
        {
            fl=1;
            lbldistrict.setVisible(true);
        }        
        int placeid=0;
        placename=comboplace.getSelectedItem().toString();
        if(placename.equals("select"))
        {
            fl=1;
            lblcity.setVisible(true);
        }       
        if(fl==0)
        {
            try
            {
                updatedata();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btneditActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        deletedata();
    }//GEN-LAST:event_btndeleteActionPerformed

    private void comboopItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboopItemStateChanged
        try
        {
            MysqlConnection db = new MysqlConnection();
            String op=comboop.getSelectedItem().toString();
            lblop.setText(op);
            pst=db.connection.prepareStatement("select * from hms_vendorsregistration o\n" +
"inner join hms_place p on p.place_id=o.place_id\n" +
"inner join hms_district d on p.district_id=d.district_id\n" +
"inner join hms_state s on s.state_id=d.state_id where o.vendor_id=?" );
            pst.setString(1, op);
            rs=pst.executeQuery();
            while(rs.next())
            {
                txtname.setText(rs.getString("vendor_name"));
                txtaddress.setText(rs.getString("vendor_address"));
                txtphone.setText(rs.getString("vendor_phone"));
                txtemail.setText(rs.getString("vendor_email"));
                combostate.setSelectedItem(rs.getString("state_name"));
                combodistrict.setSelectedItem(rs.getString("district_name"));
                comboplace.setSelectedItem(rs.getString("place_name"));
            }
        }
        catch(Exception e)
        {

        }
    }//GEN-LAST:event_comboopItemStateChanged

    private void txtemailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtemailFocusGained
        lblemail.setVisible(false);
    }//GEN-LAST:event_txtemailFocusGained

    private void txtnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnameFocusGained
        lblname.setVisible(false);
    }//GEN-LAST:event_txtnameFocusGained

    private void txtphoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtphoneFocusGained
        lblph.setVisible(false);
    }//GEN-LAST:event_txtphoneFocusGained

    private void txtaddressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtaddressFocusGained
        lbladdress.setVisible(false);
    }//GEN-LAST:event_txtaddressFocusGained

    private void combostateItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combostateItemStateChanged
        try
        {
            MysqlConnection db = new MysqlConnection();
            int state=combostate.getSelectedIndex();
            pst=db.connection.prepareStatement("SELECT * from hms_district where state_id=?" );
            pst.setInt(1, state);
            rs=pst.executeQuery();
            while(rs.next())
            {
                combodistrict.addItem(rs.getString("district_name"));
            }
        }
        catch(Exception e)
        {
        }
    }//GEN-LAST:event_combostateItemStateChanged

    private void combostateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_combostateFocusGained
        lblstate.setVisible(false);
    }//GEN-LAST:event_combostateFocusGained

    private void combodistrictItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combodistrictItemStateChanged
        try
        {
            int districtid=0;
            String districtname;
            comboplace.removeAllItems();
            districtname=combodistrict.getSelectedItem().toString();
            MysqlConnection db = new MysqlConnection();
            pst=db.connection.prepareStatement("SELECT * from hms_district where district_name=?");
            pst.setString(1, districtname);
            rs=pst.executeQuery();
            while(rs.next())
            {
                districtid=rs.getInt(1);
                lbldistrictid.setText(""+districtid);
                String si=lbldistrictid.getText();
                sid=Integer.parseInt(si);
            }
            pst=db.connection.prepareStatement("SELECT * from hms_place where district_id='"+sid+"' " );
            rs=pst.executeQuery();
            while(rs.next())
            {
                comboplace.addItem(rs.getString("place_name"));
            }
        }
        catch(Exception e)
        {
        }
    }//GEN-LAST:event_combodistrictItemStateChanged

    private void combodistrictFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_combodistrictFocusGained
        lbldistrict.setVisible(false);
    }//GEN-LAST:event_combodistrictFocusGained

    private void comboplaceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_comboplaceFocusGained
        lblcity.setVisible(false);
    }//GEN-LAST:event_comboplaceFocusGained
public void deletedata() {
       try
       {
       
        MysqlConnection db = new MysqlConnection();
        Statement st = db.connection.createStatement();
        String op=comboop.getSelectedItem().toString();
        lblop.setText(op);
        String del = "delete from hms_vendorsregistration where vendor_id='"+lblop.getText()+"'";        
      boolean b = db.update(del);         
       if (b) {
           JOptionPane.showMessageDialog(null, "Row deleted Successfully");
            clear();
            comboop.removeAllItems();
                comboop.addItem("select");
                fillid();
        } else {
            JOptionPane.showMessageDialog(null, "deletion failed");
        }
       }catch(Exception e)
       {
           System.out.println(e);
       }
    }
 void updatedata() {
       try
       {
        int placeid=0;
        String placename;
        placename=comboplace.getSelectedItem().toString();
        MysqlConnection db = new MysqlConnection();
        pst=db.connection.prepareStatement("SELECT * from hms_place where place_name=?");
        pst.setString(1, placename);
        rs=pst.executeQuery();
        while(rs.next())
        {
        placeid=rs.getInt(1);
        }  
        String up = "UPDATE hms_vendorsregistration SET vendor_name='" + txtname.getText() + "',vendor_address='" + txtaddress.getText() + "',vendor_phone='" + txtphone.getText() + "',vendor_email='"+txtemail.getText()+"',place_id='"+placeid+"'  where vendor_id='" + lblop.getText() + "'";
        boolean b =db.update(up);
        if (b) {
            JOptionPane.showMessageDialog(null, "Row Updated Successfully");
            clear();
            comboop.removeAllItems();
                comboop.addItem("select");
                fillid();
        } else {
            JOptionPane.showMessageDialog(null, "Updation failed");
        }
       }catch(Exception e)
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
            java.util.logging.Logger.getLogger(EditVendor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditVendor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditVendor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditVendor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new EditVendor().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(EditVendor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnedit;
    private javax.swing.JComboBox<String> combodistrict;
    private javax.swing.JComboBox<String> comboop;
    private javax.swing.JComboBox<String> comboplace;
    private javax.swing.JComboBox<String> combostate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbladdress;
    private javax.swing.JLabel lblcity;
    private javax.swing.JLabel lbldate;
    private javax.swing.JLabel lbldistrict;
    private javax.swing.JLabel lbldistrictid;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblop;
    private javax.swing.JLabel lblph;
    private javax.swing.JLabel lblstate;
    private javax.swing.JTextArea txtaddress;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtphone;
    // End of variables declaration//GEN-END:variables
}
