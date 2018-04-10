<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="domain.User" %>  
<%@ page session="true" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>UserList</title>
</head>
<body>
    <form method="get" action="userList.jsp">
        <center>
        <table border="1" width="30%" cellpadding="3">
            <thead>
                <tr>
                    <th colspan="4">List of users: </th>
                </tr>
            </thead>
                <tr>
                    <td>Username</td>
                    <td>Password</td>
                    <td>Email</td>
                    <td>Permission</td>
                </tr>
            <tbody>    
            <c:forEach items="${userList}" var="users">
                <tr>
                    <td>${users.getUsername()}</td>
                    <td>${users.getPassword()}</td>
                    <td>${users.getEmail()}</td>
                    <td>${users.getPermission()}</td>
                </tr>
            </c:forEach>
                <tr>
                    <td colspan="2">Log out:<a href="logout.jsp">&nbsp;&nbsp;click&nbsp;&nbsp;</a></td>
                    <td colspan="2">Back:<a href="welcome.jsp">&nbsp;&nbsp;click&nbsp;&nbsp;</a></td>
                </tr>
            </tbody>
        </table>
        </center>
    </form>
</body>
</html>