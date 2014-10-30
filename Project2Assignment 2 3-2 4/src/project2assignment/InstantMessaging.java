/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2assignment;

import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author GuestAccount
 */
public class InstantMessaging extends javax.swing.JFrame {

    private ChatQuery chatQuery;
    private int userID;
    private DateFormat df;
    private String accessLevel;
    private DefaultTableModel chatTableModel;

    /**
     * Creates new form InstantMessaging
     */
    public InstantMessaging() {
        chatQuery = new ChatQuery();
        df = new SimpleDateFormat("dd MMM YYYY 'at' HH:mm");
        initComponents();
        chatTableModel = new DefaultTableModel();
        chatTableModel.setColumnCount(3);
        chatTableModel.setColumnIdentifiers(new String[]{"Time", "Sender", "Message"
        });
        chatTable.setModel(chatTableModel);
        loadChatTable();
    }

    private void loadChatTable() {
        List<Chat> entries = chatQuery.retrieve();
        int tableRow = 0;
        chatTableModel.setNumRows(entries.size());
        for (Chat p : entries) {
            chatTableModel.setValueAt(df.format(p.getTimestamp()), tableRow, 0);
            chatTableModel.setValueAt(p.getUsername(), tableRow, 1);
            chatTableModel.setValueAt(p.getMessage(), tableRow, 2);
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

        jInternalFrame2 = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        chatTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        messageTextArea = new javax.swing.JTextArea();
        refreshButton = new javax.swing.JButton();
        sendButton = new javax.swing.JButton();
        Welcome = new javax.swing.JLabel();
        patientButton = new javax.swing.JButton();
        patientLabel = new javax.swing.JLabel();
        patientTab = new javax.swing.JLabel();
        messagingButton = new javax.swing.JButton();
        messagingLabel = new javax.swing.JLabel();
        messagingTab = new javax.swing.JLabel();
        billingButton = new javax.swing.JButton();
        billingLabel = new javax.swing.JLabel();
        billingTab = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        genetech = new javax.swing.JLabel();
        scheduleButton = new javax.swing.JButton();
        scheduleLabel = new javax.swing.JLabel();
        scheduleTab = new javax.swing.JLabel();
        adminButton = new javax.swing.JButton();
        adminLabel = new javax.swing.JLabel();
        adminTab = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame2.setBackground(new java.awt.Color(204, 204, 204));
        jInternalFrame2.setClosable(true);
        jInternalFrame2.setIconifiable(true);
        jInternalFrame2.setMaximizable(true);
        jInternalFrame2.setResizable(true);
        jInternalFrame2.setTitle("Message Board");
        jInternalFrame2.setPreferredSize(new java.awt.Dimension(966, 966));
        jInternalFrame2.setVisible(true);
        jInternalFrame2.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        chatTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(chatTable);

        jInternalFrame2.getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 950, 240));

        messageTextArea.setColumns(20);
        messageTextArea.setRows(5);
        jScrollPane2.setViewportView(messageTextArea);

