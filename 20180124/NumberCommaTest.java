import java.text.DecimalFormat;
public class NumberCommaTest
{
	public static void main(String[] args) 
	{
		long money = 34567890123L;

		System.out.println(money + "��");

		// ���ڷ� �Ǿ��� �����͸� ���ڸ� ���� �޸�(,)����ִ� ��ü�� �����Ѵ�.
		DecimalFormat df = new DecimalFormat("#,###");
		
		String strMoney = df.format(money);

		System.out.println(strMoney + "��");
	}
}
 