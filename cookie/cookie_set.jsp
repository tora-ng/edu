<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	// 쿠키 만드는 과정
	Cookie cookie = new Cookie("CookieN","CookieV"); // 쿠키 객체 생성
	cookie.setMaxAge(60 * 60); // 쿠키 시간 설정
	
	response.addCookie(cookie); // 응답 객체에 쿠키를 담아 두는 것 나중에 보내 줌
	%>
	
	<a href="cookie_get.jsp">cookie get</a>
	
</body>
</html>