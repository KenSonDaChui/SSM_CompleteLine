<%--
  Created by IntelliJ IDEA.
  User: THE丶IVERSON
  Date: 2020/9/29 0029
  Time: 9:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
</head>
<body>
<form action="/user/login.do" method="post">
    姓名: <input type="text" name="userId">
    密码: <input type="text" name="password" />
    <input type="submit" value="Submit" />
</form>
</body>
</html>
