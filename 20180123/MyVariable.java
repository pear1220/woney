/*
		== ������ ���� ==

		1. �������(member ����) -->
			1.1 Ŭ���� ����(== static ����)
			1.2 �ν��Ͻ� ����(instance ���� == non static ����)
			-- �������(member ����) �� ���Ǿ����� ������ �ش� Ŭ���� (������ MyVariable ��) ������ ��𼭳� ��밡���ϴ�.

			-- �������(member ����) �� ����Ǿ����� ��ġ�� �Ϲ������� �ش� Ŭ������ �ٷ� �Ʒ��� ����ȴ�.

			-- ���� ������ ���� �ο�(== ������ �ʱ�ȭ)���� �ʴ��� �ڵ������� JVM(Java Virtual Machine) �� �˾Ƽ� �⺻���� �ο����ش�.
			   ������(byte, short, int, long) Ÿ���� �⺻���� 0���� �ʱ�ȭ �ǰ�, �Ǽ���(float, double) Ÿ���� �⺻���� 0.0���� �ʱ�ȭ �ǰ�
			   char Ÿ���� �⺻���� ' ' ���� �ʱ�ȭ �ǰ�, object Ÿ���� �⺻���� null(�������� �ʴ°�) �ʱ�ȭ �ȴ�.

			-- Ŭ��������(static ����) �� ������ �ϱ� ���ؼ��� ��ü(Object)�� �������� �ʰ� �ٷ� Ŭ������.Ŭ���������� �����Ѵ�.
			   Ŭ��������(static ����)�� �ش� Ŭ������ �����Ǿ��� ��ü���� �����ؼ� ����Ѵ�.

			-- �ν��Ͻ�����(non static ����) �� ������ �ϱ� ���ؼ��� ��ü(Object)�� ������ �� ��ü��.�ν��Ͻ������� �����Ѵ�.
			   �ν��Ͻ�����(non static ����)�� �ش� ��ü������ ����ϴ� ���̴�.

			-- Ŭ��������(static ����)�� Ŭ������ ����Ǿ��� �� �����Ǿ�����, �ν��Ͻ�����(non static ����)�� ��ü�� �����Ǿ����� �����ȴ�.

			-- �ش� ���α׷��� �����ϸ� Ŭ��������(static ����)�� �ν��Ͻ�����(non static ����)�� ���̻� ������� ������(������)�� �ǹǷ� JVM����
			   ������ �÷��Ͱ� �۵��Ͽ� �ڵ������� �޸𸮿��� �Ҹ�����ش�.

		2. ��������(local ����)
			-- ��������(local ����) �� ���Ǿ����� ������
			   ��������(local ����) �� ������ {   } �������� ��밡���ϴ�.

			-- ��������(local ����) �� Ư�� �޼ҵ峻������, ������(instructor)������ ����Ǿ����� ���̴�.

			-- �������� ����Ǿ��� {  } �� ����� �ڵ������� �Ҹ�ȴ�.

* JVM (Java Virtual Machine) �� �ü���� ������ ���ư��� ��
*/


public class MyVariable
{
	int a = 10; // = �� ���ٰ� �ƴ϶� �����Ѵٴ� ���̴�. =�� ���Կ����ڶ� �θ���.
	static int b = 20; 
	//���� �ٰ�� ����� �ʱ�ȭ��� �Ѵ�.

	int no1;
	static int no2;
	// ���� ���� ��� JVM �⺻ �ʱ�ȭ��� �Ѵ�

	String name1 = "�Ѽ���";
	static String name2 = "�μ���";
	
	String id;
	String pwd;
	String name;
	static String address;


	public static void main(String[] args) 
	{
		int c = 30;

		MyVariable myobj = new MyVariable();
		// myobj�� Ŭ���� MyVariable();�� ��ü ������ �θ���.
		// myobj�� Ŭ���� MyVariable();�� �ν��Ͻ�(instance)�� �θ���.
		// new MyVariable(); �� ��ü(object)�����̶�� �ϰ� �ν��Ͻ�(instance)ȭ �Ѵ� ��� �Ѵ�.

		System.out.println("a :" + myobj.a);
		// "���ڿ�" + ������ ���� + �� ���ϱⰡ �ƴ϶� ���ڿ� ������ ���Ѵ�. ���տ�����
		// �׷��� "���ڿ�" + 10�� "���ڿ�10"���� ���´�.

		//System.out.println("b :" + b);			//�����
		//System.out.println("b :" + myobj.b);		//�����
		System.out.println("b :" + MyVariable.b);	//����

		System.out.println("c :" + c);

		System.out.println("\r\n==================\r\n");

		int no3 = 0; // ��������(local) ������ �ݵ�� �ʱ�ȭ�� ���־�� �Ѵ�.

		System.out.println("no1 :" + myobj.no1);
		System.out.println("no2 :" + MyVariable.no2);
		System.out.println("no3 :" + no3);

		System.out.println("\r\n-------------------\r\n");

	 	System.out.println("name1 :" + myobj.name1);
		System.out.println("name2 :" + MyVariable.name2);

		System.out.println("\r\n==================\r\n");

		MyVariable member1 = new MyVariable();
		member1.id = "sonsm";
		member1.pwd = "qwer1234";
		member1.name = "�ռ���";
		MyVariable.address = "��⵵ �����ν�";

		MyVariable member2 = new MyVariable();
		member2.id = "kimms";
		member2.pwd = "asdf0070";
		member2.name = "��μ�";
		member2.address = "����� ������";

		System.out.println("=======member1=======");
		System.out.println("member1.id : " + member1.id);
		System.out.println("member1.pwd : " + member1.pwd);
		System.out.println("member1.name : " + member1.name);
		System.out.println("member1.address : " + member1.address);


		System.out.println("\r\n=======member2=======");
		System.out.println("member2.id : " + member2.id);
		System.out.println("member2.pwd : " + member2.pwd);
		System.out.println("member2.name : " + member2.name);
		System.out.println("member2.address : " + member2.address);



	}
}
