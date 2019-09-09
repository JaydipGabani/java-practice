package oracle;
import java.sql.*;
public class Odb {

	public static void main(String[] args) throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
		Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","","");
		String s="create table id1 (Name varchar2)";
		Statement st=con.createStatement();
		st.executeUpdate(s);
	}

}
