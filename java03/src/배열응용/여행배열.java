package 배열응용;

import java.util.Scanner;

public class 여행배열 {
	public static void main(String[] args) {
		String[] year1 = new String[3];
		String[] year2 = new String[3];

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < year2.length; i++) {
			System.out.println("작년 여행지 입력>> ");
			year1[i] = sc.next();
		}
		for (int i = 0; i < year2.length; i++) {
			System.out.println("올해 여행지 입력>> ");
			year2[i] = sc.next();
		}
		
		int count = 0;
		
		for (int i = 0; i < year2.length; i++) {
			if(year1[i].equals(year2[i])) {
				count++;
			}
		}
		System.out.println("전체 동일한 여행지수 >>" + count);
	}
}
