package forw;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class PalindromePage extends HttpServlet {
    
  @Override
  public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        resp.setContentType("text/html");
        PrintWriter pw = resp.getWriter();
        String vals[] = req.getParameterValues("name");
        pw.println("<table border='1' width='70%' >");
        pw.println("<tr><th>name</th><th>istPalindrome</th></tr>");
         
        for(int i =0 ; i< vals.length ;i++){
          pw.println("<tr><td>"+vals[i]+"</td><td>"+istPalindrome(vals[i])+"</td></tr>");
        }
        pw.println("</table  >");
  
//        resp.setContentType("image/gif");  		 //MIME type of  images of type   .gif
//        req.getRequestDispatcher("/money.gif").include(req, resp);

   }
  
   
  
      private static boolean istPalindrome(String word){
          word = word.toLowerCase();
        StringBuffer sb = new StringBuffer(word);
        String afterReverse = sb.reverse().toString();
        return word.equals(afterReverse);
    }
}