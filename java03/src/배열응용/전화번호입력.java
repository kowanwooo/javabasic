package 배열응용;

import java.util.Scanner;

public class 전화번호입력 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("전화번호 입력 >>");
		String tel = sc.next();
		
		String tel1 = tel.substring(0, 3);
		if (tel1.equals("011")) {
			System.out.println("SK");
		} else if(tel1.equals("019")){
			System.out.println("LG");
		} else {
			System.out.println("Apple");
		}
		
		String tel2 = tel.substring(4, 7);
		System.out.println(tel2);
		if (tel2.length() >= 4) {
			System.out.println("최신폰");
		} else {
			System.out.println("올드폰");
		}
		
		if (tel.length() >= 10) {
			System.out.println("유효함");
		} else {
			System.out.println("유효하지 않음");
		}
	}
}
