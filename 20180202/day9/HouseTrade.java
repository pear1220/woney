package my.day9;

public class HouseTrade {

	String trade;
	int housetrade;

	public HouseTrade() { }
	public HouseTrade(int housetrade) {
		this.housetrade = housetrade;
	}

	public String houseTrade(House[] housearr,int number) {
		
		switch (number) {
		case 1:
			for(int i=0;i<housearr.length;i++) {
					if(housearr[i].housetrade == number) {
						trade = housearr[i].houseid + ". " + housearr[i].address + " " + housearr[i].price+"백만원";
					}				
			}//end of for-------------
			break;
		case 2:
			for(int i=0;i<housearr.length;i++) {
				if(housearr[i].housetrade == number) {
						trade = housearr[i].houseid + ". " + housearr[i].address + " " + housearr[i].price+"백만원";
					}
				}//end of for-------------
			break;
		case 3:
			for(int i=0;i<housearr.length;i++) {
				if(housearr[i].housetrade == number) {
						trade = housearr[i].houseid + ". " + housearr[i].address + " " + housearr[i].price+"백만원";
					}				
			}//end of for-------------
			break;
		}//end of switch------------------------------
		return trade;
		
	}//end of houseTrade(House[] housearr,int number) ----------------
}//end of Class HouseTrade/////
