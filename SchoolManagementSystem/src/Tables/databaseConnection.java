
package Tables;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Madhu
 */

       public class databaseConnection {
    static Connection connection()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/school", "root", "");
            return con;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return null;
        }
    }
}




    
    

