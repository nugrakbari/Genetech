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
public class ChatQuery {
    
    private Connection conn = null;
    private ResultSet rs = null;
    private PreparedStatement insertMessage = null;
    private PreparedStatement getAllMessages = null;
    private static final String URL = "jdbc:oracle:thin:@//sage.business.unsw.edu.au:1521/orcl01.asbpldb001.ad.unsw.edu.au";
    private static final String USERNAME = "Z3373928";
    private static final String PASSWORD = "fra5reDr";
    
    public ChatQuery() {
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
            if (getAllMessages != null) {
                getAllMessages.close();
            }
            if (insertMessage != null) {
                insertMessage.close();
            }
            if (conn != null) {
                conn.close();
            }
            System.out.println("connection terminated");
        } catch (SQLException ex) {
            Logger.getLogger(PatientQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void send(Chat chat) {
        openConnection();
        
        try {
            insertMessage = conn.prepareStatement("INSERT INTO CHAT (user_id, message, timestamp) VALUES "
                    + "(?,?,sysdate)");
            insertMessage.setInt(1, chat.getUserID());
            insertMessage.setString(2, chat.getMessage());
            insertMessage.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(PatientQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        closeConnection();
    }
    
    public List<Chat> retrieve() {

        List<Chat> results = null;
        ResultSet resultSet = null;
        openConnection();
        
        try {
            getAllMessages =  conn.prepareStatement("SELECT * FROM CHAT c INNER JOIN STAFF s "
                    + "ON c.user_id = s.staff_id  WHERE ROWNUM <= 20 ORDER BY timestamp DESC");
            resultSet = getAllMessages.executeQuery();
            results = new ArrayList<Chat>();
            
            while (resultSet.next()){
                results.add(new Chat(
                    resultSet.getInt("user_id"),
                    resultSet.getString("staff_firstname"),
                    resultSet.getString("message"),
                    resultSet.getDate("timestamp")));
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        closeConnection();
        return results;
    }
}
