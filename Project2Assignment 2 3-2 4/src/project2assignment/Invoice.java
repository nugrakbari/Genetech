/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project2assignment;

/**
 *
 * @author nugrakbari
 */
public class Invoice {
    
    private int receiptNumber;
    private String patientName;    
    private String medicareNumber;
    private String streetAddress;
    private String suburb;
    private String postcode;
    private String state;
    
    public Invoice (String name, int receipt, String medicare, String st, String sub, String post, String ste) {
        setPatientName(name);
        setReceiptNumber(receipt);
        setMedicareNumber(medicare);
        setStreetAddress(st);
        setSuburb(sub);
        setPostcode(post);
        setState(ste);
    }

    /**
     * @return the patientName
     */
    public String getPatientName() {
        return patientName;
    }

    /**
     * @param patientName the patientName to set
     */
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    /**
     * @return the receiptNumber
     */
    public int getReceiptNumber() {
        return receiptNumber;
    }

    /**
     * @param receiptNumber the receiptNumber to set
     */
    public void setReceiptNumber(int receiptNumber) {
        this.receiptNumber = receiptNumber;
    }

    /**
     * @return the medicareNumber
     */
    public String getMedicareNumber() {
        return medicareNumber;
    }

    /**
     * @param medicareNumber the medicareNumber to set
     */
    public void setMedicareNumber(String medicareNumber) {
        this.medicareNumber = medicareNumber;
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
}
