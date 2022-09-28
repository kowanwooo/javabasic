package 조건문;

public class SwitchCase테스트 {

	public static void main(String[] args) {
		String name = "자바";
		switch (name) {
		case "자바":
			System.out.println("113111호로");
			break;
		case "파이썬":
			System.out.println("11322호로");
			break;
		case "리눅스":
			System.out.println("113333호로");
			break;
		default: 
			System.out.println("카운터로 가세요");
		}
	}

}
