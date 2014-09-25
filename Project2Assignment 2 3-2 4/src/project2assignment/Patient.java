/*
* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project2assignment;

import java.sql.Date;

/**
 *
 * @author gregjacobson
 */
public class Patient {
    
    private String patientID;
    private String lastName;
    private String firstName;
    private Date dateOfBirth;
    private String gender;
    
    private String streetAddress;
    private String suburb;
    private String state;
    private String postcode; 
    private String homePhone;
    private String mobilePhone;
    private String emailAddress;
    
    private String allergies;
    private String medications;
    private String existingConditions;
    private String medicareNo;
    private String referringDoctor;
    
    private String emContactName;
    private String emContactRelation;
    private String emContactNo;
    private String funPoint;
    
    public Patient(String id, String lname, String fname, Date dob, String sex,
            String street, String sub, String state, String postcode, String home,
            String mobile, String email, String allergy, String medication, String
                    condition, String medicare, String refDoctor, String emContName,
                    String emContRelation, String emContNo, String fun) {
        setPatientID(id);
        setLastName(lname);
        setFirstName(fname);
        setDateOfBirth(dob);
        setGender(sex);
        setStreetAddress(street);
        setSuburb(sub);
        setState(state);
        setPostcode(postcode);
        setHomePhone(home);
        setMobilePhone(mobile);
        setEmailAddress(email);
        setAllergies(allergy);
        setMedications(medication);
        setExistingConditions(condition);
        setMedicareNo(medicare);
        setReferringDoctor(refDoctor);
        setEmContactName(emContName);
        setEmContactRelation(emContRelation);
        setEmContactNo(emContNo);
        setFunPoint(fun);
    }

    /**
     * @return the patientID
     */
    public String getPatientID() {
        return patientID;
    }

    /**
     * @param patientID the patientID to set
     */
    public void setPatientID(String patientID) {
        this.patientID = patientID;
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
     * @return the dateOfBirth
     */
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * @param dateOfBirth the dateOfBirth to set
     */
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the streetAddress
     */
    public String getStreetAddress() {
        return streetAddress;
    }

    /**
     * @param streetAddress the streetAddress to set
     */
    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    /**
     * @return the suburb
     */
    public String getSuburb() {
        return suburb;
    }

    /**
     * @param suburb the suburb to set
     */
    public void setSuburb(String suburb) {
        this.suburb = suburb;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the postcode
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * @param postcode the postcode to set
     */
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    /**
     * @return the homePhone
     */
    public String getHomePhone() {
        return homePhone;
    }

    /**
     * @param homePhone the homePhone to set
     */
    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    /**
     * @return the mobilePhone
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    /**
     * @param mobilePhone the mobilePhone to set
     */
    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    /**
     * @return the emailAddress
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * @param emailAddress the emailAddress to set
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * @return the allergies
     */
    public String getAllergies() {
        return allergies;
    }

    /**
     * @param allergies the allergies to set
     */
    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    /**
     * @return the medications
     */
    public String getMedications() {
        return medications;
    }

    /**
     * @param medications the medications to set
     */
    public void setMedications(String medications) {
        this.medications = medications;
    }

    /**
     * @return the existingConditions
     */
    public String getExistingConditions() {
        return existingConditions;
    }

    /**
     * @param existingConditions the existingConditions to set
     */
    public void setExistingConditions(String existingConditions) {
        this.existingConditions = existingConditions;
    }

    /**
     * @return the medicareNo
     */
    public String getMedicareNo() {
        return medicareNo;
    }

    /**
     * @param medicareNo the medicareNo to set
     */
    public void setMedicareNo(String medicareNo) {
        this.medicareNo = medicareNo;
    }

    /**
     * @return the referringDoctor
     */
    public String getReferringDoctor() {
        return referringDoctor;
    }

    /**
     * @param referringDoctor the referringDoctor to set
     */
    public void setReferringDoctor(String referringDoctor) {
        this.referringDoctor = referringDoctor;
    }

    /**
     * @return the emContactName
     */
    public String getEmContactName() {
        return emContactName;
    }

    /**
     * @param emContactName the emContactName to set
     */
    public void setEmContactName(String emContactName) {
        this.emContactName = emContactName;
    }

    /**
     * @return the emContactRelation
     */
    public String getEmContactRelation() {
        return emContactRelation;
    }

    /**
     * @param emContactRelation the emContactRelation to set
     */
    public void setEmContactRelation(String emContactRelation) {
        this.emContactRelation = emContactRelation;
    }

    /**
     * @return the emContactNo
     */
    public String getEmContactNo() {
        return emContactNo;
    }

    /**
     * @param emContactNo the emContactNo to set
     */
    public void setEmContactNo(String emContactNo) {
        this.emContactNo = emContactNo;
    }

    /**
     * @return the funPoint
     */
    public String getFunPoint() {
        return funPoint;
    }

    /**
     * @param funPoint the funPoint to set
     */
    public void setFunPoint(String funPoint) {
        this.funPoint = funPoint;
    }
    
    
}
