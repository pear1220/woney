/*
 		==== **** 데이터형 변환하기 **** ====
 		1. 묵시적 형변환(자동 형변환)
 			--> 크기가 작은 것에서 크기가 큰쪽으로는 자동으로 형변환이 일어난다.
 			
 		2. 강제 형변환(casting)
 			--> 크기가 큰것에서 작은쪽으로는 자동으로 형변환이 불가능하므로 
 			크기가 큰 데이터 타입을 크기가 작은 데이터타입으로 강제적으로 형을 변경해주는것을 말한다.
 			이때 사용하는 것이 () 라는 casting 연산자다.
 			
 					===============================================> 자동형변환 O.K
 					byte  --> short  --> int  --> long  --> float  --> double
 					(1byte)  (2byte)   (4byte)   (8byte)   (4byte)	  (8byte)
 					
 							  char
 							 (2byte)
 		자동형변환 N.O <=============================================== 
 */


package my.day3;

public class CastingTest {

	public static void main(String[] args) {
		
		byte bt1 = 10;
		int a1 = bt1; 
		
		int a2 = 30;
		byte bt2 = (byte)a2;
		
		long ln1 = 9234567890L;
		float ft1 =ln1;
		
		float ft2 = 12.4F;
		long ln2 = (long)ft2;
		
		System.out.println("ln2 :"+ln2); //절사 : 소수를 정수로 변경할 경우 소수점을 버리고 정수만 나타낸다.
		
		double db1 = 123.96789;
		System.out.println("db1 : " + db1 + ", (int)db1 :" + (int)db1);

	}

}
