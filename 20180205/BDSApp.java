/*
 ==== *** 객체지향 프로그래밍(Object Oriented Programming)이란? *** ====
      
      ※  OOP 의 4가지 특징
     --> 1. 상속성
     --> 2. 추상화
     --> 3. 캡슐화
     --> 4. 다형성
     
      부동산 관리 어플리케이션 프로그래밍 제작시 필요한 요소(부품)를 생각해보자.
      아주 다양하고, 많은 요소들이 필요할 것이다.
      
      예를 들어,
      집, 매도자, 매수자, 중개인 ..... 등등 많이 있다.
      이러한 요소(부품)들이 바로 객체(object)인데  이 객체를 만드는 설계도면이 클래스이다.
   
      위와(부동산 관리 어플리케이션 프로그래밍 제작) 같이 현실세계에 존재하는
      다양한 객체들을 각각 하나하나 추상화 시켜서 클래스로 옮기는 것을 
      객체지향 프로그래밍(Object Oriented Programming)이라고 한다.
   
      여기서 추상화란?
    ==> 일반적인 의미의 추상화(Abstraction)란?
         -- 어떤 물체(Object)에서 주된 특징을 부각시켜 표현하고,
                      나머지 부분은 과감하게 생략하는 것을 말한다.
               추상화의 반대는 아주 시시콜콜한것(세세한것)까지 전부 몽땅 다 묘사하는것을
               말하는데 이것은 정밀화 라고 말한다.
               그래서, 추상화라는 것은 객체의 아주 세세한 모든것들을 속성(property)으로
               지정하는 것이 아니라, 프로그래밍에서 필요한 부분만 속성(property)으로
               뽑아내는 것을 추상화라고 한다. 
               
       ※ 객체지향 프로그래밍(Object Oriented Programming)에서 
         사용되는 추상화도 이와 비슷하다. 
         어떤 하나의 물체를 대표하는 속성(명사, 멤버변수)과 기능(동사, 메소드)을 
         추출해는것을 OOP 프로그래밍에서는 추상화라고 한다.
     
      예:> DB에서 테이블명        ==> 컬럼, 컬럼, 컬럼... (행)
             employees  ==> 사원번호, 사원명, 주민번호, 입사일, 급여...  (사원)
             
        OOP 에서는  클래스명 ==> 멤버변수(명사, 컬럼명에 해당), 메소드(동사, 함수에 해당) 
        
              실제 DB에서 조회(select)해온 직원의 정보를 프로그래밍에서 다루고자 한다면
              직원의 정보를 담을 변수가 필요하다. 
              이러한 직원의 정보를 담을 부품(객체변수)이 필요한데 이것이 바로 객체(Object)이다.
              직원정보를 담을 부품 ==> 객체(Object) 
              
   >> 예를 들어, 부동산 관리 어플리케이션 제작시 필요한 부품(요소)중 하나인 "집"에 
           대해서 알아보자. 
      "집"이 가지고 있는 속성(명사, 멤버변수)과 행동양식(기능, 동사, 메소드)을 뽑아보자.
      
      1). 속성(property, attribute)은 멤버변수가 되고,
      2). 행동양식(기능)은 메소드가 되는 것이다.
      
      ex). "집"을 프로그래밍으로 추상화 해보면....
      
      House(클래스)
        |
        |-- 속성(property, attribute) : 면적, 방갯수, 화장실갯수, 가격, 집주인성명, 집주인연락처, ...... 
        |-- 행동양식(행위, 기능, 메소드) : 사다, 팔다, 매매하다, 전세를 놓다, 월세를 놓다,.....
        
   >>> 정리하면 <<<
   1. 클래스(class) : 부품(요소, 객체)인 객체를 만들어 내는 틀(설계도면)이다.
                     ex) 집설계도, 회원설계도
                     
   2. 객체(object) : 클래스(class)를 통해 만들어진 구현물(구현체)
                     ex) 우리집 (32평 , 방3개, 화장실갯수 1개, 3억, 나평민)
                                               너네집 (50평, 방4개, 화장실갯수 2개, 25억, 너부자)                         

*/

package my.day9;

import java.util.Scanner;

import my.util.MyUtil;

public class BDSApp {
	
	public static void menu() {
		System.out.println("----- >> 메뉴 << -----");
		System.out.println("1. 매매주택조회");
		System.out.println("2. 전세주택조회");
		System.out.println("3. 월세주택조회");
		System.out.println("4. 종료");
		System.out.println("-----------------------");
		System.out.print(">> 선택하세요 => ");
	}

