<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>You are logged in!!!</title>
</head>
<body>
    <form method="get" action="/welcome">
        <center>
        <table border="0" width="30%" cellpadding="3">
            <thead>
                <tr>
                    <th colspan="2">Welcome!!!</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>Info:</td>
                    <td><a href="info.jsp">click</a></td>
                </tr>
                <tr>
                    <td>Premium:</td>
                    <td><a href="goPremium.jsp">click</a></td>
                </tr>
                <tr>
                    <td>Permissions:</td>
                    <td><a href="goPermission.jsp">click</a></td>
                </tr>
                 <tr>
                    <td>List of users:</td>
                    <td><a href="goUserList.jsp">click</a></td>
                </tr>
                <tr>
                    <td colspan="2">Log out:<a href="logout.jsp">&nbsp;&nbsp;click&nbsp;&nbsp;</a></td>
                </tr>
            </tbody>
        </table>
        </center>
    </form>
</body>
</html>