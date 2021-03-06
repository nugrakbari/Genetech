/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project2assignment;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nugrakbari
 */
public class PatientSelectionList extends javax.swing.JFrame {
    
    private PatientQuery patientQuery;
    private DefaultTableModel patientTableModel;
    private DateFormat df;
    private String toSearch;

    private String accessLevel;
    private int userID;
    
    /**
     * Creates new form PatientSelectionList
     */
    public PatientSelectionList() {
        initComponents();
        patientQuery = new PatientQuery();
        df = new SimpleDateFormat("dd/MM/yyyy");
        patientTableModel = new DefaultTableModel();
        patientTableModel.setColumnCount(10);
        patientTableModel.setColumnIdentifiers(new String[]{"Patient ID", "First Name", "Last Name",
            "Date of Birth", "Street Address", "Suburb", "Postcode", "Home Phone",
            "Mobile Phone", "Medicare Number"});
        patientTable.setModel(patientTableModel);
        loadPatientTable();
    }
    
    private void loadPatientTable() {
        List<Patient> entries = patientQuery.getPatients();
        int tableRow = 0;
        patientTableModel.setNumRows(entries.size());
        for (Patient b : entries) {
            patientTableModel.setValueAt(b.getPatientID(), tableRow, 0);
            patientTableModel.setValueAt(b.getFirstName(), tableRow, 1);
            patientTableModel.setValueAt(b.getLastName(), tableRow, 2);
            patientTableModel.setValueAt(df.format(b.getDateOfBirth()), tableRow, 3);
            patientTableModel.setValueAt(b.getStreetAddress(), tableRow, 4);
            patientTableModel.setValueAt(b.getSuburb(), tableRow, 5);
            patientTableModel.setValueAt(b.getPostcode(), tableRow, 6);
            patientTableModel.setValueAt(b.getHomePhone(), tableRow, 7);
            patientTableModel.setValueAt(b.getMobilePhone(), tableRow, 8);
            patientTableModel.setValueAt(b.getMedicareNo(), tableRow, 9);
            tableRow++;
        }
    }

    private void searchPatientTable() {
        System.out.println("Searching for " + toSearch);
        List<Patient> entries = patientQuery.searchPatient(toSearch);
        int tableRow = 0;
        patientTableModel.setNumRows(entries.size());
        for (Patient b : entries) {
            patientTableModel.setValueAt(b.getPatientID(), tableRow, 0);
            patientTableModel.setValueAt(b.getFirstName(), tableRow, 1);
            patientTableModel.setValueAt(b.getLastName(), tableRow, 2);
            patientTableModel.setValueAt(df.format(b.getDateOfBirth()), tableRow, 3);
            patientTableModel.setValueAt(b.getStreetAddress(), tableRow, 4);
            patientTableModel.setValueAt(b.getSuburb(), tableRow, 5);
            patientTableModel.setValueAt(b.getPostcode(), tableRow, 6);
            patientTableModel.setValueAt(b.getHomePhone(), tableRow, 7);
            patientTableModel.setValueAt(b.getMobilePhone(), tableRow, 8);
            patientTableModel.setValueAt(b.getMedicareNo(), tableRow, 9);
            tableRow++;
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT
     * modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        patientTable = new javax.swing.JTable();
        selectButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        searchField1 = new javax.swing.JTextField();
        searchButton1 = new javax.swing.JButton();
        cancelButton1 = new javax.swing.JButton();
        selectButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setTitle("Browse Patient");
        jInternalFrame1.setVisible(true);
        jInternalFrame1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Find patient");
        jInternalFrame1.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1026, 26, -1, -1));
        jInternalFrame1.getContentPane().add(searchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1113, 20, 181, -1));

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 21, -1, -1));

        patientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(patientTable);

        jInternalFrame1.getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 620, 300));

        selectButton.setText("Select");
        selectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectButtonActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(selectButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1278, 380, 104, -1));

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1168, 380, 104, -1));

        jLabel2.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Find Patient:");
        jInternalFrame1.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 110, 50));
        jInternalFrame1.getContentPane().add(searchField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 181, 30));

        searchButton1.setText("Search");
        searchButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButton1ActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(searchButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, -1, -1));

        cancelButton1.setText("Cancel");
        cancelButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButton1ActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(cancelButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, 100, 40));

        selectButton1.setText("Select");
        selectButton1.setVerifyInputWhenFocusTarget(false);
        selectButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectButton1ActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(selectButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 380, 100, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2assignment/backdrop.png"))); // NOI18N
        jInternalFrame1.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-540, -160, -1, 980));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 709, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void selectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectButtonActionPerformed

    }//GEN-LAST:event_selectButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        toSearch = searchField.getText();
        searchPatientTable();
    }//GEN-LAST:event_searchButtonActionPerformed

    private void searchButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButton1ActionPerformed
        /*toSearch = searchField.getText();
        searchDoctorTable();*/
    }//GEN-LAST:event_searchButton1ActionPerformed

    private void cancelButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_cancelButton1ActionPerformed

    private void selectButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectButton1ActionPerformed
        int patientElementToView = patientTable.getSelectedRow();
            int patientID = (int) patientTable.getValueAt(patientElementToView, 0);
            //int id = Integer.parseInt(patientID);
            AppointmentEntry a = new AppointmentEntry(patientID);
            a.setVisible(true);

            if (patientElementToView != -1) {
                System.out.println(patientID);
                a.setAccessLevel(accessLevel);
                a.setPatientID(patientID);
                this.dispose();
            }
    }//GEN-LAST:event_selectButton1ActionPerformed

        /**
     * @param accessLevel the accessLevel to set
     */
    public void setAccessLevel(String accessLevel) {
        this.accessLevel = accessLevel;
        System.out.println("(InstantMessaging) access level is " + accessLevel);
    }
   
    /**
     * @param userID the userID to set
     */
    public void setUserID(int userID) {
        this.userID = userID;
        System.out.println("(InstantMessaging) user is " + userID);
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
            java.util.logging.Logger.getLogger(PatientSelectionList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientSelectionList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientSelectionList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientSelectionList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientSelectionList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton cancelButton1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable patientTable;
    private javax.swing.JButton searchButton;
    private javax.swing.JButton searchButton1;
    private javax.swing.JTextField searchField;
    private javax.swing.JTextField searchField1;
    private javax.swing.JButton selectButton;
    private javax.swing.JButton selectButton1;
    // End of variables declaration//GEN-END:variables

}
