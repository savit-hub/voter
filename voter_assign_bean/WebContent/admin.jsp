<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>hie ${sessionScope.voter.voterDetails.name} </h2>
<table border="1">
<tr>
<th>id</th>
<th>name</th>
<th>party</th>
<th>votes</th>
</tr>

<tr>
<c:forEach var="c" items="${sessionScope.candy.showMax2()}">
<td>${c.id}</td>
<td>${c.name}</td>
<td>${c.political_party}</td>
<td>${c.votes}</td>
</c:forEach>
<br/>
</tr>

</table>

<table border="1">
<tr>


<th>party</th>
<th>votes</th>
</tr>

<tr>
<c:forEach var="c" items="${sessionScope.candy.showMax2()}">


<td>${c.political_party}</td>
<td>${c.votes}</td>
</c:forEach>
<br/>
</tr>

</table>
</body>
</html>