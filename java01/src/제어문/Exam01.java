package 제어문;

public class Exam01 {
	public static void main(String[] args) {
		char id = 'p';
				
		char id2 = 'q';
		
		if (id == id2) {
			System.out.println("PASS!");
		} else {
			System.out.println("재입력!");
		}
		
		double ch = 2.2;
		
		if (ch >= 2 ) {
			System.out.println("다이어트");
		}

		if(id == id2 && ch >= 2) {
			System.out.println("오늘은 성공");
		}else {
			System.out.println("내일 다시 도전");
		}
	}
}
