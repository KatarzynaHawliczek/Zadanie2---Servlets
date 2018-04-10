<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="domain.User" %>  
<%@ page session="true" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Account informations</title>
</head>
<body>
    <form method="get" action="info.jsp">
        <center>
        <table border="0" width="30%" cellpadding="3">
            <thead>
                <tr>
                    <th colspan="2">Information about user: </th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>Username: </td>
                    <td><c:out value="${conf.getUsername()}"/></td>
                </tr>
                <tr>
                    <td>Password: </td>
                    <td><c:out value="${conf.getPassword()}"/></td>
                </tr>
                <tr>
                    <td>Email: </td>
                    <td><c:out value="${conf.getEmail()}"/></td>
                </tr>
                <tr>
                    <td>Permission: </td>
                    <td><c:out value="${conf.getPermission()}"/></td>
                </tr>
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