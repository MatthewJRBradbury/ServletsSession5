package net.codejava.javaee;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/ProfessionalDetails")
public class ProfessionalDetails extends HttpServlet {
        private static final long serialVersionUID = 1L;
        protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstName = request.getParameter("fname");
        String lastName = request.getParameter("lname");
        String userName = request.getParameter("userName");
        PrintWriter out = response.getWriter();
        out.print("<html><head><title>Inbox</title></head><body>");
        out.print("<h1 style='margin-left:40%;'>Professional</h1>");
        out.print("<h2>Professional Details</h2>");
        out.print("<form method='post' action='RegistrationSuccess'>");
        out.print("College Name<input type='text' name='college' />");
        out.print("Equalification<input type='text' name='degree' />");
        out.print("<input type='hidden' name='fname' value='" + firstName + "'/>");
        out.print("<input type='hidden' name='lname' value='" + lastName + "'/>");
        out.print("<input type='hidden' name='userName' value='" + userName + "'/>");
        out.print("<input type='submit' name='register' value='Register'/>");
        out.print("</body></html>");
}
}
