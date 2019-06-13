<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<h3>Calculator</h3>

<%--@elvariable id="currencyValues" type="projekty.Kalkulator.walut.models.CurrencyValues"--%>
<form:form modelAttribute="currencyValues">
    eur:
    <form:input path="eurValue"/>
    <form:errors path="eurValue"/>
    sek:
    <form:input path="sekValue"/>
    <form:errors path="sekValue"/>
    nok:
    <form:input path="nokValue"/>
    <form:errors path="nokValue"/>
    dkk:
    <form:input path="dkkValue"/>
    <form:errors path="dkkValue"/>
    <input type="submit" value="oblicz">
    <form:hidden path="id"/>
</form:form>
</body>
</html>