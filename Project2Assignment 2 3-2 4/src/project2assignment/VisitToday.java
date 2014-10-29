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
public class VisitToday {
    
    private Date visitTime;
    private String patientName;
    private String doctorName;
    private int visitID;
    
    public VisitToday(Date time, String patient, String doctor, int id) {
        setVisitTime(time);
        setPatientName(patient);
        setDoctorName(doctor);
        setVisitID(id);
    }

    /**
     * @return the visitTime
     */
    public Date getVisitTime() {
        return visitTime;
    }

    /**
     * @param visitTime the visitTime to set
     */
    public void setVisitTime(Date visitTime) {
        this.visitTime = visitTime;
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
     * @return the doctorName
     */
    public String getDoctorName() {
        return doctorName;
    }

    /**
     * @param doctorName the doctorName to set
     */
    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
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
