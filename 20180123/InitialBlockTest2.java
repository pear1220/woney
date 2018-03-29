// 인스턴스 변수의 초기화 순서
// JVM 기본값 => 명시적 초기화 => 인스턴스 초기화 블럭 => 파라미터가 있는 생성자



public class InitialBlockTest2
{	
	String id = "leess";
	String name = "이순신";
	int age = 27;
	
	// 인스턴스 초기화 블럭
	{ id = "youjs";
	name = "유재석";
	age = 30 ;
	}
	public InitialBlockTest2(){  }

    public InitialBlockTest2(String id, String name, int age){

	this.id = id;
	this.name = name;
	this.age = age;

	}
	public static void main(String[] args) 
	{
		InitialBlockTest2 obj = new InitialBlockTest2();
		System.out.println("id : " + obj.id + ", name : " + obj.name + ", age : " + obj.age);

		System.out.println("");

		InitialBlockTest2 obj2 = new InitialBlockTest2("iyou", "아이유", 27);
		System.out.println("id : " + obj2.id + ", name : " + obj2.name + ", age : " + obj2.age);


	}
}
