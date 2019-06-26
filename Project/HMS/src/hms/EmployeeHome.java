package hms;

public class EmployeeHome extends javax.swing.JFrame {

    
    public EmployeeHome() {
        initComponents();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnappoinment = new javax.swing.JButton();
        lblname2 = new javax.swing.JLabel();
        lblname3 = new javax.swing.JLabel();
        btnmedicine = new javax.swing.JButton();
        btnpatient = new javax.swing.JButton();
        lblname4 = new javax.swing.JLabel();
        lbldate = new javax.swing.JLabel();
        lblname5 = new javax.swing.JLabel();
        btnpatient1 = new javax.swing.JButton();
        btnsms = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lbldate1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1370, 1370));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        btnappoinment.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        btnappoinment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/user-add-icon.png"))); // NOI18N
        btnappoinment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnappoinmentActionPerformed(evt);
            }
        });
        jPanel1.add(btnappoinment);
        btnappoinment.setBounds(20, 280, 160, 130);

        lblname2.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        lblname2.setForeground(new java.awt.Color(0, 102, 102));
        lblname2.setText("OP Registration");
        jPanel1.add(lblname2);
        lblname2.setBounds(30, 410, 170, 30);

        lblname3.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        lblname3.setForeground(new java.awt.Color(0, 102, 102));
        lblname3.setText("Booking");
        jPanel1.add(lblname3);
        lblname3.setBounds(230, 410, 170, 30);

        btnmedicine.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        btnmedicine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/if_shine_19_61228.png"))); // NOI18N
        btnmedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmedicineActionPerformed(evt);
            }
        });
        jPanel1.add(btnmedicine);
        btnmedicine.setBounds(190, 280, 160, 130);

        btnpatient.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        btnpatient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/Patients-icon.png"))); // NOI18N
        btnpatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpatientActionPerformed(evt);
            }
        });
        jPanel1.add(btnpatient);
        btnpatient.setBounds(360, 280, 160, 130);

        lblname4.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        lblname4.setForeground(new java.awt.Color(0, 102, 102));
        lblname4.setText("Manage Patients");
        jPanel1.add(lblname4);
        lblname4.setBounds(370, 410, 170, 30);

        lbldate.setFont(new java.awt.Font("PMingLiU", 1, 14)); // NOI18N
        lbldate.setText("date");
        jPanel1.add(lbldate);
        lbldate.setBounds(70, 50, 360, 20);

        lblname5.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        lblname5.setForeground(new java.awt.Color(0, 102, 102));
        lblname5.setText("Billing");
        jPanel1.add(lblname5);
        lblname5.setBounds(580, 410, 170, 30);

        btnpatient1.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        btnpatient1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/if_08_61472.png"))); // NOI18N
        btnpatient1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpatient1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnpatient1);
        btnpatient1.setBounds(530, 280, 160, 130);

        btnsms.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        btnsms.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/if_icons_exit2_1564506.png"))); // NOI18N
        btnsms.setText("SignOut");
        btnsms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsmsActionPerformed(evt);
            }
        });
        jPanel1.add(btnsms);
        btnsms.setBounds(520, 50, 120, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(590, 0, 790, 740);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel11.setFont(new java.awt.Font("Plantagenet Cherokee", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("HMS | EMPLOYEE HOME");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(110, 40, 460, 50);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 0, 1010, 110);

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/Actymed billing.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-710, -90, 1360, 570);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        lbldate1.setFont(new java.awt.Font("PMingLiU", 1, 14)); // NOI18N
        lbldate1.setText("date");
        jPanel3.add(lbldate1);
        lbldate1.setBounds(1180, 60, 200, 20);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 480, 1370, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnappoinmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnappoinmentActionPerformed
try
        {
        OpRegistration bo=new OpRegistration();
        bo.show();
        
        }
        catch(Exception e)
        {
            
        }
    }//GEN-LAST:event_btnappoinmentActionPerformed

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

    private void btnsmsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsmsActionPerformed
        // TODO add your handling code here:
         try
        {
        EmployeeLogin obj=new EmployeeLogin();
        obj.show();
        
        }
        catch(Exception e)
        {
            
        }
    }//GEN-LAST:event_btnsmsActionPerformed

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
            java.util.logging.Logger.getLogger(EmployeeHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnappoinment;
    private javax.swing.JButton btnmedicine;
    private javax.swing.JButton btnpatient;
    private javax.swing.JButton btnpatient1;
    private javax.swing.JButton btnsms;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbldate;
    private javax.swing.JLabel lbldate1;
    private javax.swing.JLabel lblname2;
    private javax.swing.JLabel lblname3;
    private javax.swing.JLabel lblname4;
    private javax.swing.JLabel lblname5;
    // End of variables declaration//GEN-END:variables
}
