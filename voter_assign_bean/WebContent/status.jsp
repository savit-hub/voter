<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<jsp:setProperty name="candy" property="*"/>
<body>
<h2>hie ${sessionScope.voter.voterDetails.name} </h2>
<h3>status:${sessionScope.voter.statusType()}</h3>
<h3>${sessionScope.voter.changeStatus()}</h3>
<h3>${sessionScope.candy.addVotes()}</h3>
</body>
</html>