	public static void main(String[] args) {

		House[] houseArr = new House[10];
		
		houseArr[0] = new House();
		houseArr[0].room = 3;
		houseArr[0].address = "서울시 종로구 인사동";
		
		Owner owner1 = new Owner();
		owner1.name = "나주인";
		owner1.address = "경기도 군포시";
		owner1.tel = "010-3456-7890";
		
		houseArr[0].owner = owner1;
		houseArr[0].direction = 'S';
		houseArr[0].price = 300;
		
		///////////////////////////////////////////
		Owner owner2 = new Owner("이규호", "경기도 남양주시", "010-777-8989");
		
		houseArr[1] = new House(5, "서울시 강남구 도곡동", owner2, 'E', 5000);
		
		/*   === 부동산 매물정보 ===
		     1. 집주소 : 서울시 종로구 인사동
		     2. 매매가 : 300백만원
		     3. 방갯수 : 3
		     4. 방향 : 남향
		     5. 집주인정보 : 나주인  010-3456-7890  경기도 군포시
		     
		     1. 집주소 : 서울시 강남구 도곡동
		     2. 매매가 : 5000백만원
		     3. 방갯수 : 5
		     4. 방향 : 동향
		     5. 집주인정보 : 이규호  010-777-8989  경기도 남양주시
		 */
		
		System.out.println("=== 부동산 매물정보 ===");
		
		for(int i=0; i<houseArr.length; i++) {
			
			if ( houseArr[i] != null ) {
				houseArr[i].showInfo();
			}
			
		}// end of for---------------------
		
     System.out.println("\n======= 퀴즈 =======\n");
     
    // House 배열 houseArr 데이터를 3개 더 넣습니다.
    Owner owner3 = new Owner("한석규", "서울시 강동구 천호동", "010-111-1111");
	houseArr[2] = new House(3, "서울시 강동구 천호동", owner3, 'S', 400);
	
	Owner owner4 = new Owner("두석규", "서울시 강서구 화곡동", "010-222-2222");
	houseArr[3] = new House(2, "서울시 강서구 화곡동", owner4, 'W', 350); 
	
	Owner owner5 = new Owner("세석규", "서울시 송파구 잠실동", "010-333-3333");
	houseArr[4] = new House(4, "경기도 안양시 동안구", owner5, 'S', 580);
	
/*	HouseTrade(주택거래) 클래스를 생성.

	  2개 매매
	  2개 전세
	  1개 월세
*/		
	
		HouseTrade[] houseTradeArr = new HouseTrade[10];
		
		houseTradeArr[0] = new HouseTrade(houseArr[0], 1); // 매매로 등록
		houseTradeArr[1] = new HouseTrade(houseArr[1], 1); // 매매로 등록
		houseTradeArr[2] = new HouseTrade(houseArr[2], 2); // 전세로 등록
		houseTradeArr[3] = new HouseTrade(houseArr[3], 2); // 전세로 등록
		houseTradeArr[4] = new HouseTrade(houseArr[4], 3); // 월세로 등록
		
		/*
		   	 ----- >> 메뉴 << -----
			  1. 매매주택조회
			  2. 전세주택조회
			  3. 월세주택조회
			  4. 종료
			 -----------------------
			 >> 선택하세요 => 1  
		 */
		
		Scanner sc = new Scanner(System.in);
		String menuNo = "";
		
		do {
			BDSApp.menu();
			menuNo = sc.nextLine();
			
			switch (menuNo) {
				case "1":   // 매매로 등록된 부동산만 조회
					System.out.println("\n");
					for(HouseTrade trade : houseTradeArr) {
						if(trade != null && trade.tradeType == 1)
							trade.shortShowInfo();
					}// end of for--------------------------
					break;
	
				case "2":   // 전세로 등록된 부동산만 조회
					System.out.println("\n");
					for(HouseTrade trade : houseTradeArr) {
						if(trade != null && trade.tradeType == 2)
							trade.shortShowInfo();
					}// end of for--------------------------
					break;		
				
				case "3":   // 월세로 등록된 부동산만 조회
					System.out.println("\n");
					for(HouseTrade trade : houseTradeArr) {
						if(trade != null && trade.tradeType == 3)
							trade.shortShowInfo();
					}// end of for--------------------------
					break;
				
				case "4":   // 종료
					System.out.println("\n>>> 프로그램을 종료합니다.!!");
					break;	
					
				default:    // 존재하지 않는 메뉴번호
					System.out.println("\n>>> 메뉴에 없는 번호입니다. 다시 선택하세요!!"); 
					break;
			}// end of switch---------------------
			
			if("1".equals(menuNo) || "2".equals(menuNo) || "3".equals(menuNo)) {
				System.out.print("\n>> 조회하고자하는 매물번호를 선택하세요 => ");
				// >> 조회하고자하는 매물번호를 선택하세요 => houseno1
				
				String tradeSeq = sc.nextLine();
				for(HouseTrade trade : houseTradeArr) {
					if(trade != null && trade.tradeSeq.equals(tradeSeq) )
						trade.house.showInfo();
				}// end of for-----------------------
				
				System.out.print(">> 1.되돌아가기 / 2.종료하기 => ");
				String str = sc.nextLine();
				if("2".equals(str)) {
					System.out.println("\n>>> 프로그램을 종료합니다.!!");
					break;   // while 의 break 입니다.
				}
				System.out.println("\n");
			}// end of if------------------------------
			
		} while (!("4".equals(menuNo)));
		
        sc.close();
        System.out.println(">>> 프로그램 종료시각 : " + MyUtil.getNowTime()); 
		
	}// end of main()--------------------------------

}





