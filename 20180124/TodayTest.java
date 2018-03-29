import java.util.Date;
public class  TodayTest
{
	public static void main(String[] args) 
	{
		// --- ���� �ð� ��Ÿ���� --- //
		Date now = new Date();
		System.out.println("����ð� : " + now);
		
		System.out.println("");

		String today = String.format("%tF , %tT", now, now);
		System.out.println("����ð� : " + today);

		/*
			<����>
			��¥ Ÿ�� format			����
			----------------------------------------------------------
			%tF					��¥�� yyyy-mm-dd �������� �������ִ� ��
			%tT					��¥�� �ð��� HH:MM:SS �������� �������ִ� ��
			%tP					����, ���ĸ� ���
			%tA					���ϸ� ���
			%tY					4�ڸ� �⵵�� ���
			%tB					���� �̸�(January,February ...)
			%tm					���� 01,02,03 ~~10,11,12 
			%td					�ϼ��� 1~31 �� ���
			%te					%td�� ������
			%tk					�ð��� 0~23���� ���
			%tl					�ð��� 1~12���� ���
			%tM					���� 00~59���� ���
			%ts					�ʸ� 00~59���� ���
			%tz					Ÿ������ ���(�ѱ��� KST�� ����)

		*/
	}
}