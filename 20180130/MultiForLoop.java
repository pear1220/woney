package my.day6;

public class MultiForLoop {

	public static void main(String[] args) {
		/*
		 	1 2 3 4 5
		 	6 7 8 9 10
		 	11 12 13 14 15
		 	16 17 18 19 20
		 */
		
	
		for (int i = 0; i<20;i++) {
			
			System.out.print((i+1)+" ");
		}
		System.out.println("\n");
		
		String str = "";
		for (int i = 0; i<20;i++) {
			str = ((i+1)%5 == 0)?"\n":" ";
			System.out.print((i+1)+str);
			
		}
		/*
		 	행,열 ==> 행이 바깥 for문, 열이 내부 (안쪽) for문
		 		5열
		 	4행	1 2 3 4 5
		 		6 7 8 9 10
		 		11 12 13 14 15
		 		16 17 18 19 20
		 */
		
		for (int i = 0; i<4;i++) {
			
			for (int j = 0; j < 5 ; j++) {
				System.out.print("★");
			}
			System.out.print("\n");
			
		}
		
		System.out.println("");
		for(int i = 0 ; i<12; i++) {
			str =( (i+1)%3==0 )?"\n":"";
			System.out.print("#" + str);
		}
	
		System.out.println("");
		for (int i = 0 ; i < 4 ; i++) {
			for(int j = 0 ; j < 3; j++) {
				System.out.print("#");
			}
			System.out.print("\n");	
		}
		/*
 			###
 			###
 			###
 			###
		 */
		System.out.println("");
		int n = 0 ;
		
		for (int i = 0; i<4;i++) {
			
			for (int j = 0; j < 5 ; j++) {
				System.out.print(++n+" ");
			}
			System.out.print("\n");
			
		}
		
		System.out.println("");
		/*
		  	20 19 18 17 16
		  	15 14 13 12 11
		  	10 9 8 7 6 
		  	5 4 3 2 1
		 */
		
		n = 20;
		for (int i = 0 ; i < 4 ; i++) {
			for(int j = 0 ; j <5 ; j++) {
				System.out.print(n-- + " ");
			}System.out.print("\n");
		}	
		
		System.out.println("");
		/*
		 	1 3 5 7 9
		 	11 13 15 17 19
		 	21 23 25 27 29
		 */
		n = 1;
		for (int i = 0 ; i < 3 ; i++) {
			for (int j = 0 ; j < 5; j++  ) {
				System.out.print(n +" ");
				n+=2;
			}System.out.print("\n");
		}
		
		
		System.out.println("");
		n = 1;
		for(int i = 0 ; i < 15 ; i++){
			str = (n%10 == 9)? "\n":" ";
			System.out.print(n+str);
			n+=2;
		}
	} //end of main() -------------------------------------

}
