package forw;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class SendRedirect extends HttpServlet {    
  @Override
  public void doGet(HttpServletRequest req, HttpServletResponse resp)  throws ServletException, IOException  {
        resp.sendRedirect("inner");    // path WITHOUT /   means current application. "inner" is servlet name
   } 
}