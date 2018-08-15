
package Business.TimeTable;

import java.sql.*;
import java.util.ArrayList;


public class BTimeTableDBOperation {
    String url = "jdbc:mysql://localhost:3306/nsbm";
    String username = "root";
    String password = "";
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public boolean addSubject(timetable tt) {
        try {

            System.out.println("Add subject 1");
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "INSERT INTO schoolofbusinesstimetable VALUES (?,?,?,?,?,?,?)";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("add subject 2");
            pst.setInt(1, tt.getSubid());//address,gender,faculty,depar,year
            pst.setString(2, tt.getSubname());
            pst.setString(3, tt.getLocation());
            pst.setString(4, tt.getTime());
            pst.setInt(5, tt.getYear());
            pst.setInt(6, tt.getSem());
            pst.setString(7, tt.getDay());
            
            pst.executeUpdate();
            
            System.out.println("Subject added successfully");
            
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

    ArrayList<timetable> getvaluesyr1sem1mon() {
        try {

            ArrayList<timetable> ttlist1 = new ArrayList<timetable>();

            int year1=1;
            int sem1=1;
            String day1="Monday";
            System.out.println("Get subject 1");
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM schoolofbusinesstimetable WHERE year="+year1+" AND sem="+sem1+" AND day='"+day1+"'";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("Get subject 2");

            rs = pst.executeQuery();

            while (rs.next()) {
                timetable tt = new timetable();
                tt.setSubid(rs.getInt(1));
                tt.setSubname(rs.getString(2));
                tt.setLocation(rs.getString(3));
                tt.setTime(rs.getString(4));
                tt.setYear(rs.getInt(5));
                tt.setSem(rs.getInt(6));
                tt.setDay(rs.getString(7));
                
                ttlist1.add(tt);
            }
            return ttlist1;

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
    
    ArrayList<timetable> getvaluesyr1sem1tue() {
        try {

            ArrayList<timetable> ttlist1 = new ArrayList<timetable>();

            int year1=1;
            int sem1=1;
            String day1="Tuesday";
            System.out.println("Get subject 1");
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM schoolofbusinesstimetable WHERE year="+year1+" AND sem="+sem1+" AND day='"+day1+"'";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("Get subject 2");

            rs = pst.executeQuery();

            while (rs.next()) {
                timetable tt = new timetable();
                tt.setSubid(rs.getInt(1));
                tt.setSubname(rs.getString(2));
                tt.setLocation(rs.getString(3));
                tt.setTime(rs.getString(4));
                tt.setYear(rs.getInt(5));
                tt.setSem(rs.getInt(6));
                tt.setDay(rs.getString(7));
                
                ttlist1.add(tt);
            }
            return ttlist1;

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
    
    ArrayList<timetable> getvaluesyr1sem1wed() {
        try {

            ArrayList<timetable> ttlist1 = new ArrayList<timetable>();

            int year1=1;
            int sem1=1;
            String day1="Wednesday";
            System.out.println("Get subject 1");
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM schoolofbusinesstimetable WHERE year="+year1+" AND sem="+sem1+" AND day='"+day1+"'";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("Get subject 2");

            rs = pst.executeQuery();

            while (rs.next()) {
                timetable tt = new timetable();
                tt.setSubid(rs.getInt(1));
                tt.setSubname(rs.getString(2));
                tt.setLocation(rs.getString(3));
                tt.setTime(rs.getString(4));
                tt.setYear(rs.getInt(5));
                tt.setSem(rs.getInt(6));
                tt.setDay(rs.getString(7));
                
                ttlist1.add(tt);
            }
            return ttlist1;

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
    
    ArrayList<timetable> getvaluesyr1sem1thu() {
        try {

            ArrayList<timetable> ttlist1 = new ArrayList<timetable>();

            int year1=1;
            int sem1=1;
            String day1="Thursday";
            System.out.println("Get subject 1");
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM schoolofbusinesstimetable WHERE year="+year1+" AND sem="+sem1+" AND day='"+day1+"'";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("Get subject 2");

            rs = pst.executeQuery();

            while (rs.next()) {
                timetable tt = new timetable();
                tt.setSubid(rs.getInt(1));
                tt.setSubname(rs.getString(2));
                tt.setLocation(rs.getString(3));
                tt.setTime(rs.getString(4));
                tt.setYear(rs.getInt(5));
                tt.setSem(rs.getInt(6));
                tt.setDay(rs.getString(7));
                
                ttlist1.add(tt);
            }
            return ttlist1;

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
    
    ArrayList<timetable> getvaluesyr1sem1fri() {
        try {

            ArrayList<timetable> ttlist1 = new ArrayList<timetable>();

            int year1=1;
            int sem1=1;
            String day1="Friday";
            System.out.println("Get subject 1");
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM schoolofbusinesstimetable WHERE year="+year1+" AND sem="+sem1+" AND day='"+day1+"'";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("Get subject 2");

            rs = pst.executeQuery();

            while (rs.next()) {
                timetable tt = new timetable();
                tt.setSubid(rs.getInt(1));
                tt.setSubname(rs.getString(2));
                tt.setLocation(rs.getString(3));
                tt.setTime(rs.getString(4));
                tt.setYear(rs.getInt(5));
                tt.setSem(rs.getInt(6));
                tt.setDay(rs.getString(7));
                
                ttlist1.add(tt);
            }
            return ttlist1;

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
    
    ArrayList<timetable> getvaluesyr1sem2mon() {
        try {

            ArrayList<timetable> ttlist1 = new ArrayList<timetable>();

            int year1=1;
            int sem1=2;
            String day1="Monday";
            System.out.println("Get subject 1");
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query ="SELECT * FROM schoolofbusinesstimetable WHERE year="+year1+" AND sem="+sem1+" AND day='"+day1+"'";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("Get subject 2");

            rs = pst.executeQuery();

            while (rs.next()) {
                timetable tt = new timetable();
                tt.setSubid(rs.getInt(1));
                tt.setSubname(rs.getString(2));
                tt.setLocation(rs.getString(3));
                tt.setTime(rs.getString(4));
                tt.setYear(rs.getInt(5));
                tt.setSem(rs.getInt(6));
                tt.setDay(rs.getString(7));
                
                ttlist1.add(tt);
            }
            return ttlist1;

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
    
    ArrayList<timetable> getvaluesyr1sem2tue() {
        try {

            ArrayList<timetable> ttlist1 = new ArrayList<timetable>();

            int year1=1;
            int sem1=2;
            String day1="Tuesday";
            System.out.println("Get subject 1");
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM schoolofbusinesstimetable WHERE year="+year1+" AND sem="+sem1+" AND day='"+day1+"'";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("Get subject 2");

            rs = pst.executeQuery();

            while (rs.next()) {
                timetable tt = new timetable();
                tt.setSubid(rs.getInt(1));
                tt.setSubname(rs.getString(2));
                tt.setLocation(rs.getString(3));
                tt.setTime(rs.getString(4));
                tt.setYear(rs.getInt(5));
                tt.setSem(rs.getInt(6));
                tt.setDay(rs.getString(7));
                
                ttlist1.add(tt);
            }
            return ttlist1;

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
    
    ArrayList<timetable> getvaluesyr1sem2wed() {
        try {

            ArrayList<timetable> ttlist1 = new ArrayList<timetable>();

            int year1=1;
            int sem1=2;
            String day1="Wednesday";
            System.out.println("Get subject 1");
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM schoolofbusinesstimetable WHERE year="+year1+" AND sem="+sem1+" AND day='"+day1+"'";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("Get subject 2");

            rs = pst.executeQuery();

            while (rs.next()) {
                timetable tt = new timetable();
                tt.setSubid(rs.getInt(1));
                tt.setSubname(rs.getString(2));
                tt.setLocation(rs.getString(3));
                tt.setTime(rs.getString(4));
                tt.setYear(rs.getInt(5));
                tt.setSem(rs.getInt(6));
                tt.setDay(rs.getString(7));
                
                ttlist1.add(tt);
            }
            return ttlist1;

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
    
    ArrayList<timetable> getvaluesyr1sem2thu() {
        try {

            ArrayList<timetable> ttlist1 = new ArrayList<timetable>();

            int year1=1;
            int sem1=2;
            String day1="Thursday";
            System.out.println("Get subject 1");
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM schoolofbusinesstimetable WHERE year="+year1+" AND sem="+sem1+" AND day='"+day1+"'";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("Get subject 2");

            rs = pst.executeQuery();

            while (rs.next()) {
                timetable tt = new timetable();
                tt.setSubid(rs.getInt(1));
                tt.setSubname(rs.getString(2));
                tt.setLocation(rs.getString(3));
                tt.setTime(rs.getString(4));
                tt.setYear(rs.getInt(5));
                tt.setSem(rs.getInt(6));
                tt.setDay(rs.getString(7));
                
                ttlist1.add(tt);
            }
            return ttlist1;

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
    
    ArrayList<timetable> getvaluesyr1sem2fri() {
        try {

            ArrayList<timetable> ttlist1 = new ArrayList<timetable>();

            int year1=1;
            int sem1=2;
            String day1="Friday";
            System.out.println("Get subject 1");
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM schoolofbusinesstimetable WHERE year="+year1+" AND sem="+sem1+" AND day='"+day1+"'";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("Get subject 2");

            rs = pst.executeQuery();

            while (rs.next()) {
                timetable tt = new timetable();
                tt.setSubid(rs.getInt(1));
                tt.setSubname(rs.getString(2));
                tt.setLocation(rs.getString(3));
                tt.setTime(rs.getString(4));
                tt.setYear(rs.getInt(5));
                tt.setSem(rs.getInt(6));
                tt.setDay(rs.getString(7));
                
                ttlist1.add(tt);
            }
            return ttlist1;

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
    
    ArrayList<timetable> getvaluesyr2sem1mon() {
        try {

            ArrayList<timetable> ttlist1 = new ArrayList<timetable>();

            int year1=2;
            int sem1=1;
            String day1="Monday";
            System.out.println("Get subject 1");
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM schoolofbusinesstimetable WHERE year="+year1+" AND sem="+sem1+" AND day='"+day1+"'";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("Get subject 2");

            rs = pst.executeQuery();

            while (rs.next()) {
                timetable tt = new timetable();
                tt.setSubid(rs.getInt(1));
                tt.setSubname(rs.getString(2));
                tt.setLocation(rs.getString(3));
                tt.setTime(rs.getString(4));
                tt.setYear(rs.getInt(5));
                tt.setSem(rs.getInt(6));
                tt.setDay(rs.getString(7));
                
                ttlist1.add(tt);
            }
            return ttlist1;

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
    
    ArrayList<timetable> getvaluesyr2sem1tue() {
        try {

            ArrayList<timetable> ttlist1 = new ArrayList<timetable>();

            int year1=2;
            int sem1=1;
            String day1="Tuesday";
            System.out.println("Get subject 1");
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM schoolofbusinesstimetable WHERE year="+year1+" AND sem="+sem1+" AND day='"+day1+"'";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("Get subject 2");

            rs = pst.executeQuery();

            while (rs.next()) {
                timetable tt = new timetable();
                tt.setSubid(rs.getInt(1));
                tt.setSubname(rs.getString(2));
                tt.setLocation(rs.getString(3));
                tt.setTime(rs.getString(4));
                tt.setYear(rs.getInt(5));
                tt.setSem(rs.getInt(6));
                tt.setDay(rs.getString(7));
                
                ttlist1.add(tt);
            }
            return ttlist1;

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
    
    ArrayList<timetable> getvaluesyr2sem1wed() {
        try {

            ArrayList<timetable> ttlist1 = new ArrayList<timetable>();

            int year1=2;
            int sem1=1;
            String day1="Wednesday";
            System.out.println("Get subject 1");
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM schoolofbusinesstimetable WHERE year="+year1+" AND sem="+sem1+" AND day='"+day1+"'";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("Get subject 2");

            rs = pst.executeQuery();

            while (rs.next()) {
                timetable tt = new timetable();
                tt.setSubid(rs.getInt(1));
                tt.setSubname(rs.getString(2));
                tt.setLocation(rs.getString(3));
                tt.setTime(rs.getString(4));
                tt.setYear(rs.getInt(5));
                tt.setSem(rs.getInt(6));
                tt.setDay(rs.getString(7));
                
                ttlist1.add(tt);
            }
            return ttlist1;

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
    
    ArrayList<timetable> getvaluesyr2sem1thu() {
        try {

            ArrayList<timetable> ttlist1 = new ArrayList<timetable>();

            int year1=2;
            int sem1=1;
            String day1="Thursday";
            System.out.println("Get subject 1");
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM schoolofbusinesstimetable WHERE year="+year1+" AND sem="+sem1+" AND day='"+day1+"'";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("Get subject 2");

            rs = pst.executeQuery();

            while (rs.next()) {
                timetable tt = new timetable();
                tt.setSubid(rs.getInt(1));
                tt.setSubname(rs.getString(2));
                tt.setLocation(rs.getString(3));
                tt.setTime(rs.getString(4));
                tt.setYear(rs.getInt(5));
                tt.setSem(rs.getInt(6));
                tt.setDay(rs.getString(7));
                
                ttlist1.add(tt);
            }
            return ttlist1;

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
    
    ArrayList<timetable> getvaluesyr2sem1fri() {
        try {

            ArrayList<timetable> ttlist1 = new ArrayList<timetable>();

            int year1=2;
            int sem1=1;
            String day1="Friday";
            System.out.println("Get subject 1");
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM schoolofbusinesstimetable WHERE year="+year1+" AND sem="+sem1+" AND day='"+day1+"'";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("Get subject 2");

            rs = pst.executeQuery();

            while (rs.next()) {
                timetable tt = new timetable();
                tt.setSubid(rs.getInt(1));
                tt.setSubname(rs.getString(2));
                tt.setLocation(rs.getString(3));
                tt.setTime(rs.getString(4));
                tt.setYear(rs.getInt(5));
                tt.setSem(rs.getInt(6));
                tt.setDay(rs.getString(7));
                
                ttlist1.add(tt);
            }
            return ttlist1;

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
    
    ArrayList<timetable> getvaluesyr2sem2mon() {
        try {

            ArrayList<timetable> ttlist1 = new ArrayList<timetable>();

            int year1=2;
            int sem1=2;
            String day1="Monday";
            System.out.println("Get subject 1");
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM schoolofbusinesstimetable WHERE year="+year1+" AND sem="+sem1+" AND day='"+day1+"'";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("Get subject 2");

            rs = pst.executeQuery();

            while (rs.next()) {
                timetable tt = new timetable();
                tt.setSubid(rs.getInt(1));
                tt.setSubname(rs.getString(2));
                tt.setLocation(rs.getString(3));
                tt.setTime(rs.getString(4));
                tt.setYear(rs.getInt(5));
                tt.setSem(rs.getInt(6));
                tt.setDay(rs.getString(7));
                
                ttlist1.add(tt);
            }
            return ttlist1;

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
    
    ArrayList<timetable> getvaluesyr2sem2tue() {
        try {

            ArrayList<timetable> ttlist1 = new ArrayList<timetable>();

            int year1=2;
            int sem1=2;
            String day1="Tuesday";
            System.out.println("Get subject 1");
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM schoolofbusinesstimetable WHERE year="+year1+" AND sem="+sem1+" AND day='"+day1+"'";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("Get subject 2");

            rs = pst.executeQuery();

            while (rs.next()) {
                timetable tt = new timetable();
                tt.setSubid(rs.getInt(1));
                tt.setSubname(rs.getString(2));
                tt.setLocation(rs.getString(3));
                tt.setTime(rs.getString(4));
                tt.setYear(rs.getInt(5));
                tt.setSem(rs.getInt(6));
                tt.setDay(rs.getString(7));
                
                ttlist1.add(tt);
            }
            return ttlist1;

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
    
    ArrayList<timetable> getvaluesyr2sem2wed() {
        try {

            ArrayList<timetable> ttlist1 = new ArrayList<timetable>();

            int year1=1;
            int sem1=2;
            String day1="Wednesday";
            System.out.println("Get subject 1");
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM schoolofbusinesstimetable WHERE year="+year1+" AND sem="+sem1+" AND day='"+day1+"'";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("Get subject 2");

            rs = pst.executeQuery();

            while (rs.next()) {
                timetable tt = new timetable();
                tt.setSubid(rs.getInt(1));
                tt.setSubname(rs.getString(2));
                tt.setLocation(rs.getString(3));
                tt.setTime(rs.getString(4));
                tt.setYear(rs.getInt(5));
                tt.setSem(rs.getInt(6));
                tt.setDay(rs.getString(7));
                
                ttlist1.add(tt);
            }
            return ttlist1;

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
    
    ArrayList<timetable> getvaluesyr2sem2thu() {
        try {

            ArrayList<timetable> ttlist1 = new ArrayList<timetable>();

            int year1=2;
            int sem1=2;
            String day1="Thursday";
            System.out.println("Get subject 1");
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM schoolofbusinesstimetable WHERE year="+year1+" AND sem="+sem1+" AND day='"+day1+"'";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("Get subject 2");

            rs = pst.executeQuery();

            while (rs.next()) {
                timetable tt = new timetable();
                tt.setSubid(rs.getInt(1));
                tt.setSubname(rs.getString(2));
                tt.setLocation(rs.getString(3));
                tt.setTime(rs.getString(4));
                tt.setYear(rs.getInt(5));
                tt.setSem(rs.getInt(6));
                tt.setDay(rs.getString(7));
                
                ttlist1.add(tt);
            }
            return ttlist1;

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
    
    ArrayList<timetable> getvaluesyr2sem2fri() {
        try {

            ArrayList<timetable> ttlist1 = new ArrayList<timetable>();

            int year1=2;
            int sem1=2;
            String day1="Friday";
            System.out.println("Get subject 1");
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM schoolofbusinesstimetable WHERE year="+year1+" AND sem="+sem1+" AND day='"+day1+"'";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("Get subject 2");

            rs = pst.executeQuery();

            while (rs.next()) {
                timetable tt = new timetable();
                tt.setSubid(rs.getInt(1));
                tt.setSubname(rs.getString(2));
                tt.setLocation(rs.getString(3));
                tt.setTime(rs.getString(4));
                tt.setYear(rs.getInt(5));
                tt.setSem(rs.getInt(6));
                tt.setDay(rs.getString(7));
                
                ttlist1.add(tt);
            }
            return ttlist1;

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
    
    ArrayList<timetable> getvaluesyr3sem1mon() {
        try {

            ArrayList<timetable> ttlist1 = new ArrayList<timetable>();

            int year1=3;
            int sem1=1;
            String day1="Monday";
            System.out.println("Get subject 1");
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM schoolofbusinesstimetable WHERE year="+year1+" AND sem="+sem1+" AND day='"+day1+"'";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("Get subject 2");

            rs = pst.executeQuery();

            while (rs.next()) {
                timetable tt = new timetable();
                tt.setSubid(rs.getInt(1));
                tt.setSubname(rs.getString(2));
                tt.setLocation(rs.getString(3));
                tt.setTime(rs.getString(4));
                tt.setYear(rs.getInt(5));
                tt.setSem(rs.getInt(6));
                tt.setDay(rs.getString(7));
                
                ttlist1.add(tt);
            }
            return ttlist1;

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
    
    ArrayList<timetable> getvaluesyr3sem1tue() {
        try {

            ArrayList<timetable> ttlist1 = new ArrayList<timetable>();

            int year1=3;
            int sem1=1;
            String day1="Tuesday";
            System.out.println("Get subject 1");
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM schoolofbusinesstimetable WHERE year="+year1+" AND sem="+sem1+" AND day='"+day1+"'";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("Get subject 2");

            rs = pst.executeQuery();

            while (rs.next()) {
                timetable tt = new timetable();
                tt.setSubid(rs.getInt(1));
                tt.setSubname(rs.getString(2));
                tt.setLocation(rs.getString(3));
                tt.setTime(rs.getString(4));
                tt.setYear(rs.getInt(5));
                tt.setSem(rs.getInt(6));
                tt.setDay(rs.getString(7));
                
                ttlist1.add(tt);
            }
            return ttlist1;

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
    
    ArrayList<timetable> getvaluesyr3sem1wed() {
        try {

            ArrayList<timetable> ttlist1 = new ArrayList<timetable>();

            int year1=3;
            int sem1=1;
            String day1="Wednesday";
            System.out.println("Get subject 1");
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM schoolofbusinesstimetable WHERE year="+year1+" AND sem="+sem1+" AND day='"+day1+"'";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("Get subject 2");

            rs = pst.executeQuery();

            while (rs.next()) {
                timetable tt = new timetable();
                tt.setSubid(rs.getInt(1));
                tt.setSubname(rs.getString(2));
                tt.setLocation(rs.getString(3));
                tt.setTime(rs.getString(4));
                tt.setYear(rs.getInt(5));
                tt.setSem(rs.getInt(6));
                tt.setDay(rs.getString(7));
                
                ttlist1.add(tt);
            }
            return ttlist1;

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
    
    ArrayList<timetable> getvaluesyr3sem1thu() {
        try {

            ArrayList<timetable> ttlist1 = new ArrayList<timetable>();

            int year1=3;
            int sem1=1;
            String day1="Thursday";
            System.out.println("Get subject 1");
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM schoolofbusinesstimetable WHERE year="+year1+" AND sem="+sem1+" AND day='"+day1+"'";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("Get subject 2");

            rs = pst.executeQuery();

            while (rs.next()) {
                timetable tt = new timetable();
                tt.setSubid(rs.getInt(1));
                tt.setSubname(rs.getString(2));
                tt.setLocation(rs.getString(3));
                tt.setTime(rs.getString(4));
                tt.setYear(rs.getInt(5));
                tt.setSem(rs.getInt(6));
                tt.setDay(rs.getString(7));
                
                ttlist1.add(tt);
            }
            return ttlist1;

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
    
    ArrayList<timetable> getvaluesyr3sem1fri() {
        try {

            ArrayList<timetable> ttlist1 = new ArrayList<timetable>();

            int year1=3;
            int sem1=1;
            String day1="Friday";
            System.out.println("Get subject 1");
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM schoolofbusinesstimetable WHERE year="+year1+" AND sem="+sem1+" AND day='"+day1+"'";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("Get subject 2");

            rs = pst.executeQuery();

            while (rs.next()) {
                timetable tt = new timetable();
                tt.setSubid(rs.getInt(1));
                tt.setSubname(rs.getString(2));
                tt.setLocation(rs.getString(3));
                tt.setTime(rs.getString(4));
                tt.setYear(rs.getInt(5));
                tt.setSem(rs.getInt(6));
                tt.setDay(rs.getString(7));
                
                ttlist1.add(tt);
            }
            return ttlist1;

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
    
    ArrayList<timetable> getvaluesyr3sem2mon() {
        try {

            ArrayList<timetable> ttlist1 = new ArrayList<timetable>();

            int year1=3;
            int sem1=2;
            String day1="Monday";
            System.out.println("Get subject 1");
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM schoolofbusinesstimetable WHERE year="+year1+" AND sem="+sem1+" AND day='"+day1+"'";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("Get subject 2");

            rs = pst.executeQuery();

            while (rs.next()) {
                timetable tt = new timetable();
                tt.setSubid(rs.getInt(1));
                tt.setSubname(rs.getString(2));
                tt.setLocation(rs.getString(3));
                tt.setTime(rs.getString(4));
                tt.setYear(rs.getInt(5));
                tt.setSem(rs.getInt(6));
                tt.setDay(rs.getString(7));
                
                ttlist1.add(tt);
            }
            return ttlist1;

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
    
    ArrayList<timetable> getvaluesyr3sem2tue() {
        try {

            ArrayList<timetable> ttlist1 = new ArrayList<timetable>();

            int year1=3;
            int sem1=2;
            String day1="Tuesday";
            System.out.println("Get subject 1");
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM schoolofbusinesstimetable WHERE year="+year1+" AND sem="+sem1+" AND day='"+day1+"'";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("Get subject 2");

            rs = pst.executeQuery();

            while (rs.next()) {
                timetable tt = new timetable();
                tt.setSubid(rs.getInt(1));
                tt.setSubname(rs.getString(2));
                tt.setLocation(rs.getString(3));
                tt.setTime(rs.getString(4));
                tt.setYear(rs.getInt(5));
                tt.setSem(rs.getInt(6));
                tt.setDay(rs.getString(7));
                
                ttlist1.add(tt);
            }
            return ttlist1;

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
    
    ArrayList<timetable> getvaluesyr3sem2wed() {
        try {

            ArrayList<timetable> ttlist1 = new ArrayList<timetable>();

            int year1=3;
            int sem1=2;
            String day1="Wednesday";
            System.out.println("Get subject 1");
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM schoolofbusinesstimetable WHERE year="+year1+" AND sem="+sem1+" AND day='"+day1+"'";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("Get subject 2");

            rs = pst.executeQuery();

            while (rs.next()) {
                timetable tt = new timetable();
                tt.setSubid(rs.getInt(1));
                tt.setSubname(rs.getString(2));
                tt.setLocation(rs.getString(3));
                tt.setTime(rs.getString(4));
                tt.setYear(rs.getInt(5));
                tt.setSem(rs.getInt(6));
                tt.setDay(rs.getString(7));
                
                ttlist1.add(tt);
            }
            return ttlist1;

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
    
    ArrayList<timetable> getvaluesyr3sem2thu() {
        try {

            ArrayList<timetable> ttlist1 = new ArrayList<timetable>();

            int year1=3;
            int sem1=2;
            String day1="Thursday";
            System.out.println("Get subject 1");
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM schoolofbusinesstimetable WHERE year="+year1+" AND sem="+sem1+" AND day='"+day1+"'";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("Get subject 2");

            rs = pst.executeQuery();

            while (rs.next()) {
                timetable tt = new timetable();
                tt.setSubid(rs.getInt(1));
                tt.setSubname(rs.getString(2));
                tt.setLocation(rs.getString(3));
                tt.setTime(rs.getString(4));
                tt.setYear(rs.getInt(5));
                tt.setSem(rs.getInt(6));
                tt.setDay(rs.getString(7));
                
                ttlist1.add(tt);
            }
            return ttlist1;

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
    
    ArrayList<timetable> getvaluesyr3sem2fri() {
        try {

            ArrayList<timetable> ttlist1 = new ArrayList<timetable>();

            int year1=3;
            int sem1=2;
            String day1="Friday";
            System.out.println("Get subject 1");
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM schoolofbusinesstimetable WHERE year="+year1+" AND sem="+sem1+" AND day='"+day1+"'";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("Get subject 2");

            rs = pst.executeQuery();

            while (rs.next()) {
                timetable tt = new timetable();
                tt.setSubid(rs.getInt(1));
                tt.setSubname(rs.getString(2));
                tt.setLocation(rs.getString(3));
                tt.setTime(rs.getString(4));
                tt.setYear(rs.getInt(5));
                tt.setSem(rs.getInt(6));
                tt.setDay(rs.getString(7));
                
                ttlist1.add(tt);
            }
            return ttlist1;

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
    
    ArrayList<timetable> getvaluesyr4sem1mon() {
        try {

            ArrayList<timetable> ttlist1 = new ArrayList<timetable>();

            int year1=4;
            int sem1=1;
            String day1="Monday";
            System.out.println("Get subject 1");
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM schoolofbusinesstimetable WHERE year="+year1+" AND sem="+sem1+" AND day='"+day1+"'";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("Get subject 2");

            rs = pst.executeQuery();

            while (rs.next()) {
                timetable tt = new timetable();
                tt.setSubid(rs.getInt(1));
                tt.setSubname(rs.getString(2));
                tt.setLocation(rs.getString(3));
                tt.setTime(rs.getString(4));
                tt.setYear(rs.getInt(5));
                tt.setSem(rs.getInt(6));
                tt.setDay(rs.getString(7));
                
                ttlist1.add(tt);
            }
            return ttlist1;

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
    
    ArrayList<timetable> getvaluesyr4sem1tue() {
        try {

            ArrayList<timetable> ttlist1 = new ArrayList<timetable>();

            int year1=4;
            int sem1=1;
            String day1="Tuesday";
            System.out.println("Get subject 1");
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM schoolofbusinesstimetable WHERE year="+year1+" AND sem="+sem1+" AND day='"+day1+"'";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("Get subject 2");

            rs = pst.executeQuery();

            while (rs.next()) {
                timetable tt = new timetable();
                tt.setSubid(rs.getInt(1));
                tt.setSubname(rs.getString(2));
                tt.setLocation(rs.getString(3));
                tt.setTime(rs.getString(4));
                tt.setYear(rs.getInt(5));
                tt.setSem(rs.getInt(6));
                tt.setDay(rs.getString(7));
                
                ttlist1.add(tt);
            }
            return ttlist1;

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
    
    ArrayList<timetable> getvaluesyr4sem1wed() {
        try {

            ArrayList<timetable> ttlist1 = new ArrayList<timetable>();

            int year1=4;
            int sem1=1;
            String day1="Wednesday";
            System.out.println("Get subject 1");
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM schoolofbusinesstimetable WHERE year="+year1+" AND sem="+sem1+" AND day='"+day1+"'";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("Get subject 2");

            rs = pst.executeQuery();

            while (rs.next()) {
                timetable tt = new timetable();
                tt.setSubid(rs.getInt(1));
                tt.setSubname(rs.getString(2));
                tt.setLocation(rs.getString(3));
                tt.setTime(rs.getString(4));
                tt.setYear(rs.getInt(5));
                tt.setSem(rs.getInt(6));
                tt.setDay(rs.getString(7));
                
                ttlist1.add(tt);
            }
            return ttlist1;

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
    
    ArrayList<timetable> getvaluesyr4sem1thu() {
        try {

            ArrayList<timetable> ttlist1 = new ArrayList<timetable>();

            int year1=4;
            int sem1=1;
            String day1="Thursday";
            System.out.println("Get subject 1");
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM schoolofbusinesstimetable WHERE year="+year1+" AND sem="+sem1+" AND day='"+day1+"'";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("Get subject 2");

            rs = pst.executeQuery();

            while (rs.next()) {
                timetable tt = new timetable();
                tt.setSubid(rs.getInt(1));
                tt.setSubname(rs.getString(2));
                tt.setLocation(rs.getString(3));
                tt.setTime(rs.getString(4));
                tt.setYear(rs.getInt(5));
                tt.setSem(rs.getInt(6));
                tt.setDay(rs.getString(7));
                
                ttlist1.add(tt);
            }
            return ttlist1;

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
    
    ArrayList<timetable> getvaluesyr4sem1fri() {
        try {

            ArrayList<timetable> ttlist1 = new ArrayList<timetable>();

            int year1=4;
            int sem1=1;
            String day1="Friday";
            System.out.println("Get subject 1");
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM schoolofbusinesstimetable WHERE year="+year1+" AND sem="+sem1+" AND day='"+day1+"'";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("Get subject 2");

            rs = pst.executeQuery();

            while (rs.next()) {
                timetable tt = new timetable();
                tt.setSubid(rs.getInt(1));
                tt.setSubname(rs.getString(2));
                tt.setLocation(rs.getString(3));
                tt.setTime(rs.getString(4));
                tt.setYear(rs.getInt(5));
                tt.setSem(rs.getInt(6));
                tt.setDay(rs.getString(7));
                
                ttlist1.add(tt);
            }
            return ttlist1;

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
    
    ArrayList<timetable> getvaluesyr4sem2mon() {
        try {

            ArrayList<timetable> ttlist1 = new ArrayList<timetable>();

            int year1=4;
            int sem1=2;
            String day1="Monday";
            System.out.println("Get subject 1");
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM schoolofbusinesstimetable WHERE year="+year1+" AND sem="+sem1+" AND day='"+day1+"'";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("Get subject 2");

            rs = pst.executeQuery();

            while (rs.next()) {
                timetable tt = new timetable();
                tt.setSubid(rs.getInt(1));
                tt.setSubname(rs.getString(2));
                tt.setLocation(rs.getString(3));
                tt.setTime(rs.getString(4));
                tt.setYear(rs.getInt(5));
                tt.setSem(rs.getInt(6));
                tt.setDay(rs.getString(7));
                
                ttlist1.add(tt);
            }
            return ttlist1;

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
    
    ArrayList<timetable> getvaluesyr4sem2tue() {
        try {

            ArrayList<timetable> ttlist1 = new ArrayList<timetable>();

            int year1=4;
            int sem1=2;
            String day1="Tuesday";
            System.out.println("Get subject 1");
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM schoolofbusinesstimetable WHERE year="+year1+" AND sem="+sem1+" AND day='"+day1+"'";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("Get subject 2");

            rs = pst.executeQuery();

            while (rs.next()) {
                timetable tt = new timetable();
                tt.setSubid(rs.getInt(1));
                tt.setSubname(rs.getString(2));
                tt.setLocation(rs.getString(3));
                tt.setTime(rs.getString(4));
                tt.setYear(rs.getInt(5));
                tt.setSem(rs.getInt(6));
                tt.setDay(rs.getString(7));
                
                ttlist1.add(tt);
            }
            return ttlist1;

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
    
    ArrayList<timetable> getvaluesyr4sem2wed() {
        try {

            ArrayList<timetable> ttlist1 = new ArrayList<timetable>();

            int year1=4;
            int sem1=2;
            String day1="Wednesday";
            System.out.println("Get subject 1");
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM schoolofbusinesstimetable WHERE year="+year1+" AND sem="+sem1+" AND day='"+day1+"'";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("Get subject 2");

            rs = pst.executeQuery();

            while (rs.next()) {
                timetable tt = new timetable();
                tt.setSubid(rs.getInt(1));
                tt.setSubname(rs.getString(2));
                tt.setLocation(rs.getString(3));
                tt.setTime(rs.getString(4));
                tt.setYear(rs.getInt(5));
                tt.setSem(rs.getInt(6));
                tt.setDay(rs.getString(7));
                
                ttlist1.add(tt);
            }
            return ttlist1;

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
    
    ArrayList<timetable> getvaluesyr4sem2thu() {
        try {

            ArrayList<timetable> ttlist1 = new ArrayList<timetable>();

            int year1=4;
            int sem1=2;
            String day1="Thursday";
            System.out.println("Get subject 1");
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM schoolofbusinesstimetable WHERE year="+year1+" AND sem="+sem1+" AND day='"+day1+"'";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("Get subject 2");

            rs = pst.executeQuery();

            while (rs.next()) {
                timetable tt = new timetable();
                tt.setSubid(rs.getInt(1));
                tt.setSubname(rs.getString(2));
                tt.setLocation(rs.getString(3));
                tt.setTime(rs.getString(4));
                tt.setYear(rs.getInt(5));
                tt.setSem(rs.getInt(6));
                tt.setDay(rs.getString(7));
                
                ttlist1.add(tt);
            }
            return ttlist1;

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
    
    ArrayList<timetable> getvaluesyr4sem2fri() {
        try {

            ArrayList<timetable> ttlist1 = new ArrayList<timetable>();

            int year1=4;
            int sem1=2;
            String day1="Friday";
            System.out.println("Get subject 1");
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM schoolofbusinesstimetable WHERE year="+year1+" AND sem="+sem1+" AND day='"+day1+"'";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("Get subject 2");

            rs = pst.executeQuery();

            while (rs.next()) {
                timetable tt = new timetable();
                tt.setSubid(rs.getInt(1));
                tt.setSubname(rs.getString(2));
                tt.setLocation(rs.getString(3));
                tt.setTime(rs.getString(4));
                tt.setYear(rs.getInt(5));
                tt.setSem(rs.getInt(6));
                tt.setDay(rs.getString(7));
                
                ttlist1.add(tt);
            }
            return ttlist1;

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

    public boolean updateSubject(timetable tt) {
        try {

            System.out.println("Update subject 1");
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "UPDATE schoolofbusinesstimetable SET subjectname='" + tt.getSubname() + "',location='" + tt.getLocation() + "',time='" + tt.getTime() + "',year=" + tt.getYear() +",sem=" + tt.getSem() + ",day='" + tt.getDay() + "' WHERE subjectid=" + tt.getSubid();
            
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("Update student 2");

            pst.executeUpdate();
            System.out.println("Update student 3");

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

    public boolean deleteSubject(timetable tt) {
        try {
            
            System.out.println("Delete subject 1");
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "DELETE FROM schoolofbusinesstimetable WHERE subjectid="+ tt.getSubid();
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("Delete subject 2");

            pst.executeUpdate();
            System.out.println("Delete subject 3");
            
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
