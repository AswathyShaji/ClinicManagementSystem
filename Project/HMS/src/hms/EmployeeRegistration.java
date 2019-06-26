package hms;
import connection.MysqlConnection;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EmployeeRegistration extends javax.swing.JFrame {
    PreparedStatement pst=null;
    ResultSet rs=null; 
    int sid =0;
    String gender=null;
    public void dbconnection() throws SQLException
     {
     MysqlConnection db = new MysqlConnection();
     Statement st = db.connection.createStatement();     
     }
 

    public EmployeeRegistration()throws SQLException {
        initComponents();
        dbconnection();
        lbldistrictid.hide();
        clear();
        show_user();
         btnmail.setEnabled(false);
          btnsms.setEnabled(false);
       // btnedit.setEnabled(false);
       // btndelete.setEnabled(false);
        DateFormat dateformat=new SimpleDateFormat("dd-MM-YYYY");
        java.util.Date date=new java.util.Date();
        String d=dateformat.format(date);
        lbldate.setText(d);
        filldesignaion();
        fillstate();
    }
    
public void filldesignaion()
{
    try
        {
            MysqlConnection db = new MysqlConnection();
            pst=db.connection.prepareStatement("SELECT designation_type from hms_designation" );
            rs=pst.executeQuery();
            while(rs.next())
            {
                combodesignation.addItem(rs.getString(1));
             
            }   
        }
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(null,"error in getting data for sate");  
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
        JOptionPane.showMessageDialog(null,"error in getting data for sate");
   
        }
    }
       
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtage = new javax.swing.JTextField();
        rdbtngender1 = new javax.swing.JRadioButton();
        rdbtngender2 = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        lblgender = new javax.swing.JLabel();
        lbldailywage = new javax.swing.JLabel();
        lblage = new javax.swing.JLabel();
        lbldistrictid = new javax.swing.JLabel();
        combodesignation = new javax.swing.JComboBox<>();
        txtdailywage = new javax.swing.JTextField();
        lblname = new javax.swing.JLabel();
        lbltype = new javax.swing.JLabel();
        lbldistrictid1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtspecialization = new javax.swing.JTextField();
        doj = new com.toedter.calendar.JDateChooser();
        jLabel18 = new javax.swing.JLabel();
        lbldoj = new javax.swing.JLabel();
        lblspecialization = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaddress = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        combostate = new javax.swing.JComboBox<>();
        lbladdress = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        combodistrict = new javax.swing.JComboBox<>();
        lbldistrict = new javax.swing.JLabel();
        lblstate = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        comboplace = new javax.swing.JComboBox<>();
        lblcity = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtphone = new javax.swing.JTextField();
        lblph = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        lblemail = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        txtpassword = new javax.swing.JTextField();
        lblusername = new javax.swing.JLabel();
        lblpassword = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnedit = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnsms = new javax.swing.JButton();
        btnmail = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        lbldate = new javax.swing.JLabel();

        jPanel5.setBackground(new java.awt.Color(81, 92, 147));
        jPanel5.setLayout(null);

        jLabel14.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 204, 255));
        jLabel14.setText("ACTYMED Centre for Orthopaedics & Sports Medicine  Run by: Sports & Games Welfare Association-Kerala");
        jPanel5.add(jLabel14);
        jLabel14.setBounds(40, 20, 980, 40);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1500, 1500));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Basic Informations", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Georgia", 0, 11))); // NOI18N
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel2.setText("Name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(70, 110, 120, 30);

        jLabel5.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel5.setText("Gender");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(70, 190, 130, 30);

        jLabel4.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel4.setText("Age");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(70, 150, 140, 30);

        txtname.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        txtname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtnameFocusGained(evt);
            }
        });
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        jPanel1.add(txtname);
        txtname.setBounds(210, 110, 240, 30);

        txtage.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        txtage.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtageFocusGained(evt);
            }
        });
        jPanel1.add(txtage);
        txtage.setBounds(210, 150, 240, 30);

        buttonGroup1.add(rdbtngender1);
        rdbtngender1.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        rdbtngender1.setText("Male");
        rdbtngender1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                rdbtngender1FocusGained(evt);
            }
        });
        jPanel1.add(rdbtngender1);
        rdbtngender1.setBounds(210, 190, 80, 25);

        buttonGroup1.add(rdbtngender2);
        rdbtngender2.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        rdbtngender2.setText("Female");
        rdbtngender2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                rdbtngender2FocusGained(evt);
            }
        });
        jPanel1.add(rdbtngender2);
        rdbtngender2.setBounds(300, 190, 90, 25);

        jLabel11.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel11.setText("Designation Type");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(70, 70, 120, 30);

        lblgender.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        lblgender.setForeground(new java.awt.Color(255, 0, 0));
        lblgender.setText("Select Gender");
        jPanel1.add(lblgender);
        lblgender.setBounds(460, 190, 170, 30);

        lbldailywage.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        lbldailywage.setForeground(new java.awt.Color(255, 0, 0));
        lbldailywage.setText("Enter Daily Wage");
        jPanel1.add(lbldailywage);
        lbldailywage.setBounds(460, 310, 170, 30);

        lblage.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        lblage.setForeground(new java.awt.Color(255, 0, 0));
        lblage.setText("Enter Age");
        jPanel1.add(lblage);
        lblage.setBounds(460, 150, 180, 30);
        jPanel1.add(lbldistrictid);
        lbldistrictid.setBounds(470, 500, 150, 30);

        combodesignation.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        combodesignation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select" }));
        combodesignation.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combodesignationItemStateChanged(evt);
            }
        });
        combodesignation.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                combodesignationFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                combodesignationFocusLost(evt);
            }
        });
        jPanel1.add(combodesignation);
        combodesignation.setBounds(210, 70, 240, 30);

        txtdailywage.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        txtdailywage.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtdailywageFocusGained(evt);
            }
        });
        jPanel1.add(txtdailywage);
        txtdailywage.setBounds(210, 310, 240, 30);

        lblname.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        lblname.setForeground(new java.awt.Color(255, 0, 0));
        lblname.setText("Enter Name");
        jPanel1.add(lblname);
        lblname.setBounds(460, 110, 170, 30);

        lbltype.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        lbltype.setForeground(new java.awt.Color(255, 0, 0));
        lbltype.setText("Select Designation Type");
        jPanel1.add(lbltype);
        lbltype.setBounds(460, 70, 170, 30);
        jPanel1.add(lbldistrictid1);
        lbldistrictid1.setBounds(470, 490, 150, 30);

        jLabel12.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel12.setText("Date Of Joining");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(70, 230, 120, 30);

        jLabel17.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel17.setText("Specialization");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(70, 270, 120, 30);

        txtspecialization.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        txtspecialization.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtspecializationFocusGained(evt);
            }
        });
        txtspecialization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtspecializationActionPerformed(evt);
            }
        });
        jPanel1.add(txtspecialization);
        txtspecialization.setBounds(210, 270, 240, 30);

        doj.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dojFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dojFocusLost(evt);
            }
        });
        doj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dojMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dojMousePressed(evt);
            }
        });
        jPanel1.add(doj);
        doj.setBounds(210, 230, 240, 30);

        jLabel18.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel18.setText("Basic Pay");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(70, 310, 120, 30);

        lbldoj.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        lbldoj.setForeground(new java.awt.Color(255, 0, 0));
        lbldoj.setText("Select Date of Joining");
        jPanel1.add(lbldoj);
        lbldoj.setBounds(460, 230, 170, 30);

        lblspecialization.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        lblspecialization.setForeground(new java.awt.Color(255, 0, 0));
        lblspecialization.setText("Enter Specialization");
        jPanel1.add(lblspecialization);
        lblspecialization.setBounds(460, 270, 170, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 120, 620, 380);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Contact Informations", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Georgia", 0, 11))); // NOI18N
        jPanel2.setLayout(null);

        txtaddress.setColumns(20);
        txtaddress.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        txtaddress.setRows(5);
        txtaddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtaddressFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(txtaddress);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(180, 30, 240, 60);

        jLabel3.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel3.setText("Address");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(40, 40, 120, 40);

        jLabel8.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel8.setText("State");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(40, 100, 100, 30);

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
            public void focusLost(java.awt.event.FocusEvent evt) {
                combostateFocusLost(evt);
            }
        });
        combostate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combostateActionPerformed(evt);
            }
        });
        jPanel2.add(combostate);
        combostate.setBounds(180, 100, 240, 30);

        lbladdress.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        lbladdress.setForeground(new java.awt.Color(255, 0, 0));
        lbladdress.setText("Enter Address");
        jPanel2.add(lbladdress);
        lbladdress.setBounds(430, 50, 170, 30);

        jLabel9.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel9.setText("District");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(40, 140, 100, 30);

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
            public void focusLost(java.awt.event.FocusEvent evt) {
                combodistrictFocusLost(evt);
            }
        });
        jPanel2.add(combodistrict);
        combodistrict.setBounds(180, 140, 240, 30);

        lbldistrict.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        lbldistrict.setForeground(new java.awt.Color(255, 0, 0));
        lbldistrict.setText("Select District");
        jPanel2.add(lbldistrict);
        lbldistrict.setBounds(430, 140, 170, 30);

        lblstate.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        lblstate.setForeground(new java.awt.Color(255, 0, 0));
        lblstate.setText("Select State");
        jPanel2.add(lblstate);
        lblstate.setBounds(430, 100, 170, 30);

        jLabel10.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel10.setText("City");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(40, 180, 90, 30);

        comboplace.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        comboplace.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select" }));
        comboplace.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                comboplaceFocusGained(evt);
            }
        });
        comboplace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboplaceActionPerformed(evt);
            }
        });
        jPanel2.add(comboplace);
        comboplace.setBounds(180, 180, 240, 30);

        lblcity.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        lblcity.setForeground(new java.awt.Color(255, 0, 0));
        lblcity.setText("Select City");
        jPanel2.add(lblcity);
        lblcity.setBounds(430, 170, 170, 40);

        jLabel6.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel6.setText("Phone Number");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(40, 220, 110, 30);

        txtphone.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        txtphone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtphoneFocusGained(evt);
            }
        });
        jPanel2.add(txtphone);
        txtphone.setBounds(180, 220, 240, 30);

        lblph.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        lblph.setForeground(new java.awt.Color(255, 0, 0));
        lblph.setText("Invalid Phone Number");
        jPanel2.add(lblph);
        lblph.setBounds(430, 220, 170, 30);

        jLabel13.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel13.setText("Email");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(40, 260, 120, 40);

        txtemail.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        txtemail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtemailFocusGained(evt);
            }
        });
        jPanel2.add(txtemail);
        txtemail.setBounds(180, 260, 240, 30);

        lblemail.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        lblemail.setForeground(new java.awt.Color(255, 0, 0));
        lblemail.setText("Invalid Email");
        jPanel2.add(lblemail);
        lblemail.setBounds(430, 260, 170, 30);

        jLabel7.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel7.setText("UserName");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(40, 300, 120, 30);

        jLabel16.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel16.setText("Password");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(40, 340, 120, 30);

        txtusername.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        txtusername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtusernameFocusGained(evt);
            }
        });
        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });
        jPanel2.add(txtusername);
        txtusername.setBounds(180, 300, 240, 30);

        txtpassword.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        txtpassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtpasswordFocusGained(evt);
            }
        });
        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });
        jPanel2.add(txtpassword);
        txtpassword.setBounds(180, 340, 240, 30);

        lblusername.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        lblusername.setForeground(new java.awt.Color(255, 0, 0));
        lblusername.setText("Enter Username");
        jPanel2.add(lblusername);
        lblusername.setBounds(430, 300, 170, 30);

        lblpassword.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        lblpassword.setForeground(new java.awt.Color(255, 0, 0));
        lblpassword.setText("Enter Password");
        jPanel2.add(lblpassword);
        lblpassword.setBounds(430, 340, 170, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(620, 120, 590, 380);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(null);

        btnedit.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        btnedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/if_edit2_1167984.png"))); // NOI18N
        btnedit.setText("Edit");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });
        jPanel4.add(btnedit);
        btnedit.setBounds(410, 20, 100, 30);

        btnsave.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        btnsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/if_3floppy_unmount_18268 (1).png"))); // NOI18N
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        jPanel4.add(btnsave);
        btnsave.setBounds(170, 20, 90, 30);

        btncancel.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        btncancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/if_cancel_326554.png"))); // NOI18N
        btncancel.setText("Cancel");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });
        jPanel4.add(btncancel);
        btncancel.setBounds(280, 20, 110, 30);

        btndelete.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        btndelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/if_ic_delete_48px_352303.png"))); // NOI18N
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        jPanel4.add(btndelete);
        btndelete.setBounds(530, 20, 100, 30);

        btnsms.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        btnsms.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/Mobile-Sms-icon.png"))); // NOI18N
        btnsms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsmsActionPerformed(evt);
            }
        });
        jPanel4.add(btnsms);
        btnsms.setBounds(650, 20, 90, 30);

        btnmail.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        btnmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/if_81_171440.png"))); // NOI18N
        btnmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmailActionPerformed(evt);
            }
        });
        jPanel4.add(btnmail);
        btnmail.setBounds(750, 20, 100, 30);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 500, 1210, 70);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "View Employees", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Georgia", 0, 11))); // NOI18N
        jPanel7.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sl.no", "Name", "Age", "Address", "City", "Phone Number", "Email", "Date of Joining", "Designation", "Specialization", "Daily Wage"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, true, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jPanel7.add(jScrollPane2);
        jScrollPane2.setBounds(20, 30, 1150, 340);

        getContentPane().add(jPanel7);
        jPanel7.setBounds(0, 570, 1210, 410);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel8.setLayout(null);
        getContentPane().add(jPanel8);
        jPanel8.setBounds(1210, -10, 180, 990);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.setLayout(null);

        jLabel15.setFont(new java.awt.Font("Plantagenet Cherokee", 1, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("ACTYMED | EMPLOYEE REGISTRATION");
        jPanel6.add(jLabel15);
        jLabel15.setBounds(100, 40, 790, 50);

        lbldate.setFont(new java.awt.Font("PMingLiU", 1, 14)); // NOI18N
        lbldate.setText("date");
        jPanel6.add(lbldate);
        lbldate.setBounds(930, 50, 200, 20);

        getContentPane().add(jPanel6);
        jPanel6.setBounds(0, 0, 1210, 120);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        

    }//GEN-LAST:event_txtnameActionPerformed

    private void combodesignationItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combodesignationItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_combodesignationItemStateChanged

    private void combodesignationFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_combodesignationFocusGained
        lbltype.setVisible(false);
    }//GEN-LAST:event_combodesignationFocusGained

    private void combodesignationFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_combodesignationFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_combodesignationFocusLost
