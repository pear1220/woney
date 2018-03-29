package my.day8;

import my.util.MyUtil;

public class ArrayTest2 {

	public void analyzeString(String str) {
		
		char[] chArr = str.toCharArray();
		
		int cntUpper = 0; // 대문자 갯수 누적용
		int cntLower = 0; // 소문자 갯수 누적용
		int cntNumber = 0; // 숫자 갯수 누적용
		int cntSpecial = 0; // 특수문자 갯수 누적용
		
		for(char ch : chArr) {
			
			switch (charCheck(ch)) {
				case 1: // 대문자
					cntUpper++;
					break;

				case 2: // 소문자
					cntLower++;
					break;
				
				case 3: // 숫자
					cntNumber++;
					break;	
			
				case 4: // 특수문자
					cntSpecial++;
					break;	
				
				default:
					break;
			} 
			
		}// end of for--------------------
		
		System.out.println("영문대문자 : "+cntUpper+"개");
		System.out.println("영문소문자 : "+cntLower+"개");
		System.out.println("숫자 : "+cntNumber+"개");
		System.out.println("특수문자 : "+cntSpecial+"개");
		
	}// end of analyzeString(String str)-----------
	
	
	public int charCheck(char ch) {
		
		int result = 0;
		
		if('A'<= ch && ch <='Z') {
			result = 1; // 대문자이면 1 을 리턴
		}
		
		else if('a'<= ch && ch <='z') {
			result = 2; // 소문자이면 2 를 리턴
		}
		
		else if('0'<= ch && ch <='9') {
			result = 3; // 숫자이면 3 을 리턴
		}
		
		else 
			result = 4; // 특수문자이면 4 를 리턴
		
		return result;
	}// end of charCheck(char ch)------------------
	
	
	// 찾고자하는 성씨 출력해주는 메소드 생성하기
	public void	searchFirstName(String[] strArr, char firstname) {
		
		int flag = 0;
		
		for(int i=0; i<strArr.length; i++) {
			char ch = strArr[i].charAt(0);
			
			if(ch == firstname) {
				flag = 1;
				System.out.println(strArr[i]);
			}
		}// end of for----------------------
		
		if (flag == 0) 
			System.out.println(firstname + " 씨는 없습니다.");
		
	} // end of searchFirstName(String[] strArr, char firstname)-------
	
	// 찾고자하는 마지막 글자에 해당하는 이름 출력하기 
	public void searchLastName(String[] strArr, char lastname) {
		int flag = 0;
		
		for(int i=0; i<strArr.length; i++) {
			char ch = strArr[i].charAt(strArr[i].length()-1);
			if (ch == lastname) {
				flag = 1;
				System.out.println(strArr[i]);
			}
		}// end of for------------------------
		
		if (flag == 0) 
			System.out.println("이름에 마지막 글자 \'"+lastname +"\'을 가지는 사람은 없습니다.");
		
	} // end of searchLastName(String[] strArr, char firstname)------------ 
	
	
	public void searchName(String[] strArr, char ch) {
		
		int flag = 0;
		
		for(int i=0; i<strArr.length; i++) {
			char[] chrArr = strArr[i].toCharArray();
			
			for(int j=0; j<chrArr.length; j++) {
				if(chrArr[j] == ch) {
					flag = 1;
					System.out.println(strArr[i]);
					break;
				}
			}// end of 내부 for-----------------
		}// end of 바깥 for---------------------
		
		if(flag==0)
			System.out.println("찾고자하는 이름중에 \'"+ch+"\' 을 가지는 사람은 없습니다.");
		
	}// end of searchName(String[] strArr, char name)-----------
	
	
	public static void main(String[] args) {
		
		String[] myfriend = {"김수민","이유림","김수한무거북이와두루미","서묘음","김동현","문김정","김유정","이혜림","이림"}; 
        
		System.out.println(myfriend[2]);
		// 김수한무거북이와두루미
		
		System.out.println("\n");
		
		char[] chrArr = myfriend[2].toCharArray();
		
		System.out.println(chrArr[2]); // 한
		
		System.out.println("\n");
		
		for(char ch : chrArr) {
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
		System.out.println("\n");
		
		String passwd = "q8w#erA1234$";
		
		ArrayTest2 obj = new ArrayTest2();
		obj.analyzeString(passwd); 
		/*
		    영문대문자 : 1개
		    영문소문자 : 4개
		    숫자 : 4개
		    특수문자 : 1개 
		*/
		
		System.out.println("\n=================\n");
		
		String[] passwordArr = {"abCD123$!","superman","qwer1","123456789","asdf0070#","qwer1234"};  
		/*
		   암호는 7글자 이상으로서 영문자,숫자,특수문자가 혼합되어져야 한다.
		   배열 passwordArr 에 저장되어 있는 것 중에서 암호로 사용가능한 것만 
		   출력하세요.   		
		*/
		/*
		   == 사용가능한 암호 ==
		    abCD123$! 
		    asdf0070#
		*/
		System.out.println("== 사용가능한 암호 ==");
		
		for(String pw : passwordArr) {
			if(MyUtil.passwdCheck(pw)) {
				System.out.println(pw);
			}
		}// end of for-----------------------------
		/*
		  == 사용가능한 암호 ==
			abCD123$!
			asdf0070# 
		*/
		
		System.out.println("\n======================\n");
		System.out.println("== String 배열 myfriend 에 저장되어진 데이터 출력 ==");
		
		for(int i=0; i<myfriend.length; i++) {
			String comma = (i < myfriend.length-1)?", ":"";
			System.out.print(myfriend[i]+comma);
		}
		
		System.out.println("\n");
		
		char ch1 = "대한민국".charAt(2);
		System.out.println(ch1); // 민
		
		for(int i=0; i<myfriend.length; i++) {
			String comma = (i < myfriend.length-1)?", ":"";
			System.out.print(myfriend[i].charAt(0) +comma);
		}
		
		System.out.println("\n==============\n");
		
		// 김씨만 출력하기
		for(int i=0; i<myfriend.length; i++) {
			if( myfriend[i].charAt(0) == '김')
				System.out.println(myfriend[i]);
		}
		
		System.out.println("\n==============\n");
		
		// 찾고자하는 성씨 출력하기
		obj.searchFirstName(myfriend, '이');
		
		System.out.println("");
		
		obj.searchFirstName(myfriend, '최');
		
		System.out.println("\n");
		
		// === 찾고자하는 마지막 글자에 해당하는 이름 출력하기
		obj.searchLastName(myfriend, '림');
		// 이유림
		// 이혜림
		// 이림 
		
		System.out.println("\n");
		
		obj.searchLastName(myfriend, '학');
		
		System.out.println("\n");
		
		// === 이름중에 '김'자 들어있는 사람 출력하기
		// 김수민
		// 김수한무거북이와두루미
		// 김동현
		// 문김정
		// 김유정
		obj.searchName(myfriend, '김');
		
		System.out.println("\n");
		
		obj.searchName(myfriend, '강');
		
	}// end of main()------------------------

}// end of class ArrayTest2 /////////////////
