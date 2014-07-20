<%-- 
    Document   : login
    Created on : Jun 22, 2014, 3:26:51 PM
    Author     : Himanshu
--%>
<%@taglib prefix="zfw" uri="/WEB-INF/zefw.tld" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <zfw:form name="login" action="login" method="post">
            <table>
                <tr><td>Username</td><td><zfw:textfield name="username" valueto="m{user.username}"/></td></tr>
                <tr><td>Password</td><td><zfw:passwordfield name="password" valueto="m{user.password}"/></td></tr>
                <tr><td></td><td><zfw:submit value="Login"/></td></tr>
            </table>
        </zfw:form>
    </body>
</html>
