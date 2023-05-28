package com;

import java.io.IOException;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
    private static final long serialVersionUID = 1L;
    public LoginServlet() {
        super();
      
    }
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                // TODO Auto-generated method stub
                
                 Cookie userId = new Cookie("userid", request.getParameter("userid"));
                 response.addCookie(userId);
              response.sendRedirect("dashboard");  
                
        }
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            doGet(request, response);
    }
}
