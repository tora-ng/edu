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
	Cookie[] cookies = request.getCookies();
	
	for(int i=0;  i< cookies.length;i++){
		String str = cookies[i].getName();
		System.out.println(cookies[i].getName() + ":" + cookies[i].getValue());
		
		if(str.equals("CookieN")) {
			out.println("cookies[" + i + "] name : " + cookies[i].getName() + "<br />");
			
			cookies[i].setMaxAge(0);
			response.addCookie(cookies[i]);
			
			
		}
		
	}

%>

	<a href="cookie_test.jsp">쿠키확인</a>

</body>
</html>
