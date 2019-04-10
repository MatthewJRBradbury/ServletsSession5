package net.codejava.javaee;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/InboxServlet")

public class InboxServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        String userName=request.getParameter("user");
        String location=request.getParameter("location");
        PrintWriter out=response.getWriter();
        out.print("<html><head><title>Inbox</title></head><body>");
        out.print("<h1 style='margin-left:40%;'>Inbox</h1>");
        out.print("<h2>Welcome "+ userName + "</h2>");
        out.print("<h2>Location "+ location + "</h2>");
        out.print("<a href='SentItems?user=" + userName + "&location="+ location + "'/>Sent Items</a>");
        out.print("</body></html>");
    }
}
