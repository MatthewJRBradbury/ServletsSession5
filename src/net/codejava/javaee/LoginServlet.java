package net.codejava.javaee;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String userName = request.getParameter("userName");
String password = request.getParameter("password");
if ("admin".equalsIgnoreCase(userName) && "admin".equals(password)){
        response.sendRedirect("SuccessServlet?user=" + userName);
} else {
        PrintWriter out = response.getWriter();
        out.print("<html><head>");
        out.print("<title>My First Servlet </title>");
        out.print("</head>");
        out.print("<body>");
        out.print("The Entered Credentials does not match");
        out.print("</body>");
        out.print("</head>");
}

}

}
