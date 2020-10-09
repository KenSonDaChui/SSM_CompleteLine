<%--
  Created by IntelliJ IDEA.
  User: THE丶IVERSON
  Date: 2020/9/29 0029
  Time: 9:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>返回成功页面</title>
</head>
<body>
恭喜你,返回成功了!!



<c:forEach items="${list}"  var="city" varStatus="s">
    <tr>
        <td>${s.count}</td>
        <td>${city.cityName}</td>
    </tr>
        <c:forEach items="${city.list}"  var="c" varStatus="s">
        <tr>
            <td>${c.cityName}</td>
        </tr>


        <br>

    </c:forEach>

    <br>

</c:forEach>


</body>
</html>
