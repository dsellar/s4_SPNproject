package spn_test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
public class ConnectionManager{
	
    static Connection conn;
 
    public static Connection getConnection()
    {
        try
        {
            String url = "jdbc:mysql://localhost:3306/cs336_s4?";
            String uname = "root";
            String pwd = "rutgerscs336";
 
            Class.forName("com.mysql.jdbc.Driver");
            try
            {
                conn = DriverManager.getConnection(url,uname,pwd);
            }
            catch (SQLException ex)
            {
                ex.printStackTrace();
            }
        }
        catch(ClassNotFoundException e)
        {
            System.out.println(e);
        }
        return conn;
    }
 
}