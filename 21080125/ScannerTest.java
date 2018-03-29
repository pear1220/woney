package my.day4;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		//System.in ==> 키보드 입력 받음 
		
		System.out.print("정수를 입력하세요=> ");
		int n = sc.nextInt();//숫자만 입력 받음 
		System.out.println("입력한 정수 : "+n);
		String s = sc.nextLine();
		
		System.out.print("문자열 단어를 입력하세요 => ");
		String word=sc.next();// 잘사용안함 스페이스가 들어가면 문자가 이상해짐
		System.out.println("입력한 문자열 : " +word);
		s = sc.nextLine();
		
		System.out.print("문자열 단어를 입력하세요 => ");
		String str = sc.nextLine();//엔터까지 다받아옴
		System.out.println("입력한 문자열 : " +str);
		
		System.out.println("\n=============\n");
		System.out.print("정수를 입력하세요=> ");
		int su = Integer.parseInt(sc.nextLine()); 
	
		System.out.println("입력한 정수 : "+su);
		
		System.out.print("문자열 단어를 입력하세요 => ");
		str = sc.nextLine();
		System.out.println("입력한 문자열 : " +str);
		
	}

}
