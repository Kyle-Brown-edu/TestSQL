import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcMySQLVersion {

    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://216.137.177.30:3306/testDB?allowPublicKeyRetrieval=true&useSSL=false";
        String user = "team3";
        String password = "UpdateTrello!1";
        String sql = "";
        String query = "SELECT VERSION()";
        sql = "select * from users";

        Connection con = DriverManager.getConnection(url, user, password);
            Statement st = con.createStatement();
            
            var result = st.executeQuery(sql); 
            while(result.next()){
                System.out.println(result.getString("full_names"));
            }
            
            


            
    
        } 
    }

