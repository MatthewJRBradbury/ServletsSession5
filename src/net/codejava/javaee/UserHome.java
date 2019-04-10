package net.codejava.javaee;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.RequestDispatcher;

@WebServlet("/UserHome")
public class UserHome extends HttpServlet {
   private static final long serialVersionUID = 1L;

   protected void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
      PrintWriter out = response.getWriter();
      out.print("<html><head>");
      out.print("<title>User Home</title><body>");
      RequestDispatcher dispatcher = request.getRequestDispatcher("WelcomeMessage");
      request.setAttribute("name", "Arun");
      dispatcher.include(request,response);
      out.print("<h2 Style='color:green; margin-left:50%; margin-top:20%'>This is the User home</h2>");
      dispatcher = request.getRequestDispatcher("Footer");
      dispatcher.include(request, response);
      out.print("</body></html>");
   }
}

