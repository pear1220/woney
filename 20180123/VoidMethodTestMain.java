//������ ��ο� ���� ��� import�� �� �ʿ䰡 ���� �ٸ� ����� Ŭ���� ������ ������ import������ߵȴ�.
public class VoidMethodTestMain
{

	public static void main(String[] args) 
	{
		Member member1 = new Member("kangkc", "qwer1234", "������", 34, 178.9);
		Member member2 = new Member("suji", "asdf0070", "����", 29, 188.2);
		
		member1.infoPrint();
		//�޼ҵ�� Ŭ������� �޶�� �ϸ� ù���ڴ� �ҹ����̴�.

		System.out.println("");

		member2.infoPrint(); //������ ���� ȣ�� member2�� �ִ� ���� Meber Ŭ���� �ȿ� �ִ� infoPrint() �޼ҵ� �ȿ��ִ� ������ ����

		
	}
}
