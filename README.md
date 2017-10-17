# ProjectsIdea

Дипломный проект – «Web-приложение «Отдел кадров»
В дипломном проекте создан программный продукт на языке java с использованием современных технологий. Результатом работы является сервис кадровой службы, подключенный к базе данных. 

Веб-приложение поддерживает следующие технологии:
•	JavaVirtualMachine;
•	MySql;
•	Java 8;
•	Maven;
•	Spring, Spring MVC;
•	Hibernate.
Описание:
Главная страница сайта содержит форму для авторизации пользователя, в случае, если данные будут введены неверно, осуществляется переход на новую форму с указанием, что была совершена ошибка и просьбой ввести данные заново.
После успешной авторизации пользователь переходит на главную страницу авторизованного пользователя, содержащую ссылки, на которой может выбрать одно из предложенных действий: ввести данные о новом сотруднике, добавить новую должность, вывести список уволенных сотрудников, составить штатное расписание, вывести список всех сотрудников, осуществить поиск сотрудника по фамилии.
При нажатии на ссылку «Прием на работу» пользователь попадает на страницу ввода данных о новом сотруднике, после нажатия на кнопку добавить данные поступают в БД.
При использовании поиска по фамилии и ввода фамилии, открывается страница с данными о сотруднике, представленными в форме таблицы.
При нажатии на ссылку «Добавить должность» открывается форма, куда можно ввести новую должность, автоматически данная должность добавляется в БД и ей присваивается следующий порядковый номер.
При нажатии на ссылку «Составить список уволенных» выводится список уволенных сотрудников на сегодняшнюю дату.
При нажатии на ссылку «Составить штатное расписание» выводится список работающих сотрудников, сгруппированных по должностям.
При нажатии на ссылку «Вывести весь список сотрудников» выводится список сотрудников со всеми внесенными данными.

