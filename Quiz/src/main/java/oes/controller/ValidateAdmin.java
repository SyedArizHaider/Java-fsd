package oes.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
//Importing lib
import java.io.PrintWriter;
//Importing other Java files
import oes.db.Admins;
import oes.model.AdminsDao;

@WebServlet("/oes.controller.ValidateAdmin")
public class ValidateAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
     public ValidateAdmin() {
     super();
     }
     protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		String username = request.getParameter("uname");
		String password = request.getParameter("pass");



		Admins ad = new Admins(); // Creating object
		ad.setUsername(username);
		ad.setPassword(password);

	    boolean status = AdminsDao.doValidate(ad);

	    if(status)
	    {

	    	//Logged in  as admin do something (pending)
	    	 HttpSession session = request.getSession();
			 session.setAttribute("username", ad.getUsername());
			 response.sendRedirect("AdminPanel.jsp");
	    }
	    else
	    {
	    	String msg2 = "Invalid Username or Password";
	    	response.sendRedirect("AdminLogin.jsp?msg2="+msg2);
	    }


	}

}