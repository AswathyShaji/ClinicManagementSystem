package hms;
import connection.MysqlConnection;
import java.awt.print.PrinterException;
import java.sql.*;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Billing extends javax.swing.JFrame {

    //Variable declarations
    
    PreparedStatement pst=null;
    PreparedStatement pst1=null;
    ResultSet rs=null; 
    int doc_id=0,treat_id=0,billid=0;
    String d;
    public void dbconnection() throws SQLException
     {
     MysqlConnection db = new MysqlConnection();
     Statement st = db.connection.createStatement();     
     }
    public Billing() {
        initComponents();
        //For current date
        DateFormat dateformat=new SimpleDateFormat("YYYY-MM-dd");
        java.util.Date date=new java.util.Date();
         d=dateformat.format(date);
        lbldate.setText(d); 
        selectop();
        generateBillNo();
    }
    public void selectop()
    {
        try
        {
           MysqlConnection db = new MysqlConnection(); 
       String  str="select * from hms_bookingop where booking_date='"+d+"'";
        pst=db.connection.prepareStatement(str);
        rs=pst.executeQuery(str);
        while(rs.next())
        {
            cmb_op.addItem(rs.getString("op_id"));
        }
        }
        catch(Exception e)
        {System.out.println(e);}
     
    }
//    public void patientDetails()
//    {
//        try
//        {
//           MysqlConnection db = new MysqlConnection(); 
//       String  str="select * from hms_opregistration where op_id='"+cmb_op.getSelectedItem()+"'";
//        pst=db.connection.prepareStatement(str);
//        rs=pst.executeQuery(str);
//        while(rs.next())
//        {
//          jLabel8.setText(rs.getString("op_name"));
//          jLabel9.setText(rs.getString("op_address"));
//          jLabel10.setText(rs.getString("op_age"));
//          jLabel11.setText(rs.getString("op_phone"));
//          jLabel13.setText(rs.getString("op_email"));
//        }
//        }
//        catch(Exception e)
//        {System.out.println(e);}
//    }
    public void selectdoctor()
    {
        try
        {
        MysqlConnection db = new MysqlConnection(); 
        String  str="select * from hms_bookingop b,hms_employeeregistration e where b.emp_id=e.emp_id and  op_id='"+cmb_op.getSelectedItem()+"' and b.booking_date='"+d+"'";
        pst=db.connection.prepareStatement(str);
        rs=pst.executeQuery(str);
        if(rs.next())
        {
          jLabel12.setText(rs.getString("emp_name"));
          doc_id=rs.getInt("emp_id");
        }
        }
        catch(Exception e)
        {System.out.println(e);}
    
    }
public void show_medicine()
{
     try
    {
            MysqlConnection db = new MysqlConnection(); 
            String  str="select * from  hms_treatmentdetails td,hms_product p ,tbl_treatment tr  where td.item_id=p.product_id and td.treament_id=tr.treatment_id and tr.opnumber='"+cmb_op.getSelectedItem()+"'";
            pst=db.connection.prepareStatement(str);
            rs=pst.executeQuery(str);
            DefaultTableModel dtm=(DefaultTableModel) jTable2.getModel();
            dtm.setRowCount(0);
            
            int slno=0,qty,rate,total; 
            
                while (rs.next())
                {
                qty=rs.getInt("Quantity");
                rate=rs.getInt("unitprice");
                total=qty*rate;
                    
            
                dtm.addRow(new Object[]{++slno,rs.getString("item"),rs.getString("Quantity"),rs.getString("unitprice"),total});
                
                txt_pre.setText(rs.getString("prescription"));
                
                treat_id=rs.getInt("treament_id");
                }
        }
        
        catch(Exception e)
        {System.out.println(e);}
}

public void findSubtotal()
          {
               int rows=jTable2.getRowCount();
               int amt=0;
             for(int i=0;i<rows;i++)
             {
                  amt=amt+Integer.parseInt(jTable2.getValueAt(i,4).toString());
                  txt_sub.setText(""+amt);
                  txt_sum.setText(""+amt);
                  txt_net.setText(""+amt);
                  
             }
             
          }
   
public void generateBillNo()
{
        try {
            MysqlConnection db = new MysqlConnection();
            String  str="SELECT IFNULL(max(bill_no),0)+1 AS 'BID' FROM hms_bill";
            pst=db.connection.prepareStatement(str);
            rs=pst.executeQuery(str);
            if(rs.next())
            {
                billid=rs.getInt("BID");
                txt_bill.setText(""+billid);
                System.out.println(billid);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Billing.class.getName()).log(Level.SEVERE, null, ex);
        }
}
public void insertBill()
{
        try {
            
            //insert data to billmaster table .
            
            MysqlConnection db = new MysqlConnection();
            DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        
            String str1="INSERT INTO hms_bill(Bill_no,op_id,Subtotal,Othercharge,Total,discount,NetTotal,Paid,Balance,Date,treatment_id)values(?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst=db.connection.prepareStatement(str1);
            pst.setInt(1,Integer.parseInt(txt_bill.getText()));
            pst.setInt(2, Integer.parseInt((String) cmb_op.getSelectedItem()));
            pst.setInt(3,Integer.parseInt(txt_sub.getText()));
            pst.setInt(4,Integer.parseInt(txt_other.getText()) );
            pst.setInt(5, Integer.parseInt(txt_sum.getText()));
            pst.setInt(6, Integer.parseInt(txt_dis.getText()));
            pst.setInt(7, Integer.parseInt(txt_net.getText()));
            pst.setInt(8, Integer.parseInt(txt_paid.getText()));
            pst.setInt(9, Integer.parseInt(txt_balance.getText()));
            pst.setString(10, lbldate.getText());
            pst.setInt(11, treat_id);
            pst.executeUpdate();
            
            //insert data to details table
            
            
            
           JOptionPane.showMessageDialog(null,"PLEASE TAKE PRINT");
            } 
        catch (SQLException ex) {
            Logger.getLogger(Billing.class.getName()).log(Level.SEVERE, null, ex);
        }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbldate = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_bill = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txt_sub = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txt_other = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txt_sum = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_pre = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txt_paid = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txt_balance = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txt_dis = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txt_net = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtage = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtaddress = new javax.swing.JTextArea();
        jLabel26 = new javax.swing.JLabel();
        lbldistrictid = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtphone = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtcity = new javax.swing.JTextField();
        lblop = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        cmb_op = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1370, 1370));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 153));
        jLabel1.setText("ACTYMED");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(60, 20, 280, 29);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Your Talent;our care....");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(60, 50, 135, 17);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Thodupuzha");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(70, 70, 110, 17);

        jLabel5.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jLabel5.setText("04862-225644");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(60, 90, 130, 23);

        lbldate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbldate.setText("Date");
        jPanel1.add(lbldate);
        lbldate.setBounds(410, 24, 130, 20);

        jLabel6.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jLabel6.setText("Bill Number");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(410, 60, 110, 30);

        txt_bill.setEditable(false);
        txt_bill.setEnabled(false);
        jPanel1.add(txt_bill);
        txt_bill.setBounds(530, 60, 140, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 740, 110);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Amount ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Georgia", 0, 11))); // NOI18N
        jPanel3.setLayout(null);

        jLabel14.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel14.setText("SubTotal");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(380, 10, 140, 50);

        txt_sub.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        jPanel3.add(txt_sub);
        txt_sub.setBounds(520, 20, 160, 29);

        jLabel15.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel15.setText("OtherCharges");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(380, 60, 140, 30);

        txt_other.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        txt_other.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_otherKeyReleased(evt);
            }
        });
        jPanel3.add(txt_other);
        txt_other.setBounds(520, 60, 160, 32);

        jLabel16.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel16.setText("Total");
        jPanel3.add(jLabel16);
        jLabel16.setBounds(380, 100, 140, 30);

        txt_sum.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        jPanel3.add(txt_sum);
        txt_sum.setBounds(520, 100, 160, 29);

        txt_pre.setColumns(20);
        txt_pre.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        txt_pre.setRows(5);
        jScrollPane2.setViewportView(txt_pre);

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(60, 20, 256, 116);

        jButton3.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jButton3.setText("Generate Bill");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);
        jButton3.setBounds(60, 160, 130, 30);

        jLabel17.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel17.setText("Notes:");
        jPanel3.add(jLabel17);
        jLabel17.setBounds(10, 20, 60, 18);

        jLabel19.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel19.setText("Paid");
        jPanel3.add(jLabel19);
        jLabel19.setBounds(380, 220, 150, 30);

        txt_paid.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        jPanel3.add(txt_paid);
        txt_paid.setBounds(520, 220, 160, 30);

        jLabel20.setFont(new java.awt.Font("PMingLiU", 1, 14)); // NOI18N
        jLabel20.setText("Balance");
        jPanel3.add(jLabel20);
        jLabel20.setBounds(380, 260, 100, 30);

        txt_balance.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        jPanel3.add(txt_balance);
        txt_balance.setBounds(520, 260, 160, 30);

        jLabel21.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel21.setText("Discount");
        jPanel3.add(jLabel21);
        jLabel21.setBounds(380, 140, 90, 30);

        txt_dis.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        txt_dis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_disKeyReleased(evt);
            }
        });
        jPanel3.add(txt_dis);
        txt_dis.setBounds(520, 140, 160, 30);

        jLabel22.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel22.setText("NetAmount");
        jPanel3.add(jLabel22);
        jLabel22.setBounds(380, 180, 90, 30);

        txt_net.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        jPanel3.add(txt_net);
        txt_net.setBounds(520, 180, 160, 30);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 410, 740, 300);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SlNo", "Medicine", "Qty", "Rate", "Amount"
            }
        ));
        jScrollPane1.setViewportView(jTable2);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 330, 740, 80);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Administrative nformation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Georgia", 0, 11))); // NOI18N
        jPanel4.setLayout(null);

        jLabel23.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel23.setText("OP Number");
        jPanel4.add(jLabel23);
        jLabel23.setBounds(20, 40, 120, 30);

        jLabel24.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel24.setText("Address");
        jPanel4.add(jLabel24);
        jLabel24.setBounds(390, 40, 120, 40);

        jLabel25.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel25.setText("Age");
        jPanel4.add(jLabel25);
        jLabel25.setBounds(20, 120, 140, 30);

        txtname.setEditable(false);
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
        jPanel4.add(txtname);
        txtname.setBounds(160, 80, 210, 30);

        txtage.setEditable(false);
        txtage.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        txtage.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtageFocusGained(evt);
            }
        });
        jPanel4.add(txtage);
        txtage.setBounds(160, 120, 210, 30);

        txtaddress.setEditable(false);
        txtaddress.setColumns(20);
        txtaddress.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        txtaddress.setRows(5);
        txtaddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtaddressFocusGained(evt);
            }
        });
        jScrollPane3.setViewportView(txtaddress);

        jPanel4.add(jScrollPane3);
        jScrollPane3.setBounds(510, 30, 210, 50);

        jLabel26.setText("jLabel15");
        jPanel4.add(jLabel26);
        jLabel26.setBounds(320, 650, 240, 40);
        jPanel4.add(lbldistrictid);
        lbldistrictid.setBounds(470, 500, 150, 30);

        jLabel27.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel27.setText("Phone Number");
        jPanel4.add(jLabel27);
        jLabel27.setBounds(390, 90, 170, 30);

        txtphone.setEditable(false);
        txtphone.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        txtphone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtphoneFocusLost(evt);
            }
        });
        txtphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtphoneActionPerformed(evt);
            }
        });
        jPanel4.add(txtphone);
        txtphone.setBounds(510, 90, 210, 30);

        jLabel28.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel28.setText("City");
        jPanel4.add(jLabel28);
        jLabel28.setBounds(390, 130, 120, 30);

        txtcity.setEditable(false);
        txtcity.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        txtcity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtcityFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtcityFocusLost(evt);
            }
        });
        txtcity.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtcityMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtcityMouseReleased(evt);
            }
        });
        txtcity.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtcityInputMethodTextChanged(evt);
            }
        });
        txtcity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcityActionPerformed(evt);
            }
        });
        jPanel4.add(txtcity);
        txtcity.setBounds(510, 130, 210, 30);

        lblop.setBackground(new java.awt.Color(0, 0, 255));
        lblop.setFont(new java.awt.Font("Palatino Linotype", 1, 12)); // NOI18N
        lblop.setText("no");
        jPanel4.add(lblop);
        lblop.setBounds(360, 10, 110, 30);

        jButton2.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jButton2.setText("Show MedicineList");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2);
        jButton2.setBounds(330, 180, 160, 30);

        jLabel29.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel29.setText("Name");
        jPanel4.add(jLabel29);
        jLabel29.setBounds(20, 80, 120, 30);

        cmb_op.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--op--" }));
        cmb_op.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_opItemStateChanged(evt);
            }
        });
        cmb_op.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_opActionPerformed(evt);
            }
        });
        jPanel4.add(cmb_op);
        cmb_op.setBounds(160, 40, 210, 30);
        jPanel4.add(jLabel12);
        jLabel12.setBounds(510, 190, 0, 0);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 110, 740, 220);

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/Actymed billing.png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(-10, -100, 1370, 960);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmb_opItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_opItemStateChanged
        // TODO add your handling code here:
        try
        {
             MysqlConnection db = new MysqlConnection();
            String op=cmb_op.getSelectedItem().toString();       
            lblop.setText(op);
            pst=db.connection.prepareStatement("select * from hms_opregistration o\n" +
            "inner join hms_place p on p.place_id=o.place_id\n" +
            "inner join hms_district d on p.district_id=d.district_id\n" +
            "inner join hms_state s on s.state_id=d.state_id where o.op_id=?" );
            pst.setString(1, op);
            rs=pst.executeQuery();
            while(rs.next())
            {
                txtname.setText(rs.getString("op_name"));
                txtage.setText(rs.getString("op_age"));
                txtaddress.setText(rs.getString("op_address"));
                txtphone.setText(rs.getString("op_phone")); 
                txtcity.setText(rs.getString("place_name")); 
            }
        }
        catch(Exception e)
        { 
        }       
       // patientDetails();
        selectdoctor();
    }//GEN-LAST:event_cmb_opItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        show_medicine();
        findSubtotal();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txt_otherKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_otherKeyReleased
        // TODO add your handling code here:
        int subtotal=Integer.parseInt(txt_sub.getText());
        int othercharge=Integer.parseInt(txt_other.getText());
        int Total=subtotal+othercharge;
        txt_sum.setText(""+Total);
        
    }//GEN-LAST:event_txt_otherKeyReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        insertBill();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cmb_opActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_opActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_opActionPerformed

    private void txt_disKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_disKeyReleased
        //find net amount
        int ne=Integer.parseInt(txt_sum.getText());
        int dis=Integer.parseInt(txt_dis.getText());
        int netamt=ne-dis;
        txt_net.setText(""+netamt);
    }//GEN-LAST:event_txt_disKeyReleased

    private void txtnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnameFocusGained

    }//GEN-LAST:event_txtnameFocusGained

    private void txtnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnameFocusLost

    }//GEN-LAST:event_txtnameFocusLost

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed

    }//GEN-LAST:event_txtnameActionPerformed

    private void txtageFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtageFocusGained

    }//GEN-LAST:event_txtageFocusGained

    private void txtaddressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtaddressFocusGained

    }//GEN-LAST:event_txtaddressFocusGained

    private void txtphoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtphoneFocusLost

    }//GEN-LAST:event_txtphoneFocusLost

    private void txtphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtphoneActionPerformed

    private void txtcityFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcityFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcityFocusGained

    private void txtcityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcityFocusLost

    }//GEN-LAST:event_txtcityFocusLost

    private void txtcityMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcityMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcityMouseExited

    private void txtcityMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcityMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcityMouseReleased

    private void txtcityInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtcityInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcityInputMethodTextChanged

    private void txtcityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcityActionPerformed
   
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
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Billing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmb_op;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lbldate;
    private javax.swing.JLabel lbldistrictid;
    private javax.swing.JLabel lblop;
    private javax.swing.JTextField txt_balance;
    private javax.swing.JTextField txt_bill;
    private javax.swing.JTextField txt_dis;
    private javax.swing.JTextField txt_net;
    private javax.swing.JTextField txt_other;
    private javax.swing.JTextField txt_paid;
    private javax.swing.JTextArea txt_pre;
    private javax.swing.JTextField txt_sub;
    private javax.swing.JTextField txt_sum;
    private javax.swing.JTextArea txtaddress;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtcity;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtphone;
    // End of variables declaration//GEN-END:variables
}