        jInternalFrame2.getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 480, 130));

        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });
        jInternalFrame2.getContentPane().add(refreshButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 440, 100, 40));

        sendButton.setText("Send");
        sendButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sendButtonMouseClicked(evt);
            }
        });
        sendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendButtonActionPerformed(evt);
            }
        });
        jInternalFrame2.getContentPane().add(sendButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 490, 100, 40));

        Welcome.setBackground(new java.awt.Color(0, 0, 0));
        Welcome.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        Welcome.setForeground(new java.awt.Color(255, 255, 255));
        Welcome.setText("Welcome, ");
        jInternalFrame2.getContentPane().add(Welcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 0, -1, 30));

        patientButton.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        patientButton.setForeground(new java.awt.Color(255, 255, 255));
        patientButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
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
        jInternalFrame2.getContentPane().add(patientButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 170, 80));

        patientLabel.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        patientLabel.setForeground(new java.awt.Color(255, 255, 255));
        patientLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2assignment/users.png"))); // NOI18N
        patientLabel.setText("Patients");
        jInternalFrame2.getContentPane().add(patientLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 160, -1));

        patientTab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2assignment/button2.png"))); // NOI18N
        jInternalFrame2.getContentPane().add(patientTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 170, -1));

        messagingButton.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        messagingButton.setForeground(new java.awt.Color(255, 255, 255));
        messagingButton.setBorderPainted(false);
        messagingButton.setOpaque(false);
        messagingButton.setContentAreaFilled(false);
        messagingButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                messagingButtonMouseClicked(evt);
            }
        });
        messagingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messagingButtonActionPerformed(evt);
            }
        });
        jInternalFrame2.getContentPane().add(messagingButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 170, 80));

        messagingLabel.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        messagingLabel.setForeground(new java.awt.Color(255, 255, 255));
        messagingLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2assignment/comments1.png"))); // NOI18N
        messagingLabel.setText("Messages");
        messagingLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jInternalFrame2.getContentPane().add(messagingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, 70));

        messagingTab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2assignment/Buttonclicked3.png"))); // NOI18N
        jInternalFrame2.getContentPane().add(messagingTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        billingButton.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        billingButton.setForeground(new java.awt.Color(255, 255, 255));
        billingButton.setBorderPainted(false);
        billingButton.setOpaque(false);
        billingButton.setContentAreaFilled(false);
        billingButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                billingButtonMouseClicked(evt);
            }
        });
        billingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billingButtonActionPerformed(evt);
            }
        });
        jInternalFrame2.getContentPane().add(billingButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 170, 80));

        billingLabel.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        billingLabel.setForeground(new java.awt.Color(255, 255, 255));
        billingLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2assignment/credit_card.png"))); // NOI18N
        billingLabel.setText("Billing");
        jInternalFrame2.getContentPane().add(billingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 160, -1));

        billingTab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2assignment/button2.png"))); // NOI18N
        jInternalFrame2.getContentPane().add(billingTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        jLabel8.setBackground(new java.awt.Color(245, 245, 245));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2assignment/panel5.png"))); // NOI18N
        jInternalFrame2.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 120, -1, -1));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2assignment/logo-glow.png"))); // NOI18N
        jInternalFrame2.getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        genetech.setBackground(new java.awt.Color(255, 255, 255));
        genetech.setFont(new java.awt.Font("Georgia", 0, 60)); // NOI18N
        genetech.setForeground(new java.awt.Color(234, 234, 234));
        genetech.setText("Genetech");
        genetech.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                genetechMouseClicked(evt);
            }
        });
        jInternalFrame2.getContentPane().add(genetech, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 250, 90));

        scheduleButton.setBorderPainted(false);
        scheduleButton.setOpaque(false);
        scheduleButton.setContentAreaFilled(false);
        scheduleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scheduleButtonActionPerformed(evt);
            }
        });
        jInternalFrame2.getContentPane().add(scheduleButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 170, 80));

        scheduleLabel.setBackground(new java.awt.Color(255, 255, 255));
        scheduleLabel.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        scheduleLabel.setForeground(new java.awt.Color(255, 255, 255));
        scheduleLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2assignment/edit.png"))); // NOI18N
        scheduleLabel.setText("Schedule");
        jInternalFrame2.getContentPane().add(scheduleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        scheduleTab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2assignment/button2.png"))); // NOI18N
        jInternalFrame2.getContentPane().add(scheduleTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

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
        jInternalFrame2.getContentPane().add(adminButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 170, 80));

        adminLabel.setBackground(new java.awt.Color(255, 255, 255));
        adminLabel.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        adminLabel.setForeground(new java.awt.Color(255, 255, 255));
        adminLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2assignment/id_card.png"))); // NOI18N
        adminLabel.setText("Admin");
        jInternalFrame2.getContentPane().add(adminLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, -1, -1));

        adminTab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2assignment/button2.png"))); // NOI18N
        jInternalFrame2.getContentPane().add(adminTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2assignment/backdrop.png"))); // NOI18N
        jInternalFrame2.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-110, -230, -1, 980));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jInternalFrame2, javax.swing.GroupLayout.PREFERRED_SIZE, 1262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jInternalFrame2, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void patientButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patientButtonMouseClicked
        //new PatientForm().setVisible(true);
        this.dispose();  // TODO add your handling code here:
    }//GEN-LAST:event_patientButtonMouseClicked

    private void patientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientButtonActionPerformed

    private void messagingButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_messagingButtonMouseClicked
        new InstantMessaging().setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_messagingButtonMouseClicked

    private void messagingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messagingButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_messagingButtonActionPerformed

    private void billingButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billingButtonMouseClicked
        new Billing(0).setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_billingButtonMouseClicked

    private void billingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billingButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_billingButtonActionPerformed

    private void scheduleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scheduleButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_scheduleButtonActionPerformed

    private void genetechMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_genetechMouseClicked
        new HomePage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_genetechMouseClicked

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        loadChatTable();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void sendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendButtonActionPerformed
        Chat c = new Chat(userID, null, messageTextArea.getText(), null);
        chatQuery.send(c);
        loadChatTable();
        messageTextArea.setText("");
    }//GEN-LAST:event_sendButtonActionPerformed

    private void sendButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sendButtonMouseClicked

    }//GEN-LAST:event_sendButtonMouseClicked

    private void adminButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_adminButtonMouseClicked

    private void adminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminButtonActionPerformed

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
            java.util.logging.Logger.getLogger(InstantMessaging.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InstantMessaging.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InstantMessaging.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InstantMessaging.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InstantMessaging().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Welcome;
    private javax.swing.JButton adminButton;
    private javax.swing.JLabel adminLabel;
    private javax.swing.JLabel adminTab;
    private javax.swing.JButton billingButton;
    private javax.swing.JLabel billingLabel;
    private javax.swing.JLabel billingTab;
    private javax.swing.JTable chatTable;
    private javax.swing.JLabel genetech;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel logo;
    private javax.swing.JTextArea messageTextArea;
    private javax.swing.JButton messagingButton;
    private javax.swing.JLabel messagingLabel;
    private javax.swing.JLabel messagingTab;
    private javax.swing.JButton patientButton;
    private javax.swing.JLabel patientLabel;
    private javax.swing.JLabel patientTab;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton scheduleButton;
    private javax.swing.JLabel scheduleLabel;
    private javax.swing.JLabel scheduleTab;
    private javax.swing.JButton sendButton;
    // End of variables declaration//GEN-END:variables
}
