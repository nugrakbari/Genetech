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
public class Admin {
    
    private String staffID;
    private String firstName ;
    private String lastName;
    private String Position;
    private String accessLevel;
    
    public Admin(String staff, String fname, String lname, String pos, String access) {

        setStaffID(staff);
        setFirstName(fname);
        setLastName(lname);
        setPosition(pos);
        setAccessLevel(access); 
                
}

    /**
     * @return the staffID
     */
    public String getStaffID() {
        return staffID;
    }

    /**
     * @param staffID the staffID to set
     */
    public void setStaffID(String staffID) {
        this.staffID = staffID;
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
     * @return the Position
     */
    public String getPosition() {
        return Position;
    }

    /**
     * @param Position the Position to set
     */
    public void setPosition(String Position) {
        this.Position = Position;
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
    
}
    

    
    
    
