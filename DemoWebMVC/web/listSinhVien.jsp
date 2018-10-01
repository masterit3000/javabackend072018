<%-- 
    Document   : listSinhVien
    Created on : Oct 1, 2018, 9:23:03 PM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="model.jpactrl.SinhvienJpaController"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <c:if test="${requestScope.list==null}">
            <c:redirect url="/ListSinhVienServlet" />
        </c:if>

        <table>
            <tr>
                <th>Ma</th>
                <th>Ten</th>
                <th>NgaySinh</th>
                <th>sua</th>
                <th>Xoa</th>
            </tr>
            <c:forEach items="${requestScope.list}" var="sv">
                <tr>
                    <td>
                        ${sv.ma}
                    </td>
                    <td>
                        ${sv.ten}
                    </td>
                    <td>
                        ${sv.ngaysinh}
                    </td>
                    <td>
                        <a href="formEditServlet?maedit=${sv.ma}">
                            Sua
                        </a>
                    </td>
                    <td>
                        <a href="DeleteSinhVien?madel=${sv.ma}">
                            Xoa
                        </a>
                    </td>

                </tr>
            </c:forEach>
        </table>
    </body>
</html>
