package forw;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.GregorianCalendar;
public class InnerPage_attribute1 extends HttpServlet {
    
  @Override
  public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        resp.setContentType("text/html");
        PrintWriter pw = resp.getWriter();
        try{
        String xStr = req.getAttribute("red").toString();
        int x = Integer.parseInt(xStr);
        String yStr = req.getAttribute("green").toString();
        int y = Integer.parseInt(yStr);
        String zStr = req.getAttribute("blue").toString();
        int z = Integer.parseInt(zStr);
        pw.println("<body style='background-color: rgb("+x+","+y+","+z+");'>");
        GregorianCalendar gc = (GregorianCalendar) req.getAttribute("curDateTime");
        pw.println("<h2 style='color : navy'>InnerPage_attribute1</h2>");
        String s = String.format("%TY %TA %TB %Td %Tj", gc, gc, gc, gc, gc);
        pw.println("olivier test ..... " + s);
            }
            catch(Exception e){
            pw.println("<body >");
            }finally{
           pw.println("</body >");
        }

//        pw.println("<br><hr>" +  );
        
//        resp.setContentType("image/gif");  		 //MIME type of  images of type   .gif
//        req.getRequestDispatcher("/money.gif").include(req, resp);
   }
}