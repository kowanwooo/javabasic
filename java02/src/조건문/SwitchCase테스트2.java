package 조건문;

import java.util.Date;

public class SwitchCase테스트2 {

	public static void main(String[] args) {
		Date date = new Date();
		int month = date.getMonth() + 1;
		int day = date.getDay();
		
		switch (day) {
		case 0: case 6: 
			System.out.println("놀자");
			break;
		default:
			System.out.println("자바 공부하러 가자.");
			break;
		}
		
		switch (month) {
		case 0: case 6: 
			System.out.println("놀자");
			break;
		default:
			System.out.println("자바 공부하러 가자.");
			break;
		}
	}

}
