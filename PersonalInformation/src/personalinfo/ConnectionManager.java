package personalinfo;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionManager {

	static Connection jdbcConnection() throws Exception
	{
		String url="jdbc:mysql://localhost:3306/personal";
		String uname="root";
		String pass="";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		return con;
		
		
	}

}
