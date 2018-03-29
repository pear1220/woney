package my.day7;

import java.util.Random;

import my.util.MyUtil;

public class RandomTest {

	public static void main(String[] args) {

		Random rnd = new Random();
		
		System.out.println("1부터 10까지 중 랜덤한 수: ");
		int rndnum = rnd.nextInt(10);
					//rnd.nextInt(10) 0부터 9사이의 랜덤한 수 출력 
					//rnd.nextInt(10)+1 1부터 10까지 랜덤수 출력
		System.out.println(rndnum);

		System.out.println("\n13부터 18까지 중 랜덤한 수: ");
		// min 부터 max 사이의 랜덤한 정수를 얻으려면
		//int rndnum = rnd.nextInt(max - min + 1) + min;
		//int rndnum = rnd.nextInt(18 - 13 + 1) + 13;
		//int rndnum = rnd.nextInt(6) + 13;
		//			   0  1  2  3  4  5
		//			   13 14 15 16 17 18]
		
		System.out.print(MyUtil.Random(13, 18));
		
		System.out.println("\n===================================");
		
		char ch =(char)MyUtil.Random('a', 'z');//char는 사칙연산을 만나면 int로 변경됨 또한 char는 자동으로 형변환됨
		System.out.println("a 부터 z까지 중 랜덤하게 발생한 소문자: "+ ch);
	}

}
