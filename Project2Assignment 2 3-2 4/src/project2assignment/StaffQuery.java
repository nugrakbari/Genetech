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
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StaffQuery {

    private Connection conn = null;
    private PreparedStatement insertStaff = null;
    private ResultSet rs = null;
    private PreparedStatement getAllStaff = null;
    private PreparedStatement getAllDoctors = null;
    private PreparedStatement getAllNurses= null; 
    private PreparedStatement getAllReceptionist= null; 
    private final PreparedStatement updateStaff = null;
    private PreparedStatement returnStaffByID = null;
    private int currentID;
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
            if (getAllStaff !=null)  {
                getAllStaff.close(); 
            }
            if (getAllDoctors !=null)  {
                getAllDoctors.close(); 
            }
            if (getAllNurses !=null)  {
                getAllNurses.close(); 
            }
            if (getAllReceptionist !=null)  {
                getAllReceptionist.close(); 
            }
            if (returnStaffByID != null) {
                returnStaffByID.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(StaffQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("close staff");
    }

    /**
     * Get all staff
     * @return ResultSet
     */
    public List<Staff> getStaff() {

        List<Staff> results = null;
        ResultSet resultSet = null;
        openConnection();

        try {

            getAllStaff = conn.prepareStatement("SELECT * FROM staff");
            resultSet = getAllStaff.executeQuery();
            results = new ArrayList<>();

            while (resultSet.next()) {
                results.add(new Staff(
                        resultSet.getString("staff_id"),
                        resultSet.getString("last_name"),
                        resultSet.getString("first_name"),
                        resultSet.getString("position"),
                        resultSet.getString("access_level"),
                        resultSet.getString("username"),
                        resultSet.getString("password"),
                        resultSet.getString("speciality"),
                        resultSet.getString("prescriber_number")));
            }
        } catch (SQLException sqlException) {
        }
        closeConnection();
        return results;
    }
    
    /**
     * Get all doctors
     * @return ResultSet
     */
    public List<Staff> getDoctors() {
        List<Staff> results = null;
        ResultSet resultSet = null;
        openConnection();

        try {

            getAllDoctors = conn.prepareStatement(
                    "SELECT * FROM staff WHERE access_level= 1");
            resultSet = getAllDoctors.executeQuery();
            results = new ArrayList<Staff>();

            while (resultSet.next()) {
                results.add(new Staff(
                        resultSet.getString("staff_id"),
                        resultSet.getString("last_name"),
                        resultSet.getString("first_name"),
                        resultSet.getString("position"),
                        resultSet.getString("access_level"),
                        resultSet.getString("username"),
                        resultSet.getString("password"),
                        resultSet.getString("speciality"),
                        resultSet.getString("prescriber_number")));
            }
        } catch (SQLException sqlException) {
        }
        closeConnection();
        return results;
    }

    /**
     * Get all nurses
     * @return ResultSet
     */
    public List<Staff> getNurses() {
        List<Staff> results = null;
        ResultSet resultSet = null;
        openConnection();

        try {

            getAllNurses = conn.prepareStatement(
                    "SELECT * FROM staff WHERE access_level= 2");
            resultSet = getAllNurses.executeQuery();
            results = new ArrayList<Staff>();

            while (resultSet.next()) {
                results.add(new Staff(
                        resultSet.getString("staff_id"),
                        resultSet.getString("last_name"),
                        resultSet.getString("first_name"),
                        resultSet.getString("position"),
                        resultSet.getString("access_level"),
                        resultSet.getString("username"),
                        resultSet.getString("password"),
                        resultSet.getString("speciality"),
                        resultSet.getString("prescriber_number")));
            }
        } catch (SQLException sqlException) {
        }
        closeConnection();
        return results;
    }

    /**
     * Get all receptionist
     * @return ResultSet
     */
    public List<Staff> getReceptionist() {
        List<Staff> results = null;
        ResultSet resultSet = null;
        openConnection();

        try {

            getAllReceptionist = conn.prepareStatement(
                    "SELECT * FROM staff WHERE access_level= 3");
            resultSet = getAllReceptionist.executeQuery();
            results = new ArrayList<Staff>();

            while (resultSet.next()) {
                results.add(new Staff(
                        resultSet.getString("staff_id"),
                        resultSet.getString("last_name"),
                        resultSet.getString("first_name"),
                        resultSet.getString("position"),
                        resultSet.getString("access_level"),
                        resultSet.getString("username"),
                        resultSet.getString("password"),
                        resultSet.getString("speciality"),
                        resultSet.getString("prescriber_number")));
            }
        } catch (SQLException sqlException) {
        }
        closeConnection();
        return results;
    }

    /**
     * Get staff by ID
     * @param id Staff ID
     * @return Staff
     */
    public Staff getStaffByID(int id) {
        Staff s = null;
        ResultSet resultSet = null;
        openConnection();

        try {

            returnStaffByID = conn.prepareStatement(
                    "SELECT * FROM staff WHERE staff_id = ?");
            returnStaffByID.setInt(1, id);
            resultSet = returnStaffByID.executeQuery();

            if (resultSet.next()) {
                s = new Staff(
                        resultSet.getString("staff_id"),
                        resultSet.getString("last_name"),
                        resultSet.getString("first_name"),
                        resultSet.getString("position"),
                        resultSet.getString("access_level"),
                        resultSet.getString("username"),
                        resultSet.getString("password"),
                        resultSet.getString("speciality"),
                        resultSet.getString("prescriber_number"));
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        closeConnection();
        return s;
    }

    /**
     * Add a staff member
     * @param staff Staff member to add
     */
    public void addStaff(Staff staff) {
        openConnection();
        String insert =
                "INSERT INTO staff (last_name, first_name, position, access_level "
                + "username, password, specialty, prescriber number) "
                + "VALUES (?,?,?,?,?,?,?,?)";

        try {
            insertStaff = conn.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS);
            insertStaff.setString(1, staff.getLastName());
            insertStaff.setString(2, staff.getFirstName()); 
            insertStaff.setString(8, staff.getPosition());
            insertStaff.setString(8, staff.getAccessLevel()); 
            insertStaff.setString(8, staff.getUsername()); 
            insertStaff.setString(2, new String(staff.getPassword()));
            insertStaff.setString(6, staff.getSpecialty());
            insertStaff.setString(7, staff.getPrescriberNumber());
            insertStaff.executeUpdate();

            ResultSet rs = insertStaff.getGeneratedKeys();
            rs.next();
            currentID = rs.getInt(1);
        } catch (SQLException ex) {
            Logger.getLogger(StaffQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        closeConnection();
    }

    /**
     * Get staff ID
     * @return currentID
     */
    public int getID() {
        return currentID;
    }

    /**
     * Add a staff member
     */
    public void addStaff() {
        openConnection();

        try {
            insertStaff = conn.prepareStatement(
                    "INSERT INTO staff (staff_id) "
                    + "VALUES (?)");
            insertStaff.setInt(1, getID());
            insertStaff.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(StaffQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        closeConnection();
    }

    /**
     * Update staff details
     * @param staff Staff details
     */
    public void updateStaff(Staff staff) {
        openConnection();
        closeConnection();
    }
}