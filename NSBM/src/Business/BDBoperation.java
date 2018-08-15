package Business;

import Business.Students.BStudent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;


public class BDBoperation {

    String url = "jdbc:mysql://localhost:3306/nsbm";
    String username = "root";
    String password = "";
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    Connection con1 = null;
    PreparedStatement pst1 = null;
    ResultSet rs1 = null;
    
    

    public boolean intakeStudent(BStudent bst) {
        try {

            System.out.println("Add student 1");
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "INSERT INTO schoolofbusiness VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("add student 2");
            pst.setInt(1, bst.getRegID());//address,gender,faculty,depar,year
            pst.setString(2, bst.getFirstName());
            pst.setString(3, bst.getLastName());
            pst.setInt(4, bst.getAge());
            pst.setString(5, bst.getNic());
            pst.setString(6, bst.getAddress());
            pst.setString(7, bst.getEmail());
            pst.setInt(8, bst.getTel());
            pst.setString(9, bst.getGender());
            pst.setInt(10, bst.getIntakeyear());
            pst.setString(11, bst.getIntakemonth());
            pst.setInt(12, bst.getALindex());
            pst.setDouble(13, bst.getZscore());
            pst.setString(14, bst.getAccounting());
            pst.setString(15, bst.getEcon());
            pst.setString(16, bst.getBusinessstudies());
            pst.setString(17, bst.getEnglish());
            pst.setString(18, bst.getQualificationlevel());
            pst.setString(19, bst.getQualificationtype());
            pst.setString(20, bst.getInstitute());
            pst.setInt(21, bst.getYearofcomplete());
            
            pst.executeUpdate();
            
            return true;
            
        } catch (Exception e) {
            System.out.println("exeption >>> " + e);
            return false;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.print(e);
            }

        }
    }
    
    
    public ArrayList<BStudent> getStudent1() {
        try {

            ArrayList<BStudent> list1 = new ArrayList<BStudent>();

            System.out.println("Get student 1");
            con = (Connection) DriverManager.getConnection(url, username, password);
            
            int curyear = Calendar.getInstance().get(Calendar.YEAR);
            String query = "SELECT * FROM schoolofbusiness WHERE intakeyear="+curyear;//schoolofbusiness
            
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("Get student 2");

            rs = pst.executeQuery();

            while (rs.next()) {
                BStudent s = new BStudent();
                s.setRegID(rs.getInt(1));
                s.setFirstName(rs.getString(2));
                s.setLastName(rs.getString(3));
                s.setAge(rs.getInt(4));
                s.setNic(rs.getString(5));
//address,email,tel,gender,intakeyear,intakemonth,alindex,zscore,accounting,econ.businessstudies,english,qualificationlevel,
//qualificationtype,institute,yearofcomplete
                s.setAddress(rs.getString(6));
                s.setEmail(rs.getString(7));
                s.setTel(rs.getInt(8));
                s.setGender(rs.getString(9));
                s.setIntakeyear(rs.getInt(10));
                s.setIntakemonth(rs.getString(11));
                s.setALindex(rs.getInt(12));
                s.setZscore(rs.getDouble(13));
                s.setAccounting(rs.getString(14));
                s.setEcon(rs.getString(15));
                s.setBusinessstudies(rs.getString(16));
                s.setEnglish(rs.getString(17));
                s.setQualificationlevel(rs.getString(18));
                s.setQualificationtype(rs.getString(19));
                s.setInstitute(rs.getString(20));
                s.setYearofcomplete(rs.getInt(21));
                
                list1.add(s);
            }
            return list1;

        } catch (Exception e) {
            System.out.println("exeption >>> " + e);
            //return false;
            return null;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.print(e);
            }

        }
    }
    
    public ArrayList<BStudent> getStudent2() {
        try {

            ArrayList<BStudent> list1 = new ArrayList<BStudent>();

            System.out.println("Get student 1");
            con1 = (Connection) DriverManager.getConnection(url, username, password);
            
            int curyear = (Calendar.getInstance().get(Calendar.YEAR))-1;
            String query = "SELECT * FROM schoolofbusiness WHERE intakeyear="+curyear;//schoolofbusiness
            
            pst1 = (com.mysql.jdbc.PreparedStatement) con1.prepareStatement(query);
            System.out.println("Get student 2");

            rs1 = pst1.executeQuery();

            while (rs1.next()) {
                BStudent s1 = new BStudent();
                s1.setRegID(rs1.getInt(1));
                s1.setFirstName(rs1.getString(2));
                s1.setLastName(rs1.getString(3));
                s1.setAge(rs1.getInt(4));
                s1.setNic(rs1.getString(5));
//address,email,tel,gender,intakeyear,intakemonth,alindex,zscore,accounting,econ.businessstudies,english,qualificationlevel,
//qualificationtype,institute,yearofcomplete
                s1.setAddress(rs1.getString(6));
                s1.setEmail(rs1.getString(7));
                s1.setTel(rs1.getInt(8));
                s1.setGender(rs1.getString(9));
                s1.setIntakeyear(rs1.getInt(10));
                s1.setIntakemonth(rs1.getString(11));
                s1.setALindex(rs1.getInt(12));
                s1.setZscore(rs1.getDouble(13));
                s1.setAccounting(rs1.getString(14));
                s1.setEcon(rs1.getString(15));
                s1.setBusinessstudies(rs1.getString(16));
                s1.setEnglish(rs1.getString(17));
                s1.setQualificationlevel(rs1.getString(18));
                s1.setQualificationtype(rs1.getString(19));
                s1.setInstitute(rs1.getString(20));
                s1.setYearofcomplete(rs1.getInt(21));
                
                list1.add(s1);
            }
            return list1;

        } catch (Exception e) {
            System.out.println("exeption >>> " + e);
            //return false;
            return null;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.print(e);
            }

        }
    }
    
    public ArrayList<BStudent> getStudent3() {
        try {

            ArrayList<BStudent> list = new ArrayList<BStudent>();

            System.out.println("Get student 1");
            con = (Connection) DriverManager.getConnection(url, username, password);
            
            int curyear = (Calendar.getInstance().get(Calendar.YEAR))-2;
            String query = "SELECT * FROM schoolofbusiness WHERE intakeyear="+curyear;//schoolofbusiness
            
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("Get student 2");

            rs = pst.executeQuery();

            while (rs.next()) {
                BStudent s = new BStudent();
                s.setRegID(rs.getInt(1));
                s.setFirstName(rs.getString(2));
                s.setLastName(rs.getString(3));
                s.setAge(rs.getInt(4));
                s.setNic(rs.getString(5));
//address,email,tel,gender,intakeyear,intakemonth,alindex,zscore,accounting,econ.businessstudies,english,qualificationlevel,
//qualificationtype,institute,yearofcomplete
                s.setAddress(rs.getString(6));
                s.setEmail(rs.getString(7));
                s.setTel(rs.getInt(8));
                s.setGender(rs.getString(9));
                s.setIntakeyear(rs.getInt(10));
                s.setIntakemonth(rs.getString(11));
                s.setALindex(rs.getInt(12));
                s.setZscore(rs.getDouble(13));
                s.setAccounting(rs.getString(14));
                s.setEcon(rs.getString(15));
                s.setBusinessstudies(rs.getString(16));
                s.setEnglish(rs.getString(17));
                s.setQualificationlevel(rs.getString(18));
                s.setQualificationtype(rs.getString(19));
                s.setInstitute(rs.getString(20));
                s.setYearofcomplete(rs.getInt(21));
                
                list.add(s);
            }
            return list;

        } catch (Exception e) {
            System.out.println("exeption >>> " + e);
            //return false;
            return null;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.print(e);
            }

        }
    }
    
    public ArrayList<BStudent> getStudent4() {
        try {

            ArrayList<BStudent> list = new ArrayList<BStudent>();

            System.out.println("Get student 1");
            con = (Connection) DriverManager.getConnection(url, username, password);
            
            int curyear = (Calendar.getInstance().get(Calendar.YEAR))-3;
            String query = "SELECT * FROM schoolofbusiness WHERE intakeyear="+curyear;//schoolofbusiness
            
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("Get student 2");

            rs = pst.executeQuery();

            while (rs.next()) {
                BStudent s = new BStudent();
                s.setRegID(rs.getInt(1));
                s.setFirstName(rs.getString(2));
                s.setLastName(rs.getString(3));
                s.setAge(rs.getInt(4));
                s.setNic(rs.getString(5));
//address,email,tel,gender,intakeyear,intakemonth,alindex,zscore,accounting,econ.businessstudies,english,qualificationlevel,
//qualificationtype,institute,yearofcomplete
                s.setAddress(rs.getString(6));
                s.setEmail(rs.getString(7));
                s.setTel(rs.getInt(8));
                s.setGender(rs.getString(9));
                s.setIntakeyear(rs.getInt(10));
                s.setIntakemonth(rs.getString(11));
                s.setALindex(rs.getInt(12));
                s.setZscore(rs.getDouble(13));
                s.setAccounting(rs.getString(14));
                s.setEcon(rs.getString(15));
                s.setBusinessstudies(rs.getString(16));
                s.setEnglish(rs.getString(17));
                s.setQualificationlevel(rs.getString(18));
                s.setQualificationtype(rs.getString(19));
                s.setInstitute(rs.getString(20));
                s.setYearofcomplete(rs.getInt(21));
                
                list.add(s);//list.add(s)
            }
            return list;

        } catch (Exception e) {
            System.out.println("exeption >>> " + e);
            //return false;
            return null;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.print(e);
            }

        }
    }
}
