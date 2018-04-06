<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 인터넷을 사용안한 경우 --> 
  <link rel="stylesheet" href="<%= request.getContextPath() %>/bootstrap-3.3.7-dist/css/bootstrap.min.css">
  <script src="<%= request.getContextPath() %>/js/jquery-3.3.1.min.js"></script>
  <script src="<%= request.getContextPath() %>/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>

<title>개인 성향 테스트</title>
<style type="text/css">
	.my_container {border:1px solid red;
					margin-top:40px;
					width: 60%;
					}
	.form-group {margin-bottom: 30px;}
	
	.my_btn-group {margin-top:50px;}
	.btn {margin-right: 20px;
	mar}
</style>
<script type="text/javascript">
	function goSubmit(){
		var frm = document.frmPersonTest;
		frm.method ="get";
		frm.action= "<%= request.getContextPath() %>/testPerson1.do";
		<%--
			<%= request.getContextPath() %>은 컨텍스트 경로명을 알려주는 것으로 다이나믹 웹프로젝트로 만들면
			컨텍스트명이 다이나믹웹프로젝트명이 된다.
			그로므로 여기서는 컨텍스트명이 /MyWeb이 되어진다.
			<<중요 암기!!>>
			웹경로를 나타낼때 맨앞에 /는 확장자가 .html이나
			.jsp일 경우에는 ip주소: 포트번호가 생략된 것이고,
			확장자가 .java 나 .xml일 경우에는
			ip주소: 포트번호/컨텍스트명이 생략된 것이다.
			
			/MyWeb/testPerson1.do은 
			/localhost:9090/MyWeb/testPerson1.do 이다.
		--%>
		frm.submit();
	}
</script>
</head>
<body>

<div class="container my_container">
<form class="form-horizontal" name ="frmPersonTest">
<fieldset>

<!-- Form Name -->
<legend><h2 class="text-info">개인 취향테스트(GET)</h2></legend>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="textinput">성 명</label>  
  <div class="col-md-2">
  <input id="name" name="name" type="text" placeholder="성명입력" class="form-control input-md"> <%-- id는 JQuery나 Javascript를 잡는 용도로 사용 selector이다. name은 servlet에서 받기 위해서 사용  --%> 
  <span class="help-block">help</span>  
  </div>
</div>

<!-- Multiple Radios (inline) -->
<div class="form-group">
  <label class="col-md-4 control-label" for="radios">좋아하는 색</label>
  <div class="col-md-4"> 
    <label class="radio-inline" for="radios-0">
      <input type="radio" name="color" id="radios-0" value="빨강" checked="checked">
      	빨강
    </label> 
    <label class="radio-inline" for="radios-1">
      <input type="radio" name="color" id="radios-1" value="파랑">
     	파랑
    </label> 
    <label class="radio-inline" for="radios-2">
      <input type="radio" name="color" id="radios-2" value="노랑">
      	노랑
    </label> 
    <label class="radio-inline" for="radios-3">
      <input type="radio" name="color" id="radios-3" value="초록">
      	초록
    </label>
  </div>
</div>

<!-- Multiple Checkboxes (inline) -->
<div class="form-group">
  <label class="col-md-4 control-label" for="checkboxes">좋아하는 음식(다중선택)</label>
  <div class="col-md-4">
    <label class="checkbox-inline" for="checkboxes-0">
      <input type="checkbox" name="food" id="checkboxes-0" value="짬뽕">
      	짬뽕
    </label>
    <label class="checkbox-inline" for="checkboxes-1">
      <input type="checkbox" name="food" id="checkboxes-1" value="탕수육">
     	탕수육
    </label>
    <label class="checkbox-inline" for="checkboxes-2">
      <input type="checkbox" name="food" id="checkboxes-2" value="양장피">
      	양장피
    </label>
    <label class="checkbox-inline" for="checkboxes-3">
      <input type="checkbox" name="food" id="checkboxes-3" value="팔보체">
      	팔보체
    </label>
    <label class="checkbox-inline" for="checkboxes-4">
      <input type="checkbox" name="food" id="checkboxes-4" value="짜장면">
      	짜장면
    </label>
  </div>
</div>

<!-- Select Basic -->
<div class="form-group">
  <label class="col-md-4 control-label" for="selectbasic">좋아하는 동물</label>
  <div class="col-md-2">
    <select id="selectbasic" name="animal" class="form-control">
      <option value="강아지">강아지</option>
      <option value="고양이">고양이</option>
      <option value="병아리">병아리</option>
    </select>
  </div>
</div>

<!-- Button (Double) -->
<div class="form-group my_btn-group">
  <label class="col-md-4 control-label" for="button1id"></label>
  <div class="col-md-8">
    <button type="button" button1id" name="button1id" class="btn btn-success" onClick="goSubmit();">확인</button>
    <button type="reset" button2id" name="button2id" class="btn btn-danger">취소</button>
  </div>
</div>

</fieldset>
</form>
	
</div>
</body>
</html>