package forw;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.GregorianCalendar;
public class InnerPage_attribute extends HttpServlet {
    
  @Override
  public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        resp.setContentType("text/html");
        PrintWriter pw = resp.getWriter();
          GregorianCalendar gc = (GregorianCalendar) req.getAttribute("curDateTime");
        pw.println("<h2 style='color : navy'>InnerPage</h2>");
        String s = String.format("%TY %TA %TB %Td %Tj", gc, gc, gc, gc, gc);
        pw.println("olivier test ..... " + s);
//        pw.println("<br><hr>" +  );
        
//        resp.setContentType("image/gif");  		 //MIME type of  images of type   .gif
//        req.getRequestDispatcher("/money.gif").include(req, resp);
   }
}