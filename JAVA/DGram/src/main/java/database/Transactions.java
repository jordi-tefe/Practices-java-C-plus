package com.mycompany.database;
import java.sql.*;
public class Transactions {
    
    public static void main(String args[]) {
        String sql = "UPDATE student SET gpa = ? WHERE idnumber = ?";
        try(Connection con = DriverManager.getConnection("jdbc:derby:myDb");
                PreparedStatement stmt = con.prepareStatement(sql)){
            con.setAutoCommit(false);
            stmt.setString(2, "R/23");
            stmt.setFloat(1, 4.0f);
            stmt.executeUpdate();
            
            stmt.setString(2, "R/25");
            stmt.setFloat(1, 4.0f);
            stmt.executeUpdate();
            con.commit();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}
