/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2assignment;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author GuestAccount
 */
public class HomePage extends javax.swing.JFrame {

    private String accessLevel;
    private int userID;
    private DefaultTableModel appointmentTableModel;
    private final int NUM_ROWS = 32;
    private final int NUM_COLS = 3;
    private VisitQuery visitQuery;
    private DateFormat df;
    private JPopupMenu popupMenu;
    private JMenuItem viewPatient;
    private JMenuItem viewMedicalRecord;
    private JMenuItem viewHistory;

    /**
     * Creates new form HomePage
     */
    public HomePage() {
        initComponents();
        visitQuery = new VisitQuery();
        df = new SimpleDateFormat("HH:mm");
        appointmentTableModel = new DefaultTableModel();
        appointmentTableModel.setColumnCount(NUM_COLS);
        appointmentTableModel.setNumRows(NUM_ROWS);
        appointmentTableModel.setColumnIdentifiers(new String[]{"Time", "Alexandrou Constantinides", "Jan Ivanovic"});
        appointmentTable.setModel(appointmentTableModel);
        loadTableModel();
        //loadTodaysAppointments();
    }

    public void loadTableModel() {
        appointmentTableModel.setValueAt("09:00", 0, 0);
        appointmentTableModel.setValueAt("09:15", 1, 0);
        appointmentTableModel.setValueAt("09:30", 2, 0);
        appointmentTableModel.setValueAt("09:45", 3, 0);
        appointmentTableModel.setValueAt("10:00", 4, 0);
        appointmentTableModel.setValueAt("10:15", 5, 0);
        appointmentTableModel.setValueAt("10:30", 6, 0);
        appointmentTableModel.setValueAt("10:45", 7, 0);
        appointmentTableModel.setValueAt("11:00", 8, 0);
        appointmentTableModel.setValueAt("11:15", 9, 0);
        appointmentTableModel.setValueAt("11:30", 10, 0);
        appointmentTableModel.setValueAt("11:45", 11, 0);
        appointmentTableModel.setValueAt("12:00", 12, 0);
        appointmentTableModel.setValueAt("12:15", 13, 0);
        appointmentTableModel.setValueAt("12:30", 14, 0);
        appointmentTableModel.setValueAt("12:45", 15, 0);
        appointmentTableModel.setValueAt("13:00", 16, 0);
        appointmentTableModel.setValueAt("13:15", 17, 0);
        appointmentTableModel.setValueAt("13:30", 18, 0);
        appointmentTableModel.setValueAt("13:45", 19, 0);
        appointmentTableModel.setValueAt("14:00", 20, 0);
        appointmentTableModel.setValueAt("14:15", 21, 0);
        appointmentTableModel.setValueAt("14:30", 22, 0);
        appointmentTableModel.setValueAt("14:45", 23, 0);
        appointmentTableModel.setValueAt("15:00", 24, 0);
        appointmentTableModel.setValueAt("15:15", 25, 0);
        appointmentTableModel.setValueAt("15:30", 26, 0);
        appointmentTableModel.setValueAt("15:45", 27, 0);
        appointmentTableModel.setValueAt("16:00", 28, 0);
        appointmentTableModel.setValueAt("16:15", 29, 0);
        appointmentTableModel.setValueAt("16:30", 30, 0);
        appointmentTableModel.setValueAt("16:45", 31, 0);
        
        List<VisitToday> entries = visitQuery.getTodaysVisits();

        for (int i = 1; i < NUM_COLS; i++) {
            for (int j = 0; j < NUM_ROWS; j++) {
                for (VisitToday v : entries) {
                    if (appointmentTableModel.getColumnName(i).equals(v.getDoctorName()) & df.format(v.getVisitTime()) != null & appointmentTableModel.getValueAt(j, 0).equals(df.format(v.getVisitTime()))) {
                        
                        appointmentTableModel.setValueAt(v.getPatientName(), j, i);
                    } else {
                        appointmentTableModel.setValueAt("", j, i);
                    }
                }
            }
        }
        loadPopupMenu();
    }
    
