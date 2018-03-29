public class MyConstructorTest2
{
	String id;
	String pwd; 
	String name;
	int age;

//	== 기본 생성자 ==
//	기본생성자는 파라미터가 있는 생성자 없을 경우 자동적으로 등록되어지지만 그러나 파라미터가 있는 생성자가 있을 경우 자동적으로 등록이 안되어진다.
//	그러므로 파라미터가 있는 생성자가 있을 경우에는 반드시 기본 생성자를 생성해주어야 한다.
	public MyConstructorTest2() {  }// 생성자를 생성하면 이와 같다


//	== 파라미터가 있는 생성자 ==
    public MyConstructorTest2(String id, String pwd, String name, int age){
	
	this.id =id;
	this.pwd =pwd;
	this.name =name;
	this.age =age;
	}


	public static void main(String[] args) 
	{
		MyConstructorTest2 myobj1 = new MyConstructorTest2();
		myobj1.id = "leess";
		myobj1.pwd = "qwer1234";
		myobj1.name = "이순신";
		myobj1.age = 25;

		System.out.println("myobj1.id : " + myobj1.id);
		System.out.println("myobj1.pwd : " + myobj1.pwd);
		System.out.println("myobj1.name : " + myobj1.name);
		System.out.println("myobj1.age : " + myobj1.age); 
		System.out.println("");

		MyConstructorTest2 myobj2 = new MyConstructorTest2("youjs", "asdf0070", "유재석", 45);

		System.out.println("myobj2.id : " + myobj2.id);
		System.out.println("myobj2.pwd : " + myobj2.pwd);
		System.out.println("myobj2.name : " + myobj2.name);
		System.out.println("myobj2.age : " + myobj2.age);
		System.out.println("");


	}
}
