package personalinfo;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class PersonalInfo
 */
@WebServlet("/PersonalInfo")
public class PersonalInfo extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String name=request.getParameter("uname");
	try {
		String query="insert into info values('"+name+"')";
		Connection con=ConnectionManager.jdbcConnection();
		Statement st=con.createStatement();
		st.executeUpdate(query);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
		response.sendRedirect("information.jsp");
	}
}
