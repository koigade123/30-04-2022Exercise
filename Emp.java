
import java.sql.*;

public class Emp 
{
  static final String DB_URL = "jdbc:mysql://localhost/jdbcexercise";
  static final String USER = "root";
  static final String PASS = "Koigade@123";
  static final String QUERY = "SELECT * FROM Employees";

  public static void main(String[] args) 
  {
     // Open a connection
     try(Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(QUERY);) 
     {
        // Extract data from result set
        while (rs.next())
        {
           // Retrieve by column name
           System.out.print("ID: " + rs.getInt("Empid"));
           System.out.print(", Age: " + rs.getInt("age"));
           System.out.print(", First: " + rs.getString("Firstname"));
           System.out.println(", Last: " + rs.getString("Lastname"));
        }
     } catch (SQLException e) 
     {
        e.printStackTrace();
     }
  }
}
