<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isErrorPage="true"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>NumberFormatException 처리</title>
</head>
<body>

	<h1>numberError.jsp의 내용</h1>
	
	<h2>JSP 페이지에서 Exception 처리방법 3</h2>
	<h3>web.xml 을 이용한 에러페이지 출력</h3>
	<br/>
	
	숫자가 아닌데이터 입력되었습니다..<br/><br/>
	에러메시지 : <%= exception.getMessage() %><br/><br/> <%-- exception 내장 객체 --%>
	<%-- JSP 페이지 directive(지시어)에서 isErrorPage="true"으로 해야만 내장 객체인 exception을 사용할 수 있다. --%>
	<br/><br/>

	
</body>
</html>