package my.day9;

import my.day6.quiz.MyUtil;

public class House {

	/*
	 	1) 속성(property, attribute)
	 	
	 	속성(property, attribute)은 반드시 클래스명과 "has a" 관계가 성립되어야만 한다.
	 	속성(property, attribute)은 멤버변수가 된다.
	 
	 */
	String houseid;
	int room;		// House has a room. int의 기본값은 0
	String address; 	// House has a addr. String의 기본값은 null
	Owner owner;	// Class를 부품으로 사용하기 위함  //House has a owner. Owner의 기본값은 null
	char direction; // House has a direction. char의 기본값은 ' '
	long price;		// House has a price. long의 기본값은 0
	int housetrade;
	
	public House() {}
	
	
	public House(String houseid, int room, String addr, Owner owner, char direction, long price,int housetrade) {
		this.houseid = houseid;
		this.room = room;
		this.address = addr;
		this.owner = owner;
		this.direction = direction;
		this.price = price;
		this.housetrade = housetrade;
	}
	/*
		1. 집주소 : 서울시 종로구 인사동
	 	2. 매매가 : 300백만원
	 	3. 방갯수 : 3
	 	4. 방향 : 남향
	 	5. 집주인정보 : 나주인 010-3456-7890 경기도 군포시
	 */
	public void showInfo() {
		System.out.println("=======상세내용 조회=========");
		System.out.println("1. 집주소 : " + address);
		System.out.println("2. 매매가 : " + MyUtil.Comma(price));
		System.out.println("3. 방갯수 : " + room);
		
		
		String strdirection;
		
		switch (direction) {
		case 'E':
		case 'e':
			strdirection = "동향";
			break;
			
		case 'W':
		case 'w':
			strdirection = "서향";
			break;
			
		case 'S':
		case 's':
			strdirection = "남향";
			break;
			
		case 'N':
		case 'n':
			strdirection = "북향";
			break;
			
		default:
			strdirection = "모름";
			break;
		}
		
		System.out.println("4. 방향 : " + strdirection);
		System.out.println("5. 집주인정보 : " + owner.ownerInfo());
		//System.out.println("6. 주택정보 : " + ));
		System.out.println("\n\n");
		
	}//end of void showInfo() -----------------------------
	
	
	
	
	
	
}
