package 반복문;

public class For문연습3 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			sum += i;
		}
		System.out.println(sum);
		
		int sum2 = 0;
		System.out.println("-----------------");
		for (int i = 3; i <= 11; i++) {
			System.out.println(i);
			sum2 += i;
		}
		System.out.println(sum2);
	}

}
