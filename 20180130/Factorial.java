package my.day6;

import java.util.Scanner;

public class Factorial {
	
	public static int calc1(int num) { //5
		
		//5*4*3*2*1
		int result = 1; //누적곱에 쓰이는 변수
		
		for(int i=num; i>0; i--) {
			result *=i;	//result = 5*1
						//result = 5*4*3*2*1
		}
		
		return result;
	}//end of int calc1() ---------------------
	
	public static int calc2(int num) {
		// 5! ==>  5*4*3*2*1
		if(num == 1) 
			return 1;
		else 
			return num*calc2(--num); // 재귀호출이란? 메소드 자신이 자신의 메소드를 호출하는것을 말한다.
		// 5*4*3*2*calc2(1)
		// 5*4*3*2*1*calc2(0)
		// 5*4*3*2*1*0*calc2(-1)
	}//end of int calc2()-----------------
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
			for(;true;) {
			try {
			
			System.out.print("1. 알고 싶은 팩토리얼 수 입력 ==> ");
			int num = Integer.parseInt(sc.nextLine());
			
			//int result = Factorial.calc1(num);
			int result = Factorial.calc2(num);
			
			System.out.println("2. 정답 : " + result);
			
			
			System.out.print(">> 계속 할래요?(예:Y , 아니요:N) ==>");
			String go = sc.nextLine();
			if(go.equals("N") || go.equals("n")) 	break;
			else if (go.equals("Y") || go.equals("y")) continue;
			else System.out.println("Y와 N만 입력해주세요!!");
			
			
			
			} catch (NumberFormatException e) {
			System.out.println("정수만 입력하세요!!");
			continue;
			}//end of try catch()---------------
		}//end of for문()-------------------
		System.out.println("프로그램 종료합니다.!!");
		sc.close();
	}//end of main()------------------------

}
