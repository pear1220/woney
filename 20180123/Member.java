public class Member
{
	String userid;
	String passwd;
	String name;
	int age;
	double height;
	
	public Member(){ }

	public Member(String userid, String passwd, String name, int age, double height){
		this.userid = userid;
		this.passwd = passwd;
		this.name = name;
		this.age = age;
		this.height = height;

	
	}

	// �޼ҵ� ����
	public void infoPrint(){ //void ����Ÿ���� ����.
		System.out.println("���̵�: " + userid);
		System.out.println("�� ȣ: " + passwd);
		System.out.println("�� ��: " + name);
		System.out.println("�� ��: " + age + "��");
		System.out.println("����: " + height + "cm");
	}
}
