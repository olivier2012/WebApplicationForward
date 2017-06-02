package forw;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class SalaryAnalyzer extends HttpServlet {
    
  @Override
  public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        
        
        String whatToRead = getInitParameter("whatToRead");
        String reqPar = req.getParameter(whatToRead);
        try{
        if (reqPar == null){
            resp.setContentType("text/html");
            PrintWriter pw = resp.getWriter();
            pw.println("<b style='color:red'>no \"Salary\" parameter ! </b>");
            return;
         }
        else{
         int val = Integer.parseInt(reqPar);
         if (val>1000){
             resp.setContentType("image/gif");
             req.getRequestDispatcher("/img/gif/congrats.gif").forward(req,resp);
         }else{
                  resp.setContentType("image/gif");
                  req.getRequestDispatcher("/img/gif/disappointment.gif").forward(req,resp);
         }
          }}
        catch(Exception e){
            resp.setContentType("text/html");
            PrintWriter pw = resp.getWriter();
            pw.println("<b style='color:red'>Incorrect value for integer</b>");
            return;   
                  }finally{
                
                }
        
        }
        
}