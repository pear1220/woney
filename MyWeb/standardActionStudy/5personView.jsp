<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="standardActionStudy.test.PersonDTO" %>
<%
	PersonDTO person =new PersonDTO();
	
	person.setName("앤해서웨이");
	person.setGender('f');
	person.setAge(30);
	
	String name = person.getName();
	char gender = person.getGender();
	int age = person.getAge();
	String genderStr = person.getGenderStr();
%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보보기</title>
</head>
<body>
	<h2>스크립틀릿을 사용하여 DTO 클래스의 객체정보를 불러와 본다.</h2>
	성명: <%= name %> <br/> 
	성별구분: <%= gender%> <br/>
	나이:<%= age%> <br/>
	성별:<%= genderStr%> <br/>
	<br/><br/><br/>
	
	<h2>JSP 표준액션중 useBean을 사용하여 DTO 클래스의 객체정보를 불러와 본다.</h2>
	<jsp:useBean id="ps" class="standardActionStudy.test.PersonDTO"/> 
	<%-- standardActionStudy.test.PersonDTO 클래스는 위에   page import="standardActionStudy.test.
	PersonDTO" 를 따로 할필요가 없다. //id="ps" 객체 이름--%>
	<jsp:setProperty property="name" name="ps" value="베네딕트컴버베치"/>
	<jsp:setProperty property="gender" name="ps" value="m"/>
	<jsp:setProperty property="age" name="ps" value="34"/>
	
	성명: <jsp:getProperty property="name" name="ps"/> <br/><%-- JSP의 property는 PersonDTO에 get다음에 나오는 이름을 사용 처음오는 글자는 무조건 소문자  --%>
	성별구분: <jsp:getProperty property="gender" name="ps"/> <br/>
	나이: <jsp:getProperty property="age" name="ps"/> <br/>
	성별: <jsp:getProperty property="genderStr" name="ps"/> <br/> <%-- get이 없으면 에러가 난다. --%>
	
</body>
</html>