public void clear()
{
        lblname.setVisible(false);
        lbladdress.setVisible(false);
        lblage.setVisible(false);
        lblstate.setVisible(false);
        lblgender.setVisible(false);
        lbldistrict.setVisible(false);
        lblcity.setVisible(false);
        lbltype.setVisible(false);
        lbldailywage.setVisible(false);
        lblph.setVisible(false);
        lblemail.setVisible(false);
        lbldoj.setVisible(false);
        lblspecialization.setVisible(false);
        lblusername.setVisible(false);
        lblpassword.setVisible(false);  
}
public void clearall()
        {
                txtname.setText("");
                txtage.setText("");
                txtaddress.setText("");
                txtphone.setText("");
                txtemail.setText("");
                combodesignation.setSelectedItem("select");
                combodistrict.removeAllItems();
                combodistrict.addItem("select");
                combostate.setSelectedItem("select");
                comboplace.removeAllItems();
                comboplace.addItem("select");
                buttonGroup1.clearSelection();
                txtdailywage.setText("");
                txtusername.setText("");
                txtpassword.setText("");
                txtspecialization.setText("");
                doj.setCalendar(null);
        }
    private void txtnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnameFocusGained
        lblname.setVisible(false);
    }//GEN-LAST:event_txtnameFocusGained

    private void txtageFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtageFocusGained
       lblage.setVisible(false);
    }//GEN-LAST:event_txtageFocusGained

    private void rdbtngender1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rdbtngender1FocusGained
        lblgender.setVisible(false);
    }//GEN-LAST:event_rdbtngender1FocusGained

    private void rdbtngender2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rdbtngender2FocusGained
       lblgender.setVisible(false);
    }//GEN-LAST:event_rdbtngender2FocusGained

    private void txtaddressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtaddressFocusGained
       lbladdress.setVisible(false);
    }//GEN-LAST:event_txtaddressFocusGained

    private void txtphoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtphoneFocusGained
        lblph.setVisible(false);
    }//GEN-LAST:event_txtphoneFocusGained

    private void txtemailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtemailFocusGained
        lblemail.setVisible(false);
    }//GEN-LAST:event_txtemailFocusGained

    private void txtdailywageFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtdailywageFocusGained
        lbldailywage.setVisible(false);
    }//GEN-LAST:event_txtdailywageFocusGained

    private void combostateItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combostateItemStateChanged
        try
        {

            MysqlConnection db = new MysqlConnection();
            int state=combostate.getSelectedIndex();
            //combodistrict.removeAllItems();
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

    private void combostateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_combostateFocusLost
       
    }//GEN-LAST:event_combostateFocusLost

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

    private void combodistrictFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_combodistrictFocusLost
       
    }//GEN-LAST:event_combodistrictFocusLost

    private void comboplaceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_comboplaceFocusGained
        lblcity.setVisible(false);
    }//GEN-LAST:event_comboplaceFocusGained

    private void comboplaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboplaceActionPerformed

    }//GEN-LAST:event_comboplaceActionPerformed

    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusernameActionPerformed

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasswordActionPerformed

    private void txtspecializationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtspecializationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtspecializationActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        try
        {
        EditEmployee bo=new EditEmployee();
        bo.show();
        
        }
        catch(Exception e)
        {
            
        }      
    }//GEN-LAST:event_btneditActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        String name, address, phone, email, statename, districtname, placename, type, wage, age, specilization,username,password;
        int iname, iaddress, iphone, iemail, igender, istatename, idistrictname, iplacename, itype, iwage, iage,ijoiningdate,ispecilization,iusername,ipassword;
        int fl = 0;
         String date=null;
        name = txtname.getText();
        address = txtaddress.getText();
        phone = txtphone.getText();
        email = txtemail.getText();
        statename = combostate.getSelectedItem().toString();
        districtname = combodistrict.getSelectedItem().toString();
        placename = comboplace.getSelectedItem().toString();
        type = combodesignation.getSelectedItem().toString();
        wage = txtdailywage.getText();
        age = txtage.getText(); 
        specilization = txtspecialization.getText();
        username=txtusername.getText();
        password=txtpassword.getText();
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
            lblph.setVisible(true);
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
        iname = name.length();
        if (iname == 0) {
            fl = 1;
            lblname.setVisible(true);
        }
        iaddress=address.length();
        if(iaddress==0)     
        {
         fl=1;
         lbladdress.setVisible(true);
        }        if (rdbtngender1.isSelected()==true) {
            gender = "male";
        }
        else if (rdbtngender2.isSelected()==true) {
            gender = "female";
        }
        else
        {
            fl=1;
            lblgender.setVisible(true);
        }
        iphone = phone.length();
        if (iphone==0) {
            fl = 1;
            lblph.setVisible(true);
        }
        iemail = email.length();
        if (iemail==0) {
            fl = 1;
            lblemail.setVisible(true);
        }
        if (statename.equals("select")) {
            fl = 1;
            lblstate.setVisible(true);
        }
        if (districtname.equals("select")) {
            fl = 1;
            lbldistrict.setVisible(true);
        }
        iwage = wage.length();
        if (iwage == 0) {
            fl = 1;
            lbldailywage.setVisible(true);
        }
        iage = age.length();
        if (iage==0) {
            fl = 1;
            lblage.setVisible(true);
        }
        ispecilization = specilization.length();
        if (ispecilization==0) {
            fl = 1;
            lblspecialization.setVisible(true);
        }
        iusername = username.length();
        if (iusername == 0) {
            fl = 1;
            lblusername.setVisible(true);
        }
        ipassword = password.length();
        if (ipassword == 0) {
            fl = 1;
            lblpassword.setVisible(true);
        }
        int placeid = 0;
        placename = comboplace.getSelectedItem().toString();
        if (placename.equals("select")) {
            fl = 1;
            lblcity.setVisible(true);
        }
        try {
            MysqlConnection db = new MysqlConnection();
            pst = db.connection.prepareStatement("SELECT * from hms_place where place_name=?");
            pst.setString(1, placename);
            rs = pst.executeQuery();
            while (rs.next()) {
                placeid = rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        int designationid = 0;
        type = combodesignation.getSelectedItem().toString();
        if (type.equals("select")) {

            lbltype.setVisible(true);
        }
        try {
            MysqlConnection db = new MysqlConnection();
            pst = db.connection.prepareStatement("SELECT * from hms_designation where designation_type=?");
            pst.setString(1, type);
            rs = pst.executeQuery();
            while (rs.next()) {
                designationid = rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
       
        if(doj.getDate()==null){
    fl = 1;
            lbldoj.setVisible(true);
}
        

        if (fl == 0) {
            try {
                 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        date = sdf.format(doj.getDate());
                MysqlConnection db = new MysqlConnection();
                PreparedStatement pst = db.connection.prepareStatement("insert into hms_employeeregistration(emp_name,emp_gender,emp_phone,emp_email,emp_address,place_id,designation_id,emp_wage,emp_age,emp_doj,emp_specialization,emp_username,emp_password)values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
                pst.setString(1, name);
                pst.setString(2, gender);
                pst.setString(3, phone);
                pst.setString(4, email);
                pst.setString(5, address);
                pst.setInt(6, placeid);
                pst.setInt(7, designationid);
                pst.setString(8, wage);
                pst.setString(9, age);
                pst.setString(10, date);
                pst.setString(11, specilization);
                pst.setString(12, username);
                pst.setString(13, password);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "SAVED SUCCESSFULLY");
                //fillgrid();
                
               clearall();

                show_user();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }        
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
       clearall();
       clear();
    }//GEN-LAST:event_btncancelActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        try
        {
        EditEmployee bo=new EditEmployee();
        bo.show();
        
        }
        catch(Exception e)
        {
            
        }       
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnsmsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsmsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsmsActionPerformed

    private void btnmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnmailActionPerformed

    private void dojFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dojFocusGained

        
    }//GEN-LAST:event_dojFocusGained

    private void txtspecializationFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtspecializationFocusGained
        lblspecialization.setVisible(false);
     
    }//GEN-LAST:event_txtspecializationFocusGained

    private void txtusernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtusernameFocusGained
        lblusername.setVisible(false);
       
    }//GEN-LAST:event_txtusernameFocusGained

    private void txtpasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpasswordFocusGained
        lblpassword.setVisible(false);
    }//GEN-LAST:event_txtpasswordFocusGained

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

    }//GEN-LAST:event_jTable1MouseClicked

    private void combostateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combostateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combostateActionPerformed

    private void dojMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dojMouseClicked
