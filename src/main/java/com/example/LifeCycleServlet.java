package com.example;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import javax.servlet.*;
import java.io.*;

public class LifeCycleServlet implements Servlet {
    private static final Logger logger = LogManager.getLogger(MyServlet.class);

    ServletConfig config = null;

    public void init(ServletConfig sc)
    {
        config = sc;
        System.out.println("in init");
    }

    public void service(ServletRequest req, ServletResponse res)
            throws ServletException, IOException
    {
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        pw.println("<h2>hello from life cycle servlet</h2>");
        System.out.println("in service");
    }

    public void destroy()
    {
        System.out.println("in destroy");
    }
    public String getServletInfo()
    {
        return "LifeCycleServlet";
    }
    public ServletConfig getServletConfig() {
        return config;
    }
}
