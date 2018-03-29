// 1줄 주석문

/*
	여러줄 
	주석문
*/

/**
	문서화 주석
	==> javadoc를 이용해서 API 문서를 만들때 사용한다.
*/

// ==== *** CLASS(클래스)의 구조 *** ====
/*
CLASS(클래스)는 어떠한 어플리케이션 제작시 필요한 설계도면 이라고 생각하자.
	
	1. 패키지 선언문
	   ==> 패키지랑 클래스가 저장되어진 디렉터리 경로라고 보면된다.

	   package 패키지명;		==> 이때 패키지명은 반드시 소문자로 시작해야 한다

	예 > packge my.com;

	2.IMPORT 문

	예 > import 패키지명.클래스명;
		import java.lang.String;
		import java.lang.System;
		import java.lang.*;
	사이트 : https://docs.oracle.com/javase/8/docs/api/index.html

	3. 클래스 선언문

	4. 컴파일하기

	5. 실행하기
*/
//import java.lang.String;
//import java.lang.System;

//import java.lang.*;  .* lang안에 있는 패키지를 전부 쓰겠다라는 뜻 lang은 빈번하게 사용하기 때문에 따로 import를 안해도 import하게 되어진다.

import java.util.Date;

public class HELLO // 클래스명과 파일 저장명은 동일해야된다.
{
	public static void main(String[] args) 
	{
		System.out.println("Hello Java!");
		System.out.println("안녕하세요? 반갑습니다. ~~^^"); //()는 메소드이거나 인스트럭터(생산자) 이다
		// System.out 은 모니터(콘솔화면)를 뜻한다.
		// System.out.println("안녕하세요? 반갑습니다. ~~^^"); 은 
		// 모니터(콘솔화면)에 문자열 안녕하세요? 반갑습니다. ~~^^ 을 출력해라는 말이다.
		// System.out.println("문자열"); 은 실행한 후 자동적으로 줄바꿈이 일어난다. 

		System.out.print("Hi Java"); // 줄바꿈이 없다
		System.out.print("열심히 합시다.");
		// System.out.print("문자열"); 은 실행한 후 자동 줄바꿈이 발생하지 않는다.
		System.out.print("\n나는 자바를 공부합니다.");
		// \n 이 한줄 바꿈을 말한다.

		System.out.print("\nThe End~~\n");
		System.out.print("안녕히 가세요~~");

//		System.out.print("\n");
		System.out.println("");// \n과 "" 는 동일하게 한줄 바꿈을 의미한다.

		System.out.println(new Date());
		// 현재날짜를 나타내어 본다.
		// new Date()가 현재 시스템의 날짜시간을 얻어오는 것이다.

	}
}