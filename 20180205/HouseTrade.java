package my.day9;

import my.util.MyUtil;

public class HouseTrade {

	String tradeSeq = ""; // 매물일련번호
	static int no;
	House house;
	int tradeType;       // 1->매매  ,  2->전세 ,  3->월세
	String registerDate; // 등록날짜
	
	public HouseTrade() { }
	
	public HouseTrade(House house, int tradeType) {
		tradeSeq += "houseno" + ++no;
		this.house = house;
		this.tradeType = tradeType;
		registerDate = MyUtil.getNowTime();
	}
	
	public void shortShowInfo() {
		System.out.println(tradeSeq + "  " + registerDate + "  " + house.address + "  " + MyUtil.getCommaNumber(house.price)+"백만원"); 
		// houseno1  서울시 종로구 인사동  300백만원
	}
	
	
}
