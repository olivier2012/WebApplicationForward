<%@page import="java.util.GregorianCalendar"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="refresh" content="3" />
        <title>First JSP Page</title>
    </head>
      <%  
              try{
            String xStr = request.getAttribute("red").toString();
            int x = Integer.parseInt(xStr);
            String yStr = request.getAttribute("green").toString();
            int y = Integer.parseInt(yStr);
            String zStr = request.getAttribute("blue").toString();
            int z = Integer.parseInt(zStr);
            out.println("<body style='background-color: rgb("+x+","+y+","+z+");'>");
            }
            catch(Exception e){
            out.println("<body >");
            }
       %>
        <h1>Hello JSP!</h1> 
        
        <% out.println("Hello from java code inside JSP");%>
         <%  
            
            GregorianCalendar gc  = new GregorianCalendar( );
            out.println(String.format("<br/><hr/>Today is %TY %TB %Td ", gc, gc, gc)); 
        %>
        <%           
           
            out.println(String.format("<br/><hr/>Today is %TY %<TB %<Td ", gc)); 
        %>
        <%           
           
            out.println(String.format("<br/><hr/>Today is %TY %1$TB %1$Td ", gc));
            
            pageContext.include("/index.jsp");
        %>


       
    </body>
</html>