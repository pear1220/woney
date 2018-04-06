<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8">
<title>JSP 표준액션중 forward 에 대해서 알아본다.</title>

<script type="text/javascript">
	function goSubmit(){
		var frm =document.myFrm;
		frm.submit();//2sumCalc.jsp로 전송
		
	}
</script>

</head>
<body>
	<h2>입력한 두개의 수 사이를 누적한 값 알아오기</h2>
	<p>
	<form name="myFrm" action="2sumCalc.jsp" ><%-- 전송하려면 form이 꼭 있어야한다.method는 사용을 안하면 기본적으로 get --%>
		첫번째 수: <input type="text" name="firstNum" /><br/> <!-- 전송하기 전에 정규화해주는게 좋다 -->
		두번째 수: <input type="text" name="secondNum" /><br/>
		<button type="button" onClick="goSubmit();">계산하기</button>
	</form> 
</body>
</html>