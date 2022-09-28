package 순차문;

import java.util.Scanner;

public class 나에대한정보2 {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.print("나의 이름은? ");
		String name = sc1.next();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.print("나의 키는? ");
		double height = sc2.nextDouble();
		double nextHeight = height + 10;
		
		Scanner sc3 = new Scanner(System.in);
		System.out.print("나의 몸무게는? ");
		double weight = sc3.nextDouble();
		double nextweight = weight + 10;
		
		Scanner sc4 = new Scanner(System.in);
		System.out.print("나는 저녁을 먹었나요? ");
		boolean food = sc4.nextBoolean();
		
		Scanner sc5 = new Scanner(System.in);
		System.out.print("나의 좌우명은? ");
		String mission = sc5.nextLine();
	
		System.out.println("-------------");
		System.out.println("나의 이름은 " + name + "입니다.");
		System.out.println("내 내년 키는 " + nextHeight + "입니다.");
		System.out.println("내 내년 몸무게는 " + nextweight + "입니다.");
		System.out.println("나는 저녁을 " + food + "했습니다.");
		System.out.println("나의 좌우명은 " + mission + "입니다.");
		

	}
}
