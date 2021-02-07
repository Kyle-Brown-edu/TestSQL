import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class JdbcMySQLVersion {

    public static void main(String[] args) throws SQLException {

        // for further information look at: 
        // this .jar file that allows you to use the connector is included with 
        // this repo, you can just use that or go download it from the website
    
        // the connection URL = :// [IP/Domain]:[Port]/[databaseName]? extras that are optional; 
        String url = "jdbc:mysql://216.137.177.30:3306/testDB?allowPublicKeyRetrieval=true&useSSL=false";
       
        // this is a username and password set in the mysql shell
        String user = "team3";
        String password = "UpdateTrello!1";
       
        // these strings are for SQL statements, you write them in a string and then 
        // call executeQuery(SQL_STATEMENT)
        String sql = "";
        String query = "SELECT VERSION()";
       
        // I am using this one so I can see the two names in our users table. 
        sql = "select * from users";

        // you create a connection object to connect to server
        Connection con = DriverManager.getConnection(url, user, password);
        Statement st = con.createStatement();
            
        // you get back a result from executing a query what is in it depends on 
        // what commands you called
        // there is also execute() but that is for creating entries and tables
        // executequery() is for reading and retrieving.
            var result = st.executeQuery(sql); 
            System.out.println("\nusers in DB are: ");
            while(result.next()){
                System.out.println(result.getString("full_names"));
            }
        } 
    }

