package my.day4;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("---- 1. 산술연산자 : + - * / % << >> >>> ----");
		/*
		 	+ - * / %(나머지)
		 	x << n  x*(2의 n승) 의 결과 값과 같다. x는 실수형은 불가하고 정수 형만 가능하다.
		 	x >> n  x/(2의 n승) 의 결과 값과 같다. x는 실수형은 불가하고 정수 형만 가능하다. 
		 	x >>> n 정수 x를 32bit 형태의 2진수로 나타낸후 오른쪽으로 n 번 이동 시키고 빈자리는 0으로 채운다
		 */
		
		int n = 10;
		System.out.println("n+3= "+(n+3));//13
		System.out.println("n-3= "+(n-3));//7
		System.out.println("n*3= "+(n*3));//30
		System.out.println("n/3= "+(n/3));//3
		System.out.println("n%3= "+(n%3));//1
		System.out.println("n<<3= "+(n<<3)); // 10*(2의 3승) => 80
		System.out.println("n>>3= "+(n>>3)); // 10/(2의 3승) => 1
		System.out.println("n>>>3= "+(n>>>3)); //1
		/*
		 	10을 32bit로 나타내면
		 	 00000000 00000000 00000000 00001010
		 	\   00000000 00000000 00000000 00001\010
		 	=>1*2의 3승 + 0*2의 2승 + 1*2의1승 + 0*2의 0승
		 	=>1*8 + 0*4 +1*2 + 0*1
		 	=> 8 + 0 + 2 + 0 = 10
		 	\00000000 00000000 00000000 00000001\010
		 	==================================== ---
		 					결과물				  삭제
		 					 
		 */
		
		System.out.println("---- 2. 부호연산자 : + - ---");
		byte a = 5;
		short b = -9;
		System.out.println(-b); //9
		System.out.println(+a); //5
		
		System.out.println("---- 3. 증감연산자 : ++ -- ---");
		int c = 7;
		long d = 3;
		//------후위연산자------//
		c++; // c = c+1; 와 같은 뜻이다. 1증가
		d--; // d = d-1; 와 같은 뜻이다. 1감소
		System.out.println("c= " +c); // c=8
		System.out.println("d= "+d);  // b=2
		
		//------전위연산자------//
		++c; // c = c+1; 와 같은 뜻이다. 1증가
		--d; // d = d-1; 와 같은 뜻이다. 1감소
		System.out.println("c= " +c); // c=9
		System.out.println("d= "+d);  // b=1
		
		//후위 증감연산자(c++,d--)는 다른 연산을 다마친 이후에 1을 증감한다.
		//전위 증감연산자(++c,--d)는 먼저 1을 증감한 이후에 다른 연산을 한다.
		System.out.println("c= "+c++); // c = 9
		//c의 저장된 값 9를 출력해주고 나서 1증가한다.
		System.out.println("c= "+c); // c = 10
		
		System.out.println("c= "+ ++c); // c = 11
		//c에 저장된 값 10을 먼저 1중가를 하고 출력해준다.
		System.out.println("c= "+c); // c = 11
				
		System.out.println("---- 퀴즈 ----");
		int x=10, y=10;
		/* 
		 	int x=10;
		 	int y=10; 와 같다
		 */
		
		int z = ++x;
		
		System.out.println("z : "+z); // 11
		System.out.println("x : "+x); // 11
		
		z= y++;
		System.out.println("z : "+z); // 10
		System.out.println("y : "+y); // 11
		
		x=20;
		z= x++;
		System.out.println("z : "+z); // 20
		System.out.println("x : "+x); // 21
		
		System.out.println("---- 4. bit별 not 연산자: ~ ---");
		// 주어진 정수값을 32bit 형태의 2진수로 바꿔서 나타내는데 0은 1로 바꾸고, 1은 0으로 바꾸어 주는 것이다.
		
		int m = 42; // int 가 4byte 이므로 32bit이다.
		System.out.println("~m: "+~m);
		
		//00000000 00000000 00000000 00101010	<= 42
		//11111111 11111111 11111111 11010101	<=~43
		
		/*
		 첫번째 bit는 부호비트로 사용되어지는데
		 0은 +임(양수)을 의미하고,
		 1은 -임(음수)을 의미한다.
		 첫번째 bit가 1인 경우, 즉 음수를 뜻할 경우에는 아래와 같이 구한다.
		 똑같은 1이 나오는것 중에서 마지막 1만 취하고,여기에다가 그 나머지를 끝까지 취한다. 
		
			1010101
		
		첫번째 값만 - 를 붙이고 나머지 값은 +로 연산을 하면된다.
		-1*2의6승 + 0*2의5승 + 1*2의4승 + 0*2의3승 + 1*2의2승 + 0*2의1승 + 1*2의0승
		-64 + 0 + 16 + 0 + 4 + 0 + 1 
		==> -43
		
		 */
		System.out.println("---- 5. 논리 부정 연산자: ! ---");
		boolean bool = false;
		System.out.println("bool : " + bool);
		//bool : false
		System.out.println("bool : " + !bool);
		//bool : true
		
		System.out.println("---- 6. bit 연산자: & | ^ ---");
		
		/*
		  & (and 연산자) ==> 2개 bit 모두 1일때만 1, 나머지는 0
		  | (or 연산자)  ==> 2개 bit 중에서 적어도 1개가 1, 모두 0이면 0
		  ^ (xor 연산자) ==> 2개 bit 중에서 서로달라야 1, 같으면  0
		  & | ^ 연산자는 연산되어지는 대상이 정수일때만 가능함
		 */
		int x1 = 3;
		int y1 = 5;
		
		System.out.println("x1 & y1 =>" + (x1 & y1)); 
		/*
		   	 00000011 <==3
		   & 00000101 <==5
		     --------
		  	 00000001 <==1
	
		 */
		System.out.println("x1 | y1 =>" + (x1 | y1)); 
		/*
		   	 00000011 <==3
		   | 00000101 <==5
		  	 --------
		  	 00000111 <==7 
	
		 */

		System.out.println("x1 ^ y1 =>" + (x1 ^ y1)); 
		/*
		   	 00000011 <==3
		   ^ 00000101 <==5
		  	 --------
		  	 00000110 <==6 
	
		 */	
		
		System.out.println("---- 7. 논리 연산자: & | && || ---");
		/*
		 	논리 연산자 & | && || 에 대상은 참, 거짓 이다.
		 */
		int a1 = 50, b1 = 60;
		
		if ((a1 > b1)&(a1 > 0))
		//	  false	 &	true  ==> false
			
		System.out.println("Hello");
		else if ((b1 > a1)|(b1 < 0))
		//			true  |  false	==> true
		System.out.println("java");
		else 
		System.out.println("몰라요~~");
		// & | 는 뒤에까지 확인 하고 결과값이 참인지 거짓인지 나온다 
		System.out.println("\n=================\n");

		if ((a1 > b1)&&(a1 > 0))
		//	  false	 &&	스킵  ==> false
			
		System.out.println("Hello");
		else if ((b1 > a1)||(b1 < 0))
		//			true  ||  스킵	==> true
		System.out.println("java");
		else 
		System.out.println("몰라요~~");
		// && || 처음 나오는 결과물의 값이 결과가 된다.
		
		System.out.println("\n========퀴즈 1.========\n");
		int i=1;
		int j=i++; //j=1 ==> i=2
		
		if ((i>++j) & (i++ == j)) //j=2 ==> (2>2) & (2==2)false ==> i3 &  => 참|참 => 참 , 참 |거짓 =>거짓  ,거짓 | 참 => 거짓 , 거짓 | 거짓 => 거짓  
			i=i+j;
		System.out.println("i="+i);//5 

		i=1;
		j=i++; // j =1 ==> i=2
		
		if ((i>++j) && (i++ == j)) // j=2 ==> (2>2) false ==> i2
			i=i+j;
		System.out.println("i="+i);//6
		
		System.out.println("\n========퀴즈 2.========\n");
		
		int m1 = 0, n1=1;
		if ((m1++ == 0 ) |  (n1++ == 2))//(0==0) | (1==2) true m1=1,n1=2
			m1 = 42;
		System.out.println("m1="+m1+", n1="+n1);//m1 = 42 , n1 =2
		
		
		System.out.println("\n========퀴즈 3.========\n");
		boolean k1 = false; 
		boolean k2 = false;
		boolean k3 = ((k1 = true)|(k2= true)); 
		System.out.println(k1+", "+k2+", "+k3);// k1 =true, k2 =true, k3 =true // | => 참|참 = > 참 , 참 |거짓 =>참  ,거짓 | 참 => 참 , 거짓 | 거짓 => 거짓
		
		System.out.println("---- 8. 비교 연산자: == != > < >= <= ---");
		
		System.out.println("---- 9. 할당 연산자(연산후 대입연산자) ---");
		i=1;
		i+=3; // i=i+3;
		System.out.println("i="+i);//4
		
		j= 10;
		j-=3; // j = j-3;
		System.out.println("j="+j);//7
		
		j*=3; // j=j*3;
		System.out.println("j="+j);//21
		
		j%=2; // j=j%2
		System.out.println("j="+j);//1
		
		j^=5; // j=j^5;
		/*
		   00000001		<= j
		   00000101     <= 5
		   --------
		   00000100		<= 4
		 */
		System.out.println("j="+j);//4
		
		j<<=3; //j=j<<3;  j*2의3승 j=4*8
		System.out.println("j="+j);//32
		
		System.out.println("---- 10. 삼항 연산자(if ~ else와 같음) ---");
		/*
		 	변수 선언 = (조건식)? 값1 :값2;
		 	변수를 선언하고 나서 값을 부여하고자 할때 사용하는데 조건식이 참이라면 변수에 값1이 들어가고,
		 	조건식이 거짓이라면 변수에 값2가 들어간다.
		 */
		
		a=50;
		b=60;
		
		int result = (a>b)?a:b;
		System.out.println("result: "+ result);
		//result : 60
		
		if(a<b)
			System.out.println(b+"이"+a+"보다 큽니다.");
		else 
			System.out.println(a+"이"+b+"보다 큽니다.");
		
		 String str = (a<b)?b+"이"+a+"보다 큽니다.":a+"이"+b+"보다 큽니다.";
		 System.out.println(str);
		
		 System.out.println("\n====시험 퀴즈====\n"); //평가에 나옴
		 //연산자의 우선순위
		 /* 				
		 단항연산자 + - ~ () ++ -- 					높음
		 산술연산자 + * / % +(더하기) -(빼기) >> << >>>
		 비교연산자 < > >= <= !=
		 논리연산자 & | && ||
		 삼항연산자?:
		 대입연산자  = += -= *= %= >>= <<= >>>=
		*/ 
		 
		 int su =10;
		 String strResult = (su>>>3 >=2) && (1>0)?"참입니다.":"거짓입니다.";
		 System.out.println(strResult); //거짓입니다.
		 /*
		  		연산자 우선순위에 따라서 >>>을 가장 먼저한다
		  		00000000 00000000 00000000 00001010  <= 10
		  		00000000 00000000 00000000 0000001	 <= 1
		  		
		  		(1>=2) && (1>0)
		  		 false    true
		  		 
		  */
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
