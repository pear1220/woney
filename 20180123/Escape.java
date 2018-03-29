/*
	Escape 문자 ==> 제어문자
	-- 인쇄할 수 없거나 키보드로 표현할 수 없는 특별한 문자를 가리키며,
	   역슬래쉬(\)와 한개의 문자를 결합하여 작성한다.

	   \n ==> 개행. 스크린(화면) 커서의 위치를 다음 줄의 처음으로 옮긴다.
	   \t ==> 수평탭. 스크린(화면) 커서의 다음 탭으로 옮긴다.
	   \r ==> 캐리지 리턴. 스크린(화면) 커서의 위치를 현재 줄의 처음으로 옮긴다. 개행하지는 않는다. 이 기호 다음에 오는 문자를 덮어 씌운다.
	   \\ ==> 역슬래쉬를 출력할때 사용한다.
	   \" ==> 큰 따옴표 출력할때 사용한다.
	   \' ==> 작은 따옴표 촐력할때 사용한다.

*/






public class Escape
{
	public static void main(String[] args) 
	{
		System.out.print("--- Escape 문자 ---");

		System.out.println("\n국어\t영어\t수학"); //println은 문자열의 뒷부분의 줄바꿈을 해준다
		System.out.println("-------------------");
		System.out.println("99\t88\t77");

		System.out.println("");

		System.out.println("이번엔 캐리지 리턴을 써볼까요?\r두");		
		System.out.println("이번엔 캐리지 리턴을 써볼까요?\rA");

		System.out.print("어떻게 될까요?");
		System.out.print("안녕하세요?\r\n"); // System.out.print("안녕하세요?\r\n"); 이건 System.out.print("안녕하세요?\n"); 와 같다 = 엔터
		System.out.print("식사하셨습니까?");

		System.out.println("");
		/*
			김소월 님의 '진달래'
			"		나보기가 역겨워 가실 때에는 "
			C:\진달래.hwp
		*/

		System.out.print("김소월 님의 \'진달래\'\r\n");
		System.out.print("\"\t\t나보기가 역겨워 가실 때에는 \"\r\n");
		System.out.print("C:\\진달래.hwp\r\n");



	}
}
