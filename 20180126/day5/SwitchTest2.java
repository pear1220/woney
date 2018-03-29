


package my.day5;

import java.util.Scanner;

public class SwitchTest2 {
	
	public static void menu() {
		System.out.println("--------Menu---------");
		System.out.println("1. 가정용(liter 당 50원)");
		System.out.println("2. 가정용(liter 당 45원)");
		System.out.println("3. 가정용(liter 당 30원)");
		System.out.println("---------------------");
		System.out.print(">> 메뉴 번호를 선택하세요 => ");
		
	}
	/*
	public void getliter() {
		
	}
	*/
	public static void main(String[] args) {
		
		SwitchTest2.menu();
		
		Scanner sc = new Scanner(System.in);
		
		int menuno = 0;
		int liter = 0;
		
		try {
			menuno = Integer.parseInt(sc.nextLine());// 지역 변수를 사용할 시 메소드가 종료 되면서 변수가 사라지게 된다. 그렇기 때문에 메인에 변수를 초기화 시켜줘야 메소드가 종료되어도 main에서도 사용이 가능하다.
			liter = Integer.parseInt(sc.nextLine());
		
		} catch (NumberFormatException e) {
			System.out.println(">>숫자만 입력하세요!!\n 프로그램 끝내겠습니다.");
			sc.close();
			return; // 프로그램 종료
		}
		
		
		
		/*
		if ((menuno >=1 && menuno <=3))  {
			System.out.println("선택하신 메뉴번호는 "+ menuno + "번 입니다.");
		} else {
			System.out.println("메뉴번호는 1,2,3만 가능합니다.");
		}
		
		
		
		switch (menuno) {
		case 1:
		case 2:
		case 3:
			System.out.println("선택하신 메뉴번호는 "+ menuno + "번 입니다.");
			break;
		default:
			System.out.println("메뉴번호는 1,2,3만 가능합니다.");
			return;
		} 
		*/
		String sam = (menuno >=1 && menuno <=3)?"선택하신 메뉴번호는 "+ menuno + "번 입니다.":"메뉴번호는 1,2,3만 가능합니다.";
		System.out.println(sam);
		
	}

}
