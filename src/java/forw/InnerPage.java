package forw;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class InnerPage extends HttpServlet {
    
  @Override
  public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        resp.setContentType("text/html");
        PrintWriter pw = resp.getWriter();
        
        pw.println("<h2 style='color : navy'>InnerPage</h2>");
        pw.println("olivier test ..... ");
        
//        resp.setContentType("image/gif");  		 //MIME type of  images of type   .gif
//        req.getRequestDispatcher("/money.gif").include(req, resp);
   }
}