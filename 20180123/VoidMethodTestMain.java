//동일한 경로에 있을 경우 import를 할 필요가 없다 다른 경로의 클래스 파일이 있으면 import시켜줘야된다.
public class VoidMethodTestMain
{

	public static void main(String[] args) 
	{
		Member member1 = new Member("kangkc", "qwer1234", "감강찬", 34, 178.9);
		Member member2 = new Member("suji", "asdf0070", "수지", 29, 188.2);
		
		member1.infoPrint();
		//메소드는 클래스명과 달라야 하며 첫글자는 소문자이다.

		System.out.println("");

		member2.infoPrint(); //행위에 대한 호출 member2에 있는 값을 Meber 클래스 안에 있는 infoPrint() 메소드 안에있는 내용을 실행

		
	}
}
