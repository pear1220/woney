<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
 	String firststr = request.getParameter("firstNum");
 	String secondstr = request.getParameter("secondNum");
 	
 	int firstNum = Integer.parseInt(firststr);
 	int secondNum =Integer.parseInt(secondstr);
 	
 	int sum=0;
 	for(int i=firstNum; i<=secondNum;i++){
 		sum +=i;
 	}
 	/* request는 폼에 있는 값을 읽어 오는 역할도 있지만 저장소 역할도 있다.*/
	/* request.setAttribute("sum", new Integer(sum) );// request.setAttribute(arg0, arg1)키값과 실제 저장되어지는 객체
 	또는 아래와 같이 사용한다. 왜냐하면 auto boxing 기능에 따라 가능하다. */
 	request.setAttribute("sum", sum );
 %>
 
 <jsp:forward page="2sumView.jsp"/> <%-- dispatcher와 비슷하다. 넘겨준다. --%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>