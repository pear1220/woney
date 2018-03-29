package my.day4.quiz;

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
		return result1;
	}
	
	public char jum() {
		int avg1 = (int)avg(kor,eng,math);
		char a;
		if (avg1 >=90) {
			a = 'A';
		} else if(( 90 > avg1 && avg1>=80)) {
			a = 'B';
		} else {
			a = 'C';
		}
		return a;		
	}


}
