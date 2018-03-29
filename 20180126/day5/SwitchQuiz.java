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
 	"이순신".equls("이순신") // 이순신과 이순이 같냐 같으면 리턴타입이 true , 틀리면 false
 
 */

package quiz;

import java.util.Scanner;

public class SwitchQuiz {
	
	

	public static void main(String[] args) {
		
		int onesu = 0;
		int twosu = 0;
				
		Scanner sc =new Scanner(System.in);
		System.out.println(">> 첫번째 수 입력 => ");
		try {
			onesu = Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			System.out.println(">>숫자만 입력하세요!!\n 프로그램 끝내겠습니다.");
			sc.close();
			return;
		}
		System.out.println(">> 두번째 수 입력 => ");
		try {
			twosu = Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			System.out.println(">>숫자만 입력하세요!!\n 프로그램 끝내겠습니다.");
			sc.close();
			return;
		}
		System.out.println(">> 연산자 선택(+,-,*,/,%) => ");
		
		String str = sc.nextLine();
		
		switch (str) {
		case "+":
			int = result;
			result = onesu + twosu;
			System.out.println("result");
			break;
		case "-":
			result = onesu - twosu;
			break;
		case "*":
			result = onesu * twosu;
			break;
		case "/":
			(double)result = onesu / twosu;
			
			break;
		case "%":
			result = onesu % twosu;
			break;

		default:
			System.out.println("연산자를 입력해 주세요");
			break;
		}
	}

}
