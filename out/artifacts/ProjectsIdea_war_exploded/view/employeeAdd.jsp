<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Evgenia
  Date: 09.04.2017
  Time: 12:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">

        #conteiner {
            display: block;
            position: absolute;
            min-width: 30%;
            max-width: 50%;
            height: 700px;
            top: 40px;
            left: 20px;
            right: 20px;
            margin: 0 auto;
            list-style: none;
            padding: 0;
        }

        form {
            display: block;
            position: absolute;
            width: 85%;
            height: 500px;
            border: 1px solid #ccc;
            border-radius: 10px;
            font: 14px Arial;
            font-weight: normal;
        }

        feildset:last-child {
            display: block;
            position: absolute;
            width: 70%;
            height: 46px;
            bottom: -60px;
            background: #e3e3e3;
            border: 0;
            border-radius: 5px;
            left: 0;
        }

        p {
            margin-left: 85px;
        }

        input,
        select {
            position: absolute;
            left: 240px;
        }

        .d9 h3 {
            padding: 0 0 6px 10px;
            border-left: 10px solid #A6D8CB;
            border-bottom: 2px solid #A6D8CB;
        }
    </style>
</head>
<body>
<br>
<div class="d9"><h3>Прием на работу</h3></div>
<br>
<br>

<spring:form cssClass="conteiner" action="employeeAdd" method="post" modelAttribute="empl">
    <p><label> Id:  <spring:input path="idEmployee" readonly="true" disabled="true"/></label></p>
    <p><label> Имя:  <spring:input path="name"/> </label></p>
    <p><label> Фамилия:  <spring:input path="surname"/> </label></p>
    <p><label> Отчество: <spring:input path="patronicname"/> </label></p>
    <p><label> Дата рождения:  <spring:input path="dateOfBirh"/> </label></p>
    <p><label> Место рождения:  <spring:input path="placeOfBirth"/> </label></p>
    <p><label> Пол: <spring:input path="sex"/> </label></p>
    <p><label> Номер паспорта: <spring:input path="numberPassport"/> </label></p>
    <p><label> Дата выдачи паспорта: <spring:input path="datePassport"/> </label></p>
    <p><label> Личный номер: <spring:input path="insurance"/> </label></p>
    <p><label> Адрес: <spring:input path="adress"/> </label></p>
    <p><label> Телефон: <spring:input path="phone"/> </label></p>
    <p><label> <spring:button>Добавить</spring:button> </label></p>

</spring:form>

</body>
</html>
