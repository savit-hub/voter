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
<h1>${sessionScope.voter.message}</h1>

<h2>hello ${sessionScope.voter.voterDetails.name}</h2>

<form action="status.jsp">
<table>
<tr>
<td>
<c:forEach var="c" items="${sessionScope.candy.AllCandidate()}">
<input type="radio" name="cid" value="${c.id}" checked="checked">${c.name}</input>
<br/>
</c:forEach>
</td>
</tr>
</table>

<input type="submit" value="vote" name="btn">
</form>

</body>
</html>