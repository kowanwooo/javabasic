package 조건문;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		while (i<10) {

			System.out.print("입력(1)아이유, 입력(2)유재석, 입력(3)방탄>> ");
			int n1 = sc.nextInt();
			
			if (n1 == 1) {
				count1++;
				i++;
			} else if (n1 == 2) {
				count2++;
				i++;
			} else {
				count3++;
				i++;
			}
		}
		System.out.println("아이유 : " + count1);
		System.out.println("유재석 : " + count2);
		System.out.println("방탄 : " + count3);
	}

}
