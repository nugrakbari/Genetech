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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nugrakbari
 */
public class VisitQuery {
    private Connection conn = null;
    private PreparedStatement insertAppointment = null;
    private PreparedStatement insertBill = null;
    private PreparedStatement displayBills = null;
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
            if (insertBill != null) {
                insertBill.close();
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
    
    public void createBill(Bill bill, int id) {
        openConnection();
        
        try {
            insertBill = conn.prepareStatement("UPDATE VISITS "
                    + "SET procedure_cost = ?, "
                    + "disc_amount = ?, "
                    + "amount_due = ?, "
                    + "amount_paid = ?, "
                    + "payment_method = ?, "
                    + "disc_reason = ? "
                    + "WHERE visit_id = ?");
            insertBill.setFloat(1, bill.getProcedureCost());
            insertBill.setFloat(2, bill.getDiscountRate());
            insertBill.setFloat(3, bill.getAmountDue());
            insertBill.setFloat(4, bill.getAmountPaid());
            insertBill.setString(5, bill.getPaymentMethod());
            insertBill.setString(6, bill.getDiscountReason());
            insertBill.setInt(7, id);
            insertBill.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PatientQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        closeConnection();
    }
    
    public List<BillingItem> getVisitBills(int id) {
        List<BillingItem> results = null;
        ResultSet resultSet = null;
        openConnection();
        
        try {
            displayBills = conn.prepareStatement("SELECT * FROM VISITS NATURAL JOIN BILLS WHERE visit_id = ?");
            displayBills.setInt(1, id);
            displayBills.executeQuery();
            
            while (resultSet.next()) {
                results.add(new BillingItem(
                    resultSet.getInt("bill#"),
                    resultSet.getInt("procedure_id"),
                    resultSet.getString("procedure_name"),
                    resultSet.getFloat("procedure_price")));
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        closeConnection();
        return results;
    }
    
}
