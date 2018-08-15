/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

/**
 *
 * @author USER
 */
public class Timetable {
    private int subid;
    private String subname;
    private String location;
    private String time;
    private int year;
    private int sem;
    private String day;

    /**
     * @return the subid
     */
    public int getSubid() {
        return subid;
    }

    /**
     * @param subid the subid to set
     */
    public void setSubid(int subid) {
        this.subid = subid;
    }

    /**
     * @return the subname
     */
    public String getSubname() {
        return subname;
    }

    /**
     * @param subname the subname to set
     */
    public void setSubname(String subname) {
        this.subname = subname;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return the time
     */
    public String getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return the sem
     */
    public int getSem() {
        return sem;
    }

    /**
     * @param sem the sem to set
     */
    public void setSem(int sem) {
        this.sem = sem;
    }

    /**
     * @return the day
     */
    public String getDay() {
        return day;
    }

    
    public void setDay(String day) {
        this.day = day;
    }
}
