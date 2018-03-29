/*
  --------Menu---------
   1. 가정용(liter 당 50원)
   2. 상업용(liter 당 45원)
   3. 공업용(liter 당 30원)
   4. 종료
  ---------------------
  >> 메뉴 번호를 선택하세요 => 
  >> 물 사용량을 입력하세 => 70 
	
	===가정용 고지서 ===
	사용량 : 70리터
	사용요금 : 3500원
	수도세금 : 175원(5%)
	납부액 : 3675원
	
	--------Menu---------
   1. 가정용(liter 당 50원)
   2. 상업용(liter 당 45원)
   3. 공업용(liter 당 30원)
   4. 종료
  ---------------------
  >> 메뉴 번호를 선택하세요 => 
  >> 물 사용량을 입력하세 => 70 
	
	===가정용 고지서 ===
	사용량 : 70리터
	사용요금 : 3500원
	수도세금 : 175원(5%)
	납부액 : 3675원
	//4번 누를때까지 반복
 */


package my.day6.quiz;

import java.util.Scanner;

import my.util.MyUtil;

public class SwitchTest2 {
	
	int liter,menuno;
	
	public static void menu() {
		System.out.println("--------Menu---------");
		System.out.println("1. 가정용(liter 당 50원)");
		System.out.println("2. 상업용(liter 당 45원)");
		System.out.println("3. 공업용(liter 당 30원)");
		System.out.println("4. 종료");
		System.out.println("---------------------");
		System.out.print(">> 메뉴 번호를 선택하세요 => ");
		
		
	} //end of void menu()------------------------------------------------
	
	public SwitchTest2(int liter, int menuno) {
		this.liter = liter;
		this.menuno = menuno;
		
	} //end of 객체 생성자 ----------------------------------------------------
	
	public void getliter() {
		String result =	"1. 사용량 : " + liter+"L" +
						"\n2. 사용요금 : " + MyUtil.getCommaNumber(mutisal()) + "원" +
						"\n3. 수도세금 : " + MyUtil.getCommaNumber(gettax()) +"원 (%5)" +
						"\n4. 납부액 : " + MyUtil.getCommaNumber(sumsal()) + "원\n";
		
		System.out.println(result);
		//System.exit(0); // 숫자 0은 정상적인 프로그램 종료
		//System.exit(1); // 0을 제외한 나머지 숫자는 비정상적인 프로그램 종료
		
	} // end of void getliter() -------------------------------------------
	
	public int mutisal() {
		int won = 0;
		switch (menuno) {
		case 1:
			won = 50;
			break;
		case 2:
			won = 45;
			break;
		case 3:
			won = 30;
			break;
		}
		return liter * won;
	} // end of int mutisal() --------------------------------------------
	
	public int gettax() {
		double tax = mutisal()*0.05;
		return (int)tax;
	} //end of int gettax() ----------------------------------------------
	
	public int sumsal() {
		return mutisal() + gettax();
	} //end of int sumsal() ----------------------------------------------
	
	public void getstr() {
		String str = "";
	switch (menuno){
	case 1:
		str = "===가정용 고지서 ===";
		break;
	case 2:
		str = "===상업용 고지서 ===";
		break;
	case 3:
		str = "===공업용 고지서 ===";
		break;
	} 
	System.out.println(str);
	} //end of void getstr() ----------------------------------------------
	
	public static void main(String[] args) { // return으로 종료시 메인이 호출되어 jvm으로 가서 종료되게 된다.
		
		
		
		Scanner sc = new Scanner(System.in);
		
		
		
		int menuno = 0;
		int liter = 0;
		
		outer:
		for(;true;) {
			
				try {
			
			
					SwitchTest2.menu();
					menuno = Integer.parseInt(sc.nextLine());// 지역 변수를 사용할 시 메소드가 종료 되면서 변수가 사라지게 된다. 그렇기 때문에 메인에 변수를 초기화 시켜줘야 메소드가 종료되어도 main에서도 사용이 가능하다.
					if(menuno == 4) {
				
						System.out.println("프로그램을 종료합니다.");
						break;
					}
					switch (menuno){
					case 1:
					case 2:
					case 3:
						String str = "선택하신 번호는 "+menuno+"입니다.";
						System.out.println(str);
						break;
					default:
						System.out.println("메뉴번호는 1,2,3만 가능합니다.");
						continue outer;
					} 
			
			
			
					System.out.print(">> 물 사용량을 입력하세 => ");
			
					liter = Integer.parseInt(sc.nextLine());
			
					SwitchTest2 str = new SwitchTest2(liter,menuno);
			
					str.getstr();
					str.getliter();
			
			
			
				} catch (NumberFormatException e) {
					System.out.println(">>숫자만 입력하세요!!");
					continue outer;
					//sc.close();
					//return; // 프로그램 종료
				}
		}
		
	
		
		sc.close();
		
		
		
		/*
		
		if ((menuno >=1 && menuno <=3))  {
			System.out.println("선택하신 메뉴번호는 "+ menuno + "번 입니다.");
		} else {
			System.out.println("메뉴번호는 1,2,3만 가능합니다.");
		}
		
		
		
		
		
		String sam = (menuno >=1 && menuno <=3)?"선택하신 메뉴번호는 "+ menuno + "번 입니다.":"메뉴번호는 1,2,3만 가능합니다.";
		System.out.println(sam);
		*/
	} //end of main SwichQuiz() ---------------------------------------------

}
