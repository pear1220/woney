public class Member
{
	String userid;
	String passwd;
	String name;
	int age;
	double height;
	
	public Member(){ }

	public Member(String userid, String passwd, String name, int age, double height){
		this.userid = userid;
		this.passwd = passwd;
		this.name = name;
		this.age = age;
		this.height = height;

	
	}

	// 메소드 정의
	public void infoPrint(){ //void 리턴타입이 없다.
		System.out.println("아이디: " + userid);
		System.out.println("암 호: " + passwd);
		System.out.println("성 명: " + name);
		System.out.println("나 이: " + age + "세");
		System.out.println("신장: " + height + "cm");
	}
}
