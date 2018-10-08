<%-- 
    Document   : newjsp
    Created on : Oct 8, 2018, 9:02:12 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            String s = (String) request.getSession().getAttribute("name");
            
            out.print(s);
            //giowng viet servel 
            Cookie[] dsck = request.getCookies();
            
        %>
        
        ${cookie.aa.value} - ${sessionScope.name}  - ${applicationScope.abc}
    </body>
</html>
