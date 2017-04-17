<%--
  Created by IntelliJ IDEA.
  User: Evgenia
  Date: 09.04.2017
  Time: 10:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>
<%@ taglib prefix="spring" uri="http://java.sun.com/jsp/jstl/fmt" %>


<html>
<head>
    <title>Title</title>

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
            color: mediumblue;
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
           color: mediumblue;
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
<div class="d9"><h3>Список сотрудников</h3></div>
<br><a href="../../index.jsp">Возврат на главную страницу</a>
<table class = "tg">
    <tr>
        <th width="60">ID</th>
        <th width="120">Имя</th>
        <th width="120">Фамилия</th>
        <th width="120">Отчество</th>
        <th width="120">Дата рождения</th>
        <th width="120">Место рождения</th>
        <th width="120">Пол</th>
        <th width="120">Номер паспорта</th>
        <th width="120">Дата паспорта</th>
        <th width="120">Личный номер</th>
        <th width="120">Адрес</th>
        <th width="120">Телефон</th>
        <th width="60">Изменить</th>
        <th width="60">Удалить</th>
    </tr>
<tr>
        <td>${empl.idEmployee}</td>
        <td>${empl.name}</td>
        <td>${empl.surname}</td>
        <td>${empl.patronicname}</td>
        <td>${empl.dateOfBirh}</td>
        <td>${empl.placeOfBirth}</td>
        <td>${empl.sex}</td>
        <td>${empl.numberPassport}</td>
        <td>${empl.datePassport}</td>
        <td>${empl.insurance}</td>
        <td>${empl.adress}</td>
        <td>${empl.phone}</td>
    <td><a href="<c:url value='/edit/${empl.idEmployee}'/>">Изменить</a></td>
    <td><a href="<c:url value='/remove/${empl.idEmployee}'/>">Удалить</a></td>
</tr>
</table>
</body>
</html>
