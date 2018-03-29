/*
 		=== *** 자료형 *** ===
 		
 		※자료형의 종류
 		1. 원시형 타입(primitive Type)
 			1.1 정수형(byte, short, int, long)
 				-- byte(8bit == 1byte) : -2^7 ~ 2^7 -1
 										 -128 ~ 127
 										 
 				-- short(16bit == 2byte) : -2^15 ~ 2^15 -1
 										 -32,768 ~ 32,767
 										 
 				-- int(32bit == 4byte) : -2^31 ~ 2^31 -1
 				기본은 int 이다.	-2,147,483,648 ~ 2,147,483,647
 				 
 				-- long(64bit == 8byte) : -2^63 ~ 2^63 -1
 				     -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807 
 				   
 			1.2 실수형(float,double)
 				1. float : 4byte 단정밀도. 소수점 이하 7자리까지 표현
 				2. double : 8byte 배정밀도. 소수점 이하 15~16자리까지 표현
 				자바에서 실수의 기본타입은 double 이다.
 			
 			1.3 문자형(char)
 			char : 자바는 유니코드 체계를 사용함으로 문자형 타입인 char 은 2byte 이며, 범위는 0~65535이다.
 			UNICODE 표 참조
 			http://www.tamasoft.co.jp/en/general-info/unicode.html
 			
 			1.4 참 (true)또는 거짓을(false)을 담아주는 타이인 boolean
 			-- boolean 타입은 true, false 를 가진다.
 			자바의 논리형인 boolean 은 1, 0  으로 호환되지 않으며 형변환도 할 수 없다.
 */


package my.day3;

public class PrimitiveType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		byte bt1 = 10; // byte -128 ~ 127
		//byte bt2 = 200; // 표현가능한 범위를 넘었으므로 오류다
		
		short st1 = 20000;  // short -32,768 ~ 32,767
		//short st2 = 40000;  // 표현가능한 범위를 넘었으므로 오류다
		
		int it1 =  50000000;  // int -2,147,483,648 ~ 2,147,483,647
		//int it2 = 10000000000; // 표현가능한 범위를 넘었으므로 오류다
		
		long ln1 = 2000000000000000L; // 자바는 기본적으로 int로 인식하고 있기 때문에 숫자 뒤에 l 나 L을 붙여줘야된다.
		
		int a = 9; // 10진수(0~9)
		System.out.println("10진수 9 : " + a);
		
		a = 011; //8진수(0~7) => 정수 맨앞에 접두사로 숫자 0을 붙이면 8진수로 인식한다.
		
		System.out.println("8진수 011 : " + a);
		
		a = 0x11; // 16진수(0~9 A B C D E F) => 정수 맨앞에 접두사로 숫자 0x을 붙이면 16진수로 인식한다.
		// 1*16^1 + 1*16^0 = 16+1 = 17
		System.out.println("16진수 0x11 : " + a);
		
		
		System.out.println("--- **** printf 알아보기 **** ---");
		
		int b = 30 ;
		System.out.printf("10진수 %d, 8진수 %o, 16진수 %x", b,b,b);
		//10진수 30, 8진수 36, 16진수 1e
		
		a = 5;
		b = 2;
	
		System.out.println("\n-------------------------\n");
		System.out.println("a/b="+(a/b));
		// a/b =2 
		// 정수/정수 = 몫 (정수)
		
		double c=5.0;
	
		System.out.println("c/b="+(c/b));
		// c/b =2 
		// 실수/실수 = 실수
		// 정수/실수 = 실수 
		// 실수/정수 = 실수 
		
		System.out.println("a%b="+(a%b));
		// 정수 1% 정수 2 = > 정수1 을 정수2로 나눈 나머지 값
		// 5%2 =1
		
		System.out.println(" \n=========실수형==========\n");
		
		double db1 = 32.123456789;
		
		System.out.println("db1 ="+db1);
		
		float ft1 = 32.1234F;
		// 자바는 실수의 기본타입이 double이므로 float 형태로 나타내기 위해서는 숫자뒤에 f 나 F를 붙여야한다. 
		System.out.println("ft= "+ft1);
		ft1 = 32.123456789F;
		System.out.println("ft= "+ft1);
		
		System.out.println("\n======== 문자형(char) =========\n");
		char ch = '\u0041';
		System.out.println("ch = " + ch);
		// ch = A
		
		ch = '\u26A1';
		System.out.println("ch = " + ch);
		// ch = ⚡
		
		ch = '\uc774';
		System.out.println("ch = " + ch);
		//ch = 이
	
		System.out.println("-----------------");
		
		ch = '이';
		System.out.println("ch = " + ch);
		
		System.out.println("-----------------");
		ch = 65;
		System.out.println("ch = " + ch);
		
		ch = 9889;
		System.out.println("ch = " + ch);
		
		ch = 51060;
		System.out.println("ch = " + ch);
		
		/*
		 	=== 기억합시가!! ===
		 	int (4byte) 아래의 크기인
		 	byte(1byte), short(2byte), char(2byte) 타입이
		 	사칙연산 +, -, *, /을 만나면 자동적으로 int 타임으로 자동형변환이 일어난다.
		 */
		
		ch = 'a';
		System.out.println("ch = " + ch);
		// ch = a
		System.out.println("ch = " + (ch+1));
		// ch = 98
		
		//'A' => 65 ,'a' => 97
		//'B' => 66, 'b => 98
		//'C'=> 67, 'c => 99
		//대문자 +32 = 소문자
		//소문자 - 32 = 대문자
		//'0' => 48
		//'1' => 49
		//'2' => 50
		//'9' => 57
		//' '=> 32
		
		System.out.println("---퀴즈---");
		
		System.out.println("A = " + ('A'+0));
		// A = 65
		System.out.println("0 = " + ('0'+0));
		// 0 = 48
		
		System.out.println("이 = " + ('이'+0));
		// 이 = 51060
		
		System.out.println("(char)65" + (char)65);
		// A
		byte bt2 = 125;
		char ch2 = 'C';
		int it2 = bt2 - ch2;
		System.out.println("it2="+ it2);
		// it2 = 58
		
		System.out.println("\n======== boolean 타입 =========\n");
		boolean bool = false;
		System.out.println("bool = " + bool);
		//bool = false
		
		bool = 5 > 2; 
		System.out.println("bool = " + bool);
		//boot = true
		
		bool = (2.0 ==  5/2);
		System.out.println("bool = " + bool);
		//boot = true
		
		bool = ('A' == 65);
		System.out.println("bool = " + bool);
		//boot = true
		
		bool = ('A' == 'B'-1);
		System.out.println("bool = " + bool);
		//boot = true
		
		bool = ('a' != 97);
		System.out.println("bool = " + bool);
		//boot = false
		
		
	}
	
 
}














