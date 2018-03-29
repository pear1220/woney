/*
 	>> 첫번째 수 입력  => 5
 	>> 두번째 수 입력  => 2
 	>> 연산자 선택(+,-,*,/,%) => 
 	>> 결과 5+2=7		//정수
 	>> 결과 5/2=2.5   //실수
 	>> 결과 5*2=10	//정수
 */

/*
 	문자열 비교("이순신" == "이순신") x
 	"이순신".equls("이순신") // 이순신과 이순신이 같냐 같으면 리턴타입이 true , 틀리면 false
 
 */

package my.day5.quiz;

import java.util.Scanner;

public class SwitchQuiz {
	int su, onesu,twosu;
	double si;
	String result;
	
	public SwitchQuiz(int onesu,int twosu) {
		this.onesu = onesu;
		this.twosu = twosu;
	}
	
	public void plus() {
		su = onesu + twosu;
		System.out.println(">> 결과 "+ onesu + " + " + twosu + " = " + su); 
	}
	
	public void min() {
		su = onesu - twosu;
		System.out.println(">> 결과 "+ onesu + " - " + twosu + " = " + su); 
	}
	
	public void muti() {
		su = onesu * twosu;
		System.out.println(">> 결과 "+ onesu + " * " + twosu + " = " + su);
	}
	
	public void divi() {
		si = (double)(onesu / twosu);
		System.out.println(">> 결과 "+ onesu + " / " + twosu + " = " + su);
	}
	
	public void quot() {
		su = onesu % twosu;
		System.out.println(">> 결과 "+ onesu + " % " + twosu + " = " + su);
	}

	public static void main(String[] args) {
		
		int onesu = 0;
		int twosu = 0;
				
		Scanner sc =new Scanner(System.in);
		System.out.print(">> 첫번째 수 입력 => ");
		try {
			onesu = Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			System.out.println(">>숫자만 입력하세요!!\n 프로그램 끝내겠습니다.");
			sc.close();
			return;
		}
		System.out.print(">> 두번째 수 입력 => ");
		try {
			twosu = Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			System.out.println(">>숫자만 입력하세요!!\n 프로그램 끝내겠습니다.");
			sc.close();
			return;
		}
		System.out.print(">> 연산자 선택(+,-,*,/,%) => ");
		
		String str = sc.nextLine();
		SwitchQuiz cal = new SwitchQuiz(onesu,twosu);
		switch (str) {
		case "+":
			cal.plus();
			break;
		case "-":
			cal.min();
			break;
		case "*":
			cal.muti();
			break;
		case "/":
			cal.divi();
			break;
		case "%":
			cal.quot();
			break;
		default:
			System.out.println("연산자를 입력해 주세요.");
			break;
		}
		
		if(str.equals("+")) {
			cal.plus();
		} else if (str.equals("-")) {
			cal.min();
		} else if (str.equals("*")) {
			cal.muti();
		} else if (str.equals("*")) {
			cal.divi();
		} else if (str.equals("%")) {
			cal.quot();
		} else {
			System.out.println("연산자를 입력해 주세요.");
		}
		
		
	}

}
