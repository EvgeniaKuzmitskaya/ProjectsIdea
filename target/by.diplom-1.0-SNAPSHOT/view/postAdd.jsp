<%--
  Created by IntelliJ IDEA.
  User: Evgenia
  Date: 17.04.2017
  Time: 23:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add post</title>
</head>
<body>
<form action="/postAdd" method="post" modelAttribute="pos">

    <p>Введите новую должность</p>
   <p><input type="text" name= "namePost" id="${pos.namePost}"></p>
    <p><input type="submit" value="Добавить"></p>

</form>
</body>
</html>
