package forw;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.GregorianCalendar;
import java.util.Random;

public class OuterPage_attribute1 extends HttpServlet {
    
  @Override
  public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        resp.setContentType("text/html");
        
        PrintWriter pw = resp.getWriter();
        Integer resu1 = randInt(0,255);
        Integer resu2 = randInt(0,255);
        Integer resu3 = randInt(0,255);
 
        pw.println("<h2>Hello , page OuterPage</h2>");
        req.setAttribute("curDateTime", new GregorianCalendar ());
        req.setAttribute("red", resu1);
        req.setAttribute("green",resu2);
        req.setAttribute("blue", resu3);
        
//        resp.flushBuffer();
//pw.close();
        
        RequestDispatcher rd = req.getRequestDispatcher("/innerattribute1"); // url-pattern of InnerPage from DD 
//        try {   Thread.sleep(10000);   }
//        catch(InterruptedException e) {  }
        rd.forward(req, resp);
    }
   public static Integer randInt(int min , int max){
     Random rand = null;
     int randomNum = rand.nextInt((max-min)+1)+min;
     return Integer.valueOf(randomNum);
    }
   
}