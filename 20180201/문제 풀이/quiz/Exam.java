package my.day8.quiz;

public class Exam {

	public static void main(String[] args) {
		
		int[][] array = {{12, 41, 36, 56},
						 {82, 10, 12, 61},
						 {14, 16, 18, 78},
						 {45, 26, 72, 23}};
		int total = 0;
		double avg = 0.0;
		
		for(int i=0; i<array.length; i++) {
			
			for(int j=0; j<array[i].length; j++) {
				total += array[i][j];
			}
			
		}// end of 외부for----------------------
		
		avg = (double)total/(array.length * array[0].length);
		
		System.out.println("합계 : " + total);
		System.out.println("평균 : " + Math.round(avg*1000)/1000.0); 
		
	}// end of main()--------------------------

}
/*
    합계 : 602
    평균 : 37.625
*/

