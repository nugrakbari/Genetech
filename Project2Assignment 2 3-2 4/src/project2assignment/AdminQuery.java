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

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author erina ung 
 */
public class AdminQuery {
     
    private Connection conn = null;
    private PreparedStatement insertStaff = null;
    private PreparedStatement updateStaff = null;
    private ResultSet rs = null;
    private PreparedStatement getAllStaff = null;
    private PreparedStatement findStaff = null;
    private PreparedStatement returnStaffByID = null;
    
    private static final String URL = "jdbc:oracle:thin:@//sage.business.unsw.edu.au:1521/orcl01.asbpldb001.ad.unsw.edu.au";
    private static final String USERNAME = "Z3373928";
    private static final String PASSWORD = "fra5reDr";
    
    public AdminQuery() {
        openConnection();
        System.out.println("connection gained");
        try {

            DatabaseMetaData dbmd = conn.getMetaData();
            
            rs = dbmd.getTables(null, "APP", "STAFF", null);

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
            Logger.getLogger(PatientQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void closeConnection() {
        try {
            if (rs != null) {
                rs.close();
            }
            if (insertStaff != null) {
                insertStaff.close();
            }
            if (getAllStaff != null) {
                getAllStaff.close();
            }
            if (updateStaff != null) {
                updateStaff.close();
            }
            if (returnStaffByID != null) {
                returnStaffByID.close();
            }
            if (findStaff != null) {
                findStaff.close();
            }
            if (conn != null) {
                conn.close();
            }
            System.out.println("connection terminated");
        } catch (SQLException ex) {
            Logger.getLogger(PatientQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Get all staff
     * @return ResultSet
     */
    /*public List<Staff> getStaff() {

        List<Staff> results = null;
        ResultSet resultSet = null;
        openConnection();

        try {
            
            getAllStaff = conn.prepareStatement("SELECT * FROM STAFF");
            resultSet = getAllStaff.executeQuery();
            results = new ArrayList<Staff>();

            while (resultSet.next()) {
                results.add(new Staff(
                        resultSet.getString("staff_id"),
                        resultSet.getString("staff_lastname"),
                        resultSet.getString("staff_firstname"),
                        resultSet.getString("position"),
                        resultSet.getString("access_level")));
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        closeConnection();
        return results;
    }*/
    
    /*public List<Staff> searchStaff(String keyword) {
        System.out.println("searchStaff searching staff " + keyword);
        List<Staff> results = null;
        ResultSet resultSet = null;
        openConnection();

        try {
            
            findStaff = conn.prepareStatement("SELECT * FROM STAFF WHERE "
                    + "TO_CHAR(staff_id) = ? OR "
                    + "UPPER(staff_lastname) = UPPER(?) OR "
                    + "UPPER(staff_firstname) = UPPER(?) OR "
                    + "UPPER(position) = UPPER(?) OR "
                    + "access_level = ? OR ");
            findStaff.setString(1, keyword);
            findStaff.setString(2, keyword);
            findStaff.setString(3, keyword);
            findStaff.setString(4, keyword);
            resultSet = findStaff.executeQuery();
            results = new ArrayList<Staff>();

            while (resultSet.next()) {
                results.add(new Staff(
                        resultSet.getString("staff_id"),
                        resultSet.getString("staff_lastname"),
                        resultSet.getString("staff_firstname"),
                        resultSet.getString("position"),
                        resultSet.getString("access_level")));
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        closeConnection();
        return results;
    }*/
    
    
    
    /**
     * Get staff by ID
     * @param id Patient ID
     * @return ResultSet
     */
    /*public Staff getStaffByID(int id) {
        Staff p = null;
        ResultSet resultSet = null;
        openConnection();

        try {

            returnStaffByID = conn.prepareStatement(
                    "SELECT * FROM STAFF WHERE staff_id = ?");
            returnStaffByID.setInt(1, id);
            resultSet = returnStaffByID.executeQuery();

            if (resultSet.next()) {
                p = new Staff (
                        resultSet.getString("staff_id"),
                        resultSet.getString("staff_lastname"),
                        resultSet.getString("staff_firstname"),
                        resultSet.getString("position"),
                        resultSet.getString("access_level"));
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        closeConnection();
        return p;
    }
    
    /**
     * Add a Staff/Admin
     * @param staff Staff to be added
     */
    /*public void add (Staff staff) {
        openConnection();

        try {
            insertStaff = conn.prepareStatement(
                    "INSERT INTO STAFF "
                    + "(staff_lastname, staff_firstname, position, access_level, "
                    + "VALUES (?,?,?,?)");
            insertStaff.setString(1, staff.getLastName());
            insertStaff.setString(2, staff.getFirstName());
            insertStaff.setString(3, staff.getPosition());
            insertStaff.setString(4, staff.getAccessLevel());
            insertStaff.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(AdminQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        closeConnection();
    }
    
    public void update (int id, Staff staff) {
        openConnection();
        
        try {
            updateStaff = conn.prepareStatement(
                    "UPDATE STAFF " 
                    + "staff_lastname = ?, "
                    + "staff_firstname = ?, "
                    + "position = ?,"
                    + "access_level = ?, "
                    + "WHERE patient_id = ?");
            updateStaff.setString(1, staff.getLastName());
            updateStaff.setString(2, staff.getFirstName());
            updateStaff.setString(3, staff.getPosition());
            updateStaff.setString(4, staff.getAccessLevel()); 
            updateStaff.setInt(5, id);
            updateStaff.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PatientQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        closeConnection();
    }*/
}
