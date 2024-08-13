package hotel.management.system;

import java.sql.*;

public class conn {

    Connection c;
    Statement s;

    public conn() {
        try {

            Class.forName("conn.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/projecthms","root","750553");
            s = c.createStatement();

        } catch (ClassNotFoundException | SQLException e) {
        }
    }

    public static void main(String[] args) {

    }
}
