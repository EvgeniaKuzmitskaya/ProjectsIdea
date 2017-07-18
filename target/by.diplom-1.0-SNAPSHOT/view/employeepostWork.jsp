<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Evgenia
  Date: 19.04.2017
  Time: 12:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ListWork</title>

    <style type="text/css">
        .tg{
            border-collapse: collapse;
            border-spacing: 0;
            border-color: #ccc;
        }

        .tg td {
            front-family: Arial, sans-serif;
            front-size: 14px;
            padding: 10px 5px;
            border-style: solid;
            border-width: 1px;
            overflow: hidden;
            word-break: normal;
            border-color: black;
            color: black;
            background-color: #fff;
            align-self: center;

        }
        .tg th {
            front-family: Arial, sans-serif;
            front-size: 14px;
            front-weight: normal;
            padding: 10px 5px;
            border-style: solid;
            border-width: 1px;
            overflow: hidden;
            border-color: black;
            color: black;
            background-color: #f0f0f0;
            align-self: center;
        }
        .tg .tg-4eph{
            background-color: #f9f9f9;
        }

        .d9 h3 {
            padding: 0 0 6px 10px;
            border-left: 10px solid #A6D8CB;
            border-bottom: 2px solid #A6D8CB;
        }
    </style>
</head>
<body>
<div class="d9"><h3>Штатное расписание</h3></div>
<br>
<a href="http://localhost:8080/index">Возврат на главную страницу</a>
<br>
<br>
<table class = "tg">
    <tr>
        <th width="120">Должность</th>
        <th width="120">Количество сотрудников</th>
    </tr>

    <c:forEach items="${listWork}" var="emplpost">
        <tr>
            <c:forEach items="${emplpost}" var="next">
            <td>${next.value}</td>
        </c:forEach>
        </tr>
    </c:forEach>
</table>

</body>
</html>
