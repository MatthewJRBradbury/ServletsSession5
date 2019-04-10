package net.codejava.javaee;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.RequestDispatcher;

@WebServlet("/CsLoginServlet")
public class CsLoginServlet extends HttpServlet {
        private static final long serialVersionUID = 1L;
protected void doPost (HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {

RequestDispatcher dispatcher = request.getRequestDispatcher("Header");
dispatcher.include(request, response);

String userName = request.getParameter("userName");
String password = request.getParameter("password");

dispatcher = request.getRequestDispatcher("Footer");
dispatcher.include(request, response);

if ("admin".equalsIgnoreCase(userName) && "admin".equals(password)){
       // response.sendRedirect("SuccessServlet?user=" + userName);
       request.setAttribute("name", "admin");
       dispatcher = request.getRequestDispatcher("CsSuccessServlet");
       dispatcher.forward(request, response);
} else {
       //dispatcher = request.getRequestDispatcher("CsErrorServlet");
      // dispatcher.forward(request, response);
       response.sendRedirect("CsErrorServlet");
}

}

}

