package my.day4;

import java.io.IOException;

public class IfTest3 {

	public void execute(int n) {
		char ch = (char)n;
		String result = "";
		if (Character.isDigit(ch)) { // 참이면 숫자9
			result = "숫자";
		} else if (Character.isUpperCase(ch)) { //대문자 이면 참
			result = "대문자";
		}else if (Character.isLowerCase(ch)) { //소문자 이면 참
			result = "소문자";
		} else {
			result = "특수기호";
		}
		
		System.out.println("입력하신 문자 "+ ch +"는 "+ result +"입니다.");
			
		
	}
	
	public static void main(String[] args) 
			throws IOException {
		System.out.print("글자 1개를 입력하세요 =>");
		int n = System.in.read(); //글자 앞에 한개만 받아온다
		
		IfTest3 obj = new IfTest3();
		obj.execute(n);
		

	}
	


}
