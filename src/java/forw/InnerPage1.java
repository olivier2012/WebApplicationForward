package forw;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class InnerPage1 extends HttpServlet {
    
  @Override
  public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
      
        resp.setContentType("image/gif");  		 //MIME type of  images of type   .gif
        req.getRequestDispatcher("/img/gif/money.gif").include(req, resp);
   }
}