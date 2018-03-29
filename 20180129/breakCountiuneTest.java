package my.day6;

public class breakCountiuneTest {

	public static void main(String[] args) {
		
		System.out.println("===1. ==========================");
		for(int i=0; i<4;i++) {
			if(i==2)
				break; //가장 가까운 반복을 벗어난다.
			System.out.println("i="+i);
		}

		/*
		 	i=0
		 	i=1 	
		 */
		System.out.println("\n\n===2. ==========================");
		
		for(int i=0; i<3; i++) {
			for(int j = 0 ; j < 4; j++) {
				if(j==1)
					break;
				System.out.print("["+ i +"," + j + "]");
			}System.out.println("\n");
		}
		/*
		 	[0,0][0,1]
		 	[1,0][1,1]
		 	[2,0][2,1]
		 */
		System.out.println("\n\n===3. ==========================");
		/*
		 	레이블명을 outer 라고 하겠습니다.
		 	레이블명 뒤에 : 을 붙이며 반드시 반복문 앞에 써야합니다.
		 */
		outer: //레이블명
		for(int i=0; i<3; i++) {
			for(int j = 0 ; j < 4; j++) {
				if(j==1)
					break outer; //break 레이블명 ; 을 하면 가장 가까운 레이블명이 붙은 반복문을 벗어난다.
				System.out.print("["+ i +"," + j + "]");
			}System.out.println("\n");
		}
		System.out.println("잘가라");
		/*
		 	[0,0] [0,1]
		 */
		
		System.out.println("\n\n===4. ==========================");
		String str =",";
		for(int i = 1; i<=10; i++) {
			str = (i<10)?",":"";
			System.out.print(i+str);
			
		}
		//1,2,3,4,5,6,7,8,9,10
		System.out.println("");
		for(int i = 1; i<=10; i++) {
			if(i%2 !=0)//홀수이라면
				continue; //아래의 명령줄로 내려가지 말고 반복문의 증감식으로 올라간다.
			str = (i<10)?",":"";
			System.out.print(i+str);
		}
		// 2,4,6,8,10
		
		System.out.println("\n\n");
		
		// 1부터 10까지의 누적의 합을 구하세요
		// 1+2+3+...+8+9+10 ==>55
		int sum = 0;
		for(int i=0; i<10 ; i++) {
			sum += (i+1);		//sum=sum + (i+1);
								//sum = 0 + 1;
								//sum = 1 + 2;
								//sum = 1 + 2 + 3;
			
		}
		System.out.println("1부터 10까지의 누적의 합 => " + sum);
		// 1+2+3+...+8+9+10 ==>55
		
		sum = 0;
		for(int i=0; i<10; i++) {
			if((i+1)==5 || (i+1) == 7)
				continue;
			sum +=(i+1);
		}
		System.out.println("1부터 10까지의 누적의 합 => " + sum);
		//sum = 1 + 2 + 3 + 4 + 6 + 8 + 9 + 10; //43
		
		System.out.println("-------------------------------");
		
		/*
		 	301호	302호	303호	305호
		 	201호	202호	203호	205호
		 	101호	102호	103호	101호
		 */
		
		for(int i=3 ; i>0;i--) {
			for (int j=1; j<=5; j++) {
				if(j==4)
					continue;
				String tab = (j == 5)?"\n":"\t";
				System.out.print(i+"0"+ j+"호"+tab);
			}
		}
		
		System.out.println("\n\n");
		
		/*
	 	501호	502호	503호	505호
	 	301호	302호	303호	305호
	 	201호	202호	203호	201호
	 	101호	102호	103호	101호
	 */
		
		for (int i=5; i>0;i--) {
			if (i==4)
				 continue; // j의 for문을 실행하지않고 바로 i의 증감식을 한다.
			for(int j=1;j<=5 ; j++) {
				if(j==4)
					continue;
				String tab = (j == 5)?"\n":"\t";
				System.out.print(i+"0"+ j+"호"+tab);
			}
		}
		
		System.out.println("\n\n");
		
		outer:
		for (int i=5; i>0;i--) {
			for(int j=1;j<=5 ; j++) {
				if(i==4) continue outer; //j의 포문을 안의 들어가서 레이블명의 outer의 i의 증감식으로 이동
				if(j==4)
					continue;
				String tab = (j == 5)?"\n":"\t";
				System.out.print(i+"0"+ j+"호"+tab);
			}
		}
	}//end of main()-------------------

}
