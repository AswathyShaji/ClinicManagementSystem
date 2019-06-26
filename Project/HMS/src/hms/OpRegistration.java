package hms;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import javax.swing.JOptionPane;
import connection.MysqlConnection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import java.util.regex.*;
import javax.swing.table.DefaultTableModel;

public class OpRegistration extends javax.swing.JFrame {
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
 
    public OpRegistration() throws SQLException {
        dbconnection();
          initComponents(); 
        lbldistrictid.hide();
        lblname.setVisible(false);
        lbladdress.setVisible(false);
        lblage.setVisible(false);
        lblstate.setVisible(false);
        lblgender.setVisible(false);
        lbldistrict.setVisible(false);
        lblcity.setVisible(false);
        lblemail.setVisible(false);
         lblphone.setVisible(false);
       // btnedit.setEnabled(false);
       // btndelete.setEnabled(false);
        fillstate();
        fillopno();
        DateFormat dateformat=new SimpleDateFormat("dd-MM-YYYY");
        java.util.Date date=new java.util.Date();
         d=dateformat.format(date);
        lbldate.setText(d);
        show_user();
     
    }
    
    public void fillopno()
    {
        try
        {
            MysqlConnection db = new MysqlConnection();
            pst=db.connection.prepareStatement("SELECT MAX(op_id) as maximum from hms_opregistration" );
            rs=pst.executeQuery();
            while(rs.next())
            {
                int op=rs.getInt("maximum");
                int opno=op+1;
                
                String opo=String.valueOf(opno);
                lblop.setText(opo);
             
            }       
        }
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(null,"error in getting data for Op");
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
        JOptionPane.showMessageDialog(null,"error in getting data for state");
   
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtage = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaddress = new javax.swing.JTextArea();
        rdbtngender3 = new javax.swing.JRadioButton();
        rdbtngender1 = new javax.swing.JRadioButton();
        rdbtngender2 = new javax.swing.JRadioButton();
        lblgender = new javax.swing.JLabel();
        lblname = new javax.swing.JLabel();
        lblage = new javax.swing.JLabel();
        lbladdress = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lbldistrictid = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        lblop = new javax.swing.JLabel();
        lbldate = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtphone = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblstate = new javax.swing.JLabel();
        lbldistrict = new javax.swing.JLabel();
        lblcity = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        combostate = new javax.swing.JComboBox<>();
        combodistrict = new javax.swing.JComboBox<>();
        comboplace = new javax.swing.JComboBox<>();
        lblphone = new javax.swing.JLabel();
        lblemail = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnsave = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnsms = new javax.swing.JButton();
        btnemail = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        btnmedicine = new javax.swing.JButton();
        btnpatient = new javax.swing.JButton();
        lblname3 = new javax.swing.JLabel();
        lblname4 = new javax.swing.JLabel();
        btnpatient1 = new javax.swing.JButton();
        lblname5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1500, 1500));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Administrative nformation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Georgia", 0, 11))); // NOI18N
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel2.setText("Name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 40, 120, 30);

        jLabel3.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel3.setText("Address");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 190, 120, 40);

        jLabel5.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel5.setText("Gender");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 140, 130, 30);

        jLabel4.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel4.setText("Age");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 90, 140, 30);

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
        txtname.setBounds(160, 40, 210, 30);

        txtage.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        txtage.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtageFocusGained(evt);
            }
        });
        jPanel1.add(txtage);
        txtage.setBounds(160, 90, 210, 30);

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
        jScrollPane1.setBounds(160, 180, 210, 60);

        buttonGroup1.add(rdbtngender3);
        rdbtngender3.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        rdbtngender3.setText("Other");
        rdbtngender3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                rdbtngender3FocusGained(evt);
            }
        });
        jPanel1.add(rdbtngender3);
        rdbtngender3.setBounds(310, 140, 60, 25);

        buttonGroup1.add(rdbtngender1);
        rdbtngender1.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        rdbtngender1.setText("Male");
        rdbtngender1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                rdbtngender1FocusGained(evt);
            }
        });
        jPanel1.add(rdbtngender1);
        rdbtngender1.setBounds(160, 140, 60, 25);

        buttonGroup1.add(rdbtngender2);
        rdbtngender2.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        rdbtngender2.setText("Female");
        rdbtngender2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                rdbtngender2FocusGained(evt);
            }
        });
        jPanel1.add(rdbtngender2);
        rdbtngender2.setBounds(230, 140, 70, 25);

        lblgender.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        lblgender.setForeground(new java.awt.Color(255, 0, 0));
        lblgender.setText("Select Gender");
        jPanel1.add(lblgender);
        lblgender.setBounds(380, 140, 170, 30);

        lblname.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        lblname.setForeground(new java.awt.Color(255, 0, 0));
        lblname.setText("Enter Name");
        jPanel1.add(lblname);
        lblname.setBounds(380, 40, 170, 30);

        lblage.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        lblage.setForeground(new java.awt.Color(255, 0, 0));
        lblage.setText("Enter Age");
        jPanel1.add(lblage);
        lblage.setBounds(380, 90, 180, 30);

        lbladdress.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        lbladdress.setForeground(new java.awt.Color(255, 0, 0));
        lbladdress.setText("Enter Address");
        jPanel1.add(lbladdress);
        lbladdress.setBounds(380, 190, 170, 30);

        jLabel15.setText("jLabel15");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(320, 650, 240, 40);
        jPanel1.add(lbldistrictid);
        lbldistrictid.setBounds(470, 500, 150, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 150, 550, 270);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(null);

        jLabel11.setFont(new java.awt.Font("PMingLiU", 1, 14)); // NOI18N
        jLabel11.setText("OP Number");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(130, 20, 120, 20);

        lblop.setBackground(new java.awt.Color(0, 0, 255));
        lblop.setFont(new java.awt.Font("Palatino Linotype", 1, 12)); // NOI18N
        lblop.setText("no");
        jPanel2.add(lblop);
        lblop.setBounds(310, 10, 110, 30);

        lbldate.setFont(new java.awt.Font("PMingLiU", 1, 14)); // NOI18N
        lbldate.setText("date");
        jPanel2.add(lbldate);
        lbldate.setBounds(800, 20, 200, 20);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 100, 1180, 50);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Contact Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Georgia", 0, 11))); // NOI18N
        jPanel3.setLayout(null);

        txtphone.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        txtphone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtphoneFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtphoneFocusLost(evt);
            }
        });
        txtphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtphoneActionPerformed(evt);
            }
        });
        jPanel3.add(txtphone);
        txtphone.setBounds(170, 190, 240, 30);

        txtemail.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        txtemail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtemailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtemailFocusLost(evt);
            }
        });
        txtemail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtemailMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtemailMouseReleased(evt);
            }
        });
        txtemail.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtemailInputMethodTextChanged(evt);
            }
        });
        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        jPanel3.add(txtemail);
        txtemail.setBounds(170, 230, 240, 30);

        jLabel6.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel6.setText("Phone Number");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(80, 180, 170, 30);

        jLabel10.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel10.setText("City");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(80, 140, 120, 30);

        jLabel9.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel9.setText("District");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(80, 90, 120, 30);

        jLabel8.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel8.setText("State");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(80, 40, 80, 30);

        lblstate.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        lblstate.setForeground(new java.awt.Color(255, 0, 0));
        lblstate.setText("Select State");
        jPanel3.add(lblstate);
        lblstate.setBounds(420, 40, 110, 30);

        lbldistrict.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        lbldistrict.setForeground(new java.awt.Color(255, 0, 0));
        lbldistrict.setText("Select District");
        jPanel3.add(lbldistrict);
        lbldistrict.setBounds(420, 90, 130, 30);

        lblcity.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        lblcity.setForeground(new java.awt.Color(255, 0, 0));
        lblcity.setText("Select City");
        jPanel3.add(lblcity);
        lblcity.setBounds(420, 140, 150, 40);

        jLabel7.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel7.setText("Email");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(80, 220, 170, 30);

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
        combostate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combostateActionPerformed(evt);
            }
        });
        jPanel3.add(combostate);
        combostate.setBounds(170, 40, 240, 30);

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
        jPanel3.add(combodistrict);
        combodistrict.setBounds(170, 90, 240, 30);

        comboplace.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        comboplace.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select" }));
        comboplace.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                comboplaceFocusGained(evt);
            }
        });
        jPanel3.add(comboplace);
        comboplace.setBounds(170, 140, 240, 30);

        lblphone.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        lblphone.setForeground(new java.awt.Color(255, 0, 0));
        lblphone.setText("Invalid Phone Number");
        jPanel3.add(lblphone);
        lblphone.setBounds(420, 190, 170, 30);

        lblemail.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        lblemail.setForeground(new java.awt.Color(255, 0, 0));
        lblemail.setText("Invalid Email ID");
        jPanel3.add(lblemail);
        lblemail.setBounds(420, 230, 170, 30);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(550, 150, 630, 270);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(null);

        btnsave.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        btnsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/if_3floppy_unmount_18268 (1).png"))); // NOI18N
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        jPanel4.add(btnsave);
        btnsave.setBounds(90, 10, 90, 30);

        btnedit.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        btnedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/if_edit2_1167984.png"))); // NOI18N
        btnedit.setText("Edit");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });
        jPanel4.add(btnedit);
        btnedit.setBounds(360, 10, 100, 30);

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
        btncancel.setBounds(220, 10, 110, 30);

        btndelete.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        btndelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/if_ic_delete_48px_352303.png"))); // NOI18N
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        jPanel4.add(btndelete);
        btndelete.setBounds(500, 10, 100, 30);

        btnsms.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/Mobile-Sms-icon.png"))); // NOI18N
        jPanel4.add(btnsms);
        btnsms.setBounds(740, 10, 90, 30);

        btnemail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/if_81_171440.png"))); // NOI18N
        jPanel4.add(btnemail);
        btnemail.setBounds(620, 10, 90, 30);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 420, 1180, 50);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "View Patiet", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Georgia", 0, 11))); // NOI18N
        jPanel6.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sl.no", "OP Number", "Name", "gender", "Address", "City", "Phone Number", "Email", "Date"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jPanel6.add(jScrollPane2);
        jScrollPane2.setBounds(10, 20, 1120, 190);

        getContentPane().add(jPanel6);
        jPanel6.setBounds(0, 470, 1180, 240);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel7.setLayout(null);

        btnmedicine.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        btnmedicine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/if_shine_19_61228.png"))); // NOI18N
        btnmedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmedicineActionPerformed(evt);
            }
        });
        jPanel7.add(btnmedicine);
        btnmedicine.setBounds(0, 150, 160, 130);

        btnpatient.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        btnpatient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/Patients-icon.png"))); // NOI18N
        btnpatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpatientActionPerformed(evt);
            }
        });
        jPanel7.add(btnpatient);
        btnpatient.setBounds(0, 320, 160, 130);

        lblname3.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        lblname3.setForeground(new java.awt.Color(0, 102, 102));
        lblname3.setText("Booking");
        jPanel7.add(lblname3);
        lblname3.setBounds(10, 280, 170, 30);

        lblname4.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        lblname4.setForeground(new java.awt.Color(0, 102, 102));
        lblname4.setText("Search Patient");
        jPanel7.add(lblname4);
        lblname4.setBounds(10, 460, 170, 30);

        btnpatient1.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        btnpatient1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/if_08_61472.png"))); // NOI18N
        btnpatient1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpatient1ActionPerformed(evt);
            }
        });
        jPanel7.add(btnpatient1);
        btnpatient1.setBounds(0, 500, 160, 130);

        lblname5.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        lblname5.setForeground(new java.awt.Color(0, 102, 102));
        lblname5.setText("Billing");
        jPanel7.add(lblname5);
        lblname5.setBounds(30, 630, 170, 30);

        getContentPane().add(jPanel7);
        jPanel7.setBounds(1180, -10, 180, 720);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(null);

        jLabel12.setFont(new java.awt.Font("Plantagenet Cherokee", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("ACTYMED | OP REGISTRATION");
        jPanel5.add(jLabel12);
        jLabel12.setBounds(180, 20, 680, 50);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(0, 0, 1180, 100);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        String name,address,phone,email,statename,districtname,placename,age;
        int iname,iaddress,iphone,iemail,igender,istatename,idistrictname,iplacename,iage;
        int fl=0;
        name=txtname.getText();
        address=txtaddress.getText();
        age=txtage.getText();
        phone=txtphone.getText();
        email=txtemail.getText();
        statename=combostate.getSelectedItem().toString();
        districtname=combodistrict.getSelectedItem().toString();
        placename=comboplace.getSelectedItem().toString();
        iname=name.length();
        if(iname==0 || iname>20)     
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
        iage=age.length();
        if(iage==0)     
        {
         fl=1;
         lblage.setVisible(true);
        }
        if(rdbtngender1.isSelected()==true)
        {
           gender="male" ;
        }
        else if(rdbtngender2.isSelected()==true)
        {
            gender="female";
        }
         else if(rdbtngender3.isSelected()==true)
        {
            gender="other";
        }
        else
         {
            fl=1;
            lblgender.setVisible(true);
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
       
        try
       {
        MysqlConnection db = new MysqlConnection();
        pst=db.connection.prepareStatement("SELECT * from hms_place where place_name=?");
        pst.setString(1, placename);
        rs=pst.executeQuery();
        while(rs.next())
        {
        placeid=rs.getInt(1);
        //System.out.print(stateid);
        }  
         }
        catch(Exception e)
       {
           e.printStackTrace();
       }
        String sPhoneNumber = txtphone.getText();
        iphone=sPhoneNumber.length();
      if(iphone==0) 
      {
          fl=0;
      }
      else
      { 
        Pattern pattern = Pattern.compile("^([+][9][1]|[9][1]|[0]){0,1}([7-9]{1})([0-9]{9})$");
         Matcher matcher = pattern.matcher(sPhoneNumber);
         if (matcher.matches()) {
    	 // JOptionPane.showMessageDialog(null,"valid");
          fl=0;
            }
            else
            {
    	  lblphone.setVisible(true);
          fl=1;
            }
      }
      email=txtemail.getText();
      iemail=email.length();
      if(iemail==0) 
      {
          fl=0;
      }
      else
      {
      Pattern pattern1 ;
      String EMAIL_REGEX = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
      pattern1 = Pattern.compile(EMAIL_REGEX, Pattern.CASE_INSENSITIVE);
      Matcher matcher1 = pattern1.matcher(email);
        if (matcher1.matches()) {
    	  //JOptionPane.showMessageDialog(null,"valid");
          fl=0;
            }
            else
            {
    	     lblemail.setVisible(true);
             fl=1;
            }
      }
        if(fl==0)
        {
            try
            {
                DateFormat dateformat=new SimpleDateFormat("MM/dd/yyyy");
                java.util.Date date=new java.util.Date();
                d=dateformat.format(date);
                MysqlConnection db = new MysqlConnection();
                PreparedStatement pst=db.connection.prepareStatement("insert into hms_opregistration(op_name,op_age,op_gender,op_address,op_phone,op_email,place_id,op_date,op_regdate)values(?,?,?,?,?,?,?,?,?)");
                pst.setString(1,name);
                pst.setString(2,age);
                pst.setString(3,gender);
                pst.setString(4,address);
                pst.setString(5,phone);
                pst.setString(6,email);         
                pst.setInt(7,placeid);
                pst.setString(8,d);
                pst.setString(9,d);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null,"SAVED SUCCESSFULLY");
                clear();
                fillopno();
                show_user();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }  
    }//GEN-LAST:event_btnsaveActionPerformed
        public void clear()
        {
                txtname.setText("");
                txtage.setText("");
                txtaddress.setText("");
                txtphone.setText("");
                txtemail.setText("");
                combodistrict.removeAllItems();
                combodistrict.addItem("select");
                combostate.setSelectedItem("select");
                comboplace.removeAllItems();
                comboplace.addItem("select");
                buttonGroup1.clearSelection();           
        }
    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed

    }//GEN-LAST:event_txtnameActionPerformed

    private void txtphoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtphoneFocusLost

    }//GEN-LAST:event_txtphoneFocusLost

    private void txtnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnameFocusLost
       
    }//GEN-LAST:event_txtnameFocusLost

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        clear();
        lblname.setVisible(false);
        lbladdress.setVisible(false);
        lblage.setVisible(false);
        lblstate.setVisible(false);
        lblgender.setVisible(false);
        lbldistrict.setVisible(false);
        lblcity.setVisible(false);
         lblemail.setVisible(false);
          lblphone.setVisible(false);
    }//GEN-LAST:event_btncancelActionPerformed

    private void txtnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnameFocusGained
       lblname.setVisible(false);
    }//GEN-LAST:event_txtnameFocusGained

    private void txtageFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtageFocusGained
       lblage.setVisible(false);
    }//GEN-LAST:event_txtageFocusGained

    private void rdbtngender3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rdbtngender3FocusGained
        lblgender.setVisible(false);
    }//GEN-LAST:event_rdbtngender3FocusGained

    private void rdbtngender2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rdbtngender2FocusGained
        lblgender.setVisible(false);
    }//GEN-LAST:event_rdbtngender2FocusGained

    private void rdbtngender1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rdbtngender1FocusGained
        lblgender.setVisible(false);
    }//GEN-LAST:event_rdbtngender1FocusGained

    private void txtaddressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtaddressFocusGained
        lbladdress.setVisible(false);
    }//GEN-LAST:event_txtaddressFocusGained

    private void txtphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtphoneActionPerformed

    private void txtemailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtemailFocusLost
          
    }//GEN-LAST:event_txtemailFocusLost

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
  
    }//GEN-LAST:event_txtemailActionPerformed

    private void txtemailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtemailFocusGained
         lblemail.setVisible(false);
    }//GEN-LAST:event_txtemailFocusGained

    private void txtemailInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtemailInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailInputMethodTextChanged

    private void txtemailMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtemailMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailMouseExited

    private void txtemailMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtemailMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailMouseReleased

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
         try
        {
        EditPatient bo=new EditPatient();
        bo.show();
        
        }
        catch(Exception e)
        {
            
        }
    }//GEN-LAST:event_btneditActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        try
        {
        EditPatient bo=new EditPatient();
        bo.show();
        
        }
        catch(Exception e)
        {
            
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void combostateItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combostateItemStateChanged
        try
        {
            MysqlConnection db = new MysqlConnection();
            int state=combostate.getSelectedIndex();
           // combodistrict.removeAllItems();
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
            // int district=combodistrict.getSelectedIndex();
            pst=db.connection.prepareStatement("SELECT * from hms_place where district_id='"+sid+"' " );
            //pst.setInt(1, district);
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

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
//       viewOP();
    }//GEN-LAST:event_jTable1MouseClicked

    private void combostateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combostateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combostateActionPerformed

    private void btnmedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmedicineActionPerformed
        // TODO add your handling code here:
         try
        {
        OpBooking bo=new OpBooking();
        bo.show();
        
        }
        catch(Exception e)
        {
            
        }
    }//GEN-LAST:event_btnmedicineActionPerformed

    private void btnpatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpatientActionPerformed
        // TODO add your handling code here:
        try
        {
        SearchPatient bo=new SearchPatient();
        bo.show();
        }
        catch(Exception e)
        {
            
        }    
    }//GEN-LAST:event_btnpatientActionPerformed

    private void btnpatient1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpatient1ActionPerformed
        // TODO add your handling code here:
         try
        {
        Billing bo=new Billing();
        bo.show();
        }
        catch(Exception e)
        {
            
        }   
    }//GEN-LAST:event_btnpatient1ActionPerformed

    private void txtphoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtphoneFocusGained
       lblphone.setVisible(false);
    }//GEN-LAST:event_txtphoneFocusGained
     
 public void show_user()
    {
        try {
                DefaultTableModel dtm=(DefaultTableModel) jTable1.getModel();
                dtm.setRowCount(0);
                int slno=0; 
                MysqlConnection db = new MysqlConnection();
                Statement st = db.connection.createStatement();
                ResultSet rs=st.executeQuery("select o.op_id,o.op_name,o.op_gender,o.op_address,p.place_name,o.op_phone,o.op_email,o.op_date from hms_opregistration o\n" +
                "inner join hms_place p on p.place_id=o.place_id");
        
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

    /**}
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
            java.util.logging.Logger.getLogger(OpRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OpRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OpRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OpRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new OpRegistration().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(OpRegistration.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnemail;
    private javax.swing.JButton btnmedicine;
    private javax.swing.JButton btnpatient;
    private javax.swing.JButton btnpatient1;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnsms;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JComboBox<String> combodistrict;
    private javax.swing.JComboBox<String> comboplace;
    private javax.swing.JComboBox<String> combostate;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbladdress;
    private javax.swing.JLabel lblage;
    private javax.swing.JLabel lblcity;
    private javax.swing.JLabel lbldate;
    private javax.swing.JLabel lbldistrict;
    private javax.swing.JLabel lbldistrictid;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lblgender;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblname3;
    private javax.swing.JLabel lblname4;
    private javax.swing.JLabel lblname5;
    private javax.swing.JLabel lblop;
    private javax.swing.JLabel lblphone;
    private javax.swing.JLabel lblstate;
    private javax.swing.JRadioButton rdbtngender1;
    private javax.swing.JRadioButton rdbtngender2;
    private javax.swing.JRadioButton rdbtngender3;
    private javax.swing.JTextArea txtaddress;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtphone;
    // End of variables declaration//GEN-END:variables
}
