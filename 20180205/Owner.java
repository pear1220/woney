package my.day9;

public class Owner {

	String name;
	String address;
	String tel;
	
	public Owner() { }
	
	public Owner(String name, String address, String tel) {
		this.name = name;
		this.address = address;
		this.tel = tel;
	}
	
	public String owerInfo() {
		return name+"  "+"("+tel+")  "+address;
	}
	
	
}
