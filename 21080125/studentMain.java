package my.day3.quiz;

public class studentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		   ==== 유관순님의 결과 ===
		   1. 학번 : kh0001
		   2. 성명 : 유관순
		   3. 국어 : 80
		   4. 영어 : 91
		   5. 수학 : 92
		   6. 총점 : 
		   7. 평균 : 
		   
		 */
		
		student st1 = new student("kh0001", "홍길동" , (byte)80, (byte)90, (byte)92);
		student st2 = new student("kh0002", "유관순" , (byte)90, (byte)91, (byte)100);
		
		System.out.println(st1.getExecute());
		System.out.println("");
		System.out.println(st2.getExecute());

	
	}

}
