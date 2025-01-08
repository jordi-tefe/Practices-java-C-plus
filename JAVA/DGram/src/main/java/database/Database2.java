
package database;

import java.sql.*;

public class Database2 {

    public static void main(String args[]) throws Exception{
        Connection con = DriverManager.getConnection("jdbc:derby:myDb");
        Statement s = con.createStatement();
        ResultSet rs = s.executeQuery("select * from student");
        //get all rows of the table
        System.out.println("+++++++before updte+++++");
        while(rs.next()){
            System.out.print(rs.getString(1)+ ", ");
            System.out.print(rs.getString(2)+ ", ");
            System.out.println(rs.getFloat(3));
        }
        //Add additional Rows
        PreparedStatement psi = con.prepareStatement("insert into student values(?, ?, ?)");
        psi.setString(1, "Smith");
        psi.setString(2, "R/26");
        psi.setFloat(3, 2.12f);
        psi.executeUpdate();
        psi.setString(1, "John");
        psi.setString(2, "R/27");
        psi.setFloat(3, 3.48f);
        psi.executeUpdate();
        //update some rows of the table
        PreparedStatement psu = con.prepareStatement(
                "update student set name =?, gpa = ? where idnumber = ?");
        psu.setString(1, "Saba");
        psu.setFloat(2, 1.23f);
        psu.setString(3, "R/23");
        psu.executeUpdate();
        psu.setString(1, "Ahmed");
        psu.setFloat(2, 3.28f);
        psu.setString(3, "R/24");
        psu.executeUpdate();
        
        //Get updated table
        System.out.println("====== After updte =======");
        rs = s.executeQuery("select * from student");
        while(rs.next()){
            System.out.print(rs.getString("name")+ ", ");
            System.out.print(rs.getString(2)+ ", ");
            System.out.println(rs.getFloat(3));
        }
    }
}
