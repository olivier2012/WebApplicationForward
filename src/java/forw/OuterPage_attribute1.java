package forw;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import static java.lang.Math.random;
import static java.lang.StrictMath.random;
import java.util.GregorianCalendar;

public class OuterPage_attribute1 extends HttpServlet {
    
  @Override
  public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        resp.setContentType("text/html");
        
        PrintWriter pw = resp.getWriter();
        random gen = new random();
        new Integer(gen);
        
        pw.println("<h2>Hello , page OuterPage</h2>");
        req.setAttribute("curDateTime", new GregorianCalendar ());
        req.setAtrribute("red", (int)((new random()).nextInt(255))) );
        req.setAtrribute("green", new random());
        req.setAtrribute("blue", new random());
        
//        resp.flushBuffer();
//pw.close();
        
        RequestDispatcher rd = req.getRequestDispatcher("/innerattribute"); // url-pattern of InnerPage from DD 
//        try {   Thread.sleep(10000);   }
//        catch(InterruptedException e) {  }
        rd.forward(req, resp);
    }
}