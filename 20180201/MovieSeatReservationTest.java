package my.day8.quiz;

import java.util.Scanner;

public class MovieSeatReservationTest {
	String[][] Tiket = new String[5][11];
	
	public void Menu() {
		String result = "\t========== 예매메뉴 ==========\n" +
				"1.예매좌석보기  2.예매하기  3.예매취소  4.예매종료\n"+
				"\n메뉴번호 입력 =>";
				
		System.out.print(result);
	}// end of void Menu() ------------------------------
	
	
	public void beach() {
		String result = ">>영화 예매 좌석 배치도<<\n\n" +
						"\t┌─────────────┐\n" +
						"\t│   screen    │\n" +
						"\t└─────────────┘\n" +
						"  1 2 3 4 5 6 7 8 9 10";
						
						
		System.out.println(result);
		
	} //end of void beach()-----------------------------
	
	
	public void checktiket(String row,int colnum) {
		
		
		for(int i=0; i<Tiket.length;i++) {
			for(int j=0; j<Tiket[i].length;j++) {
				
				
			}
		}
		
	}//end of checktiket(String hang,int colnum)
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MovieSeatReservationTest obj = new MovieSeatReservationTest();
		
		outer:
		do {
			try {
				obj.Menu();
				int Menuno = Integer.parseInt(sc.nextLine());
				
				switch (Menuno) {
				case 1:
					obj.beach();
					break;
				case 2:
					int member =0;
					try {
						System.out.print(">>> 예매 인원수 : ");
						member = Integer.parseInt(sc.nextLine());
						
						if(member<1) {
							System.out.println(">>> 예매인원수는 1명 이상이어야 합니다.\n");
							continue;
						}//end of if()------------------
						
						} catch (NumberFormatException e) {
							System.out.println(">>> 예매인원수는 정수만 입력해야 합니다.\n");
							
						}
						System.out.println(">>> 예매하실 좌석번호 입력하세요");
						
						for(int i=0;i<member;i++) {
							String result = "==="+(i+1)+"번째 관람객 좌석 입력===\n" +
											"행(A~E)입력 => ";
							System.out.println(result);
							String row = sc.nextLine();
							System.out.println("열(1~10)입력=> ");
							int calum = Integer.parseInt(sc.nextLine());
							obj.checktiket(row,calum);
							
						}//end of for()---------------------
					
					
						
					
					break;
				case 3:
	
					break;
				case 4:
	
					break;

				default:
					break;
				}
			} catch (NumberFormatException e) {
				
			}
			
		}while(true); //end of while -----------

	}//end of void main(String[] args) ---------

}//end of class MovieSeatReservationTest ////
