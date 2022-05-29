
package UI;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class databaseConnection {
    static Connection connection()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","");
            return con;
        
    }
    catch(Exception e)
    {
        System.out.println(e);
        return null;
    }
}}
