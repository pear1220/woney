/*
  --------Menu---------
   1. 가정용(liter 당 50원)
   2. 상업용(liter 당 45원)
   3. 공업용(liter 당 30원)
  ---------------------
  >> 메뉴 번호를 선택하세요 => 
  >> 물 사용량을 입력하세 => 70 
	
	===가정용 고지서 ===
	사용량 : 70리터
	사용요금 : 3500원
	수도세금 : 175원(5%)
	납부액 : 3675원
 */


package my.day5;

import java.util.Scanner;

public class SwitchTest2 {
	
	int liter,menuno;
	
	public static void menu() {
		System.out.println("--------Menu---------");
		System.out.println("1. 가정용(liter 당 50원)");
		System.out.println("2. 상업용(liter 당 45원)");
		System.out.println("3. 공업용(liter 당 30원)");
		System.out.println("---------------------");
		System.out.print(">> 메뉴 번호를 선택하세요 => ");
		
		
	}
	public SwitchTest2(int liter, int menuno) {
		this.liter = liter;
		this.menuno = menuno;
		
	}
	
	public void getliter() {
		String result =	"1. 사용량 : " + liter+"L" +
						"\n2. 사용요금 : " + mutisal() + "원" +
						"\n3. 수도세금 : " + gettax() +"원 (%5)" +
						"\n4. 납부액 : " + sumsal() + "원";
		
		System.out.println(result);
		
	}
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
		default:
			System.out.println("메뉴번호는 1,2,3만 가능합니다.");
			break;
		}
		return liter * won;
	}
	public int gettax() {
		double tax = mutisal()*0.05;
		return (int)tax;
	}
	public int sumsal() {
		return mutisal() + gettax();
	}
	
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
	default:
		str ="메뉴번호는 1,2,3만 가능합니다.";
		break;
	}
	System.out.println(str);
	}
	public static void main(String[] args) {
		
		SwitchTest2.menu();
		
		Scanner sc = new Scanner(System.in);
		
		
		
		int menuno = 0;
		int liter = 0;
		
		try {
			menuno = Integer.parseInt(sc.nextLine());// 지역 변수를 사용할 시 메소드가 종료 되면서 변수가 사라지게 된다. 그렇기 때문에 메인에 변수를 초기화 시켜줘야 메소드가 종료되어도 main에서도 사용이 가능하다.
			
		
		} catch (NumberFormatException e) {
			System.out.println(">>숫자만 입력하세요!!\n 프로그램 끝내겠습니다.");
			sc.close();
			return; // 프로그램 종료
		}
		
		System.out.print(">> 물 사용량을 입력하세 => ");
		try {
			
			liter = Integer.parseInt(sc.nextLine());
		
		} catch (NumberFormatException e) {
			System.out.println(">>숫자만 입력하세요!!\n 프로그램 끝내겠습니다.");
			sc.close();
			return; // 프로그램 종료
		}
		SwitchTest2 str = new SwitchTest2(liter,menuno);
		str.getstr();
		str.getliter();
		
		
		
		
		/*
		
		if ((menuno >=1 && menuno <=3))  {
			System.out.println("선택하신 메뉴번호는 "+ menuno + "번 입니다.");
		} else {
			System.out.println("메뉴번호는 1,2,3만 가능합니다.");
		}
		
		
		
		
		
		String sam = (menuno >=1 && menuno <=3)?"선택하신 메뉴번호는 "+ menuno + "번 입니다.":"메뉴번호는 1,2,3만 가능합니다.";
		System.out.println(sam);
		*/
	}

}
