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
public class AdminView extends javax.swing.JFrame {

    /**
     * Creates new form AdminForm
     */
    public AdminView() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
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

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jInternalFrame1.getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 1020, 440));

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
        new HomePage().setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    private void scheduleButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scheduleButtonMouseClicked
        new HomePage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_scheduleButtonMouseClicked

    private void patientButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patientButtonMouseClicked
        new PatientView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_patientButtonMouseClicked

    private void patientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientButtonActionPerformed

    private void billingButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billingButtonMouseClicked
        new Billing().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_billingButtonMouseClicked

    private void messagesButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_messagesButtonMouseClicked
        new InstantMessaging().setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_messagesButtonMouseClicked

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
    private javax.swing.JButton billingButton;
    private javax.swing.JLabel billingLabel;
    private javax.swing.JLabel billingTab;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
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
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}
