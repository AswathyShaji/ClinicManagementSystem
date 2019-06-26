package hms;
import connection.MysqlConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author asus
 */
public class EmployeeAttendance extends javax.swing.JFrame {
PreparedStatement pst=null;
    ResultSet rs=null; 
    
    public void dbconnection() throws SQLException
     {
     MysqlConnection db = new MysqlConnection();
     Statement st = db.connection.createStatement();     
     }
    public EmployeeAttendance() throws SQLException {
        initComponents();
        dbconnection();
    }
public void fillemployee()
    {
        try
        {
            MysqlConnection db = new MysqlConnection();
            pst=db.connection.prepareStatement("SELECT * from hms_employeeregisration" );
            rs=pst.executeQuery();
            while(rs.next())
            {
                         
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
        jLabel12 = new javax.swing.JLabel();
        doj = new com.toedter.calendar.JDateChooser();
        lbldoj = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Show = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        lbldate = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel12.setFont(new java.awt.Font("PMingLiU", 0, 14)); // NOI18N
        jLabel12.setText("Date");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(140, 40, 80, 30);

        doj.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dojFocusGained(evt);
            }
        });
        jPanel1.add(doj);
        doj.setBounds(230, 40, 240, 30);

        lbldoj.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        lbldoj.setForeground(new java.awt.Color(255, 0, 0));
        lbldoj.setText("Select Date");
        jPanel1.add(lbldoj);
        lbldoj.setBounds(490, 30, 170, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(70, 100, 452, 240);

        Show.setText("Show");
        Show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowActionPerformed(evt);
            }
        });
        jPanel1.add(Show);
        Show.setBounds(580, 110, 59, 23);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 120, 770, 430);

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

    private void dojFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dojFocusGained
        lbldoj.setVisible(false);

    }//GEN-LAST:event_dojFocusGained

    private void ShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowActionPerformed
        search();// TODO add your handling code here:
    }//GEN-LAST:event_ShowActionPerformed
 public void search()
     {
         try
         {
          MysqlConnection db = new MysqlConnection();
          Statement st = db.connection.createStatement();
        ResultSet rs=st.executeQuery("select* from hms_employeeregistration");
//          jTable1.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
     }
         catch(Exception e)
         {
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
            java.util.logging.Logger.getLogger(EmployeeAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new EmployeeAttendance().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(EmployeeAttendance.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Show;
    private com.toedter.calendar.JDateChooser doj;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbldate;
    private javax.swing.JLabel lbldoj;
    // End of variables declaration//GEN-END:variables
}
