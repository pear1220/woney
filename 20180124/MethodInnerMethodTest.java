public class MethodInnerMethodTest
{
	public void showResult(int a, int b, int c){
		System.out.println(clac(a,b,c));
	}

	public String clac(int a,int b, int c){
		

		return "���ġ : "+ avg(a,b,c);

	}

	public double avg(int a, int b, int c){
	
		int result = sum(a,b,c); //�ڱ� �ڽ��� Ŭ���� ���ϳ����� �ٸ� �޼ҵ带 �ҷ��� ��� ��ü�� ���ʿ��ϴ�.
		double result2= (double)result/3; //casting ������ (double)������ 
		// ���� ������ ������ ��� �Ҽ��� ���� ���� �κи� �����Ѵ�. 10/3�� �Ǽ��� ���� ��� 10.0���� ������� 3.0���� ������ �Ǽ��� �ȴ�.
		//���� ����ϱ� ���ؼ��� ������ ����ȯ�� �����ش�.
		return result2;

	}

	public int sum(int a,int b, int c){
		int result = a + b + c;
		return result;
	}

}