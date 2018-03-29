package my.day8.quiz;

import java.util.Scanner;

public class ArrayQuiz {
	public void menu() {
		String result = "---->> 메뉴 <<-----\n" +
						"1. 성찾기\n" +
						"2. 이름검색\n" +
						"3. 종료\n"+
						">> 메뉴번호를 입력 => ";
		System.out.print(result);
	}
	public void firstname(String[] name, char first) {
		int flag =0;
		for(int i = 0 ; i<name.length ;i++) {
			char a = name[i].charAt(0);
			
			if(a == first) {
				flag =1;
				System.out.println(name[i]);
			}//end of if() ------
		}//end of for()------
		
		if (flag == 0 ) {
			System.out.println(first+"성을 가진 사람이 없습니다.");
			
		}//end of if -------
	
	}//end of firstname(String[] name, char first) 
	
	
	public void strname(String[] name, String selectname) {
		int flag = 0;
		for(int i=0;i<name.length;i++) {
			for(int j=0; j<name[i].length() - (selectname.length()-1);j++ ) {
				String searchname = name[i].substring(j, j+selectname.length()); 
				if(selectname.equals(searchname)) {
					flag =1;
					System.out.println(name[i]);
					}//end of if
			}// end of 내부 for
		}//end of 외부 for
		if(flag==0) {
			System.out.println("검색한 이름이 없습니다.");
		}
		
	}//end of strname(String[] name, String selectname)
	
	public boolean go(char yn){
		boolean bool = false;
		
		if('y' == yn || 'Y' == yn) {
		 bool = true;
		}
		else if('N' == yn || 'n' == yn) {
		 bool = false;
		} else
			bool =true;
		
		return bool;
	}
	
	public static void main(String[] args) {
		String[] namesArr = {"이규호","김종성","윤찬영","조원영","임규하","김규호","이종성","임규성"};
		Scanner sc = new Scanner(System.in);
		ArrayQuiz obj = new ArrayQuiz();
		do {
			try {
				obj.menu();
				int menuno = Integer.parseInt(sc.nextLine());
				if(menuno == 1) {
					System.out.print(">> 검색하실 성 입력 => ");
					char first = sc.nextLine().charAt(0);
					obj.firstname(namesArr,first);
					System.out.print(">>계속 하실래요?(y/n) => ");
					char yn = sc.nextLine().charAt(0);
					if(obj.go(yn)) {
						continue;	
					} break;
				}else if (menuno == 2) {
					System.out.print(">> 검색하실 글자 입력 => ");
					String str = sc.nextLine();
					obj.strname(namesArr,str);
					System.out.print(">>계속 하실래요?(y/n) => ");
					char YN = sc.nextLine().charAt(0);
					if(obj.go(YN)) {
						continue;	
					} break;
				}else if (menuno == 3) {
					break;

				}else 
					System.out.println("1부터 3까지만 입력해 주세요");
					continue;
				
				
			} catch (NumberFormatException e) {
				System.out.println("숫자를 입력하세요");
			}
			
			
		} while(true);
		System.out.println(">> 프로그램 종료!! 안녕히 가세요~~");
	}

}

/*
 	MyUtil.seachword();을 사용하지 마세요

 	1. String namesArr을 생성합니다.
 	2. "이규호,김종성,윤찬영,조원영,임규하,김규호,이종성,임규성" 이것을 입력합니다.
 	
 	프로그램을 실행을 하면
 	
 	---->> 메뉴 <<-----
 	1. 성찾기
 	2. 이름검색
 	3. 종료
 	
 	>> 메뉴번호 입력 => 1
 	>> 검색하실 성 입력 => 김
 	김종성
 	김규호 
 	
 	>>계속 하실래요?(y/n) => y
 	
 	---->> 메뉴 <<-----
 	1. 성찾기
 	2. 이름검색
 	3. 종료
 	
 	>> 메뉴번호 입력 => 2
 	>> 검색하실 글자 입력 => 규호
 	이규호
 	김규호 
 	
 	>>계속 하실래요?(y/n) => y
 	
 	---->> 메뉴 <<-----
 	1. 성찾기
 	2. 이름검색
 	3. 종료
 	
 	>> 메뉴번호 입력 => 2
 	>> 검색하실 글자 입력 => 규
 	이규호
 	김규호
 	임규하
 	임규성
 	
 	>>계속 하실래요?(y/n) => y
 	
 	---->> 메뉴 <<-----
 	1. 성찾기
 	2. 이름검색
 	3. 종료
 	
 	>> 메뉴번호 입력 => 3
 	>> 프로그램 종료!! 안녕히 가세요~~
 	
 */
