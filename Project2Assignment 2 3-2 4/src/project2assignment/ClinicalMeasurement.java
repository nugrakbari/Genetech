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
public class ClinicalMeasurement {
    
    private float currentWeight;
    private String bloodPressure;
    private int heartRate;
    private int oxygenLevel;
    private String prescription;
    private int fev1;
    private int lungCapacity;
    private int tidalLungFlow;
    
    public ClinicalMeasurement(float weight, String blood, int heart, int oxy, String pres, int fev, int lung, int lungFlow) {
        setCurrentWeight(weight);
        setBloodPressure(blood);
        setHeartRate(heart);
        setOxygenLevel(oxy);
        setPrescription(pres);
        setFev1(fev);
        setLungCapacity(lung);
        setTidalLungFlow(lungFlow);
    }

    /**
     * @return the currentWeight
     */
    public float getCurrentWeight() {
        return currentWeight;
    }

    /**
     * @param currentWeight the currentWeight to set
     */
    public void setCurrentWeight(float currentWeight) {
        this.currentWeight = currentWeight;
    }

    /**
     * @return the bloodPressure
     */
    public String getBloodPressure() {
        return bloodPressure;
    }

    /**
     * @param bloodPressure the bloodPressure to set
     */
    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    /**
     * @return the heartRate
     */
    public int getHeartRate() {
        return heartRate;
    }

    /**
     * @param heartRate the heartRate to set
     */
    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    /**
     * @return the oxygenLevel
     */
    public int getOxygenLevel() {
        return oxygenLevel;
    }

    /**
     * @param oxygenLevel the oxygenLevel to set
     */
    public void setOxygenLevel(int oxygenLevel) {
        this.oxygenLevel = oxygenLevel;
    }

    /**
     * @return the prescription
     */
    public String getPrescription() {
        return prescription;
    }

    /**
     * @param prescription the prescription to set
     */
    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    /**
     * @return the fev1
     */
    public int getFev1() {
        return fev1;
    }

    /**
     * @param fev1 the fev1 to set
     */
    public void setFev1(int fev1) {
        this.fev1 = fev1;
    }

    /**
     * @return the lungCapacity
     */
    public int getLungCapacity() {
        return lungCapacity;
    }

    /**
     * @param lungCapacity the lungCapacity to set
     */
    public void setLungCapacity(int lungCapacity) {
        this.lungCapacity = lungCapacity;
    }

    /**
     * @return the tidalLungFlow
     */
    public int getTidalLungFlow() {
        return tidalLungFlow;
    }

    /**
     * @param tidalLungFlow the tidalLungFlow to set
     */
    public void setTidalLungFlow(int tidalLungFlow) {
        this.tidalLungFlow = tidalLungFlow;
    }
}
