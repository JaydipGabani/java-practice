import java.sql.*;
import java.util.*;
public class Db {
	public static void main(String[] args) 
	{
		try{
			//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection c=DriverManager.getConnection("jdbc:ucanaccess://C:/Users/Jaydeep/Documents/java2.accdb");
			String q1="insert into t1 values(?,?)";
			PreparedStatement pre=c.prepareStatement(q1);
			Statement s=c.createStatement();
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			while(a!=0)
			{
				a=sc.nextInt();
				pre.setInt(1,a);
				pre.setInt(2,a);
				int su=pre.executeUpdate();
			}
			/*String q="select * from t1";
			s.execute(q);
			ResultSet rs=s.getResultSet();
			while(rs.next())
			{
				System.out.println(rs.getString(1)+" "+rs.getString(2));
			}*/
			String q3="create table t2(num number)";
			//String q4="insert into t1 values(20,20)";
			//String q5="alter table t1 add num number";
			int i=s.executeUpdate(q3);
			//i=s.executeUpdate(q4);
			//i=s.executeUpdate(q5);
			String q2="select Name from t1";
			s.execute(q2);
			ResultSet rs=s.getResultSet();
			while(rs.next())
			{
				System.out.println(rs.getString(1));
			}
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}