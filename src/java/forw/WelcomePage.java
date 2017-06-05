package forw;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class WelcomePage extends HttpServlet {
    
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
                
//        getServletName()
        String userFromDD = getServletContext().getInitParameter("user");
        if (!isReqParamCorrect(req,   resp, 
                userFromDD, req.getParameter("user"),
                "Incorrect user name"))
            return;	// if user name is incorrect do not print anything
        
        String pwdFromDD = getServletContext().getInitParameter("pwd");
        if (!isReqParamCorrect(req,   resp, 
                pwdFromDD, req.getParameter("pwd"),
                "Incorrect password"))
            return;        // if password   is incorrect do not print anything
               
        resp.setContentType("text/html");
        PrintWriter pw = resp.getWriter();
        pw.println("<h2 style='color: navy'>Welcome to site, Mr./Mrs. \"" + userFromDD + "\"</h2>");        
    }
    
    private boolean isReqParamCorrect(HttpServletRequest req, HttpServletResponse resp,
            String paramInDD, String paramInReq, String warning) throws ServletException, IOException
    {
        if (paramInReq == null || !paramInDD.equals(paramInReq)){
            req.setAttribute("warning", warning);
            req.getRequestDispatcher("frontPage").forward(req, resp); // redirection to FrontPage
            return false;
        }
    return true; 		
    }
}