    public void loadOtherAppointments(String d) {
        System.out.println("we in");
        System.out.println(d);
        
        appointmentTableModel.setValueAt("09:00", 0, 0);
        appointmentTableModel.setValueAt("09:15", 1, 0);
        appointmentTableModel.setValueAt("09:30", 2, 0);
        appointmentTableModel.setValueAt("09:45", 3, 0);
        appointmentTableModel.setValueAt("10:00", 4, 0);
        appointmentTableModel.setValueAt("10:15", 5, 0);
        appointmentTableModel.setValueAt("10:30", 6, 0);
        appointmentTableModel.setValueAt("10:45", 7, 0);
        appointmentTableModel.setValueAt("11:00", 8, 0);
        appointmentTableModel.setValueAt("11:15", 9, 0);
        appointmentTableModel.setValueAt("11:30", 10, 0);
        appointmentTableModel.setValueAt("11:45", 11, 0);
        appointmentTableModel.setValueAt("12:00", 12, 0);
        appointmentTableModel.setValueAt("12:15", 13, 0);
        appointmentTableModel.setValueAt("12:30", 14, 0);
        appointmentTableModel.setValueAt("12:45", 15, 0);
        appointmentTableModel.setValueAt("13:00", 16, 0);
        appointmentTableModel.setValueAt("13:15", 17, 0);
        appointmentTableModel.setValueAt("13:30", 18, 0);
        appointmentTableModel.setValueAt("13:45", 19, 0);
        appointmentTableModel.setValueAt("14:00", 20, 0);
        appointmentTableModel.setValueAt("14:15", 21, 0);
        appointmentTableModel.setValueAt("14:30", 22, 0);
        appointmentTableModel.setValueAt("14:45", 23, 0);
        appointmentTableModel.setValueAt("15:00", 24, 0);
        appointmentTableModel.setValueAt("15:15", 25, 0);
        appointmentTableModel.setValueAt("15:30", 26, 0);
        appointmentTableModel.setValueAt("15:45", 27, 0);
        appointmentTableModel.setValueAt("16:00", 28, 0);
        appointmentTableModel.setValueAt("16:15", 29, 0);
        appointmentTableModel.setValueAt("16:30", 30, 0);
        appointmentTableModel.setValueAt("16:45", 31, 0);
        
        List<VisitToday> entries = visitQuery.getVisits(d);

        for (int i = 1; i < NUM_COLS; i++) {
            for (int j = 0; j < NUM_ROWS; j++) {
                for (VisitToday v : entries) {
                    if (appointmentTableModel.getColumnName(i).equals(v.getDoctorName()) & df.format(v.getVisitTime()) != null & appointmentTableModel.getValueAt(j, 0).equals(df.format(v.getVisitTime()))) {
                        
                        appointmentTableModel.setValueAt(v.getPatientName(), j, i);
                    } else {
                        appointmentTableModel.setValueAt("", j, i);
                    }
                }
            }
        }
        loadPopupMenu();
    }

    private void loadPopupMenu() {
        popupMenu = new JPopupMenu();
        viewPatient = new JMenuItem("Get Info");
        viewMedicalRecord = new JMenuItem("View Medical Record");
        viewHistory = new JMenuItem("View past visits");

        viewPatient.addActionListener(viewPatientListener);

        popupMenu.add(viewPatient);
        popupMenu.add(viewMedicalRecord);
        popupMenu.add(viewHistory);

        appointmentTable.setComponentPopupMenu(popupMenu);
    }
    
    private final ActionListener viewPatientListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            int patientElementToView = appointmentTable.getSelectedRow();
            String patientID = (String) appointmentTable.getValueAt(patientElementToView, 0);
            int id = Integer.parseInt(patientID);
            

