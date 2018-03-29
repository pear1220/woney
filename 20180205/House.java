package my.day9;

import my.util.MyUtil;

public class House {

	/*
	    1) 속성(property, attribute)
	    
	            속성(property, attribute)은 반드시 클래스명과 "has a" 관계가 성립되어야만 한다.
	            속성(property, attribute)은 멤버변수가 된다.
	 */
	
	int room;        // House has a room. int 의 기본값은 0
	String address;  // House has a address. String 의 기본값은 null 
	Owner owner;     // House has a owner. Owner 의 기본값은 null
	char direction;  // House has a direction. char 의 기본값은 ' '
	long price;      // House has a price. long 의 기본값은 0
	
	public House() { }
	
	public House(int room, String address, Owner owner, char direction, long price) {
		this.room = room;
		this.address = address;
		this.owner = owner;
		this.direction = direction;
		this.price = price;
	}
	
	/*
	  1. 집주소 : 서울시 종로구 인사동
      2. 매매가 : 300백만원
	  3. 방갯수 : 3
	  4. 방향 : 남향
	  5. 집주인정보 : 나주인  010-3456-7890  경기도 군포시 
	*/
	public void showInfo() {
		System.out.println("1. 집주소 : " + address);
		System.out.println("2. 매매가 : " + MyUtil.getCommaNumber(price)+"백만원"); 
		System.out.println("3. 방갯수 : " + room);
		
		String strDirection = "";
		
		switch (direction) {
			case 'E':
			case 'e':	
				strDirection = "동향";
				break;
	
			case 'W':
			case 'w':	
				strDirection = "서향";
				break;
				
			case 'S':
			case 's':	
				strDirection = "남향";
				break;
				
			case 'N':
			case 'n':	
				strDirection = "북향";
				break;	
				
			default:
				strDirection = "모름";
				break;
		}// end of switch (direction)------------------
		
		System.out.println("4. 방향 : " + strDirection);
		System.out.println("5. 집주인정보: " + owner.owerInfo() );
		System.out.println("\n");
	}// end of void showInfo()-----------------------
	
	
}





