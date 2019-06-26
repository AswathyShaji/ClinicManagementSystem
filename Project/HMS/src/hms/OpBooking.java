package hms;
import connection.MysqlConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class OpBooking extends javax.swing.JFrame {
    PreparedStatement pst=null;
    ResultSet rs=null; 
    public void dbconnection() throws SQLException
     {
     MysqlConnection db = new MysqlConnection();
     Statement st = db.connection.createStatement();     
     }
   
    public OpBooking() throws SQLException {
        initComponents();
        dbconnection();
        lbldate.setVisible(false);
        lbldr.setVisible(false);
        lblopno.setVisible(false);
        jLabel3.setVisible(false);
        jTextField1.setVisible(false);
        lblopdate.setVisible(false);
        lblop.setVisible(false);
        fillop();
        filldoctor();
    }
public void getdate()
    {    
        try
        {
            MysqlConnection db = new MysqlConnection();
            pst=db.connection.prepareStatement("SELECT op_regdate from hms_opregistration where op_id='"+comboop.getSelectedItem()+"'" );
            rs=pst.executeQuery();
            while(rs.next())
            {
                lblopdate.setText(rs.getString(1));             
            }
        }               
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(null,"error in getting data for sate");   
        }
    }

public void fillop()
    {
        try
        {
            MysqlConnection db = new MysqlConnection();
            pst=db.connection.prepareStatement("SELECT op_id from hms_opregistration" );
            rs=pst.executeQuery();
            while(rs.next())
            {
                comboop.addItem(rs.getString(1));            
            }           
        }
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(null,"error in getting data for sate");  
        }
    }
public void filldoctor()
    {
        try
        {
            MysqlConnection db = new MysqlConnection();
            pst=db.connection.prepareStatement("SELECT * from hms_employeeregistration where designation_id=1" );
            rs=pst.executeQuery();
            while(rs.next())
            {
                combodoctor.addItem(rs.getString("emp_name"));             
            }            
        }
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(null,"error in getting data for sate");  
        }
    }
public void getempid()
    {
        try
        {
            MysqlConnection db = new MysqlConnection();
            pst=db.connection.prepareStatement("SELECT emp_id from hms_employeeregistration where emp_name='"+combodoctor.getSelectedItem()+"'" );
            rs=pst.executeQuery();
            while(rs.next())
            {
                int id=rs.getInt("emp_id");
                jTextField1.setText(""+id);            
            }           
        }
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(null,"error in getting data for sate"); 
        }
    }

