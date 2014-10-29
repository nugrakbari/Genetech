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
 * @author nugrakbari
 */
public class ProcedureQuery {
    
    private Connection conn = null;
    private ResultSet rs = null;
    private PreparedStatement getAllProcedures = null;
    private PreparedStatement getBillableItems = null;
    private float sum;
    private static final String URL = "jdbc:oracle:thin:@//sage.business.unsw.edu.au:1521/orcl01.asbpldb001.ad.unsw.edu.au";
    private static final String USERNAME = "Z3373928";
    private static final String PASSWORD = "fra5reDr";
    
    public ProcedureQuery() {
        openConnection();
        System.out.println("connection gained");
        try {

            DatabaseMetaData dbmd = conn.getMetaData();
            
            rs = dbmd.getTables(null, "APP", "PROCEDURE", null);

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
            if (getAllProcedures != null) {
                getAllProcedures.close();
            }
            if (getBillableItems != null) {
                getBillableItems.close();
            }
            if (conn != null) {
                conn.close();
            }
            System.out.println("connection terminated");
        } catch (SQLException ex) {
            Logger.getLogger(PatientQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Procedure> getProcedures() {

        List<Procedure> results = null;
        ResultSet resultSet = null;
        openConnection();

        try {
            
            getAllProcedures = conn.prepareStatement("SELECT * FROM PROCEDURES");
            resultSet = getAllProcedures.executeQuery();
            results = new ArrayList<Procedure>();

            while (resultSet.next()) {
                results.add(new Procedure(
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
    
    public List<Procedure> getBilledItems(int id) {

        List<Procedure> results = null;
        ResultSet resultSet = null;
        openConnection();

        try {
            
            getAllProcedures = conn.prepareStatement("SELECT * FROM VISITS NATURAL JOIN BILLS NATURAL JOIN PROCEDURES WHERE "
                    + "visit_id = ?");
            getAllProcedures.setInt(1, id);
            resultSet = getAllProcedures.executeQuery();
            results = new ArrayList<Procedure>();

            while (resultSet.next()) {
                results.add(new Procedure(
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
    
    public float calculateBilledItems(int id) {
        openConnection();

        try {
            PreparedStatement getWard = conn.prepareStatement(
                    "SELECT SUM(procedure_price) FROM VISITS NATURAL JOIN BILLS NATURAL JOIN PROCEDURES WHERE "
                    + "visit_id = ?");
            getWard.setInt(1, id);
            ResultSet rs = getWard.executeQuery();
            while (rs.next()) {
                sum = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StaffQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        closeConnection();
        return sum;
    }
}
