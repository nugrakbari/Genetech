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

public class StaffQuery {

    private Connection conn = null;
    private PreparedStatement findDoctor = null;
    private PreparedStatement getAllDoctors = null;
    private PreparedStatement getAllStaff = null;
    private PreparedStatement returnStaffByID = null;
    private ResultSet rs = null;
    
    private static final String URL = "jdbc:oracle:thin:@//sage.business.unsw.edu.au:1521/orcl01.asbpldb001.ad.unsw.edu.au";
    private static final String USERNAME = "Z3373928";
    private static final String PASSWORD = "fra5reDr";
    /**
     *
     */
    public StaffQuery() {

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
            if (findDoctor != null) {
                findDoctor.close();
            }
            if (getAllDoctors != null) {
                getAllDoctors.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(StaffQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("close staff");
    }


    
    /**
     * Get all doctors
     *
     * @return ResultSet
     */
    public List<Staff> getDoctors() {
        List<Staff> results = null;
        ResultSet resultSet = null;
        openConnection();

        try {

            getAllDoctors = conn.prepareStatement(
                    "SELECT * FROM staff WHERE access_level = 1");
            resultSet = getAllDoctors.executeQuery();
            results = new ArrayList<Staff>();

            while (resultSet.next()) {
                results.add(new Staff(
                        resultSet.getInt("staff_id"),
                        resultSet.getString("staff_lastname"),
                        resultSet.getString("staff_firstname"),
                        resultSet.getString("position"),
                        resultSet.getString("access_level"),
                        resultSet.getString("username"),
                        resultSet.getString("password"),
                        resultSet.getString("specialty"),
                        resultSet.getString("prescriber_number")));
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        closeConnection();
        return results;
    }
    
    public List<Staff> searchDoctor(String keyword) {
        List<Staff> results = null;
        ResultSet resultSet = null;
        openConnection();
        try {
        System.out.println("searchDoctor searching doctor " + keyword);
        findDoctor = conn.prepareStatement("SELECT * FROM staff WHERE access_level = 1 AND "
                    + "UPPER(staff_firstname) = UPPER(?) OR "
                    + "UPPER(staff_lastname) = UPPER(?) OR "
                    + "UPPER(staff_id) = UPPER(?) OR "
                    + "UPPER(prescriber_number) = UPPER(?) OR "
                    + "UPPER(specialty) = UPPER(?)");
            findDoctor.setString(1, keyword);
            findDoctor.setString(2, keyword);
            findDoctor.setString(3, keyword);
            findDoctor.setString(4, keyword);
            findDoctor.setString(5, keyword);
            resultSet = findDoctor.executeQuery();
            results = new ArrayList<Staff>();
            
            while (resultSet.next()) {
                results.add(new Staff(
                        resultSet.getInt("staff_id"),
                        resultSet.getString("staff_lastname"),
                        resultSet.getString("staff_firstname"),
                        resultSet.getString("position"),
                        resultSet.getString("access_level"),
                        resultSet.getString("username"),
                        resultSet.getString("password"),
                        resultSet.getString("specialty"),
                        resultSet.getString("prescriber_number")));
            }
            
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        closeConnection();
        return results;
    }
    
    public List<Staff> getStaff() {

        List<Staff> results = null;
        ResultSet resultSet = null;
        openConnection();

        try {
            
            getAllStaff = conn.prepareStatement("SELECT * FROM STAFF");
            resultSet = getAllStaff.executeQuery();
            results = new ArrayList<Staff>();

            while (resultSet.next()) {
                results.add(new Staff(
                        resultSet.getInt("staff_id"),
                        resultSet.getString("staff_firstname"),
                        resultSet.getString("staff_lastname"),
                        resultSet.getString("position"),
                        resultSet.getString("access_level"),
                        resultSet.getString("username"),
                        resultSet.getString("password"),
                        resultSet.getString("specialty"),
                        resultSet.getString("prescriber_number")));
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        closeConnection();
        return results;
    }
    
     public Staff getStaffByID(int id) {
        Staff s = null;
        ResultSet resultSet = null;
        openConnection();

        try {

            returnStaffByID = conn.prepareStatement(
                    "SELECT * FROM STAFF WHERE staff_id = ?");
            returnStaffByID.setInt(1, id);
            resultSet = returnStaffByID.executeQuery();

            if (resultSet.next()) {
                s = new Staff(
                        resultSet.getInt("staff_id"),
                        resultSet.getString("staff_lastname"),
                        resultSet.getString("staff_firstname"),
                        resultSet.getString("position"),
                        resultSet.getString("access_level"),
                        resultSet.getString("username"),
                        resultSet.getString("password"),
                        resultSet.getString("specialty"),
                        resultSet.getString("prescriber_number"));
                        }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        closeConnection();
        return s;
    }
}