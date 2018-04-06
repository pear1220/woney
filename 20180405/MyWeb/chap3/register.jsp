<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8">
<style type="text/css">
	.man {color:red;
			font-weight: bold;
			}
	.women {color:blue;
			font-weight: bold;
			}
</style>
<%
	String ctxpath=request.getContextPath(); 

	String userid = request.getParameter("userid");
	String passwd = request.getParameter("passwd");
	String name = request.getParameter("name");
	String jubun1 = request.getParameter("jubun1");
	String jubun2 = request.getParameter("jubun2");
	String mobile1 = request.getParameter("mobile1");
	String mobile2 = request.getParameter("mobile2");
	String mobile3 = request.getParameter("mobile3");
	String email = request.getParameter("email");
	
	String gender = jubun2.substring(0,1);
					// 1234567
					// 2234567
					// 3234567
					// 4234567
					
	Date now = new Date();
	int nowYear = Integer.parseInt(String.format("%tY", now));			

	int age=0;
	String css="";
	switch (gender) {
	case "1":
		gender = "남";
		age = nowYear - (1900 + Integer.parseInt(jubun1.substring(0, 2)) +1);
		
		break;
	case "2":
		gender="여";
		age = nowYear - (1900 + Integer.parseInt(jubun1.substring(0, 2)) +1);
		break;
	case "3":
		gender="남";
		age = nowYear - (2000 + Integer.parseInt(jubun1.substring(0, 2)) +1);
		break;
	case "4":
		gender="여";
		age = nowYear - (2000 + Integer.parseInt(jubun1.substring(0, 2)) +1);
		break;
	default:
		
		break;
	}
	
%><%-- JSP에 request가 내장되어있다--%>
<script type="text/javascript" src="<%= ctxpath %>/js/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		
		genderAlert();
		
	});
	
	function genderAlert(){
		<% if("남".equals(gender)){%>		
			alert("남자이군요!!");		
		<% }else{%>	
			alert("여자이군요!!");
		<% } %>
	}
</script>
<title>회원가입 결과화면</title>

</head>
<body>
	<h2>회원가입 결과</h2>
	
	<div>
		아이디: <%= userid %><br/>
		암호: <%= passwd %><br/>
		성명: <%= name%><br/>
		주민번호: <%= jubun1%>-*******<br/>
		성별: <span class=" <% if ("남".equals(gender)) css="man"; else css="women"; %><%=css%>" ><%= gender%></span><br/>
		현재나이: <%= age%><br/>
		핸드폰 번호: <%= mobile1%>-<%= mobile2%>-<%= mobile3%><br/>
		이메일: <%= email%><br/>
	</div>
	
</body>
</html>