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
import java.sql.Date;

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
    private PreparedStatement getPatientsByWard = null;
    private PreparedStatement returnPatientByID = null;
    private PreparedStatement patientUpdate = null;
    private PreparedStatement deletePatientRecords = null;
    private PreparedStatement deletePatient = null;
    
    public PatientQuery() {
        openConnection();
        System.out.println("connection gained");
        try {

            DatabaseMetaData dbmd = conn.getMetaData();
            rs = dbmd.getTables(null, "APP", "PATIENTS", null);

            if (!rs.next()) {
                System.out.println("creating table");
                createTable = conn.prepareStatement(
                        "CREATE TABLE app.patients (" //27
                        + "\"PATIENT_ID\" INT not null primary key "
                        + "GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1), "
                        + "\"FIRST_NAME\" VARCHAR(30), \"LAST_NAME\" VARCHAR(30), "
                        + "\"GENDER\" VARCHAR(6), DATE_OF_BIRTH DATE, "
                        + "\"ADDRESS\" VARCHAR(100), \"PHONE\" VARCHAR(10), "
                        + "\"EMERGENCY_PHONE\" VARCHAR(10), "
                        + "\"DOCTOR_STAFF_ID\" INT REFERENCES app.doctor (staff_id), "
                        + "\"WARD_ID\" INT REFERENCES app.ward (ward_id), "
                        + "\"DATE_ADMITTED\" DATE)");
                createTable.execute();
            }

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
            System.exit(1);
        }
        closeConnection();
    }

    private void openConnection() {
        try {
            conn = DriverManager.getConnection("jdbc:derby:./hospital;create=true");
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
            if (getPatientsByWard != null) {
                getPatientsByWard.close();
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

            getAllPatients = conn.prepareStatement("SELECT * FROM app.patients");
            resultSet = getAllPatients.executeQuery();
            results = new ArrayList<Patient>();

            while (resultSet.next()) {
                results.add(new Patient(
                        resultSet.getInt("patient_id"),
                        resultSet.getString("first_name"),
                        resultSet.getString("last_name"),
                        resultSet.getString("gender"),
                        resultSet.getDate("date_of_birth"),
                        resultSet.getString("address"),
                        resultSet.getString("phone"),
                        resultSet.getString("emergency_phone"),
                        resultSet.getInt("doctor_staff_id"),
                        resultSet.getInt("ward_id"),
                        resultSet.getDate("date_admitted")));
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        closeConnection();
        return results;
    }
    }
}
