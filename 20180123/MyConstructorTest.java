/*
	=== 생성자(constructor) 구성하기 ===

	※ 생성자(constructor)란?
	-- 객체를 생성(클래스명 객체변수명 = new 클래스명(); ) 할때 마다 자동적으로 호출되어지는 어떠한 행위를 기술한것 이라고 생각하면 된다.

	※ 생성자(constructor)의 지켜야할 규칙
	 1. 생성자(constructor)의 이름은 반드시 클래스명과 같아야 한다.
	 2. 생성자(constructor)는 반환타입(리턴타입)을 기술하면 안된다.

	※ 생성자(constructor)의 주된 역할은 일반적으로 멤버변수(인스턴스변수, 클래스변수(static 변수) )의 초기화를 하고자 하는데 있다.

*/

public class MyConstructorTest
{
	String name;
	int age;
	String addr;

	public MyConstructorTest(){

		name = "이순신";
		age = 25;
		addr = "서울시 종로구";

		System.out.println("MyConstructorTest 객체 생성완료");
	}
	
	// 파라미터가 있는 생성자//
	public MyConstructorTest(String name, int age, String addr){ //지역 변수
		// 생성자 내에서 선언되어진 변수는 지역(local)변수 이다.
		// 멤버변수명과 지역변수명이 동일할 경우 지역변수명이 우선한다.
		// 그래서 멤버변수명과 지역변수명이 동일할 경우 구분을 짓기 위한 방법이 this.멤버변수명으로 구분한다.
		this.name = name;
		this.age = age;
		this.addr = addr; 
		
		System.out.println("파라미터가 있는 MyConstructorTest 객체 생성완료");
	}

	public static void main(String[] args) 
	{
		System.out.println("여기는 첫줄 입니다.");
		
		MyConstructorTest myobj = new MyConstructorTest(); //new MyConstructorTest()는 객체가 생성되면서 자동적으로 호출되어지는 메소드다
		
		System.out.println("myobj.name : " + myobj.name);
		System.out.println("myobj.age : " + myobj.age);
		System.out.println("myobj.addr : " + myobj.addr);

		System.out.println("");


		MyConstructorTest myobj2 = new MyConstructorTest();

		System.out.println("myobj2.name : " + myobj2.name);
		System.out.println("myobj2.age : " + myobj2.age);
		System.out.println("myobj2.addr : " + myobj2.addr);
		
		System.out.println("");

		MyConstructorTest myobj3 = new MyConstructorTest("유관순", 23, "인천광역시 부평동");
		MyConstructorTest myobj4 = new MyConstructorTest("안중근", 30, "서울시 강북구"); //매개변수(파라미터)

		System.out.println("myobj3.name : " + myobj3.name);
		System.out.println("myobj3.age : " + myobj3.age);
		System.out.println("myobj3.addr : " + myobj3.addr);
		
		System.out.println("");

		System.out.println("myobj4.name : " + myobj4.name);
		System.out.println("myobj4.age : " + myobj4.age);
		System.out.println("myobj4.addr : " + myobj4.addr);
		
		myobj.myPrint();
		myobj.myPrint();
	}
	
	public void myPrint(){
		System.out.println("안녕하세요?");
	}


}
