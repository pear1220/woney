package my.day4.quiz;

public class RoundTest {

	public static void main(String[] args) {
		
		// 반올림에 대해서 알아본다.
		double db1 = 93.45678, db2 = 86.8765;
		System.out.println("db1 = "+ db1 + ", db2 = " + db2);

		System.out.println("\n=== 반올림 후 ===\n");
		
		System.out.println("db1 = "+ Math.round(db1) + ", db2 = " + Math.round(db2)); //  소수부분은 반올림해서 정수 부분만 나타낸다.
		
		System.out.println("\n=== 특정 소수부 자리에서 반올림 후 ===\n");
		// 93.45678  ==> 93 (기본 반올림)
		// 93.45678 * 10
		// 934.5678  ==> 935 
		// 935/10.0  ==> 93.5
		
		// 93.45678 
		// 93.45678 * 100 ==> 9345.678
		// 9346/100.0 => 93.46
		System.out.println("db1 = "+ Math.round(db1*10)/10.0 + ", db2 = " + Math.round(db2*10)/10.0); // 소수 둘째 자리에서 반올림하여 소수 첫째짜리까지 출력한다.
		
		
		
	}

}
