package com.example;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;


public class MyServlet extends HttpServlet {
//    private static final Logger logger = LogManager.getLogger(MyServlet.class);
    static final Logger logger = LogManager.getLogger(MyServlet.class);
    private String message;
    public void init() throws ServletException {
        message = "hola welcome";
        logger.info("this is info logger in MyServlet init()");
        logger.debug("this is info logger in MyServlet init()");
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html><body><h2>Hello, Servlet!</h2></body></html>");
        logger.debug("this is info logger in MyServlet doGet()");

    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        logger.debug("this is info logger in MyServlet doPost()");
        logger.info("myservlet doPost() info log");
        logger.error("myservlet doPost() info log");
        logger.warn("myservlet doPost() info log");
        logger.trace("myservlet doPost() info log");
        logger.fatal("myservlet doPost() info log");

        String name = request.getParameter("name");
        String email = request.getParameter("email");

        User newUser = new User(name, email);
        UserList.addUser(newUser);

        response.sendRedirect("userList.jsp");
    }
}