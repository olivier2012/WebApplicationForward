package forw;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class OuterPage1 extends HttpServlet {
    
  @Override
  public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        resp.setContentType("text/html");
        PrintWriter pw = resp.getWriter();
        RequestDispatcher rd = req.getRequestDispatcher("/header.html");
        
        rd.include(req, resp); // url-pattern of InnerPage from DD 
req.getRequestDispatcher("/inner").include(req, resp);
        
       pw.println("<h3>End of OuterPage</h3>");
        rd = req.getRequestDispatcher("/footer.html");
        rd.include(req, resp);
       
    }
}