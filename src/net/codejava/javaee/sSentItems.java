package net.codejava.javaee;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpSession;

@WebServlet("/sSentItems")
public class sSentItems extends HttpServlet {
    private static final long serialVersionUID = 1L;
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        String userName= null;
        String location= null;
	
	HttpSession session = request.getSession();
        if (session.getAttribute("user") == null) {
	    response.sendRedirect("login.html");
	} else {
	    userName = session.getAttribute("user").toString();
	    location = session.getAttribute("location").toString();
	}

        PrintWriter out=response.getWriter();
        out.print("<html><head><title>Sent Items</title></head><body>");
        out.print("<h1 style='margin-left:40%;'>Inbox</h1>");
        out.print("<h2>Welcome "+ userName + "</h2>");
        out.print("<h2>Location "+ location + "</h2>");
        out.print("<a href='sInboxServlet'/>Inbox</a>");
	out.print("<br/>");
	out.print("<a href='Logout'/>Log Out</a>");
        out.print("</body></html>");
    }
}
