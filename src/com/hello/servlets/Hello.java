package com.hello.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by jdann on 12/22/2015.
 */
@WebServlet(name = "/hw")
public class Hello extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter out = response.getWriter();

        double sqrtVal = Math.sqrt(4.0);

        out.println("<html cool><body><h1 align='center'>Hello World Servlet</h1>"
                + "<br>The square root of 4.0 is: " + sqrtVal + "<br></body></html>");


    }
}
