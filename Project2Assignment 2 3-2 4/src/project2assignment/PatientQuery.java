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
 * @author gregjacobson
 */
public class PatientQuery {
     
    private Connection conn = null;
    private PreparedStatement insertPatient = null;
    private ResultSet rs = null;
    private PreparedStatement createTable = null;
    private PreparedStatement getAllPatients = null;
    private PreparedStatement returnPatientByID = null;
    private PreparedStatement patientUpdate = null;
    private PreparedStatement deletePatientRecords = null;
    private PreparedStatement deletePatient = null;
    private static final String URL = "jdbc:oracle:thin:@//sage.business.unsw.edu.au:1521/orcl01.asbpldb001.ad.unsw.edu.au";
    private static final String USERNAME = "Z3373928";
    private static final String PASSWORD = "fra5reDr";
    
    public PatientQuery() {
        openConnection();
        System.out.println("connection gained");
        try {

            DatabaseMetaData dbmd = conn.getMetaData();
            
            rs = dbmd.getTables(null, "APP", "PATIENT", null);

            /*if (!rs.next()) {
                System.out.println("creating table");
                createTable = conn.prepareStatement(
                        "CREATE TABLE app.patients (" //27
                        + "\"PATIENT_ID\" INT not null primary key "
                        + "GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1), "
                        + "\"LAST_NAME\" VARCHAR(20), \"FIRST_NAME\" VARCHAR(20), "
                        + "DATE_OF_BIRTH DATE, "
                        + "\"STREET_ADDRESS\" VARCHAR(50), \"SUBURB\" VARCHAR(20), "
                        + "\"STATE\" VARCHAR(3), \"POSTCODE\" VARCHAR(4), "
                        + "\"HOME_PHONE\" VARCHAR(10), \"MOBILE_PHONE\" VARCHAR(10), "
                        + "\" EMAIL_ADDRESS\" VARCHAR(30), \"ALLERGIES\" VARCHAR(50), "
                        + "\"MEDICATIONS\" VARCHAR(100), \"EXISTING_CONDITIONS\" VARCHAR(50), "
                        + "\"MEDICARE_NUMBER\" VARCHAR(10), \"REFERRING_DOCTOR\" VARCHAR(30), "
                        + "\"GENDER\" VARCHAR(10), \"EMER_CONT_NAME\" VARCHAR(30), "        
                        + "\"EMER_CONT_RELATIONSHIP\" VARCHAR(10), \"EMER_CONT_PHONE\" VARCHAR(10), "
                        + "\"FUN_POINT\" VARCHAR(300));");
                createTable.execute();
            
            }*/

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
            if (createTable != null) {
                createTable.close();
            }
            if (insertPatient != null) {
                insertPatient.close();
            }
            if (getAllPatients != null) {
                getAllPatients.close();
            }
            if (patientUpdate != null) {
                patientUpdate.close();
            }
            if (returnPatientByID != null) {
                returnPatientByID.close();
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
     * Get all patients
     * @return ResultSet
     */
    public List<Patient> getPatients() {

        List<Patient> results = null;
        ResultSet resultSet = null;
        openConnection();

        try {
            
            getAllPatients = conn.prepareStatement("SELECT * FROM PATIENT");
            resultSet = getAllPatients.executeQuery();
            results = new ArrayList<Patient>();

            while (resultSet.next()) {
                results.add(new Patient(
                        resultSet.getInt("patient_id"),
                        resultSet.getString("patient_lastname"),
                        resultSet.getString("patient_firstname"),
                        resultSet.getDate("date_of_birth"),
                        resultSet.getString("gender"),
                        resultSet.getString("street_address"),
                        resultSet.getString("suburb"),
                        resultSet.getString("state"),
                        resultSet.getString("postcode"),
                        resultSet.getString("home_phone"),
                        resultSet.getString("mobile_phone"),
                        resultSet.getString("email_address"),
                        resultSet.getString("allergies"),
                        resultSet.getString("medications"),
                        resultSet.getString("existing_conditions"),
                        resultSet.getString("medicare_number"),
                        resultSet.getString("referring_doctor"),
                        resultSet.getString("emer_cont_name"),
                        resultSet.getString("emer_cont_relationship"),
                        resultSet.getString("emer_cont_phone"),
                        resultSet.getString("fun_point")));
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        closeConnection();
        return results;
    }
}
