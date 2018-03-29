package my.day3;

public class Member {
	
	String id, passwd, name, addr;
	int age;
	
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	/*
	 @Override
	public String toString() {
	} 
	//묶어서 사용
	// 실제로 메모리의 주소값을 보여주지만 이것을 넣으면 그주소에 값을 넣게 된다.
	 */
	@Override
	public String toString() {
		String result = "id : " + id +
						"\npassword : " + passwd + 
						"\nname : " + name +
						"\nage : " + age +
						"\naddr : " + addr + "\n";
						
		
		return result;
	}
	
}
