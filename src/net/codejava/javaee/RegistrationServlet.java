package net.codejava.javaee;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
        private static final long serialVersionUID = 1L;
protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String firstName = request.getParameter("firstName");
String lastName = request.getParameter("lastName");
if (firstName != null && !firstName.isEmpty() && lastName != null && !lastName.isEmpty()){
        PrintWriter out =  response.getWriter();
        out.print("<html><head>");
        out.print("<title>User Entered Datea: </title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<p>" + firstName + "</p>");
	out.print("<p>" + lastName + "</p>");
        out.print("</body>");
        out.print("</head>");

} else {
        response.sendRedirect("Errorservlet");
}

}

}
