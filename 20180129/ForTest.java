package my.day6;

import java.util.Scanner;

public class ForTest {
	/*
	 	**** ==== 반복문(loop) ===> for 문 ****
	 	
	 	※ for 문의 형식
	 	
	 	for(초기화; 조건식 ; 증감식) {
	 		반복해서 실행할 문장;
	 	}
	 	
	 	▣ 순서 
	 	1) 초기화; 
	 	2) 조건식; (조건식이 참(true)이라면 반복해서 실행할 문장;을 실행하고 못빠져나간다.
	 	 		   조건식이 참(false)이라면 반복해서 실행할 문장;을 실행하지 않고 }을 빠져나간다)
	 	3) 증감식; 
	 	4) 조건식; (조건식이 참(true)이라면 반복해서 실행할 문장;을 실행하고 못빠져나간다.
	 	 		   조건식이 참(false)이라면 반복해서 실행할 문장;을 실행하지 않고 }을 빠져나간다)
	 	5) 증감식; 
	 	6) 조건식; (조건식이 참(true)이라면 반복해서 실행할 문장;을 실행하고 못빠져나간다.
	 	 		   조건식이 참(false)이라면 반복해서 실행할 문장;을 실행하지 않고 }을 빠져나간다)
	 */
	public void loopName(int n , String name){
		
		for (int i=0; i<5; i++) {
			System.out.println((i+1)+". " + name);
		}
		
	}
	public static void main(String[] args) {

		/*
		  1. 안녕 자바~
		  2. 안녕 자바~
		  3. 안녕 자바~
		  4. 안녕 자바~
		  5. 안녕 자바~
		  6. 안녕 자바~
		  7. 안녕 자바~
		  8. 안녕 자바~
		  9. 안녕 자바~
		  10. 안녕 자바~
		 */
		
		for (int i = 0 ; i < 10; i++) { 
			System.out.println((i+1)+". 안녕 자바~");
		}
		System.out.println("---------------");
		ForTest ft = new ForTest();
		ft.loopName(5,"설현");
		/*
		 1. 설현
		 2. 설현
		 3. 설현
		 4. 설현
		 5. 설현
		 */
		ft.loopName(20, "박보검");
		System.out.println("---------------");
		/*
		 1. Hello Java~
		 3. Hello Java~
		 5. Hello Java~
		 7. Hello Java~
		 9. Hello Java~
		 */
		for (int i =0, j = 1 ; i<5 ; i++, j+=2) {
			System.out.println(j+". Hello Java~");
		}
		
		System.out.println("---------------");
		/*
		  10. Hello 이클립스~
		  8. Hello 이클립스~
		  6. Hello 이클립스~
		  4. Hello 이클립스~
		  2. Hello 이클립스~
		 */
		for (int i =0, j = 10 ; i<5 ; i++, j-=2) {
			System.out.println(j+". Hello 이클립스~");
		}
		
		System.out.println("---------------");
		
		for (int i =5, j=10 ; i>0 ; i--,j-=2) {
			System.out.println(j+". Hello 이클립스~");
		}
		
		System.out.println("---------------");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요=> ");
		String str = sc.nextLine();//자바개발자
		
		int i =0;
		try {
			System.out.print("반복할 횟수를 입력하세요 => ");
			int n = Integer.parseInt(sc.nextLine());
			
			for (; i < n ; i++) {
				System.out.println((i+1)+"."+str);
			}
		} catch (NumberFormatException e) {
			System.out.println(">>반복횟수는 숫자만 입력가능합니다.\n 프로그램 종료!!");
			return;
		}
		
		System.out.println("반복을 다한후의 i = " +i);
		// 반복을 다한 후의 i =>10
		
		/*
		  	 10. 자바개발자
		  	 9. 자바개발자
		  	 8. 자바개발자
		  	 7. 자바개발자
		  	 6. 자바개발자
		  	 5. 자바개발자
		  	 4. 자바개발자
		  	 3. 자바개발자
		  	 2. 자바개발자
		  	 1. 자바개발자
		 */
		for (  ; i > 0 ; i--) {
			System.out.println( i+". " + str);
		}
		System.out.println("\n\n");
		
		System.out.print(">> 특수문자 1개만 입력하세요=> "); //#
			str = sc.nextLine();
		System.out.print(">> 반복횟수를 입력하세요=> ");	  //10
		i = 0;
		try {
			int n =Integer.parseInt(sc.nextLine());	
			for ( ; i < n; i++) {
				System.out.println((i+1)+"."+str);
			}
			for ( ; i > 0; i--) {
				System.out.println((i)+"."+str);
			}
			
		} catch (NumberFormatException e) {
			System.out.println(">>반복횟수는 숫자만 입력가능합니다.\n 프로그램 종료!!");
			return;
		}//반복문을 빠져나간 다음에 i는 5이다.
		/*
		 	결과물
		 	1. #
		 	2. #
		 	3. #
		 	4. #
		 	5. #
		 	5. #
		 	4. #
		 	3. #
		 	2. #
		 	1. #
		 */
		
		
	}

	

}
