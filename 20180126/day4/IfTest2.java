package my.day4;

import java.io.IOException;
import java.util.Scanner;

public class IfTest2 {

	public void execute(int n) {
		char ch = (char)n;
		String result = "";
		if (('A' <= ch && ch <='Z') || ('a' <= ch && ch <='z')) {
			result = "영문자";
		} else if ('0' <= ch && ch <'9') {
			result = "숫자";
		} else {
			result = "특수기호";
		}
		
		System.out.println("입력하신 문자 "+ ch +"는 "+ result +"입니다.");
			
		
	}
	
	public static void main(String[] args)
		throws IOException {

		System.out.print("글자 1개를 입력하세요 =>");
		int n = System.in.read(); //글자 앞에 한개만 받아온다
		
		IfTest2 obj = new IfTest2();
		obj.execute(n);
		
		System.out.println("n : "+n);
		
		// 입력하시 문자는 a는 영문자 입니다.
		// 입력하시 문자는 7는 숫자 입니다.
		// 입력하시 문자는 #는 특수기호 입니다.
		
		
		
		
	/*
		Scanner sc = new Scanner(System.in);
		
		System.out.print("글자 1개를 입력하세요 =>");
		
		sc.nextLine();
	*/
	}

}
