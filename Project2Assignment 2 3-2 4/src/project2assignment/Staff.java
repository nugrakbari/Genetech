/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project2assignment;


/**
 *
 * @author erina ung
 */
public class Staff {
    
    private String patientId;
    private String lastName;
    private String firstName;
    private String position;
    private String accessLevel; 
    private String username;
    private String password;
    private String specialty;
    private String prescriberNumber; 
    
    
    public Staff(String id, String lname, String fname, String role, String access,
            String user, String pass, String special, String prescriber) {
        setPatientId(id);
        setLastName(lname);
        setFirstName(fname);
        setPosition(role);
        setAccessLevel(user);
        setUsername(user);
        setPassword(pass);
        setSpecialty(special);
        setPrescriberNumber(prescriber); 
        
        
    }

    /**
     * @return the patientId
     */
    public String getPatientId() {
        return patientId;
    }

    /**
     * @param patientId the patientId to set
     */
    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the position
     */
    public String getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * @return the accessLevel
     */
    public String getAccessLevel() {
        return accessLevel;
    }

    /**
     * @param accessLevel the accessLevel to set
     */
    public void setAccessLevel(String accessLevel) {
        this.accessLevel = accessLevel;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
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

    /**
     * @return the specialty
     */
    public String getSpecialty() {
        return specialty;
    }

    /**
     * @param specialty the specialty to set
     */
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    /**
     * @return the prescriberNumber
     */
    public String getPrescriberNumber() {
        return prescriberNumber;
    }

    /**
     * @param prescriberNumber the prescriberNumber to set
     */
    public void setPrescriberNumber(String prescriberNumber) {
        this.prescriberNumber = prescriberNumber;
    }

    
    
}