lbldoj.setVisible(false);
    }//GEN-LAST:event_dojMouseClicked

    private void dojMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dojMousePressed
        // TODO add your handling code here:
        lbldoj.setVisible(false);
    }//GEN-LAST:event_dojMousePressed

    private void dojFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dojFocusLost
        // TODO add your handling code here:
        if(doj.getDate()!=null)
        {
            lbldoj.setVisible(false);
        }
    }//GEN-LAST:event_dojFocusLost
public void show_user() 
{
        try {
                DefaultTableModel dtm=(DefaultTableModel) jTable1.getModel();
                dtm.setRowCount(0);
                int slno=0; 
                MysqlConnection db = new MysqlConnection();
                Statement st = db.connection.createStatement();
                ResultSet rs=st.executeQuery("select e.emp_name,e.emp_age,e.emp_address,p.place_name,e.emp_phone,e.emp_email,e.emp_doj,d.designation_type,e.emp_specialization,e.emp_wage from hms_employeeregistration e\n" +
"inner join hms_place p on p.place_id=e.place_id\n" +
"inner join hms_designation d on d.designation_id=e.designation_id");
                while (rs.next())
                {
                dtm.addRow(new Object[]{++slno,rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10)});
                }
        } 
        catch (SQLException ex) {
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
            java.util.logging.Logger.getLogger(EmployeeRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new EmployeeRegistration().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(EmployeeRegistration.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnmail;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnsms;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> combodesignation;
    private javax.swing.JComboBox<String> combodistrict;
    private javax.swing.JComboBox<String> comboplace;
    private javax.swing.JComboBox<String> combostate;
    private com.toedter.calendar.JDateChooser doj;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbladdress;
    private javax.swing.JLabel lblage;
    private javax.swing.JLabel lblcity;
    private javax.swing.JLabel lbldailywage;
    private javax.swing.JLabel lbldate;
    private javax.swing.JLabel lbldistrict;
    private javax.swing.JLabel lbldistrictid;
    private javax.swing.JLabel lbldistrictid1;
    private javax.swing.JLabel lbldoj;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lblgender;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblpassword;
    private javax.swing.JLabel lblph;
    private javax.swing.JLabel lblspecialization;
    private javax.swing.JLabel lblstate;
    private javax.swing.JLabel lbltype;
    private javax.swing.JLabel lblusername;
    private javax.swing.JRadioButton rdbtngender1;
    private javax.swing.JRadioButton rdbtngender2;
    private javax.swing.JTextArea txtaddress;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtdailywage;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtpassword;
    private javax.swing.JTextField txtphone;
    private javax.swing.JTextField txtspecialization;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
