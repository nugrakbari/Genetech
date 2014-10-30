/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project2assignment;

/**
 *
 * @author GuestAccount
 */
public class AdminForm extends javax.swing.JFrame {
private StaffQuery staffQuery;
private int toEdit;    
private String accessLevel;
private int userID;
  
public enum Action {

        /**
         *
         */
        ADD,
        /**
         *
         */
        EDIT;
    }
    private AdminForm.Action action;

    /**
     * Creates new form AdminForm1
     */
    public AdminForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        logo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        scheduleButton = new javax.swing.JButton();
        scheduleLabel = new javax.swing.JLabel();
        scheduleTab = new javax.swing.JLabel();
        patientButton = new javax.swing.JButton();
        patientLabel = new javax.swing.JLabel();
        patientTab = new javax.swing.JLabel();
        billingButton = new javax.swing.JButton();
        billingLabel = new javax.swing.JLabel();
        billingTab = new javax.swing.JLabel();
        messagesButton = new javax.swing.JButton();
        messagesLabel = new javax.swing.JLabel();
        messagesTab = new javax.swing.JLabel();
        welcome = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        staffIDTextfield = new javax.swing.JTextField();
        firstNameTextfield = new javax.swing.JTextField();
        lastnameTextfield = new javax.swing.JTextField();
        accesslevelTextfield = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        adminButton = new javax.swing.JButton();
        adminLabel = new javax.swing.JLabel();
        adminTab = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setClosable(true);
        jInternalFrame1.setIconifiable(true);
        jInternalFrame1.setMaximizable(true);
        jInternalFrame1.setResizable(true);
        jInternalFrame1.setTitle("Billing");
        jInternalFrame1.setVisible(true);
        jInternalFrame1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2assignment/logo glow.png"))); // NOI18N
        jInternalFrame1.getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Georgia", 0, 60)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(234, 234, 234));
        jLabel2.setText("Genetech");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jInternalFrame1.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 250, 90));

        scheduleButton.setBorderPainted(false);
        scheduleButton.setOpaque(false);
        scheduleButton.setContentAreaFilled(false);
        scheduleButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                scheduleButtonMouseClicked(evt);
            }
        });
        jInternalFrame1.getContentPane().add(scheduleButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 170, 80));

        scheduleLabel.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        scheduleLabel.setForeground(new java.awt.Color(255, 255, 255));
        scheduleLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2assignment/edit.png"))); // NOI18N
        scheduleLabel.setText("Schedule");
        jInternalFrame1.getContentPane().add(scheduleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        scheduleTab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2assignment/button2.png"))); // NOI18N
        jInternalFrame1.getContentPane().add(scheduleTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        patientButton.setBorderPainted(false);
        patientButton.setOpaque(false);
        patientButton.setContentAreaFilled(false);
        patientButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                patientButtonMouseClicked(evt);
            }
        });
        patientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientButtonActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(patientButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 170, 80));

        patientLabel.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        patientLabel.setForeground(new java.awt.Color(255, 255, 255));
        patientLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2assignment/users.png"))); // NOI18N
        patientLabel.setText("Patient");
        jInternalFrame1.getContentPane().add(patientLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        patientTab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2assignment/button2.png"))); // NOI18N
        jInternalFrame1.getContentPane().add(patientTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        billingButton.setBorderPainted(false);
        billingButton.setOpaque(false);
        billingButton.setContentAreaFilled(false);
        billingButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                billingButtonMouseClicked(evt);
            }
        });
        jInternalFrame1.getContentPane().add(billingButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 170, 80));

        billingLabel.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        billingLabel.setForeground(new java.awt.Color(255, 255, 255));
        billingLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2assignment/credit_card.png"))); // NOI18N
        billingLabel.setText("Billing");
        jInternalFrame1.getContentPane().add(billingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        billingTab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2assignment/button2.png"))); // NOI18N
        jInternalFrame1.getContentPane().add(billingTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        messagesButton.setBorderPainted(false);
        messagesButton.setOpaque(false);
        messagesButton.setContentAreaFilled(false);
        messagesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                messagesButtonMouseClicked(evt);
            }
        });
        jInternalFrame1.getContentPane().add(messagesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 170, 80));

        messagesLabel.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        messagesLabel.setForeground(new java.awt.Color(255, 255, 255));
        messagesLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2assignment/comments1.png"))); // NOI18N
        messagesLabel.setText("Messages");
        jInternalFrame1.getContentPane().add(messagesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        messagesTab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2assignment/button2.png"))); // NOI18N
        jInternalFrame1.getContentPane().add(messagesTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        welcome.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        welcome.setForeground(new java.awt.Color(255, 255, 255));
        welcome.setText("Welcome,");
        jInternalFrame1.getContentPane().add(welcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 0, -1, 30));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 2));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 336, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 326, Short.MAX_VALUE)
        );

        jInternalFrame1.getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 340, 330));

        jButton7.setText("Remove");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 490, -1, -1));

        jButton6.setText("Update");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 490, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Staff Details"));

        jLabel4.setText("First Name:");

        jLabel5.setText("Last Name:");

        jLabel6.setText("Access Level:");

        staffIDTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffIDTextfieldActionPerformed(evt);
            }
        });

        jLabel7.setText("Staff ID:");

        jButton1.setText("Delete");

        jButton2.setText("Edit");
        jButton2.setPreferredSize(new java.awt.Dimension(84, 29));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(firstNameTextfield, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                                .addComponent(lastnameTextfield)
                                .addComponent(staffIDTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(accesslevelTextfield, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(staffIDTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastnameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(accesslevelTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jInternalFrame1.getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, 520, 230));

        adminButton.setBorderPainted(false);
        scheduleButton.setOpaque(false);
        scheduleButton.setContentAreaFilled(false);
        adminButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminButtonMouseClicked(evt);
            }
        });
        adminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminButtonActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(adminButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 170, 80));

        adminLabel.setBackground(new java.awt.Color(255, 255, 255));
        adminLabel.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        adminLabel.setForeground(new java.awt.Color(255, 255, 255));
        adminLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2assignment/id_card.png"))); // NOI18N
        adminLabel.setText("Admin");
        jInternalFrame1.getContentPane().add(adminLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));

        adminTab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2assignment/Buttonclicked3.png"))); // NOI18N
        jInternalFrame1.getContentPane().add(adminTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, -1));

        backButton.setText("Back");
        backButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButtonMouseClicked(evt);
            }
        });
        jInternalFrame1.getContentPane().add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 570, 100, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2assignment/panel5.png"))); // NOI18N
        jInternalFrame1.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2assignment/backdrop.png"))); // NOI18N
        jInternalFrame1.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -20, 1250, 670));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 1262, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        HomePage home = new HomePage();
        home.setVisible(true);
        home.setAccessLevel(accessLevel);
        home.setUserID(userID);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    private void scheduleButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scheduleButtonMouseClicked
        HomePage home = new HomePage();
        home.setVisible(true);
        home.setAccessLevel(accessLevel);
        home.setUserID(userID);
        this.dispose();
    }//GEN-LAST:event_scheduleButtonMouseClicked

    private void patientButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patientButtonMouseClicked
        PatientView patient = new PatientView();
        patient.setVisible(true);
        patient.setAccessLevel(accessLevel);
        patient.setUserID(userID);
        this.dispose();
    }//GEN-LAST:event_patientButtonMouseClicked

    private void patientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientButtonActionPerformed

    private void billingButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billingButtonMouseClicked
        new Billing(0).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_billingButtonMouseClicked

    private void messagesButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_messagesButtonMouseClicked
        InstantMessaging im = new InstantMessaging();
        im.setVisible(true);
        im.setAccessLevel(accessLevel);
        im.setUserID(userID);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_messagesButtonMouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void staffIDTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffIDTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_staffIDTextfieldActionPerformed

    private void adminButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_adminButtonMouseClicked

    private void adminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminButtonActionPerformed

    private void backButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseClicked
        new PatientView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButtonMouseClicked
  public void setAction(PatientForm.Action action) {
        this.action = action;
        System.out.println("(Staff) setting action as " + action);
    }

    /**
     *
     * @param toEdit
     */
    public void setToEdit(int toEdit) {
        this.toEdit = toEdit;
        System.out.println("toEdit value is " + toEdit);
        Staff s = staffQuery.getStaffByID(toEdit);
        System.out.println("Staff name is " + s.getFirstName());
        if (s != null) {
            this.staffIDTextfield.setText(s.get());
            this.firstNameTextfield.setText(s.getLastName());
            this.lastnameTextfield.settext(s.getGen());
            this.accesslevelTextfield.setText(s.getStreetAddress());
          
        } else {
            //TODO the staff member does not exist
            throw new UnsupportedOperationException("No such staff exists");
        }

    }
    /**
     * @param userID the userID to set
     */
    public void setUserID(int userID) {
        this.userID = userID;
        System.out.println("(InstantMessaging) user is " + userID);
    }
    
    /**
     * @param accessLevel the accessLevel to set
     */
    public void setAccessLevel(String accessLevel) {
        this.accessLevel = accessLevel;
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
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accesslevelTextfield;
    private javax.swing.JButton adminButton;
    private javax.swing.JLabel adminLabel;
    private javax.swing.JLabel adminTab;
    private javax.swing.JButton backButton;
    private javax.swing.JButton billingButton;
    private javax.swing.JLabel billingLabel;
    private javax.swing.JLabel billingTab;
    private javax.swing.JTextField firstNameTextfield;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField lastnameTextfield;
    private javax.swing.JLabel logo;
    private javax.swing.JButton messagesButton;
    private javax.swing.JLabel messagesLabel;
    private javax.swing.JLabel messagesTab;
    private javax.swing.JButton patientButton;
    private javax.swing.JLabel patientLabel;
    private javax.swing.JLabel patientTab;
    private javax.swing.JButton scheduleButton;
    private javax.swing.JLabel scheduleLabel;
    private javax.swing.JLabel scheduleTab;
    private javax.swing.JTextField staffIDTextfield;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}
