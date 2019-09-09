//package oracle;
import java.sql.*;
public class Sdb {
    public static void main(String[] args) {
    try
   {
   Class.forName("com.mysql.jdbc.Driver");
   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:9999/test","root","");
   System.out.println("connection is established");
   String str = " INSERT INTO student VALUES (?, ?)";   
   PreparedStatement p = con.prepareStatement(str);
   p.setInt(1,107);
   p.setString(2,"abc");
   p.executeUpdate();
   //String s1="INSERT INTO student VALUES (104,'jay')";
   String s="select * from student";
   Statement st=con.createStatement();
   //st.executeUpdate(s1);
   st.execute(s);
   ResultSet rs=st.getResultSet();
   while(rs.next())
   {
	   System.out.println(rs.getInt(1)+" "+rs.getString(2));
   }
  
   }
    catch
    (Exception e)
    {
        System.out.println(e);
    }
   }
}
