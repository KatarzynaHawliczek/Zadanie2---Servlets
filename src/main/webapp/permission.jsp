<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Change permission</title>
</head>
<body>
    <form method="get" action="/permission">
        <center>
        <table border="0" width="30%" cellpadding="3">
            <thead>
                <tr>
                    <th colspan="2">Permissions</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>Username</td>
                    <td><input type="text" name="username" value=""/></td>
                </tr>
                <tr>
                    <td>Permission</td>
                    <td><input type="text" name="permission" value=""/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Change Permission"/></td>
                    <td><input type="reset" value="Reset"/></td>
                </tr>
                <tr>
                    <td colspan="2">Back:<a href="welcome.jsp">&nbsp;&nbsp;click&nbsp;&nbsp;</a></td>
                </tr>
            </tbody>
        </table>
        </center>
    </form>
</body>
</html>