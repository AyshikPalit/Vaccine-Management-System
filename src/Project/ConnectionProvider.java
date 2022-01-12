package Project;
import java.sql.*;
/**
 *
 * @author Ayshik
 */
public class ConnectionProvider {
    
    public static Connection getCon()
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vms","root","Soumen7@");
            return con;
        }
        catch(Exception e)
        {
            return null;
        }
    }
}
