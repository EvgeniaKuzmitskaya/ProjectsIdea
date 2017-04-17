<%--
  Created by IntelliJ IDEA.
  User: Evgenia
  Date: 15.04.2017
  Time: 23:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        body {
            /*background: url("index.jsp");*/
        }
        #loginForm {
            width: 290px;
            padding: 24px 24px 0;
            margin: 200px auto 0;
            background: #FEFEFE;
            border: 1px solid #CAD8DE;
            border-radius: 4px;
            box-shadow: 0 1px 2px rgba(0,0,0,0.08);
            font: 14px/18px Arial, Tahoma, sans-serif;
            color: #444;
        }
        #loginForm .field {
            margin: 0 0 18px;
        }
        #loginForm .field label {
            display: block;
            margin: 0 0 11px;
        }
        #loginForm .field .input {
            border-radius: 4px;
        }
        #loginForm .field input {
            font: 12px Arial, Tahoma, sans-serif;
            color: #444;
            width: 262px;
            padding: 9px 13px;
            border: 1px solid #D2D9DC;
            border-radius: 3px;
            box-shadow: inset 2px 2px 6px #EBEBEB, 0 0 0 5px #F7F9FA;
            outline: none;
        }
        #loginForm .field input:focus {
            border-color: #B7D4EA;
            box-shadow: inset 2px 2px 6px #EBEBEB, 0 0 4px #D0E6F6, 0 0 0 5px #F2F8FC;
        }
        #forgot {
            float: right;
            font-size: 11px;
            color: #ababab;
            text-decoration: none;
            margin: 0;
        }
        #forgot:hover {
            color: #444;
            text-decoration: underline;
        }
        #loginForm .submit {
            overflow: hidden;
            margin: 30px -24px 0;
            padding: 22px 24px;
            background: #F0F5F7;
            border-top: 1px solid #DDE0E8;
            border-radius: 0 0 4px 4px;
            box-shadow: inset 0 1px #FFF, inset 1px 0 #F7FAFB;
            font-size: 11px;
        }
        #remember {
            display: block;
            margin: 5px 0 0;
            cursor: pointer;
        }
        #remember input {
            margin: 0 4px 0 0;
            vertical-align: middle;
        }
        #loginForm .submit button {
            float: right;
            padding: 6px 20px;
            height: 30px;
            border-top: 1px solid #98CCE7;
            border-bottom: 1px solid #7DB0CC;
            border-left: 1px solid #8CBFD9;
            border-right: 1px solid #8CBFD9;
            border-radius: 15px;
            color: #FFF;
            font: bold 13px Arial, Tahoma, sans-serif;
            box-shadow: inset 0 1px #D4EBF7, 0 1px 3px #B8BEBE;
            background: -moz-linear-gradient(top,  #badff3 0%, #7acbed 100%);
            background: -webkit-gradient(linear, left top, left bottom, color-stop(0%,#badff3), color-stop(100%,#7acbed));
            background: -webkit-linear-gradient(top,  #badff3 0%,#7acbed 100%);
            background: -o-linear-gradient(top,  #badff3 0%,#7acbed 100%);
            background: -ms-linear-gradient(top,  #badff3 0%,#7acbed 100%);
            background: linear-gradient(top,  #badff3 0%,#7acbed 100%);
            background-color: #9FD7F0;
            cursor: pointer;
            text-shadow: 0 -1px rgba(0,0,0,0.15);
            outline: none;
        }
        #loginForm .submit button::-moz-focus-inner{border:0}


    </style>

</head>
<body>
<form id="loginForm" action="/" method="post">

    <div class="field">
        <label>Имя пользователя:</label>
        <div class="input"><input type="text" name="" value="" id="login" /></div>
    </div>

    <div class="field">
        <label>Пароль:</label>
        <div class="input"><input type="password" name="" value="" id="password" /></div>
    </div>

    <div class="submit">
        <button type="submit">Войти</button>
        <label id="remember"><input name="" type="checkbox" value="" /> Запомнить меня</label>
    </div>

</form>
</body>
</html>
