package my.day7;

import my.util.MyUtil;

public class MathRandomTest {
	/*
 	java.lang.Math.random() 메소드는
 	0.0 이상 1.0 미만의 실수(double)값을 랜덤하게 나타내어주는메소드이다.
 	즉, 0.0 <= 임의의 난수(실수) < 1.0
	 */
	public static void main(String[] args) {
	
		double random = Math.random();
		System.out.println(random);
		/*
		 	랜덤(1부터 10까지의 범위를 구한다. ==> 구간범위 : 10-1+1=10)
		 	0.0 * 구간범위(10) ==>0.0 (int)0.0 ==> 0 + 시작값(1) ==> 1
		 	0.34 * 구간범위(10) ==> 3.4	(int)3.4 ==> 3 + 시작값(1) ==> 4
		 	0.567 * 구간범위(10) ==> 5.67	(int)5.67 ==> 5 + 시작값(1) ==> 6
		 	0.999 * 구간범위(10) ==> 9.99	(int)9.99 ==> 9 + 시작값(1) ==> 10
		 	
		 	
		 	랜덤(13부터 18까지의 범위를 구한다. ==> 구간범위 : 18-13+1=6)
		 	0.0 * 구간범위(6) ==>0.0 (int)0.0 ==> 0 + 시작값(13) ==> 13
		 	0.34 * 구간범위(6) ==> 2.04	(int)2.04 ==> 2 + 시작값(13) ==> 15
		 	0.567 * 구간범위(6) ==> 3.402	(int)3.402 ==> 3 + 시작값(13) ==> 16
		 	0.999 * 구간범위(6) ==> 5.994	(int)5.994 ==> 5 + 시작값(13) ==> 18
		 	
		 	램덤한 정수 = (int)(Math.random()*구간범위)+시작값;
		 */
		System.out.print("1 부터 10까지중 랜덤하게 발생한 값");
		System.out.print(MyUtil.Random(1,10));
		
		System.out.print("\n\n");
		
		System.out.print("13 부터 18까지중 랜덤하게 발생한 값");
		System.out.print(MyUtil.Random(13,18));
		
		System.out.println("\n===================================");
		
		char ch =(char)MyUtil.Random('A', 'Z');//char는 사칙연산을 만나면 int로 변경됨 또한 char는 자동으로 형변환됨
		System.out.println("a 부터 z까지 중 랜덤하게 발생한 소문자: "+ ch);
		
	}

}
