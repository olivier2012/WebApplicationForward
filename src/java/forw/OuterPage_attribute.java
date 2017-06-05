package forw;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.GregorianCalendar;

public class OuterPage_attribute extends HttpServlet {
    
  @Override
  public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        resp.setContentType("text/html");
        
        PrintWriter pw = resp.getWriter();
        
        pw.println("<h2>Hello , page OuterPage</h2>");
        req.setAttribute("curDateTime", new GregorianCalendar ());
        
//        resp.flushBuffer();
//pw.close();
        
        RequestDispatcher rd = req.getRequestDispatcher("/innerattribute"); // url-pattern of InnerPage from DD 
//        try {   Thread.sleep(10000);   }
//        catch(InterruptedException e) {  }
        rd.forward(req, resp);
    }
}