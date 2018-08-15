
package Computing.lecturers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class CLecDBOperation {
    String url = "jdbc:mysql://localhost:3306/nsbm";
    String username = "root";
    String password = "";
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public boolean addlecturer(CLecturer bl) {
        try {

            System.out.println("Add lecturer 1");
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "INSERT INTO schoolofcomputinglecturers VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("add lecturer 2");
            pst.setInt(1, bl.getLecid());//address,gender,faculty,depar,year
            pst.setString(2, bl.getFullname());
            pst.setString(3, bl.getName());
            pst.setString(4, bl.getNIC());
            pst.setString(5, bl.getSubject());
            pst.setString(6, bl.getTeachingyear());
            pst.setString(7, bl.getDegree());
            pst.setString(8, bl.getUniversity());
            pst.setString(9, bl.getExperiance());
            pst.setString(10, bl.getPhone());
            pst.setString(11, bl.getEmail());
            pst.setString(12, bl.getAddress());
            
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

        //pst.setString(2, );
    }

    ArrayList<CLecturer> getlecturer() {
        try {

            ArrayList<CLecturer> list = new ArrayList<CLecturer>();

            System.out.println("Get lecturer 1");
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM schoolofcomputinglecturers";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("Get lecturer 2");

            rs = pst.executeQuery();

            while (rs.next()) {
                CLecturer bl = new CLecturer();
                bl.setLecid(rs.getInt(1));
                bl.setFullname(rs.getString(2));
                bl.setName(rs.getString(3));
                bl.setNIC(rs.getString(4));
                bl.setSubject(rs.getString(5));
                bl.setTeachingyear(rs.getString(6));
                bl.setDegree(rs.getString(7));
                bl.setUniversity(rs.getString(8));
                bl.setExperiance(rs.getString(9));
                bl.setPhone(rs.getString(10));
                bl.setEmail(rs.getString(11));
                bl.setAddress(rs.getString(12));

                list.add(bl);
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

    public boolean updateLecturer(CLecturer bl) {
        try {

            System.out.println("Update lecturer 1");
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "UPDATE schoolofcomputinglecturers SET fullname='" + bl.getFullname() + "',name='" + bl.getName() + "',NIC='" + bl.getNIC() + "',subject='" + bl.getSubject() +"',teachingyear='" + bl.getTeachingyear() + "',degree='" + bl.getDegree() + "',university='" + bl.getUniversity() + "',experiance='" + bl.getExperiance() + "',phone='"+bl.getPhone()+"',email='"+bl.getEmail()+"',address'"+bl.getAddress()+"', WHERE lecid=" + bl.getLecid();
            
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("Update lecturer 2");

            pst.executeUpdate();
            System.out.println("Update lecturer 3");

            return true;

        } catch (Exception e) {
            System.out.println("exeption >>> " + e);
            return false;
            //return null;
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

    public boolean deletelecturer(CLecturer bl) {
        try {
            
            System.out.println("Delete lecturer 1");
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "DELETE FROM schoolofcomputinglecturers WHERE lecid="+ bl.getLecid();//lecid=" + bl.getLecid()
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("Delete lecturer 2");

            pst.executeUpdate();
            System.out.println("Delete lecturer 3");
            
            return true;
            
        } catch (Exception e) {
            System.out.println("exeption >>> " + e);
            return false;
            //return null;
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
