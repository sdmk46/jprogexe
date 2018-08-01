package com.smk;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().write(0);
		System.out.println("you have logged in successfully");
		response.setContentType("text/html");
		try
		{
			//load the jdbc my sql driver
			
			class forName("com.mysql.jdbc.driver");
			Connection con=DriverManager get connection("jdbc:mysql://localhost:3306/demo","root","password");
			prepared statement stmt=con.prepareStatement("select*from user whereid=?");
			stmt.setInt(1,1);
			Resultset rs= stmt.executeQuery();
			while(rs.next())
				response.getWriter().append("<br><h1>welcome</h1>"+rs.getstring.("firstname"));
			con.close();
		}
		catch(Exception.e)
		{System.out.println(e);};
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
