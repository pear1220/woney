package my.day4;

import java.util.Scanner;

public class ifTest1 {

	public void execute(int n) {
		String result = (holjak(n) == 0)?"은 짝수 입니다." :"은 홀수 입니다.";
		System.out.println("입력하신 숫자 "+n+result);
	}
	public int holjak(int n) {
		//파라미터(매개변수) n 값이 홀수 이라면 1을 리턴시키고,
		//파라미터(매개변수) n 값이 짝수 이라면 0을 리턴시킨다
		
		if (n%2 == 0)
			return 0;
		else 
			return 1;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요=> ");
		
		int n = Integer.parseInt(sc.nextLine());
		
		ifTest1 obj = new ifTest1();
		obj.execute(n);
		// 입력하신 숫자 8은 짝수 입니다.
		// 입력하신 숫자 9은 홀수 입니다.
		sc.close(); // 프로그램 종료
		
		

	}

}
