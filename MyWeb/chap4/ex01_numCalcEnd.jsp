<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String str1 = request.getParameter("num1");
	String str2 = request.getParameter("num2");
	int num1=0;
	int num2= 0;
	int sum=0;
	try {
		num1= Integer.parseInt(str1);
		num2= Integer.parseInt(str2);
		
		sum= num1+ num2;
	}catch(NumberFormatException e){
		/*
			에러가 발생하면 에러를 처리해주는 페이지로 이동시킨다.
			여기서는 에러를 처리해주는 페이지를 error_ex01.jsp 로 하겠다.
		*/
		RequestDispatcher dispatcher =request.getRequestDispatcher("error_ex01.jsp"); // getParameter로 데이터를 받아올수 있다.
		//반드시 dispatcher.forward(request, response);를 사용해야 되는데 이유는 Dispatcher는 "error_ex01.jsp"에서 모든처리를 해준다라는 의미. 
		dispatcher.forward(request, response);
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex01_numCalcEnd.jsp 페이지</title>

<style type="text/css">
	a {text-decoration: none;}
	a:hover {color:red;}
</style>

</head>
<body>
	<%= num1 %> + <%= num2 %> = <%= sum %><br/>
	<a href="1numberInputForm.jsp">되돌아가기</a> <%-- 되돌아가기 버튼 생성  --%> 
</body>
</html>