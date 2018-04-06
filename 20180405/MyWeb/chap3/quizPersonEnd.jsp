<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8">
<title>Insert title here</title>
<%
	String name = request.getParameter("name");
	String color = request.getParameter("color");
	String[] food = request.getParameterValues("food");
	String animal = request.getParameter("animal");
	
	
	switch(color){
	case "빨강":
		color="/MyWeb/images/red.png";
		break;
	case "파랑":
		color="/MyWeb/images/blue.png";
		break;
	case "노랑":
		color="/MyWeb/images/yellow.png";
		break;
	}
	
	for(int i=0; i<food.length;i++){
		switch(food[i]){
		case "짬뽕":
			food[i]="<img src='/MyWeb/images/jjbong.png'>";
			break;
		case "탕수육":
			food[i]="<img src='/MyWeb/images/tangsy.png'>";
			break;
		case "양장피":
			food[i]="<img src='/MyWeb/images/yang.png'>";
			break;
		case "팔보체":
			food[i]="<img src='/MyWeb/images/palbc.png'>";
			break;
		case "짜장면":
			food[i]="<img src='/MyWeb/images/jjm.png'>";
			break;
		}
	}
	

	switch(animal){
	case "강아지":
		animal="/MyWeb/images/dog.png";
		break;
	case "고양이":
		animal="/MyWeb/images/cat.png";
		break;
	case "물고기":
		animal="/MyWeb/images/fish.png";
		break;

	}
	
	String Food="";

%>
</head>
<body>
	<h3>결과값</h3>
	<div>
		성명: <%= name %><br/>
		색 : <img src="<%=color %>"> <br/>
		좋아하는 음식: <%for(int i=0; i<food.length;i++){
		 String n = food[i]; %> <%= n %> <% } %><br/>
		
		동물 : <img src="<%=animal %>" > <br/>
		
	</div>
</body>
</html>