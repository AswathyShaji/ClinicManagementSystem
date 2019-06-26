
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

public class Login extends javax.swing.JFrame {
    PreparedStatement pst=null;
    ResultSet rs=null; 
     public void dbconnection() throws SQLException
     {
     MysqlConnection db = new MysqlConnection();
     Statement st = db.connection.createStatement();     
     }
    public Login() throws SQLException {
        initComponents();
        dbconnection();
        DateFormat dateformat=new SimpleDateFormat("dd-MM-YYYY");
        java.util.Date date=new java.util.Date();
        String d = dateformat.format(date);
        lbldate.setText(d);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnadmin = new javax.swing.JButton();
        btnadmin1 = new javax.swing.JButton();
        btnemp = new javax.swing.JButton();
        lblname = new javax.swing.JLabel();
        lblname1 = new javax.swing.JLabel();
        lblname2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbldate = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1370, 800));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        btnadmin.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        btnadmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/People-Doctor-Male-icon (1).png"))); // NOI18N
        btnadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadminActionPerformed(evt);
            }
        });
        jPanel1.add(btnadmin);
        btnadmin.setBounds(40, 50, 160, 130);

        btnadmin1.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        btnadmin1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/if_administrator_43554 (1).png"))); // NOI18N
        btnadmin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadmin1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnadmin1);
        btnadmin1.setBounds(390, 50, 160, 130);

        btnemp.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        btnemp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/users-icon.png"))); // NOI18N
        btnemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnempActionPerformed(evt);
            }
        });
        jPanel1.add(btnemp);
        btnemp.setBounds(210, 50, 160, 130);

        lblname.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        lblname.setForeground(new java.awt.Color(0, 102, 102));
        lblname.setText("Employee Login");
        jPanel1.add(lblname);
        lblname.setBounds(220, 180, 170, 30);

        lblname1.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        lblname1.setForeground(new java.awt.Color(0, 102, 102));
        lblname1.setText("Admin Login");
        jPanel1.add(lblname1);
        lblname1.setBounds(410, 180, 170, 30);

        lblname2.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        lblname2.setForeground(new java.awt.Color(0, 102, 102));
        lblname2.setText("Doctor's Login");
        jPanel1.add(lblname2);
        lblname2.setBounds(50, 180, 170, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(720, 240, 620, 240);

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/Actymed billing.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-640, -90, 1360, 570);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        lbldate.setFont(new java.awt.Font("PMingLiU", 1, 14)); // NOI18N
        lbldate.setText("date");
        jPanel2.add(lbldate);
        lbldate.setBounds(1180, 60, 200, 20);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 480, 1370, 480);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel3);
        jPanel3.setBounds(720, 0, 660, 650);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadminActionPerformed
        try
        {
        DoctorsLogin obj=new DoctorsLogin();
        obj.show();
        
        }
        catch(Exception e)
        {
            
        }
    }//GEN-LAST:event_btnadminActionPerformed

    private void btnadmin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadmin1ActionPerformed
        try
        {
        AdminLogin bo=new AdminLogin();
        bo.show();
        
        }
        catch(Exception e)
        {
            
        }
    }//GEN-LAST:event_btnadmin1ActionPerformed

    private void btnempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnempActionPerformed
        try
        {
        EmployeeLogin bo=new EmployeeLogin();
        bo.show();
        
        }
        catch(Exception e)
        {
            
        }
    }//GEN-LAST:event_btnempActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Login().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadmin;
    private javax.swing.JButton btnadmin1;
    private javax.swing.JButton btnemp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbldate;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblname1;
    private javax.swing.JLabel lblname2;
    // End of variables declaration//GEN-END:variables
}
