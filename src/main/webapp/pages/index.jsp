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
    <title>欢迎页面</title>
</head>
<body>
<a href="/city/findAllCity.do">查询所有城市的信息</a><br>
<form action="/city/fileUpload.do" method="post" enctype="multipart/form-data">
    文件: <input type="file" name="file">
    <input type="submit" value="上传文件">
</form>


</body>
</html>
