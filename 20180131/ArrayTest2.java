package my.day8;

import my.util.MyUtil;

public class ArrayTest2 {
	
	public static void analyzeString(String passwd) {
		int de = 0,so = 0,su = 0,mun = 0;
		char[] chrArr = passwd.toCharArray(); // String 타입의 글자를 하나씩 배열로 쪼개서 넣는다
		for(char ch : chrArr) {
			switch (charcheck(ch)) {
			case 1:
				su++;
				break;
			case 2:
				de++;
				break;
			case 3:
				so++;
				break;
			case 4:
				mun++;
				break;
			}
					/*
					if (Character.isDigit(ch)) {
						su++; 
					} else if(Character.isUpperCase(ch)) {
						de++;
					}else if(Character.isLowerCase(ch)) {
						so++;
					}else {
					 mun ++;
					} // end of if()-----------------
					*/
		}//end of for() -------------
		String result = "영문대문자 : " +de+"개\n"+
	 			"영문소문자 : " +so+"개\n" +
	 			"숫자 : "+su+"개\n" +
	 			"특수문자 : "+mun+ "개\n";
	 System.out.println(result);	
	}//end of void analyzeString

	public static int charcheck(char ch) {
		int result = 0;
		if (Character.isDigit(ch)) {
			result = 1; 
		} else if(Character.isUpperCase(ch)) {
			result = 2;
		}else if(Character.isLowerCase(ch)) {
			result = 3;
		}else {
			result = 4;
		}
		return result;
	}
	
	//찾고자하는 성씨 출력해주는 메소드 생성하기
	public void serchFirstName(String[] strArr, char firstname) {
		int flag = 0;
		for(int i=0; i<strArr.length; i++) {
			char ch =strArr[i].charAt(0);
			
			if(ch == firstname) {
				flag = 1;
				System.out.println(strArr[i]);
			}
			
		}//end of for() -----------------------
		
		if(flag == 0)
			System.out.println(firstname+"씨는 없습니다.");
		
	}//end of void serchFirstName(String[] strArr, char firstname) ----
	
	public void searchLastName(String[] strArr, char lastname) {
		int flag =0;
	
		for(int i=0; i<strArr.length; i++) {
			
			char ch = strArr[i].charAt(strArr[i].length()-1); // ***********마지막 배열에서 -1을 해서 그 배열을 사용
			
			if (ch == lastname) {
				flag = 1;
				System.out.println(strArr[i]);
			}//end of if()-----------------------
			
		}//end of for()---------------------------
		if(flag == 0) {
			System.out.println("마지막 글자가 "+lastname+" 사람은 없습니다.");
		}//end of if()----------------------------
		
	}//end of void searchLastName(String[] strArr, char lastname)
	
	
	//=== 이름중에 '김'자 들어있는 사람 출력하기
	public void searchName(String[] strArr, char name) {
		int flag = 0;
		for(int i=0; i<strArr.length; i++) {
			for(int j=0; j<strArr[i].length();j++) {
			
				char ch = strArr[i].charAt(j);
			
				if(ch == name) {
					flag = 1;
					System.out.println(strArr[i]);
				} break;
			
			}//end of 내부 for문
			
		}//end of 외부 for문
		if(flag==0)
			System.out.println(name+"라는 글자가 포함된 사람은 없습니다.");
	}//end of void searchName(String[] strArr, char name)
	// charAt() toCarArray() 의 차이는 배열이냐 변수이냐 차이
	
	
	
	
	
	public static void main(String[] args) {

		String[] myfriend = {"김수한","이유림","김수한무거북이와두루미","서묘음", "김동현", "문김정", "김유정","이혜림", "이림"};
		
		System.out.println(myfriend[2]);
		// 김수한무거북이와두루미
		
		System.out.println("\n");
		
		char[] chrArr = myfriend[2].toCharArray();
		
		System.out.println(chrArr[2]);// 한
		
		System.out.println("\n");
		
		for(char ch :chrArr) {
			System.out.println(ch);
		}
		/*
		 	김
			수
			한
			무
			거
			북
			이
			와
			두
			루
			미
		 */
		
		String passwd = "qwerA1234$";
		
		ArrayTest2.analyzeString(passwd);
		/*
		 	영문대문자 : 1개
		 	영문소문자 : 4개
		 	숫자 : 4개
		 	특수문자 : 1개
		 */
		
		System.out.println("\n==============================\n");
		
		String[] passwordArr = {"abCD123$!","superman","qwer1","123456789","asdf0070#","qwer1234"};
		/*
		 	암호는 7글자 이상으로 영문자,숫자,특수문자가 혼합되어져야 한다.
		 	배열 passwordArr에 저장되어 있는 것 중에서 암호로 사용가능한 것만 출력하세요.
		 */
		/*
		 	== 사용가능한 암호 ==
		 	abCD123$!
		 	asdf0070#
		 */
		System.out.println("== 사용가능한 암호 ==");
		for(String pw :passwordArr) { //확장for문
			if(MyUtil.passwdCheck(pw))
				System.out.println(pw);
		}//end of for()----------------------------
	
		System.out.println("\n==============================\n");
		System.out.println("==String 배열 myfriend 에 저장되어진 데이터 출력 ==");
		
		for(int i=0;i<myfriend.length;i++) {
			String comma = ( i ==myfriend.length-1)? "\n ": ", " ;
			System.out.print(myfriend[i]+comma);
		}
		
		System.out.println("\n==============================\n");
		
		char ch1 = "대한민국".charAt(0); // .charAt[0]할경우 대한민국에서 대라는 글자하나만 담겨진다. 
		System.out.println(ch1);
		
		for(int i=0;i<myfriend.length;i++) {
			String comma = ( i ==myfriend.length-1)? "\n": ", " ;
			System.out.print(myfriend[i].charAt(0)+comma);
		}
		
		System.out.println("\n==============================\n");
		//김씨만 출력하기
		for(int i=0;i<myfriend.length;i++) {
			if(myfriend[i].charAt(0) == '김')
			System.out.println(myfriend[i]);
		}
		
		System.out.println("\n==============================\n");
		ArrayTest2 obj = new ArrayTest2();
		//찾고자하는 성씨 출력하기
		obj.serchFirstName(myfriend, '최');
		
		System.out.println("\n==============================\n");
		// 찾고자하는 마지막 글자에 해당하는 이름 출력하기
		
		obj.searchLastName(myfriend,'림');
		//이유림
		//이혜림
		//이림
		
		System.out.println("\n==============================\n");
		obj.searchName(myfriend,'김');
		//=== 이름중에 '김'자 들어있는 사람 출력하기
		//김수민
		//김수한무거북이와두루미
		//김동현
		//문김정
		//김유정
		
	}//end of main()-------------------------------

}//end of class ArrayTest2 ////////////////
