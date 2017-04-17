<%--
  Created by IntelliJ IDEA.
  User: Evgenia
  Date: 14.04.2017
  Time: 14:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="с" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>Title</title>

  <style type="text/css">

    .bullet {
      margin-left: 0;
      list-style: none;
      counter-reset: li;
    }
    .bullet li {
      position: relative;
      margin-bottom: 1.5em;
      border: 3px solid #CADFCF;
      padding: 0.6em;
      width: 50%;
      border-radius: 4px;
      background: #FEFEFE;
      color: #231F20;
      font-family: "Trebuchet MS", "Lucida Sans";
    }
    .bullet li:before {
      position: absolute;
      top: -0.7em;
      padding-left: 0.4em;
      padding-right: 0.4em;
      font-size: 16px;
      font-weight: bold;
      color: #DCC24B;
      background: #FEFEFE;
      border-radius: 50%;
      counter-increment: li;
      content: counter(li);
    }

    #searchSurname
    {
      background: #eaf8fc;
      background-image: -moz-linear-gradient(#fff, #d4e8ec);
      background-image: -webkit-gradient(linear,left bottom,left top,color-stop(0, #d4e8ec),color-stop(1, #fff));

      -moz-border-radius: 35px;
      border-radius: 35px;

      border-width: 1px;
      border-style: solid;
      border-color: #c4d9df #a4c3ca #83afb7;
      width: 500px;
      height: 35px;
      padding: 10px;
      margin: 100px auto 50px;
      overflow: hidden;
    }

    #search, #submit {
      float: left;
    }

    #search {
      padding: 5px 9px;
      height: 23px;
      width: 380px;
      border: 1px solid #a4c3ca;
      font: normal 13px 'trebuchet MS', arial, helvetica;
      background: #f1f1f1;

      -moz-border-radius: 17px 3px 3px 18px;
      border-radius: 17px 3px 3px 18px;
      -moz-box-shadow: 0 1px 3px rgba(0, 0, 0, 0.25) inset, 0 1px 0 rgba(255, 255, 255, 1);
      -webkit-box-shadow: 0 1px 3px rgba(0, 0, 0, 0.25) inset, 0 1px 0 rgba(255, 255, 255, 1);
      box-shadow: 0 1px 3px rgba(0, 0, 0, 0.25) inset, 0 1px 0 rgba(255, 255, 255, 1);
    }

    /* ----------------------- */
    #submit {
      background: #6cbb6b;
      background-image: -moz-linear-gradient(#95d788, #6cbb6b);
      background-image: -webkit-gradient(linear,left bottom,left top,color-stop(0, #6cbb6b),color-stop(1, #95d788));

      -moz-border-radius: 3px 50px 50px 3px;
      border-radius: 3px 50px 50px 3px;

      border-width: 1px;
      border-style: solid;
      border-color: #7eba7c #578e57 #447d43;

      -moz-box-shadow: 0 0 1px rgba(0, 0, 0, 0.3), 0 1px 0 rgba(255, 255, 255, 0.3) inset;
      -webkit-box-shadow: 0 0 1px rgba(0, 0, 0, 0.3), 0 1px 0 rgba(255, 255, 255, 0.3) inset;
      box-shadow: 0 0 1px rgba(0, 0, 0, 0.3), 0 1px 0 rgba(255, 255, 255, 0.3) inset;
      height: 35px;
      margin: 0 0 0 10px;
      padding: 0;
      width: 90px;
      cursor: pointer;
      font: bold 14px Arial, Helvetica;
      color: #23441e;

      text-shadow: 0 1px 0 rgba(255,255,255,0.5);
    }

    #submit:hover {
      background: #95d788;
      background-image: -moz-linear-gradient(#6cbb6b, #95d788);
      background-image: -webkit-gradient(linear,left bottom,left top,color-stop(0, #95d788),color-stop(1, #6cbb6b));
    }
    #submit:active {
      background: #95d788;
      outline: none;

      -moz-box-shadow: 0 1px 4px rgba(0, 0, 0, 0.5) inset;
      -webkit-box-shadow: 0 1px 4px rgba(0, 0, 0, 0.5) inset;
      box-shadow: 0 1px 4px rgba(0, 0, 0, 0.5) inset;
    }
    #submit::-moz-focus-inner {
      border: 0;  /* Small centering fix for Firefox */
    }


    /* ----------------------- */
    #search::-webkit-input-placeholder {
      color: #9c9c9c;
      font-style: italic;
    }

    #search:-moz-placeholder {
      color: #9c9c9c;
      font-style: italic;
    }

    #search.placeholder {
      color: #9c9c9c !important;
      font-style: italic;
    }

    #search:focus {
      border-color: #8badb4;
      background: #fff;
      outline: none;
    }

    .d9 h3 {
      padding: 0 0 6px 10px;
      border-left: 10px solid #A6D8CB;
      border-bottom: 2px solid #A6D8CB;
    }

  </style>
</head>
<br>
<div class="d9"><h3>Отдел кадров</h3></div>
<br>
<br>
<ol class="bullet">
<li><a href="<с:url value="/employeeAdd"/>" target="_blank">Прием на работу</a></li>
<li><a href="<с:url value="/"/>" target="_blank">Добавить должность</a></li>
<li><a href="<с:url value="/"/>" target="_blank">Составить список уволенных</a></li>
<li><a href="<с:url value="/"/>" target="_blank">Составить штатное расписание</a></li>
<li><a href="<с:url value="/employeeList"/>" target="_blank">Вывести список всех сотрудников</a></li>
</ol>
<form id="searchSurname" action="">
  <input id="search" type="text" placeholder="Введите фамилию">
  <input id="submit" type="submit" value="Поиск">
</form>

</body>
</html>
