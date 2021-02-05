<%--
  Created by IntelliJ IDEA.
  User: upczsh
  Date: 2021/2/4
  Time: 14:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <form action="${pageContext.request.contextPath}/user/quick22" method="post">

        名称<input type="text" name="username"><br>
        文件 <input type="file" name="uploadFile"><br>
        <input type="submit" name="upload">
    </form>




</body>
</html>
