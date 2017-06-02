package forw;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class SendRedirect2 extends HttpServlet {    
  @Override
  public void doGet(HttpServletRequest req, HttpServletResponse resp)  throws ServletException, IOException  {
        if (req.getParameter("externSite") == null){
          resp.setContentType("text/html");
          PrintWriter pw = resp.getWriter();
          pw.println("<h3>no URL for redirection</h3>");
          pw.println("<input type='button'  value='CNN'  onclick='window.location=\"http://www.cnn.com\"'  />");
     }
   } 
}