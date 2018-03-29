package my.day5;



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
				 "1. 학번 : " + number +
				 "\n2. 성명 : " + name +
				 "\n3. 국어 : " + kor +
				 "\n4. 영어 : " + eng +
				 "\n5. 수학 : " + math +
				 "\n6. 총점 : " + sum()+
				 "\n7. 평균 : " + avg()+
				 "\n8. 학점 : " + jum() +
				 "\n9. 선물: " + getGift()+"\n";
		
		System.out.println(result);
	}
	
	public int sum() {
		return kor+eng+math;	
	}
	
	public double avg() {
		int result = sum();
		double result1 = (double)result/3;
		
		return Math.round(result1*10)/10.0;
	}
	
	public String jum() {
		/*
		switch (변수 또는 수식) {// 변수 또는 수식이 조건에 해당됨.
							// 변수 또는 수식의 타입은 byte, short, char, int형이어야 된다.
							// long은 불가하다. float, double 불가능하다.
							// JDK 1.7 (==JDK 7.0) 이후 부터는 String 타입도 허용한다.
		case value(값1):
			실행문1;
			break; //{}을 빠져나간다.

		case value(값2):
			실행문2;
			break; //{}을 빠져나간다.
			
		case value(값3):
			실행문3;
			break; //{}을 빠져나간다.
						
		default:
			실행문n;
			break;
		}	
		*/
		double avg1 = avg(); //100.0 94.3 85.2 71.3 68.7 52.6 49.3
		String hakjum = "";
		switch ((int)avg1/10) { //100 94 85 71 68 52 49
								//10  9  8  7  6  5  4
		case 10: //or 라고함
		case 9:	
			hakjum = "A";
			break;
			
		case 8: 
			hakjum = "B";
			break;
			
		case 7: 
			hakjum = "C";
			break;
			
		case 6: 
			hakjum = "D";
			break;
			
		default:
			hakjum = "F";
			break;
		}
		
		return hakjum;		
	}

	public String getGift() {
		String gift = "";
		switch (jum()) {
		case "A":
			gift +="놀이공원 이용권, ";		// A라면 break가 없으면 밑에 case문을 실행 준다. 값이 B면 B부터 밑에 case문을 실행한다.
		case "B":
			gift +="뷔페식사권, ";
		case "C":
			gift +="치킨, ";
		case "D":
			gift +="아이스크림 ";
			break;

		default:
			gift +="꿀밤 3대";
			break;
		}
		return gift;
	}
}
