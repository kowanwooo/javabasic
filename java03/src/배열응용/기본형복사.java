package 배열응용;

public class 기본형복사 {
	public static void main(String[] args) {
		int 수학1 = 100;
		int 수학2 = 수학1;
		System.out.println("수학 1: " + 수학1);
		System.out.println("수학 2: " + 수학2);
		수학2 = 90;
		System.out.println("수학 1: " + 수학1);
		System.out.println("수학 2: " + 수학2);

	}
}
