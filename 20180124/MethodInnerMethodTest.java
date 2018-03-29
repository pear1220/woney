public class MethodInnerMethodTest
{
	public void showResult(int a, int b, int c){
		System.out.println(clac(a,b,c));
	}

	public String clac(int a,int b, int c){
		

		return "평균치 : "+ avg(a,b,c);

	}

	public double avg(int a, int b, int c){
	
		int result = sum(a,b,c); //자기 자신의 클래스 파일내에서 다른 메소드를 불러올 경우 객체가 불필요하다.
		double result2= (double)result/3; //casting 연산자 (double)데이터 
		// 정수 나누기 정수일 경우 소수점 없앤 정수 부분만 저장한다. 10/3를 실수로 만들 경우 10.0으로 만들던지 3.0으로 만들어야 실수가 된다.
		//쉽게 사용하기 위해서는 강제로 형변환을 시켜준다.
		return result2;

	}

	public int sum(int a,int b, int c){
		int result = a + b + c;
		return result;
	}

}
