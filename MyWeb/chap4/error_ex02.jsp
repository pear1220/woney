<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isErrorPage="true"%> <%-- 에러가 발생되어지면 보여주는 페이지다 isErrorPage="true"을 써야 밑에 내장객체인  exception을 사용할 수 있다. --%>
<!DOCTYPE html >
<html>
<head>
<meta charset=UTF-8">
<title>errorPage 속성과 isErrorPage 속성을 이용한 에러페이지 출력방법</title>
</head>
<body>

	<h1>error_ex02.jsp의 내용</h1>
	
	<h2>JSP 페이지에서 Exception 처리방법 2</h2>
	<h3>JSP 페이지 directive(지시어)에서 errorPage 속성과 isErrorPage 속성을 이용한 에러페이지 출력방법, errorPage="error_ex02.jsp" 및 isErrorPage="true"로 함</h3>
	<br/>
	
	잘못된 데이터가 입력 되었습니다.<br/><br/>
	에러메시지 : <%= exception.getMessage() %><br/><br/> <%-- exception 내장 객체 --%>
	<%-- JSP 페이지 directive(지시어)에서 isErrorPage="true"으로 해야만 내장 객체인 exception을 사용할 수 있다. --%>
	<br/><br/>
	<a href="1numberInputForm.jsp">되돌아가기</a> <%-- 되돌아가기 버튼 생성  --%> 
	
</body>
</html>