package my.day4.quiz;

import java.util.Scanner;

public class student {

	String number,name;
	int kor, eng, math;
	
	
	
	public student(String number,String name, int kor, int eng,int math){
		this.number = number;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
	}
	
	public void execute() {

		String result = "====결과 ====\n" +
				 "학번 : " + number +
				 "\n성명 : " + name +
				 "\n국어 : " + kor +
				 "\n영어 : " + eng +
				 "\n수학 : " + math +
				 "\n총점 : " + sum(kor,eng,math)+
				 "\n평균 : " + avg(kor,eng,math)+
				 "\n학점 : " + jum();
		
		System.out.println(result);
	}
	
	public int sum(int kor, int eng, int math) {
		return kor+eng+math;	
	}
	
	public double avg(int kor, int eng, int math) {
		int result = sum(kor,eng,math);
		double result1 = (double)result/3;
		
		return Math.round(result1*10)/10.0;
	}
	
	public char jum() {
		int avg1 = (int)avg(kor,eng,math);
		char a = 0;
		if (avg1 >=90) {
			a = 'A';
		} else if( avg1>=80) {
			a = 'B';
		} else if( avg1>=70){
			a = 'C';
		} else if( avg1>=60){
			a = 'D';
		} else {
			a = 'F';
		}
		
		return a;		
	}


}
