/*
 	=== 배열(Array)이란? ===
 	동일한 데이터타입을 가지는 여러개의 데이터를 담을 수 있는 데이터 타입을 말한다.
 	그리고 배열 또한 객체라는 것을 꼭 기억하도록 하자!!!!
 */

package my.day8;

public class ArrayTest {

	public static void main(String[] args) {
		
		// 시험과목 성적(국어, 영어, 수학, 사회, 과학, 체육, 음악....)
		int kor=100, eng=90, math=95, society=70, science=98, physical=100,music=90;
		int total = kor+eng+math+society+science+physical+music;
		
		System.out.println("총점: "+total);
		System.out.println("평균: "+Math.round((double)total/7*10)/10.0);
		/*
		 	총점: 643
			평균: 91.9
		 */
		
		System.out.println("\n=====배열======");
		// 1). 배열의 선언
		int[] subject;
		//또는
		//int subject[];
		
		// 2). 메모리에 값을 할당을 해준다.
			subject = new int[7];
			// 배열로 선언된 변수에는 자동적으로 초기값이 들어가 있다.
			// 정수는 0, 실수는 0.0, String 을 포함한 객체는 null이 들어간다.
			
		/*
		 -----------------------------------
		 | 0 | 1 | 2 | 3 | 4 | 5 | 6 |
		 -----------------------------------
		 위의 숫자는 배열의 인덱스를 가리키는 번호로서 0부터 시작하여 1씩 증가한다.
		 
		 배열에 저장된 데이터를 표현할때는 아래와 같이 배열명[인덱스번호]로 나타낸다.
		 subject[0] subject[1] subject[2] subject[3] subject[4] subject[5] subject[6]
		 
		 */
			System.out.println("배열 subject 의 길이 : " + subject.length);
			//배열 subject 의 길이 : 7
			System.out.println("\n");
			
			for(int i=0; i<subject.length; i++) {
				System.out.println("subject["+i+"] => "+subject[i]);
			}
			/*
			 	subject[0] => 0
				subject[1] => 0
				subject[2] => 0
				subject[3] => 0
				subject[4] => 0
				subject[5] => 0
				subject[6] => 0
			 */
			
			System.out.println("\n");
			
			// 3). 데이터의 초기화
				subject[0] = 100;
				subject[1] = 90;
				subject[2] = 95;
				subject[3] = 70;
				subject[4] = 98;
				subject[5] = 100;
				subject[6] = 90;
			
			for(int i=0; i<subject.length; i++) {
				System.out.println("subject["+i+"] => "+subject[i]);
			}
			total = 0;
			for(int i=0; i<subject.length; i++) {
				total +=subject[i];
			}
				System.out.println("총점: "+total);
				System.out.println("평균: "+Math.round((double)total/7*10)/10.0);
				
				System.out.println("\n=======================");
				
			/*
			 	위의 	1). 배열의 선언과 
			 		2). 메모리에 할당을 해주는것을 따로 하지 않고
			 	아래와 같이 동시에 하는 것을 많이 사용한다.
			 */
			int[] gaumok = new int[7];
			// 3). 데이터의 초기화
			gaumok[0] = 100;
			gaumok[1] = 90;
			gaumok[2] = 95;
			gaumok[3] = 70;
			gaumok[4] = 98;
			gaumok[5] = 100;
			gaumok[6] = 90;
			
			for(int i=0; i<gaumok.length; i++) {
				System.out.println("subject["+i+"] => "+gaumok[i]);
			}
			total = 0;
			for(int i=0; i<gaumok.length; i++) {
				total +=gaumok[i];
			}
				System.out.println("총점: "+total);
				System.out.println("평균: "+Math.round((double)total/7*10)/10.0);
				
				System.out.println("\n=======================");
				
			/*
			 	위의 	1). 배열의 선언과 
			 		2). 메모리에 할당을 해주는것과
			 		3). 데이타 초기화를 해주는 것을 따로 하지 않고
			 	아래와 같이 동시에 하는 것을 많이 사용한다.
			 */
			int[] course = new int[] {100,90,95,70,98,100,90};	
			
			total = 0;
			for(int i=0; i<course.length; i++) {
				total +=course[i];
			}
				System.out.println("총점: "+total);
				System.out.println("평균: "+Math.round((double)total/7*10)/10.0);
				
				System.out.println("\n=======================");
				
			/*
			 	위의 	1). 배열의 선언과 
			 		2). 메모리에 할당을 해주는것과
			 		3). 데이타 초기화를 해주는 것을 따로 하지 않고
			 	아래와 같이 동시에 하는 것을 많이 사용한다.
			 	new int[]은 생략 가능하다.
			 */
			int[] course2 = {100,90,95,70,98,100,90};	
			
			total = 0;
			for(int i=0; i<course2.length; i++) {
				total +=course2[i];
			}
				System.out.println("총점: "+total);
				System.out.println("평균: "+Math.round((double)total/7*10)/10.0);
				
				System.out.println("\n=======================");
			
			// 배열 또는 collection에서 사용 되어지는 개선된(확장된) for문
			// for(배열요소 데이터형 변수명 : 배열명 또는 collection명)
			total = 0;
			for(int val : course2) {
				System.out.println(val);
			}
			for(int val : course2) { // 배열의 길이 만큼 자동적으로 반복한 후 빠져나간다.
				total += val;
			}
			System.out.println("총점: "+total);
			System.out.println("평균: "+Math.round((double)total/7*10)/10.0);
			
			System.out.println("\n=======================");
		
	}//end of main()---------------------------------------------------

}//end of class ArrayTest ////////////////
