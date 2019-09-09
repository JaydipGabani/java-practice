//package jdbc;
import java.sql.*;
public class Jdbc {
    public static void main(String[] args) {
    try
   {
   Class.forName("com.mysql.jdbc.Driver");
   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
   System.out.println("connection is established");
    String str = " insert into student "  +
                   "(id,name)"+
                   "(?,?)";
   PreparedStatement p = con.prepareStatement(str);
  
   //p.setInt(1,1);
   p.setString(2,"abc");
   p.executeUpdate(str);
   System.out.println("insert sucess fully");
           
        
  
   }
    catch
    (Exception e)
    {
        System.out.println("error");
    }
   }
}
