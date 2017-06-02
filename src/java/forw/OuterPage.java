package forw;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class OuterPage extends HttpServlet {
    
  @Override
  public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        resp.setContentType("text/html");
        
        PrintWriter pw = resp.getWriter();
        
        pw.println("<h2>Hello , page OuterPage</h2>");
//        resp.flushBuffer();
//pw.close();
        
        RequestDispatcher rd = req.getRequestDispatcher("/inner"); // url-pattern of InnerPage from DD 
//        try {   Thread.sleep(10000);   }
//        catch(InterruptedException e) {  }
        rd.forward(req, resp);
    }
}