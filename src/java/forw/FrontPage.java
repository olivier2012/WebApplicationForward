package forw;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class FrontPage extends HttpServlet {
    
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        resp.setContentType("text/html");
        PrintWriter pw = resp.getWriter();
       
        pw.println("<h2 style='color: teal'>FrontPage</h2>");
        String warning = (String)req.getAttribute("warning");  //getAttribute returns Object, here it must be cast to String
        
        pw.println("<form action='welcome'  method='post'>");
        if (warning != null    &&    warning.contains("user")){
            pw.println("<b style='color : red'>" + warning + "</b><br/>");
        }  
        pw.println("<input type='text' name='user' value='enter user name' /><br/><br/>");
        
        if (warning != null     &&    warning.contains("password")){
            pw.println("<b style='color : orange'>" + warning + "</b><br/>");
        }  
        pw.println("<input type='password' name='pwd' value='pwd' /><br/><br/>");
        pw.println("<input type='submit' value='submit' /><br/><br/>");
        pw.println("</form>"); 
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        doGet(req, resp);   // when forward() is called in WelcomePage it redirects to   doPost() of   FrontPage
    }

}