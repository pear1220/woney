package my.day5;

import java.util.Scanner;

public class SwitchTest1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("==아래의 값에 입력해 주세요==\n");
		System.out.print("학번 :");
		String number = sc.nextLine(); 
		System.out.print("성명: ");
		String name = sc.nextLine(); 
		
		System.out.print("국어: ");
		int kor = Integer.parseInt(sc.nextLine()); 
		System.out.print("영어: ");
		int eng = Integer.parseInt(sc.nextLine()); 
		System.out.print("수학: ");
		int math = Integer.parseInt(sc.nextLine()); 
		
		student obj = new student(number,name,kor,eng,math);
		
		System.out.println("==아래의 값에 입력해 주세요==\n");
		System.out.print("학번 :");
		number = sc.nextLine(); 
		System.out.print("성명: ");
		name = sc.nextLine(); 
		
		System.out.print("국어: ");
		kor = Integer.parseInt(sc.nextLine()); 
		System.out.print("영어: ");
		eng = Integer.parseInt(sc.nextLine()); 
		System.out.print("수학: ");
		math = Integer.parseInt(sc.nextLine()); 
		
		student obj1 = new student(number,name,kor,eng,math);
		
		obj.execute();
		obj1.execute();
		
		sc.close();
		

	}

}
