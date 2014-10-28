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
public class Bill {
    
    private float procedureCost;
    private float discountRate;
    private float amountDue;
    private float amountPaid;
    private String paymentMethod;
    private String discountReason;
    
    public Bill(float procedure, float discRate, float due, float paid, String payMethod, String reason) {
        setProcedureCost(procedure);
        setDiscountRate(discRate);
        setAmountDue(due);
        setAmountPaid(paid);
        setPaymentMethod(payMethod);
        setDiscountReason(reason);
    }

    /**
     * @return the procedureCost
     */
    public float getProcedureCost() {
        return procedureCost;
    }

    /**
     * @param procedureCost the procedureCost to set
     */
    public void setProcedureCost(float procedureCost) {
        this.procedureCost = procedureCost;
    }

    /**
     * @return the discountRate
     */
    public float getDiscountRate() {
        return discountRate;
    }

    /**
     * @param discountRate the discountRate to set
     */
    public void setDiscountRate(float discountRate) {
        this.discountRate = discountRate;
    }

    /**
     * @return the amountDue
     */
    public float getAmountDue() {
        return amountDue;
    }

    /**
     * @param amountDue the amountDue to set
     */
    public void setAmountDue(float amountDue) {
        this.amountDue = amountDue;
    }

    /**
     * @return the amountPaid
     */
    public float getAmountPaid() {
        return amountPaid;
    }

    /**
     * @param amountPaid the amountPaid to set
     */
    public void setAmountPaid(float amountPaid) {
        this.amountPaid = amountPaid;
    }

    /**
     * @return the paymentMethod
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * @param paymentMethod the paymentMethod to set
     */
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * @return the discountReason
     */
    public String getDiscountReason() {
        return discountReason;
    }

    /**
     * @param discountReason the discountReason to set
     */
    public void setDiscountReason(String discountReason) {
        this.discountReason = discountReason;
    }
}
