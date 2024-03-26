package pro;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class Product extends HttpServlet{
    public void service(HttpServletRequest request,
    HttpServletResponse response)
    throws ServletException, IOException {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
  
   out.println("ProductScreen");
  
   response.sendRedirect(request.getContextPath() + "/product.jsp");
  }
  }