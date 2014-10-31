/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project2assignment;

import java.sql.Date;

/**
 *
 * @author nugrakbari
 */
public class VisitHistory {
    
    private Date visitDate;
    private String doctorsName;
    private String procedure;
    private int visitID;
    
    public VisitHistory(Date d, String name, String proc, int id) {
        setVisitDate(d);
        setDoctorsName(name);
        setProcedure(proc);
        setVisitID(id);
    }

    /**
     * @return the visitDate
     */
    public Date getVisitDate() {
        return visitDate;
    }

    /**
     * @param visitDate the visitDate to set
     */
    public void setVisitDate(Date visitDate) {
        this.visitDate = visitDate;
    }

    /**
     * @return the doctorsName
     */
    public String getDoctorsName() {
        return doctorsName;
    }

    /**
     * @param doctorsName the doctorsName to set
     */
    public void setDoctorsName(String doctorsName) {
        this.doctorsName = doctorsName;
    }

    /**
     * @return the procedure
     */
    public String getProcedure() {
        return procedure;
    }

    /**
     * @param procedure the procedure to set
     */
    public void setProcedure(String procedure) {
        this.procedure = procedure;
    }

    /**
     * @return the visitID
     */
    public int getVisitID() {
        return visitID;
    }

    /**
     * @param visitID the visitID to set
     */
    public void setVisitID(int visitID) {
        this.visitID = visitID;
    }
}
