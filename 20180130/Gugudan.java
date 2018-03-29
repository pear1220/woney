package my.day6;

import java.util.Scanner;

public class Gugudan {
	public void sum(int start, int end) { //1, 10 ==> 10-1 + 1
										  //3, 10 ==> 10-3 + 1
										  //1, 2 ==> 2-1 + 1

		int sum = start;
		for(int i=0, j = start ; i<(end-start+1); i++,j++) {
			sum +=j;
		}
		System.out.print(start+"부터"+end+"까지의 합은 "+sum+"입니다.");
	}//end of void sum(int start, int end) =============
	
	public void gugudan(int start, int end) { // 5,8 => 8-5+1
		for(int i = 0, row =1 ; i < 9 ; i++, row++) {
			for(int j = 0, col=start ; j<(end-start+1); j++, col++) {
				String tab = (col==end)?"\n":"\t";
				System.out.print(col+"*"+row+"="+(col*row) + tab);
			}
		}
	}// end of void gugudan(int start,int end) ===============
	
	
	public static void main(String[] args) {
		
		System.out.println("======= 구구단 =======");
		
		for(int i=0 , row = 1;i<9;i++, row++) {
			for(int j=0 ,col = 2;j<8;j++,col++) {
				String tab = (col == 9)?"\n" : "\t";
				System.out.print(col + "*" + row + "=" + (col*row)+tab);
			}
		}
		
		/*
		 	문제 1) 
		 	첫번째 수 => 2
		 	두번째 수 => 10
		 	결과) 2부터 10까지의 합은 54
		 */
		Scanner sc = new Scanner(System.in);
		Gugudan obj = new  Gugudan();
		
	
		try {
			System.out.print("첫번째 수 => ");
			int num1 = Integer.parseInt(sc.nextLine());
			System.out.print("두번째 수 => ");
			int num2 = Integer.parseInt(sc.nextLine());
			obj.sum(num1,num2);
			System.out.println("\n");
			
			System.out.print("시작단 => ");
			num1 = Integer.parseInt(sc.nextLine());
			System.out.print("마지막단 => ");
			num2 = Integer.parseInt(sc.nextLine());
			obj.gugudan(num1,num2);
			} catch (NumberFormatException e) {
			System.out.println("숫자가 아닙니다. 종료합니다.");
			sc.close();
			return;
		}
		/*
		try {
			System.out.print("첫번째 수 => ");
			int num1 = Integer.parseInt(sc.nextLine());
			System.out.print("두번째 수 => ");
			int num2 = Integer.parseInt(sc.nextLine());
			int sum = 0;
			for(int i = num1 ; i <=num2 ; i++) {
				sum += i;
			
			}System.out.println("결과) "+num1+"부터"+ num2 + "까지의 합은 " + sum);
		} catch (NumberFormatException e) {
			System.out.println("숫자가 아닙니다. 종료합니다.");
			sc.close();
			return;
		}
		
		System.out.println("\n\n");
		 	
		/* 	
		 	문제2)
		 	시작단 => 5
		 	마지막단 => 8
		 	
		 */
		/*
		try {
			System.out.print("시작단 => ");
			int num1 = Integer.parseInt(sc.nextLine());
			System.out.print("마지막단 => ");
			int num2 = Integer.parseInt(sc.nextLine());
			
			for(int i = 0, n = 1 ; i < 9 ; i++,n++) {
				for(int j = num1 ; j <=num2 ; j++ ) {
					String str = (j==num2)?"\n":"\t";
					System.out.print( j +"*"+ n +"="
					 + (j*n)+str);
				}
			}
				
			
		} catch (NumberFormatException e) {
			System.out.println("숫자가 아닙니다. 종료합니다.");
			sc.close();
			return;
		}
		sc.close();
		*/

	}//end of main()----------------------------

}//end of class Gugudan ////////////////////////////////

/*
 	2*1=2	3*1=3	4*1=4	......	9*1=9
 	2*2=4	3*2=6	4*2=8	......	9*2=18
 	2*3=6	3*3=9	4*3=12	......	9*3=27
 	...................................
 	2*8=16	3*8=24	4*8=32	......	9*8=72
 	2*9=18	3*9=27	4*9=36	......	9*9=81
 */
