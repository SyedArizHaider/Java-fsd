package com;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class PostHandler extends HttpServlet{
    private static final long serialVersionUID = 1L;
    public PostHandler() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

}
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
          PrintWriter out = response.getWriter();
            out.println("<html><body>");
            
            String name = request.getParameter("name");
            String address = request.getParameter("address");
            
            out.println("Name=" + name + "<br>Address=" + address);
            out.println("</body></html>");
}

}
