//동일한 경로에 있을 경우 import를 할 필요가 없다 다른 경로의 클래스 파일이 있으면 import시켜줘야된다.
public class VoidMethodTestMain
{

	public static void main(String[] args) 
	{
		Member member1 = new Member("kangkc", "qwer1234", "강감찬", 34, 178.9, 250);
		Member member2 = new Member("suji", "asdf0070", "수지", 29, 188.2, 240);
		
		
		member1.infoPrint();
		//메소드는 클래스명과 달라야 하며 첫글자는 소문자이다.

		System.out.println("");

		member2.infoPrint(); //행위에 대한 호출 member2에 있는 값을 Meber 클래스 안에 있는 infoPrint() 메소드 안에있는 내용을 실행

		System.out.println("\r\n======리턴 값이 있는 메소드(정보값 변경 전)======\r\n");
		
		String  name = member1.getName();
		String passwd = member1.getPasswd();
		int age = member1.getAge();
		double height = member1.getHeight();
		int HopeYearsal = member1.getHopeYearsal();
		
		
		
		System.out.println(name + "님의 암호는 " + passwd + " 이고 \n나이는 " + age + "세이고 \n신장은 " + height + "cm 이고 \n희망연봉은 " + HopeYearsal +"만원 입니다.");

		// 강감찬님의 암호는 qwer1234이고 나이는 34세이고 신장은 178.9cm 입니다.

		System.out.println("\r\n======정보값 변경 후======\r\n");
		
		member1.changeMyinfo("abcd", 25, 167.5, 300);

		name = member1.getName();
		passwd = member1.getPasswd();
		age = member1.getAge();
		height = member1.getHeight();
		HopeYearsal = member1.getHopeYearsal();

		System.out.println(name + "님의 암호는 " + passwd + " 이고 \n나이는 " + age + "세이고 \n신장은 " + height + "cm 이고 \n희망연봉은 " + HopeYearsal +"만원 입니다.");
		// 강감찬님의 암호는 abcd이고 나이는 25세이고 신장은 167.5cm 입니다.
	
		System.out.println("\n===========희망 월급 변경을 문자열로 리턴===========\n");
		String result = member1.setHopeMothsal(400);

		System.out.println(result);
		
		System.out.println("\n===========퀴즈=========\n");

		member1.showInfomation();
		/*
			=== 강감찬님의 정보 ===
			1. 아이디 : kangkc
			2. 암호 : abcd 
			3. 성명 : 강감찬
			4. 나이 : 25세
			5. 신장 : 167.5cm
			6. 희망 월급여 : 400만원
		*/
		
		
		System.out.println("\n========인스턴스 메소드 사용=========\n");

		Member member3 = new Member("leess", "1234", "이순신", 49, 180.2, 5000000);


		//String strYearsal = member3.getStrYearSal();

		System.out.println(member3.getName() + "님의 희망연봉은 " + member3.getStrYearSal() + "원 입니다.\n");


		System.out.println("\n========클래스 메소드 사용=========\n");
		
		System.out.println("종료시각: " + MyUtil.getNowTime() );
		
	}
}
