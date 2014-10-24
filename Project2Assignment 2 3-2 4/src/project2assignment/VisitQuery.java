/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project2assignment;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nugrakbari
 */
public class VisitQuery {
    private Connection conn = null;
    private PreparedStatement insertAppointment = null;
    private ResultSet rs = null;
    private static final String URL = "jdbc:oracle:thin:@//sage.business.unsw.edu.au:1521/orcl01.asbpldb001.ad.unsw.edu.au";
    private static final String USERNAME = "Z3373928";
    private static final String PASSWORD = "fra5reDr";
    
    public VisitQuery(){
        openConnection();
        System.out.println("connection gained");
        try {

            DatabaseMetaData dbmd = conn.getMetaData();
            
            rs = dbmd.getTables(null, "APP", "PATIENT", null);

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
            System.exit(1);
        }
        closeConnection();
    }
    
    private void openConnection() {
        try {
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("connection gained");
        } catch (SQLException ex) {
            Logger.getLogger(VisitQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void closeConnection() {
        try {
            if (rs != null) {
                rs.close();
            }
            if (insertAppointment != null) {
                insertAppointment.close();
            }
            if (conn != null) {
                conn.close();
            }
            System.out.println("connection terminated");
        } catch (SQLException ex) {
            Logger.getLogger(VisitQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void createAppointment(Appointment apt) {
        openConnection();
        
        try {
            insertAppointment = conn.prepareStatement("INSERT INTO VISITS "
                    + "(patient_id, staff_id, appointment_time, notes) "
                    + "VALUES (?,?,?,?)");
            insertAppointment.setInt(1, apt.getPatient());
            insertAppointment.setInt(2, apt.getStaff());
            insertAppointment.setDate(3, apt.getAppointmentTime());
            insertAppointment.setString(4, apt.getNote());
            insertAppointment.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(PatientQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        closeConnection();
    }
}
