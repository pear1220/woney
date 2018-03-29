package my.day3;

public class ReferenceTypeTest {

	public static void main(String[] args) {

		/* === ReferenceType(참조형 타입) === */
		
		Member me = new Member();
		me.id = "suji";
		me.passwd = "qwer1234";
		me.name = "수지";
		me.age = 23;
		me.addr = "서울시 강남구 ";

		Member suji = new Member();
		suji.id = "suji";
		suji.passwd = "qwer1234";
		suji.name = "수지";
		suji.age = 23;
		suji.addr = "서울시 강남구 ";
		
		Member youjs = suji; //객체변수에 다른 객체변수를 넣으면 suji 메모리 주소를 youjs가 사용하게 된다. 그렇기 때문에 suji의 데이터가 변경되면 youjs값도 변경되며 me의 값은 변경되지 않는다.
		
		System.out.println("me => " + me);
		//my.day3.Member@70dea4e // @다음에 있는 값은 메모리상의 주소이다
		
		System.out.println("suji => " + suji);
		//my.day3.Member@5c647e05 // @다음에 있는 값은 메모리상의 주소이다
		
		System.out.println("suji => " + youjs);
		//my.day3.Member@5c647e05 
		
		System.out.println("");
		
		boolean bool = (me == suji);
		System.out.println("bool => " + bool);
		//bool : false
		
		bool = (youjs == suji);
		System.out.println("bool : " + bool);
		//bool : ture
		
		System.out.println("\n =====데이터 변경 후=====\n");
		
		me.setId("leess");
		me.setName("이순신");
		me.setAddr("경기도 수원시");
		
		System.out.println("me => " + me);
		System.out.println("suji => " + suji);
		System.out.println("youjs => " + youjs);
		
		System.out.println("###################");
		
		youjs.setId("youjs");
		youjs.setName("유재석");
		youjs.setAddr("인천광역시");
		
		System.out.println("me => " + me);
		System.out.println("suji => " + suji);
		System.out.println("youjs => " + youjs);
		
		
		
	}

}
