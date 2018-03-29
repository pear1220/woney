package my.day7.quiz;

import java.util.Scanner;

import my.util.MyUtil;

public class NumberBingo {
	/*int a = 1;
	public void game(int num, int pcnum) {
		
			if(pcnum<num) {
				System.out.println(">>"+num+"보다 작습니다.");
			}else if(pcnum>num) {
				System.out.println(">>"+num+"보다 큽니다.");
			}else if(pcnum==num) {
				System.out.println("빙고~~ "+a+"번 맞췄습니다.");
			} else {
				System.out.println("1~100사이의 정수를 입력하세요");
			}
			a++;
		}*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//NumberBingo rnd =new NumberBingo();
		int a =1;
		int pcnum = MyUtil.Random(1, 100);
		do {
			try {
				System.out.print("1부터 100사이의 정수를 입력하세요 => ");
				int usernum = Integer.parseInt(sc.nextLine());
				
				//rnd.game(usernum, pcnum);
				if(usernum<100 && usernum>0) {
					if(pcnum<usernum) {
						System.out.println(">>"+usernum+"보다 작습니다.");
					}else if(pcnum>usernum) {
						System.out.println(">>"+usernum+"보다 큽니다.");
					}else if(pcnum==usernum) {
					System.out.println("빙고~~ "+a+"번 맞췄습니다.");
					break;
					} //end of 내부 if
					a++;
				} else {
					System.out.println("1~100사이의 정수를 입력하세요\n");
				
				} //end of 외부 if
				
			
			} catch (NumberFormatException e) {
				System.out.println("숫자를 입력하세요");
				continue;
			}
		}while(true);
	

	}//end of main()--------------------------

}

/* 	
 	컴퓨터가 1 ~ 100 사이의 랜덤한 숫자를 가진다.
	예> 59
	1부터 100 사이의 정수를 입력하세요 => 80
	>> 80보다 작습니다.
	
	1부터 100 사이의 정수를 입력하세요 => 40
	>> 40보다 큽니다.
	
	1부터 100 사이의 정수를 입력하세요 => 53
	>> 53보다 큽니다.
	
	1부터 100 사이의 정수를 입력하세요 => 59
	>> 빙고~~ 5번만에 맞췄습니다.
	
*/
