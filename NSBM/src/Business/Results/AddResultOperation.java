package Business.Results;

import java.sql.*;
import java.util.ArrayList;

public class AddResultOperation {

    String url = "jdbc:mysql://localhost:3306/nsbm";
    String username = "root";
    String password = "";
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public boolean addResult(Bresult br) {
        try {
            System.out.println("started adding");
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "INSERT INTO schoolofbusinessresults VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("query created");
            pst.setInt(1, br.getResultid());
            pst.setInt(2, br.getRegid());
            pst.setString(3, br.getStname());
            pst.setInt(4, br.getSemester());
            pst.setInt(5, br.getYear());

            pst.setString(6, br.getSub1());
            pst.setInt(7, br.getSub1mark());
            pst.setString(8, br.getSub1result());

            pst.setString(9, br.getSub2());
            pst.setInt(10, br.getSub2mark());
            pst.setString(11, br.getSub2result());

            pst.setString(12, br.getSub3());
            pst.setInt(13, br.getSub3mark());
            pst.setString(14, br.getSub3result());

            pst.setString(15, br.getSub4());
            pst.setInt(16, br.getSub4mark());
            pst.setString(17, br.getSub4result());

            pst.setString(18, br.getSub5());
            pst.setInt(19, br.getSub5mark());
            pst.setString(20, br.getSub5result());

            pst.setString(21, br.getSub6());
            pst.setInt(22, br.getSub6mark());
            pst.setString(23, br.getSub6result());

            pst.setString(24, br.getSub7());
            pst.setInt(25, br.getSub7mark());
            pst.setString(26, br.getSub7result());

            System.out.println("value loaded to query");

            pst.executeUpdate();

            System.out.println("done...");

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

    public boolean updateStudent(Bresult br) {
        try {
            System.out.println("started updating");
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "UPDATE schoolofbusinessresults VALUES SET resultid="+br.getResultid()+",stname='"+br.getStname()+"',semester="+br.getSemester()+",year="+br.getYear()+",sub1='"+br.getSub1()+"',sub1mark="+br.getSub1mark()+",sub1result='"+br.getSub1result()+"',sub2='"+br.getSub2()+"',sub2mark="+br.getSub2mark()+",sub2result='"+br.getSub2result()+"',sub3='"+br.getSub3()+"',sub3mark="+br.getSub3mark()+",sub3result='"+br.getSub3result()+"',sub4='"+br.getSub4()+"',sub4mark="+br.getSub4mark()+",sub4result='"+br.getSub4result()+"',sub5='"+br.getSub5()+"',sub5mark="+br.getSub5mark()+",sub5result='"+br.getSub5result()+"',sub6='"+br.getSub6()+"',sub6mark="+br.getSub6mark()+",sub6result='"+br.getSub6result()+"',sub7='"+br.getSub7()+"',sub7mark="+br.getSub7mark()+",sub7result='"+br.getSub7result()+"', WHERE regid="+br.getRegid();
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("query created");
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
    
    ArrayList <Bresult> getResult(){
        ArrayList <Bresult> bb=new ArrayList<Bresult>();
        try {
            System.out.println("started updating");
            con = (Connection) DriverManager.getConnection(url, username, password);
            
            
            String query ="SELECT * FROM schoolofbusinessresults";
            System.out.println("query created");
            pst=(com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            rs=pst.executeQuery();
            
            while(rs.next()){
                Bresult br=new Bresult();
                br.setResultid(rs.getInt(1));
                br.setRegid(rs.getInt(2));
                br.setStname(rs.getString(3));
                br.setSemester(rs.getInt(4));
                br.setYear(rs.getInt(5));
                
                br.setSub1(rs.getString(6));
                br.setSub1mark(rs.getInt(7));
                br.setSub1result(rs.getString(8));
                
                br.setSub2(rs.getString(9));
                br.setSub2mark(rs.getInt(10));
                br.setSub2result(rs.getString(11));
                
                br.setSub3(rs.getString(12));
                br.setSub3mark(rs.getInt(13));
                br.setSub3result(rs.getString(14));
                
                br.setSub4(rs.getString(15));
                br.setSub4mark(rs.getInt(16));
                br.setSub4result(rs.getString(17));
                
                br.setSub5(rs.getString(18));
                br.setSub5mark(rs.getInt(19));
                br.setSub5result(rs.getString(20));
                
                br.setSub6(rs.getString(21));
                br.setSub6mark(rs.getInt(22));
                br.setSub6result(rs.getString(23));
                
                br.setSub7(rs.getString(24));
                br.setSub7mark(rs.getInt(25));
                br.setSub7result(rs.getString(26));
                
                bb.add(br);
                
            }
            return bb;

        } catch (Exception e) {
            System.out.println("exeption >>> " + e);
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
