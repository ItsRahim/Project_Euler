package dbConnector;

import java.sql.*;

public class dbConnector
{
    Connection dbConn = null;

    public Connection connect()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/project";
            String username = "root";
            String password = "password";

            dbConn = DriverManager.getConnection(url, username, password);
            if(dbConn != null)
            {}
            return dbConn;
        } catch (SQLException | ClassNotFoundException e)
        {
            System.out.println("DB Connection Unsuccessful");
            e.printStackTrace();
        }return null;
    }

    public void closeConn() throws SQLException
    {
        dbConn.close();
        System.out.println("DB Connection Terminated");
    }
}
