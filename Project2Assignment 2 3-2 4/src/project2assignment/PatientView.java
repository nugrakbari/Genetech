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
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author GuestAccount
 */
public class PatientView extends javax.swing.JFrame {

    private JPopupMenu popupMenu;
    private JMenuItem viewPatient;
    private JMenuItem viewMedicalRecord;
    private JMenuItem viewHistory;
    private PatientQuery patientQuery;
    private DefaultTableModel patientTableModel;
    private DateFormat df;
    private String toSearch;
    private String accessLevel;
    private int userID;

    public enum Action {

        /**
         *
         */
        SEARCH;
    }
    private PatientView.Action action;

    /**
     * Creates new form PatientView
     */
    public PatientView() {
        System.out.println("loading PatientView");
        initComponents();

        df = new SimpleDateFormat("dd/MM/yyyy");
        patientQuery = new PatientQuery();

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
        loadPopupMenu();
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

    private void loadPopupMenu() {
        popupMenu = new JPopupMenu();
        viewPatient = new JMenuItem("Get Info");
        viewMedicalRecord = new JMenuItem("View Medical Record");
        viewHistory = new JMenuItem("View past visits");

        viewPatient.addActionListener(viewPatientListener);
        viewHistory.addActionListener(viewHistoryListener);

        popupMenu.add(viewPatient);
        popupMenu.add(viewMedicalRecord);
        popupMenu.add(viewHistory);

        patientTable.setComponentPopupMenu(popupMenu);
    }

    private final ActionListener viewPatientListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            int patientElementToView = patientTable.getSelectedRow();
            String patientID = (String) patientTable.getValueAt(patientElementToView, 0);
            int id = Integer.parseInt(patientID);
            

            if (patientElementToView != -1) {
                System.out.println(id);
                PatientForm form = new PatientForm(accessLevel);
                //form.setAccessLevel(accessLevel);
                form.setAction(PatientForm.Action.EDIT);
                form.setToEdit(id);
                form.setUserID(userID);
                setVisible(false);
                form.setVisible(true);
            }
        }
    };
    
    private final ActionListener viewHistoryListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            int patientElementToView = patientTable.getSelectedRow();
            String patientID = (String) patientTable.getValueAt(patientElementToView, 0);
            int id = Integer.parseInt(patientID);
            ViewHistory history = new ViewHistory(id);
            history.setVisible(true);

            if (patientElementToView != -1) {
                System.out.println(id);
                history.setVisible(true);
                history.setToView(id);
                history.setAccessLevel(accessLevel);
                history.setUserID(userID);
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
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jPopupMenu3 = new javax.swing.JPopupMenu();
        jPopupMenu4 = new javax.swing.JPopupMenu();
        jPopupMenu5 = new javax.swing.JPopupMenu();
        jPopupMenu6 = new javax.swing.JPopupMenu();
        internalFrame = new javax.swing.JInternalFrame();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        patientTable = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
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
        viewButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        adminButton = new javax.swing.JButton();
        adminLabel = new javax.swing.JLabel();
        adminTab = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        internalFrame.setClosable(true);
        internalFrame.setIconifiable(true);
        internalFrame.setMaximizable(true);
        internalFrame.setResizable(true);
        internalFrame.setTitle("Patient Database");
        internalFrame.setPreferredSize(new java.awt.Dimension(966, 966));
        internalFrame.setVisible(true);
        internalFrame.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Dr");
        internalFrame.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 10, -1, -1));

        jLabel5.setBackground(new java.awt.Color(244, 244, 244));
        jLabel5.setFont(new java.awt.Font("Georgia", 0, 60)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(235, 235, 235));
        jLabel5.setText("Genetech");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        internalFrame.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 250, 90));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2assignment/logo-glow.png"))); // NOI18N
        internalFrame.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

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
        internalFrame.getContentPane().add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 560, 100, 40));

        patientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient ID", "First Name", "Surname", "DOB", "Address", "Suburb", "Postcode", "Medicare No."
            }
        ));
        jScrollPane1.setViewportView(patientTable);

        internalFrame.getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 1020, 430));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Filter results", "Suburb", "Birth Year" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        internalFrame.getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 90, 120, 30));

        jLabel3.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Filter by:");
        internalFrame.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 90, -1, 30));

        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });
        internalFrame.getContentPane().add(searchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 90, 180, -1));

        scheduleButton.setBorderPainted(false);
        scheduleButton.setOpaque(false);
        scheduleButton.setContentAreaFilled(false);
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
        internalFrame.getContentPane().add(scheduleButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 170, 80));

        scheduleLabel.setBackground(new java.awt.Color(204, 204, 204));
        scheduleLabel.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        scheduleLabel.setForeground(new java.awt.Color(255, 255, 255));
        scheduleLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2assignment/edit.png"))); // NOI18N
        scheduleLabel.setText("Schedule");
        internalFrame.getContentPane().add(scheduleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        scheduleTab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2assignment/button2.png"))); // NOI18N
        internalFrame.getContentPane().add(scheduleTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        patientButton.setBorderPainted(false);
        patientButton.setOpaque(false);
        patientButton.setContentAreaFilled(false);
        patientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientButtonActionPerformed(evt);
            }
        });
        internalFrame.getContentPane().add(patientButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 170, 80));

        patientLabel.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        patientLabel.setForeground(new java.awt.Color(255, 255, 255));
        patientLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2assignment/users.png"))); // NOI18N
        patientLabel.setText("Patient");
        internalFrame.getContentPane().add(patientLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        patientTab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2assignment/Untitled3.png"))); // NOI18N
        internalFrame.getContentPane().add(patientTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

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
        internalFrame.getContentPane().add(billingButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 170, 80));

        billingLabel.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        billingLabel.setForeground(new java.awt.Color(255, 255, 255));
        billingLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2assignment/credit_card.png"))); // NOI18N
        billingLabel.setText("Billing");
        internalFrame.getContentPane().add(billingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        billingTab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2assignment/button2.png"))); // NOI18N
        internalFrame.getContentPane().add(billingTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

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
        internalFrame.getContentPane().add(messagesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 170, 80));

        messagesLabel.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        messagesLabel.setForeground(new java.awt.Color(255, 255, 255));
        messagesLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2assignment/comments1.png"))); // NOI18N
        messagesLabel.setText("Messages");
        internalFrame.getContentPane().add(messagesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        messagesTab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2assignment/button2.png"))); // NOI18N
        internalFrame.getContentPane().add(messagesTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

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
        internalFrame.getContentPane().add(viewButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 560, 100, 40));

        searchButton.setText("Search");
        searchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchButtonMouseClicked(evt);
            }
        });
        internalFrame.getContentPane().add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1115, 90, 90, -1));

        adminButton.setBorderPainted(false);
        adminButton.setContentAreaFilled(false);
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
        internalFrame.getContentPane().add(adminButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 170, 80));

        adminLabel.setBackground(new java.awt.Color(255, 255, 255));
        adminLabel.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        adminLabel.setForeground(new java.awt.Color(255, 255, 255));
        adminLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2assignment/id_card.png"))); // NOI18N
        adminLabel.setText("Admin");
        internalFrame.getContentPane().add(adminLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, -1, -1));

        adminTab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2assignment/button2.png"))); // NOI18N
        internalFrame.getContentPane().add(adminTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2assignment/backdrop.png"))); // NOI18N
        internalFrame.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 650));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(internalFrame, javax.swing.GroupLayout.DEFAULT_SIZE, 1262, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(internalFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addButtonActionPerformed

    private void scheduleButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scheduleButtonMouseClicked
        HomePage home = new HomePage();
            home.setVisible(true);
            home.setAccessLevel(accessLevel);
            home.setUserID(userID);
            this.dispose();
    }//GEN-LAST:event_scheduleButtonMouseClicked

    private void billingButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billingButtonMouseClicked
        Billing billing = new Billing(0);
        billing.setVisible(true);
        billing.setAccessLevel(accessLevel);
        this.dispose();
    }//GEN-LAST:event_billingButtonMouseClicked

    private void messagesButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_messagesButtonMouseClicked
        InstantMessaging im = new InstantMessaging();
        im.setVisible(true);
        im.setAccessLevel(accessLevel);
        im.setUserID(userID);
        this.dispose();
    }//GEN-LAST:event_messagesButtonMouseClicked

    private void patientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientButtonActionPerformed

    private void addButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseClicked
        PatientForm patient = new PatientForm(accessLevel);
        patient.setVisible(true);
        patient.setAccessLevel(accessLevel);
        patient.setUserID(userID);
        this.dispose();
    }//GEN-LAST:event_addButtonMouseClicked

    private void viewButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewButtonMouseClicked
        PatientForm patient = new PatientForm(accessLevel);
        patient.setVisible(true);
        patient.setAccessLevel(accessLevel);
        patient.setUserID(userID);
        this.dispose();
    }//GEN-LAST:event_viewButtonMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        HomePage home = new HomePage();
        home.setVisible(true);
        home.setAccessLevel(accessLevel);
        home.setUserID(userID);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseClicked

    private void scheduleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scheduleButtonActionPerformed
        HomePage home = new HomePage();
        home.setVisible(true);
        home.setAccessLevel(accessLevel);
        home.setUserID(userID);
        this.dispose();
    }//GEN-LAST:event_scheduleButtonActionPerformed

    private void searchButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchButtonMouseClicked
        toSearch = searchField.getText();
        searchPatientTable();
    }//GEN-LAST:event_searchButtonMouseClicked

    private void adminButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminButtonMouseClicked
        AdminView admin = new AdminView();
        admin.setVisible(true);
        admin.setAccessLevel(accessLevel);
        admin.setUserID(userID);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_adminButtonMouseClicked

    private void adminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminButtonActionPerformed
        AdminView admin = new AdminView();
        admin.setVisible(true);
        admin.setAccessLevel(accessLevel);
        admin.setUserID(userID);
        this.dispose();
    }//GEN-LAST:event_adminButtonActionPerformed

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
        int patientElementToView = patientTable.getSelectedRow();
            String patientID = (String) patientTable.getValueAt(patientElementToView, 0);
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
    }//GEN-LAST:event_viewButtonActionPerformed

    private void messagesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messagesButtonActionPerformed
        InstantMessaging im = new InstantMessaging();
        im.setVisible(true);
        im.setAccessLevel(accessLevel);
        im.setUserID(userID);
        this.dispose();
    }//GEN-LAST:event_messagesButtonActionPerformed

    private void billingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billingButtonActionPerformed
        Billing bill = new Billing(0);
        bill.setVisible(true);
        bill.setAccessLevel(accessLevel);
        bill.setUserID(userID);
        this.dispose();
    }//GEN-LAST:event_billingButtonActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {
        loadPopupMenu();
    }

    /**
     *
     * @param action
     */
    public void setAction(PatientView.Action action) {
        this.action = action;
        System.out.println("Setting action as " + action);
    }

    public void setToSearch(String toSearch) {
        this.toSearch = toSearch;
        System.out.println("Searching for " + toSearch);
    }

    /**
     * @param accessLevel the accessLevel to set
     */
    public void setAccessLevel(String accessLevel) {
        this.accessLevel = accessLevel;
        System.out.println("(PatientView) accesslevel is " + accessLevel);
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
            java.util.logging.Logger.getLogger(PatientView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientView().setVisible(true);
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
    private javax.swing.JInternalFrame internalFrame;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JPopupMenu jPopupMenu3;
    private javax.swing.JPopupMenu jPopupMenu4;
    private javax.swing.JPopupMenu jPopupMenu5;
    private javax.swing.JPopupMenu jPopupMenu6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton messagesButton;
    private javax.swing.JLabel messagesLabel;
    private javax.swing.JLabel messagesTab;
    private javax.swing.JButton patientButton;
    private javax.swing.JLabel patientLabel;
    private javax.swing.JLabel patientTab;
    private javax.swing.JTable patientTable;
    private javax.swing.JButton scheduleButton;
    private javax.swing.JLabel scheduleLabel;
    private javax.swing.JLabel scheduleTab;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchField;
    private javax.swing.JButton viewButton;
    // End of variables declaration//GEN-END:variables
}
