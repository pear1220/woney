// �ν��Ͻ� ������ �ʱ�ȭ ����
// JVM �⺻�� => ����� �ʱ�ȭ => �ν��Ͻ� �ʱ�ȭ �� => �Ķ���Ͱ� �ִ� ������



public class InitialBlockTest2
{	
	String id = "leess";
	String name = "�̼���";
	int age = 27;
	
	// �ν��Ͻ� �ʱ�ȭ ��
	{ id = "youjs";
	name = "���缮";
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

		InitialBlockTest2 obj2 = new InitialBlockTest2("iyou", "������", 27);
		System.out.println("id : " + obj2.id + ", name : " + obj2.name + ", age : " + obj2.age);


	}
}
