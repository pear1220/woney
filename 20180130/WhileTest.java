package my.day7;

/*
 	=== while 문 형식 ===
 	
 	변수의 초기화;
 		
 	while(조건식) {
 		조건식이 참(true)이라면 반복해서 실행할 명령문 계속해서 실행하고, 
 		조건식이 거짓(false)이라면 {} 이부분을 빠져나간다.
 		
 		반복해서 실행할 명령문;
 		증감식; //필수는 아니지만 많이 온다.
 	}
 */

public class WhileTest {

	public static void main(String[] args) {
		
		int i=0;
		while(i<5) {
			
			System.out.println((i+1)+". 안녕자바~~");
			i++;
		}
		System.out.println("");
		
		i=0;
		while(i++<5) {
			System.out.println(i+". Hello JAVA~~");
		}
		
		System.out.println("\n===3단===");
		
		i=0;
		while(i<9) {
			System.out.println("3*"+(i+1)+"="+3*(i+1));
			i++;
		}
		System.out.println("");
		
		i=0;
		while(i++<9) {
			System.out.println("3*"+i+"="+(3*i));
		}
		
		/*
		 	3*1=3
		 	3*2=6
		 	3*3=9
		 	3*4=12
		 	3*5=15
		 	3*6=18
		 	3*7=21
		 	3*8=24
		 	3*9=27
		 */
		
		System.out.println("\n===3단(짝수만)===");
		i=0;
		while(i++<9) {
			if(i%2 != 0) 
				continue;
			else
				System.out.println("3*"+i+"="+(3*i));
		}
		
		/*
		 	3*2=6
		 	3*4=12
		 	3*6=18
		 	3*8=24
		 */
		System.out.println("\n===3단(6부터는 제외)===");
		i=0;
		while(i++<9) {
			if(i == 6) 
				break;
			else
				System.out.println("3*"+i+"="+(3*i));
		}
		/*
		 	3*1=3
		 	3*2=6
		 	3*3=9
		 	3*4=12
		 	3*5=15
		 */
		
		System.out.println("\n===구구단===");
		//구구단은 9행 8열이다.
		int row=1,col=2;
		while(row <= 9) {// 행
			while(col <= 9) {
				String tab = (col ==9)?"\n":"\t";
				System.out.print(col+"*"+row+"="+(col*row)+tab);
				col++;
			}// end of 내부 while----------------------
			col=2;// 초기화를 안해주면 안에 있는 while 한번만 실행 후 돌지 않는다.
			row++;
		}//end of 외부 while---------------------------
			
		
		System.out.println("\n\n===구구단(5,7)단 제외===");
		
		row =1;
		col=2;
		while(row <=9) {
			while(col <= 9) {
				
				if(col != 3 && col !=7) {
				String tab = (col == 9)?"\n":"\t";
				System.out.print(col+"*"+row+"="+(col*row)+tab);
				}//end of if()----
				col++;
			}// end of 내부 while----------------------
			col=2;// 초기화를 안해주면 안에 있는 while 한번만 실행 후 돌지 않는다.
			row++;
		}//end of while()----------------------------
		
		System.out.println("\n\n===if만 이용하여 호수를 출력하라===");
		/* if만 이용하여 만들라
		 	501호 	502호 	503호 	505호 
		 	301호	302호 	303호 	305호 
		 	201호	202호 	203호 	205호
		 	101호	102호 	103호 	105호
		 */
		
		row=5;
		col=1;
		while(!(row < 1)) { // 참쓰는 것 보다는 거짓을 쓰면 if를 쓸 필요가 없다.
			
			while(!(col>5)) {
				String tab = (col ==5)? "\n":"\t";
				if(row !=4 && col !=4)
				System.out.print(row+"0"+col+"호"+tab);
				col++;
				}//end of 내부 while()-----------
			col=1;
			row--;
			
			
		}//end of 외부 while
		
		
		
		
	}//end of main()---------------------------------

}//end of class whileTest
