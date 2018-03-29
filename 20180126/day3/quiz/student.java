package my.day3.quiz;

public class student {
	
	String number,name;
	byte kor, eng, su;
	
 
	public student(String number, String name, byte kor , byte eng, byte su) {
		this.number = number;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.su = su;
	}

	public double getavg(byte kor, byte eng, byte su) {
		short result = getsum(kor,eng,su);
		double result2 = (double)result /3;
		return result2;
		
	}
	
	public short getsum(byte kor, byte eng, byte su) {
		short result = (short)(kor + eng + su);
		return result;
	}
	
	public String getExecute() {
		String result = "*** " + name + "님의 성적결과\n" + 
						"1. 학번 : " + number +
						"\n2. 성명 : " + name +
						"\n3. 국어 : " + kor +
						"\n4. 영어 : " + eng +
						"\n5. 수학 : " + su +
						"\n6. 총점 : " + getsum(kor,eng,su) +
						"\n7. 평균 : " + getavg(kor,eng,su);
		
		return result;
						
		
	}
	
}
