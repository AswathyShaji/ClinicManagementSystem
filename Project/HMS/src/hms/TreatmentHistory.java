package hms;
import connection.MysqlConnection;
import connection.MysqlConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TreatmentHistory extends javax.swing.JFrame {

    PreparedStatement pst=null;
    PreparedStatement pst1=null;
    ResultSet rs=null; 
    int _id=0,slno=0;
    int docid=0,treatmentid=0,itemid=0;
    int vendorid=0;
    int opnumber=0;
    int categoryid=0,subid=0;
    String m,a,e,n,b,af,date,prescription;
    String d;   
     public void dbconnection() throws SQLException
     {
     MysqlConnection db = new MysqlConnection();
     Statement st = db.connection.createStatement();     
     }
    public TreatmentHistory() {
        initComponents();
        fillDoctor();
        displayvendor();
        displaycategory();
       //For current date
        DateFormat dateformat=new SimpleDateFormat("YYYY-MM-dd");
        java.util.Date date=new java.util.Date();
        d=dateformat.format(date);
        lbldate.setText(d);   
        jTextField2.setVisible(false);
       }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        lbldate = new javax.swing.JLabel();
        combodoctor = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        btnsms1 = new javax.swing.JButton();
        btnsms2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtage = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtaddress = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtop = new javax.swing.JTextField();
        txtcity = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        txtheight = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtweight = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtpressure = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtcholestrol = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtsugar = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtopno7 = new javax.swing.JTextField();
        btnnew = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnsms = new javax.swing.JButton();
        cmb_blood = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        cmb_vendor = new javax.swing.JComboBox<>();
        cmb_item = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtopno6 = new javax.swing.JTextField();
        txt_qty = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jCheckBox8 = new javax.swing.JCheckBox();
        jTextField1 = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        btnnew1 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        cmb_vendor1 = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        cmb_vendor3 = new javax.swing.JComboBox<>();
        jPanel12 = new javax.swing.JPanel();
        btnnew2 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtaddress1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1370, 1370));
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(null);

        jLabel11.setFont(new java.awt.Font("PMingLiU", 1, 14)); // NOI18N
        jLabel11.setText("Choose Doctor");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(50, 10, 120, 20);

        lbldate.setFont(new java.awt.Font("PMingLiU", 1, 14)); // NOI18N
        lbldate.setText("date");
        jPanel2.add(lbldate);
        lbldate.setBounds(750, 20, 130, 20);

        combodoctor.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        combodoctor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        combodoctor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combodoctorItemStateChanged(evt);
            }
        });
        combodoctor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                combodoctorFocusGained(evt);
            }
        });
        combodoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combodoctorActionPerformed(evt);
            }
        });
        jPanel2.add(combodoctor);
        combodoctor.setBounds(190, 10, 240, 30);
        jPanel2.add(jTextField2);
        jTextField2.setBounds(560, 10, 160, 30);

        btnsms1.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        btnsms1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/if_icons_exit2_1564506.png"))); // NOI18N
        btnsms1.setText("Logout");
        btnsms1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsms1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnsms1);
        btnsms1.setBounds(1190, 10, 120, 29);

        btnsms2.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        btnsms2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/if_home_126572.png"))); // NOI18N
        btnsms2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsms2ActionPerformed(evt);
            }
        });
        jPanel2.add(btnsms2);
        btnsms2.setBounds(1060, 10, 80, 29);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1370, 50);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Medicine List", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Georgia", 0, 11))); // NOI18N
        jPanel3.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sl.no", "Medicine", "Medicinecode", "Morning", "Afternoon", "Evening", "Night", "After Food", "Before Food", "Days", "Special Treatment", "Special Treatment SubCategory"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(30, 20, 1290, 110);

        jCheckBox1.setText("jCheckBox1");
        jPanel3.add(jCheckBox1);
        jCheckBox1.setBounds(650, 370, 81, 23);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 500, 1370, 140);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Personal Informations", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Georgia", 0, 11))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(null);

        jLabel2.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel2.setText("Name");
        jPanel4.add(jLabel2);
        jLabel2.setBounds(300, 10, 120, 20);

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
        txtname.setBounds(420, 10, 210, 30);

        jLabel4.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel4.setText("Age");
        jPanel4.add(jLabel4);
        jLabel4.setBounds(10, 40, 140, 20);

        txtage.setEditable(false);
        txtage.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        txtage.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtageFocusGained(evt);
            }
        });
        jPanel4.add(txtage);
        txtage.setBounds(140, 40, 140, 30);

        jLabel3.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel3.setText("Address");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(300, 50, 120, 20);

        txtaddress.setEditable(false);
        txtaddress.setColumns(20);
        txtaddress.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        txtaddress.setRows(5);
        txtaddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtaddressFocusGained(evt);
            }
        });
        jScrollPane2.setViewportView(txtaddress);

        jPanel4.add(jScrollPane2);
        jScrollPane2.setBounds(420, 50, 210, 40);

        jLabel10.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel10.setText("City");
        jPanel4.add(jLabel10);
        jLabel10.setBounds(10, 70, 120, 40);

        jLabel7.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel7.setText("Op Number");
        jPanel4.add(jLabel7);
        jLabel7.setBounds(10, 10, 170, 30);

        txtop.setEditable(false);
        txtop.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        txtop.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtopFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtopFocusLost(evt);
            }
        });
        txtop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtopMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtopMouseReleased(evt);
            }
        });
        txtop.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtopInputMethodTextChanged(evt);
            }
        });
        txtop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtopActionPerformed(evt);
            }
        });
        jPanel4.add(txtop);
        txtop.setBounds(140, 7, 140, 30);

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
        txtcity.setBounds(140, 80, 270, 30);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 190, 650, 120);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(null);

        txtheight.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        txtheight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtheightActionPerformed(evt);
            }
        });
        jPanel5.add(txtheight);
        txtheight.setBounds(100, 10, 100, 30);

        jLabel8.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel8.setText("Height");
        jPanel5.add(jLabel8);
        jLabel8.setBounds(10, 10, 170, 30);

        txtweight.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        txtweight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtweightActionPerformed(evt);
            }
        });
        jPanel5.add(txtweight);
        txtweight.setBounds(100, 40, 100, 30);

        jLabel9.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel9.setText("Weight");
        jPanel5.add(jLabel9);
        jLabel9.setBounds(10, 40, 170, 30);

        jLabel12.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel12.setText("Blood Group");
        jPanel5.add(jLabel12);
        jLabel12.setBounds(10, 60, 100, 30);

        txtpressure.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        txtpressure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpressureActionPerformed(evt);
            }
        });
        jPanel5.add(txtpressure);
        txtpressure.setBounds(350, 10, 130, 30);

        jLabel13.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel13.setText("Blood pressure");
        jPanel5.add(jLabel13);
        jLabel13.setBounds(230, 10, 170, 30);

        jLabel14.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel14.setText("Cholestrol");
        jPanel5.add(jLabel14);
        jLabel14.setBounds(230, 40, 170, 30);

        txtcholestrol.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        txtcholestrol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcholestrolActionPerformed(evt);
            }
        });
        jPanel5.add(txtcholestrol);
        txtcholestrol.setBounds(350, 40, 130, 30);

        jLabel15.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel15.setText("Blood Sugar");
        jPanel5.add(jLabel15);
        jLabel15.setBounds(230, 70, 170, 30);

        txtsugar.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        txtsugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsugarActionPerformed(evt);
            }
        });
        jPanel5.add(txtsugar);
        txtsugar.setBounds(350, 70, 130, 30);

        jLabel17.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel17.setText("Pain Meter");
        jPanel5.add(jLabel17);
        jLabel17.setBounds(500, 10, 110, 30);

        txtopno7.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        txtopno7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtopno7ActionPerformed(evt);
            }
        });
        jPanel5.add(txtopno7);
        txtopno7.setBounds(600, 10, 80, 30);

        btnnew.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        btnnew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/if_38_62695.png"))); // NOI18N
        btnnew.setText("SAVE");
        btnnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewActionPerformed(evt);
            }
        });
        jPanel5.add(btnnew);
        btnnew.setBounds(550, 80, 100, 30);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel1);
        jPanel1.setBounds(350, 180, 650, 140);

        btnsms.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        btnsms.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/Mobile-Sms-icon.png"))); // NOI18N
        btnsms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsmsActionPerformed(evt);
            }
        });
        jPanel5.add(btnsms);
        btnsms.setBounds(420, 220, 170, 40);

        cmb_blood.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--", "A+", "B+", "O+", "B-", "AB-", "Other" }));
        jPanel5.add(cmb_blood);
        cmb_blood.setBounds(100, 70, 100, 30);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(650, 190, 720, 120);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Medicines", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Georgia", 0, 11))); // NOI18N
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(null);

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
        jPanel6.add(cmb_vendor);
        cmb_vendor.setBounds(60, 20, 140, 30);

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
        jPanel6.add(cmb_item);
        cmb_item.setBounds(270, 20, 150, 30);

        jLabel16.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel16.setText("Medicine");
        jPanel6.add(jLabel16);
        jLabel16.setBounds(210, 20, 120, 30);

        jCheckBox2.setText("Before Food");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        jPanel6.add(jCheckBox2);
        jCheckBox2.setBounds(590, 20, 100, 23);

        jCheckBox3.setText("Morning");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        jPanel6.add(jCheckBox3);
        jCheckBox3.setBounds(430, 60, 80, 23);

        jCheckBox4.setText("Afternoon");
        jPanel6.add(jCheckBox4);
        jCheckBox4.setBounds(520, 60, 90, 23);

        jCheckBox5.setText("Evening");
        jPanel6.add(jCheckBox5);
        jCheckBox5.setBounds(610, 60, 80, 23);

        jCheckBox6.setText("Night");
        jPanel6.add(jCheckBox6);
        jCheckBox6.setBounds(700, 60, 70, 23);

        jCheckBox7.setText("After Food");
        jPanel6.add(jCheckBox7);
        jCheckBox7.setBounds(700, 20, 77, 23);

        jLabel19.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel19.setText("Vendors");
        jPanel6.add(jLabel19);
        jLabel19.setBounds(10, 20, 120, 20);

        jLabel20.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel20.setText("Quantity");
        jPanel6.add(jLabel20);
        jLabel20.setBounds(140, 50, 60, 30);

        txtopno6.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        txtopno6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtopno6ActionPerformed(evt);
            }
        });
        jPanel6.add(txtopno6);
        txtopno6.setBounds(70, 50, 60, 30);

        txt_qty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_qtyActionPerformed(evt);
            }
        });
        jPanel6.add(txt_qty);
        txt_qty.setBounds(210, 50, 60, 30);

        jLabel22.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel22.setText("Days");
        jPanel6.add(jLabel22);
        jLabel22.setBounds(10, 50, 60, 30);

        jLabel24.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel24.setText("Choose Time");
        jPanel6.add(jLabel24);
        jLabel24.setBounds(310, 60, 120, 20);

        getContentPane().add(jPanel6);
        jPanel6.setBounds(0, 410, 790, 90);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Patient List", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Georgia", 0, 11))); // NOI18N
        jPanel7.setLayout(null);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sl.no", "OP Number", "Name", "gender", "Phone Number"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable2);

        jPanel7.add(jScrollPane3);
        jScrollPane3.setBounds(10, 20, 1310, 110);

        jCheckBox8.setText("jCheckBox1");
        jPanel7.add(jCheckBox8);
        jCheckBox8.setBounds(650, 370, 81, 23);

        jTextField1.setText("jTextField1");
        jPanel7.add(jTextField1);
        jTextField1.setBounds(1230, 60, 59, 20);

        getContentPane().add(jPanel7);
        jPanel7.setBounds(0, 50, 1370, 140);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Special Treatment", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Georgia", 0, 11))); // NOI18N
        jPanel8.setForeground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(null);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Prescriptions", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Georgia", 0, 11))); // NOI18N
        jPanel9.setForeground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(null);
        jPanel8.add(jPanel9);
        jPanel9.setBounds(0, 370, 1370, 130);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Prescriptions", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Georgia", 0, 11))); // NOI18N
        jPanel10.setForeground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(null);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Prescriptions", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Georgia", 0, 11))); // NOI18N
        jPanel11.setForeground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(null);
        jPanel10.add(jPanel11);
        jPanel11.setBounds(0, 370, 1370, 130);

        jPanel8.add(jPanel10);
        jPanel10.setBounds(0, 370, 1370, 130);

        btnnew1.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        btnnew1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/if_38_62695.png"))); // NOI18N
        btnnew1.setText("ADD");
        btnnew1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnew1ActionPerformed(evt);
            }
        });
        jPanel8.add(btnnew1);
        btnnew1.setBounds(270, 50, 90, 30);

        jLabel21.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel21.setText("Category");
        jPanel8.add(jLabel21);
        jLabel21.setBounds(20, 20, 120, 20);

        cmb_vendor1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Category--" }));
        cmb_vendor1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_vendor1ItemStateChanged(evt);
            }
        });
        jPanel8.add(cmb_vendor1);
        cmb_vendor1.setBounds(110, 20, 150, 30);

        jLabel23.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel23.setText("SubCategory");
        jPanel8.add(jLabel23);
        jLabel23.setBounds(280, 20, 120, 20);

        cmb_vendor3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select SubCategory--" }));
        cmb_vendor3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_vendor3ItemStateChanged(evt);
            }
        });
        jPanel8.add(cmb_vendor3);
        cmb_vendor3.setBounds(380, 20, 150, 30);

        getContentPane().add(jPanel8);
        jPanel8.setBounds(790, 410, 580, 90);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel12.setLayout(null);

        btnnew2.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        btnnew2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/if_3floppy_unmount_18268 (1).png"))); // NOI18N
        btnnew2.setText("Save History");
        btnnew2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnew2ActionPerformed(evt);
            }
        });
        jPanel12.add(btnnew2);
        btnnew2.setBounds(270, 10, 140, 40);

        getContentPane().add(jPanel12);
        jPanel12.setBounds(0, 640, 1370, 60);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Descriptions", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Georgia", 0, 11))); // NOI18N
        jPanel13.setForeground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(null);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Prescriptions", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Georgia", 0, 11))); // NOI18N
        jPanel14.setForeground(new java.awt.Color(255, 255, 255));
        jPanel14.setLayout(null);
        jPanel13.add(jPanel14);
        jPanel14.setBounds(0, 370, 1370, 130);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Prescriptions", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Georgia", 0, 11))); // NOI18N
        jPanel15.setForeground(new java.awt.Color(255, 255, 255));
        jPanel15.setLayout(null);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Prescriptions", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Georgia", 0, 11))); // NOI18N
        jPanel16.setForeground(new java.awt.Color(255, 255, 255));
        jPanel16.setLayout(null);
        jPanel15.add(jPanel16);
        jPanel16.setBounds(0, 370, 1370, 130);

        jPanel13.add(jPanel15);
        jPanel15.setBounds(0, 370, 1370, 130);

        txtaddress1.setColumns(20);
        txtaddress1.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        txtaddress1.setRows(5);
        txtaddress1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtaddress1FocusGained(evt);
            }
        });
        jScrollPane4.setViewportView(txtaddress1);

        jPanel13.add(jScrollPane4);
        jScrollPane4.setBounds(30, 20, 1080, 60);

        getContentPane().add(jPanel13);
        jPanel13.setBounds(0, 310, 1370, 100);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void combodoctorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_combodoctorFocusGained

    }//GEN-LAST:event_combodoctorFocusGained

    private void combodoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combodoctorActionPerformed

    }//GEN-LAST:event_combodoctorActionPerformed

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

    private void txtcityFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcityFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcityFocusGained

    private void txtcityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcityFocusLost
        // TODO add your handling code here:
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

    private void txtopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtopActionPerformed

    private void txtopInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtopInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_txtopInputMethodTextChanged

    private void txtopMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtopMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtopMouseReleased

    private void txtopMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtopMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_txtopMouseExited

    private void txtopFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtopFocusLost

    }//GEN-LAST:event_txtopFocusLost

    private void txtopFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtopFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtopFocusGained

    private void txtheightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtheightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtheightActionPerformed

    private void txtweightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtweightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtweightActionPerformed

    private void txtpressureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpressureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpressureActionPerformed

    private void txtcholestrolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcholestrolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcholestrolActionPerformed

    private void txtsugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsugarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsugarActionPerformed

    private void txtopno7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtopno7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtopno7ActionPerformed

    private void btnnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewActionPerformed
        insertHealthData();
    }//GEN-LAST:event_btnnewActionPerformed

    private void cmb_vendorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_vendorItemStateChanged
        selectid();
        fillitem();
      
    }//GEN-LAST:event_cmb_vendorItemStateChanged

    private void cmb_itemItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_itemItemStateChanged
        // TODO add your handling code here:
        selectitem_id();
       
    }//GEN-LAST:event_cmb_itemItemStateChanged

    private void cmb_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_itemActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cmb_itemActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void txtopno6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtopno6ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txtopno6ActionPerformed

    private void btnnew1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnew1ActionPerformed
        // TODO add your handling code here:
        if(jCheckBox3.isSelected())
        {
            m="yes";
        }
        else
        {
            m="no";
        }
       if(jCheckBox4.isSelected())
        {
            a="yes";
        }
       else
        {
            a="no";
        }
       if(jCheckBox5.isSelected())
        {
            e="yes";
        }
       else
        {
           e="no";
        }
       if(jCheckBox6.isSelected())
        {
            n="yes";
        }
       else
        {
            n="no";
        }
       if(jCheckBox2.isSelected())
        {
            b="Before";
        }
       else
        {
            b="no";
        }
       if(jCheckBox7.isSelected())
        {
            af="After";
        }
       else
        {
            af="no";
        }
           
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
       // jTable2.getColumnModel().getColumn(1).sizeWidthToFit();
        model.addRow(new Object[]{++slno,cmb_item.getSelectedItem(),itemid,m,a,e,
            n,af,b,txtopno6.getText(),cmb_vendor1.getSelectedItem(),cmb_vendor3.getSelectedItem()});
    }//GEN-LAST:event_btnnew1ActionPerformed

    private void btnnew2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnew2ActionPerformed
      //To insert Data to treatment and treatment detail table
        insertTreatment();
    }//GEN-LAST:event_btnnew2ActionPerformed

    private void cmb_vendor1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_vendor1ItemStateChanged
        // TODO add your handling code here:
        selectCategoryid();
       selectsubcategory();
                
    }//GEN-LAST:event_cmb_vendor1ItemStateChanged

    private void cmb_vendor3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_vendor3ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_vendor3ItemStateChanged

    private void txtaddress1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtaddress1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaddress1FocusGained

    private void btnsmsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsmsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsmsActionPerformed

    private void combodoctorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combodoctorItemStateChanged
        // TODO add your handling code here:
        //lbldr.setVisible(false);
        selectId();
        selectBooking();
    }//GEN-LAST:event_combodoctorItemStateChanged

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
      retrieveId();
        fillInformation();
    }//GEN-LAST:event_jTable2MouseClicked

    private void cmb_vendorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_vendorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_vendorActionPerformed

    private void btnsms1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsms1ActionPerformed
        // TODO add your handling code here:
        DoctorsHome dh=new DoctorsHome();
        dh.setVisible(true);
    }//GEN-LAST:event_btnsms1ActionPerformed

    private void btnsms2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsms2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsms2ActionPerformed

    private void txt_qtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_qtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_qtyActionPerformed
