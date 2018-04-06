package standardActionStudy.test;

import java.util.Date;

public class PersonDTO {
	
	private String name; // 성명 기본값은 null
	private String jubun;
	private char gender; // 성별 기본값은 ' '
	private int age;	 // 나이 기본값은 0
	
	public PersonDTO(){}
	
	{name="이순신"; gender='m'; age=25;}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String getJubun() {
		return jubun;
	}

	public void setJubun(String jubun) {
		this.jubun = jubun;
	}

	
	public String getGenderStr() {
		
		String genderstr ="";
		switch (gender) {
		case 'M':
		case 'm':
			genderstr="남자";
			
			break;
			
		case 'F':
		case 'f':
			genderstr="여자";
			
			break;

		}
		
		return genderstr;
	}
	
	public String strgender() {
		
		String genderstr ="";
		switch (gender) {
		case 'M':
		case 'm':
			genderstr="남자";
			
			break;
			
		case 'F':
		case 'f':
			genderstr="여자";
			
			break;

		}
		
		return genderstr;
	}
	public String getJgender() {
		String gender = jubun.substring(6, 7);
		
		switch (gender) {
		case "1":
		case "3":
			gender= "남";
			break;
		case "2":
		case "4":
			gender= "여";
			break;
		}
		
		return gender;
	}
	

	public int getJage() {
		Date now=new Date();
		String age =jubun.substring(6, 7 );
		int jage=0;
		if("1".equals(age) || "2".equals(age)) {
			jage =Integer.parseInt(String.format("%tY",now)) - ( 1900 + Integer.parseInt(jubun.substring( 0, 2 )))+1;	
		}else if("3".equals(age) || "4".equals(age)) {
			jage =Integer.parseInt(String.format("%tY",now)) - ( 2000 + Integer.parseInt(jubun.substring( 0, 2 )))+1;
		}
		
		
		return jage;
	}
}
