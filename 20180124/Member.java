/*
	�� �޼ҵ�(method)��?
	
	-- Ŭ�����ȿ��� �����Ǿ��� ������ �Լ���� �����ϸ� �ȴ�.
	   ���Ը��ؼ�, ��� �ൿ�̳� ������ ��ü������ �����Ͽ� �����Ѱ� �̶�� ���� �ȴ�.

	-- �޼ҵ�(method)�� �ݵ�� ����Ÿ���� �������־�� �Ѵ�.
	   ����Ÿ���� ������ �� ����Ÿ�Կ� �ش��ϴ� Ÿ��(String, int, double..)�� ������ְ�
	   ����Ÿ���� ���� �޼ҵ�(method)�̶�� ����Ÿ���� �����ϴٶ�� ���� void�� ������־�� �Ѵ�.

	�� �޼ҵ�(method)�� ����
	
	1. �ν��Ͻ� �޼ҵ�(instance method)
		-- ��ü��.�޼ҵ��();

	2. ����ƽ �޼ҵ�(static method == Ŭ���� �޼ҵ�)
		-- Ŭ������.�޼ҵ��();
*/

public class Member
{
	String userid;
	String passwd;
	String name;
	int age;
	double height;
	int hopeMonthsal;
	
	public Member(){ }

	public Member(String userid, String passwd, String name, int age, double height,int hopeMonthsal){
		this.userid = userid;
		this.passwd = passwd;
		this.name = name;
		this.age = age;
		this.height = height;
		this.hopeMonthsal = hopeMonthsal;
	
	}

	//�ν��Ͻ� �޼ҵ� ����
	public void infoPrint(){ //void ����Ÿ���� ����.
		System.out.println("���̵�: " + userid);
		System.out.println("�� ȣ: " + passwd);
		System.out.println("�� ��: " + name);
		System.out.println("�� ��: " + age + "��");
		System.out.println("����: " + height + "cm");
	}
	
	//���ϰ��� ���� �޼ҵ�
	public String getName() { 
		return name;
	}
	
	public int getAge() { 
		return age;
	}
	public double getHeight() {
		return height;
	}

	public String getPasswd(){
		return passwd;
	}

//���� ����
	public void changeMyinfo(String passwd, int age, double height, int hopeMonthsal) {
		this.passwd = passwd;
		this.age = age;
		this.height = height;
		this.hopeMonthsal = hopeMonthsal;

	}
	

	//get ���� ���´� set ���� �־��ش�
	public int getHopeYearsal() {
		return hopeMonthsal * 12;
	}

	public String setHopeMothsal(int newHopeMothsal){
		int beforeChangeSal = hopeMonthsal;
		hopeMonthsal = newHopeMothsal;
		return name + "���� ���� ������޿� " + beforeChangeSal + "�������� " + hopeMonthsal + "�������� ����Ǿ����ϴ�.\n";
	}

	public void showInfomation(){
		/* System.out.println("=== "+name+"���� ���� ===");
		System.out.println("1. ���̵�: "s + userid);
		System.out.println("2. �� ȣ: " + passwd);
		System.out.println("3. �� ��: " + name);
		System.out.println("4. �� ��: " + age + "��");
		System.out.println("5. ����: " + height + "cm"); 
		System.out.println("6. ��� ���޿�: " + hopeMonthsal + "����");
		*/

		String result = "=== "+name+"���� ���� ===\n" +
						"1. ���̵�: " + userid +
						"\n2. �� ȣ: " + passwd +
						"\n3. �� ��: " + name +
						"\n4. �� ��: " + age + "��"+
						"\n5. ����: " + height + "cm" +
						"\n6. ��� ���޿�: " + hopeMonthsal + "����";
		System.out.println(result);
	}

		//*** static �޼ҵ�(Ŭ���� �޼ҵ�) ���� ***//

		public String getStrYearSal(){
			return MyUtil.getMoney(hopeMonthsal * 12);
		}


}