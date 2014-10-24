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
public class Appointment {
    
    private int visit;
    private int patient;
    private int staff;
    private Date appointmentTime;
    private String note;
    
    public Appointment (int visitID, int patientID, int staffID, Date time, String notes) {
        setVisit(visitID);
        setPatient(patientID);
        setStaff(staffID);
        setAppointmentTime(time);
        setNote(notes);
    }

    /**
     * @return the visit
     */
    public int getVisit() {
        return visit;
    }

    /**
     * @param visit the visit to set
     */
    public void setVisit(int visit) {
        this.visit = visit;
    }

    /**
     * @return the patient
     */
    public int getPatient() {
        return patient;
    }

    /**
     * @param patient the patient to set
     */
    public void setPatient(int patient) {
        this.patient = patient;
    }

    /**
     * @return the staff
     */
    public int getStaff() {
        return staff;
    }

    /**
     * @param staff the staff to set
     */
    public void setStaff(int staff) {
        this.staff = staff;
    }

    /**
     * @return the appointmentTime
     */
    public Date getAppointmentTime() {
        return appointmentTime;
    }

    /**
     * @param appointmentTime the appointmentTime to set
     */
    public void setAppointmentTime(Date appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    /**
     * @return the note
     */
    public String getNote() {
        return note;
    }

    /**
     * @param note the note to set
     */
    public void setNote(String note) {
        this.note = note;
    }
}
