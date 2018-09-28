<%-- 
    Document   : login
    Created on : Sep 28, 2018, 8:46:21 PM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link href="style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body id="LoginForm">
        <%
            Object obj = request.getAttribute("emailErr");
            String e = null;
            if (obj != null) {
                e = (String) obj;
            } else {
                e = "";
            }
        %>


        <div class="container">
            <h1 class="form-heading">login Form</h1>
            <h1 class="form-heading">${requestScope.loginErr}</h1>
            <div class="login-form">
                <div class="main-div">
                    <div class="panel">
                        <h2>Admin Login</h2>
                        <p>Please enter your email and password</p>
                    </div>
                    <form id="Login" action="XuLyLogin" method="post">
                        <div class="form-group">
                            <input name="email" value="${param.email}"  class="form-control" id="inputEmail" placeholder="Email Address">
                            ${requestScope.emailErr}
                        </div>
                        <div class="form-group">
                            <input name="pass" value="${param.pass}" type="password" class="form-control" id="inputPassword" placeholder="Password">
                            ${requestScope.passErr}
                        </div>
                        <div class="forgot">
                            <a href="reset.html">Forgot password?</a>
                        </div>
                        <button type="submit" class="btn btn-primary">Login</button>
                    </form>
                </div>
                <p class="botto-text"> Googled by Tu FC</p>
            </div></div></div>


</body>
</html>
