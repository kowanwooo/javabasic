package 추상클래스인터페이스;

public class Computer사용 {
	 public static void main(String[] args) {
		AppleComputer apple = new AppleComputer();
		BananaComputer banana = new BananaComputer();
		
		apple.켜기();
		apple.끄기();
		apple.재시작();
		banana.켜기();
		banana.끄기();
		banana.재시작();
	}
}
