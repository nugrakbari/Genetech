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
    private PreparedStatement updateStaff = null;
    private PreparedStatement returnStaffByID = null;

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
            if (updateStaff != null) {
                updateStaff.close();
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

            getAllStaff = conn.prepareStatement("SELECT * FROM app.staff");
            resultSet = getAllStaff.executeQuery();
            results = new ArrayList<Staff>();

            while (resultSet.next()) {
                results.add(new Staff(
                        resultSet.getInt("staff_id"),
                        resultSet.getString("staff_type"),
                        resultSet.getString("password"),
                        resultSet.getString("first_name"),
                        resultSet.getString("last_name"),
                        resultSet.getString("gender"),
                        resultSet.getString("medical_specialty"),
                        resultSet.getString("phone")));
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
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
                    "SELECT * FROM app.staff NATURAL JOIN app.doctor");
            resultSet = getAllDoctors.executeQuery();
            results = new ArrayList<Staff>();

            while (resultSet.next()) {
                results.add(new Staff(
                        resultSet.getInt("staff_id"),
                        resultSet.getString("staff_type"),
                        resultSet.getString("password"),
                        resultSet.getString("first_name"),
                        resultSet.getString("last_name"),
                        resultSet.getString("gender"),
                        resultSet.getString("medical_specialty"),
                        resultSet.getString("phone")));
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
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
                    "SELECT * FROM app.staff NATURAL JOIN app.nurse");
            resultSet = getAllNurses.executeQuery();
            results = new ArrayList<Staff>();

            while (resultSet.next()) {
                results.add(new Staff(
                        resultSet.getInt("staff_id"),
                        resultSet.getString("staff_type"),
                        resultSet.getString("password"),
                        resultSet.getString("first_name"),
                        resultSet.getString("last_name"),
                        resultSet.getString("gender"),
                        resultSet.getString("medical_specialty"),
                        resultSet.getString("phone")));
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        closeConnection();
        return results;
    }

    /**
     * Get all administrators
     * @return ResultSet
     */
    public List<Staff> getAdmins() {
        List<Staff> results = null;
        ResultSet resultSet = null;
        openConnection();

        try {

            getAllAdmins = conn.prepareStatement(
                    "SELECT * FROM app.staff NATURAL JOIN app.admin");
            resultSet = getAllAdmins.executeQuery();
            results = new ArrayList<Staff>();

            while (resultSet.next()) {
                results.add(new Staff(
                        resultSet.getInt("staff_id"),
                        resultSet.getString("staff_type"),
                        resultSet.getString("password"),
                        resultSet.getString("first_name"),
                        resultSet.getString("last_name"),
                        resultSet.getString("gender"),
                        resultSet.getString("medical_specialty"),
                        resultSet.getString("phone")));
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
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
                    "SELECT * FROM app.staff WHERE staff_id = ?");
            returnStaffByID.setInt(1, id);
            resultSet = returnStaffByID.executeQuery();

            if (resultSet.next()) {
                s = new Staff(
                        resultSet.getInt("staff_id"),
                        resultSet.getString("staff_type"),
                        resultSet.getString("password"),
                        resultSet.getString("first_name"),
                        resultSet.getString("last_name"),
                        resultSet.getString("gender"),
                        resultSet.getString("medical_specialty"),
                        resultSet.getString("phone"));
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        closeConnection();
        return s;
    }
    
    /**
     * Get all wards
     * @return ResultSet
     */
    public List<Ward> getWards() {
        List<Ward> results = null;
        ResultSet resultSet = null;
        openConnection();
        
        try {
            getWard = conn.prepareStatement(
                    "SELECT * FROM app.ward");
            resultSet = getWard.executeQuery();
            results = new ArrayList<Ward>();
            
            while (resultSet.next()) {
                results.add(new Ward(
                        resultSet.getInt("ward_id"),
                        resultSet.getInt("staff_id")));
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        closeConnection();
        return results;
        
    }

    /**
     * Add a staff member
     * @param staff Staff member to add
     */
    public void addStaff(Staff staff) {
        openConnection();
        String insert =
                "INSERT INTO app.staff (staff_type, password, first_name, last_name, gender, "
                + "medical_specialty, phone) "
                + "VALUES (?,?,?,?,?,?,?)";

        try {
            insertStaff = conn.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS);
            insertStaff.setString(1, staff.getStaffType());
            insertStaff.setString(2, new String(staff.getPassword()));
            insertStaff.setString(3, staff.getFirstName());
            insertStaff.setString(4, staff.getLastName());
            insertStaff.setString(5, staff.getGender());
            insertStaff.setString(6, staff.getMedicalSpecialty());
            insertStaff.setString(7, staff.getPhone());
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
     * Add a doctor
     */
    public void addDoctor() {
        openConnection();

        try {
            insertDoctor = conn.prepareStatement(
                    "INSERT INTO app.doctor (staff_id) "
                    + "VALUES (?)");
            insertDoctor.setInt(1, getID());
            insertDoctor.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(StaffQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        closeConnection();
    }

    /**
     * Add a nurse
     * @param ward
     */
    public void addNurse(int ward) {
        openConnection();

        try {
            insertNurse = conn.prepareStatement(
                    "INSERT INTO app.nurse (staff_id, ward_id) "
                    + "VALUES (?,?)");
            insertNurse.setInt(1, getID());
            insertNurse.setInt(2, ward);
            insertNurse.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(StaffQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        closeConnection();
    }

    /**
     * Get the ward a nurse is assigned to
     * @param id Nurse's ID
     * @return Ward number in which the nurse is assigned to
     */
    public int getNurseWard(int id) {
        openConnection();

        try {
            PreparedStatement getWard = conn.prepareStatement(
                    "SELECT ward_id FROM app.nurse "
                    + "WHERE staff_id = ?");
            getWard.setInt(1, id);
            ResultSet rs = getWard.executeQuery();
            while (rs.next()) {
                nurseWard = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StaffQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        closeConnection();
        return nurseWard;
    }

    /**
     * Add an administrator
     */
    public void addAdmin() {
        ResultSet resultSet;
        openConnection();

        try {
            insertAdmin = conn.prepareStatement(
                    "INSERT INTO app.admin (staff_id) "
                    + "VALUES (?)");
            insertAdmin.setInt(1, getID());
            insertAdmin.executeUpdate();
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
        try {
            /*updateStaff = conn.prepareStatement(
             "UPDATE app.staff "
             + "SET staff_type = ?, "
             + "password = ?, "
             + "first_name = ?, "
             + "last_name = ?, "
             + "gender = ?, "
             + "medical_specialty = ?, "
             + "phone = ? "
             + "WHERE staff_id = ?");
             updateStaff.setString(1, staff.getStaffType());
             updateStaff.setString(2, staff.getPassword());
             updateStaff.setString(3, staff.getFirstName());
             updateStaff.setString(4, staff.getLastName());
             updateStaff.setString(5, staff.getGender());
             updateStaff.setString(6, staff.getMedicalSpecialty());
             updateStaff.setString(7, staff.getPhone());
             updateStaff.setInt(8, staff.getStaffID());
             updateStaff.executeUpdate();*/
            String sql = "update app.staff set staff_type = '" + staff.getStaffType()
                    + "', password = '" + staff.getPassword() + "', first_name = '"
                    + staff.getFirstName() + "', last_name = '" + staff.getLastName()
                    + "', gender = '" + staff.getGender() + "', medical_specialty = '"
                    + staff.getMedicalSpecialty() + "', phone = '" + staff.getPhone() 
                    + "' WHERE staff_id = " + staff.getStaffID();
                    
            System.out.println("sql = "+sql);
            Statement s = conn.createStatement();
            s.executeUpdate(sql);
                    
                       
        } catch (SQLException ex) {
            Logger.getLogger(StaffQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        closeConnection();
    }
    
    /**
     * Assign a new ward to the nurse
     * @param id The nurse's ID
     * @param ward The new ward number
     */
    public void updateNurseWard(int id, int ward) {
        openConnection();
        try {
            updateNurseWard = conn.prepareStatement(
                    "UPDATE app.nurse "
                    + "SET ward_id = ? "
                    + "WHERE staff_id = ?");
            updateNurseWard.setInt(1, ward);
            updateNurseWard.setInt(2, id);
            updateNurseWard.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(StaffQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        closeConnection();
    }
    
    /**
     * Assign a head nurse
     * @param ward Ward number
     * @param id Nurse ID to be assigned
     */
    public void assignHeadNurse(int ward, int id) {
        openConnection();
        try {
            updateWard = conn.prepareStatement(
                    "UPDATE app.ward "
                    + "SET staff_id = ? "
                    + "WHERE ward_id = ?");
            updateWard.setInt(1, id);
            updateWard.setInt(2, ward);
            updateWard.executeUpdate();
            System.out.println("Updating ward");
        } catch (SQLException ex) {
            Logger.getLogger(StaffQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        closeConnection();
    }
   
    /**
     * Insert null value to the nurse's old ward
     * @param ward The old ward number
     */
    public void nullifyHeadNurse(int ward) {
        openConnection();
        try {
            nullifyHeadNurse = conn.prepareStatement(
                    "UPDATE app.ward "
                    + "SET staff_id = null "
                    + "WHERE ward_id = ?");
            nullifyHeadNurse.setInt(1, ward);
            nullifyHeadNurse.executeUpdate();
            System.out.println("Updating ward");
        } catch (SQLException ex) {
            Logger.getLogger(StaffQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        closeConnection();
    }
}