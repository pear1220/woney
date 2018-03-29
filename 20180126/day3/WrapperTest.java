/*
 	=== *** wrapper 클래스 *** ===
 	
 	---------------------------------
 	기본자료형(원시형)		클래스형
 	---------------------------------
 		byte			Byte
 		short			Short
 		char			Character
 		int				Integer
 		long			Long
 		float			Float
 		double			Double
 		boolean			Boolean
 	---------------------------------
 	기본 자료형(원시형)은 데이터 저장 및 단순히 4칙연산에서만 사용하는 것이고,
 	클래스형은 데이터 저장 및 4칙연산 뿐만 아니라 다양한 기능의 메소드가 있어서 다방면으로 사용되어진다.
 	
 	====!!!!! 반드시 꼭 기억합니다. !!!!!====
 	웹사이트에서 입력 되어지는 모든 데이터는 그타입이 무조건!!!!
 	String(문자열) 타입니다.
 	
 	로그인시 아이디 입력란 : superman  ==> String(문자열)
 	회원가입시 나이 입력란 : 26		   ==> String(문자열)
 	배송일자 입력란 : 2018-01-26	   ==> String(문자열)
 	
 	그런데 웹사이트에서 숫자모양을 띄는 문자열을 받아서 4칙연산을 하고자 한다.
 	예> 26 + 1 =>27 "26" + 1 =261
 		26 - 1 =>25 "26" - 1 =>error
 	해결책> 문자열로 되어진 "26"을 숫자(int)형태로 바꾸어 주어야한다. 	
 */


package my.day3;

public class WrapperTest {

	public static void main(String[] args) {
		
		char ch = 'a';
		System.out.println("ch : " + ch + "\n");
		
		Character chr ='a';
		System.out.println("chr : " + chr + "\n");
		
		String str = "";
		if (Character.isLowerCase(ch)) {
			str = "영문소문자";
		
		} else if (Character.isUpperCase(ch)) {
			str = "영문대문자";
		} else if (Character.isDigit(ch)) {
			str = "숫자";
		} else {
			str = "특수문자";
		}
		System.out.println("ch : " + ch +"은"+ str + "\n");
		
		System.out.println("==============");
		
		String age = "26";
		int n = 1;
		
		System.out.println("age + n => " + (age+n));
		//age + n => 261
		
		//문자열로 되어진 숫자(정수)를 실제 정수(숫자)로 변경한다.
		System.out.println("age + n => " + (Integer.parseInt(age)+n));
		//age + n => 27
		System.out.println("age + n => " + (Byte.parseByte(age)+n));
		System.out.println("age + n => " + (Short.parseShort(age)+n));
		System.out.println("age + n => " + (Long.parseLong(age)+n));
		
		String su = "367.354364";
		
		System.out.println("su + 10 => " + Float.parseFloat(su)+10);
		// su + 10 =>367.3543710
		System.out.println("su + 10 => " + Double.parseDouble(su)+10);
		// su + 10 =>367.35436410
		
		// === 숫자(정수)로 되어진 데이터를 문자열로 변경해 봅니다.
		int jumsu = 98;
		String str_jumsu= Integer.toString(jumsu);
		System.out.println("str_jumsu + 1 => " + (str_jumsu +1));
		// str_jumsu + 1 => 981
		System.out.println("str_jumsu + 1 => " + (str_jumsu +1));
		// str_jumsu + 1 => 981
	}

}
