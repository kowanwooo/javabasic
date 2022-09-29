package 배열응용;

import java.util.Scanner;

public class exam02 {
	public static void main(String[] args) {
		int[] num = { 10, 20, 30, 40, 50 };
		int sum = num[0] + num[2];
		System.out.println(sum);

		Scanner sc = new Scanner(System.in);
		String[] lala = new String[3];

		for (int i = 0; i < lala.length; i++) {
			System.out.println("문자입력>> ");
			lala[i] = sc.next();
		}
		System.out.println(lala[0] + " " + lala[1] + " " + lala[2]);
	}
}
