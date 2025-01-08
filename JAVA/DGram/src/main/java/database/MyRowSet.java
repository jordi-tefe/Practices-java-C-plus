package com.mycompany.database;
import java.sql.*;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
public class MyRowSet {
    public static void main(String args[]) throws SQLException{
        try (JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet()) {
          // specify JdbcRowSet properties
            rowSet.setUrl("jdbc:derby:myDb");
            //rowSet.setUsername(USERNAME);
            //rowSet.setPassword(PASSWORD);
            rowSet.setCommand("SELECT * FROM student"); // set query
            rowSet.execute(); // execute query
            ResultSetMetaData metaData = rowSet.getMetaData();
            int numberOfColumns = metaData.getColumnCount();
            for (int i = 1; i <= numberOfColumns; i++) 
                System.out.printf("%-8s\t", metaData.getColumnName(i));
            System.out.println();// display each row
            while (rowSet.next()) {
                for (int i = 1; i <= numberOfColumns; i++) {
                    System.out.printf("%-8s\t", rowSet.getObject(i));
                }
                System.out.println();
            }
            rowSet.absolute(2);
            rowSet.updateString(2, "R/244");
            rowSet.updateRow();
            rowSet.moveToInsertRow();
            rowSet.updateString(1, "Markos"); //set name
            rowSet.updateString(2, "R/32"); //set id number
            rowSet.updateFloat(3, 3.23f);//set gpa
            rowSet.insertRow(); //insert the new row into the database
            rowSet.moveToCurrentRow();
            rowSet.beforeFirst();
            System.out.println();// display each row
            while (rowSet.next()) {
                for (int i = 1; i <= numberOfColumns; i++) {
                    System.out.printf("%-8s\t", rowSet.getObject(i));
                }
                System.out.println();
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