public void clear()
{
                combodoctor.removeAllItems();
                combodoctor.addItem("select");                 
        filldoctor();
                comboop.removeAllItems();
                comboop.addItem("select");
                fillop();
   jDateChooser1.setCalendar(null);
}
public void clearlabel()
{
    lbldate.setVisible(false);
    lbldr.setVisible(false);
    lblopno.setVisible(false);
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        combodoctor = new javax.swing.JComboBox<>();
        comboop = new javax.swing.JComboBox<>();
        btnbook = new javax.swing.JButton();
        lblopno = new javax.swing.JLabel();
        lbldr = new javax.swing.JLabel();
        lbldate = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        lblopdate = new javax.swing.JLabel();
        btncancel = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtage = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaddress = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        lbldistrictid = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtphone = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtcity = new javax.swing.JTextField();
        lblop = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1370, 1370));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Booking", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Georgia", 0, 11))); // NOI18N
        jPanel1.setLayout(null);

        jLabel11.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel11.setText("Doctor");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(60, 140, 120, 30);

        jLabel12.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel12.setText("OP Number");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(60, 40, 120, 30);

        jLabel13.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel13.setText("Booking Date");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(60, 90, 120, 30);

        combodoctor.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        combodoctor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
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
        jPanel1.add(combodoctor);
        combodoctor.setBounds(180, 140, 240, 30);

        comboop.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        comboop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        comboop.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboopItemStateChanged(evt);
            }
        });
        comboop.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                comboopFocusGained(evt);
            }
        });
        comboop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboopActionPerformed(evt);
            }
        });
        jPanel1.add(comboop);
        comboop.setBounds(180, 40, 240, 30);

        btnbook.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        btnbook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/if_38_62695.png"))); // NOI18N
        btnbook.setText("Book");
        btnbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbookActionPerformed(evt);
            }
        });
        jPanel1.add(btnbook);
        btnbook.setBounds(180, 210, 100, 30);

        lblopno.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        lblopno.setForeground(new java.awt.Color(255, 0, 0));
        lblopno.setText("Select Op Number");
        jPanel1.add(lblopno);
        lblopno.setBounds(430, 40, 170, 30);

        lbldr.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        lbldr.setForeground(new java.awt.Color(255, 0, 0));
        lbldr.setText("Select Doctor");
        jPanel1.add(lbldr);
        lbldr.setBounds(430, 140, 170, 30);

        lbldate.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        lbldate.setForeground(new java.awt.Color(255, 0, 0));
        lbldate.setText("Select any Date");
        jPanel1.add(lbldate);
        lbldate.setBounds(430, 90, 180, 30);

        jDateChooser1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jDateChooser1FocusGained(evt);
            }
        });
        jPanel1.add(jDateChooser1);
        jDateChooser1.setBounds(180, 90, 240, 30);

        jLabel3.setText("em_id");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 180, 28, 14);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(190, 180, 60, 20);

        lblopdate.setText("jLabel2");
        jPanel1.add(lblopdate);
        lblopdate.setBounds(394, 20, 120, 14);

        btncancel.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        btncancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/if_7_-_Denied_1815574.png"))); // NOI18N
        btncancel.setText("Cancel");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });
        jPanel1.add(btncancel);
        btncancel.setBounds(290, 210, 100, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(100, 160, 570, 260);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel14.setFont(new java.awt.Font("Plantagenet Cherokee", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("ACTYMED | OP BOOKING");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(110, 40, 650, 50);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 0, 1010, 110);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Patient Informations", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Georgia", 0, 11))); // NOI18N
        jPanel3.setLayout(null);

        jLabel2.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel2.setText("Name");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(20, 30, 120, 30);

        jLabel4.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel4.setText("Address");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(20, 120, 120, 40);

        jLabel5.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel5.setText("Age");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(20, 70, 140, 30);

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
        jPanel3.add(txtname);
        txtname.setBounds(160, 30, 210, 30);

        txtage.setEditable(false);
        txtage.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        txtage.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtageFocusGained(evt);
            }
        });
        jPanel3.add(txtage);
        txtage.setBounds(160, 70, 210, 30);

        txtaddress.setEditable(false);
        txtaddress.setColumns(20);
        txtaddress.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        txtaddress.setRows(5);
        txtaddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtaddressFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(txtaddress);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(160, 110, 210, 60);

        jLabel15.setText("jLabel15");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(320, 650, 240, 40);
        jPanel3.add(lbldistrictid);
        lbldistrictid.setBounds(470, 500, 150, 30);

        jLabel6.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel6.setText("Phone Number");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(20, 180, 170, 30);

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
        jPanel3.add(txtphone);
        txtphone.setBounds(160, 180, 210, 30);

        jLabel10.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel10.setText("City");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(20, 220, 120, 30);

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
        jPanel3.add(txtcity);
        txtcity.setBounds(160, 220, 210, 30);

        lblop.setBackground(new java.awt.Color(0, 0, 255));
        lblop.setFont(new java.awt.Font("Palatino Linotype", 1, 12)); // NOI18N
        lblop.setText("no");
        jPanel3.add(lblop);
        lblop.setBounds(430, 70, 110, 30);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(670, 160, 550, 260);

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/Actymed billing.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-10, -100, 1370, 960);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void combodoctorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_combodoctorFocusGained
        lbldr.setVisible(false);
    }//GEN-LAST:event_combodoctorFocusGained

    private void combodoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combodoctorActionPerformed
        getempid();
    }//GEN-LAST:event_combodoctorActionPerformed

    private void comboopItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboopItemStateChanged
        try
        {
            MysqlConnection db = new MysqlConnection();
            String op=comboop.getSelectedItem().toString();
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
    }//GEN-LAST:event_comboopItemStateChanged

    private void comboopFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_comboopFocusGained
        lblopno.setVisible(false);
    }//GEN-LAST:event_comboopFocusGained

    private void comboopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboopActionPerformed
        getdate();
    }//GEN-LAST:event_comboopActionPerformed

    private void btnbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbookActionPerformed
        int opid=0,docid=0,fl=0;
        String doctor,op;
        doctor = combodoctor.getSelectedItem().toString();
        System.out.println("asdsd");
        if (doctor.equals("select")) {
            fl = 1;
            lbldr.setVisible(true);
        }

        op = comboop.getSelectedItem().toString();
        if (op.equals("select")) {
            fl = 1;
            lblopno.setVisible(true);
        }
        String date;

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        date = sdf.format(jDateChooser1.getDate());
        System.out.println(date);
        //        if (date==null)
        //        {
            //            fl = 1;
            //            lbldate.setVisible(true);
            //        }
        opid=Integer.parseInt(comboop.getSelectedItem().toString());
        docid=Integer.parseInt(jTextField1.getText());
        if (fl == 0) {
            try {
                MysqlConnection db = new MysqlConnection();
                PreparedStatement pst = db.connection.prepareStatement("insert into hms_bookingop(op_id,emp_id,booking_date)values(?,?,?)");
                System.out.println("j");
                pst.setInt(1,opid);
                pst.setInt(2,docid);
                pst.setString(3,date);
                System.out.println("k");
                int i = pst.executeUpdate();
                if(i==1)
                {
                    JOptionPane.showMessageDialog(null,"Booking Completed");

                    clear();
                txtname.setText("");
                txtage.setText("");
                txtaddress.setText("");
                txtphone.setText("");
                txtcity.setText("");
                }
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnbookActionPerformed

    private void jDateChooser1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jDateChooser1FocusGained
        lbldate.setVisible(false);
    }//GEN-LAST:event_jDateChooser1FocusGained

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        clear();
        txtname.setText("");
        txtage.setText("");
        txtaddress.setText("");
        txtphone.setText("");
        txtcity.setText("");
        clearlabel();
    }//GEN-LAST:event_btncancelActionPerformed

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
            java.util.logging.Logger.getLogger(OpBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OpBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OpBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OpBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new OpBooking().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(OpBooking.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbook;
    private javax.swing.JButton btncancel;
    private javax.swing.JComboBox<String> combodoctor;
    private javax.swing.JComboBox<String> comboop;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbldate;
    private javax.swing.JLabel lbldistrictid;
    private javax.swing.JLabel lbldr;
    private javax.swing.JLabel lblop;
    private javax.swing.JLabel lblopdate;
    private javax.swing.JLabel lblopno;
    private javax.swing.JTextArea txtaddress;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtcity;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtphone;
    // End of variables declaration//GEN-END:variables
}
