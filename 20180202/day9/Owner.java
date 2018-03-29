package my.day9;

public class Owner {
	
	String name;
	String address;
	String tel;

	public Owner() {}
	
	public Owner(String name, String address, String tel) {
		//super(); //상속
		this.name = name;
		this.address = address;
		this.tel = tel;
	} //Source => Generate Constructor using field => 3개의 변수 선택 후 확인

	public String ownerInfo() {
		return name+" "+"("+tel+")"+" "+address;
	}



	
	
}
