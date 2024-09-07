<%--
  Created by IntelliJ IDEA.
  User: Artem
  Date: 7.9.2024
  Time: 21.51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Table Cars</title>
</head>
<body>
<h2>Cars Information</h2>
<br>
<table>
    <tr>
        <th>Name</th>
        <th>Type</th>
        <th>Mileage</th>
    </tr>
    <c:forEach var="cars" items="${cars}">
        <tr>
            <td>${cars.name}</td>
            <td>${cars.type}</td>
            <td>${cars.mileage}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
