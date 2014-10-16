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
 * @author nugrakbari <z3423268@zmail.unsw.edu.au>
 */
public class LoginCredentialsQuery {

    private Connection conn = null;
    private PreparedStatement selectUser = null;
    private String type;
    private ResultSet rs = null;
    private static final String URL = "jdbc:oracle:thin:@//sage.business.unsw.edu.au:1521/orcl01.asbpldb001.ad.unsw.edu.au";
    private static final String USERNAME = "Z3373928";
    private static final String PASSWORD = "fra5reDr";

    /**
     *
     */
    public LoginCredentialsQuery() {

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
            if (selectUser != null) {
                selectUser.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(StaffQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Get user type to determine access level
     * @param id Staff ID
     * @param pass Password
     * @return
     */
    public String getUserType(int id, String pass) {
        openConnection();

        try {
            selectUser = conn.prepareStatement(
                    "SELECT staff_type FROM app.staff WHERE staff_id = ? AND password = ?");
            selectUser.setInt(1, id);
            selectUser.setString(2, pass);
            rs = selectUser.executeQuery();

            while (rs.next()) {
                type = rs.getString(1);
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        closeConnection();
        return type;
    }
}   

