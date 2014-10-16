/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project2assignment;

/**
 *
 * @author erinaung
 */
public class LoginCredentials {
    private int id;
    private String password;
    
    /**
     * Set login credentials
     * @param id Staff ID
     * @param password Password
     */
    public LoginCredentials(int id, String password) {
        setId(id);
        setPassword(password);
    }

    /**
     * 
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
