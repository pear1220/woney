public class MyConstructorTest2
{
	String id;
	String pwd; 
	String name;
	int age;

//	== �⺻ ������ ==
//	�⺻�����ڴ� �Ķ���Ͱ� �ִ� ������ ���� ��� �ڵ������� ��ϵǾ������� �׷��� �Ķ���Ͱ� �ִ� �����ڰ� ���� ��� �ڵ������� ����� �ȵǾ�����.
//	�׷��Ƿ� �Ķ���Ͱ� �ִ� �����ڰ� ���� ��쿡�� �ݵ�� �⺻ �����ڸ� �������־�� �Ѵ�.
	public MyConstructorTest2() {  }// �����ڸ� �����ϸ� �̿� ����


//	== �Ķ���Ͱ� �ִ� ������ ==
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
		myobj1.name = "�̼���";
		myobj1.age = 25;

		System.out.println("myobj1.id : " + myobj1.id);
		System.out.println("myobj1.pwd : " + myobj1.pwd);
		System.out.println("myobj1.name : " + myobj1.name);
		System.out.println("myobj1.age : " + myobj1.age); 
		System.out.println("");

		MyConstructorTest2 myobj2 = new MyConstructorTest2("youjs", "asdf0070", "���缮", 45);

		System.out.println("myobj2.id : " + myobj2.id);
		System.out.println("myobj2.pwd : " + myobj2.pwd);
		System.out.println("myobj2.name : " + myobj2.name);
		System.out.println("myobj2.age : " + myobj2.age);
		System.out.println("");


	}
}