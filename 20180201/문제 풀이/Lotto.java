/*
   배열     1 2 3 4 5 6 7 8 9 10 11 ....... 43 44 45
  idx  0 1 2 3 4 ............................44
 (난수)   
       
  int | 0 | -1 | -1 | -1 | -1 |
       ---- ---- ---- ---- ---- 
       첫번째 공 : 5
       두번째 공 : 10
       세번째 공 : 5 다시  10 다시  23
       네번째 공 : 40
       다섯번째 공 : 23 다시  7
       여섯번째 공 : 5  다시 10 다시  11
       
    5,10,23,40,7,11     
*/

package my.day8;

import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int[] ball = new int[45];
		int idx = 0;
		int[] temp = new int[5];
		String comma = "";
		
		for(int i=0; i<ball.length; i++) {
			ball[i] = i+1;  // 초기치로 1번공 ~ 45번 공까지 준비함.
		}
		
		for(int i=0; i<temp.length; i++) {
			temp[i] = -1;
			// 공을 꺼내어 오면 꺼내온 공의 방번호(idx 번호)를 담아두는 곳으로 사용.
			// 꺼내온 공의 방번호(idx 번호)가 0 값이 들어올수 있으므로
			// 초기치는 방번호(idx 번호)로 사용하지 않는 -1로 모두(5개) 초기화함.
		}
		
		
		outer:
		for(int i=0; i<6; i++) {  // 공을 꺼내는 작업을 6번 반복
		//	int rndnum = rnd.nextInt(max - min + 1) + min;
			
			idx = rnd.nextInt(44 - 0 + 1) + 0; 
			// 0 ~ 44 까지의 난수를 발생.
			
			for(int j=0; j<temp.length; j++) {
				if (temp[j] == idx) { // 이미 뽑은 방번호를 또 뽑았다면
					i--;              // 다시한번 방번호를 뽑을 기회를
					continue outer;   // 부여한다.
				}
			}// end of 내부 for-------------------
			
			comma = (i<5)?", ":"\n";
			System.out.print(ball[idx]+comma);
			
			if (i<5) {
				temp[i] = idx;
				// temp[0] <== 0
				// temp[1] <== 3
				// temp[2] <== 10
				// temp[3] <== 22
				// temp[4] <== 5
			}
			// 출력은    1, 4, 11, 23, 6, 7  
			
		}// end of 외부 for------------------------
		
		System.out.println(">>> 1등 로또 당첨번호 입니다.");
		
	}// end of main()----------------------------------

}
