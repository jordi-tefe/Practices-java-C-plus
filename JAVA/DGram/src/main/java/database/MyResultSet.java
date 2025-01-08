
package database;

import java.sql.*;

public class MyResultSet {
    public static void main(String args[]){
        String url = "jdbc:derby:myDb";
        try(Connection con = DriverManager.getConnection(url);
        Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, 
                ResultSet.CONCUR_UPDATABLE)){
            ResultSet rs = stmt.executeQuery("SELECT * from student");
            DatabaseMetaData dbmd = con.getMetaData();
            System.out.println(dbmd.supportsResultSetConcurrency(
                ResultSet.TYPE_SCROLL_INSENSITIVE, 
                ResultSet.CONCUR_UPDATABLE));
            ResultSetMetaData mdata = rs.getMetaData();
            
            for(int i=1;i<=mdata.getColumnCount();i++)
                System.out.print(mdata.getColumnName(i)+ "\t");
            System.out.println();
            rs.afterLast();
            while(rs.previous()){
                System.out.print(rs.getString("name")+ "\t");
                System.out.print(rs.getString("idnumber")+ "\t");
                System.out.println(rs.getFloat("gpa"));
            }
            rs.absolute(2);//update the second column of the second row
            rs.updateString(2, "R/244");
            rs.updateRow();
            
            rs.moveToInsertRow();
            rs.updateString("name", "Markos"); //set name
            rs.updateString("idnumber", "R/31"); //set id number
            rs.updateFloat("gpa", 3.23f);//set gpa
            rs.insertRow(); //insert the new row into the database
            rs.moveToCurrentRow();//take the cursor back to the row we
            
            System.out.println("After modification ++++");
            rs.beforeFirst();
            while(rs.next()){
                System.out.print(rs.getString("name")+ "\t");
                System.out.print(rs.getString("idnumber")+ "\t");
                System.out.println(rs.getFloat("gpa"));
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}