<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>bye ${sessionScope.voter.voterDetails.name}</h1>
<h2> logged out successfully</h2>

${pageContext.session.invalidate()}

<h4>
<a href="login.jsp">login again</a>
</h4>
</body>
</html>