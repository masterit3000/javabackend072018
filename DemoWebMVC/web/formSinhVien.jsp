<%-- 
    Document   : formSinhVien
    Created on : Oct 1, 2018, 10:19:06 PM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form  method="post" action="XuLySinhVien">
            <c:if test="${requestScope.sv!=null}">

                <label>Ma</label> <input readonly="true" name="ma"  value="${requestScope.sv.ma}"/> <br />
            </c:if>
            <c:if test="${requestScope.sv==null}">
                them moi sinh vien <br/>
            </c:if>
            <label>ten</label> <input name="ten" value="${requestScope.sv.ten}" /> <br />
            <label>Ngay sinh</label> <input name="ngaysinh" type="date" value="${requestScope.sv.ngaysinh}"/> <br />

            <input type="submit" value="Save" />

        </form>
    </body>
</html>
