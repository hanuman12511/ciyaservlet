package pro;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class HomePage extends HttpServlet{
    public void service(HttpServletRequest request,
    HttpServletResponse response)
    throws ServletException, IOException {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
  
   out.println("HomeScreen");
   response.sendRedirect(request.getContextPath() + "/HomeScreen.jsp");
   
  }
  }