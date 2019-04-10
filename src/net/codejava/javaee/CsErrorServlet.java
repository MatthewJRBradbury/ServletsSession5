package net.codejava.javaee;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/CsErrorServlet")
public class CsErrorServlet extends HttpServlet {

protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.print("<html><head>");
        out.print("<title>Error: " + request.getAttribute("name") + " </title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<h1>No parameters can be Null (or) empty</h1>");
        out.print("</body>");
        out.print("</head>");
    }

}

