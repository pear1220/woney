<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date" %>
<%
	Date now=new Date();
	String today = String.format("오늘은 %tY년 %tm월 %td일 %tA입니다.", now, now, now,now);
%>

copyright 이 웹페이지의 저작권은 김시온씨에게 있습니다.<br/>
<span style="color: blue; font-weight: bold;"><%= today %></span>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>