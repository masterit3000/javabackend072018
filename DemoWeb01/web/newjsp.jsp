<%-- 
    Document   : newjsp
    Created on : Sep 25, 2018, 8:44:43 PM
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
            //?a=NgueynVanA&b=23&c=34: tham so gui len server thong qua dia chi ( get)
            //trong day la code java
            int a = 10;
            String s = "Hello";
            String ten = request.getParameter("a");//gui thog qu thanh dia chi

            out.print(a + " <br/>");
            out.print(s + ": " + ten);
            int c, d;

            try {
                d = Integer.parseInt(request.getParameter("d"));
            } catch (Exception e) {
                d = 0;
            }
            try {
                c = Integer.parseInt(request.getParameter("c"));
            } catch (Exception e) {
                c = 0;
            }
            int tong = c + d;
            
//tao 1 lisst sinh vien list obj cua java , in ra table sinh vien(ma, ten, ngay sinh)
//nang cap list lay ve tu db
//trong day la code java thuan hoan co the goi jdbc, goi DAO..., JPA
//goi JDBC -> in ra dung the table, tr td v.v...
        %>

        <form action="" method="post">
            c = <input name="c" value="<%=c%>"/> +
            d = <input name="d" value="<%=d%>"/>
            <input type="submit" />
            Tong: <%=tong%>
        </form>
    </body>
</html>
