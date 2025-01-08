package database;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Database {

    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:derby:myDb; create=true");
        Statement stm = con.createStatement();
        stm.execute("create table student(name varchar(40), "
                + "idnumber varchar(10) primary key, gpa float)");
        stm.execute("insert into student(name, idnumber, gpa) values('Abebe', 'R/23', 3.8)");
        PreparedStatement ps = con.prepareStatement("insert into student values(?, ?, ?)");
        ps.setString(1, "Alemu");
        ps.setString(2, "R/24");
        ps.setFloat(3, 3.12f);
        ps.executeUpdate();
        ps.setString(1, "Lemma");
        ps.setString(2, "R/25");
        ps.setFloat(3, 3.44f);
        ps.executeUpdate();
        System.out.println("Hello World!");
    }
}