/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project2assignment;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nugrakbari
 */
public class TodaysVisit extends javax.swing.JFrame {

    private DefaultTableModel visitTableModel;
    private VisitQuery visitQuery;
    private DateFormat df;
    private String accessLevel;
    private int userID;
    /**
     * Creates new form TodaysVisit
     */
    public TodaysVisit() {
        initComponents();
        df = new SimpleDateFormat("HH:mm");
        visitQuery = new VisitQuery();
        visitTableModel = new DefaultTableModel();
        visitTableModel.setColumnCount(4);
        visitTableModel.setColumnIdentifiers(new String[]{"Time", "Patient's Name",
            "Doctor's Name", "Visit ID"});
        visitTable.setModel(visitTableModel);
        loadTodaysVisitsTable();
    }
    
     private void loadTodaysVisitsTable() {
        List<VisitToday> entries = visitQuery.getTodaysVisits();
        int tableRow = 0;
        visitTableModel.setNumRows(entries.size());
        for (VisitToday p : entries) {
            visitTableModel.setValueAt(df.format(p.getVisitTime()),tableRow, 0);
            visitTableModel.setValueAt(p.getPatientName(), tableRow, 1);
            visitTableModel.setValueAt(p.getDoctorName(), tableRow, 2);
            visitTableModel.setValueAt(p.getVisitID(), tableRow, 3);
            tableRow++;
        }
    }
     
    /**
     * @param accessLevel the accessLevel to set
     */
    public void setAccessLevel(String accessLevel) {
        this.accessLevel = accessLevel;
        System.out.println("(TodaysVisit) accesslevel is " + accessLevel);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT
     * modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame2 = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        visitTable = new javax.swing.JTable();
        cancelButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        selectButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame2.setBackground(new java.awt.Color(204, 204, 204));
        jInternalFrame2.setClosable(true);
        jInternalFrame2.setIconifiable(true);
        jInternalFrame2.setMaximizable(true);
        jInternalFrame2.setResizable(true);
        jInternalFrame2.setTitle("Today's Visits");
        jInternalFrame2.setPreferredSize(new java.awt.Dimension(966, 966));
        jInternalFrame2.setVisible(true);
        jInternalFrame2.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        visitTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(visitTable);

        jInternalFrame2.getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 620, 300));

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        jInternalFrame2.getContentPane().add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, 100, 40));

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        jInternalFrame2.getContentPane().add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, -1, -1));

        selectButton.setText("Select");
        selectButton.setVerifyInputWhenFocusTarget(false);
        selectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectButtonActionPerformed(evt);
            }
        });
        jInternalFrame2.getContentPane().add(selectButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 380, 100, 40));

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Find Procedure:");
        jInternalFrame2.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 110, 50));
        jInternalFrame2.getContentPane().add(searchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 181, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2assignment/backdrop.png"))); // NOI18N
        jInternalFrame2.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-210, -50, -1, 980));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jInternalFrame2, javax.swing.GroupLayout.PREFERRED_SIZE, 709, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jInternalFrame2, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        Billing billing = new Billing(0);
        billing.setVisible(true);
        billing.setAccessLevel(accessLevel);
        this.dispose(); 
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        /*toSearch = searchField.getText();
        searchDoctorTable();*/
    }//GEN-LAST:event_searchButtonActionPerformed

    private void selectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectButtonActionPerformed
            int patientElementToView = visitTable.getSelectedRow();
            int visitID = (int) visitTable.getValueAt(patientElementToView, 3);
            //int id = Integer.parseInt(visitID);
            Billing billing = new Billing(visitID);
            billing.setVisible(true);

            if (patientElementToView != -1) {
                System.out.println(visitID);
                billing.setAccessLevel(accessLevel);
                billing.setVisitID(visitID);
                this.dispose();
            }
            
    }//GEN-LAST:event_selectButtonActionPerformed

    
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
            java.util.logging.Logger.getLogger(TodaysVisit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TodaysVisit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TodaysVisit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TodaysVisit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TodaysVisit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchField;
    private javax.swing.JButton selectButton;
    private javax.swing.JTable visitTable;
    // End of variables declaration//GEN-END:variables
}
