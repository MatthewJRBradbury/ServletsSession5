package net.codejava.javaee;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/SuccessServlet")
public class SuccessServlet extends HttpServlet {
    
protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");
        PrintWriter out = response.getWriter();
        out.print("<html><head>");
        out.print("<title>My First Servlet</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<h1>Hi Welcome " + user + "</h1>");
        out.print("</body>");
        out.print("</head>");
    }

} 
