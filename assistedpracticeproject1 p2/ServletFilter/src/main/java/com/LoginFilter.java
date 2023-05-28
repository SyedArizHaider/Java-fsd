package com;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class LoginFilter implements Filter{
    public LoginFilter() {
    }      
        public void destroy() {                
        }

        public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
            String userId = request.getParameter("userid");

            if( userId != null){
                    chain.doFilter(request, response);
        }           
    }
    public void init(FilterConfig fConfig) throws ServletException {
    }
}