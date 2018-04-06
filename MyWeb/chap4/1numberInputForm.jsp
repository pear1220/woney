<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta charset="UTF-8">
<title>JSP 페이지에서 Exception 처리방법 3가지</title>

<script type="text/javascript">
	function goSubmit(btn){
		switch(btn){
			case 'btn1' :
				frm1.submit();  /* 첫번째 frm1의 jsp로 전송해라 *//* document.frm1. document 는 생략 가능 */ 
				break;
				
			case 'btn2' :
				frm2.submit();
				break;
				
			case 'btn3' :
				frm3.submit();
				break;
				
			default:
				 alert('해당되는 버튼이 없습니다!!!');
				break;
		}
		
	}
	
</script>
</head>
<body>
	<%-- 에러발생시 URL에 오류페이지에 대한 정보가 없기 때문에 보안에 좋다  ex) http://localhost:9090/MyWeb/chap4/ex01_numCalcEnd.jsp 실제 에러페이지는 error_ex01.jsp --%>
	<h2>try ~ catch ==> RequestDispatcher를 이용한 에러페이지 출력</h2>
	<form name ="frm1" action="ex01_numCalcEnd.jsp" method="post"> <!-- ex01_numCalcEnd.jsp로 넘어간다. -->
		num1 : <input type="text" name="num1" /><br/>
		num2 : <input type="text" name="num2" /><br/>
	<button type="button" id="btn1" onClick="goSubmit('btn1');">전송</button> 
	</form>

	<br/><br/><br/>

	<h2>JSP 페이지 directive(지시어)에서 errorPage 속성과 isErrorPage 속성을 이용한 에러페이지 출력방법, errorPage="error_ex02.jsp" 및 isErrorPage="true"로 함 </h2>
	<form name ="frm2" action="ex02_numCalcEnd.jsp" method="post"> 
		num1 : <input type="text" name="num1" /><br/>
		num2 : <input type="text" name="num2" /><br/>
	<button type="button" id="btn2" onClick="goSubmit('btn2');">전송</button> 
	</form>	
	
	<br/><br/><br/>

	<h2>web.xml 파일을 에러페이지 출력 </h2>
	<form name ="frm3" action="ex03_numCalcEnd.jsp" method="post"> 
		num1 : <input type="text" name="num1" /><br/>
		num2 : <input type="text" name="num2" /><br/>
	<button type="button" id="btn3" onClick="goSubmit('btn3');">전송</button> 
	</form>		
</body>
</html>