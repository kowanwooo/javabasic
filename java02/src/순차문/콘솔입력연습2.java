package 순차문;

import java.util.Scanner;

public class 콘솔입력연습2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력: ");
		int age = sc.nextInt();
		int age2 = age + 1;
		System.out.println("내년 나이는 " + age2 + "입니다.");
	}
}
