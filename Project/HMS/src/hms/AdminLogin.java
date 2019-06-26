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

public class AdminLogin extends javax.swing.JFrame {
    PreparedStatement pst=null;
    ResultSet rs=null; 
     public void dbconnection() throws SQLException
     {
     MysqlConnection db = new MysqlConnection();
     Statement st = db.connection.createStatement();     
     }
    
    public AdminLogin() throws SQLException {
        initComponents();
        dbconnection();
        DateFormat dateformat=new SimpleDateFormat("dd-MM-YYYY");
        java.util.Date date=new java.util.Date();
        String d = dateformat.format(date);
        lbldate.setText(d);
        lbluname.setVisible(false);
        lblpwd.setVisible(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        lbldate = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtuname = new javax.swing.JTextField();
        btnsave = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblpwd = new javax.swing.JLabel();
        lbluname = new javax.swing.JLabel();
        txtpwd = new javax.swing.JPasswordField();
        btncancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1370, 1300));
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel11.setFont(new java.awt.Font("Plantagenet Cherokee", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("HMS | Admin Login");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(180, 40, 410, 50);

        lbldate.setFont(new java.awt.Font("PMingLiU", 1, 14)); // NOI18N
        lbldate.setText("date");
        jPanel2.add(lbldate);
        lbldate.setBounds(790, 50, 200, 20);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 30, 1010, 110);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Sign in to your account", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Georgia", 0, 12))); // NOI18N
        jPanel3.setLayout(null);

        txtuname.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        txtuname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtunameFocusGained(evt);
            }
        });
        txtuname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtunameActionPerformed(evt);
            }
        });
        jPanel3.add(txtuname);
        txtuname.setBounds(160, 110, 220, 30);

        btnsave.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        btnsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/if_Login_in_85205.png"))); // NOI18N
        btnsave.setText("Login");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        jPanel3.add(btnsave);
        btnsave.setBounds(160, 220, 97, 30);

        jLabel2.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/if_Login_73221.png"))); // NOI18N
        jLabel2.setText("User Name");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(30, 110, 120, 30);

        jLabel4.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/if_key_309058.png"))); // NOI18N
        jLabel4.setText("Password");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(30, 160, 140, 30);

        lblpwd.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        lblpwd.setForeground(new java.awt.Color(255, 0, 0));
        lblpwd.setText("Enter Password");
        jPanel3.add(lblpwd);
        lblpwd.setBounds(380, 160, 170, 30);

        lbluname.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        lbluname.setForeground(new java.awt.Color(255, 0, 0));
        lbluname.setText("Enter UserName");
        jPanel3.add(lbluname);
        lbluname.setBounds(380, 110, 170, 30);

        txtpwd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtpwdFocusGained(evt);
            }
        });
        jPanel3.add(txtpwd);
        txtpwd.setBounds(160, 160, 220, 30);

        btncancel.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        btncancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/if_cancel_326554.png"))); // NOI18N
        btncancel.setText("Cancel");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });
        jPanel3.add(btncancel);
        btncancel.setBounds(270, 220, 100, 30);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(80, 180, 510, 290);

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/Actymed billing.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -90, 1360, 570);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(null);
        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 480, 1360, 340);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtunameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtunameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtunameActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        //driver loading.
        String name,password;
        int iname,ipassword;
        int fl=0;
        name=txtuname.getText();
        password=txtpwd.getText();
        iname=name.length();
        if(iname==0)     
        {
         fl=1;
         lbluname.setVisible(true);
        }
        ipassword=password.length();
        if(ipassword==0)     
        {
         fl=1;
         lblpwd.setVisible(true);
        }
        if(fl==0)
        {
            try
            {
        login();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void txtunameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtunameFocusGained
        // TODO add your handling code here:
        lbluname.setVisible(false);
    }//GEN-LAST:event_txtunameFocusGained

    private void txtpwdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpwdFocusGained
        // TODO add your handling code here:
        lblpwd.setVisible(false);
    }//GEN-LAST:event_txtpwdFocusGained

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
       txtuname.setText("");
       txtpwd.setText("");
       lblpwd.setVisible(false);
       lbluname.setVisible(false);
    }//GEN-LAST:event_btncancelActionPerformed
    
     public void login()
    {
        try
        {
            String uname=txtuname.getText();
            String pass=txtpwd.getText();
           MysqlConnection db = new MysqlConnection(); 
       String  str="select * from hms_admin where admin_username='"+uname+"' and admin_password='"+pass+"' ";
        pst=db.connection.prepareStatement(str);
        rs=pst.executeQuery(str);
        if(rs.next())
        {
            AdminHome ah=new AdminHome();
            ah.setVisible(true);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Incorrect Username or Password", "Error", JOptionPane.ERROR_MESSAGE);
            txtuname.setText("");
            txtpwd.setText("");
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
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AdminLogin().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(AdminLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btnsave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbldate;
    private javax.swing.JLabel lblpwd;
    private javax.swing.JLabel lbluname;
    private javax.swing.JPasswordField txtpwd;
    private javax.swing.JTextField txtuname;
    // End of variables declaration//GEN-END:variables
}
