package net.codejava.javaee;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.RequestDispatcher;
import java.util.Calendar;
import java.util.GregorianCalendar;

@WebServlet("/CurrentDate")
public class CurrentDate extends HttpServlet {
   private static final long serialVersionUID = 1L;

   protected void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
      Calendar calendar = new GregorianCalendar();
      String date = calendar.getTime().toString();
      String message = "Current Date is " + date;
      request.setAttribute("message",message);
      RequestDispatcher dispatcher = request.getRequestDispatcher("DisplayServlet");
      dispatcher.forward(request, response);
   }
}

