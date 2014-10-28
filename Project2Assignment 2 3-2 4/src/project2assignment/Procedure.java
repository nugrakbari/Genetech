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
public class Procedure {
     
    private int procedureID;
    private String procedureName;
    private float procedurePrice;
    
    public Procedure(int id, String name, float price) {
        setProcedureID(id);
        setProcedureName(name);
        setProcedurePrice(price);
    }

    /**
     * @return the procedureID
     */
    public int getProcedureID() {
        return procedureID;
    }

    /**
     * @param procedureID the procedureID to set
     */
    public void setProcedureID(int procedureID) {
        this.procedureID = procedureID;
    }

    /**
     * @return the procedureName
     */
    public String getProcedureName() {
        return procedureName;
    }

    /**
     * @param procedureName the procedureName to set
     */
    public void setProcedureName(String procedureName) {
        this.procedureName = procedureName;
    }

    /**
     * @return the procedurePrice
     */
    public float getProcedurePrice() {
        return procedurePrice;
    }

    /**
     * @param procedurePrice the procedurePrice to set
     */
    public void setProcedurePrice(float procedurePrice) {
        this.procedurePrice = procedurePrice;
    }
    
}
