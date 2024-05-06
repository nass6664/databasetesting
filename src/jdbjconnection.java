import java.io.IOException;
import java.sql.*;


public class jdbjconnection {

    public static void main(String[] args) throws IOException, SQLException {
    String host ="127.0.0.1";
    String port = "3306";




        // the mode will be the same across all databae connections
        Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/demo","root",
                "@hayati123");
       Statement s = con.createStatement();
       ResultSet rs = s.executeQuery("select * from credentials where scenario='qwrtbbgf'");

      while( rs.next()){
        {
            System.out.println(rs.getString("username"));
            System.out.println(rs.getString("password"));
        }






        //
     //  rs.getString("username");
     //  rs.getString("password");
//3306 onnection URL   //"jdbc:mysql://" + host + ":" + port + "/databasename";

    }
}}
