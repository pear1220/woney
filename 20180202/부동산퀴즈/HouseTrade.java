package my.day9;

import java.util.Scanner;

public class HouseTrade {
	
	
	public void menu() {
		String result = "------->> 메뉴 << ---------\n" +
						 "1. 매매주택조회\n" +
						 "2. 전세주택조회\n" +
						 "3. 월세주택조회\n" +
						 "4. 종료\n" +
						 "----------------------------\n" +
						 ">> 선택하세요 => ";
		System.out.print(result);
	}
	public void selecttrade(House[] housearr, int number) {
		int flag =0;
		
		for(int i=0;i<housearr.length;i++) {
			if(housearr[i] != null) {
				if(housearr[i].housetrade == number ) {
					flag =1;
					System.out.println(housearr[i].houseid + ". " + housearr[i].address+" "+housearr[i].price+"백만원");
				}//end of 내부 if-----------------------------
			}//end of 외부 if
		}//end of for ----------------------------------
		
		if(flag ==0) {
			System.out.println("선택하신 매물이 없습니다.");
		}//end of if --------------------------------
		
	}//end of selecttrade(House[] housearr, int number)

	public void detaild(House[] housearr,String id) {
		int flag = 0;
		char cheakid =0;
		for(int i=0; i<housearr.length ; i++) {
			
			if(housearr[i] != null) {
		
					
						if(housearr[i].houseid.equals(id)) {
							flag =1;
							housearr[i].showInfo();
					
					}// end of 두번째 if
			
				}//end of 첫번째 if
			
		} //end of for-------------------------
		if(flag == 0) {
			System.out.println("죄송합니다. 매물번호가 없습니다.");
		}
	}//end of detaild(House[] housearr,String id)
	

	public void houseTrade(House[] housearr) {
		Scanner sc = new Scanner(System.in);
		HouseTrade obj =new HouseTrade();
		do {
			int number=0;
			String id="";
			try {
				obj.menu();
				number = Integer.parseInt(sc.nextLine());
		
			} catch (NumberFormatException e) {
				System.out.println("숫자만 입력하세요");
				continue;
			}//end of try----------------------------------------
			
			if(number==1) {
				
				obj.selecttrade(housearr,number);
							
				System.out.print("조회하고자 하는 매물번호를 선택하세요 =>");
				id = sc.nextLine();
				obj.detaild(housearr,id);
				
				System.out.println(" >> 1. 되돌아가기 / 2. 종료하기");
				System.out.print("선택하세요 => ");
				number = Integer.parseInt(sc.nextLine());
				
				if (number == 1) {
					continue;
				} break;
				
			} else if(number ==2) {
				obj.selecttrade(housearr,number);
				
				
				System.out.print("조회하고자 하는 매물번호를 선택하세요 =>");
				id = sc.nextLine();
				obj.detaild(housearr,id);
				
				System.out.println(" >> 1. 되돌아가기 / 2. 종료하기");
				System.out.print("선택하세요 => ");
				number = Integer.parseInt(sc.nextLine());
				
				if (number == 1) {
					continue;
				} break;
				
				
			}else if(number ==3) {
				obj.selecttrade(housearr,number);
				
			
				System.out.print("조회하고자 하는 매물번호를 선택하세요 =>");
				id = sc.nextLine();
				obj.detaild(housearr,id);
				
				System.out.println(" >> 1. 되돌아가기 / 2. 종료하기");
				System.out.print("선택하세요 => ");
				number = Integer.parseInt(sc.nextLine());
				
				if (number == 1) {
					continue;
				} break;
			}else if(number ==4) {
				
				break;
			} else {
				System.out.println("1~4번만 입력하세요.");
			}
			
		}while(true);//end of while-----------------------
		System.out.println("시스템을 종료합니다.");
	}//end of void houseTrade() ------------------------
}//end of Class HouseTrade()
