//������ ��ο� ���� ��� import�� �� �ʿ䰡 ���� �ٸ� ����� Ŭ���� ������ ������ import������ߵȴ�.
public class VoidMethodTestMain
{

	public static void main(String[] args) 
	{
		Member member1 = new Member("kangkc", "qwer1234", "������", 34, 178.9, 250);
		Member member2 = new Member("suji", "asdf0070", "����", 29, 188.2, 240);
		
		
		member1.infoPrint();
		//�޼ҵ�� Ŭ�������� �޶�� �ϸ� ù���ڴ� �ҹ����̴�.

		System.out.println("");

		member2.infoPrint(); //������ ���� ȣ�� member2�� �ִ� ���� Meber Ŭ���� �ȿ� �ִ� infoPrint() �޼ҵ� �ȿ��ִ� ������ ����

		System.out.println("\r\n======���� ���� �ִ� �޼ҵ�(������ ���� ��)======\r\n");
		
		String  name = member1.getName();
		String passwd = member1.getPasswd();
		int age = member1.getAge();
		double height = member1.getHeight();
		int HopeYearsal = member1.getHopeYearsal();
		
		
		
		System.out.println(name + "���� ��ȣ�� " + passwd + " �̰� \n���̴� " + age + "���̰� \n������ " + height + "cm �̰� \n��������� " + HopeYearsal +"���� �Դϴ�.");

		// ���������� ��ȣ�� qwer1234�̰� ���̴� 34���̰� ������ 178.9cm �Դϴ�.

		System.out.println("\r\n======������ ���� ��======\r\n");
		
		member1.changeMyinfo("abcd", 25, 167.5, 300);

		name = member1.getName();
		passwd = member1.getPasswd();
		age = member1.getAge();
		height = member1.getHeight();
		HopeYearsal = member1.getHopeYearsal();

		System.out.println(name + "���� ��ȣ�� " + passwd + " �̰� \n���̴� " + age + "���̰� \n������ " + height + "cm �̰� \n��������� " + HopeYearsal +"���� �Դϴ�.");
		// ���������� ��ȣ�� abcd�̰� ���̴� 25���̰� ������ 167.5cm �Դϴ�.
	
		System.out.println("\n===========��� ���� ������ ���ڿ��� ����===========\n");
		String result = member1.setHopeMothsal(400);

		System.out.println(result);
		
		System.out.println("\n===========����=========\n");

		member1.showInfomation();
		/*
			=== ���������� ���� ===
			1. ���̵� : kangkc
			2. ��ȣ : abcd 
			3. ���� : ������
			4. ���� : 25��
			5. ���� : 167.5cm
			6. ��� ���޿� : 400����
		*/
		
		
		System.out.println("\n========�ν��Ͻ� �޼ҵ� ���=========\n");

		Member member3 = new Member("leess", "1234", "�̼���", 49, 180.2, 5000000);


		//String strYearsal = member3.getStrYearSal();

		System.out.println(member3.getName() + "���� ��������� " + member3.getStrYearSal() + "�� �Դϴ�.\n");


		System.out.println("\n========Ŭ���� �޼ҵ� ���=========\n");
		
		System.out.println("����ð�: " + MyUtil.getNowTime() );
		
	}
}