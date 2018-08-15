
package Business.Students;

import base.student;


public class BStudent extends student {
    private String accounting;
    private String econ;
    private String businessstudies;

    /**
     * @return the accounting
     */
    public String getAccounting() {
        return accounting;
    }

    /**
     * @param accounting the accounting to set
     */
    public void setAccounting(String accounting) {
        this.accounting = accounting;
    }

    /**
     * @return the econ
     */
    public String getEcon() {
        return econ;
    }

    /**
     * @param econ the econ to set
     */
    public void setEcon(String econ) {
        this.econ = econ;
    }

    /**
     * @return the businessstudies
     */
    public String getBusinessstudies() {
        return businessstudies;
    }

    /**
     * @param businessstudies the businessstudies to set
     */
    public void setBusinessstudies(String businessstudies) {
        this.businessstudies = businessstudies;
    }
    
}