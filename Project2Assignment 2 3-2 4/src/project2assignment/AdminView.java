/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2assignment;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author GuestAccount
 */
public class AdminView extends javax.swing.JFrame {

    private StaffQuery staffQuery;
    private DefaultTableModel staffTableModel;
    private String accessLevel;
    private int userID;
    private JPopupMenu popupMenu;
    private JMenuItem viewStaff;
    /**
     * Creates new form AdminForm
     */
    public AdminView() {
        System.out.println("loading AdminView");
        initComponents();

        staffQuery = new StaffQuery();

        staffTableModel = new DefaultTableModel();
        staffTableModel.setColumnCount(9);
        staffTableModel.setColumnIdentifiers(new String[]{"Staff ID", "First Name", "Last Name",
            "Position", "Access Level", "Username", "Password", "Specialty",
            "Prescriber Number"});
        staffTable.setModel(staffTableModel);
        loadStaffTable();
    }

    private void loadStaffTable() {
        List<Staff> entries = staffQuery.getStaff();
        int tableRow = 0;
        staffTableModel.setNumRows(entries.size());
        for (Staff b : entries) {
            staffTableModel.setValueAt(b.getStaffId(), tableRow, 0);
            staffTableModel.setValueAt(b.getFirstName(), tableRow, 1);
            staffTableModel.setValueAt(b.getLastName(), tableRow, 2);
            staffTableModel.setValueAt(b.getPosition(), tableRow, 3);
            staffTableModel.setValueAt(b.getAccessLevel(), tableRow, 4);
            staffTableModel.setValueAt(b.getUsername(), tableRow, 5);
            staffTableModel.setValueAt(b.getPassword(), tableRow, 6);
            staffTableModel.setValueAt(b.getSpecialty(), tableRow, 7);
            staffTableModel.setValueAt(b.getPrescriberNumber(), tableRow, 8);
            tableRow++;
        }
        loadPopupMenu();

    }
    private void loadPopupMenu() {
        popupMenu = new JPopupMenu();
        viewStaff = new JMenuItem("Get Info");

        viewStaff.addActionListener(viewStaffListener);


        popupMenu.add(viewStaff);


        staffTable.setComponentPopupMenu(popupMenu);
    }

    private final ActionListener viewStaffListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            int staffElementToView = staffTable.getSelectedRow();
            int staffID = (int) staffTable.getValueAt(staffElementToView, 0);
            System.out.println("STAFFID HERE: " + staffID);
            //int id = Integer.parseInt(staffID);

            if (staffElementToView != -1) {
               // System.out.println(id);
                AdminForm form = new AdminForm();
                form.setAccessLevel(accessLevel);
                form.setAction(AdminForm.Action.EDIT);
                form.setToEdit(staffID);
                setVisible(false);
                form.setVisible(true);
            }
        }
    };
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
        adminButton = new javax.swing.JButton();
        adminLabel = new javax.swing.JLabel();
        adminTab = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        viewButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        staffTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setClosable(true);
        jInternalFrame1.setIconifiable(true);
        jInternalFrame1.setMaximizable(true);
        jInternalFrame1.setResizable(true);
        jInternalFrame1.setTitle("Admin");
        jInternalFrame1.setVisible(true);
        jInternalFrame1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2assignment/logo-glow.png"))); // NOI18N
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
        messagesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messagesButtonActionPerformed(evt);
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

        adminButton.setBorderPainted(false);
        adminButton.setOpaque(false);
        adminButton.setContentAreaFilled(false);
        adminButton.setBorderPainted(false);
        adminButton.setContentAreaFilled(false);
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

        addButton.setText("Add");
        addButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addButtonMouseClicked(evt);
            }
        });
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 560, 100, 40));

        viewButton.setText("View");
        viewButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewButtonMouseClicked(evt);
            }
        });
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(viewButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 560, 100, 40));

        staffTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Staff ID", "First Name", "Surname", "Position"
            }
        ));
        jScrollPane1.setViewportView(staffTable);

        jInternalFrame1.getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 1020, 430));

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

    private void addButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseClicked
        AdminForm adminForm = new AdminForm();
        adminForm.setVisible(true);
        adminForm.setAccessLevel(accessLevel);
        adminForm.setUserID(userID);
        this.dispose();
    }//GEN-LAST:event_addButtonMouseClicked

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addButtonActionPerformed

    private void viewButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewButtonMouseClicked
        AdminForm adminForm = new AdminForm();
        adminForm.setVisible(true);
        adminForm.setAccessLevel(accessLevel);
        adminForm.setUserID(userID);
        this.dispose();
    }//GEN-LAST:event_viewButtonMouseClicked

    private void messagesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messagesButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_messagesButtonActionPerformed

    private void adminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminButtonActionPerformed

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton adminButton;
    private javax.swing.JLabel adminLabel;
    private javax.swing.JLabel adminTab;
    private javax.swing.JButton billingButton;
    private javax.swing.JLabel billingLabel;
    private javax.swing.JLabel billingTab;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
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
    private javax.swing.JTable staffTable;
    private javax.swing.JButton viewButton;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}
