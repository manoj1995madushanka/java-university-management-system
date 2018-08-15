
package Computing.Students;

import base.student;


public class CStudent extends student{
    private String mathematics;
    private String physics;
    private String chemistry;

    /**
     * @return the mathematics
     */
    public String getMathematics() {
        return mathematics;
    }

    /**
     * @param mathematics the mathematics to set
     */
    public void setMathematics(String mathematics) {
        this.mathematics = mathematics;
    }

    /**
     * @return the physics
     */
    public String getPhysics() {
        return physics;
    }

    /**
     * @param physics the physics to set
     */
    public void setPhysics(String physics) {
        this.physics = physics;
    }

    /**
     * @return the chemistry
     */
    public String getChemistry() {
        return chemistry;
    }

    /**
     * @param chemistry the chemistry to set
     */
    public void setChemistry(String chemistry) {
        this.chemistry = chemistry;
    }
    
}
