<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<jsp:useBean id="voter" class="beans.VoterBean" scope="session" />
<jsp:useBean id="candy" class="beans.CandidateBean" scope="session" />

<body>
<h4 style="color: red;">${sessionScope.voter.message}</h4>
	<form action="validate.jsp">
		<table style="background-color: cyan; margin: auto;">
			<tr>
				<td>Enter User Email</td>
				<td><input type="text" name="email" /></td>
			</tr>
			<tr>
				<td>Enter Password</td>
				<td><input type="password" name="password" /></td>
			</tr>
			
			<tr>
				<td><input type="submit" value="Login" /></td>
			</tr>
		</table>
	</form>


</body>
</html>