public void fillDoctor()
{
    try
        {
            MysqlConnection db = new MysqlConnection(); 
            String  str="select * from hms_employeeregistration where designation_id=1";
            pst=db.connection.prepareStatement(str);
            rs=pst.executeQuery(str);
            while(rs.next())
            {
             combodoctor.addItem(rs.getString("emp_name"));
            }
        }
            catch(Exception e)
                {System.out.println(e);}   
}
public void selectBooking()
{
    try
    {
        MysqlConnection db = new MysqlConnection(); 
        String  str="select * from  hms_bookingop b,hms_opregistration e  where e.op_id=b.op_id and   emp_id='"+docid+"' and booking_date='"+d+"'  ";
        pst=db.connection.prepareStatement(str);
        rs=pst.executeQuery(str);
        DefaultTableModel dtm=(DefaultTableModel) jTable2.getModel();
                dtm.setRowCount(0);
                int slno=0;          
                while (rs.next())
                {           
                dtm.addRow(new Object[]{++slno,rs.getString("op_id"),rs.getString("op_name"),rs.getString("op_gender"),rs.getString(4)});
                }
        }       
        catch(Exception e)
        {System.out.println(e);}
}
public void selectId()
{
    try
    {
    MysqlConnection db = new MysqlConnection(); 
       String  str="select emp_id from hms_employeeregistration  where emp_name='"+combodoctor.getSelectedItem()+"'";
        pst=db.connection.prepareStatement(str);
        rs=pst.executeQuery(str);
        if(rs.next())
        {
            docid=rs.getInt("emp_id");
            jTextField2.setText(""+docid);
        }
        }
        catch(Exception e)
        {}
} 
//Take id from grid
public void retrieveId()
{
    try
    {
                     MysqlConnection db = new MysqlConnection();
                      DefaultTableModel tm = (DefaultTableModel) jTable2.getModel();
                      int selectedIndexRow = jTable2.getSelectedRow();            
                      _id=Integer.parseInt(jTable2.getValueAt(selectedIndexRow,1).toString());
                       System.out.println(_id);
       }       
        catch(Exception e)
        {}
}
//To Access Personal informaion from table
public void fillInformation()
{
    try
    {
        MysqlConnection db = new MysqlConnection(); 
        String  str=" select * from hms_opregistration o,hms_place p where o.place_id=p.place_id and  op_id='"+_id+"' ";
        pst=db.connection.prepareStatement(str);
        rs=pst.executeQuery(str);
        while(rs.next())
        {
           txtop.setText(""+rs.getString("op_id"));
           txtname.setText(""+rs.getString("op_name"));
           txtage.setText(""+rs.getString("op_age"));
           txtcity.setText(""+rs.getString("place_name"));
           txtaddress.setText(""+rs.getString("op_address"));         
        }
        }
        catch(Exception e)
        {
        }
}
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
     public void insertHealthData()
     {
         try
        {
               opnumber=Integer.parseInt(txtop.getText());
               String height=txtheight.getText();
               String weight=txtweight.getText();
               String blood=(String) cmb_blood.getSelectedItem();
               int pressure=Integer.parseInt(txtpressure.getText());
               int  cholestrol=Integer.parseInt(txtcholestrol.getText());
               int sugar=Integer.parseInt(txtsugar.getText());               
                MysqlConnection db = new MysqlConnection();
                PreparedStatement pst=db.connection.prepareStatement("insert into hms_health(op_id,Height,Weight,Bloodgroup,BloodPressure,Cholestrol,BloodSugar,Painmeter)values(?,?,?,?,?,?,?,?)");
                pst.setInt(1,opnumber);
                pst.setString(2, height);
                pst.setString(3, weight);
                pst.setString(4, blood);
                pst.setInt(5, pressure);
                pst.setInt(6, cholestrol);
                pst.setInt(7, sugar);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null," added sucessfully");
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"error"+e);
        }
    
     }
     public void displaycategory()
   {
       try
        {
           MysqlConnection db = new MysqlConnection(); 
       String  str="select * from hms_treatmentcategory";
        pst=db.connection.prepareStatement(str);
        rs=pst.executeQuery(str);
        while(rs.next())
        {
            cmb_vendor1.addItem(rs.getString("tc_name"));
        }
        }
        catch(Exception e)
        {System.out.println(e);}
    
   }
     public void  selectCategoryid()
   {
       try
        {
           MysqlConnection db = new MysqlConnection(); 
       String  str="select * from hms_treatmentcategory where tc_name='"+cmb_vendor1.getSelectedItem()+"'";
        pst=db.connection.prepareStatement(str);
        rs=pst.executeQuery(str);
        if(rs.next())
        {
           categoryid=rs.getInt("tc_id");
           System.out.println(categoryid);
        }
        }
        catch(Exception e)
        {System.out.println(e);}
   } 
     public void selectsubcategory()     {
         try
        {
           MysqlConnection db = new MysqlConnection(); 
       String  str="select * from hms_treatmentsubcategory where tc_id='"+categoryid+"'";
        pst=db.connection.prepareStatement(str);
        rs=pst.executeQuery(str);
        cmb_vendor3.removeAllItems();
        while(rs.next())
        {
            cmb_vendor3.addItem(rs.getString("tsc_name"));
        }
        }
        catch(Exception e)
        {System.out.println(e);}
         
     }

     public void  selectSubcategoryid()
   {
       try
        {
           MysqlConnection db = new MysqlConnection(); 
       String  str="select * from hms_treatmentsubcategory where tsc_name='"+cmb_vendor3.getSelectedItem()+"'";
        pst=db.connection.prepareStatement(str);
        rs=pst.executeQuery(str);
        if(rs.next())
        {
           subid=rs.getInt("tsc_id");
           System.out.println(subid);
        }
        }
        catch(Exception e)
        {System.out.println(e);}
   } 
     
     public void insertTreatment()
     {
        try
        {               
                prescription=txtaddress1.getText();
                opnumber=Integer.parseInt(txtop.getText());
                docid=Integer.parseInt(jTextField2.getText());
                MysqlConnection db = new MysqlConnection();
                PreparedStatement pst=db.connection.prepareStatement("insert into tbl_treatment(opnumber,emp_id,date,prescription)values(?,?,?,?)");
                pst.setInt(1,opnumber);
                pst.setInt(2, docid);
                pst.setString(3, d);
                pst.setString(4, prescription);
                pst.executeUpdate();     
                
                //To retrieve Treatment id fromreatment table
                
             String  str="select treatment_id from tbl_treatment  where opnumber='"+opnumber+"'";
            pst=db.connection.prepareStatement(str);
            rs=pst.executeQuery(str);
        if(rs.next())
        {
            treatmentid=rs.getInt("treatment_id");
            System.out.println("treat"+treatmentid);
        }
         
        //INSERT DATA TO TREATMENT DETAIL TABLE
        int rows=jTable2.getRowCount();
                for(int i=0;i<rows;i++)
             {
              //  PreparedStatement pst1=db.connection.prepareStatement("insert into hms_treatmentdetails(treament_id,item,quantity,numberofdays,Morning,Afternoon,Evening,Night,AfterFood,BeforeFood,tc_id,tsc_id)values(?,?,?,?,?,?,?,?,?,?,?,?)");

 PreparedStatement pst1=db.connection.prepareStatement("insert into hms_treatmentdetails(treament_id,item_id,Quantity,numberofdays,Morning,Afternoon,Evening,Night,Afterfood,Beforefood,tc_id,tsc_id)values(?,?,?,?,?,?,?,?,?,?,?,?)");
                    pst1.setInt(1,treatmentid);
                System.out.println("hello");
                 pst1.setInt(2,itemid);
               // pst1.setInt(2, Integer.parseInt(jTable1.getValueAt(i,3).toString()));
                 pst1.setInt(3,(int) Integer.parseInt(txt_qty.getText()));
                 System.out.println("hello1");
                pst1.setInt(4,Integer.parseInt((String) jTable1.getValueAt(i,9)));
                System.out.println("hellodays");
                pst1.setString(5, (String) jTable1.getValueAt(i,4));     
                System.out.println("hello1");
                pst1.setString(6, (String) jTable1.getValueAt(i,5));
                 System.out.println("hello2");
                pst1.setString(7, (String) jTable1.getValueAt(i,6));
               pst1.setString(8,(String) jTable1.getValueAt(i,7) );
                System.out.println("hello3");
                pst1.setString(9, (String) jTable1.getValueAt(i,8));
                pst1.setString(10, (String) jTable1.getValueAt(i,9));
                 System.out.println("4");
                pst1.setInt(11, categoryid);
                pst1.setInt(12, subid);
                pst1.executeUpdate();
                 JOptionPane.showMessageDialog(null,"History Added");
             }
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"error"+e);
        }  
     }
     public void selectitem_id()
     {
         try
        {
           MysqlConnection db = new MysqlConnection(); 
       String  str="select * from hms_product where item='"+cmb_item.getSelectedItem()+"'";
        pst=db.connection.prepareStatement(str);
        System.out.println("we");
        rs=pst.executeQuery(str);
        if(rs.next())
        {
           itemid=rs.getInt("product_id");
           System.out.println("itemid="+itemid);
        }
        }
        catch(Exception e)
        {System.out.println(e);}
     
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
            java.util.logging.Logger.getLogger(TreatmentHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TreatmentHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TreatmentHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TreatmentHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TreatmentHistory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnnew;
    private javax.swing.JButton btnnew1;
    private javax.swing.JButton btnnew2;
    private javax.swing.JButton btnsms;
    private javax.swing.JButton btnsms1;
    private javax.swing.JButton btnsms2;
    private javax.swing.JComboBox<String> cmb_blood;
    private javax.swing.JComboBox<String> cmb_item;
    private javax.swing.JComboBox<String> cmb_vendor;
    private javax.swing.JComboBox<String> cmb_vendor1;
    private javax.swing.JComboBox<String> cmb_vendor3;
    private javax.swing.JComboBox<String> combodoctor;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lbldate;
    private javax.swing.JTextField txt_qty;
    private javax.swing.JTextArea txtaddress;
    private javax.swing.JTextArea txtaddress1;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtcholestrol;
    private javax.swing.JTextField txtcity;
    private javax.swing.JTextField txtheight;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtop;
    private javax.swing.JTextField txtopno6;
    private javax.swing.JTextField txtopno7;
    private javax.swing.JTextField txtpressure;
    private javax.swing.JTextField txtsugar;
    private javax.swing.JTextField txtweight;
    // End of variables declaration//GEN-END:variables
}
