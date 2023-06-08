package com11;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.Properties;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/init")
public class JDBCInit extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		 PrintWriter out = response.getWriter();
         out.println("<html><body>");
         
         // Load the DB properties from the config file
         InputStream in = getServletContext().getResourceAsStream("config.properties");
         
         Properties props = new Properties();
         props.load(in);
         
         DBUtil dbutil = new DBUtil(props.getProperty("url"),
        		 props.getProperty("userid"), props.getProperty("password"));
         
//         Connection connections = dbutil.getConnection();
//         out.println("DB Connection initialized success");
//         //dbutil.closeConnection();
//         out.println("DB Connection closed.<br>");
         out.println("</body></html>");
@SuppressWarnings("unused")
Connection connection = dbutil.getConnection();
         out.println("DB Connection initialized successfully!.<br>");
	}
}