            if (patientElementToView != -1) {
                System.out.println(id);
                PatientForm form = new PatientForm(accessLevel);
                //form.setAccessLevel(accessLevel);
                form.setAction(PatientForm.Action.EDIT);
                form.setToEdit(id);
                setVisible(false);
                form.setVisible(true);
            }
        }
    };

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT
     * modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jFrame1 = new javax.swing.JFrame();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        appointmentTable = new javax.swing.JTable();
        Welcome = new javax.swing.JLabel();
        Welcome1 = new javax.swing.JLabel();
        goButton = new javax.swing.JButton();
        appointmentDayComboBox = new javax.swing.JComboBox();
        appointmentMonthComboBox = new javax.swing.JComboBox();
        patientButton = new javax.swing.JButton();
        patientLabel = new javax.swing.JLabel();
        patientTab = new javax.swing.JLabel();
        messagingButton = new javax.swing.JButton();
        messagingLabel = new javax.swing.JLabel();
        messagingTab = new javax.swing.JLabel();
        billingButton = new javax.swing.JButton();
        billingLabel = new javax.swing.JLabel();
        billingTab = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        genetech = new javax.swing.JLabel();
        scheduleButton = new javax.swing.JButton();
        scheduleLabel = new javax.swing.JLabel();
        scheduleTab = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        adminLabel = new javax.swing.JLabel();
        adminTab = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("jMenu1");

        jMenuItem2.setText("jMenuItem2");

        jMenu4.setText("jMenu4");

        jMenu5.setText("jMenu5");

        jMenuItem3.setText("jMenuItem3");

        jMenu8.setText("File");
        jMenuBar3.add(jMenu8);

        jMenu9.setText("Edit");
        jMenuBar3.add(jMenu9);

        jMenu10.setText("jMenu10");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame2.setBackground(new java.awt.Color(204, 204, 204));
        jInternalFrame2.setClosable(true);
        jInternalFrame2.setIconifiable(true);
        jInternalFrame2.setMaximizable(true);
        jInternalFrame2.setResizable(true);
        jInternalFrame2.setTitle("Homepage");
        jInternalFrame2.setPreferredSize(new java.awt.Dimension(966, 966));
        jInternalFrame2.setVisible(true);
        jInternalFrame2.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        appointmentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Appointment Time", "Patient Lastname", "Patient First Name", "Title 4"
            }
        ));
        TableColumn column = null;
        for (int i = 0; i < 4; i++) {
            column = appointmentTable.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(10);
            } else {
                column.setPreferredWidth(50);
            }
        }
        appointmentTable.setCellSelectionEnabled(true);
        jScrollPane1.setViewportView(appointmentTable);

        jInternalFrame2.getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 1020, 440));

        Welcome.setBackground(new java.awt.Color(0, 0, 0));
        Welcome.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        Welcome.setForeground(new java.awt.Color(255, 255, 255));
        Welcome.setText("View another date:");
        jInternalFrame2.getContentPane().add(Welcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 70, -1, 40));

        Welcome1.setBackground(new java.awt.Color(0, 0, 0));
        Welcome1.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        Welcome1.setForeground(new java.awt.Color(255, 255, 255));
        Welcome1.setText("Welcome, ");
        jInternalFrame2.getContentPane().add(Welcome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 0, -1, 30));

        goButton.setText("Go");
        goButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goButtonActionPerformed(evt);
            }
        });
        jInternalFrame2.getContentPane().add(goButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 80, 50, -1));

        appointmentDayComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        appointmentDayComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jInternalFrame2.getContentPane().add(appointmentDayComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 80, 60, -1));

        appointmentMonthComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "10/2014", "11/2014", "12/2014", "01/2015", "02/2015", "03/2015", "04/2015", "05/2015" }));
        appointmentMonthComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appointmentMonthComboBoxActionPerformed(evt);
            }
        });
        jInternalFrame2.getContentPane().add(appointmentMonthComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 80, -1, -1));

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
        jInternalFrame2.getContentPane().add(messagingButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 170, 80));

        messagingLabel.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        messagingLabel.setForeground(new java.awt.Color(255, 255, 255));
        messagingLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2assignment/comments1.png"))); // NOI18N
        messagingLabel.setText("Messages");
        messagingLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jInternalFrame2.getContentPane().add(messagingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, 70));

        messagingTab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2assignment/button2.png"))); // NOI18N
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

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2assignment/logo-glow.png"))); // NOI18N
        jInternalFrame2.getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        genetech.setBackground(new java.awt.Color(255, 255, 255));
        genetech.setFont(new java.awt.Font("Georgia", 0, 60)); // NOI18N
        genetech.setForeground(new java.awt.Color(234, 234, 234));
        genetech.setText("Genetech");
        jInternalFrame2.getContentPane().add(genetech, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 250, 90));

        scheduleButton.setBorderPainted(false);
        scheduleButton.setContentAreaFilled(false);
        scheduleButton.setOpaque(false);
        scheduleButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                scheduleButtonMouseClicked(evt);
            }
        });
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

        scheduleTab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2assignment/Untitled3.png"))); // NOI18N
        jInternalFrame2.getContentPane().add(scheduleTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setEnabled(false);
        jInternalFrame2.getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 170, 80));

        adminLabel.setBackground(new java.awt.Color(255, 255, 255));
        adminLabel.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        adminLabel.setForeground(new java.awt.Color(255, 255, 255));
        adminLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2assignment/id_card.png"))); // NOI18N
        adminLabel.setText("Admin");
        jInternalFrame2.getContentPane().add(adminLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, -1, -1));

        adminTab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2assignment/button2.png"))); // NOI18N
        jInternalFrame2.getContentPane().add(adminTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2assignment/backdrop.png"))); // NOI18N
        jInternalFrame2.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-110, -200, -1, 980));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame2, javax.swing.GroupLayout.DEFAULT_SIZE, 1262, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame2, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void patientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientButtonActionPerformed

    private void billingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billingButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_billingButtonActionPerformed

    private void billingButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billingButtonMouseClicked
        Billing billing = new Billing(0);
        billing.setVisible(true);
        billing.setAccessLevel(accessLevel);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_billingButtonMouseClicked

    private void patientButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patientButtonMouseClicked
        PatientView patient = new PatientView();
        patient.setVisible(true);
        patient.setAccessLevel(accessLevel);
        patient.setUserID(userID);
        this.dispose();  // TODO add your handling code here:
    }//GEN-LAST:event_patientButtonMouseClicked

    private void messagingButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_messagingButtonMouseClicked
        InstantMessaging im = new InstantMessaging();
        im.setVisible(true);
        im.setAccessLevel(accessLevel);
        im.setUserID(userID);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_messagingButtonMouseClicked

    private void messagingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messagingButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_messagingButtonActionPerformed

    private void scheduleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scheduleButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_scheduleButtonActionPerformed

    private void scheduleButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scheduleButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_scheduleButtonMouseClicked

    private void appointmentMonthComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appointmentMonthComboBoxActionPerformed

    }//GEN-LAST:event_appointmentMonthComboBoxActionPerformed

    private void goButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goButtonActionPerformed
        System.out.println("gobutton");
      System.out.println(appointmentDayComboBox.getSelectedItem() + "/" + (String) appointmentMonthComboBox.getSelectedItem());
        loadOtherAppointments(appointmentDayComboBox.getSelectedItem() + "/" + (String) appointmentMonthComboBox.getSelectedItem());
       // System.out.println(appointmentDayComboBox.getSelectedItem() + "/" + (String) appointmentMonthComboBox.getSelectedItem());
    }//GEN-LAST:event_goButtonActionPerformed

    /**
     * @param accessLevel the accessLevel to set
     */
    public void setAccessLevel(String accessLevel) {
        this.accessLevel = accessLevel;
        System.out.println("(HomePage) accesslevel is " + accessLevel);
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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Welcome;
    private javax.swing.JLabel Welcome1;
    private javax.swing.JLabel adminLabel;
    private javax.swing.JLabel adminTab;
    private javax.swing.JComboBox appointmentDayComboBox;
    private javax.swing.JComboBox appointmentMonthComboBox;
    private javax.swing.JTable appointmentTable;
    private javax.swing.JButton billingButton;
    private javax.swing.JLabel billingLabel;
    private javax.swing.JLabel billingTab;
    private javax.swing.JLabel genetech;
    private javax.swing.JButton goButton;
    private javax.swing.JButton jButton2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logo;
    private javax.swing.JButton messagingButton;
    private javax.swing.JLabel messagingLabel;
    private javax.swing.JLabel messagingTab;
    private javax.swing.JButton patientButton;
    private javax.swing.JLabel patientLabel;
    private javax.swing.JLabel patientTab;
    private javax.swing.JButton scheduleButton;
    private javax.swing.JLabel scheduleLabel;
    private javax.swing.JLabel scheduleTab;
    // End of variables declaration//GEN-END:variables
}
