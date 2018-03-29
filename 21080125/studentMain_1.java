package my.day4.quiz;

import java.util.Scanner;

public class studentMain {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("==아래의 값에 입력해 주세요==");
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
		
		
		System.out.println("==아래의 값에 입력해 주세요==");
		System.out.print("학번 :");
		String number1 = sc.nextLine(); 
		System.out.print("성명: ");
		String name1 = sc.nextLine(); 
		System.out.print("국어: ");
		int kor1 = Integer.parseInt(sc.nextLine()); 
		System.out.print("영어: ");
		int eng1 = Integer.parseInt(sc.nextLine()); 
		System.out.print("수학: ");
		int math1 = Integer.parseInt(sc.nextLine()); 
		
		
		student obj = new student(number,name,kor,eng,math);
		student obj1 = new student(number1,name1,kor1,eng1,math1);
		obj.execute();
		obj1.execute();
		
		

	}

}
