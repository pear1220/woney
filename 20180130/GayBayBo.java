package my.day7;

import java.util.Scanner;

import my.util.MyUtil;

public class GayBayBo {
	
	public static void menu() {
		System.out.println("=== *** 가위, 바위, 보 *** ===");
		System.out.println("1. 가위 	2. 바위	3. 보	9. 게임종료");
		System.out.println("===========================");
		System.out.print(">> 선택하세요(1,2,3,9) => ");
		
	}//end of void menu()--------------------
	public void gameResult(String userNo, int pcNo) {
		
		String userStr ="" , pcStr = "";
		
		if(userNo.equals("1"))
			userStr = "가위";
		else if(userNo.equals("2"))
			userStr = "바위";
		else if(userNo.equals("3"))
			userStr = "보";
		
		if(pcNo == 1 )
			pcStr = "가위";
		else if(pcNo == 2)
			pcStr = "바위";
		else if(pcNo == 3)
			pcStr = "보";
		String gameResult ="";
		if((userNo.equals("1") && pcNo == 3) ||
		   (userNo.equals("2") && pcNo == 1) || 
		   (userNo.equals("3") && pcNo == 2))
			gameResult= ">> 사용자가 이겼습니다.";
		else if((userNo.equals("1") && pcNo == 2) ||
				(userNo.equals("2") && pcNo == 3) || 
				(userNo.equals("3") && pcNo == 1) )
			gameResult= ">> 컴퓨터가 이겼습니다.";
		else
			gameResult= ">> 비겼습니다.";
		
		System.out.println(">> 사용자: "+userStr+" , 컴퓨터: "+pcStr);
		System.out.println(gameResult+"\n");
		
	}//end of void gameResult(String userNo, int pcNo)------------------
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		GayBayBo obj = new GayBayBo();
		
		do {
			
			GayBayBo.menu();
			String userNo = sc.nextLine();
			int pcNo = MyUtil.Random(1, 3);
			
			switch (userNo) {
			case "1":
			case "2":
			case "3":
				obj.gameResult(userNo, pcNo);
				break;
			case "9":
				System.out.println(">> 게임을 종료하겠습니다.");
				break;
			default:
				System.out.println(">> 메뉴에 없는 번호입니다. \n (1,2,3,9)안에서 선택하세요~\n");
				break;
			}
			if("9".equals(userNo))
				break;
			
							
		} while(true); //end of main()--------------
		System.out.println(">> 종료시각: " + MyUtil.getNowTime());
		sc.close();
	}//end of main()------------------------

}//end of class GayBayBO /////////////////////
