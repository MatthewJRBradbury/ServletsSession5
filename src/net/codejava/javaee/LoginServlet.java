package net.codejava.javaee;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        String username=request.getParameter("username");
        String password=request.getParameter("pass");
        String location=request.getParameter("location");
        if("jack".equals(username)&& "rose".equalsIgnoreCase(password))
        {
           // response.sendRedirect("InboxServlet?user="+username+"&location="+location);
            Cookie cookie1 = new Cookie("user", username);
            Cookie cookie2 = new Cookie("location", location);
            response.addCookie(cookie1);
            response.addCookie(cookie2);
            response.sendRedirect("InboxServlet");
        }
    }
}
