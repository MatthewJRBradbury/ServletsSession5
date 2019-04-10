package net.codejava.javaee;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.RequestDispatcher;

@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
   private static final long serialVersionUID = 1L;

   public void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
      request.setAttribute("message","Forwarded to Service2");
      RequestDispatcher dispatcher = request.getRequestDispatcher("Servlet2");
      dispatcher.forward(request, response);
   }
}

