package com.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		{
			String name=request.getParameter("uname");
			String password=request.getParameter("pass");
			String email=request.getParameter("email");
			try {
			String url="jdbc:mysql://localhost:3306/demojdbc";
			String uname="root";
			String pass="";
			String query="insert into user values('"+name+"','"+password+"','"+email+"')";
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,uname,pass);
			Statement st=con.createStatement();
			st.executeUpdate(query);
			System.out.println("Data successfully inserted into the table of database.");
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}}