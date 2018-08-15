package Business.Results;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Loadtableoperation {

    String url = "jdbc:mysql://localhost:3306/nsbm";
    String username = "root";
    String password = "";
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    ArrayList<BSubjects> getsubjects11() {
        try {
            
            ArrayList<BSubjects> list=new ArrayList<BSubjects>();
            
            System.out.println("started getting");
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM schoolofbusinesssem1year1";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("query created");
            
            rs=pst.executeQuery();
            
            while(rs.next()){
                BSubjects bs=new BSubjects();
                bs.setStid(rs.getInt(1));
                bs.setStname(rs.getString(2));
                bs.setSub1(rs.getString(3));
                bs.setSub1lec(rs.getString(4));
                bs.setSub1credit(rs.getInt(5));
                bs.setSub1amount(rs.getInt(6));
                
                bs.setSub2(rs.getString(7));
                bs.setSub2lec(rs.getString(8));
                bs.setSub2credit(rs.getInt(9));
                bs.setSub2amount(rs.getInt(10));
                
                bs.setSub3(rs.getString(11));
                bs.setSub3lec(rs.getString(12));
                bs.setSub3credit(rs.getInt(13));
                bs.setSub3amount(rs.getInt(14));
                
                bs.setSub4(rs.getString(15));
                bs.setSub4lec(rs.getString(16));
                bs.setSub4credit(rs.getInt(17));
                bs.setSub4amount(rs.getInt(18));
                
                bs.setSub5(rs.getString(19));
                bs.setSub5lec(rs.getString(20));
                bs.setSub5credit(rs.getInt(21));
                bs.setSub5amount(rs.getInt(22));
                
                bs.setSub6(rs.getString(23));
                bs.setSub6lec(rs.getString(24));
                bs.setSub6credit(rs.getInt(25));
                bs.setSub6amount(rs.getInt(26));
                
                bs.setSub7(rs.getString(27));
                bs.setSub7lec(rs.getString(28));
                bs.setSub7credit(rs.getInt(29));
                bs.setSub7amount(rs.getInt(30));
                
                bs.setRegid(rs.getInt(31));
                bs.setTotalcredit(rs.getInt(32));
                bs.setPaymentvalue(rs.getInt(33));
                
                bs.setSub1result(rs.getString(34));
                bs.setSub2result(rs.getString(35));
                bs.setSub3result(rs.getString(36));
                bs.setSub4result(rs.getString(37));
                bs.setSub5result(rs.getString(38));
                bs.setSub6result(rs.getString(39));
                bs.setSub7result(rs.getString(40));
                
                list.add(bs);
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
    
    ArrayList<BSubjects> getsubjects12() {
        try {
            
            ArrayList<BSubjects> list=new ArrayList<BSubjects>();
            
            System.out.println("started getting");
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM schoolofbusinesssem2year1";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("query created");
            
            rs=pst.executeQuery();
            
            while(rs.next()){
                BSubjects bs=new BSubjects();
                bs.setStid(rs.getInt(1));
                bs.setStname(rs.getString(2));
                bs.setSub1(rs.getString(3));
                bs.setSub1lec(rs.getString(4));
                bs.setSub1credit(rs.getInt(5));
                bs.setSub1amount(rs.getInt(6));
                
                bs.setSub2(rs.getString(7));
                bs.setSub2lec(rs.getString(8));
                bs.setSub2credit(rs.getInt(9));
                bs.setSub2amount(rs.getInt(10));
                
                bs.setSub3(rs.getString(11));
                bs.setSub3lec(rs.getString(12));
                bs.setSub3credit(rs.getInt(13));
                bs.setSub3amount(rs.getInt(14));
                
                bs.setSub4(rs.getString(15));
                bs.setSub4lec(rs.getString(16));
                bs.setSub4credit(rs.getInt(17));
                bs.setSub4amount(rs.getInt(18));
                
                bs.setSub5(rs.getString(19));
                bs.setSub5lec(rs.getString(20));
                bs.setSub5credit(rs.getInt(21));
                bs.setSub5amount(rs.getInt(22));
                
                bs.setSub6(rs.getString(23));
                bs.setSub6lec(rs.getString(24));
                bs.setSub6credit(rs.getInt(25));
                bs.setSub6amount(rs.getInt(26));
                
                bs.setSub7(rs.getString(27));
                bs.setSub7lec(rs.getString(28));
                bs.setSub7credit(rs.getInt(29));
                bs.setSub7amount(rs.getInt(30));
                
                bs.setRegid(rs.getInt(31));
                bs.setTotalcredit(rs.getInt(32));
                bs.setPaymentvalue(rs.getInt(33));
                
                bs.setSub1result(rs.getString(34));
                bs.setSub2result(rs.getString(35));
                bs.setSub3result(rs.getString(36));
                bs.setSub4result(rs.getString(37));
                bs.setSub5result(rs.getString(38));
                bs.setSub6result(rs.getString(39));
                bs.setSub7result(rs.getString(40));
                
                list.add(bs);
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
    
    ArrayList<BSubjects> getsubjects21() {
        try {
            
            ArrayList<BSubjects> list=new ArrayList<BSubjects>();
            
            System.out.println("started getting");
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM schoolofbusinesssem1year2";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("query created");
            
            rs=pst.executeQuery();
            
            while(rs.next()){
                BSubjects bs=new BSubjects();
                bs.setStid(rs.getInt(1));
                bs.setStname(rs.getString(2));
                bs.setSub1(rs.getString(3));
                bs.setSub1lec(rs.getString(4));
                bs.setSub1credit(rs.getInt(5));
                bs.setSub1amount(rs.getInt(6));
                
                bs.setSub2(rs.getString(7));
                bs.setSub2lec(rs.getString(8));
                bs.setSub2credit(rs.getInt(9));
                bs.setSub2amount(rs.getInt(10));
                
                bs.setSub3(rs.getString(11));
                bs.setSub3lec(rs.getString(12));
                bs.setSub3credit(rs.getInt(13));
                bs.setSub3amount(rs.getInt(14));
                
                bs.setSub4(rs.getString(15));
                bs.setSub4lec(rs.getString(16));
                bs.setSub4credit(rs.getInt(17));
                bs.setSub4amount(rs.getInt(18));
                
                bs.setSub5(rs.getString(19));
                bs.setSub5lec(rs.getString(20));
                bs.setSub5credit(rs.getInt(21));
                bs.setSub5amount(rs.getInt(22));
                
                bs.setSub6(rs.getString(23));
                bs.setSub6lec(rs.getString(24));
                bs.setSub6credit(rs.getInt(25));
                bs.setSub6amount(rs.getInt(26));
                
                bs.setSub7(rs.getString(27));
                bs.setSub7lec(rs.getString(28));
                bs.setSub7credit(rs.getInt(29));
                bs.setSub7amount(rs.getInt(30));
                
                bs.setRegid(rs.getInt(31));
                bs.setTotalcredit(rs.getInt(32));
                bs.setPaymentvalue(rs.getInt(33));
                
                bs.setSub1result(rs.getString(34));
                bs.setSub2result(rs.getString(35));
                bs.setSub3result(rs.getString(36));
                bs.setSub4result(rs.getString(37));
                bs.setSub5result(rs.getString(38));
                bs.setSub6result(rs.getString(39));
                bs.setSub7result(rs.getString(40));
                
                list.add(bs);
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
    
    ArrayList<BSubjects> getsubjects22() {
        try {
            
            ArrayList<BSubjects> list=new ArrayList<BSubjects>();
            
            System.out.println("started getting");
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM schoolofbusinesssem2year2";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("query created");
            
            rs=pst.executeQuery();
            
            while(rs.next()){
                BSubjects bs=new BSubjects();
                bs.setStid(rs.getInt(1));
                bs.setStname(rs.getString(2));
                bs.setSub1(rs.getString(3));
                bs.setSub1lec(rs.getString(4));
                bs.setSub1credit(rs.getInt(5));
                bs.setSub1amount(rs.getInt(6));
                
                bs.setSub2(rs.getString(7));
                bs.setSub2lec(rs.getString(8));
                bs.setSub2credit(rs.getInt(9));
                bs.setSub2amount(rs.getInt(10));
                
                bs.setSub3(rs.getString(11));
                bs.setSub3lec(rs.getString(12));
                bs.setSub3credit(rs.getInt(13));
                bs.setSub3amount(rs.getInt(14));
                
                bs.setSub4(rs.getString(15));
                bs.setSub4lec(rs.getString(16));
                bs.setSub4credit(rs.getInt(17));
                bs.setSub4amount(rs.getInt(18));
                
                bs.setSub5(rs.getString(19));
                bs.setSub5lec(rs.getString(20));
                bs.setSub5credit(rs.getInt(21));
                bs.setSub5amount(rs.getInt(22));
                
                bs.setSub6(rs.getString(23));
                bs.setSub6lec(rs.getString(24));
                bs.setSub6credit(rs.getInt(25));
                bs.setSub6amount(rs.getInt(26));
                
                bs.setSub7(rs.getString(27));
                bs.setSub7lec(rs.getString(28));
                bs.setSub7credit(rs.getInt(29));
                bs.setSub7amount(rs.getInt(30));
                
                bs.setRegid(rs.getInt(31));
                bs.setTotalcredit(rs.getInt(32));
                bs.setPaymentvalue(rs.getInt(33));
                
                bs.setSub1result(rs.getString(34));
                bs.setSub2result(rs.getString(35));
                bs.setSub3result(rs.getString(36));
                bs.setSub4result(rs.getString(37));
                bs.setSub5result(rs.getString(38));
                bs.setSub6result(rs.getString(39));
                bs.setSub7result(rs.getString(40));
                
                list.add(bs);
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
    
    ArrayList<BSubjects> getsubjects31() {
        try {
            
            ArrayList<BSubjects> list=new ArrayList<BSubjects>();
            
            System.out.println("started getting");
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM schoolofbusinesssem1year3";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("query created");
            
            rs=pst.executeQuery();
            
            while(rs.next()){
                BSubjects bs=new BSubjects();
                bs.setStid(rs.getInt(1));
                bs.setStname(rs.getString(2));
                bs.setSub1(rs.getString(3));
                bs.setSub1lec(rs.getString(4));
                bs.setSub1credit(rs.getInt(5));
                bs.setSub1amount(rs.getInt(6));
                
                bs.setSub2(rs.getString(7));
                bs.setSub2lec(rs.getString(8));
                bs.setSub2credit(rs.getInt(9));
                bs.setSub2amount(rs.getInt(10));
                
                bs.setSub3(rs.getString(11));
                bs.setSub3lec(rs.getString(12));
                bs.setSub3credit(rs.getInt(13));
                bs.setSub3amount(rs.getInt(14));
                
                bs.setSub4(rs.getString(15));
                bs.setSub4lec(rs.getString(16));
                bs.setSub4credit(rs.getInt(17));
                bs.setSub4amount(rs.getInt(18));
                
                bs.setSub5(rs.getString(19));
                bs.setSub5lec(rs.getString(20));
                bs.setSub5credit(rs.getInt(21));
                bs.setSub5amount(rs.getInt(22));
                
                bs.setSub6(rs.getString(23));
                bs.setSub6lec(rs.getString(24));
                bs.setSub6credit(rs.getInt(25));
                bs.setSub6amount(rs.getInt(26));
                
                bs.setSub7(rs.getString(27));
                bs.setSub7lec(rs.getString(28));
                bs.setSub7credit(rs.getInt(29));
                bs.setSub7amount(rs.getInt(30));
                
                bs.setRegid(rs.getInt(31));
                bs.setTotalcredit(rs.getInt(32));
                bs.setPaymentvalue(rs.getInt(33));
                
                bs.setSub1result(rs.getString(34));
                bs.setSub2result(rs.getString(35));
                bs.setSub3result(rs.getString(36));
                bs.setSub4result(rs.getString(37));
                bs.setSub5result(rs.getString(38));
                bs.setSub6result(rs.getString(39));
                bs.setSub7result(rs.getString(40));
                
                list.add(bs);
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
    
    ArrayList<BSubjects> getsubjects32() {
        try {
            
            ArrayList<BSubjects> list=new ArrayList<BSubjects>();
            
            System.out.println("started getting");
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM schoolofbusinesssem2year3";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("query created");
            
            rs=pst.executeQuery();
            
            while(rs.next()){
                BSubjects bs=new BSubjects();
                bs.setStid(rs.getInt(1));
                bs.setStname(rs.getString(2));
                bs.setSub1(rs.getString(3));
                bs.setSub1lec(rs.getString(4));
                bs.setSub1credit(rs.getInt(5));
                bs.setSub1amount(rs.getInt(6));
                
                bs.setSub2(rs.getString(7));
                bs.setSub2lec(rs.getString(8));
                bs.setSub2credit(rs.getInt(9));
                bs.setSub2amount(rs.getInt(10));
                
                bs.setSub3(rs.getString(11));
                bs.setSub3lec(rs.getString(12));
                bs.setSub3credit(rs.getInt(13));
                bs.setSub3amount(rs.getInt(14));
                
                bs.setSub4(rs.getString(15));
                bs.setSub4lec(rs.getString(16));
                bs.setSub4credit(rs.getInt(17));
                bs.setSub4amount(rs.getInt(18));
                
                bs.setSub5(rs.getString(19));
                bs.setSub5lec(rs.getString(20));
                bs.setSub5credit(rs.getInt(21));
                bs.setSub5amount(rs.getInt(22));
                
                bs.setSub6(rs.getString(23));
                bs.setSub6lec(rs.getString(24));
                bs.setSub6credit(rs.getInt(25));
                bs.setSub6amount(rs.getInt(26));
                
                bs.setSub7(rs.getString(27));
                bs.setSub7lec(rs.getString(28));
                bs.setSub7credit(rs.getInt(29));
                bs.setSub7amount(rs.getInt(30));
                
                bs.setRegid(rs.getInt(31));
                bs.setTotalcredit(rs.getInt(32));
                bs.setPaymentvalue(rs.getInt(33));
                
                bs.setSub1result(rs.getString(34));
                bs.setSub2result(rs.getString(35));
                bs.setSub3result(rs.getString(36));
                bs.setSub4result(rs.getString(37));
                bs.setSub5result(rs.getString(38));
                bs.setSub6result(rs.getString(39));
                bs.setSub7result(rs.getString(40));
                
                list.add(bs);
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
    
    ArrayList<BSubjects> getsubjects41() {
        try {
            
            ArrayList<BSubjects> list=new ArrayList<BSubjects>();
            
            System.out.println("started getting");
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM schoolofbusinesssem1year4";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("query created");
            
            rs=pst.executeQuery();
            
            while(rs.next()){
                BSubjects bs=new BSubjects();
                bs.setStid(rs.getInt(1));
                bs.setStname(rs.getString(2));
                bs.setSub1(rs.getString(3));
                bs.setSub1lec(rs.getString(4));
                bs.setSub1credit(rs.getInt(5));
                bs.setSub1amount(rs.getInt(6));
                
                bs.setSub2(rs.getString(7));
                bs.setSub2lec(rs.getString(8));
                bs.setSub2credit(rs.getInt(9));
                bs.setSub2amount(rs.getInt(10));
                
                bs.setSub3(rs.getString(11));
                bs.setSub3lec(rs.getString(12));
                bs.setSub3credit(rs.getInt(13));
                bs.setSub3amount(rs.getInt(14));
                
                bs.setSub4(rs.getString(15));
                bs.setSub4lec(rs.getString(16));
                bs.setSub4credit(rs.getInt(17));
                bs.setSub4amount(rs.getInt(18));
                
                bs.setSub5(rs.getString(19));
                bs.setSub5lec(rs.getString(20));
                bs.setSub5credit(rs.getInt(21));
                bs.setSub5amount(rs.getInt(22));
                
                bs.setSub6(rs.getString(23));
                bs.setSub6lec(rs.getString(24));
                bs.setSub6credit(rs.getInt(25));
                bs.setSub6amount(rs.getInt(26));
                
                bs.setSub7(rs.getString(27));
                bs.setSub7lec(rs.getString(28));
                bs.setSub7credit(rs.getInt(29));
                bs.setSub7amount(rs.getInt(30));
                
                bs.setRegid(rs.getInt(31));
                bs.setTotalcredit(rs.getInt(32));
                bs.setPaymentvalue(rs.getInt(33));
                
                bs.setSub1result(rs.getString(34));
                bs.setSub2result(rs.getString(35));
                bs.setSub3result(rs.getString(36));
                bs.setSub4result(rs.getString(37));
                bs.setSub5result(rs.getString(38));
                bs.setSub6result(rs.getString(39));
                bs.setSub7result(rs.getString(40));
                
                list.add(bs);
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
    
    ArrayList<BSubjects> getsubjects42() {
        try {
            
            ArrayList<BSubjects> list=new ArrayList<BSubjects>();
            
            System.out.println("started getting");
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM schoolofbusinesssem2year4";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("query created");
            
            rs=pst.executeQuery();
            
            while(rs.next()){
                BSubjects bs=new BSubjects();
                bs.setStid(rs.getInt(1));
                bs.setStname(rs.getString(2));
                bs.setSub1(rs.getString(3));
                bs.setSub1lec(rs.getString(4));
                bs.setSub1credit(rs.getInt(5));
                bs.setSub1amount(rs.getInt(6));
                
                bs.setSub2(rs.getString(7));
                bs.setSub2lec(rs.getString(8));
                bs.setSub2credit(rs.getInt(9));
                bs.setSub2amount(rs.getInt(10));
                
                bs.setSub3(rs.getString(11));
                bs.setSub3lec(rs.getString(12));
                bs.setSub3credit(rs.getInt(13));
                bs.setSub3amount(rs.getInt(14));
                
                bs.setSub4(rs.getString(15));
                bs.setSub4lec(rs.getString(16));
                bs.setSub4credit(rs.getInt(17));
                bs.setSub4amount(rs.getInt(18));
                
                bs.setSub5(rs.getString(19));
                bs.setSub5lec(rs.getString(20));
                bs.setSub5credit(rs.getInt(21));
                bs.setSub5amount(rs.getInt(22));
                
                bs.setSub6(rs.getString(23));
                bs.setSub6lec(rs.getString(24));
                bs.setSub6credit(rs.getInt(25));
                bs.setSub6amount(rs.getInt(26));
                
                bs.setSub7(rs.getString(27));
                bs.setSub7lec(rs.getString(28));
                bs.setSub7credit(rs.getInt(29));
                bs.setSub7amount(rs.getInt(30));
                
                bs.setRegid(rs.getInt(31));
                bs.setTotalcredit(rs.getInt(32));
                bs.setPaymentvalue(rs.getInt(33));
                
                bs.setSub1result(rs.getString(34));
                bs.setSub2result(rs.getString(35));
                bs.setSub3result(rs.getString(36));
                bs.setSub4result(rs.getString(37));
                bs.setSub5result(rs.getString(38));
                bs.setSub6result(rs.getString(39));
                bs.setSub7result(rs.getString(40));
                
                list.add(bs);
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
