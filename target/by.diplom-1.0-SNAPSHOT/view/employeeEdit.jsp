<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Evgenia
  Date: 10.04.2017
  Time: 12:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<spring:form cssClass="tg" action="/edit/{id}" method="post" modelAttribute="employee">

    <td><tr> Id: <spring:input path="idEmployee" readonly="true"/> </tr></td>
    <td><tr> Имя : <spring:input path="name"/> </tr></td>
    <td><tr> Фамилия : <spring:input path="surname"/> </tr></td>
    <td><tr> Отчество: <spring:input path="patronicname"/> </tr></td>
    <td><tr> Дата рождения: <spring:input path="dateOfBirh"/> </tr></td>
    <td><tr> Место рождения: <spring:input path="placeOfBirth"/> </tr></td>
    <td><tr> Пол: <spring:input path="sex"/> </tr></td>
    <td><tr> Номер паспорта: <spring:input path="numberPassport"/> </tr></td>
    <td><tr> Дата выдачи паспорта: <spring:input path="datePassport"/> </tr></td>
    <td><tr> Личный номер: <spring:input path="insurance"/> </tr></td>
    <td><tr> Адрес: <spring:input path="adress"/> </tr></td>
    <td><tr> Телефон: <spring:input path="phone"/> </tr></td>
    <td><tr> <spring:button>Сохранить</spring:button></tr></td>

</spring:form>
</body>
</html>
