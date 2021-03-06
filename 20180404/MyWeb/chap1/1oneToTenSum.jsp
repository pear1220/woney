<!-- html+ java -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 인터넷을 사용안한 경우 --> 
  <link rel="stylesheet" href="/JqueryStudy/bootstrap-3.3.7-dist/css/bootstrap.min.css">
  <script src="/JqueryStudy/js/jquery-3.3.1.min.js"></script>
  <script src="/JqueryStudy/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
  
<title>1 부터 10까지의 합 구하기</title>
<style type="text/css">
	#sum {font-size: 16pt;
			font-weight: bold;
			color: red;}
	
</style>
</head>
<body>
<%-- JSP의 주석문  --%>
<%--
	<% 로 시작하여 %> 로 끝나는 것을 "스크립틀릿" 이라고 부른다.
	"스크립틀릿" 에 자바 코딩이 들어가는 것이다.
	그런데 "스크립틀릿"에 코딩된 부분은 웹브라우저에서 소스보기를 하더라도
	안보여지므로 보안성이 좋다. 
	
	<%= %>을 expression(표현식) 이라고 부른다.
	이 expression(표현식)은 "스크립틀릿에서 작성된 결과값"을
	웹브라우저상에 보여주고자 할때 사용하는 것이다.
	
	1oneToTenSum.jsp라는 파일은 실제로는 확장자 .java 파일로 저장되어서 컴파일 되어진 
	확장자 .class 파일로 저장되어지는데 어느경로에 저장되어지는지 알아본다.
	C:\myjsp\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\work\Catalina\localhost\MyWeb\org\apache\jsp\chap1\_1oneToTenSum_jsp.java와
	C:\myjsp\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\work\Catalina\localhost\MyWeb\org\apache\jsp\chap1\_1oneToTenSum_jsp.class로 저장된다.
	
	간혹 1oneToTenSum.jsp 라는 파일을 수정을 했지만 
	수정한대로 안되면
	_1oneToTenSum_jsp.java와 _1oneToTenSum_jsp.class파일이
	꼬였기 때문이다.
	그래서 _1oneToTenSum_jsp.java와 _1oneToTenSum_jsp.class 파일을 
	삭제한 후 1oneToTenSum.jsp 라는 파일을 수정하면 된다.
  --%>
<%
	int sum =0; // 1줄 주석문

	for(int i=1; i<=10; i++){
		sum += i;
	}
%>
	1부터 10까지의 합은 <span id="sum"><%= sum %></span>입니다.
</body>
</html>