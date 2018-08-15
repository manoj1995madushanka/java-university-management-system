
package Business.selectsubjects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class dbops {
    String url = "jdbc:mysql://localhost:3306/nsbm";
    String username = "root";
    String password = "";
    Connection con = null;
    PreparedStatement pst = null;
    
    public boolean y1s1business(subs s1) {
        try {

            System.out.println("set result 1");
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "INSERT INTO schoolofbusinesssem1year1 VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("set result 2");
            //pst.setInt(1, sb.getStudentID());//address,gender,faculty,depar,year
            pst.setInt(1, s1.getStid());
            pst.setString(2, s1.getStname());
            pst.setString(3, s1.getSub1());
            pst.setString(4, s1.getSub1lec());
            pst.setInt(5, s1.getSub1credit());
            pst.setInt(6, s1.getSub1amount());
            
            pst.setString(7, s1.getSub2());
            pst.setString(8, s1.getSub2lec());
            pst.setInt(9, s1.getSub2credit());
            pst.setInt(10, s1.getSub2amount());
            
            pst.setString(11, s1.getSub3());
            pst.setString(12, s1.getSub3lec());
            pst.setInt(13, s1.getSub3credit());
            pst.setInt(14, s1.getSub3amount());
            
            pst.setString(15, s1.getSub4());
            pst.setString(16, s1.getSub4lec());
            pst.setInt(17, s1.getSub4credit());
            pst.setInt(18, s1.getSub4amount());
            
            pst.setString(19, s1.getSub5());
            pst.setString(20, s1.getSub5lec());
            pst.setInt(21, s1.getSub5credit());
            pst.setInt(22, s1.getSub5amount());
            
            pst.setString(23, s1.getSub6());
            pst.setString(24, s1.getSub6lec());
            pst.setInt(25, s1.getSub6credit());
            pst.setInt(26, s1.getSub6amount());
            
            pst.setString(27, s1.getSub7());
            pst.setString(28, s1.getSub7lec());
            pst.setInt(29, s1.getSub7credit());
            pst.setInt(30, s1.getSub7amount());
            
            /*pst.setString(31, s1.getSub8());
            pst.setString(32, s1.getSub8lec());
            pst.setInt(33, s1.getSub8credit());
            pst.setInt(34, s1.getSub8amount());*/
            
            pst.setInt(31, s1.getRegid());
            
            pst.setInt(32, s1.getTotalcredit());
            
            pst.setInt(33, s1.getPaymentvalue());
            
            pst.setString(34, s1.getSub1result());
            pst.setString(35, s1.getSub2result());
            pst.setString(36, s1.getSub3result());
            pst.setString(37, s1.getSub4result());
            pst.setString(38, s1.getSub5result());
            pst.setString(39, s1.getSub6result());
            pst.setString(40, s1.getSub7result());
            
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
    
    public boolean y1s2business(subs s1) {
        try {

            System.out.println("set result 1");
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "INSERT INTO schoolofbusinesssem2year1 VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("set result 2");
            //pst.setInt(1, sb.getStudentID());//address,gender,faculty,depar,year
            pst.setInt(1, s1.getStid());
            pst.setString(2, s1.getStname());
            pst.setString(3, s1.getSub1());
            pst.setString(4, s1.getSub1lec());
            pst.setInt(5, s1.getSub1credit());
            pst.setInt(6, s1.getSub1amount());
            
            pst.setString(7, s1.getSub2());
            pst.setString(8, s1.getSub2lec());
            pst.setInt(9, s1.getSub2credit());
            pst.setInt(10, s1.getSub2amount());
            
            pst.setString(11, s1.getSub3());
            pst.setString(12, s1.getSub3lec());
            pst.setInt(13, s1.getSub3credit());
            pst.setInt(14, s1.getSub3amount());
            
            pst.setString(15, s1.getSub4());
            pst.setString(16, s1.getSub4lec());
            pst.setInt(17, s1.getSub4credit());
            pst.setInt(18, s1.getSub4amount());
            
            pst.setString(19, s1.getSub5());
            pst.setString(20, s1.getSub5lec());
            pst.setInt(21, s1.getSub5credit());
            pst.setInt(22, s1.getSub5amount());
            
            pst.setString(23, s1.getSub6());
            pst.setString(24, s1.getSub6lec());
            pst.setInt(25, s1.getSub6credit());
            pst.setInt(26, s1.getSub6amount());
            
            pst.setString(27, s1.getSub7());
            pst.setString(28, s1.getSub7lec());
            pst.setInt(29, s1.getSub7credit());
            pst.setInt(30, s1.getSub7amount());
            
            /*pst.setString(31, s1.getSub8());
            pst.setString(32, s1.getSub8lec());
            pst.setInt(33, s1.getSub8credit());
            pst.setInt(34, s1.getSub8amount());*/
            
            pst.setInt(31, s1.getRegid());
            
            pst.setInt(32, s1.getTotalcredit());
            
            pst.setInt(33, s1.getPaymentvalue());
            
            pst.setString(34, s1.getSub1result());
            pst.setString(35, s1.getSub2result());
            pst.setString(36, s1.getSub3result());
            pst.setString(37, s1.getSub4result());
            pst.setString(38, s1.getSub5result());
            pst.setString(39, s1.getSub6result());
            pst.setString(40, s1.getSub7result());
            
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
    
    public boolean y2s1business(subs s1) {
        try {

            System.out.println("set result 1");
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "INSERT INTO schoolofbusinesssem1year2 VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("set result 2");
            //pst.setInt(1, sb.getStudentID());//address,gender,faculty,depar,year
            pst.setInt(1, s1.getStid());
            pst.setString(2, s1.getStname());
            pst.setString(3, s1.getSub1());
            pst.setString(4, s1.getSub1lec());
            pst.setInt(5, s1.getSub1credit());
            pst.setInt(6, s1.getSub1amount());
            
            pst.setString(7, s1.getSub2());
            pst.setString(8, s1.getSub2lec());
            pst.setInt(9, s1.getSub2credit());
            pst.setInt(10, s1.getSub2amount());
            
            pst.setString(11, s1.getSub3());
            pst.setString(12, s1.getSub3lec());
            pst.setInt(13, s1.getSub3credit());
            pst.setInt(14, s1.getSub3amount());
            
            pst.setString(15, s1.getSub4());
            pst.setString(16, s1.getSub4lec());
            pst.setInt(17, s1.getSub4credit());
            pst.setInt(18, s1.getSub4amount());
            
            pst.setString(19, s1.getSub5());
            pst.setString(20, s1.getSub5lec());
            pst.setInt(21, s1.getSub5credit());
            pst.setInt(22, s1.getSub5amount());
            
            pst.setString(23, s1.getSub6());
            pst.setString(24, s1.getSub6lec());
            pst.setInt(25, s1.getSub6credit());
            pst.setInt(26, s1.getSub6amount());
            
            pst.setString(27, s1.getSub7());
            pst.setString(28, s1.getSub7lec());
            pst.setInt(29, s1.getSub7credit());
            pst.setInt(30, s1.getSub7amount());
            
            /*pst.setString(31, s1.getSub8());
            pst.setString(32, s1.getSub8lec());
            pst.setInt(33, s1.getSub8credit());
            pst.setInt(34, s1.getSub8amount());*/
            
            pst.setInt(31, s1.getRegid());
            
            pst.setInt(32, s1.getTotalcredit());
            
            pst.setInt(33, s1.getPaymentvalue());
            
            pst.setString(34, s1.getSub1result());
            pst.setString(35, s1.getSub2result());
            pst.setString(36, s1.getSub3result());
            pst.setString(37, s1.getSub4result());
            pst.setString(38, s1.getSub5result());
            pst.setString(39, s1.getSub6result());
            pst.setString(40, s1.getSub7result());
            
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
    
    public boolean y2s2business(subs s1) {
        try {

            System.out.println("set result 1");
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "INSERT INTO schoolofbusinesssem2year2 VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("set result 2");
            //pst.setInt(1, sb.getStudentID());//address,gender,faculty,depar,year
            pst.setInt(1, s1.getStid());
            pst.setString(2, s1.getStname());
            pst.setString(3, s1.getSub1());
            pst.setString(4, s1.getSub1lec());
            pst.setInt(5, s1.getSub1credit());
            pst.setInt(6, s1.getSub1amount());
            
            pst.setString(7, s1.getSub2());
            pst.setString(8, s1.getSub2lec());
            pst.setInt(9, s1.getSub2credit());
            pst.setInt(10, s1.getSub2amount());
            
            pst.setString(11, s1.getSub3());
            pst.setString(12, s1.getSub3lec());
            pst.setInt(13, s1.getSub3credit());
            pst.setInt(14, s1.getSub3amount());
            
            pst.setString(15, s1.getSub4());
            pst.setString(16, s1.getSub4lec());
            pst.setInt(17, s1.getSub4credit());
            pst.setInt(18, s1.getSub4amount());
            
            pst.setString(19, s1.getSub5());
            pst.setString(20, s1.getSub5lec());
            pst.setInt(21, s1.getSub5credit());
            pst.setInt(22, s1.getSub5amount());
            
            pst.setString(23, s1.getSub6());
            pst.setString(24, s1.getSub6lec());
            pst.setInt(25, s1.getSub6credit());
            pst.setInt(26, s1.getSub6amount());
            
            pst.setString(27, s1.getSub7());
            pst.setString(28, s1.getSub7lec());
            pst.setInt(29, s1.getSub7credit());
            pst.setInt(30, s1.getSub7amount());
            
            /*pst.setString(31, s1.getSub8());
            pst.setString(32, s1.getSub8lec());
            pst.setInt(33, s1.getSub8credit());
            pst.setInt(34, s1.getSub8amount());*/
            
            pst.setInt(31, s1.getRegid());
            
            pst.setInt(32, s1.getTotalcredit());
            
            pst.setInt(33, s1.getPaymentvalue());
            
            pst.setString(34, s1.getSub1result());
            pst.setString(35, s1.getSub2result());
            pst.setString(36, s1.getSub3result());
            pst.setString(37, s1.getSub4result());
            pst.setString(38, s1.getSub5result());
            pst.setString(39, s1.getSub6result());
            pst.setString(40, s1.getSub7result());
            
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
    
    public boolean y3s1business(subs s1) {
        try {

            System.out.println("set result 1");
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "INSERT INTO schoolofbusinesssem1year3 VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("set result 2");
            //pst.setInt(1, sb.getStudentID());//address,gender,faculty,depar,year
            pst.setInt(1, s1.getStid());
            pst.setString(2, s1.getStname());
            pst.setString(3, s1.getSub1());
            pst.setString(4, s1.getSub1lec());
            pst.setInt(5, s1.getSub1credit());
            pst.setInt(6, s1.getSub1amount());
            
            pst.setString(7, s1.getSub2());
            pst.setString(8, s1.getSub2lec());
            pst.setInt(9, s1.getSub2credit());
            pst.setInt(10, s1.getSub2amount());
            
            pst.setString(11, s1.getSub3());
            pst.setString(12, s1.getSub3lec());
            pst.setInt(13, s1.getSub3credit());
            pst.setInt(14, s1.getSub3amount());
            
            pst.setString(15, s1.getSub4());
            pst.setString(16, s1.getSub4lec());
            pst.setInt(17, s1.getSub4credit());
            pst.setInt(18, s1.getSub4amount());
            
            pst.setString(19, s1.getSub5());
            pst.setString(20, s1.getSub5lec());
            pst.setInt(21, s1.getSub5credit());
            pst.setInt(22, s1.getSub5amount());
            
            pst.setString(23, s1.getSub6());
            pst.setString(24, s1.getSub6lec());
            pst.setInt(25, s1.getSub6credit());
            pst.setInt(26, s1.getSub6amount());
            
            pst.setString(27, s1.getSub7());
            pst.setString(28, s1.getSub7lec());
            pst.setInt(29, s1.getSub7credit());
            pst.setInt(30, s1.getSub7amount());
            
            /*pst.setString(31, s1.getSub8());
            pst.setString(32, s1.getSub8lec());
            pst.setInt(33, s1.getSub8credit());
            pst.setInt(34, s1.getSub8amount());*/
            
            pst.setInt(31, s1.getRegid());
            
            pst.setInt(32, s1.getTotalcredit());
            
            pst.setInt(33, s1.getPaymentvalue());
            
            pst.setString(34, s1.getSub1result());
            pst.setString(35, s1.getSub2result());
            pst.setString(36, s1.getSub3result());
            pst.setString(37, s1.getSub4result());
            pst.setString(38, s1.getSub5result());
            pst.setString(39, s1.getSub6result());
            pst.setString(40, s1.getSub7result());
            
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
    
    public boolean y3s2business(subs s1) {
        try {

            System.out.println("set result 1");
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "INSERT INTO schoolofbusinesssem2year3 VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("set result 2");
            //pst.setInt(1, sb.getStudentID());//address,gender,faculty,depar,year
            pst.setInt(1, s1.getStid());
            pst.setString(2, s1.getStname());
            pst.setString(3, s1.getSub1());
            pst.setString(4, s1.getSub1lec());
            pst.setInt(5, s1.getSub1credit());
            pst.setInt(6, s1.getSub1amount());
            
            pst.setString(7, s1.getSub2());
            pst.setString(8, s1.getSub2lec());
            pst.setInt(9, s1.getSub2credit());
            pst.setInt(10, s1.getSub2amount());
            
            pst.setString(11, s1.getSub3());
            pst.setString(12, s1.getSub3lec());
            pst.setInt(13, s1.getSub3credit());
            pst.setInt(14, s1.getSub3amount());
            
            pst.setString(15, s1.getSub4());
            pst.setString(16, s1.getSub4lec());
            pst.setInt(17, s1.getSub4credit());
            pst.setInt(18, s1.getSub4amount());
            
            pst.setString(19, s1.getSub5());
            pst.setString(20, s1.getSub5lec());
            pst.setInt(21, s1.getSub5credit());
            pst.setInt(22, s1.getSub5amount());
            
            pst.setString(23, s1.getSub6());
            pst.setString(24, s1.getSub6lec());
            pst.setInt(25, s1.getSub6credit());
            pst.setInt(26, s1.getSub6amount());
            
            pst.setString(27, s1.getSub7());
            pst.setString(28, s1.getSub7lec());
            pst.setInt(29, s1.getSub7credit());
            pst.setInt(30, s1.getSub7amount());
            
            /*pst.setString(31, s1.getSub8());
            pst.setString(32, s1.getSub8lec());
            pst.setInt(33, s1.getSub8credit());
            pst.setInt(34, s1.getSub8amount());*/
            
            pst.setInt(31, s1.getRegid());
            
            pst.setInt(32, s1.getTotalcredit());
            
            pst.setInt(33, s1.getPaymentvalue());
            
            pst.setString(34, s1.getSub1result());
            pst.setString(35, s1.getSub2result());
            pst.setString(36, s1.getSub3result());
            pst.setString(37, s1.getSub4result());
            pst.setString(38, s1.getSub5result());
            pst.setString(39, s1.getSub6result());
            pst.setString(40, s1.getSub7result());
            
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
    
    public boolean y4s1business(subs s1) {
        try {

            System.out.println("set result 1");
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "INSERT INTO schoolofbusinesssem1year4 VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("set result 2");
            //pst.setInt(1, sb.getStudentID());//address,gender,faculty,depar,year
            pst.setInt(1, s1.getStid());
            pst.setString(2, s1.getStname());
            pst.setString(3, s1.getSub1());
            pst.setString(4, s1.getSub1lec());
            pst.setInt(5, s1.getSub1credit());
            pst.setInt(6, s1.getSub1amount());
            
            pst.setString(7, s1.getSub2());
            pst.setString(8, s1.getSub2lec());
            pst.setInt(9, s1.getSub2credit());
            pst.setInt(10, s1.getSub2amount());
            
            pst.setString(11, s1.getSub3());
            pst.setString(12, s1.getSub3lec());
            pst.setInt(13, s1.getSub3credit());
            pst.setInt(14, s1.getSub3amount());
            
            pst.setString(15, s1.getSub4());
            pst.setString(16, s1.getSub4lec());
            pst.setInt(17, s1.getSub4credit());
            pst.setInt(18, s1.getSub4amount());
            
            pst.setString(19, s1.getSub5());
            pst.setString(20, s1.getSub5lec());
            pst.setInt(21, s1.getSub5credit());
            pst.setInt(22, s1.getSub5amount());
            
            pst.setString(23, s1.getSub6());
            pst.setString(24, s1.getSub6lec());
            pst.setInt(25, s1.getSub6credit());
            pst.setInt(26, s1.getSub6amount());
            
            pst.setString(27, s1.getSub7());
            pst.setString(28, s1.getSub7lec());
            pst.setInt(29, s1.getSub7credit());
            pst.setInt(30, s1.getSub7amount());
            
            /*pst.setString(31, s1.getSub8());
            pst.setString(32, s1.getSub8lec());
            pst.setInt(33, s1.getSub8credit());
            pst.setInt(34, s1.getSub8amount());*/
            
            pst.setInt(31, s1.getRegid());
            
            pst.setInt(32, s1.getTotalcredit());
            
            pst.setInt(33, s1.getPaymentvalue());
            
            pst.setString(34, s1.getSub1result());
            pst.setString(35, s1.getSub2result());
            pst.setString(36, s1.getSub3result());
            pst.setString(37, s1.getSub4result());
            pst.setString(38, s1.getSub5result());
            pst.setString(39, s1.getSub6result());
            pst.setString(40, s1.getSub7result());
            
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
    
    public boolean y4s2business(subs s1) {
        try {

            System.out.println("set result 1");
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "INSERT INTO schoolofbusinesssem2year4 VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("set result 2");
            //pst.setInt(1, sb.getStudentID());//address,gender,faculty,depar,year
            pst.setInt(1, s1.getStid());
            pst.setString(2, s1.getStname());
            pst.setString(3, s1.getSub1());
            pst.setString(4, s1.getSub1lec());
            pst.setInt(5, s1.getSub1credit());
            pst.setInt(6, s1.getSub1amount());
            
            pst.setString(7, s1.getSub2());
            pst.setString(8, s1.getSub2lec());
            pst.setInt(9, s1.getSub2credit());
            pst.setInt(10, s1.getSub2amount());
            
            pst.setString(11, s1.getSub3());
            pst.setString(12, s1.getSub3lec());
            pst.setInt(13, s1.getSub3credit());
            pst.setInt(14, s1.getSub3amount());
            
            pst.setString(15, s1.getSub4());
            pst.setString(16, s1.getSub4lec());
            pst.setInt(17, s1.getSub4credit());
            pst.setInt(18, s1.getSub4amount());
            
            pst.setString(19, s1.getSub5());
            pst.setString(20, s1.getSub5lec());
            pst.setInt(21, s1.getSub5credit());
            pst.setInt(22, s1.getSub5amount());
            
            pst.setString(23, s1.getSub6());
            pst.setString(24, s1.getSub6lec());
            pst.setInt(25, s1.getSub6credit());
            pst.setInt(26, s1.getSub6amount());
            
            pst.setString(27, s1.getSub7());
            pst.setString(28, s1.getSub7lec());
            pst.setInt(29, s1.getSub7credit());
            pst.setInt(30, s1.getSub7amount());
            
            /*pst.setString(31, s1.getSub8());
            pst.setString(32, s1.getSub8lec());
            pst.setInt(33, s1.getSub8credit());
            pst.setInt(34, s1.getSub8amount());*/
            
            pst.setInt(31, s1.getRegid());
            
            pst.setInt(32, s1.getTotalcredit());
            
            pst.setInt(33, s1.getPaymentvalue());
            
            pst.setString(34, s1.getSub1result());
            pst.setString(35, s1.getSub2result());
            pst.setString(36, s1.getSub3result());
            pst.setString(37, s1.getSub4result());
            pst.setString(38, s1.getSub5result());
            pst.setString(39, s1.getSub6result());
            pst.setString(40, s1.getSub7result());
            
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
}
