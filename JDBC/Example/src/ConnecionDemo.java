import java.sql.*;

import static java.lang.Class.forName;

//import packages
public class ConnecionDemo {
    public static void main(String[] args) throws Exception{
        String url = "jdbc:mysql://localhost:3306/vasantha";
        String password = "root";
        String usernme = "root";
        String query = "select * from student" ;
        // load driver class
        Class.forName("com.mysql.cj.jdbc.Driver");
        //establish connection
        Connection con = DriverManager.getConnection( url,usernme, password);

        System.out.println("connection established Successfully");
        //create statement
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next()) {
            System.out.println(
                    rs.getInt(1) + " " +
                            rs.getString(2)
            );
        }

        stmt.close();
        con.close();
        System.out.println("connections are closed");

    }

}
